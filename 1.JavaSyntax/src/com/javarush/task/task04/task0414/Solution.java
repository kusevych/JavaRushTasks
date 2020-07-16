package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(bf.readLine());
        int x;
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0)
            x = 366;
        else
            x = 365;
        System.out.println("количество дней в году: " + x);
    }
}