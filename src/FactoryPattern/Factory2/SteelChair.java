package FactoryPattern.Factory2;

public class SteelChair implements Chair {
    @Override
    public void manufactureChair() {
        System.out.println("Steel chair manufactured");
    }
}
