package Bridge_Decorator_Factory_Pattern.Decorators;

import Bridge_Decorator_Factory_Pattern.Component;

public abstract class DecoratorComponent extends BaseDecorator {


    public DecoratorComponent(Component com) {
        super(com);
    }
}
