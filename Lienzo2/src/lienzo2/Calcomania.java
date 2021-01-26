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
public class Calcomania extends Lienzo {
    
    public Calcomania() {
        super(20,20);
    }
    
    public void importaString(String c) {
        char [] sc = c.toCharArray();
        int maxAlto = this.getAlto()-1;
        int maxAncho = this.getAncho()-1;
        int y = maxAlto;
        int x = 0;
        for( char ca : sc ) {
            if(ca == '\n') {
                x = 0;
                y--;
            }
            if((x < maxAncho) && 
               (y >= 0) && 
               (ca != '\n')) {
                this.setPen(x, y, ca);
                x++;
            }
        }
    }
    

}
