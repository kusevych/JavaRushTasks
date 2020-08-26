package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    int top, left, width, height;

    public Rectangle(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int top, int left) {
        this.top = top;
        this.left = left;
    }

    public Rectangle(int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
    }

    public Rectangle(Rectangle rectangleCopy) {
        this.top = rectangleCopy.top;
        this.left = rectangleCopy.left;
        this.width = rectangleCopy.width;
        this.height = rectangleCopy.height;
    }

    public static void main(String[] args) {

    }
}
