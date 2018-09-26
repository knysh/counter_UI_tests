package framework.cucumber;


import java.util.HashMap;
import java.util.Map;

public class Store {
    private static ThreadLocal<Map<String, Object>> context = new ThreadLocal<>();

    public static Object get(final String name) {
        return context.get().get(name);
    }

    public static Map getMap(final String name) {
        return (Map) get(name);
    }

    public static void put(final String name, final Object obj) {
        context.get().put(name, obj);
    }

    public static void put(final String name, final Map<String, String> map) {
        context.get().put(name, map);
    }

    public void init() {
        context.set(new HashMap<>());
    }
}
