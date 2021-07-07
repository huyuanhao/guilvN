package com.google.android.gms.flags.impl;

import android.content.SharedPreferences;
import com.google.android.gms.internal.flags.zze;

public final class zzd extends zza<Integer> {
    public static Integer zza(SharedPreferences sharedPreferences, String str, Integer num) {
        try {
            return (Integer) zze.zza(new zze(sharedPreferences, str, num));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                "Flag value not available, returning default: ".concat(valueOf);
            } else {
                new String("Flag value not available, returning default: ");
            }
            return num;
        }
    }
}
