package Prototype_Pattern;

public class Rectangle extends Shape {

    private int length, breadth;

    public Rectangle(String name, int length, int breadth) {
        super(name);
        this.length=length;
        this.breadth=breadth;
    }

    public Rectangle(Rectangle rect) {
        super(rect);
        this.length=rect.length;
        this.breadth=rect.breadth;
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(this);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
}
