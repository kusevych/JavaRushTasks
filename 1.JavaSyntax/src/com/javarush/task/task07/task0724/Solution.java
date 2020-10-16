package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Human grandpa1 = new Human("Mike", true, 60);
        Human grandpa2 = new Human("George", true, 50);
        Human grandma1 = new Human("Alice", false, 53);
        Human grandma2 = new Human("Ann", false, 47);
        Human dad = new Human("Carl", true, 30, grandpa1, grandma1);
        Human mom = new Human("Caroline", false, 25, grandpa2, grandma2);
        Human child1 = new Human("Kate", false, 5, dad, mom);
        Human child2 = new Human("Niah", false, 3, dad, mom);
        Human child3 = new Human("Andrew", true, 2, dad, mom);
        System.out.println(grandpa1);
        System.out.println(grandma1);
        System.out.println(grandpa2);
        System.out.println(grandma2);
        System.out.println(dad);
        System.out.println(mom);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        String name;
        boolean gender;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean gender, int age) {
            this.name = name;
            this.gender = gender;
            this.age = age;
        }

        public Human(String name, boolean gender, int age, Human father, Human mother) {
            this.name = name;
            this.gender = gender;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.gender ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}