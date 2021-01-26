package recurrencia;

import java.util.Scanner;

public class Recurrencia {

    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor k: ");
        double k=entrada.nextInt();
        double R=0;
        double Rk=0;
         System.out.println();
         for(int n=0; n<=k; n++){
         R=Rk+(1/Math.pow(2,n));
             System.out.println(R);
    }
    
}
}