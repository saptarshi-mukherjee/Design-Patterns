package Singleton_Pattern;

public class SingleThreadClient {
    public static void main(String[] args) {
        int index=-1, i;
        NaiveSingleton reference=null;
        for(i=0;i<100;i++) {
            reference=NaiveSingleton.getInstance(i);
            index= reference.getIndex();
            System.out.println("Index = "+index);
        }
        NaiveSingleton.resetInstance();
        reference=NaiveSingleton.getInstance(i);
        System.out.println("Index = "+reference.getIndex());
    }
}
