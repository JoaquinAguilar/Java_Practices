/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoclases;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Cinth
 */
public class Fecha {
    private Date FechaActual;
    private String Fecha;
    public Fecha(Date d){
        this.setFechaActual(d);
        this.setFecha(ObtenerFecha(d));
        
    }
    
    public String ObtenerFecha(Date dat){
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(dat);
        int Dia = gc.get(GregorianCalendar.DAY_OF_MONTH);
        int Mes = gc.get(GregorianCalendar.MONTH);
        int Anio = gc.get(GregorianCalendar.YEAR);
        String d = "", m ="";
        if (Dia<10) {
            d = "0" + Dia;
            
        }else{
            d = String.valueOf(Dia);
        }
        if (Mes<10) {
            m="0"+Mes;
        }else{
            m=String.valueOf(Mes);
        }
        return d + "-" + m +"-" + Anio;
    }

    public Date getFechaActual() {
        return FechaActual;
    }

    public void setFechaActual(Date FechaActual) {
        this.FechaActual = FechaActual;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }


}
