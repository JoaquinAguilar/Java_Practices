/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodelavida;

import acm.graphics.GMath;
import java.awt.Color;

/**
 *
 * @author Juan
 */
public class Estrella extends Figura {
    
    
    public Estrella() {
        double size = 10;
        double sinTheta = GMath.sinDegrees(18);
        double b = 0.5 * sinTheta / (1.0 + sinTheta);
        double edge = (0.5 - b) * size;
        addVertex(-size / 2, -b * size);
        int angle = 0;
        for (int i = 0; i < 5; i++) {
            addPolarEdge(edge, angle);
            addPolarEdge(edge, angle + 72);
            angle -= 72;
        }
    }
    
    
}
