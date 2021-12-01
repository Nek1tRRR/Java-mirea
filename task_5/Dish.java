package ru.mirea.task5;

abstract public class Dish {
    protected int size = 0;
    protected String type = "None";

    public void setSize(int size) { this.size = size; }
    public int getSize() { return size; }

    public void setType(String form) { this.type = form; }
    public String getType() { return type; }

    @Override
    public String toString() {
        return "Dish{" +
                "size=" + size +
                ", type='" + type + '\'' +
                '}';
    }
}
