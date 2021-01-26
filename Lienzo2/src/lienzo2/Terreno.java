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
public class Terreno extends LienzoConMarco {
    
    public Terreno() {
        super(100,100);
        this.paint_rio();
    }
    
    public void paint_rio(){
        for(int x=0;x<100;x++){
            int yi= (int)funcioni(x);
            setPen(x, yi, '*');
            int ys= (int)funcions(x);
            setPen(x, ys, '*');
            for(int n=yi+1;n<ys;n++){
                setPen(x, n, ' ');
            }
        }
    }
    
    private double funcioni(double x) {
        double r;
        r = 50+5*Math.cos(x/10)*Math.sin(x/15);
        
        return r;
    }
    private double funcions(double x) {
        double r;
        r = 70+8*Math.sin(x/35)*Math.cos(x/20);
        
        return r;
    }
    
}
