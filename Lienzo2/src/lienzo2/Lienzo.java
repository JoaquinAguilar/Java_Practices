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
public class Lienzo {
    
    //    Atributos de la clase
    private int ancho;
    private int alto;
    private char [][] lienzo;
    
    
// Constructores
    
    public Lienzo() {
        ancho = 80;
        alto = 80;
        lienzo = new char[ancho][alto];
        for(int i = 0; i < ancho; i++) {
            for(int j = 0; j < alto; j++) {
                lienzo[i][j]=' ';
            }
        } 
    }
    
    public Lienzo(int ancho, int alto) {
        this.ancho = ancho;  // atributo this.ancho
        this.alto  = alto;
        lienzo = new char[ancho][alto];
        for(int i = 0; i < ancho; i++) {
            for(int j = 0; j < alto; j++) {
                lienzo[i][j]=' ';
            }
        } 
    }
    
    
    public  int getAncho() {
        return ancho;
    }

//    Métodos
    public int getAlto() {
        return alto;
    }

    public void setPen(int x, int y, char c) {
        // Coloca el caracter c en la posición x,y
        lienzo[x][y]=c;
    }
    
    public void dibujaLinea(int x1, int y1, 
                            int x2, int y2,
                            char c) {
        
        if(x1 == x2) {
            for(int y = y1; y <= y2; y++) {
                this.setPen(x1, y, c);
            }
        } else {
            double m = (double) (y2 - y1) / (x2 - x1);
            for (double x = x1; x <= x2; x++) {
                double y = m * (x - x1) + y1;
                this.setPen((int) x, (int) y, c);
            }
        }
    }
    
    public void dibujaCirculo(int x1, int y1, int r, char c) {
        for(double t = 0; t <= Math.PI*2; t += 0.1) {
            double x = x1 + r*Math.cos(t);
            double y = y1 + r*Math.sin(t);
            this.setPen((int)x, (int)y, c);
        }
    }
    
    public void paint() {
        // Imprime el lienzo en la pantalla
        for (int y = alto - 1; y >= 0; y--) {
            System.out.println();
            for (int x = 0; x < ancho; x++) {
                System.out.print(lienzo[x][y]); // Imprime caracter
            }
        }
    }
    
    @Override
    public String toString() {
        String r = "";
        for (int y = alto - 1; y >= 0; y--) {
            r = r +"\n";
            for (int x = 0; x < ancho; x++) {
                r = r + lienzo[x][y]; // Concatena caracteres 
                                      //de la matriz
            }
        }
        return r;
    }
    
}
