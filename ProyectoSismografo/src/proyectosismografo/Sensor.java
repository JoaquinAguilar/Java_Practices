package proyectosismografo;

public class Sensor {
    private double escalaMax;
    private double escalaMin;
     
    
    public double getEscalaMax(){
        return escalaMax;
    }
    
    public double getEscalaMin(){
        return escalaMin;
    }
    
    public double getValor(){
        return Math.random()*100;
         //El *100 para que de los numeros como entero
    }
    
    public Sensor(){
        System.out.println("El sensor ha sido creado");
    }
}
