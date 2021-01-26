package graficas;

public class Graficas {

    public static void main(String[] args) {
    double a=-4;
    double b=4;
    double paso=0.2;
    
    for(double i=a;i<=b;i+=paso){
    int valor=(int)gx(i,a,b,paso);
    //imprimir espacios
        for(int e=0;e<valor;e++){
            System.out.print(" ");
        }
        System.out.println("*");
    }
    }
    public static double funcion(double x){
    double r=0;
    r=Math.cos(x);
    return r;
    }
    public static double gx(double x, double a, double b, double paso){
    double r=0;
    double maximo=maximo(a,b,paso);
    double minimo=minimo(a,b,paso);
    
    double escala=50.0/(maximo-minimo); 
    r=escala*(funcion(x)-minimo);
    
    return r;
    }
    public static double maximo(double a, double b,double paso){
    double max=funcion(a);
    double medio=(a+b)/2;
    double iinc=a;
    double idec=b;
    while(iinc<=medio){
        if(funcion(iinc)>max){
           max=funcion(iinc);
        }
        if(funcion(idec)>max){
           max=funcion(idec);
        }
        iinc+=paso;
        idec-=paso;
    }
    return max;
    }
    public static double minimo(double a, double b,double paso){
    double min=funcion(a);
    double medio=(a+b)/2;
    double iinc=a;
    double idec=b;
    while(iinc<=medio){
        if(funcion(iinc)<min){
           min=funcion(iinc);
        }
        if(funcion(idec)<min){
           min=funcion(idec);
        }
        iinc+=paso;
        idec-=paso;
    }
    return min;
}
}
