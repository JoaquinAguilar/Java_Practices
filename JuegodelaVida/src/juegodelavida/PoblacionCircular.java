/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodelavida;

/**
 *
 * @author Juan
 */
public class PoblacionCircular extends Poblacion{
    private double radianes;
    private boolean prendido;
    
    public PoblacionCircular() {
        super();
        radianes = 0;
        prendido = true;
        for(int x = 0; x < this.getCasillasX(); x++) {
            for(int y = 0; y < this.getCasillasY(); y++) {
                Figura e = this.getFiguraXY(x, y);
                e.ocultar();
                
            }
        }
    }
    
    public void jugar() {
        double maximoAngulo = 2 * Math.PI;
        double incremento = maximoAngulo / 15;
        if (radianes < maximoAngulo) {
            int xc = (int) (38 + 10 * Math.cos(radianes));
            int yc = (int) (23 + 10 * Math.sin(radianes));
            Figura e = this.getFiguraXY(xc, yc);
            if(prendido)
                e.mostrar();
            else
                e.ocultar();
            radianes = radianes + incremento;
        } else {
            if(prendido)
                prendido = false;
            else
                prendido = true;
            radianes = 0;
        }
        

    }
    
}
