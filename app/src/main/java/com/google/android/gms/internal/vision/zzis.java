package com.google.android.gms.internal.vision;

import java.util.ListIterator;

public final class zzis implements ListIterator<String> {
    public ListIterator<String> zzaav = this.zzaax.zzaau.listIterator(this.zzaaw);
    public final /* synthetic */ int zzaaw;
    public final /* synthetic */ zzir zzaax;

    public zzis(zzir zzir, int i) {
        this.zzaax = zzir;
        this.zzaaw = i;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.util.ListIterator
    public final /* synthetic */ void add(String str) {
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.zzaav.hasNext();
    }

    public final boolean hasPrevious() {
        return this.zzaav.hasPrevious();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator, java.util.ListIterator
    public final /* synthetic */ String next() {
        return this.zzaav.next();
    }

    public final int nextIndex() {
        return this.zzaav.nextIndex();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.ListIterator
    public final /* synthetic */ String previous() {
        return this.zzaav.previous();
    }

    public final int previousIndex() {
        return this.zzaav.previousIndex();
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
