package Bridge_Decorator_Factory_Pattern.Decorators;

import Bridge_Decorator_Factory_Pattern.Component;

public class MangoFlavor extends DecoratorFlavor {
    public MangoFlavor(Component com) {
        super(com);
    }

    @Override
    public int getCost() {
        return 80+ base_component.getCost();
    }
}
