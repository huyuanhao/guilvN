package com.p118pd.sdk;

import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.O00ooooO */
public final class O00ooooO extends AbstractC9197oooOoo0o {
    public final char[] OooO00o;
    public int o00oO0O;

    public O00ooooO(@NotNull char[] cArr) {
        o0O0OO00.OooO0o(cArr, "array");
        this.OooO00o = cArr;
    }

    @Override // com.p118pd.sdk.AbstractC9197oooOoo0o, com.p118pd.sdk.AbstractC9197oooOoo0o
    public char OooO00o() {
        try {
            char[] cArr = this.OooO00o;
            int i = this.o00oO0O;
            this.o00oO0O = i + 1;
            return cArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.o00oO0O--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public boolean hasNext() {
        return this.o00oO0O < this.OooO00o.length;
    }
}
