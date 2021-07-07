package com.google.android.gms.internal.clearcut;

import android.content.SharedPreferences;

public final class zzak extends zzae<String> {
    public zzak(zzao zzao, String str, String str2) {
        super(zzao, str, str2, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: zzc */
    public final String zza(SharedPreferences sharedPreferences) {
        try {
            return sharedPreferences.getString(this.zzds, null);
        } catch (ClassCastException unused) {
            String valueOf = String.valueOf(this.zzds);
            if (valueOf.length() != 0) {
                "Invalid string value in SharedPreferences for ".concat(valueOf);
            } else {
                new String("Invalid string value in SharedPreferences for ");
            }
            return null;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.clearcut.zzae
    public final /* synthetic */ String zzb(String str) {
        return str;
    }
}
