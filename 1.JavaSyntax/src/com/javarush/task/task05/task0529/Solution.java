package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true) {
            String str = reader.readLine();
            if (str.equals("сумма"))
                break;
            sum += Integer.parseInt(str);
        }
        System.out.println(sum);
    }
}
