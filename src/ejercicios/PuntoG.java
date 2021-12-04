package ejercicios;

import utils.*;

public class PuntoG {
    /*
     * Escriba un programa para generar las tablas de multiplicar del
     * 10.000.000 al 10.000.020
     */
    public static void main(String[] args) throws Exception {
        Utils utils = new Utils();
        for (int i = 10000000; i <= 10000020; i++) {
            for (int j = 1; j <= 10; j++) {
                String opString = i + " x "+ j +" = " + i*j; 
                utils.print(opString);
            }
            utils.print("\n");
        }
    }
}
