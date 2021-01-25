package aed;

import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author subaru
 */
public class AED {

    public static void main(String[] args) {
        int var = 4;
        int ind = 20;
        int gen = 100;
        double pob1[][] = new double[ind][var];
        Random rand = new Random();
        int r = rand.nextInt(ind);
        int r2 = rand.nextInt(ind);
        int r3 = rand.nextInt(ind);
        double matriz2[][] = new double[3][var];
        double matriz3[][] = new double[3][var];
        double matriz4[][] = new double[ind][var];
        DecimalFormat form = new DecimalFormat("0.000");
        double xF = 0.5;
        double CR = 0.5;
        double rcr = 0;

        for (int x = 0; x < pob1.length; x++) {
            for (int y = 0; y < pob1[x].length; y++) {
                if (y < pob1[x].length - 1) {
                    pob1[x][y] = rand.nextDouble() * 10;
                    System.out.print(form.format(pob1[x][y]) + "\t");
                } else {
                    pob1[x][y] = rand.nextDouble() * 10;
                    System.out.println(form.format(pob1[x][y]));
                }
            }
        }//Matriz

        //Esta cosa genera los random sin que se repitan uno con otro 
        boolean f = true;
        for (int i = 0; i <= ind; i++) {
            while (f == true) {
                if (r == r2) {
                    r2 = rand.nextInt(ind);
                    f = true;
                } else if (r == r3) {
                    r3 = rand.nextInt(ind);
                    f = true;
                } else if (r2 == r3) {
                    r3 = rand.nextInt(ind);
                    f = true;
                } else {
                    f = false;
                }
            }
            f = true;
            r = 0;
            r2 = 0;
            r3 = 0;
//        System.out.println(r);
//        System.out.println(r2);
//        System.out.println(r3);
            System.out.println("");
            for (int y = 0; y < matriz2[0].length; y++) {
                if (y < pob1[0].length) {
                    matriz2[0][y] = pob1[r][y];
                }
                System.out.print(form.format(matriz2[0][y]) + "\t");
            }

            System.out.println("");
            for (int y = 0; y < matriz2[1].length; y++) {
                if (y < pob1[1].length) {
                    matriz2[1][y] = pob1[r2][y];
                }
                System.out.print(form.format(matriz2[1][y]) + "\t");
            }

            System.out.println("");
            for (int y = 0; y < matriz2[2].length; y++) {
                if (y < pob1[2].length) {
                    matriz2[2][y] = pob1[r3][y];
                }
                System.out.print(form.format(matriz2[2][y]) + "\t");

            }
//Aqui termina este for

            //mutación ((x0-x1)/2)+x2
            System.out.println("");
            System.out.println("");
            System.out.println("Vector mutado: ");
            for (int y = 0; y < matriz2[0].length; y++) {
                if (y < matriz2[0].length) {
                    matriz3[0][y] = ((matriz2[0][y] - matriz2[1][y]) * xF) + matriz2[2][y];
                }
                System.out.print(form.format(matriz3[0][y]) + "\t");
            }
            System.out.println("");

            //Cruza y esas cosas
            System.out.println("");
            for (int x = 0; x < matriz4.length; x++) {
                for (int y = 0; y < matriz4[x].length; y++) {
                    rcr = rand.nextDouble();
                    if (rcr < CR) {
                        if (y < matriz4[x].length) {
                            matriz4[x][y] = matriz3[x][y];
                        } else {
                            matriz4[x][y] = pob1[x][y];
                        }
                    } else {
                        if (rcr < CR) {
                            matriz4[x][y] = matriz3[x][y];
                        } else {
                            matriz4[x][y] = pob1[x][y];
                        }
                    }
                }
            }
            
            for (int x = 0; x < matriz4.length; x++) {
                for (int y = 0; y < matriz4[x].length; y++) {
                    if (y < matriz4[x].length - 1) {
                        System.out.print(form.format(matriz4[x][y]) + "\t");
                    } else {
                        System.out.println(form.format(matriz4[x][y]));
                    }
                }
            }
        }
    }
}
