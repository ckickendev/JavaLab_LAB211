package JavaLabCucManh.Day2.CacheVirtual;

import java.util.Date;
import java.util.HashMap;

public class FuMemoryCached {
    public static HashMap<String, FuCached> cache = new HashMap<>();

    public boolean putObject(String key, Object object, int timeToLive){
        if(cache.containsKey(key)) {
            if (cache.containsKey(key)) {
                if (cache.get(key).getExpiredDate().after(new Date())) ;
                return false;
            }
        }
        Date expireDate = new Date(System.currentTimeMillis()+ timeToLive);
        cache.put(key, new FuCached(object, expireDate));
        return true;
    }

    public static Object getObject(String key) {
        if (cache.containsKey(key)) {
            if (cache.get(key).getExpiredDate().after(new Date())) {
                return cache.get(key).getData();
            } else {
                cache.remove(key);
            }
        }
        return null;
    }

    public static boolean clean(String key) {
        if (cache.containsKey(key)) {
            cache.remove(key);
            return true;
        }
        return false;
    }

    public static boolean cleanAll() {
        if (cache.isEmpty()) {
            return false;
        }
        cache.clear();
        return true;
    }
}
