package proyectoarchivos;

import java.io.File;
import java.text.SimpleDateFormat;

public class ProyectoArchivos {

    public static void main(String[] args) {
    /*File miArchivo = new File("C:\\Users\\Propietario\\Documents\\Datos\\Prueba.txt");
    if(miArchivo.exists()){
        System.out.println("Sí existe " + miArchivo.getName());
        System.out.println("Esta en el directorio "+ miArchivo.getParent());
        System.out.println("Tiene un tamaño de "+ miArchivo.length()+" bytes");
    }
    File miDirectorio = new File("C:\\Users\\Propietario\\Documents\\Datos");
    if(miDirectorio.exists() && miDirectorio.isDirectory()){
        System.out.println("Opción 1: "); 
       for(File contenido : miDirectorio.listFiles()){
           System.out.println("Archivo: "+ contenido.getName());
       }
        System.out.println();
        System.out.println("Opción 2: ");
       for(String arch:miDirectorio.list()){   //Convierte en string
           System.out.println("Archivo: " + arch);
           File fakeArch = new File(miDirectorio+"\\"+arch);
           System.out.println("fakeArch: "+fakeArch.getName());
       }
    }*/
          SimpleDateFormat sdf= new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        File miClase = new File("C:\\Users\\Propietario");
        if(miClase.exists()&&miClase.isDirectory()){
            System.out.println("El volumen de la unidad C es: ");
            System.out.println("El numero de serie de la unidad c es: "+"\n");
            System.out.println("Directorio de "+miClase.getPath()+"\n");
            
            for(File contenido:miClase.listFiles()){
                System.out.print(sdf.format(contenido.lastModified()));
                if(contenido.isDirectory()){
                    System.out.print(" <DIR>");
                }
                else{System.out.print("\t");}
                if(contenido.isFile()){
                    System.out.print(" ");
                    System.out.print(contenido.length());
                }
                System.out.print("      ");
               System.out.println(contenido.getName());
            }
            
        }
        }
        
}
