package Observer_Pattern;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter text and word :-");
        String text=sc.nextLine();
        String word=sc.nextLine();
        addWord(text,word);
    }

    private static void addWord(String text, String word) {
        Publisher.getInstance().register(new AddWordHandler(text,word));
        Publisher.getInstance().register(new WordCountHandler(text,word));
        Publisher.getInstance().register(new VowelCountHandler(text, word));
        Publisher.getInstance().execute();
        Publisher.resetInstance();
    }
}
