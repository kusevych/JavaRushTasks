package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        for (; ;) {
            String str = reader.readLine();
            if (str.equals("end"))
                break;
            else
                list.add(str);
        }

        for (String el: list) {
            System.out.println(el);
        }
    }
}