package torrehanoi;

import java.util.Scanner;

public class TorreHanoi {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor x: ");
        double x=entrada.nextInt();
        double T=0;
        
        for(int n=1; n<=x; n++){
        T=(2*T)+1;
            System.out.println("T"+n+"="+T);
        }
    }
    
}
