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
public class Perro extends Calcomania {
    
    public Perro() {
        super();
        String p = "  __      _" + "\n" +
                   "o'')}____//" + "\n" +
                   "`_/      )" + "\n" +
                   "(_(_/-(_/";
        this.importaString(p);
    }
    
}
