package ru.mirea.task3;

public class Book {
    private String author;
    private String title;
    private String date;
    private int pages;
    private boolean in_stock;

    public Book(String author, String title, String date, int pages, boolean in_stock){
        this.author = author;
        this.title = title;
        this.date = date;
        this.pages = pages;
        this.in_stock = in_stock;
    }

    public Book(){
        this.author = "None";
        this.title = "None";
        this.date = "None";
        this.pages = 0;
        this.in_stock = false;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", date='" + date + '\'' +
                ", pages=" + pages +
                ", in_stock=" + in_stock +
                '}';
    }

    // Сеттеры
    public void setAuthor(String author){
        this.author = author;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setDate(String date) { this.date = date; }
    public void setPages(int pages){
        this.pages = pages;
    }
    public void setInStock(boolean in_stock){
        this.in_stock = in_stock;
    }

    // Геттеры
    public String getAuthor() {
        return author;
    }
    public String getTitle() {
        return title;
    }
    public String getDate() { return date; }
    public int getPages() {
        return pages;
    }
    public boolean isIn_stock() {
        return in_stock;
    }

}
