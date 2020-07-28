package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        String oddOrEven;
        String positiveOrNegative;
        if (a > 0) positiveOrNegative = "положительное";
            else positiveOrNegative = "отрицательное";
        if (a % 2 == 0) oddOrEven = "четное";
            else oddOrEven = "нечетное";
        if (a == 0)
            System.out.println("ноль");
        else
            System.out.println(positiveOrNegative + " " + oddOrEven + " число");
    }
}
