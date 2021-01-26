/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromowtf;

import java.util.Scanner;

/**
 *
 * @author Propietario
 */
public class PalindromoWtf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("Escribe un numero: ");
    Scanner entrada = new Scanner(System.in);
    int numero = entrada.nextInt();
    String a="";
    String b="";
    
    for(int i=1; i<=numero; i++){
        a=a+"*";
        b=b+"/";
       if(i<numero){
            System.out.print("*");
        }
       else {
            System.out.println("*");
       }
    }
        //System.out.println(a);
        //System.out.println(b);    
        System.out.println(a);
    }
}