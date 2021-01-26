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
public class LienzoConMarco extends Lienzo {
    
    public LienzoConMarco() {
        super();
        dibujaMarco();
    }
    
    public LienzoConMarco(int ancho, int alto) {
        super(ancho, alto);
        dibujaMarco();
    }
    
    public void dibujaMarco() {
        int ancho = this.getAncho();
        int alto = this.getAlto();
        // Horizontales
        this.dibujaLinea(0, 0, ancho-1, 0, '-');
        this.dibujaLinea(0, alto-1, ancho-1, alto-1, '-');
        
        // Verticales 
        this.dibujaLinea(0, 0, 0, alto-1, '|');
        this.dibujaLinea(ancho-1, 0, ancho-1, alto-1, '|');
    }
    
}
