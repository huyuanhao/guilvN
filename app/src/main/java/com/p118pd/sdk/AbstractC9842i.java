package com.p118pd.sdk;

import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: com.pd.sdk.丨丨i丨  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC9842i<E> extends AbstractQueue<E> {
    public final AtomicReferenceArray<E> OooO00o;
    public final int o00oO0O;

    public AbstractC9842i(int i) {
        int OooO00o2 = LLIIL1I.OooO00o(i);
        this.o00oO0O = OooO00o2 - 1;
        this.OooO00o = new AtomicReferenceArray<>(OooO00o2);
    }

    public final int OooO00o(long j) {
        return this.o00oO0O & ((int) j);
    }

    public final int OooO00o(long j, int i) {
        return ((int) j) & i;
    }

    public final E OooO0O0(AtomicReferenceArray<E> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    public final void OooO0OO(AtomicReferenceArray<E> atomicReferenceArray, int i, E e) {
        atomicReferenceArray.set(i, e);
    }

    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    public final E OooO00o(AtomicReferenceArray<E> atomicReferenceArray, int i) {
        return atomicReferenceArray.get(i);
    }

    public final void OooO0O0(AtomicReferenceArray<E> atomicReferenceArray, int i, E e) {
        atomicReferenceArray.lazySet(i, e);
    }

    public final E OooO00o(int i) {
        return this.OooO00o.get(i);
    }

    public final void OooO0O0(int i, E e) {
        this.OooO00o.lazySet(i, e);
    }

    public final void OooO00o(AtomicReferenceArray<E> atomicReferenceArray, int i, E e) {
        atomicReferenceArray.lazySet(i, e);
    }

    public final E OooO0O0(int i) {
        return OooO0O0(this.OooO00o, i);
    }

    public final void OooO00o(int i, E e) {
        this.OooO00o.lazySet(i, e);
    }
}
