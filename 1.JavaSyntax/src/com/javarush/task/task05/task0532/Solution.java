package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.MIN_VALUE;
        int N = Integer.parseInt(reader.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(reader.readLine());
            if (num > maximum) maximum = num;
        }
        if (N > 0)
            System.out.println(maximum);
    }
}
