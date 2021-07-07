package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;

public final class zzih implements Iterator<Map.Entry<K, V>> {
    public int pos;
    public Iterator<Map.Entry<K, V>> zzaak;
    public final /* synthetic */ zzhz zzaal;
    public boolean zzaap;

    public zzih(zzhz zzhz) {
        this.zzaal = zzhz;
        this.pos = -1;
    }

    private final Iterator<Map.Entry<K, V>> zzgz() {
        if (this.zzaak == null) {
            this.zzaak = this.zzaal.zzaag.entrySet().iterator();
        }
        return this.zzaak;
    }

    public final boolean hasNext() {
        if (this.pos + 1 < this.zzaal.zzaaf.size() || (!this.zzaal.zzaag.isEmpty() && zzgz().hasNext())) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        this.zzaap = true;
        int i = this.pos + 1;
        this.pos = i;
        if (i < this.zzaal.zzaaf.size()) {
            return (Map.Entry) this.zzaal.zzaaf.get(this.pos);
        }
        return (Map.Entry) zzgz().next();
    }

    public final void remove() {
        if (this.zzaap) {
            this.zzaap = false;
            this.zzaal.zzgx();
            if (this.pos < this.zzaal.zzaaf.size()) {
                zzhz zzhz = this.zzaal;
                int i = this.pos;
                this.pos = i - 1;
                Object unused = zzhz.zzbq(i);
                return;
            }
            zzgz().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    public /* synthetic */ zzih(zzhz zzhz, zzia zzia) {
        this(zzhz);
    }
}
