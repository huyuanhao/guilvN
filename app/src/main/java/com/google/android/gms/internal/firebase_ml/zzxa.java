package com.google.android.gms.internal.firebase_ml;

import java.util.ListIterator;

public final class zzxa implements ListIterator<String> {
    public ListIterator<String> zzbsp = this.zzbsr.zzbso.listIterator(this.zzbsq);
    public final /* synthetic */ int zzbsq;
    public final /* synthetic */ zzwz zzbsr;

    public zzxa(zzwz zzwz, int i) {
        this.zzbsr = zzwz;
        this.zzbsq = i;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.zzbsp.hasNext();
    }

    public final boolean hasPrevious() {
        return this.zzbsp.hasPrevious();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator, java.util.ListIterator
    public final /* synthetic */ String next() {
        return this.zzbsp.next();
    }

    public final int nextIndex() {
        return this.zzbsp.nextIndex();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.zzbsp.previous();
    }

    public final int previousIndex() {
        return this.zzbsp.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.ListIterator
    public final /* synthetic */ void set(String str) {
        throw new UnsupportedOperationException();
    }
}
