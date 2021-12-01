package ru.mirea.task5;

public class Table extends Furniture{
    public boolean assembled = true;
    public Table(String name, String type, String material, int size){
        this.name = name;
        this.type = type;
        this.material = material;
        this.size = size;
    }

    public void assemble()
    {
        assembled = true;
    }

    public void disassemble()
    {
        assembled = false;
    }

    public boolean is_assembled()
    {
        return assembled;
    }

    @Override
    public String toString() {
        return "Table{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", material='" + material + '\'' +
                ", size=" + size +
                ", assembled=" + assembled +
                '}';
    }
}
