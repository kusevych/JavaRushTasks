package com.javarush.task.task04.task0441;

/* 
Как-то средненько
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int mid;
        if (b <= a && a <= c || b >= a && a >= c) mid = a;
        else if (a <= b && b <= c || a >= b && b >= c) mid = b;
        else mid = c;
        System.out.println(mid);
    }
}
