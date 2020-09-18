package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        int i = 1;
        while(i < 6) {
            result += s;
            i++;
        }
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        int i = 1;
        while(i <= count) {
            result += s;
            i++;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
