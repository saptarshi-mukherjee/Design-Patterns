package FactoryPattern.Factory2;

public class PlasticMug implements Mug {
    @Override
    public void manufactureMug() {
        System.out.println("Plastic mug manufactured");
    }
}
