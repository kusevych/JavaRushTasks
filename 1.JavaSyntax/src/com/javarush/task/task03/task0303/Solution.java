package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(20, 1.13));
        System.out.println(convertEurToUsd(3000, 1.13));
    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        return eur * exchangeRate;
    }
}
