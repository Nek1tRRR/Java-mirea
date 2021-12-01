package ru.mirea.task5;

public class Fork extends Dish{
    private int tines = 2;

    public Fork(){}
    public Fork(int size, String type, int tines){
        this.size = size;
        this.type = type;
        this.tines = tines;
    }


    public void setTines(int tines) { this.tines = tines; }
    public int getTines() { return tines; }

    @Override
    public String toString() {
        return "Fork{" +
                "size=" + size +
                ", type='" + type + '\'' +
                ", tines=" + tines +
                '}';
    }
}
