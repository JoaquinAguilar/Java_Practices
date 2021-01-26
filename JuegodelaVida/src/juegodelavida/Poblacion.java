/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodelavida;

import acm.graphics.GCompound;
import java.awt.Color;
import java.awt.List;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Juan
 */
public class Poblacion extends GCompound{
    private List<Figura> misFiguras;
    private int casillasX = 75;
    private int casillasY = 46;
    private Color[] colores={Color.red, Color.blue, Color.orange, Color.MAGENTA};
    
    
    public Poblacion() {
        Random r = new Random();
        misFiguras = new ArrayList<>();
        for(int x = 0; x < casillasX; x++) {
            for(int y = 0; y < casillasY; y++) {
                Color colorAleatorio = colores[r.nextInt(colores.length)];
                Estrella e = new Estrella();
                e.setXY(x, y);
                e.colorea(colorAleatorio);
                e.ocultar();
                this.agregar(e, x, y);
            }
        }
    }
    
    public List<Figura> seleccionarColor(Color c) {
        List<Figura> listacolor = misFiguras
    }

    
    public int getCasillasX() {
        return this.casillasX;
    }
    
    public int getCasillasY() {
        return this.casillasY;
    }
    
    public void agregar(Figura f, int posX, int posY) {
        if( (posX >= 0) && (posX < casillasX)) {
            if( (posY >= 0) && (posY < casillasY)) {
                misFiguras[posX][posY] = f;
                this.add(f);
            }
        }
        
    }
    
    public Figura getFiguraXY(int posX, int posY) {
        Figura f = null;
        if( (posX >= 0) && (posX < casillasX)) {
            if( (posY >= 0) && (posY < casillasY)) {
                f = misFiguras[posX][posY];
            }
        }
        return f;
    }
    
    public void jugar() {
        for(int i = 0; i < 20; i++){
            int x = (int)(Math.random()*casillasX);
            int y = (int)(Math.random()*casillasY);
            this.getFiguraXY(x, y).ocultar();
        }
    }
    
}
