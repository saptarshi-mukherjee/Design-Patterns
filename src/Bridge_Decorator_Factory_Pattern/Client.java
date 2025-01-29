package Bridge_Decorator_Factory_Pattern;

import Bridge_Decorator_Factory_Pattern.BaseCone.Cone;
import Bridge_Decorator_Factory_Pattern.BaseCone.ConeFlavor;
import Bridge_Decorator_Factory_Pattern.BaseCone.MangoConeFlavor;
import Bridge_Decorator_Factory_Pattern.Decorators.ChocolateFlavor;
import Bridge_Decorator_Factory_Pattern.Decorators.MangoFlavor;
import Bridge_Decorator_Factory_Pattern.Decorators.Scoop;

public class Client {
    public static void main(String[] args) {
        Component ice_cream=
                new ChocolateFlavor(
                        new Scoop(
                                new Cone(
                                        new MangoConeFlavor()
                                )
                        )
                );
        System.out.println(ice_cream.getCost());
    }
}
