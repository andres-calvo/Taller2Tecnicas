package ejercicios;

import utils.*;

public class PuntoA {
    /*
     * . Un algoritmo que imprima los números pares entre -82.000.000 y -
     * 108.000.000 (incluidos ambos). Notar que se imprimen de manera
     * descendente.
     */
    public static void main(String[] args) throws Exception {
        Utils utils = new Utils();
        int num = -82000000;
        while (num >= -108000000) {
            utils.print(num);
            num = num - 2;
        }
    }
}
