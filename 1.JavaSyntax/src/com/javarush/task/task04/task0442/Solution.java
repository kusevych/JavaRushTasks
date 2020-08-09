package com.javarush.task.task04.task0442;

/* 
Суммирование
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int res = 0;
        while (true) {
            int num = Integer.parseInt(reader.readLine());
            if (num == -1) {
                res += num;
                break;
            }
            else res += num;
        }
        System.out.println(res);
    }
}
