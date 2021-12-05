package ejercicios;

import java.util.Scanner;

import utils.*;

public class PuntoF {
    // Un algoritmo que reciba n e imprima el resultado de x:
    // x = Sumatoria de (3i + Sumatoria de (4i - j)desde j=-3 hasta n) desde i=-2
    // hasta m
    public static void main(String[] args) throws Exception {
        Utils utils = new Utils();
        int resFinal = 0;
        Scanner in = new Scanner(System.in);
        //La separacion decimal varia, intente ej 2.0 o 2,0 en caso de error
        utils.print("Entra un valor para n : ");
        int n = in.nextInt();
        utils.print("Entra un valor para m : ");
        int m = in.nextInt();
        in.close();
        for (int i = -2; i <= m; i++) {
            int res2 = 0;
            for (int j = -3; j <= n; j++) {
                res2 += 4 * i - j;
            }
            resFinal += 3 * i + res2;

        }
        utils.print(resFinal);
    }
}
