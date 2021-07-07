package com.p118pd.sdk;

import java.util.Iterator;
import p293rx.internal.util.SuppressAnimalSniffer;

@SuppressAnimalSniffer
/* renamed from: com.pd.sdk.丨Lli  reason: invalid class name and case insensitive filesystem */
public class C9531Lli<E> extends AbstractC9625il1L<E> implements AbstractC5656LLIl1l {
    public static final Object OooO00o = new Object();
    public static final long OooOOo;
    public static final long OooOOo0;
    public static final long OooOOoo = ((long) C11LI1.OooO00o.arrayBaseOffset(Object[].class));
    public static final int o0ooOO0 = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    public static final int o0ooOOo;

    static {
        int arrayIndexScale = C11LI1.OooO00o.arrayIndexScale(Object[].class);
        if (4 == arrayIndexScale) {
            o0ooOOo = 2;
        } else if (8 == arrayIndexScale) {
            o0ooOOo = 3;
        } else {
            throw new IllegalStateException("Unknown pointer size");
        }
        try {
            OooOOo0 = C11LI1.OooO00o.objectFieldOffset(Lii1i1i.class.getDeclaredField("producerIndex"));
            try {
                OooOOo = C11LI1.OooO00o.objectFieldOffset(AbstractC9625il1L.class.getDeclaredField("consumerIndex"));
            } catch (NoSuchFieldException e) {
                InternalError internalError = new InternalError();
                internalError.initCause(e);
                throw internalError;
            }
        } catch (NoSuchFieldException e2) {
            InternalError internalError2 = new InternalError();
            internalError2.initCause(e2);
            throw internalError2;
        }
    }

    public C9531Lli(int i) {
        int OooO00o2 = LLIIL1I.OooO00o(i);
        long j = (long) (OooO00o2 - 1);
        E[] eArr = (E[]) new Object[(OooO00o2 + 1)];
        ((AbstractC5584L1LI) this).f16187OooO00o = eArr;
        ((AbstractC5584L1LI) this).OooO0O0 = j;
        OooO00o(OooO00o2);
        ((LiLIL) this).OooO0O0 = eArr;
        this.OooOOOo = j;
        ((AbstractC5584L1LI) this).OooO00o = j - 1;
        OooO0O0(0);
    }

    private boolean OooO00o(E[] eArr, E e, long j, long j2) {
        OooO00o(eArr, j2, e);
        OooO0O0(j + 1);
        return true;
    }

    private E OooO0O0(E[] eArr, long j, long j2) {
        ((LiLIL) this).OooO0O0 = eArr;
        long OooO00o2 = OooO00o(j, j2);
        E e = (E) OooO00o(eArr, OooO00o2);
        if (e == null) {
            return null;
        }
        OooO00o(eArr, OooO00o2, (Object) null);
        m21589OooO00o(j + 1);
        return e;
    }

    private long OooO0OO() {
        return C11LI1.OooO00o.getLongVolatile(this, OooOOo);
    }

    private long OooO0Oo() {
        return C11LI1.OooO00o.getLongVolatile(this, OooOOo0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Queue
    public final boolean offer(E e) {
        if (e != null) {
            E[] eArr = ((AbstractC5584L1LI) this).f16187OooO00o;
            long j = this.producerIndex;
            long j2 = ((AbstractC5584L1LI) this).OooO0O0;
            long OooO00o2 = OooO00o(j, j2);
            if (j < ((AbstractC5584L1LI) this).OooO00o) {
                return OooO00o(eArr, e, j, OooO00o2);
            }
            long j3 = ((long) this.o00oO0O) + j;
            if (OooO00o(eArr, OooO00o(j3, j2)) == null) {
                ((AbstractC5584L1LI) this).OooO00o = j3 - 1;
                return OooO00o(eArr, e, j, OooO00o2);
            } else if (OooO00o(eArr, OooO00o(1 + j, j2)) != null) {
                return OooO00o(eArr, e, j, OooO00o2);
            } else {
                OooO00o(eArr, j, OooO00o2, e, j2);
                return true;
            }
        } else {
            throw new NullPointerException("Null is not a valid element");
        }
    }

    @Override // java.util.Queue
    public final E peek() {
        E[] eArr = ((LiLIL) this).OooO0O0;
        long j = this.consumerIndex;
        long j2 = this.OooOOOo;
        E e = (E) OooO00o(eArr, OooO00o(j, j2));
        return e == OooO00o ? OooO00o(OooO00o(eArr), j, j2) : e;
    }

    @Override // java.util.Queue
    public final E poll() {
        E[] eArr = ((LiLIL) this).OooO0O0;
        long j = this.consumerIndex;
        long j2 = this.OooOOOo;
        long OooO00o2 = OooO00o(j, j2);
        E e = (E) OooO00o(eArr, OooO00o2);
        boolean z = e == OooO00o;
        if (e != null && !z) {
            OooO00o(eArr, OooO00o2, (Object) null);
            m21589OooO00o(j + 1);
            return e;
        } else if (z) {
            return OooO0O0(OooO00o(eArr), j, j2);
        } else {
            return null;
        }
    }

    public final int size() {
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

    private void OooO00o(E[] eArr, long j, long j2, E e, long j3) {
        E[] eArr2 = (E[]) new Object[eArr.length];
        ((AbstractC5584L1LI) this).f16187OooO00o = eArr2;
        ((AbstractC5584L1LI) this).OooO00o = (j3 + j) - 1;
        OooO00o(eArr2, j2, e);
        OooO00o(eArr, eArr2);
        OooO00o(eArr, j2, OooO00o);
        OooO0O0(j + 1);
    }

    private void OooO0O0(long j) {
        C11LI1.OooO00o.putOrderedLong(this, OooOOo0, j);
    }

    @Override // com.p118pd.sdk.AbstractC5656LLIl1l
    public long OooO0O0() {
        return OooO0OO();
    }

    private void OooO00o(E[] eArr, E[] eArr2) {
        OooO00o(eArr, OooO00o((long) (eArr.length - 1)), eArr2);
    }

    private E[] OooO00o(E[] eArr) {
        return (E[]) ((Object[]) OooO00o(eArr, OooO00o((long) (eArr.length - 1))));
    }

    private E OooO00o(E[] eArr, long j, long j2) {
        ((LiLIL) this).OooO0O0 = eArr;
        return (E) OooO00o(eArr, OooO00o(j, j2));
    }

    private void OooO00o(int i) {
        this.o00oO0O = Math.min(i / 4, o0ooOO0);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m21589OooO00o(long j) {
        C11LI1.OooO00o.putOrderedLong(this, OooOOo, j);
    }

    public static long OooO00o(long j, long j2) {
        return OooO00o(j & j2);
    }

    public static long OooO00o(long j) {
        return OooOOoo + (j << o0ooOOo);
    }

    public static void OooO00o(Object[] objArr, long j, Object obj) {
        C11LI1.OooO00o.putOrderedObject(objArr, j, obj);
    }

    public static <E> Object OooO00o(E[] eArr, long j) {
        return C11LI1.OooO00o.getObjectVolatile(eArr, j);
    }

    @Override // com.p118pd.sdk.AbstractC5656LLIl1l
    public long OooO00o() {
        return OooO0Oo();
    }
}
