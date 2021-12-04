package utils;

import java.util.Scanner;
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

    public char readChar() {
        System.out.println("Entra una letra: ");
        Scanner in = new Scanner(System.in);
        char letter = in.next().charAt(0);
        in.close();
        return letter;
    }
    public int readInt(String text){
        System.out.println(text);
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        return n;
    }
}
