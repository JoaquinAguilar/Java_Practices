package proyectohilos;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Corredor implements Runnable{  //implements se usa para interfaces y extends para herencia

    private String carrera;
    private char corredor;
    private long tiempo;
    
    public Corredor (char corredor){
        this.corredor=corredor;
        carrera="";
        tiempo=(long)(Math.random()*500+300);
    }
    
    public void corre(){
        carrera=carrera+corredor;
        System.out.println(carrera);
        try {
            Thread.sleep(tiempo);
        } catch (InterruptedException ex) {
            Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void run() {
        for(int i=0; i<50;i++){
            corre();
        }
    }
}
