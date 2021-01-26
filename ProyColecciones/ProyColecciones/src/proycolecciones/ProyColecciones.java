/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proycolecciones;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author prueba
 */
public class ProyColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        List<Escuela> escuelas = new ArrayList<>();
       // Map<String, Escuela> mapaEscuela = new HashMap<>();
       // Set<Escuela> conjuntoEscuelas = new HashSet<>();
        //donde agrupar localidades
        Set<String> todasLocalidades = new HashSet<>();
        //ruta del archivo
        String archivo = ("C:\\Users\\Propietario\\Documents\\Cosas de la escuela\\MCA\\Programacion de Software Avanzada\\Testdata.csv");
        BufferedReader br = new BufferedReader(new FileReader(archivo));

        //leemos la segunda linea
        String linea = br.readLine();
        linea = br.readLine();

        //recorre todas las lineas hasta encontrar un valor nulo
        while ((linea = br.readLine()) != null) {
            //creo un array valores y le asigno la linea leída
            String[] valores = linea.split(",");
            //System.out.println(Arrays.toString(valores));
            //asigno por posicion a cada variable
            String localidad = valores[0];
            String clave = valores[1];
            String turno = valores[2];
            String nombre = valores[3];
            int docentes_mujeres = Integer.parseInt(valores[9]);
            int docentes_hombres = Integer.parseInt(valores[10]);
            int alumnos_mujeres = Integer.parseInt(valores[11]);
            int alumnos_hombres = Integer.parseInt(valores[12]);
            //Escuela
            Escuela nuevaEscuela = new Escuela(nombre, localidad, clave, turno, docentes_mujeres, docentes_hombres, alumnos_mujeres, alumnos_hombres);
            escuelas.add(nuevaEscuela);
            todasLocalidades.add(nuevaEscuela.getLocalidad());
            // System.out.println(nuevaEscuela);

        }//fin de while linea
        
        System.out.println("-------Consulta de localidades------");
        //cantidad
        System.out.println("Total de Localidades: "+todasLocalidades.size());
        //lista de localidades
        System.out.println(todasLocalidades+"\n");

        for (String localidades : todasLocalidades) {
            int num_DM = 0;
            int num_DH = 0;
            int num_AM = 0;
            int num_AH = 0;
            System.out.println(localidades);
            for (Escuela esc : escuelas) {
                if (localidades.equals(esc.getLocalidad())) {
                    num_DM += esc.getDocentes_mujeres();
                    num_DH += esc.getDocentes_hombres();
                    num_AM += esc.getAlumnos_mujeres();
                    num_AH += esc.getAlumnos_hombres();    
                }
            }
            System.out.println("Docentes Mujeres: " + num_DM);
            System.out.println("Docentes Hombres: " + num_DH);
            System.out.println("Alumnos Mujeres: " + num_AM);
            System.out.println("Alumnos Hombres: " + num_AH);
            
            System.out.println("\n");

        }
    }
}
