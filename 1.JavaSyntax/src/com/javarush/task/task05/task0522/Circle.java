package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    public Circle() {
        this(0, 0, 0);
    }

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle(double radius) {
        this(0, 0, radius);
    }

    public Circle(double x, double y) {
        this(x, y, 10);
    }

    public static void main(String[] args) {

    }
}