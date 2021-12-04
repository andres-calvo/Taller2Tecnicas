package ejercicios;
import java.util.Arrays;
import utils.*;
public class PuntoD {
    /*
     * Diseñe un enunciado de un algoritmo que requiere el uso de operador
     * ternario y resuélvalo en Java.
     */

     /*
     * Realizare el algoritmo del PuntoB usando operador ternario envez de if else
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
        
        String resString = (isPar(resultado))? (resultado + " es par") : (resultado + " es impar");
        utils.print(resString);
    }
    static boolean isPar(int x){
        return x % 2 == 0; 
    }
}
