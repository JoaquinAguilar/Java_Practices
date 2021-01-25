package bandadeinstrumentos;

public class Bateria extends Instrumento{
    @Override
    public void tocar(Partitura partitura){
        System.out.println("Batería: ");
        super.tocar(partitura);
    }
}
