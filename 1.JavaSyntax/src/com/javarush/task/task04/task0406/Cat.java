package com.javarush.task.task04.task0406;

/* 
Программа учета имен
*/

public class Cat {
    private String fullName;

    public void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        this.fullName = fullName;
    }

    public static void main(String[] args) {
//        Cat cat1 = new Cat();
//        cat1.setName("Cat1", "SuperCat");
//        System.out.println(cat1.fullName);
    }
}
