package com.p118pd.sdk;

import java.util.NoSuchElementException;

/* renamed from: com.pd.sdk.oO000O00 */
public final class oO000O00 extends AbstractC9218oooo0O {
    public boolean OooO0O0;
    public final int o00oO0O;
    public int o0ooOO0;
    public final int o0ooOOo;

    public oO000O00(int i, int i2, int i3) {
        this.o0ooOOo = i3;
        this.o00oO0O = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.OooO0O0 = z;
        this.o0ooOO0 = !z ? this.o00oO0O : i;
    }

    @Override // com.p118pd.sdk.AbstractC9218oooo0O, com.p118pd.sdk.AbstractC9218oooo0O
    public int OooO00o() {
        int i = this.o0ooOO0;
        if (i != this.o00oO0O) {
            this.o0ooOO0 = this.o0ooOOo + i;
        } else if (this.OooO0O0) {
            this.OooO0O0 = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    public final int OooO0O0() {
        return this.o0ooOOo;
    }

    public boolean hasNext() {
        return this.OooO0O0;
    }
}
