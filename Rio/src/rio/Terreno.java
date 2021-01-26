package rio;

public class Terreno {

    private int ancho;
    private int alto;
    private char[][] lienzo;


    public Terreno() {
        ancho = 100;
        alto = 100;
        lienzo = new char[ancho][alto];
        for (int i = 0; i < ancho; i++) {
            for (int j = 0; j < alto; j++) {
                lienzo[i][j] = ' ';
            }
        }
    }

    public void setPen(int x, int y, char c) {
        lienzo[x][y] = c;
    }

    public void paint() {
        for (int y = alto - 1; y >= 0; y--) {
            System.out.println();
            for (int x = 0; x < ancho; x++) {
                System.out.print(lienzo[x][y]); 
            }
        }
    }
}

