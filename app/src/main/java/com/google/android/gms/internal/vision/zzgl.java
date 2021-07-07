package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;

public final class zzgl<K> implements Iterator<Map.Entry<K, Object>> {
    public Iterator<Map.Entry<K, Object>> zzyg;

    public zzgl(Iterator<Map.Entry<K, Object>> it) {
        this.zzyg = it;
    }

    public final boolean hasNext() {
        return this.zzyg.hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Map.Entry<K, Object> next = this.zzyg.next();
        return next.getValue() instanceof zzgi ? new zzgk(next) : next;
    }

    public final void remove() {
        this.zzyg.remove();
    }
}
