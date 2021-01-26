package proyectosismografo;

public class SensorMouse extends Sensor{

    public double getValor(){
    double mX=StdDraw.mouseX();
    return mX;
}
    
    
}
