package com.p118pd.sdk;

import java.util.NoSuchElementException;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.SinceKotlin;

@SinceKotlin(version = "1.3")
@ExperimentalUnsignedTypes
/* renamed from: com.pd.sdk.OO00O0O */
public final class OO00O0O extends AbstractC9245ooooO0O {
    public boolean OooO0O0;
    public final int o00oO0O;
    public final int o0ooOO0;
    public int o0ooOOo;

    public OO00O0O(int i, int i2, int i3) {
        this.o00oO0O = i2;
        boolean z = true;
        int OooO00o = C9175oooOOooo.OooO00o(i, i2);
        if (i3 <= 0 ? OooO00o < 0 : OooO00o > 0) {
            z = false;
        }
        this.OooO0O0 = z;
        this.o0ooOO0 = UInt.m20934OooO0O0(i3);
        this.o0ooOOo = !this.OooO0O0 ? this.o00oO0O : i;
    }

    @Override // com.p118pd.sdk.AbstractC9245ooooO0O, com.p118pd.sdk.AbstractC9245ooooO0O
    public int OooO00o() {
        int i = this.o0ooOOo;
        if (i != this.o00oO0O) {
            this.o0ooOOo = UInt.m20934OooO0O0(this.o0ooOO0 + i);
        } else if (this.OooO0O0) {
            this.OooO0O0 = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    public boolean hasNext() {
        return this.OooO0O0;
    }

    public /* synthetic */ OO00O0O(int i, int i2, int i3, O0o0o o0o0o) {
        this(i, i2, i3);
    }
}
