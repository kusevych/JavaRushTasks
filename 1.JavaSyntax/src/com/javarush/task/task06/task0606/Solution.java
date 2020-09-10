package com.javarush.task.task06.task0606;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());
        int rem;
        while (num > 0) {
            rem = num % 10;
            if (rem % 2 == 0)
                Solution.even++;
            else
                Solution.odd++;
            num /= 10;
        }
        System.out.println("Even: " + Solution.even + " Odd: " + Solution.odd);
    }
}
