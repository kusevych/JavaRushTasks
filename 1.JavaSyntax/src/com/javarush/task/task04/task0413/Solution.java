package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        int dayOfWeek = Integer.parseInt(str);
        if (dayOfWeek == 1)
            System.out.println("понедельник");
        if (dayOfWeek == 2)
            System.out.println("вторник");
        if (dayOfWeek == 3)
            System.out.println("среда");
        if (dayOfWeek == 4)
            System.out.println("четверг");
        if (dayOfWeek == 5)
            System.out.println("пятница");
        if (dayOfWeek == 6)
            System.out.println("суббота");
        if (dayOfWeek == 7)
            System.out.println("воскресенье");
        if (dayOfWeek < 1 || dayOfWeek > 7)
            System.out.println("такого дня недели не существует");
    }
}