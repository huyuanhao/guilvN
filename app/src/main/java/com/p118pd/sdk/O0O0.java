package com.p118pd.sdk;

import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.O0O0 */
public final class O0O0 extends AbstractC9213oooo00OO {
    public final float[] OooO00o;
    public int o00oO0O;

    public O0O0(@NotNull float[] fArr) {
        o0O0OO00.OooO0o(fArr, "array");
        this.OooO00o = fArr;
    }

    @Override // com.p118pd.sdk.AbstractC9213oooo00OO, com.p118pd.sdk.AbstractC9213oooo00OO
    public float OooO00o() {
        try {
            float[] fArr = this.OooO00o;
            int i = this.o00oO0O;
            this.o00oO0O = i + 1;
            return fArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.o00oO0O--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public boolean hasNext() {
        return this.o00oO0O < this.OooO00o.length;
    }
}
