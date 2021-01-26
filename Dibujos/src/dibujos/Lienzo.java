package dibujos;

public class Lienzo {
    
    private int ancho;
    private int alto;
    private char[][] lienzo;


    public Lienzo() {
        ancho = 100;
        alto = 100;
        lienzo = new char[ancho][alto];
        for (int i = 0; i < ancho; i++) {
            for (int j = 0; j < alto; j++) {
                lienzo[i][j] = ' ';
            }
        }
    }
    
    public Lienzo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
        lienzo = new char[ancho][alto];
        for (int i = 0; i < ancho; i++) {
            for (int j = 0; j < alto; j++) {
                lienzo[i][j] = ' ';
            }
        }
    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setPen(int x, int y, char c) {
        lienzo[x][y] = c;
    }
    
   public void dibujaLinea(int x1, int y1, int x2, int y2, char c){
    if(x1==x2){
    for(int y=y1;y<=y2;y++){
        this.setPen(x1, y, c);
    }
    }
    else{
    double m=(double)(y2-y1)/(x2-x1);
    for(double x=x1; x<=x2;x++){
    double y=m*(x-x1)+y1;
    this.setPen((int)x,(int)y,c);
    }
    }
    }
   
   public void dibujaCirculo(int x1, int y1, int r, char c){
    for(double t=0;t<=Math.PI*2;t+=0.1){
    double x=x1+r*Math.cos(t);
    double y=y1+r*Math.sin(t);
    this.setPen((int)x, (int)y, c);
    }
}
   public void dibujaCirculo(int x1,int y1,int x2,int y2,char c){ //Sobrecarga tiene el mismo nombre pero atributos diferentes
   double xc=(x2+x1)/2;
   double yc=(y2+y1)/2;
   double r=(int)Math.sqrt(Math.pow((x2-xc),2)+Math.pow((y2-yc),2));
   
   this.dibujaCirculo((int)xc, (int)yc, (int)r, c);
   }
   
   public void dibujaLinea(int x1, int y1, int d, double a, char c){
   double x2=Math.cos(Math.toRadians(a))*d+x1;
   double y2=Math.sin(Math.toRadians(a))*d+y1;
   this.dibujaLinea((int)x1, (int)y1, (int)x2, (int)y2, c);
   }
   
    public void paint() {
        for (int y = alto - 1; y >= 0; y--) {
            System.out.println();
            for (int x = 0; x < ancho; x++) {
                System.out.print(lienzo[x][y]); 
            }
        }
    }
    
    @Override
    public String toString(){ //Sobreescritura cambia el contenido de una clase heredada del objeto
    String r="";
    for (int y = alto - 1; y >= 0; y--) {
            r=r+"\n";
            for (int x = 0; x < ancho; x++) {
                r= r+ lienzo[x][y]; //Concatena caracteres de la matriz
            }
        }
    return r;
    }
    public void agregaLienzo(int x, int y, Lienzo f){
    int a=f.getAlto();
    int g=f.getAncho();
    for(int i=0;i<a;i++){
        for(int j=0;j<g;j++){
        this.setPen(x+j, y+i, f.lienzo[j][i]);
        }
    }
 }
 
}