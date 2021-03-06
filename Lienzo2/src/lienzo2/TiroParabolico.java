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
public class TiroParabolico extends Lienzo {
    private double angulo;
    private double velocidad;
    
    public TiroParabolico(double velocidad, double angulo) {
        super(100,100);
        this.velocidad = velocidad;
        this.angulo = angulo;
    }
    
    public void animar(double tiempo) {
        double x = this.velocidad * 
                Math.cos(Math.toRadians(angulo)) * tiempo;
        double y = this.velocidad * 
                Math.sin(Math.toRadians(angulo)) * tiempo -
                0.5*(9.81)*tiempo*tiempo;
        
        if( (x >= 0) && (x <= this.getAncho() - 1) &&
            (y >= 0) && (y <= this.getAlto() - 1) ) {
            this.setPen((int)x, (int)y , '*');
        
        }
        
    }
    
}
