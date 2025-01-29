package Bridge_Decorator_Factory_Pattern.Decorators;

import Bridge_Decorator_Factory_Pattern.Component;

public class ChocolateFlavor extends BaseDecorator {
    public ChocolateFlavor(Component com) {
        super(com);
    }

    @Override
    public int getCost() {
        return 160+ base_component.getCost();
    }
}
