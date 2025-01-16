package Adapter_Pattern;

public class FirstAdapter implements Adapter {

    ThirdParty1 obj;

    public FirstAdapter() {
        obj=new ThirdParty1();
    }

    @Override
    public void method() {
        obj.method1();
    }
}
