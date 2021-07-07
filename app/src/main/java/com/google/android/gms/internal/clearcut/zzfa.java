package com.google.android.gms.internal.clearcut;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class zzfa extends AbstractList<String> implements zzcx, RandomAccess {
    public final zzcx zzpb;

    public zzfa(zzcx zzcx) {
        this.zzpb = zzcx;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ String get(int i) {
        return (String) this.zzpb.get(i);
    }

    @Override // com.google.android.gms.internal.clearcut.zzcx
    public final Object getRaw(int i) {
        return this.zzpb.getRaw(i);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection, java.util.AbstractList, java.lang.Iterable
    public final Iterator<String> iterator() {
        return new zzfc(this);
    }

    @Override // java.util.List, java.util.AbstractList
    public final ListIterator<String> listIterator(int i) {
        return new zzfb(this, i);
    }

    public final int size() {
        return this.zzpb.size();
    }

    @Override // com.google.android.gms.internal.clearcut.zzcx
    public final List<?> zzbt() {
        return this.zzpb.zzbt();
    }

    @Override // com.google.android.gms.internal.clearcut.zzcx
    public final zzcx zzbu() {
        return this;
    }
}
