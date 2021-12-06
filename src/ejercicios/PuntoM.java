package ejercicios;

import java.util.Scanner;

import utils.Utils;

public class PuntoM {
    public static void main(String[] args) throws Exception {
        Utils utils = new Utils();
        Scanner in = new Scanner(System.in);
        // La separacion decimal varia, intente ej 2.0 o 2,0 en caso de error
        utils.print("Entra un valor para a : ");
        int a = in.nextInt();
        utils.print("Entra un valor para b : ");
        int b = in.nextInt();
        in.close();
        if (a < b) {
            throw new Exception("a debe ser mayor que b");
        }
        /*
         * Como b es menor que a, y estamos buscando el maximo comun divisor, dicho
         * divisor debe ser menor o igual a b,
         * Ya que si es mayor a b, dejaria de ser comun entre los dos numeros.
         * Por ello nos interesan los numeros positivos mayores a cero y menores o
         * iguales a b.
         * 
         * Este algoritmo resta los numeros a y b, restamos b de a tantas veces sea
         * posible, Si ya no es posible restarle b al numero a,
         * Se halla un nuevo residuo, Este proceso se repite hasta que ya no se pueda
         * calcular un residuo, entonces el ultimo residuo
         * calculado correspondera al maximo comun divisor
         */
        while (b > 0) {

            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        utils.print(a);

    }
}
