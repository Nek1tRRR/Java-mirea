package ru.mirea.task5;

abstract public class Dog {
    protected String name;
    protected int age;
    protected String breed;

    public void setAge(int age) { this.age = age; }
    public void setName(String name) { this.name = name; }
    public void setBreed(String breed) { this.breed = breed; }
    public String getName(String name){ return name; }
    public String getBreed() { return breed; }
    public int getAge() { return age; }

    public void intoHumanAge(){
        System.out.println(name + "'s age in human years is " + age * 7 + " years");
    }

    public void bark(){
        System.out.println("Bark!");
    }
}
