package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class zzek implements Iterator<Map.Entry<K, V>> {
    public int pos;
    public Iterator<Map.Entry<K, V>> zzor;
    public final /* synthetic */ zzei zzos;

    public zzek(zzei zzei) {
        this.zzos = zzei;
        this.pos = this.zzos.zzom.size();
    }

    public /* synthetic */ zzek(zzei zzei, zzej zzej) {
        this(zzei);
    }

    private final Iterator<Map.Entry<K, V>> zzdw() {
        if (this.zzor == null) {
            this.zzor = this.zzos.zzop.entrySet().iterator();
        }
        return this.zzor;
    }

    public final boolean hasNext() {
        int i = this.pos;
        return (i > 0 && i <= this.zzos.zzom.size()) || zzdw().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        Object obj;
        if (zzdw().hasNext()) {
            obj = zzdw().next();
        } else {
            List list = this.zzos.zzom;
            int i = this.pos - 1;
            this.pos = i;
            obj = list.get(i);
        }
        return (Map.Entry) obj;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
