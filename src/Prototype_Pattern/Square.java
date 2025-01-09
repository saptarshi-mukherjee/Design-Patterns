package Prototype_Pattern;

public class Square extends Shape {

    int length;

    public Square(String name, int length) {
        super(name);
        this.length=length;
    }

    public Square(Square square) {
        super(square);
        this.length=square.length;
    }

    @Override
    public Square clone() {
        return new Square(this);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
