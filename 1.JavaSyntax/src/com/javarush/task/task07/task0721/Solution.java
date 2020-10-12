package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] arrOfInt = getInts();
        int maximum = arrOfInt[0];
        int minimum = arrOfInt[0];

        for (int i = 1; i < arrOfInt.length; i++) {
            if (arrOfInt[i] > maximum)
                maximum = arrOfInt[i];
            if (arrOfInt[i] < minimum)
                minimum = arrOfInt[i];
        }

        System.out.print(maximum + " " + minimum);
    }

    public static int[] getInts() throws IOException {
        int[] arr = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            arr[i] = Integer.parseInt(reader.readLine());
        }
        return arr;
    }
}
