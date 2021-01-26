/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lienzo2;

/**
 *
 * @author LANIA
 */
public class Lienzo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Lienzo ml = new Lienzo(50,50);
//        ml.dibujaLinea(0, 0, 30, 5, '+');
//        ml.dibujaLinea(25, 0, 25, 49, '|');
//        ml.paint();
//        
//        Lienzo ml2 = new Lienzo(200,200);
//        ml2.dibujaCirculo(100, 100, 15, '$');
//        ml2.paint();
//        
//        
//        LienzoConMarco lcm  = new LienzoConMarco();
//        lcm.paint();
//        
//        LienzoConMarco lcm2 = new LienzoConMarco(10,10);
//        lcm2.paint();
        
//        Terreno t = new Terreno();
//        System.out.println(t);
//        //t.paint();
//        
//        Calcomania ca = new Perro();
//        System.out.println(ca);

        TiroParabolico tp = new TiroParabolico(40, 30);
        for(double t = 0; t <= 3; t += .1) {
            tp.animar(t);
        }
        System.out.println(tp);
        
    }
    
}
