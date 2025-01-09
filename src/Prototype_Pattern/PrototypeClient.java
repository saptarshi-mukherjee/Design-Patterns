package Prototype_Pattern;

public class PrototypeClient {
    public static void main(String[] args) {
        Shape[] shapes=createPrototypes();
        createSquareClones((Square) shapes[0]);
        createRectangleClones((Rectangle)shapes[1]);
    }

    public static Shape[] createPrototypes() {
        Rectangle rect=new Rectangle("Prototype rectangle",25,18);
        Square square=new Square("Prototype square",30);
        Shape[] shapes=new Shape[2];
        shapes[0]=square;
        shapes[1]=rect;
        return shapes;
    }

    public static void createSquareClones(Square square) {
        Square copy=square.clone();
        copy.setName("Bumba's square");
        System.out.println(square.getName()+"  "+square.getLength());
        System.out.println(copy.getName()+"  "+copy.getLength());
    }

    public static void createRectangleClones(Rectangle rect) {
        Rectangle copy=rect.clone();
        copy.setName("Rishi's rectangle");
        System.out.println(rect.getName()+"  "+rect.getLength()+"  "+rect.getBreadth());
        System.out.println(copy.getName()+"  "+copy.getLength()+"  "+copy.getBreadth());
    }
}
