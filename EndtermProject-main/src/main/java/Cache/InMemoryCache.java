package cache;

import java.util.HashMap;
import java.util.Map;

public class InMemoryCache {
    private static InMemoryCache instance;
    private final Map<String, Object> cacheStorage;


    private InMemoryCache() {
        cacheStorage = new HashMap<>(); // Деректерді Map құрылымында сақтаймыз [cite: 14]
    }


    public static synchronized InMemoryCache getInstance() {
        if (instance == null) {
            instance = new InMemoryCache();
        }
        return instance;
    }


    public void put(String key, Object value) {
        cacheStorage.put(key, value);
    }


    public Object get(String key) {
        return cacheStorage.get(key);
    }


    public void clear() {
        cacheStorage.clear();
    }
}