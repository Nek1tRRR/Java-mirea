package ru.mirea.task5;

public class TestDog {
    public static void main(String[] args) {
        Shepherd sh = new Shepherd("Tommy", 4, "Shepherd");
        Labrador lb = new Labrador("Bobby", 2, "Labrador");

        sh.bark();
        lb.bark();
    }
}
