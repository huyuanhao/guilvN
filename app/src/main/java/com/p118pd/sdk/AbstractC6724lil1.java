package com.p118pd.sdk;

import java.util.Iterator;
import p293rx.internal.util.SuppressAnimalSniffer;

@SuppressAnimalSniffer
/* renamed from: com.pd.sdk.li丨丨l丨1  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC6724lil1<E> extends ilIilI1i<E> {
    public static final long OooOOo = ((long) (C11LI1.OooO00o.arrayBaseOffset(Object[].class) + (32 << (o0ooOOo - o00oO0O))));
    public static final int o00oO0O = Integer.getInteger("sparse.shift", 0).intValue();
    public static final int o0ooOO0 = 32;
    public static final int o0ooOOo;
    public final E[] OooO00o;
    public final long OooOOo0;

    static {
        int arrayIndexScale = C11LI1.OooO00o.arrayIndexScale(Object[].class);
        if (4 == arrayIndexScale) {
            o0ooOOo = o00oO0O + 2;
        } else if (8 == arrayIndexScale) {
            o0ooOOo = o00oO0O + 3;
        } else {
            throw new IllegalStateException("Unknown pointer size");
        }
    }

    public AbstractC6724lil1(int i) {
        int OooO00o2 = LLIIL1I.OooO00o(i);
        this.OooOOo0 = (long) (OooO00o2 - 1);
        this.OooO00o = (E[]) new Object[((OooO00o2 << o00oO0O) + 64)];
    }

    public final long OooO00o(long j) {
        return OooO00o(j, this.OooOOo0);
    }

    public final void OooO0O0(long j, E e) {
        OooO0O0(this.OooO00o, j, e);
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

    public final long OooO00o(long j, long j2) {
        return OooOOo + ((j & j2) << o0ooOOo);
    }

    public final void OooO0O0(E[] eArr, long j, E e) {
        C11LI1.OooO00o.putObject(eArr, j, e);
    }

    public final void OooO00o(long j, E e) {
        OooO00o(this.OooO00o, j, e);
    }

    public final E OooO0O0(long j) {
        return OooO0O0(this.OooO00o, j);
    }

    public final void OooO00o(E[] eArr, long j, E e) {
        C11LI1.OooO00o.putOrderedObject(eArr, j, e);
    }

    public final E OooO0O0(E[] eArr, long j) {
        return (E) C11LI1.OooO00o.getObjectVolatile(eArr, j);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final E m17821OooO00o(long j) {
        return OooO00o(this.OooO00o, j);
    }

    public final E OooO00o(E[] eArr, long j) {
        return (E) C11LI1.OooO00o.getObject(eArr, j);
    }
}
