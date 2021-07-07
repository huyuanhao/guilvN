package com.google.android.gms.phenotype;

import android.content.SharedPreferences;
import com.google.android.gms.phenotype.PhenotypeFlag;

public final class zzs extends PhenotypeFlag<String> {
    public zzs(PhenotypeFlag.Factory factory, String str, String str2) {
        super(factory, str, str2, null);
    }

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final String zza(SharedPreferences sharedPreferences) {
        try {
            return sharedPreferences.getString(this.zzap, null);
        } catch (ClassCastException unused) {
            String valueOf = String.valueOf(this.zzap);
            if (valueOf.length() != 0) {
                "Invalid string value in SharedPreferences for ".concat(valueOf);
            } else {
                new String("Invalid string value in SharedPreferences for ");
            }
            return null;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.phenotype.PhenotypeFlag
    public final /* synthetic */ String zza(String str) {
        return str;
    }
}
