package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        String str = "" + number;
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - '0';
        }
        return sum;
    }
}
// or with %
//    public static int sumDigitsInNumber(int number) {
//        int sum = 0;
//        while (number > 0) {
//            sum += number % 10;
//            number = number / 10;
//            }
//        return sum;
//    }