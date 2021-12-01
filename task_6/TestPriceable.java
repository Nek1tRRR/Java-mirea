package ru.mirea.task6;

class House implements Priceable{
    private double price;

    public House(double price){
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

class PC implements Priceable{
    private double price;

    public PC(double price)
    {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

class Smartphone implements Priceable{
    private double price;

    public Smartphone(double price)
    {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

public class TestPriceable {
    public static void main(String[] args) {
        Priceable house = new House(150000);
        Priceable pc = new PC(1000);
        Priceable smartphone = new Smartphone(200);

        System.out.println(house.getPrice());
        System.out.println(pc.getPrice());
        System.out.println(smartphone.getPrice());
    }
}
