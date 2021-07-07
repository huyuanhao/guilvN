package com.google.android.gms.phenotype;

import com.google.android.gms.phenotype.PhenotypeFlag;

public final /* synthetic */ class zzq implements PhenotypeFlag.zza {
    public final String zzav;
    public final boolean zzaw = false;

    public zzq(String str, boolean z) {
        this.zzav = str;
    }

    @Override // com.google.android.gms.phenotype.PhenotypeFlag.zza
    public final Object zzh() {
        return PhenotypeFlag.zzb(this.zzav, this.zzaw);
    }
}
