package com.p118pd.sdk;

import java.util.NoSuchElementException;

/* renamed from: com.pd.sdk.OO00000 */
public final class OO00000 extends AbstractC9197oooOoo0o {
    public boolean OooO0O0;
    public final int o00oO0O;
    public int o0ooOO0;
    public final int o0ooOOo;

    public OO00000(char c, char c2, int i) {
        this.o0ooOOo = i;
        this.o00oO0O = c2;
        boolean z = true;
        if (i <= 0 ? c < c2 : c > c2) {
            z = false;
        }
        this.OooO0O0 = z;
        this.o0ooOO0 = (!z ? this.o00oO0O : c) == 1 ? 1 : 0;
    }

    @Override // com.p118pd.sdk.AbstractC9197oooOoo0o, com.p118pd.sdk.AbstractC9197oooOoo0o
    /* renamed from: OooO00o  reason: collision with other method in class */
    public final int m16539OooO00o() {
        return this.o0ooOOo;
    }

    public boolean hasNext() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC9197oooOoo0o, com.p118pd.sdk.AbstractC9197oooOoo0o
    public char OooO00o() {
        int i = this.o0ooOO0;
        if (i != this.o00oO0O) {
            this.o0ooOO0 = this.o0ooOOo + i;
        } else if (this.OooO0O0) {
            this.OooO0O0 = false;
        } else {
            throw new NoSuchElementException();
        }
        return (char) i;
    }
}
