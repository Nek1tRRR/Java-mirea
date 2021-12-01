package ru.mirea.task4;

public class TestAuthor {
    public static void main(String[] args) {
        Author a = new Author("Ivan Ivanov", "i_ivanov@somewhere.com", 'm');
        Author b = new Author("Maria Sidorova", "m_sidorova@somewhere.com", 'f');

        b.setEmail(" ");
        System.out.println(a);
        System.out.println(b);
    }
}
