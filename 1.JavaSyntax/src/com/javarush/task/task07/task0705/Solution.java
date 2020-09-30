package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] largeArray = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            largeArray[i] = Integer.parseInt(reader.readLine());
        }
        int[] firstArr = new int[10];
        int[] secondArr = new int[10];
        for (int i = 0; i < 10; i++) {
            firstArr[i] = largeArray[i];
            secondArr[i] = largeArray[i + 10];
            System.out.println(secondArr[i]);
        }
    }
}
