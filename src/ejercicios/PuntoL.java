package ejercicios;

import java.math.BigDecimal;
import java.math.BigInteger;

import utils.Utils;

public class PuntoL {
    /*
     * Consultar la expansión de Taylor de la función seno. Haga un programa
     * para calcular el seno de 30 grados (𝜋/6 𝑟𝑎𝑑𝑖𝑎𝑛𝑒𝑠). Haga un ciclo
     * calculando los términos y acumulándolos. Pare cuando el término que se
     * acaba de calcular sea menor que 0.001 (ver:
     * https://es.wikipedia.org/wiki/Serie_de_Taylor). Utilice el método para
     * calcular el factorial y el método para la potenciación que escribió
     * anteriormente.
     */
    public static void main(String[] args) throws Exception {
        Utils utils = new Utils();
        int degree = 30;
        double angleInRadians = Math.toRadians(degree);
        double initialValue = (utils.numPowNum(-1, 0)/1)*angleInRadians;
        BigDecimal res = new BigDecimal(initialValue);
        //Como ya utilizamos n = 0 para hallar el valor inicial, el ciclo lo empezamos desde 1
        for (int n = 1; res.compareTo(new BigDecimal("0.001")) == -1 ; n++) {
            long numerator= utils.numPowNum(-1, n);
            BigInteger factorial = utils.factorial(2*n + 1);
            utils.print(factorial + " " + (2*n + 1));
            double xPow2nPlus1 = utils.doubleNumPowNum(angleInRadians, 2*n + 1); 
            BigInteger bigNumerator = BigInteger.valueOf(numerator);
            BigDecimal bigFraction = new BigDecimal(bigNumerator.divide(factorial));
            BigDecimal bigXpow2nPlus1 = new BigDecimal(xPow2nPlus1);
            res = res.add(bigFraction).multiply(bigXpow2nPlus1);
        }
        utils.print(res);
    }
}
