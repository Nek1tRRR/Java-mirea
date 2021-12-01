package ru.mirea.task2;

public class TestDog {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("Mike", 2);
        dogs[1] = new Dog("Helen", 7);
        dogs[2] = new Dog("Bob");
        dogs[2].setAge(1);

        for (Dog dog : dogs)
        {
            System.out.println(dog);
            dog.intoHumanAge();
        }
    }
}
