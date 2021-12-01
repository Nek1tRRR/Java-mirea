package ru.mirea.task5;

public class Shepherd extends Dog {

    public Shepherd(String name, int age, String breed)
    {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    @Override
    public void bark() {
        System.out.println("Woof woof!");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
