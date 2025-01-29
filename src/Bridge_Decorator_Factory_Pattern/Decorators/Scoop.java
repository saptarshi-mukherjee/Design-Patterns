package Bridge_Decorator_Factory_Pattern.Decorators;

import Bridge_Decorator_Factory_Pattern.Component;

public class Scoop extends DecoratorComponent {
    public Scoop(Component com) {
        super(com);
    }

    @Override
    public int getCost() {
        return 50+ base_component.getCost();
    }
}
