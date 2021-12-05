package ejercicios;

import utils.Utils;

public class PuntoN {
    // Se desean crear arbolitos de navidad con los números, genere los
    // primeros 10 arbolitos como este, pero todos de diferentes anchos y
    // alturas. USE CICLOS.

    //En mi ejercicio el ancho esta representado por los niveles, que formarán las hojas
    //Y la altura corresponde a la altura del tronco del arbol.
    public static void main(String[] args) throws Exception {
        Utils utils = new Utils();
        for (int i = 1; i <= 10; i++) {
            int niveles = i+4;
            int altura= i+3;
            arbolHojas(niveles);
            arbolBase(niveles, altura);
            utils.print("\n \n");
        }

    }

    public static void arbolHojas(int niveles) {
        Utils utils = new Utils();
        int espacios = Math.round(niveles + 1 / 2);
        String space = " ";
        for (int i = 1; i <= niveles; i++) {
            utils.print(space.repeat(espacios) + ("1".repeat(2 * i - 1)));
            if (espacios != 0) {
                espacios--;
            }
        }
    }

    public static void arbolBase(int niveles, int altura) {
        Utils utils = new Utils();
        int hojasUltimoNivel = 2 * niveles - 1;
        int espacioBase = Math.round((hojasUltimoNivel + 1) / 2);
        for (int i = 1; i < altura; i++) {
            utils.print(" ".repeat(espacioBase) + "1");
            if (i + 1 == altura) {
                utils.print(" ".repeat(espacioBase - 1)+"1".repeat(3));
            }
        }
    }
}
