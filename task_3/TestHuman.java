package ru.mirea.task3;

public class TestHuman {
    public static void main(String[] args){
        Human h1 = new Human();
        Human h2 = new Human(5, 5, "blond", "blue", 1, 1, 1, 1);
        h1.move(10, 0);

        System.out.println(h1);
        System.out.println(h2);
    }
}
