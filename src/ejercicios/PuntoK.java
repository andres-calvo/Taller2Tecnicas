package ejercicios;

import utils.Utils;

public class PuntoK {
    /*
     * Un programa que halle la parte entera de la raíz cuadrada de un número
     * entero positivo que se lee. El programa debe ensayar con 1^2,
     * luego con 2^2, luego con 3^2
     * y así sucesivamente. ¿Cuándo debe parar el programa?
     */
    public static void main(String[] args) throws Exception {
        Utils utils = new Utils();
        int x = utils.readInt("Ingrese un numero entero positivo : ");
        for (int i = 1; i <= x; i++) {
            if (i*i == x) {
                utils.print(i);
                break;
            }
            if(i == x){
                utils.print("No tiene raiz cuadrada entera");
            }
        }
    }
}
