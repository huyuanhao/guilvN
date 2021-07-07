package com.google.android.gms.internal.clearcut;

import java.util.Iterator;

public final class zzfc implements Iterator<String> {
    public final /* synthetic */ zzfa zzpe;
    public Iterator<String> zzpf = this.zzpe.zzpb.iterator();

    public zzfc(zzfa zzfa) {
        this.zzpe = zzfa;
    }

    public final boolean hasNext() {
        return this.zzpf.hasNext();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.zzpf.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
