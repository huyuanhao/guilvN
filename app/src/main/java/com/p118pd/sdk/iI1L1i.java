package com.p118pd.sdk;

import p293rx.internal.util.SuppressAnimalSniffer;

@SuppressAnimalSniffer
/* renamed from: com.pd.sdk.iI丨丨1L1i  reason: invalid class name */
public final class iI1L1i<E> extends AbstractC6081iIIL<E> {
    public iI1L1i(int i) {
        super(i);
    }

    @Override // com.p118pd.sdk.AbstractC6724lil1, com.p118pd.sdk.AbstractC6724lil1
    private void OooO00o(long j) {
        C11LI1.OooO00o.putOrderedLong(this, AbstractC9662l1l.OoooOo0, j);
    }

    @Override // com.p118pd.sdk.AbstractC6724lil1
    private void OooO0O0(long j) {
        C11LI1.OooO00o.putOrderedLong(this, AbstractC9618iiLI1.Oooo0, j);
    }

    @Override // com.p118pd.sdk.AbstractC9447IllI
    public boolean isEmpty() {
        return OooO0O0() == OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC9447IllI, java.util.Queue
    public boolean offer(E e) {
        if (e != null) {
            E[] eArr = ((AbstractC6724lil1) this).OooO00o;
            long j = this.producerIndex;
            long OooO00o = OooO00o(j);
            if (OooO0O0(eArr, OooO00o) != null) {
                return false;
            }
            OooO00o(eArr, OooO00o, e);
            OooO0O0(j + 1);
            return true;
        }
        throw new NullPointerException("null elements not allowed");
    }

    @Override // com.p118pd.sdk.AbstractC9447IllI, java.util.Queue
    public E peek() {
        return OooO0O0(OooO00o(this.consumerIndex));
    }

    @Override // com.p118pd.sdk.AbstractC9447IllI, java.util.Queue
    public E poll() {
        long j = this.consumerIndex;
        long OooO00o = OooO00o(j);
        E[] eArr = ((AbstractC6724lil1) this).OooO00o;
        E OooO0O0 = OooO0O0(eArr, OooO00o);
        if (OooO0O0 == null) {
            return null;
        }
        OooO00o(eArr, OooO00o, null);
        OooO00o(j + 1);
        return OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC9447IllI
    public int size() {
        long OooO00o = OooO00o();
        while (true) {
            long OooO0O0 = OooO0O0();
            long OooO00o2 = OooO00o();
            if (OooO00o == OooO00o2) {
                return (int) (OooO0O0 - OooO00o2);
            }
            OooO00o = OooO00o2;
        }
    }

    private long OooO00o() {
        return C11LI1.OooO00o.getLongVolatile(this, AbstractC9662l1l.OoooOo0);
    }

    private long OooO0O0() {
        return C11LI1.OooO00o.getLongVolatile(this, AbstractC9618iiLI1.Oooo0);
    }
}
