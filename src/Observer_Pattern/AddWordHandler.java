package Observer_Pattern;

public class AddWordHandler extends EventHandler {
    public AddWordHandler(String text, String word) {
        super(text, word);
    }

    @Override
    public void handle() {
        System.out.println(this.text);
    }
}
