package Observer_Pattern;

public class WordCountHandler extends EventHandler {
    public WordCountHandler(String text, String word) {
        super(text, word);
    }

    @Override
    public void handle() {
        int n=this.text.length(), i, count_spaces=0;
        for(i=0;i<n;i++) {
            if(this.text.charAt(i)==' ')
                count_spaces+=1;
        }
        System.out.println("Word count = "+(count_spaces+1));
    }
}
