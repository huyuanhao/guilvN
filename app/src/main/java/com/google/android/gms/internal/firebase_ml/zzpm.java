package com.google.android.gms.internal.firebase_ml;

import android.graphics.Rect;
import androidx.annotation.Nullable;

public final class zzpm {
    public static float zza(@Nullable Float f) {
        if (f == null) {
            return 0.0f;
        }
        return f.floatValue();
    }

    public static int zzb(@Nullable Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Nullable
    public static String zzbl(int i) {
        if (i == 1) {
            return "builtin/stable";
        }
        if (i != 2) {
            return null;
        }
        return "builtin/latest";
    }

    public static String zzch(@Nullable String str) {
        return str == null ? "" : str;
    }

    @Nullable
    public static Rect zza(@Nullable zziv zziv, float f) {
        if (zziv == null || zziv.zzhs() == null || zziv.zzhs().size() != 4) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MAX_VALUE;
        for (zzju zzju : zziv.zzhs()) {
            i3 = Math.min(zzb(zzju.zzib()), i3);
            i4 = Math.min(zzb(zzju.zzic()), i4);
            i = Math.max(zzb(zzju.zzib()), i);
            i2 = Math.max(zzb(zzju.zzic()), i2);
        }
        return new Rect(Math.round(((float) i3) * f), Math.round(((float) i4) * f), Math.round(((float) i) * f), Math.round(((float) i2) * f));
    }
}
