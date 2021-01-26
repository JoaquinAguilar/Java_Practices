package dibujos;

public class LienzoConMarco extends Lienzo{
    public LienzoConMarco(){
    super();
    dibujaMarco();
            
    }
 
 public LienzoConMarco(int ancho, int alto){
 super(ancho,alto); //Heredda atributos del padre
 dibujaMarco(); //Especialización del hijo
}   

 public void dibujaMarco(){
    int ancho=this.getAncho();
    int alto=this.getAlto();
    //Lineas horizontales
    this.dibujaLinea(0, 0, ancho-1, 0, '-');
    this.dibujaLinea(0, alto-1, ancho-1, alto-1, '-');
    //Lineas verticales
    this.dibujaLinea(0, 0, 0, alto-1,'|');
    this.dibujaLinea(ancho-1, 0, ancho-1, alto-1, '|');
    }
}
