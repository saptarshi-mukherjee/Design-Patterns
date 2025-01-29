package Bridge_Decorator_Factory_Pattern.BaseCone;

import Bridge_Decorator_Factory_Pattern.Component;

public class Cone implements Component {

    ConeFlavor flavor;

    public Cone(ConeFlavor flavor) {
        this.flavor=flavor;
    }

    @Override
    public int getCost() {
        return 10+ flavor.getCost();
    }
}
