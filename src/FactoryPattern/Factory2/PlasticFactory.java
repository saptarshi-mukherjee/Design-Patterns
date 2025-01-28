package FactoryPattern.Factory2;

public class PlasticFactory implements ProductFactory {
    @Override
    public Chair createChair() {
        return new PlasticChair();
    }

    @Override
    public Mug createMug() {
        return new PlasticMug();
    }
}
