package Singleton_Pattern;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultiThreadClient {
    public static void main(String[] args) throws Exception {
        ExecutorService exs= Executors.newFixedThreadPool(20);
        int i;
        Future<Integer> f=null;
        for(i=0;i<100;i++) {
            ThreadControl thread=new ThreadControl(i,true);
            f=exs.submit(thread);
        }
        f.get();
        ThreadControl thread=new ThreadControl(i,false);
        f=exs.submit(thread);
        f.get();
        thread=new ThreadControl(i,true);
        f=exs.submit(thread);
        f.get();
        exs.shutdown();
    }
}
