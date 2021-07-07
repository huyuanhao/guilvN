package com.google.android.gms.internal.firebase_ml;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class zzwj implements Iterator<Map.Entry<K, V>> {
    public int pos;
    public Iterator<Map.Entry<K, V>> zzbse;
    public final /* synthetic */ zzwh zzbsf;

    public zzwj(zzwh zzwh) {
        this.zzbsf = zzwh;
        this.pos = this.zzbsf.zzbrz.size();
    }

    private final Iterator<Map.Entry<K, V>> zztc() {
        if (this.zzbse == null) {
            this.zzbse = this.zzbsf.zzbsc.entrySet().iterator();
        }
        return this.zzbse;
    }

    public final boolean hasNext() {
        int i = this.pos;
        return (i > 0 && i <= this.zzbsf.zzbrz.size()) || zztc().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (zztc().hasNext()) {
            return (Map.Entry) zztc().next();
        }
        List list = this.zzbsf.zzbrz;
        int i = this.pos - 1;
        this.pos = i;
        return (Map.Entry) list.get(i);
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ zzwj(zzwh zzwh, zzwi zzwi) {
        this(zzwh);
    }
}
