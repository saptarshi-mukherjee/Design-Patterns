package Singleton_Pattern;

import java.util.concurrent.Callable;

public class ThreadControl implements Callable<Integer> {

    int index;
    boolean flag;

    public ThreadControl(int index,boolean flag) {
        this.index=index;
        this.flag=flag;
    }

    @Override
    public Integer call() throws Exception {
        if(flag==false) {
            ThreadSafeSingleton.resetInstance();
            return 0;
        }
        ThreadSafeSingleton reference=ThreadSafeSingleton.getInstance(index);
        index= reference.getIndex();
        System.out.println("Index = "+index);
        return 0;
    }
}
