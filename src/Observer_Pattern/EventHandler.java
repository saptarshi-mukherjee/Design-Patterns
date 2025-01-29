package Observer_Pattern;

public abstract class EventHandler {
    String text, word;
    public EventHandler(String text, String word) {
        this.text=text;
        this.word=word;
        this.text+=this.word;
    }
    public abstract void handle();
}
