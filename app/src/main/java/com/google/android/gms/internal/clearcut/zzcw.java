package com.google.android.gms.internal.clearcut;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class zzcw extends zzav<String> implements zzcx, RandomAccess {
    public static final zzcw zzlq;
    public static final zzcx zzlr = zzlq;
    public final List<Object> zzls;

    static {
        zzcw zzcw = new zzcw();
        zzlq = zzcw;
        zzcw.zzv();
    }

    public zzcw() {
        this(10);
    }

    public zzcw(int i) {
        this(new ArrayList(i));
    }

    public zzcw(ArrayList<Object> arrayList) {
        this.zzls = arrayList;
    }

    public static String zze(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof zzbb ? ((zzbb) obj).zzz() : zzci.zzf((byte[]) obj);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList
    public final /* synthetic */ void add(int i, String str) {
        zzw();
        this.zzls.add(i, str);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.List, com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList
    public final boolean addAll(int i, Collection<? extends String> collection) {
        zzw();
        if (collection instanceof zzcx) {
            collection = ((zzcx) collection).zzbt();
        }
        boolean addAll = this.zzls.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // java.util.AbstractCollection, java.util.List, com.google.android.gms.internal.clearcut.zzav, java.util.Collection
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.clearcut.zzav
    public final void clear() {
        zzw();
        this.zzls.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.clearcut.zzav
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i) {
        Object obj = this.zzls.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzbb) {
            zzbb zzbb = (zzbb) obj;
            String zzz = zzbb.zzz();
            if (zzbb.zzaa()) {
                this.zzls.set(i, zzz);
            }
            return zzz;
        }
        byte[] bArr = (byte[]) obj;
        String zzf = zzci.zzf(bArr);
        if (zzci.zze(bArr)) {
            this.zzls.set(i, zzf);
        }
        return zzf;
    }

    @Override // com.google.android.gms.internal.clearcut.zzcx
    public final Object getRaw(int i) {
        return this.zzls.get(i);
    }

    @Override // com.google.android.gms.internal.clearcut.zzav
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.List, com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList
    public final /* synthetic */ String remove(int i) {
        zzw();
        Object remove = this.zzls.remove(i);
        ((AbstractList) this).modCount++;
        return zze(remove);
    }

    @Override // java.util.List, com.google.android.gms.internal.clearcut.zzav
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.List, com.google.android.gms.internal.clearcut.zzav, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.List, com.google.android.gms.internal.clearcut.zzav, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // java.util.List, com.google.android.gms.internal.clearcut.zzav, java.util.AbstractList
    public final /* synthetic */ String set(int i, String str) {
        zzw();
        return zze(this.zzls.set(i, str));
    }

    public final int size() {
        return this.zzls.size();
    }

    @Override // com.google.android.gms.internal.clearcut.zzcx
    public final List<?> zzbt() {
        return Collections.unmodifiableList(this.zzls);
    }

    @Override // com.google.android.gms.internal.clearcut.zzcx
    public final zzcx zzbu() {
        return zzu() ? new zzfa(this) : this;
    }

    @Override // com.google.android.gms.internal.clearcut.zzcn
    public final /* synthetic */ zzcn zzi(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.zzls);
            return new zzcw(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.clearcut.zzav, com.google.android.gms.internal.clearcut.zzcn
    public final /* bridge */ /* synthetic */ boolean zzu() {
        return super.zzu();
    }
}
