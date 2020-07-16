package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double minute = Double.parseDouble(reader.readLine());
        if (minute % 5 < 3)
            System.out.println("зелёный");
        else if (minute % 5 >= 4)
            System.out.println("красный");
        else
            System.out.println("жёлтый");
    }
}