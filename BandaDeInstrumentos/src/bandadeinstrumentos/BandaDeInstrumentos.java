package bandadeinstrumentos;

public class BandaDeInstrumentos {

    public static void main(String[] args) {
    
        Partitura miPartitura = new Partitura("G# C#b Eb G# C#b Eb G# C#b Eb G# C#b Eb G# C#b Eb G# C#b Eb G# C#b Eb"+"\n");
        Banda miBanda = new Banda();
        miBanda.agregaInstrumento(new Piano());
        miBanda.agregaInstrumento(new Bateria());
        miBanda.agregaInstrumento(new Bajo());
        
        miBanda.tocar(miPartitura);
    }
    
}
