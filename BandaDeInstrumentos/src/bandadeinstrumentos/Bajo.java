package bandadeinstrumentos;

public class Bajo extends Instrumento{
    @Override
    public void tocar(Partitura partitura){
        System.out.println("Bajo: ");
        super.tocar(partitura);
    }
}
