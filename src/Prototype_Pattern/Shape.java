package Prototype_Pattern;

public abstract class Shape {
    private String name;
    public Shape(String name) {
        this.name=name;
    }

    public Shape(Shape s) {
        this.name=s.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract Shape clone();
}
