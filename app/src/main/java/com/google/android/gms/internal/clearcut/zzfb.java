package com.google.android.gms.internal.clearcut;

import java.util.ListIterator;

public final class zzfb implements ListIterator<String> {
    public ListIterator<String> zzpc = this.zzpe.zzpb.listIterator(this.zzpd);
    public final /* synthetic */ int zzpd;
    public final /* synthetic */ zzfa zzpe;

    public zzfb(zzfa zzfa, int i) {
        this.zzpe = zzfa;
        this.zzpd = i;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.zzpc.hasNext();
    }

    public final boolean hasPrevious() {
        return this.zzpc.hasPrevious();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator, java.util.ListIterator
    public final /* synthetic */ String next() {
        return this.zzpc.next();
    }

    public final int nextIndex() {
        return this.zzpc.nextIndex();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.zzpc.previous();
    }

    public final int previousIndex() {
        return this.zzpc.previousIndex();
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
