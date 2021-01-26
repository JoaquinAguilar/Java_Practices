
package lienzo;

public class Lienzo {

    public static void main(String[] args) {
        Lienzo1 clienzo=new Lienzo1();
        /*clienzo.setPen(10,10,'*');
        clienzo.setPen(10, 9,'*');
        clienzo.setPen(10, 8,'*');
        clienzo.setPen(10, 7,'*');*/
        for(int x=0;x<40;x++){
        int y=(int)funcion(x);
        clienzo.setPen(x, y, '+');
    }      
        Lienzo1 clienzo2=new Lienzo1();
        for(int x=0;x<40;x++){
        int y=(int)funcion2(x);
        clienzo2.setPen(x, y, '*');
        }
        
        clienzo.paint();
        clienzo2.paint();
    }
    
    public static double funcion(double x){
    double r=0;
    r=x;
    return r;
    }
    public static double funcion2(double x){
    double r=0;
    r=40-x;
    return r;
    }
}
