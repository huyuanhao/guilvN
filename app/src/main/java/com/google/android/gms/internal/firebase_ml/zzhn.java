package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;

public final class zzhn {
    /* JADX INFO: finally extract failed */
    public static long zzb(zzhy zzhy) throws IOException {
        zzha zzha = new zzha();
        try {
            zzhy.writeTo(zzha);
            zzha.close();
            return zzha.zzyj;
        } catch (Throwable th) {
            zzha.close();
            throw th;
        }
    }
}
