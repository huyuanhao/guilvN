package com.google.android.gms.internal.clearcut;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

public class zzer extends AbstractSet<Map.Entry<K, V>> {
    public final /* synthetic */ zzei zzos;

    public zzer(zzei zzei) {
        this.zzos = zzei;
    }

    public /* synthetic */ zzer(zzei zzei, zzej zzej) {
        this(zzei);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.zzos.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.zzos.clear();
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.zzos.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return new zzeq(this.zzos, null);
    }

    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.zzos.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.zzos.size();
    }
}
