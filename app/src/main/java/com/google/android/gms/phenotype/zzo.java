package com.google.android.gms.phenotype;

import com.google.android.gms.phenotype.PhenotypeFlag;

public final /* synthetic */ class zzo implements PhenotypeFlag.zza {
    public final PhenotypeFlag zzat;
    public final zza zzau;

    public zzo(PhenotypeFlag phenotypeFlag, zza zza) {
        this.zzat = phenotypeFlag;
        this.zzau = zza;
    }

    @Override // com.google.android.gms.phenotype.PhenotypeFlag.zza
    public final Object zzh() {
        return this.zzau.zza().get(this.zzat.zzap);
    }
}
