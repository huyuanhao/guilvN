package com.google.android.gms.internal.firebase_ml;

import androidx.annotation.WorkerThread;
import com.google.android.gms.auth.api.AuthProxy;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p027ml.common.FirebaseMLException;
import java.util.concurrent.TimeUnit;

public final class zzpp implements zznm<ResultType, zzpn>, zznw {
    public final zzpq zzawo;
    public final GoogleApiClient zzawp;
    public final /* synthetic */ zzpo zzawq;

    public zzpp(zzpo zzpo, FirebaseApp firebaseApp, boolean z) {
        this.zzawq = zzpo;
        if (z) {
            GoogleApiClient build = new GoogleApiClient.Builder(firebaseApp.getApplicationContext()).addApi(AuthProxy.API).build();
            this.zzawp = build;
            build.connect();
        } else {
            this.zzawp = null;
        }
        this.zzawo = zzpq.zza(firebaseApp, z, this.zzawp);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zznw
    public final void release() {
        GoogleApiClient googleApiClient = this.zzawp;
        if (googleApiClient != null) {
            googleApiClient.disconnect();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.android.gms.internal.firebase_ml.zznp] */
    @Override // com.google.android.gms.internal.firebase_ml.zznm
    @WorkerThread
    public final /* synthetic */ Object zza(zzpn zzpn) throws FirebaseMLException {
        zzpn zzpn2 = zzpn;
        return this.zzawq.zza(this.zzawo.zza(zzpn2), zzpn2.zzawl);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zznm
    public final zznw zzlm() {
        return this;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zznw
    @WorkerThread
    public final void zzlp() throws FirebaseMLException {
        GoogleApiClient googleApiClient = this.zzawp;
        if (googleApiClient != null && googleApiClient.blockingConnect(3, TimeUnit.SECONDS) != ConnectionResult.RESULT_SUCCESS) {
            throw new FirebaseMLException("Failed to contact Google Play services", 14);
        }
    }
}
