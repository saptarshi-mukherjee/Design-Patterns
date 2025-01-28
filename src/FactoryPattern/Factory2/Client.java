package FactoryPattern.Factory2;

public class Client {
    public static void main(String[] args) {
        ProductFactory factory=ProductFactorFactory.getFactory(ProductType.PLASTIC);
        Chair chair= factory.createChair();
        Mug mug=factory.createMug();
        chair.manufactureChair();
        mug.manufactureMug();
    }
}
