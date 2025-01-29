package Bridge_Decorator_Factory_Pattern.Decorators;

import Bridge_Decorator_Factory_Pattern.Component;

public class Syrup extends DecoratorComponent {
    public Syrup(Component com) {
        super(com);
    }

    @Override
    public int getCost() {
        return 100+ base_component.getCost();
    }
}
