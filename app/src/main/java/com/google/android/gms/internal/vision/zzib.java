package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class zzib implements Iterator<Map.Entry<K, V>> {
    public int pos;
    public Iterator<Map.Entry<K, V>> zzaak;
    public final /* synthetic */ zzhz zzaal;

    public zzib(zzhz zzhz) {
        this.zzaal = zzhz;
        this.pos = this.zzaal.zzaaf.size();
    }

    private final Iterator<Map.Entry<K, V>> zzgz() {
        if (this.zzaak == null) {
            this.zzaak = this.zzaal.zzaai.entrySet().iterator();
        }
        return this.zzaak;
    }

    public final boolean hasNext() {
        int i = this.pos;
        return (i > 0 && i <= this.zzaal.zzaaf.size()) || zzgz().hasNext();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        if (zzgz().hasNext()) {
            return (Map.Entry) zzgz().next();
        }
        List list = this.zzaal.zzaaf;
        int i = this.pos - 1;
        this.pos = i;
        return (Map.Entry) list.get(i);
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ zzib(zzhz zzhz, zzia zzia) {
        this(zzhz);
    }
}
