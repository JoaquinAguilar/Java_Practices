package recfib;

import java.util.Scanner;

public class RecFib {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingrese el valor de Fibonacci a calcular: ");
    int n=entrada.nextInt();
    
    double r=1/Math.sqrt(5);
    double l=Math.pow(phi(), n);
    double k=(-1/Math.pow(phi(),n));
    double f=r*(l-k);
    System.out.println();
    System.out.println("El numero de Fibonacci para "+n+" es: "+f);
    }
    
    public static double phi(){
    double r = (1+(Math.sqrt(5)))/2;
    return r;
    }
    
   
}
