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
public class Descripcion {
    private String Descripcion;

    public Descripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }
    @Override
    public String toString() {
        return Descripcion;
    }
    
    
    
}
