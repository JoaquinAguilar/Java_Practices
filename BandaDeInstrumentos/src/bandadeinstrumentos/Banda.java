package bandadeinstrumentos;

public class Banda{
    private Instrumento[] instrumentos;
    private int maxInstrumentos;

    public Banda(){
    instrumentos = new Instrumento[10];
    maxInstrumentos = 0;
    }
    public void agregaInstrumento(Instrumento instrumento){
      if(maxInstrumentos<10){  
        this.instrumentos[maxInstrumentos++]=instrumento;
    }else{
          System.out.println("Banda completa");
      }
    }
    public void tocar (Partitura partitura){
        for(int i=0; i<maxInstrumentos;i++){
            instrumentos[i].tocar(partitura);
        }
    }
    public void afinar(){
    
    }
    public void sonar(){
    
    }
}

