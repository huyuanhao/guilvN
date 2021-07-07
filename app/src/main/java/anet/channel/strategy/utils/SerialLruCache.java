package anet.channel.strategy.utils;

import java.util.LinkedHashMap;
import java.util.Map;

public class SerialLruCache<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: a */
    public int f449a;

    public SerialLruCache(int i) {
        super(i + 1, 1.0f, true);
        this.f449a = i;
    }

    public boolean entryRemoved(Map.Entry<K, V> entry) {
        return true;
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<K, V> entry) {
        if (size() > this.f449a) {
            return entryRemoved(entry);
        }
        return false;
    }
}
