package proyectosismografo;

public class ProyectoSismografo {

    public static void main(String[] args) throws InterruptedException {
        Sensor miS = new SensorCoseno();
        Sismografo si = new Sismografo(); //Crear objetos
        Sensor m=new SensorMouse();
        si.agregarSensor(m);//Relanción entre los objetos.

        for (int i = 0; i < 99; i++) {
            si.graficar();
            Thread.sleep(100);
        }

    }

}
