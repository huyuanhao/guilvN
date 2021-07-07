package com.google.android.gms.internal.vision;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class zzir extends AbstractList<String> implements zzgo, RandomAccess {
    public final zzgo zzaau;

    public zzir(zzgo zzgo) {
        this.zzaau = zzgo;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ String get(int i) {
        return (String) this.zzaau.get(i);
    }

    @Override // com.google.android.gms.internal.vision.zzgo
    public final Object getRaw(int i) {
        return this.zzaau.getRaw(i);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, java.lang.Iterable
    public final Iterator<String> iterator() {
        return new zzit(this);
    }

    @Override // java.util.List, java.util.AbstractList
    public final ListIterator<String> listIterator(int i) {
        return new zzis(this, i);
    }

    public final int size() {
        return this.zzaau.size();
    }

    @Override // com.google.android.gms.internal.vision.zzgo
    public final void zzc(zzeo zzeo) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.vision.zzgo
    public final List<?> zzft() {
        return this.zzaau.zzft();
    }

    @Override // com.google.android.gms.internal.vision.zzgo
    public final zzgo zzfu() {
        return this;
    }
}
