package ru.mirea.task3;

public class TestCircle {
    public static void main(String[] args){
        Circle c1 = new Circle();
        Circle c2 = new Circle(2, "red", true);

        System.out.println(c1);
        System.out.println(c2);

        System.out.println("c2 Perimeter: " + c2.getPerimeter());
        System.out.println("c2 Area: " + c2.getArea());
    }
}
