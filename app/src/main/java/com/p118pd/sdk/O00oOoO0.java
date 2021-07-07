package com.p118pd.sdk;

import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.O00oOoO0 */
public final class O00oOoO0 extends AbstractC9196oooOoo0O {
    public final byte[] OooO00o;
    public int o00oO0O;

    public O00oOoO0(@NotNull byte[] bArr) {
        o0O0OO00.OooO0o(bArr, "array");
        this.OooO00o = bArr;
    }

    public boolean hasNext() {
        return this.o00oO0O < this.OooO00o.length;
    }

    @Override // com.p118pd.sdk.AbstractC9196oooOoo0O
    public byte nextByte() {
        try {
            byte[] bArr = this.OooO00o;
            int i = this.o00oO0O;
            this.o00oO0O = i + 1;
            return bArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.o00oO0O--;
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
