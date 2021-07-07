package com.p118pd.sdk;

/* renamed from: com.pd.sdk.l1I  reason: case insensitive filesystem */
public class C6440l1I {
    public static final long OooO0OO = 281474976710655L;
    public static final long OooO0Oo = 64;
    public long OooO00o = -1;
    public long OooO0O0 = 0;

    public void OooO00o() {
        this.OooO00o = -1;
        this.OooO0O0 = 0;
    }

    public void OooO00o(long j) {
        if ((OooO0OO & j) == j) {
            long j2 = this.OooO00o;
            if (j <= j2) {
                long j3 = j2 - j;
                if (j3 < 64) {
                    this.OooO0O0 |= 1 << ((int) j3);
                    return;
                }
                return;
            }
            long j4 = j - j2;
            if (j4 >= 64) {
                this.OooO0O0 = 1;
            } else {
                long j5 = this.OooO0O0 << ((int) j4);
                this.OooO0O0 = j5;
                this.OooO0O0 = j5 | 1;
            }
            this.OooO00o = j;
            return;
        }
        throw new IllegalArgumentException("'seq' out of range");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17557OooO00o(long j) {
        if ((OooO0OO & j) != j) {
            return true;
        }
        long j2 = this.OooO00o;
        if (j > j2) {
            return false;
        }
        long j3 = j2 - j;
        return j3 >= 64 || (this.OooO0O0 & (1 << ((int) j3))) != 0;
    }
}
