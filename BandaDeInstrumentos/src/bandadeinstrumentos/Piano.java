package bandadeinstrumentos;

public class Piano extends Instrumento{
    @Override
    public void tocar(Partitura partitura){
        System.out.println("Piano: ");
        super.tocar(partitura);
    }
}
