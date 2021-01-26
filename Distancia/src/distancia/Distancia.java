package distancia;

public class Distancia {

    public static void main(String[] args){ 
      //  System.out.println(distancia(6,2,4,1));
      double num_valores=100;
      double paso=(5.0-(-5.0))/num_valores;
      for(double i=-5.0; i<=5.0; i+=paso){
          System.out.println("o("+i+")="+o(i));
      }
    }
    public static double o(double x){
    double r=0;
    
    r=Math.exp(-0.5*Math.pow(x,2))/Math.sqrt(Math.PI*2);
    
    return r;
            }
    /*public static double distancia(double x1, double x2,
            double y1, double y2) {
        double resultado = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        //double resultado = Math.sqrt((x2-x1)*(x2-x1)+ (y2-y1)*(y2-y1));
        return resultado;
    }*/
    
}
