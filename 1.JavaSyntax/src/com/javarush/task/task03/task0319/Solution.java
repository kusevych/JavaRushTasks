package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String num1 = reader.readLine();
        String num2 = reader.readLine();

        System.out.println(name + " получает " + num1 + " через " + num2 + " лет.");
    }
}
