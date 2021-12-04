package utils;

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
}
