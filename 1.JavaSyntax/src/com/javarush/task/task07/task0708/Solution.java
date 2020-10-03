package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<>();
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        for (int i = 0; i < 5; i++) {
            String str = reader.readLine();
            if (str.length() > max)
                max = str.length();
            Solution.strings.add(str);
        }

        for (String string: Solution.strings) {
            if (string.length() == max) {
                System.out.println(string);
            }
        }
    }
}
