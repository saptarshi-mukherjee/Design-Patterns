package FactoryPattern.Factory2;

public class SteelFactory implements ProductFactory {
    @Override
    public Chair createChair() {
        return new SteelChair();
    }

    @Override
    public Mug createMug() {
        return new SteelMug();
    }
}
