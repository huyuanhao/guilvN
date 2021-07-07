package com.p118pd.sdk;

import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.O0O */
public final class O0O extends AbstractC9216oooo00o0 {
    public final double[] OooO00o;
    public int o00oO0O;

    public O0O(@NotNull double[] dArr) {
        o0O0OO00.OooO0o(dArr, "array");
        this.OooO00o = dArr;
    }

    @Override // com.p118pd.sdk.AbstractC9216oooo00o0, com.p118pd.sdk.AbstractC9216oooo00o0
    public double OooO00o() {
        try {
            double[] dArr = this.OooO00o;
            int i = this.o00oO0O;
            this.o00oO0O = i + 1;
            return dArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.o00oO0O--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public boolean hasNext() {
        return this.o00oO0O < this.OooO00o.length;
    }
}
