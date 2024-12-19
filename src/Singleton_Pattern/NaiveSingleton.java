package Singleton_Pattern;

public class NaiveSingleton {

    private static NaiveSingleton instance=null;
    private int index;

    private NaiveSingleton(int index) {
        this.index=index;
    }

    public static NaiveSingleton getInstance(int index) {
        if(instance==null)
            instance=new NaiveSingleton(index);
        return instance;
    }

    public static void resetInstance() {
        instance=null;
    }

    public int getIndex() {
        return this.index;
    }

}
