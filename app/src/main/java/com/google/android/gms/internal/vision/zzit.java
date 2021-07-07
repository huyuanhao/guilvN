package com.google.android.gms.internal.vision;

import java.util.Iterator;

public final class zzit implements Iterator<String> {
    public final /* synthetic */ zzir zzaax;
    public Iterator<String> zzaay = this.zzaax.zzaau.iterator();

    public zzit(zzir zzir) {
        this.zzaax = zzir;
    }

    public final boolean hasNext() {
        return this.zzaay.hasNext();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.zzaay.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
