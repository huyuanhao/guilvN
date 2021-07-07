package com.p118pd.sdk;

import com.drew.imaging.png.PngProcessingException;
import com.drew.lang.annotations.NotNull;
import java.io.IOException;

/* renamed from: com.pd.sdk.oOo00OOO  reason: case insensitive filesystem */
public class C8290oOo00OOO {
    public final int OooO00o;
    public final int OooO0O0;
    public final int OooO0OO;
    public final int OooO0Oo;
    public final int OooO0o;
    public final int OooO0o0;
    public final int OooO0oO;
    public final int OooO0oo;

    public C8290oOo00OOO(@NotNull byte[] bArr) throws PngProcessingException {
        if (bArr.length == 32) {
            C7916oO0o000 oo0o000 = new C7916oO0o000(bArr);
            try {
                this.OooO00o = oo0o000.m19622OooO0O0();
                this.OooO0O0 = oo0o000.m19622OooO0O0();
                this.OooO0OO = oo0o000.m19622OooO0O0();
                this.OooO0Oo = oo0o000.m19622OooO0O0();
                this.OooO0o0 = oo0o000.m19622OooO0O0();
                this.OooO0o = oo0o000.m19622OooO0O0();
                this.OooO0oO = oo0o000.m19622OooO0O0();
                this.OooO0oo = oo0o000.m19622OooO0O0();
            } catch (IOException e) {
                throw new PngProcessingException(e);
            }
        } else {
            throw new PngProcessingException("Invalid number of bytes");
        }
    }

    public int OooO00o() {
        return this.OooO0oO;
    }

    public int OooO0O0() {
        return this.OooO0oo;
    }

    public int OooO0OO() {
        return this.OooO0o0;
    }

    public int OooO0Oo() {
        return this.OooO0o;
    }

    public int OooO0o() {
        return this.OooO0Oo;
    }

    public int OooO0o0() {
        return this.OooO0OO;
    }

    public int OooO0oO() {
        return this.OooO00o;
    }

    public int OooO0oo() {
        return this.OooO0O0;
    }
}
