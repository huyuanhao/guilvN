package com.google.android.gms.internal.firebase_ml;

import com.huawei.updatesdk.sdk.service.p076c.p077a.AbstractC1299b;

public abstract class zzkc {
    public static zzkc zza(char c) {
        return new zzke(AbstractC1299b.COMMA);
    }

    public static String zzc(char c) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public abstract boolean zzb(char c);

    public int zza(CharSequence charSequence, int i) {
        int length = charSequence.length();
        zzks.zza(i, length, "index");
        while (i < length) {
            if (zzb(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
