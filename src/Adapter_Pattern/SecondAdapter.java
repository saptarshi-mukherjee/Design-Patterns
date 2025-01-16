package Adapter_Pattern;

public class SecondAdapter implements Adapter {

    ThirdParty2 obj;

    public SecondAdapter() {
        obj=new ThirdParty2();
    }

    @Override
    public void method() {
        obj.method2();
    }
}
