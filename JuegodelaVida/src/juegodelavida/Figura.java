/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodelavida;

import acm.graphics.GPoint;
import acm.graphics.GPolygon;
import java.awt.Color;

/**
 *
 * @author Juan
 */
public class Figura extends GPolygon{

    public void mostrar() {
        this.setVisible(true);
    }
    
    public void ocultar() {
        this.setVisible(false);
    }
    
    public boolean esVisible() {
        return this.isVisible();
    }
    
    public void setXY(int x, int y) {
        this.setLocation(new GPoint(x*10+5,y*10+5));
    }
    
    
    public void colorea(Color miColor) {
        //this.setFillColor(miColor);
        //this.setFilled(true);
        this.setColor(miColor);
    }
    
}
