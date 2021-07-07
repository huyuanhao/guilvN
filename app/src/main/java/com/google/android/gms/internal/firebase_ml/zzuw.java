package com.google.android.gms.internal.firebase_ml;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class zzuw extends zzsq<String> implements zzux, RandomAccess {
    public static final zzuw zzbqb;
    public static final zzux zzbqc = zzbqb;
    public final List<Object> zzbqd;

    static {
        zzuw zzuw = new zzuw();
        zzbqb = zzuw;
        zzuw.zzpt();
    }

    public zzuw() {
        this(10);
    }

    public static String zzs(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzsw) {
            return ((zzsw) obj).zzpx();
        }
        return zzug.zzj((byte[]) obj);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // com.google.android.gms.internal.firebase_ml.zzsq, java.util.List, java.util.AbstractList
    public final /* synthetic */ void add(int i, String str) {
        zzpu();
        this.zzbqd.add(i, str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzsq, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzsq
    public final void clear() {
        zzpu();
        this.zzbqd.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzsq
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.List, java.util.AbstractList
    public final /* synthetic */ Object get(int i) {
        Object obj = this.zzbqd.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzsw) {
            zzsw zzsw = (zzsw) obj;
            String zzpx = zzsw.zzpx();
            if (zzsw.zzpy()) {
                this.zzbqd.set(i, zzpx);
            }
            return zzpx;
        }
        byte[] bArr = (byte[]) obj;
        String zzj = zzug.zzj(bArr);
        if (zzug.zzi(bArr)) {
            this.zzbqd.set(i, zzj);
        }
        return zzj;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzux
    public final Object getRaw(int i) {
        return this.zzbqd.get(i);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzsq
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzsq, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzsq, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzsq, java.util.AbstractCollection, java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [int, java.lang.Object] */
    @Override // com.google.android.gms.internal.firebase_ml.zzsq, java.util.List, java.util.AbstractList
    public final /* synthetic */ String set(int i, String str) {
        zzpu();
        return zzs(this.zzbqd.set(i, str));
    }

    public final int size() {
        return this.zzbqd.size();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzux
    public final void zzc(zzsw zzsw) {
        zzpu();
        this.zzbqd.add(zzsw);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzun
    public final /* synthetic */ zzun zzck(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.zzbqd);
            return new zzuw(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzsq, com.google.android.gms.internal.firebase_ml.zzun
    public final /* bridge */ /* synthetic */ boolean zzps() {
        return super.zzps();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzux
    public final List<?> zzrv() {
        return Collections.unmodifiableList(this.zzbqd);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzux
    public final zzux zzrw() {
        return zzps() ? new zzwz(this) : this;
    }

    public zzuw(int i) {
        this(new ArrayList(i));
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzsq, java.util.List, java.util.AbstractList
    public final boolean addAll(int i, Collection<? extends String> collection) {
        zzpu();
        if (collection instanceof zzux) {
            collection = ((zzux) collection).zzrv();
        }
        boolean addAll = this.zzbqd.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.firebase_ml.zzsq, java.util.List, java.util.AbstractList
    public final /* synthetic */ String remove(int i) {
        zzpu();
        Object remove = this.zzbqd.remove(i);
        ((AbstractList) this).modCount++;
        return zzs(remove);
    }

    public zzuw(ArrayList<Object> arrayList) {
        this.zzbqd = arrayList;
    }
}
