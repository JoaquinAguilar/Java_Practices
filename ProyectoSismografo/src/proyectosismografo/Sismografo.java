package proyectosismografo;

public class Sismografo {
    private double y;
    private Sensor sensor;
    private double puntoX;
    private double puntoY;
    
public void agregarSensor(Sensor s){
    this.sensor=s;
}

public void graficar(){
    double newX=this.sensor.getValor(); 
    double newY=this.puntoY+5;
    StdDraw.line(this.puntoX,this.puntoY, newX, newY);
    this.puntoX=newX;
    this.puntoY=newY;
   
}
public Sismografo(){
    System.out.println("El sismografo ha sido creado");
    StdDraw.setCanvasSize(800, 600);
    StdDraw.setXscale(-400, 400);
    StdDraw.setYscale(0,600);
    this.y=0;
    this.puntoX=0;
    this.puntoY=0;
    
}

}
