package com.p118pd.sdk;

import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.O0O000O */
public final class O0O000O extends AbstractC9241ooooO00 {
    public final short[] OooO00o;
    public int o00oO0O;

    public O0O000O(@NotNull short[] sArr) {
        o0O0OO00.OooO0o(sArr, "array");
        this.OooO00o = sArr;
    }

    @Override // com.p118pd.sdk.AbstractC9241ooooO00, com.p118pd.sdk.AbstractC9241ooooO00
    public short OooO00o() {
        try {
            short[] sArr = this.OooO00o;
            int i = this.o00oO0O;
            this.o00oO0O = i + 1;
            return sArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.o00oO0O--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public boolean hasNext() {
        return this.o00oO0O < this.OooO00o.length;
    }
}
