package ru.mirea.task5;

abstract public class Furniture {
    protected String name = "None";
    protected String type = "None";
    protected String material = "None";
    protected int size = 0;

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }
    public void setMaterial(String material) { this.material = material; }
    public String getMaterial() { return material; }
    public void setType(String type) { this.type = type; }
    public String getType() { return type; }
    public void setSize(int size) { this.size = size; }
    public int getSize() { return size; }

    @Override
    public String toString() {
        return "Furniture{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", material='" + material + '\'' +
                ", size=" + size +
                '}';
    }
}
