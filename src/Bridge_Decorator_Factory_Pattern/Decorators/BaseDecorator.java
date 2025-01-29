package Bridge_Decorator_Factory_Pattern.Decorators;

import Bridge_Decorator_Factory_Pattern.Component;

public abstract class BaseDecorator implements Component {
    Component base_component;

    public BaseDecorator(Component com) {
        this.base_component=com;
    }
}
