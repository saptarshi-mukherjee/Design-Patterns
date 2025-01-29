package Observer_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private static Publisher instance=null;
    private List<EventHandler> events;

    private Publisher() {
        events=new ArrayList<>();
    }

    public static Publisher getInstance() {
        if(instance==null)
            instance=new Publisher();
        return instance;
    }

    public static void resetInstance() {
        instance=null;
    }

    public void register(EventHandler event) {
        events.add(event);
    }

    public void execute() {
        for(EventHandler event : events)
            event.handle();
    }
}
