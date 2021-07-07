package com.google.android.gms.internal.firebase_ml;

import java.util.Iterator;
import java.util.Map;

public final class zzuu<K> implements Iterator<Map.Entry<K, Object>> {
    public Iterator<Map.Entry<K, Object>> zzbpx;

    public zzuu(Iterator<Map.Entry<K, Object>> it) {
        this.zzbpx = it;
    }

    public final boolean hasNext() {
        return this.zzbpx.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.zzbpx.next();
        return next.getValue() instanceof zzur ? new zzut(next) : next;
    }

    public final void remove() {
        this.zzbpx.remove();
    }
}
