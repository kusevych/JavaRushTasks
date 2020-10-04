package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        String str = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).length() > str.length()) {
                str = list.get(i);
            }
            else {
                System.out.println(i);
                break;
            }
        }
    }
}

