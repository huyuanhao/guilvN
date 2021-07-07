package com.p118pd.sdk;

import com.drew.imaging.png.PngColorType;
import com.drew.imaging.png.PngProcessingException;
import com.drew.lang.annotations.NotNull;
import java.io.IOException;

/* renamed from: com.pd.sdk.ooo0o  reason: case insensitive filesystem */
public class C9101ooo0o {
    public byte OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f22459OooO00o;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public PngColorType f22460OooO00o;
    public byte OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int f22461OooO0O0;
    public byte OooO0OO;
    public byte OooO0Oo;

    public C9101ooo0o(@NotNull byte[] bArr) throws PngProcessingException {
        if (bArr.length == 13) {
            C7916oO0o000 oo0o000 = new C7916oO0o000(bArr);
            try {
                this.f22459OooO00o = oo0o000.m19622OooO0O0();
                this.f22461OooO0O0 = oo0o000.m19622OooO0O0();
                this.OooO00o = oo0o000.OooO0O0();
                byte OooO0O02 = oo0o000.OooO0O0();
                PngColorType fromNumericValue = PngColorType.fromNumericValue(OooO0O02);
                if (fromNumericValue != null) {
                    this.f22460OooO00o = fromNumericValue;
                    this.OooO0O0 = oo0o000.OooO0O0();
                    this.OooO0OO = oo0o000.OooO0O0();
                    this.OooO0Oo = oo0o000.OooO0O0();
                    return;
                }
                throw new PngProcessingException("Unexpected PNG color type: " + ((int) OooO0O02));
            } catch (IOException e) {
                throw new PngProcessingException(e);
            }
        } else {
            throw new PngProcessingException("PNG header chunk must have 13 data bytes");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m20768OooO00o() {
        return this.f22461OooO0O0;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public int m20770OooO0O0() {
        return this.f22459OooO00o;
    }

    public byte OooO0OO() {
        return this.OooO0OO;
    }

    public byte OooO0Oo() {
        return this.OooO0Oo;
    }

    public byte OooO00o() {
        return this.OooO00o;
    }

    public byte OooO0O0() {
        return this.OooO0O0;
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public PngColorType m20769OooO00o() {
        return this.f22460OooO00o;
    }
}
