package ejercicios;

import utils.*;

public class PuntoC {
    // Diseñe un enunciado de un algoritmo que requiere el uso de operadores
    // de Bit y resuélvalo en Java.
    // Diseñe un algoritmo que reciba una letra y alterne entra mayuscula o minuscula
    public static void main(String[] args) throws Exception {
        Utils utils = new Utils();
        char letra = utils.readChar();
        letra = (char) (letra ^ (1 << 5));
        utils.print(letra);
    }
}
