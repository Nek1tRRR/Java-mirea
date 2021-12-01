package ru.mirea.task5;

public class Plate extends Dish{
    private double deep = 1.0;

    public Plate(){}
    public Plate(int size, String type, double deep){
        this.size = size;
        this.type = type;
        this.deep = deep;
    }

//    @Override
//    public void setSize(int size) { super.setSize(size); }
//    @Override
//    public int getSize() { return super.getSize(); }
//    @Override
//    public void setType(String form) { super.setType(form); }
//    @Override
//    public String getType() { return super.getType(); }

    public void setDeep(double deep) { this.deep = deep; }
    public double getDeep() { return deep; }

    @Override
    public String toString() {
        return "Plate{" +
                "size=" + size +
                ", type='" + type + '\'' +
                ", deep=" + deep +
                '}';
    }
}
