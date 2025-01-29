package Bridge_Decorator_Factory_Pattern.Decorators;

import Bridge_Decorator_Factory_Pattern.Component;

public abstract class DecoratorFlavor extends BaseDecorator {
    public DecoratorFlavor(Component com) {
        super(com);
    }
}
