package colecciones;

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
import java.util.stream.Collectors;


public class Colecciones {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
//       List<String> ml = new ArrayList<>();
//       ml.add("VW");
//       ml.add("Toyota");
//       ml.add("VW");
//       ml.add("Ford");
       
        //System.out.println(ml.get(2));
//        System.out.println("Lista: ");
//        for(String datos: ml){
//            System.out.println(datos);
//        }
//        
//        Set<String> mc = new HashSet<>();
//        mc.add("VW");
//        mc.add("Toyota");
//        mc.add("VW");
//        if(!mc.add("VW")){
//            System.out.println("Está repetido");
//        }
//        mc.add("Ford");
//       
//        System.out.println("Conjunto: ");
//        for(String datos: mc){
//            System.out.println(datos);
//        }
//        if(mc.contains("VW")){
//            System.out.println("Sí tiene VW");}
//       
//        
//        String[]misDatos={"VERACRUZ,30DJN2549B,MATUTINO,FRANCISCO GABILONDO SOLER,4,0,26,39",
//        "VERACRUZ,30DJN2550R,MATUTINO,PEDRO SAINZ DE BARANDA Y BORREYRO,6,0,45,57",
//        "XALAPA-ENRÍQUEZ,30DJN2037B,MATUTINO,MANUEL M. PONCE,3,0,34,29",
//        "XALAPA-ENRÍQUEZ,30DJN1597E,VESPERTINO,COLIBRI,7,0,74,57",
//        "VERACRUZ,30DJN2452Q,MATUTINO,FERNANDO MONTES DE OCA,7,0,77,83",
//        //"VERACRUZ,30DJN2550V,MATUTINO,PEDRO SAINZ DE BARANDA Y BORREYRO",
//        /*"XALAPA-ENRÍQUEZ,30DJN2037B,MATUTINO,MANUEL M. PONCE"*/};
//        
//        List<Escuelas> escuelas = new ArrayList<>();
//        Map<String,Escuelas> mapaEscuela=new HashMap<>();
//        Set<Escuelas> conjuntoEscuelas=new HashSet<>();
//        
//        for(String registro : misDatos){
//        String[]valores=registro.split(","); //Quita los separadores
//        String localidad = valores[0];
//        String clave = valores[1];
//        String turno = valores[2];
//        String nombre = valores[3];
//        String docentesmujeres = valores[4];
//        String docenteshombres = valores[5];
//        String alumnosmujeres = valores[6];
//        String alumnoshombres = valores[7];
//        
//        Escuelas nuevaEscuela = new Escuelas(nombre,
//                                           localidad,
//                                           clave,
//                                           turno,
//                                           docentesmujeres,
//                                           docenteshombres,
//                                           alumnosmujeres,
//                                           alumnoshombres);
//
//        escuelas.add(nuevaEscuela);
//        if(conjuntoEscuelas.add(nuevaEscuela)){ //Si la escuela no esta repetida, se agrega al mapa
//            mapaEscuela.put(clave, nuevaEscuela);
//        }
//        }
//        
//        System.out.println("-----Lista de escuelas:");
//        for(Escuelas registroEscuela:escuelas){
//            System.out.println(registroEscuela);
//        }
//        
//        System.out.println("-----Conjunto de escuelas:");
//        for(Escuelas registroEscuela:conjuntoEscuelas){
//            System.out.println(registroEscuela);
//        }
        
        
        BufferedReader br = null;
        List<Escuelas> escuelas = new ArrayList<>();
        Set<String> localidades=new HashSet<>();
        
        br = new BufferedReader(new FileReader("C:\\Users\\Propietario\\Documents\\Cosas de la escuela\\MCA\\Programacion de Software Avanzada\\Testdata.csv"));
        String line = br.readLine();
        line=br.readLine();
        
        while ((line = br.readLine()) != null) {
            String [] fields = line.split(",");
            String localidad = fields[0];
            String clave = fields[1];
            String turno = fields[2];
            String nombre = fields[3];
            int docentesmujeres = Integer.parseInt(fields[9]);
            int docenteshombres = Integer.parseInt(fields[10]);
            int alumnosmujeres = Integer.parseInt(fields[11]);
            int alumnoshombres = Integer.parseInt(fields[12]);
        
            Escuelas nuevaEscuela = new Escuelas(nombre,localidad,clave,turno,docentesmujeres,docenteshombres,alumnosmujeres,alumnoshombres);
            escuelas.add(nuevaEscuela);
            localidades.add(nuevaEscuela.getLocalidad());
         
        }
        System.out.println();
        System.out.println("Total de Localidades: "+localidades.size());
        System.out.println(localidades+"\n");

        for (String tc:localidades) {
            int num_DM = 0;
            int num_DH = 0;
            int num_AM = 0;
            int num_AH = 0;
            System.out.println(tc);
            for (Escuelas esc : escuelas) {
                if (tc.equals(esc.getLocalidad())) {
                    num_DM += esc.getDocentesmujeres();
                    num_DH += esc.getDocenteshombres();
                    num_AM += esc.getAlumnosmujeres();
                    num_AH += esc.getAlumnoshombres();    
                }
            }
            
            System.out.println("Docentes Mujeres: " + num_DM);
            System.out.println("Docentes Hombres: " + num_DH);
            System.out.println("Alumnos Mujeres: " + num_AM);
            System.out.println("Alumnos Hombres: " + num_AH);
            
            System.out.println("\n");
        }
        
        List<Escuelas>escuela_coatepec=escuelas.stream()  //Escuelas en coatepec coon más de 5 docentes hombres
            .filter(x-> x.getLocalidad().equals("COATEPEC")&& x.getDocenteshombres()>5)
            .collect(Collectors.toList());   
        
        escuela_coatepec.forEach(System.out::println);
        
        
//        System.out.println();
//        System.out.println("Escuela obtenida por la clave: "+mapaEscuela.get("30DJN2037B"));
//        Map<String,String> m=new HashMap<>();
//        m.put("XYZ","Dodge");
//        m.put("Y1A","Aveo");
//        m.put("XBC","Toyota");
//        
//        System.out.println(m.get("XBC"));
    }
}
