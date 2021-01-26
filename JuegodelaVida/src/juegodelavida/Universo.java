/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodelavida;

import acm.program.GraphicsProgram;

/**
 *
 * @author Juan
 */
public class Universo extends GraphicsProgram {
    
    public void run() {
        Poblacion p = new Poblacion();
        this.add(p);
        while(true) {
            p.jugar();
            this.pause(100);
        }
    }
}
