package FactoryPattern.Factory2;

public class PlasticChair implements Chair {
    @Override
    public void manufactureChair() {
        System.out.println("Plastic chair manufactured");
    }
}
