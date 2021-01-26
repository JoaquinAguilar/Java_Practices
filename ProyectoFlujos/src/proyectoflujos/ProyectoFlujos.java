package proyectoflujos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProyectoFlujos {

    public static void main(String[] args) {
        FileReader fr = null;
        try {
            // Recurso es un archivo
            File f = new File("C:\\Users\\Propietario\\Documents\\Datos\\Gato.txt");
            fr = new FileReader(f);
            BufferedReader br= new BufferedReader(fr);
            String primeraLinea=br.readLine();
            String imagen = primeraLinea + "\n";
            System.out.println(primeraLinea);
            String resto="";
            while((resto=br.readLine())!=null){
                System.out.println(resto);
                imagen = imagen + resto +"\n";
        }
        br.close();
        
        File fout=new File("C:\\Users\\Propietario\\Documents\\Datos\\Gatocontitulo.txt");
        FileWriter fw = new FileWriter(fout);
        PrintWriter pw = new PrintWriter(fw);
        
        imagen = "\n  --- Mi gato --- \n\n"+imagen;
            System.out.println(imagen);
        pw.println(imagen);
        pw.close();
//            int c=0;
//            do{
//            c=fr.read();
//                System.out.println((char)c);
//            }
//            while(c != -1);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ProyectoFlujos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ProyectoFlujos.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(ProyectoFlujos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
