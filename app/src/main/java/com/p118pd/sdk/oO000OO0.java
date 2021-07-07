package com.p118pd.sdk;

import java.util.NoSuchElementException;

/* renamed from: com.pd.sdk.oO000OO0 */
public final class oO000OO0 extends AbstractC9223oooo0OO {
    public final long OooO00o;
    public long OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f20820OooO0O0;
    public final long OooO0OO;

    public oO000OO0(long j, long j2, long j3) {
        this.OooO0OO = j3;
        this.OooO00o = j2;
        boolean z = true;
        int i = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
        int i2 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        if (i <= 0 ? i2 < 0 : i2 > 0) {
            z = false;
        }
        this.f20820OooO0O0 = z;
        this.OooO0O0 = !z ? this.OooO00o : j;
    }

    @Override // com.p118pd.sdk.AbstractC9223oooo0OO, com.p118pd.sdk.AbstractC9223oooo0OO
    public long OooO00o() {
        long j = this.OooO0O0;
        if (j != this.OooO00o) {
            this.OooO0O0 = this.OooO0OO + j;
        } else if (this.f20820OooO0O0) {
            this.f20820OooO0O0 = false;
        } else {
            throw new NoSuchElementException();
        }
        return j;
    }

    public final long OooO0O0() {
        return this.OooO0OO;
    }

    public boolean hasNext() {
        return this.f20820OooO0O0;
    }
}
