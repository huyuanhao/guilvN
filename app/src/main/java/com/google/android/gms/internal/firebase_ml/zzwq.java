package com.google.android.gms.internal.firebase_ml;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

public class zzwq extends AbstractSet<Map.Entry<K, V>> {
    public final /* synthetic */ zzwh zzbsf;

    public zzwq(zzwh zzwh) {
        this.zzbsf = zzwh;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.zzbsf.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public void clear() {
        this.zzbsf.clear();
    }

    public boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.zzbsf.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        return new zzwp(this.zzbsf, null);
    }

    public boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.zzbsf.remove(entry.getKey());
        return true;
    }

    public int size() {
        return this.zzbsf.size();
    }

    public /* synthetic */ zzwq(zzwh zzwh, zzwi zzwi) {
        this(zzwh);
    }
}
