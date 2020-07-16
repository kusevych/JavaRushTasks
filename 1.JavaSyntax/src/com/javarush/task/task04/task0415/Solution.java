package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());
        if (a + b > c && a + c > b && c + b > a)
            System.out.println("Треугольник существует." );
        else
            System.out.println("Треугольник не существует." );
    }
}