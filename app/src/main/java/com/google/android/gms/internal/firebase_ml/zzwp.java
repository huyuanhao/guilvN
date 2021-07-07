package com.google.android.gms.internal.firebase_ml;

import java.util.Iterator;
import java.util.Map;

public final class zzwp implements Iterator<Map.Entry<K, V>> {
    public int pos;
    public Iterator<Map.Entry<K, V>> zzbse;
    public final /* synthetic */ zzwh zzbsf;
    public boolean zzbsj;

    public zzwp(zzwh zzwh) {
        this.zzbsf = zzwh;
        this.pos = -1;
    }

    private final Iterator<Map.Entry<K, V>> zztc() {
        if (this.zzbse == null) {
            this.zzbse = this.zzbsf.zzbsa.entrySet().iterator();
        }
        return this.zzbse;
    }

    public final boolean hasNext() {
        if (this.pos + 1 < this.zzbsf.zzbrz.size() || (!this.zzbsf.zzbsa.isEmpty() && zztc().hasNext())) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.zzbsj = true;
        int i = this.pos + 1;
        this.pos = i;
        if (i < this.zzbsf.zzbrz.size()) {
            return (Map.Entry) this.zzbsf.zzbrz.get(this.pos);
        }
        return (Map.Entry) zztc().next();
    }

    public final void remove() {
        if (this.zzbsj) {
            this.zzbsj = false;
            this.zzbsf.zzta();
            if (this.pos < this.zzbsf.zzbrz.size()) {
                zzwh zzwh = this.zzbsf;
                int i = this.pos;
                this.pos = i - 1;
                Object unused = zzwh.zzdq(i);
                return;
            }
            zztc().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    public /* synthetic */ zzwp(zzwh zzwh, zzwi zzwi) {
        this(zzwh);
    }
}
