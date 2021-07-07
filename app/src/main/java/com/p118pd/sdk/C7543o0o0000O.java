package com.p118pd.sdk;

import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.o0o0000O  reason: case insensitive filesystem */
public final class C7543o0o0000O extends AbstractC9223oooo0OO {
    public final long[] OooO00o;
    public int o00oO0O;

    public C7543o0o0000O(@NotNull long[] jArr) {
        o0O0OO00.OooO0o(jArr, "array");
        this.OooO00o = jArr;
    }

    @Override // com.p118pd.sdk.AbstractC9223oooo0OO, com.p118pd.sdk.AbstractC9223oooo0OO
    public long OooO00o() {
        try {
            long[] jArr = this.OooO00o;
            int i = this.o00oO0O;
            this.o00oO0O = i + 1;
            return jArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.o00oO0O--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public boolean hasNext() {
        return this.o00oO0O < this.OooO00o.length;
    }
}
