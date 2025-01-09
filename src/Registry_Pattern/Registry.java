package Registry_Pattern;

import java.util.HashMap;

public class Registry {
    private HashMap<String,User> map;
    private static Registry instance=null;

    private Registry() {
        map=new HashMap<>();
    }

    public static Registry getInstance() {
        if(instance==null)
            instance=new Registry();
        return instance;
    }

    public void register(String key, User user) {
        map.put(key,user);
    }

    public User get(String key) {
        return map.get(key);
    }
}
