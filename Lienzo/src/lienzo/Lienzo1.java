package lienzo;

public class Lienzo1 {

    //    Atributos de la clase
    private int ancho;
    private int alto;
    private char[][] lienzo;

// Constructores
    public Lienzo1() {
        ancho = 80;
        alto = 80;
        lienzo = new char[ancho][alto];
        for (int i = 0; i < ancho; i++) {
            for (int j = 0; j < alto; j++) {
                lienzo[i][j] = ' ';
            }
        }
    }
//    Métodos

    public void setPen(int x, int y, char c) {
        // Coloca el caracter c en la posición x,y
        lienzo[x][y] = c;
    }

    public void paint() {
        // Imprime el lienzo en la pantalla
        for (int y = alto - 1; y >= 0; y--) {
            System.out.println();
            for (int x = 0; x < ancho; x++) {
                System.out.print(lienzo[x][y]); //imprime caracter
            }
        }
    }
}
