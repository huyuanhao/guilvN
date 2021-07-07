package com.p118pd.sdk;

import com.drew.imaging.tiff.TiffProcessingException;
import com.drew.lang.Rational;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import java.io.IOException;
import java.util.Set;

/* renamed from: com.pd.sdk.oO0OOOo  reason: case insensitive filesystem */
public interface AbstractC7867oO0OOOo {
    @Nullable
    Long OooO00o(int i, int i2, long j);

    void OooO00o();

    void OooO00o(int i) throws TiffProcessingException;

    void OooO00o(int i, byte b);

    void OooO00o(int i, double d);

    void OooO00o(int i, float f);

    void OooO00o(int i, int i2);

    void OooO00o(int i, long j);

    void OooO00o(int i, @NotNull Rational rational);

    void OooO00o(int i, @NotNull C7927oO0o0OOo oo0o0ooo);

    void OooO00o(int i, short s);

    void OooO00o(int i, @NotNull byte[] bArr);

    void OooO00o(int i, @NotNull double[] dArr);

    void OooO00o(int i, @NotNull float[] fArr);

    void OooO00o(int i, @NotNull int[] iArr);

    void OooO00o(int i, @NotNull long[] jArr);

    void OooO00o(int i, @NotNull Rational[] rationalArr);

    void OooO00o(int i, @NotNull short[] sArr);

    void OooO00o(@NotNull String str);

    /* renamed from: OooO00o  reason: collision with other method in class */
    boolean m19560OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    boolean m19561OooO00o(int i);

    boolean OooO00o(int i, @NotNull Set<Integer> set, int i2, @NotNull AbstractC7911oO0Oooo oo0oooo, int i3, int i4) throws IOException;

    void OooO0O0(int i, int i2);

    void OooO0O0(int i, @NotNull byte[] bArr);

    void OooO0O0(int i, @NotNull int[] iArr);

    void OooO0O0(int i, @NotNull short[] sArr);

    void OooO0O0(@NotNull String str);

    void OooO0OO(int i, int i2);
}
