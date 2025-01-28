package FactoryPattern.Factory2;

public class SteelMug implements Mug {
    @Override
    public void manufactureMug() {
        System.out.println("Steel mug manufactured");
    }
}
