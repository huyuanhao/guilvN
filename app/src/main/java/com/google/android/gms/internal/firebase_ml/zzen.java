package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;

public final class zzen implements zzfn {
    public final /* synthetic */ zzfn zztf;
    public final /* synthetic */ zzfh zztg;
    public final /* synthetic */ zzem zzth;

    public zzen(zzem zzem, zzfn zzfn, zzfh zzfh) {
        this.zzth = zzem;
        this.zztf = zzfn;
        this.zztg = zzfh;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzfn
    public final void zzb(zzfk zzfk) throws IOException {
        zzfn zzfn = this.zztf;
        if (zzfn != null) {
            zzfn.zzb(zzfk);
        }
        if (!zzfk.zzfk() && this.zztg.zzfi()) {
            throw this.zzth.zza(zzfk);
        }
    }
}
