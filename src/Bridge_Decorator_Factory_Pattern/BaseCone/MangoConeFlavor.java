package Bridge_Decorator_Factory_Pattern.BaseCone;

import Bridge_Decorator_Factory_Pattern.ConeFlavorType;

public class MangoConeFlavor implements ConeFlavor {



    @Override
    public int getCost() {
        return 20;
    }
}
