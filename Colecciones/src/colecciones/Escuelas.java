package colecciones;

public class Escuelas {
    private String nombre;
    private String localidad;
    private String clave;
    private String turno;
    private int docentesmujeres;
    private int docenteshombres;
    private int alumnosmujeres;
    private int alumnoshombres;

    public Escuelas(String nombre, String localidad, String clave, String turno, int docentesmujeres, int docenteshombres, int alumnosmujeres, int alumnoshombres) {
        this.nombre = nombre;
        this.localidad = localidad;
        this.clave = clave;
        this.turno = turno;
        this.docentesmujeres = docentesmujeres;
        this.docenteshombres = docenteshombres;
        this.alumnosmujeres = alumnosmujeres;
        this.alumnoshombres = alumnoshombres;
    }
   
    public Escuelas(String localidad){
    this.localidad=localidad;
    }    
        
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getDocentesmujeres() {
        return docentesmujeres;
    }

    public void setDocentesmujeres(int docentesmujeres) {
        this.docentesmujeres = docentesmujeres;
    }

    public int getDocenteshombres() {
        return docenteshombres;
    }

    public void setDocenteshombres(int docenteshombres) {
        this.docenteshombres = docenteshombres;
    }

    public int getAlumnosmujeres() {
        return alumnosmujeres;
    }

    public void setAlumnosmujeres(int alumnosmujeres) {
        this.alumnosmujeres = alumnosmujeres;
    }

    public int getAlumnoshombres() {
        return alumnoshombres;
    }

    public void setAlumnoshombres(int alumnoshombres) {
        this.alumnoshombres = alumnoshombres;
    }

    
    
 
    @Override
    public boolean equals(Object o) {   //Paraa hacer comparación de objetos
        Escuelas t = null;
        boolean r = false;
        if(o instanceof Escuelas) {
            t = (Escuelas)o;
            r = t.getClave().equals(this.getClave());
        }
        return r;
    }
    
    public int hashCode() {
        return this.clave.hashCode();
    }
    
    @Override
    public String toString() {
        return "Escuelas{" + "nombre=" + nombre + ", localidad=" + localidad + ", clave=" + clave + ", turno=" + turno + 
                ", docentes mujeres="+docentesmujeres+", docentes hombres="+docenteshombres+", alumnos mujeres="+alumnosmujeres+
                ", alumnos hombres="+alumnoshombres+'}';
    }
    
    
}
