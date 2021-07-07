package com.google.android.gms.internal.firebase_ml;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class zzwz extends AbstractList<String> implements zzux, RandomAccess {
    public final zzux zzbso;

    public zzwz(zzux zzux) {
        this.zzbso = zzux;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ String get(int i) {
        return (String) this.zzbso.get(i);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzux
    public final Object getRaw(int i) {
        return this.zzbso.getRaw(i);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, java.lang.Iterable
    public final Iterator<String> iterator() {
        return new zzxb(this);
    }

    @Override // java.util.List, java.util.AbstractList
    public final ListIterator<String> listIterator(int i) {
        return new zzxa(this, i);
    }

    public final int size() {
        return this.zzbso.size();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzux
    public final void zzc(zzsw zzsw) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzux
    public final List<?> zzrv() {
        return this.zzbso.zzrv();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzux
    public final zzux zzrw() {
        return this;
    }
}
