package com.p118pd.sdk;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: com.pd.sdk.i1Il1LL丨  reason: invalid class name */
public final class i1Il1LL<E> extends AbstractC9842i<E> {
    public static final Integer OooO00o = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f17358OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AtomicLong f17359OooO00o = new AtomicLong();
    public final AtomicLong OooO0O0 = new AtomicLong();
    public final int o0ooOO0;

    public i1Il1LL(int i) {
        super(i);
        this.o0ooOO0 = Math.min(i / 4, OooO00o.intValue());
    }

    @Override // com.p118pd.sdk.AbstractC9842i
    private void OooO00o(long j) {
        this.OooO0O0.lazySet(j);
    }

    private void OooO0O0(long j) {
        this.f17359OooO00o.lazySet(j);
    }

    @Override // com.p118pd.sdk.AbstractC9842i
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    public boolean isEmpty() {
        return OooO0O0() == OooO00o();
    }

    @Override // java.util.AbstractCollection, com.p118pd.sdk.AbstractC9842i, java.util.Collection, java.lang.Iterable
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return super.iterator();
    }

    @Override // java.util.Queue
    public boolean offer(E e) {
        if (e != null) {
            AtomicReferenceArray<E> atomicReferenceArray = ((AbstractC9842i) this).OooO00o;
            int i = this.o00oO0O;
            long j = this.f17359OooO00o.get();
            int OooO00o2 = OooO00o(j, i);
            if (j >= this.f17358OooO00o) {
                long j2 = ((long) this.o0ooOO0) + j;
                if (OooO0O0(atomicReferenceArray, OooO00o(j2, i)) == null) {
                    this.f17358OooO00o = j2;
                } else if (OooO0O0(atomicReferenceArray, OooO00o2) != null) {
                    return false;
                }
            }
            OooO00o(atomicReferenceArray, OooO00o2, e);
            OooO0O0(j + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    @Override // java.util.Queue
    public E peek() {
        return OooO0O0(OooO00o(this.OooO0O0.get()));
    }

    @Override // java.util.Queue
    public E poll() {
        long j = this.OooO0O0.get();
        int OooO00o2 = OooO00o(j);
        AtomicReferenceArray<E> atomicReferenceArray = ((AbstractC9842i) this).OooO00o;
        E OooO0O02 = OooO0O0(atomicReferenceArray, OooO00o2);
        if (OooO0O02 == null) {
            return null;
        }
        OooO00o(atomicReferenceArray, OooO00o2, null);
        OooO00o(j + 1);
        return OooO0O02;
    }

    public int size() {
        long OooO00o2 = OooO00o();
        while (true) {
            long OooO0O02 = OooO0O0();
            long OooO00o3 = OooO00o();
            if (OooO00o2 == OooO00o3) {
                return (int) (OooO0O02 - OooO00o3);
            }
            OooO00o2 = OooO00o3;
        }
    }

    private long OooO00o() {
        return this.OooO0O0.get();
    }

    private long OooO0O0() {
        return this.f17359OooO00o.get();
    }
}
