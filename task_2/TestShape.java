package ru.mirea.task2;

public class TestShape {
    public static void main(String[] args){
        Shape sh1 = new Shape();
        Shape sh2 = new Shape("green", true);
        System.out.println(sh1);
        System.out.println(sh2);
    }
}
