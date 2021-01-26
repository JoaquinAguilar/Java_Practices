package proyectosismografo;

public class SensorCoseno extends Sensor {
    private double siguienteValor;

public SensorCoseno(){
    super();
    this.siguienteValor=0;
}

public double getValor(){
        this.siguienteValor=this.siguienteValor+0.06;
    return Math.cos(this.siguienteValor)*100;
}

}
