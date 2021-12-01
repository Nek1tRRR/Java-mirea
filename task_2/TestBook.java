package ru.mirea.task2;

public class TestBook {
    public static void main(String[] args) {
        Book book_1 = new Book("Fockser", "Дотянуться до небес", 117, true);
        Book book_2 = new Book();
        Book book_3 = new Book("Ричардс Лола", "Дом сломанных душ", 31, false);

        System.out.println(book_1);
        System.out.println(book_2);
        if (book_3.isIn_stock())
            System.out.println(book_3.getAuthor() + " " + book_3.getTitle() + " : в наличии");
        else
            System.out.println(book_3.getAuthor() + " " + book_3.getTitle() + " : нет в наличии");
    }
}
