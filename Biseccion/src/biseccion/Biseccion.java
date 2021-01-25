package biseccion;

import java.util.Scanner;

public class Biseccion {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor n: ");
        int n=entrada.nextInt();
        double x1=0;
        double x2=n;
        double fx1=n-(Math.pow(x1,2));
        double tol=0;
        
        do{
        double m=(x1+x2)/2;
        double fx2=n-(Math.pow(m,2));
        double r=fx1*fx2;
        if(r<0){
        x2=m;
        }
        else{
        x1=m;
        }
        tol=Math.abs(x2-x1);//calculo del error
        if(tol<0.00001){
            System.out.println(m);
        } 
        }while(tol>0.00001);        
    }  
}
