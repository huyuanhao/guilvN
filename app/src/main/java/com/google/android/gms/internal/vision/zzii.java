package com.google.android.gms.internal.vision;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

public class zzii extends AbstractSet<Map.Entry<K, V>> {
    public final /* synthetic */ zzhz zzaal;

    public zzii(zzhz zzhz) {
        this.zzaal = zzhz;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.zzaal.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.zzaal.clear();
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.zzaal.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return new zzih(this.zzaal, null);
    }

    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.zzaal.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.zzaal.size();
    }

    public /* synthetic */ zzii(zzhz zzhz, zzia zzia) {
        this(zzhz);
    }
}
