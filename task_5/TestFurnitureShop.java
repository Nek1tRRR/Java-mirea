package ru.mirea.task5;

public class TestFurnitureShop {
    public static void main(String[] args) {
        FurnitureShop fs = new FurnitureShop("Best Furniture");
        fs.add_product(new Cupboard("Шкаф деревянный","Cupboard", "wood", 2, 3));
        fs.add_product(new Cupboard("Шкаф пластиковый","Cupboard", "plastic", 1, 1));
        fs.add_product(new Table("Стол деревянный","Table", "wood", 2));

        fs.print_catalog();

    }
}
