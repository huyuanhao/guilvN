package com.p118pd.sdk;

import p293rx.internal.util.SuppressAnimalSniffer;

@SuppressAnimalSniffer
/* renamed from: com.pd.sdk.LI1丨丨丨  reason: invalid class name and case insensitive filesystem */
public final class C5613LI1<E> extends AbstractC9363ILILi<E> {
    public C5613LI1(int i) {
        super(i);
    }

    @Override // com.p118pd.sdk.AbstractC9447IllI
    public boolean isEmpty() {
        return OooO0O0() == OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC9447IllI, java.util.Queue
    public boolean offer(E e) {
        if (e != null) {
            E[] eArr = ((AbstractC6724lil1) this).OooO00o;
            long j = this.OooOOo0;
            long OooO00o = OooO00o();
            long OooO00o2 = OooO00o(OooO00o);
            if (OooO0O0(eArr, OooO00o2) == null) {
                OooO0O0(eArr, OooO00o2, e);
                OooO00o(OooO00o + 1);
            } else if (OooO00o - OooO0O0() > j) {
                return false;
            } else {
                do {
                } while (OooO0O0(eArr, OooO00o2) != null);
            }
            OooO0O0(eArr, OooO00o2, e);
            OooO00o(OooO00o + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    @Override // com.p118pd.sdk.AbstractC9447IllI, java.util.Queue
    public E peek() {
        E OooO0O0;
        long OooO0OO = OooO0OO();
        do {
            long OooO0O02 = OooO0O0();
            if (OooO0O02 >= OooO0OO) {
                long OooO00o = OooO00o();
                if (OooO0O02 >= OooO00o) {
                    return null;
                }
                OooO0O0(OooO00o);
            }
            OooO0O0 = OooO0O0(OooO00o(OooO0O02));
        } while (OooO0O0 == null);
        return OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC9447IllI, java.util.Queue
    public E poll() {
        long OooO0O0;
        long OooO0OO = OooO0OO();
        do {
            OooO0O0 = OooO0O0();
            if (OooO0O0 >= OooO0OO) {
                long OooO00o = OooO00o();
                if (OooO0O0 >= OooO00o) {
                    return null;
                }
                OooO0O0(OooO00o);
            }
        } while (!OooO00o(OooO0O0, 1 + OooO0O0));
        long OooO00o2 = OooO00o(OooO0O0);
        E[] eArr = ((AbstractC6724lil1) this).OooO00o;
        E OooO00o3 = OooO00o(eArr, OooO00o2);
        OooO00o(eArr, OooO00o2, null);
        return OooO00o3;
    }

    @Override // com.p118pd.sdk.AbstractC9447IllI
    public int size() {
        long OooO0O0 = OooO0O0();
        while (true) {
            long OooO00o = OooO00o();
            long OooO0O02 = OooO0O0();
            if (OooO0O0 == OooO0O02) {
                return (int) (OooO00o - OooO0O02);
            }
            OooO0O0 = OooO0O02;
        }
    }
}
