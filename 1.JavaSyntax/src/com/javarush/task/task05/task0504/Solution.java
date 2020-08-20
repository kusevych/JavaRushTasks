package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        Cat first = new Cat("Murzik", 8, 8, 50);
        Cat second = new Cat("Barsik", 5, 9, 70);
        Cat third = new Cat("Diego", 3, 6, 80);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}