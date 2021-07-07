package com.google.android.gms.internal.firebase_ml;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.internal.firebase_ml.zzmd;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p027ml.common.modeldownload.FirebaseRemoteModel;

public final class zzon {
    public static final GmsLogger zzaoz = new GmsLogger("ModelDownloadLogger", "");
    public final FirebaseApp zzapo;
    public final zznu zzaqs;
    public final FirebaseRemoteModel zzaqt;

    public zzon(@NonNull FirebaseApp firebaseApp, @NonNull FirebaseRemoteModel firebaseRemoteModel) {
        this.zzapo = firebaseApp;
        this.zzaqs = zznu.zza(firebaseApp, 4);
        this.zzaqt = firebaseRemoteModel;
    }

    public final void zza(zzmk zzmk, String str, boolean z) {
        zzmd.zzo zzmh = this.zzaqt.zzmh();
        if (!z) {
            this.zzaqs.zza(zzmd.zzq.zzjx().zzb(zzmd.zzac.zzli().zzbu(str)).zzb(zzmd.zzl.zzji().zzb(zzmk).zzb(zzmh)), zzmn.CUSTOM_MODEL_DOWNLOAD);
            return;
        }
        long zzf = zzoa.zzf(this.zzapo, this.zzaqt.zzmj());
        if (zzf == 0) {
            zzaoz.mo10812w("ModelDownloadLogger", "Model downloaded without its beginning time recorded.");
            this.zzaqs.zza(zzmd.zzq.zzjx().zzb(zzmd.zzac.zzli().zzbu(str)).zzb(zzmd.zzl.zzji().zzb(zzmk.UNKNOWN_ERROR).zzb(zzmh)), zzmn.CUSTOM_MODEL_DOWNLOAD);
            return;
        }
        long zzg = zzoa.zzg(this.zzapo, this.zzaqt.zzmj());
        if (zzg == 0) {
            zzg = SystemClock.elapsedRealtime();
            zzoa.zza(this.zzapo, this.zzaqt.zzmj(), zzg);
        }
        this.zzaqs.zza(zzmd.zzq.zzjx().zzb(zzmd.zzac.zzli().zzbu(str)).zzb(zzmd.zzl.zzji().zzi(zzg - zzf).zzb(zzmk).zzb(zzmh)), zzmn.CUSTOM_MODEL_DOWNLOAD);
    }

    public final void zza(zzmk zzmk, boolean z) {
        zza(zzmk, "NA", z);
    }
}
