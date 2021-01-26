package dibujos;

public class Dibujos {

    public static void main(String[] args) {
    /*Lienzo lienzo = new Lienzo(50,50);   
    lienzo.dibujaLinea(0, 0, 40, 40, '*'); //x1, y1, x2, y2
    lienzo.dibujaLinea(25, 3, 25, 49, '|');
    //lienzo.paint();
    
    Lienzo l2 = new Lienzo(200,200);
    l2.dibujaCirculo(100, 100, 50, 'o');
    //l2.paint();
    
    LienzoConMarco lcm = new LienzoConMarco();
    //lcm.paint();
    
    LienzoConMarco lcm2 = new LienzoConMarco(10,10);
    //lcm2.paint();
    
    Terreno t = new Terreno();
    for(int x=0;x<100;x++){
        int y=(int)ix(x);
        t.setPen(x, y, '*');  
    }
    for(int x=0;x<100;x++){
        int y=(int)sx(x);
        t.setPen(x, y, '*');
    }
       // t.paint();
       */
    Lienzo l3 = new Lienzo(100,100);
    l3.dibujaCirculo(50, 20, 60, 40,'*');
    l3.dibujaLinea(50, 20, 60, 40, '/');
    l3.paint();
    
    LienzoConMarco l4 = new LienzoConMarco(100,100);
    l4.dibujaLinea(10, 10, 50, 45, '*');
    //l4.paint();
       
    LienzoConMarco lc = new LienzoConMarco(100,100);
    //System.out.println(lc);
    
    Lienzo ca = new Lienzo();
   
    //System.out.println(ca);
    
    TiroParabolico tp=new TiroParabolico(40,30);
    for(double t=0; t<=5; t+=0.1){
    tp.animar(t);
    }
    //System.out.println(tp);
    
    }
    /*public static double ix(double x){
    double r=0;
    r=50+5*Math.cos(x/10)*Math.sin(x/15);
    return r;
    }
    
    public static double sx(double x){
    double r=0;
    r=70+8*Math.sin(x/35)*Math.cos(x/20);
    return r;
    }*/
    
       }    

