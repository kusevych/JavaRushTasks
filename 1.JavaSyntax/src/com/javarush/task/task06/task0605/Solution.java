package com.javarush.task.task06.task0605;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Контролируем массу тела
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double weight = Double.parseDouble(bis.readLine());
        double height = Double.parseDouble(bis.readLine());

        Body.calculateMassIndex(weight, height);
    }

    public static class Body {
        public static void calculateMassIndex(double weight, double height) {
            double ind = weight / Math.pow(height, 2);
            String str;
            if (ind < 18.5)
                str = "Недовес: меньше чем 18.5";
            else if (ind < 25)
                str = "Нормальный: между 18.5 и 25";
            else if (ind < 30)
                str = "Избыточный вес: между 25 и 30";
            else
                str = "Ожирение: 30 или больше";
            System.out.println(str);
        }
    }
}
