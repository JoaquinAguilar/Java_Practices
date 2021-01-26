package proyectohilos;

public class ProyectoHilos {

    public static void main(String[] args) {
        Corredor a=new Corredor('?');  //Se crean los objetos
        Corredor b=new Corredor('§');
        
        Thread cpuA=new Thread(a);  //Se meten a los threads
        Thread cpuB=new Thread(b);
        
        cpuA.start();
        cpuB.start();
    }
    
}
