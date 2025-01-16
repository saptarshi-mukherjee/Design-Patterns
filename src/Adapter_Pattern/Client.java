package Adapter_Pattern;

public class Client {

    Adapter adapt;

    public Client() {
        this.adapt=new SecondAdapter();
    }

    public void display() {
        adapt.method();
    }

}
