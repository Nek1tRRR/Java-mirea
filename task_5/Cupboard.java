package ru.mirea.task5;

public class Cupboard extends Furniture{
    public int count_doors = 1;
    public boolean closed = true;
    public Cupboard(String name, String type, String material, int size, int count_doors){
        this.name = name;
        this.type = type;
        this.material = material;
        this.size = size;
    }

    public void close()
    {
        closed = true;
    }

    public void open()
    {
        closed = false;
    }

    public boolean is_closed(){
        return closed;
    }

    @Override
    public String toString() {
        return "Cupboard{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", count_doors=" + count_doors + '\'' +
                ", material='" + material + '\'' +
                ", size=" + size +
                '}';
    }
}
