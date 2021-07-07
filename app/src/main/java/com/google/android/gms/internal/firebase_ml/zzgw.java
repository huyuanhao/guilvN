package com.google.android.gms.internal.firebase_ml;

import java.nio.charset.Charset;

public final class zzgw {
    public static String zzd(byte[] bArr) {
        Charset charset = zzgs.UTF_8;
        if (bArr == null) {
            return null;
        }
        return new String(bArr, charset);
    }
}
