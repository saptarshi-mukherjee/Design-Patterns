package Observer_Pattern;

public class VowelCountHandler extends EventHandler {
    public VowelCountHandler(String text, String word) {
        super(text, word);
    }

    @Override
    public void handle() {
        int n=this.text.length(), i, count=0;
        char ch=0;
        for(i=0;i<n;i++) {
            ch=this.text.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                count+=1;
        }
        System.out.println("Vowel count = "+count);
    }
}
