package ejercicios;

import utils.Utils;

public class PuntoI {
    // Escriba un programa que acepte un número entero positivo e imprima
    // sus divisores enteros
    public static void main(String[] args) throws Exception {
        Utils utils = new Utils();
        int x = utils.readInt("Ingrese un numero entero positivo : ");
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                utils.print(i);
            }
        }
    }
}
