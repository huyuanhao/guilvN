package com.p118pd.sdk;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: com.pd.sdk.丨丨LLl1  reason: invalid class name and case insensitive filesystem */
public final class C9818LLl1<T> implements Queue<T> {
    public static final Object OooO00o = new Object();
    public static final int o0ooOoO = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f23415OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AtomicLong f23416OooO00o = new AtomicLong();

    /* renamed from: OooO00o  reason: collision with other field name */
    public AtomicReferenceArray<Object> f23417OooO00o;
    public final AtomicLong OooO0O0 = new AtomicLong();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public AtomicReferenceArray<Object> f23418OooO0O0;
    public int o00oO0O;
    public int o0ooOO0;
    public int o0ooOOo;

    public C9818LLl1(int i) {
        int OooO00o2 = LLIIL1I.OooO00o(i);
        int i2 = OooO00o2 - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(OooO00o2 + 1);
        this.f23417OooO00o = atomicReferenceArray;
        this.o0ooOO0 = i2;
        m21907OooO00o(OooO00o2);
        this.f23418OooO0O0 = atomicReferenceArray;
        this.o0ooOOo = i2;
        this.f23415OooO00o = (long) (i2 - 1);
    }

    public static int OooO00o(int i) {
        return i;
    }

    private boolean OooO00o(AtomicReferenceArray<Object> atomicReferenceArray, T t, long j, int i) {
        OooO00o(atomicReferenceArray, i, t);
        OooO0O0(j + 1);
        return true;
    }

    private T OooO0O0(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f23418OooO0O0 = atomicReferenceArray;
        int OooO00o2 = OooO00o(j, i);
        T t = (T) OooO00o(atomicReferenceArray, OooO00o2);
        if (t == null) {
            return null;
        }
        OooO00o(atomicReferenceArray, OooO00o2, (Object) null);
        OooO00o(j + 1);
        return t;
    }

    private long OooO0OO() {
        return this.OooO0O0.get();
    }

    private long OooO0Oo() {
        return this.f23416OooO00o.get();
    }

    @Override // java.util.Collection, java.util.Queue
    public boolean add(T t) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    public boolean contains(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public T element() {
        throw new UnsupportedOperationException();
    }

    public boolean isEmpty() {
        return OooO0Oo() == OooO0OO();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public boolean offer(T t) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f23417OooO00o;
        long OooO0O02 = OooO0O0();
        int i = this.o0ooOO0;
        int OooO00o2 = OooO00o(OooO0O02, i);
        if (OooO0O02 < this.f23415OooO00o) {
            return OooO00o(atomicReferenceArray, t, OooO0O02, OooO00o2);
        }
        long j = ((long) this.o00oO0O) + OooO0O02;
        if (OooO00o(atomicReferenceArray, OooO00o(j, i)) == null) {
            this.f23415OooO00o = j - 1;
            return OooO00o(atomicReferenceArray, t, OooO0O02, OooO00o2);
        } else if (OooO00o(atomicReferenceArray, OooO00o(1 + OooO0O02, i)) == null) {
            return OooO00o(atomicReferenceArray, t, OooO0O02, OooO00o2);
        } else {
            OooO00o(atomicReferenceArray, OooO0O02, OooO00o2, t, (long) i);
            return true;
        }
    }

    @Override // java.util.Queue
    public T peek() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f23418OooO0O0;
        long OooO00o2 = OooO00o();
        int i = this.o0ooOOo;
        T t = (T) OooO00o(atomicReferenceArray, OooO00o(OooO00o2, i));
        return t == OooO00o ? OooO00o(OooO00o(atomicReferenceArray), OooO00o2, i) : t;
    }

    @Override // java.util.Queue
    public T poll() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f23418OooO0O0;
        long OooO00o2 = OooO00o();
        int i = this.o0ooOOo;
        int OooO00o3 = OooO00o(OooO00o2, i);
        T t = (T) OooO00o(atomicReferenceArray, OooO00o3);
        boolean z = t == OooO00o;
        if (t != null && !z) {
            OooO00o(atomicReferenceArray, OooO00o3, (Object) null);
            OooO00o(OooO00o2 + 1);
            return t;
        } else if (z) {
            return OooO0O0(OooO00o(atomicReferenceArray), OooO00o2, i);
        } else {
            return null;
        }
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public int size() {
        long OooO0OO = OooO0OO();
        while (true) {
            long OooO0Oo = OooO0Oo();
            long OooO0OO2 = OooO0OO();
            if (OooO0OO == OooO0OO2) {
                return (int) (OooO0Oo - OooO0OO2);
            }
            OooO0OO = OooO0OO2;
        }
    }

    public Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public T remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public <E> E[] toArray(E[] eArr) {
        throw new UnsupportedOperationException();
    }

    private void OooO00o(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i, T t, long j2) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f23417OooO00o = atomicReferenceArray2;
        this.f23415OooO00o = (j2 + j) - 1;
        OooO00o(atomicReferenceArray2, i, t);
        OooO00o(atomicReferenceArray, atomicReferenceArray2);
        OooO00o(atomicReferenceArray, i, OooO00o);
        OooO0O0(j + 1);
    }

    private long OooO0O0() {
        return this.f23416OooO00o.get();
    }

    private void OooO0O0(long j) {
        this.f23416OooO00o.lazySet(j);
    }

    private void OooO00o(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        OooO00o(atomicReferenceArray, OooO00o(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    private AtomicReferenceArray<Object> OooO00o(AtomicReferenceArray<Object> atomicReferenceArray) {
        return (AtomicReferenceArray) OooO00o(atomicReferenceArray, OooO00o(atomicReferenceArray.length() - 1));
    }

    private T OooO00o(AtomicReferenceArray<Object> atomicReferenceArray, long j, int i) {
        this.f23418OooO0O0 = atomicReferenceArray;
        return (T) OooO00o(atomicReferenceArray, OooO00o(j, i));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m21907OooO00o(int i) {
        this.o00oO0O = Math.min(i / 4, o0ooOoO);
    }

    private long OooO00o() {
        return this.OooO0O0.get();
    }

    private void OooO00o(long j) {
        this.OooO0O0.lazySet(j);
    }

    public static int OooO00o(long j, int i) {
        return OooO00o(((int) j) & i);
    }

    public static void OooO00o(AtomicReferenceArray<Object> atomicReferenceArray, int i, Object obj) {
        atomicReferenceArray.lazySet(i, obj);
    }

    public static <E> Object OooO00o(AtomicReferenceArray<Object> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    public boolean OooO00o(T t, T t2) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.f23417OooO00o;
        long OooO0Oo = OooO0Oo();
        int i = this.o0ooOO0;
        long j = 2 + OooO0Oo;
        if (OooO00o(atomicReferenceArray, OooO00o(j, i)) == null) {
            int OooO00o2 = OooO00o(OooO0Oo, i);
            OooO00o(atomicReferenceArray, OooO00o2 + 1, t2);
            OooO00o(atomicReferenceArray, OooO00o2, t);
            OooO0O0(j);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.f23417OooO00o = atomicReferenceArray2;
        int OooO00o3 = OooO00o(OooO0Oo, i);
        OooO00o(atomicReferenceArray2, OooO00o3 + 1, t2);
        OooO00o(atomicReferenceArray2, OooO00o3, t);
        OooO00o(atomicReferenceArray, atomicReferenceArray2);
        OooO00o(atomicReferenceArray, OooO00o3, OooO00o);
        OooO0O0(j);
        return true;
    }
}
