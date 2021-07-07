package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;

public final class zzik extends zzer {
    static {
        boolean z = zzeh.zzsg.intValue() == 1 && zzeh.zzsh.intValue() >= 15;
        Object[] objArr = {zzeh.VERSION};
        if (!z) {
            throw new IllegalStateException(zzla.zzb("You are currently running with version %s of google-api-client. You need at least version 1.15 of google-api-client to run version 1.25.0-SNAPSHOT of the Cloud Vision API library.", objArr));
        }
    }

    public zzik(zzil zzil) {
        super(zzil);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzel
    public final void zza(zzem<?> zzem) throws IOException {
        super.zza(zzem);
    }
}
