package FactoryPattern.Factory2;

public class ProductFactorFactory {

    public static ProductFactory getFactory(ProductType type) {

        switch (type) {
            case STEEL:
                return new SteelFactory();
            case PLASTIC:
                return new PlasticFactory();
            default:
                throw new RuntimeException("Invalid type");
        }

    }
}
