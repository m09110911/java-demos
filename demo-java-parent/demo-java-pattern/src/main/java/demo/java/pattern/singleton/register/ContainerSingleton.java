package demo.java.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {

    private static Map<String, Object> map = new ConcurrentHashMap<>();

    private ContainerSingleton() {
    }

    synchronized public static final Object getObj(String className) throws Exception {
        if (map.containsKey(className)) {
            return map.get(className);
        } else {
            return map.put(className, Class.forName(className).newInstance());
        }

    }
}
