package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;

/* renamed from: com.pd.sdk.oO0Oo0O  reason: case insensitive filesystem */
public class C7887oO0Oo0O {
    public static int OooO00o(@NotNull byte[] bArr) {
        return (bArr[3] & 255) | ((bArr[0] << 24) & -16777216) | ((bArr[1] << 16) & C7265o0O000oo.OooOo0O) | ((bArr[2] << 8) & 65280);
    }

    public static int OooO0O0(@NotNull byte[] bArr) {
        return ((bArr[3] << 24) & -16777216) | (bArr[0] & 255) | ((bArr[1] << 8) & 65280) | ((bArr[2] << 16) & C7265o0O000oo.OooOo0O);
    }
}
