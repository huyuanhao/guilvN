package com.google.android.gms.internal.firebase_ml;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import java.io.IOException;

public final class zzps extends zzip {
    public final /* synthetic */ FirebaseApp zzawx;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzps(zzpq zzpq, String str, FirebaseApp firebaseApp) {
        super(str);
        this.zzawx = firebaseApp;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzip
    public final void zza(zzio<?> zzio) throws IOException {
        super.zza(zzio);
        Context applicationContext = this.zzawx.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        zzio.zzeo().put("X-Android-Package", packageName);
        zzio.zzeo().put("X-Android-Cert", zzpq.zza(applicationContext, packageName));
    }
}
