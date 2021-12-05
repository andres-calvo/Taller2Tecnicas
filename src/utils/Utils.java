package utils;

import java.util.Scanner;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

public class Utils {
    public void print(Object x) {
        System.out.println(x);
    }

    public int[] randomIntArray(int arrayLength) {
        int[] array = new int[arrayLength];
        Random randNum = new Random();
        for (int i = 0; i < arrayLength; i++) {
            array[i] = randNum.nextInt();
        }
        return array;
    }

    public int numPowNum(int x, int y) {
        int res = 0;
        if (y == 0) {
            return 1;
        }
        for (int i = 0; i <= y; i++) {
            res *= x;
        }
        return res;
    }

    public double doubleNumPowNum(double x, int y) {
        double res = 0;
        if (y == 0) {
            return 1;
        }
        for (int i = 0; i <= y; i++) {
            res *= x;
        }
        return res;
    }

    public char readChar() {
        print("Entra una letra: ");
        Scanner in = new Scanner(System.in);
        char letter = in.next().charAt(0);
        in.close();
        return letter;
    }

    public int readInt(String text) {
        print(text);
        Scanner in = new Scanner(System.in);
        int n = 0;
        n = in.nextInt();
        in.close();
        return n;
    }

    public float readFloat(String text) {
        print(text);
        Scanner in = new Scanner(System.in);
        float n = 0;
        n = in.nextFloat();
        in.close();
        return n;
    }

    public BigDecimal readBigDecimal(String text) {
        print(text);
        Scanner in = new Scanner(System.in);
        BigDecimal n = in.nextBigDecimal();
        in.close();
        return n;
    }

    public BigInteger factorial(int x) {
        BigInteger res = new BigInteger("1");
        if (x == 0) {
            return res;
        }
        for (int i = 2; i <= x; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;

    }
}
