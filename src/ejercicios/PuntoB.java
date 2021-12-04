package ejercicios;
import java.util.Arrays;
import utils.*;

public class PuntoB {
    /*
     * Diseñe un enunciado de un algoritmo que requiere el uso de operadores
     * aritméticos combinados y resuélvalo en Java
     */

     /*
     * Sea v una lista de enteros aleatorio generado, realice un algoritmo que sume todos los pares y los reste con los numeros impares
     * luego imprima si es par o impar el resultado del procedimiento anterior.
     * 
     */
    public static void main(String[] args) throws Exception {
        Utils utils = new Utils();
        int[] v= utils.randomIntArray(5);
        utils.print("Su lista random es " + Arrays.toString(v));
        int resultado = 0;
        for (int i = 0; i < v.length; i++) {
            if(isPar(v[i])){
                resultado += v[i];
            }else{
                resultado -= v[i];
            }
        }
        
        if(isPar(resultado)){
            utils.print(resultado + " es par");
        } else{
            utils.print(resultado + " es impar");
        }
    }
    static boolean isPar(int x){
        return x % 2 == 0; 
    }
}
