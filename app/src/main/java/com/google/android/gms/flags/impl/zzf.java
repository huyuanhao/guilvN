package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import com.google.android.gms.internal.flags.zze;

public final class zzf extends zza<Long> {
    public static Long zza(SharedPreferences sharedPreferences, String str, Long l) {
        try {
            return (Long) zze.zza(new zzg(sharedPreferences, str, l));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                "Flag value not available, returning default: ".concat(valueOf);
            } else {
                new String("Flag value not available, returning default: ");
            }
            return l;
        }
    }
}
