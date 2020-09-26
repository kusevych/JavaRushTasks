package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[5];
        int i = 0;
        while(i < 5) {
            int num = Integer.parseInt(reader.readLine());
            array[i] = num;
            i++;
        }

        for (int j = 0; j < array.length - 1; j++) {
            for (int k = 0; k < array.length - 1 - j; k++) {
                if(array[k] > array[k + 1]) {
                    int temp = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = temp;
                }
            }
        }
        for (int el : array)
            System.out.println(el);
    }
}
