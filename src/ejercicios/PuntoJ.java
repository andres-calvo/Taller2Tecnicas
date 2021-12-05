package ejercicios;

import java.math.BigDecimal;

import utils.Utils;

public class PuntoJ {
    /*
    * Un programa que determine si un BIGDECIMAL x que se lee es primo o no
    */
    public static void main(String[] args) throws Exception {
        Utils utils = new Utils();
        BigDecimal x = utils.readBigDecimal("Escriba su BigDecimal : ");
        String message= "";
        BigDecimal i = new BigDecimal(3);
        BigDecimal increment = new BigDecimal(1);
        BigDecimal number2 = new BigDecimal(2);
        while (true) {
            if(x.equals(number2) | x.equals(i)){
                message ="Su BigDecimal es primo";
                break;
            }
            if(BigDecimalEsDivisible(x,number2) | BigDecimalEsDivisible(x, i) ){
                message= "Su BigDecimal no es primo";
                break;
            }
            i= i.add(increment);
        }
        utils.print(message);
    }
    public static boolean BigDecimalEsDivisible(BigDecimal x, BigDecimal y) {
        BigDecimal [] res= x.divideAndRemainder(y);
        return res[1].equals(new BigDecimal(0));
    }
}
