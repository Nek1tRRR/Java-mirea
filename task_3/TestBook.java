package ru.mirea.task3;

public class TestBook {
    public static void main(String[] args)
    {
        Book b1 = new Book("Fockser", "Дотянуться до небес", "24.12.2008", 117, true);
        Book b2 = new Book();
        Book b3 = new Book("Ричардс Лола", "Дом сломанных душ", "01.01.2020", 31, false);

        b2.setAuthor("Richard");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
