package bandadeinstrumentos;

import org.jfugue.player.Player;

public class Instrumento {
private Partitura partitura;

public void Instumento(){

}
public void tocar(Partitura partitura){
/*String [] notas = partitura.getNotas().split(" ");
for(String nota : notas){
    System.out.println(nota);*/
System.out.println("Tocando "+partitura.getNotas());
Player player = new Player();
player.play(partitura.getNotas());
}

public void afinar(){
    System.out.println("Ya está afinado");
}
public void sonar(){
    System.out.println("Sí suena");
}
    
}
