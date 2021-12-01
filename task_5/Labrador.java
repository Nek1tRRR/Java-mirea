package ru.mirea.task5;

public class Labrador extends Dog {

    public Labrador(String name, int age, String breed)
    {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    @Override
    public void bark() {
        System.out.println("Woooof!");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
