package com.google.android.gms.internal.firebase_ml;

import java.util.Iterator;

public final class zzxb implements Iterator<String> {
    public final /* synthetic */ zzwz zzbsr;
    public Iterator<String> zzbss = this.zzbsr.zzbso.iterator();

    public zzxb(zzwz zzwz) {
        this.zzbsr = zzwz;
    }

    public final boolean hasNext() {
        return this.zzbss.hasNext();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator
    public final /* synthetic */ String next() {
        return this.zzbss.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
