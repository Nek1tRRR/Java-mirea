package ru.mirea.task5;

import java.util.ArrayList;

public class FurnitureShop {
    private String name;
    private ArrayList<Furniture> catalog;

    public FurnitureShop(String name)
    {
        this.name = name;
        catalog = new ArrayList<>();
    }

    public void print_catalog()
    {
        if (catalog.isEmpty())
            System.out.println("В магазине " + name + " нет товаров");
        else
        {
            System.out.println("Каталог магазина " + name + ":");
            for (Furniture furn : catalog)
            {
                System.out.println(furn);
            }
        }
    }

    public void add_product(Furniture product)
    {
        catalog.add(product);
    }

    public void delete_product(Furniture product)
    {
        catalog.remove(product);
    }

    public Furniture get_product(int index)
    {
        return catalog.get(index);
    }
}
