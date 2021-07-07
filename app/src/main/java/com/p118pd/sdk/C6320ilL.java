package com.p118pd.sdk;

import p293rx.internal.util.SuppressAnimalSniffer;

@SuppressAnimalSniffer
/* renamed from: com.pd.sdk.ilL丨  reason: invalid class name and case insensitive filesystem */
public class C6320ilL<E> extends LlIil1l<E> {
    public long OoooOoO;
    public long OoooOoo;
    public long Ooooo00;
    public long Ooooo0o;
    public long OooooO0;
    public long OooooOO;
    public long OooooOo;
    public long Oooooo;
    public long Oooooo0;
    public long OoooooO;
    public long Ooooooo;
    public long o00O0O;
    public long o00Oo0;
    public long o0OoOo0;
    public long ooOO;

    public C6320ilL(int i) {
        super(Math.max(2, i));
    }

    @Override // com.p118pd.sdk.AbstractC9447IllI
    public boolean isEmpty() {
        return OooO0O0() == OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC9447IllI, java.util.Queue
    public boolean offer(E e) {
        if (e != null) {
            long j = this.OooOOo0 + 1;
            long[] jArr = ((AbstractC6136iII) this).OooO00o;
            long j2 = Long.MAX_VALUE;
            while (true) {
                long OooO00o = OooO00o();
                long OooO0O0 = OooO0O0(OooO00o);
                long OooO00o2 = OooO00o(jArr, OooO0O0) - OooO00o;
                if (OooO00o2 == 0) {
                    long j3 = OooO00o + 1;
                    if (OooO00o(OooO00o, j3)) {
                        OooO0O0(OooO00o(OooO00o), e);
                        OooO00o(jArr, OooO0O0, j3);
                        return true;
                    }
                } else if (OooO00o2 < 0) {
                    long j4 = OooO00o - j;
                    if (j4 <= j2) {
                        j2 = OooO0O0();
                        if (j4 <= j2) {
                            return false;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        } else {
            throw new NullPointerException("Null is not a valid element");
        }
    }

    @Override // com.p118pd.sdk.AbstractC9447IllI, java.util.Queue
    public E peek() {
        long OooO0O0;
        E OooO00o;
        do {
            OooO0O0 = OooO0O0();
            OooO00o = m17821OooO00o(OooO00o(OooO0O0));
            if (OooO00o != null) {
                break;
            }
        } while (OooO0O0 != OooO00o());
        return OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC9447IllI, java.util.Queue
    public E poll() {
        long[] jArr = ((AbstractC6136iII) this).OooO00o;
        long j = -1;
        while (true) {
            long OooO0O0 = OooO0O0();
            long OooO0O02 = OooO0O0(OooO0O0);
            long j2 = OooO0O0 + 1;
            long OooO00o = OooO00o(jArr, OooO0O02) - j2;
            if (OooO00o == 0) {
                if (OooO0O0(OooO0O0, j2)) {
                    long OooO00o2 = OooO00o(OooO0O0);
                    E OooO00o3 = m17821OooO00o(OooO00o2);
                    OooO0O0(OooO00o2, (Object) null);
                    OooO00o(jArr, OooO0O02, OooO0O0 + this.OooOOo0 + 1);
                    return OooO00o3;
                }
            } else if (OooO00o < 0 && OooO0O0 >= j) {
                j = OooO00o();
                if (OooO0O0 == j) {
                    return null;
                }
            }
        }
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
