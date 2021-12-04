package ejercicios;
import utils.*;

public class PuntoE {
    // Un algoritmo que reciba n e imprima el resultado de x:
    // x = Sumatoria de (7i-3) desde i=-2 hasta n
    public static void main(String[] args) throws Exception {
        Utils utils = new Utils();
        int resultado=0;
        int n = utils.readInt("Entra un valor para n : ");
        for (int i = -2; i <= n; i++) {
            resultado+= 7*i - 3;
        }
        utils.print(resultado);
    }
}
