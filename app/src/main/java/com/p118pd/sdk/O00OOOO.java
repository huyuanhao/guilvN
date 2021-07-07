package com.p118pd.sdk;

import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.O00OOOO */
public final class O00OOOO extends AbstractC9194oooOoo0 {
    public final boolean[] OooO00o;
    public int o00oO0O;

    public O00OOOO(@NotNull boolean[] zArr) {
        o0O0OO00.OooO0o(zArr, "array");
        this.OooO00o = zArr;
    }

    @Override // com.p118pd.sdk.AbstractC9194oooOoo0, com.p118pd.sdk.AbstractC9194oooOoo0
    public boolean OooO00o() {
        try {
            boolean[] zArr = this.OooO00o;
            int i = this.o00oO0O;
            this.o00oO0O = i + 1;
            return zArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.o00oO0O--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public boolean hasNext() {
        return this.o00oO0O < this.OooO00o.length;
    }
}
