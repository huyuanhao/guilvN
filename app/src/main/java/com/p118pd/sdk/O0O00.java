package com.p118pd.sdk;

import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.O0O00 */
public final class O0O00 extends AbstractC9218oooo0O {
    public final int[] OooO00o;
    public int o00oO0O;

    public O0O00(@NotNull int[] iArr) {
        o0O0OO00.OooO0o(iArr, "array");
        this.OooO00o = iArr;
    }

    @Override // com.p118pd.sdk.AbstractC9218oooo0O, com.p118pd.sdk.AbstractC9218oooo0O
    public int OooO00o() {
        try {
            int[] iArr = this.OooO00o;
            int i = this.o00oO0O;
            this.o00oO0O = i + 1;
            return iArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.o00oO0O--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public boolean hasNext() {
        return this.o00oO0O < this.OooO00o.length;
    }
}
