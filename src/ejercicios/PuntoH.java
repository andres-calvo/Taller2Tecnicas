package ejercicios;

import java.util.Scanner;

import utils.Utils;

public class PuntoH {
    /*
     * Desarrollar un método o programa que reciba un número de punto
     * flotante x y un número entero positivo n, y calcule x elevado a la n
     * , utilizando un ciclo.
     */
    public static void main(String[] args) throws Exception {
        Utils utils = new Utils();
        utils.print("Introduzca el valor flotante x :");
        Scanner in = new Scanner(System.in);
        //La separacion decimal varia, intente ej 2.0 o 2,0 en caso de error
        float x = in.nextFloat();
        utils.print("Introduzca el valor entero positivo n :");
        int n = in.nextInt();
        in.close();
        double res= x;
        for (int i = 0; i <= n; i++) {
            res*=x;
        }
        utils.print(res);
    }
}
