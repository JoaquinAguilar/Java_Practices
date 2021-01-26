/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proycolecciones;

/**
 *
 * @author prueba
 */
public class Escuela {

    private String nombre;
    private String localidad;
    private String clave;
    private String turno;
    //nuevos agregados
    private int docentes_mujeres;
    private int docentes_hombres;
    private int alumnos_mujeres;
    private int alumnos_hombres;

    public Escuela(String nombre, String localidad, String clave, String turno,
            int docentes_mujeres,int docentes_hombres,int alumnos_mujeres, 
            int alumnos_hombres) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.clave = clave;
        this.turno = turno;
        this.docentes_mujeres = docentes_mujeres;
        this.docentes_hombres=docentes_hombres;
        this.alumnos_mujeres = alumnos_mujeres;
        this.alumnos_hombres = alumnos_hombres;

    }

    public String getNombre() {
        return nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getClave() {
        return clave;
    }

    public String getTurno() {
        return turno;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setDocentes_hombres(int docentes_hombres) {
        this.docentes_hombres = docentes_hombres;
    }

    public void setDocentes_mujeres(int docentes_mujeres) {
        this.docentes_mujeres = docentes_mujeres;
    }

    public void setAlumnos_hombres(int alumnos_hombres) {
        this.alumnos_hombres = alumnos_hombres;
    }

    public void setAlumnos_mujeres(int alumnos_mujeres) {
        this.alumnos_mujeres = alumnos_mujeres;
    }

    public int getDocentes_hombres() {
        return docentes_hombres;
    }

    public int getDocentes_mujeres() {
        return docentes_mujeres;
    }

    public int getAlumnos_hombres() {
        return alumnos_hombres;
    }

    public int getAlumnos_mujeres() {
        return alumnos_mujeres;
    }

//    @Override
//    public String toString() {
//        return "Escuela{" + "nombre=" + nombre + ", localidad=" + localidad + ", clave=" + clave + ", turno=" + turno + ", docentes hombres=" + docentes_hombres '}';
//    }

    @Override
    public String toString() {
        return "Escuela{" + "nombre=" + nombre + ", localidad=" + localidad + ", clave=" + clave + ", turno=" + turno + ", docentes_mujeres=" + docentes_mujeres + ", docentes_hombres=" + docentes_hombres + ", alumnos_mujeres=" + alumnos_mujeres + ", alumnos_hombres=" + alumnos_hombres + '}';
    }

    @Override
    public boolean equals(Object o) {
        Escuela t = null;
        boolean r = false;
        if (o instanceof Escuela) {
            t = (Escuela) o;
            r = t.getClave().equals(this.getClave());
        }
        return r;
    }

    @Override
    //identificador unico interno
    public int hashCode() {
        return this.clave.hashCode();
    }
}
