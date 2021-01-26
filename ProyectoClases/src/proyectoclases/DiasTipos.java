/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoclases;

/**
 *
 * @author Cinth
 */
public class DiasTipos {
    private String Tipo;

    public DiasTipos(String Tipo) {
        this.Tipo = Tipo;
    }
    

    public String getTipo() {
        return Tipo;
    }

    @Override
    public String toString() {
        return  Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    
}
