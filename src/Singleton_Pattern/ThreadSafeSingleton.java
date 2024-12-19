package Singleton_Pattern;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance=null;
    private static Object lock=new Object();
    private int index;

    private ThreadSafeSingleton(int index) {
        this.index=index;
    }

    public static ThreadSafeSingleton getInstance(int index) {
        if(instance==null) {
            synchronized (lock) {
                if(instance==null)
                    instance=new ThreadSafeSingleton(index);
            }
        }
        return instance;
    }

    public static void resetInstance() {
        instance=null;
    }

    public int getIndex() {
        return index;
    }
}
