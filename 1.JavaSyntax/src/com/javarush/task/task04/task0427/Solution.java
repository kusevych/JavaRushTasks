package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        String oddOrEven;
        String value = "";
        if (a % 2 == 0) oddOrEven = "четное";
            else oddOrEven = "нечетное";
        String str = a + "";
        if (str.length() == 1) value = "однозначное";
        if (str.length() == 2) value = "двузначное";
        if (str.length() == 3) value = "трехзначное";
        if (a > 0 && a < 1000)
            System.out.println(oddOrEven + " " + value + " число");
    }
}
