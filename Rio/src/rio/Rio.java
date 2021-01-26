    package rio;

public class Rio {

    public static void main(String[] args) {
    Terreno terreno=new Terreno();
    
    for(int x=0;x<100;x++){
        int y=(int)ix(x);
        terreno.setPen(x, y, '*');  
    }
    for(int x=0;x<100;x++){
        int y=(int)sx(x);
        terreno.setPen(x, y, '*');
    }
    terreno.paint();
        System.out.println();
        //System.out.println(areaReimman(0, 100, 100));
        //System.out.println(areaReimman2(0, 100, 100));
        double areaRio=areaReimman2(0,100,100)-areaReimman(0,100,100);
        System.out.println("El área del río es: "+areaRio);
        double areaTotal=Math.pow(100, 2)-areaRio;
        System.out.println("El área utilizable es: "+areaTotal);
    }
    public static double ix(double x){
    double r=0;
    r=50+5*Math.cos(x/10)*Math.sin(x/15);
    return r;
    }
    
    public static double sx(double x){
    double r=0;
    r=70+8*Math.sin(x/35)*Math.cos(x/20);
    return r;
    }

    public static double areaReimman(double xInicial,
                                     double xFinal,
                                     int numeroPasos) {
        double resultado = 0.0;
        xInicial=0;
        xFinal=100;
        numeroPasos=100;
        double incremento = (xFinal - xInicial) / numeroPasos;
        double semiIncremento = incremento / 2;
        double x = xInicial;
        
        for (int i = 0; i < numeroPasos; i++) {
            resultado += incremento * ix(x + semiIncremento);
            x += incremento;
        }

        return resultado;       
 }
    
     public static double areaReimman2(double xInicial,
                                     double xFinal,
                                     int numeroPasos) {
        double resultado = 0.0;
        xFinal=100;
        xInicial=0;
        numeroPasos=100;
        double incremento = (xFinal - xInicial) / numeroPasos;
        double semiIncremento = incremento / 2;
        double x = xInicial;
        
        for (int i = 0; i < numeroPasos; i++) {
            resultado += incremento * sx(x + semiIncremento);
            x += incremento;
        }

        return resultado;
 }


}

