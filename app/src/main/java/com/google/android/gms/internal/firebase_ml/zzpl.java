package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.internal.firebase_ml.zzmd;
import java.util.List;

public final /* synthetic */ class zzpl implements zznv {
    public final long zzatf;
    public final zzpk zzawd;
    public final zzmk zzawe;
    public final zzpz zzawf;
    public final List zzawg;

    public zzpl(zzpk zzpk, long j, zzmk zzmk, zzpz zzpz, List list) {
        this.zzawd = zzpk;
        this.zzatf = j;
        this.zzawe = zzmk;
        this.zzawf = zzpz;
        this.zzawg = list;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zznv
    public final zzmd.zzq.zza zzm() {
        return this.zzawd.zza(this.zzatf, this.zzawe, this.zzawf, this.zzawg);
    }
}
