package com.google.android.gms.internal.firebase_ml;

import android.content.Context;
import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzmd;
import com.google.android.gms.vision.label.ImageLabeler;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p027ml.vision.label.FirebaseVisionImageLabel;
import com.google.firebase.p027ml.vision.label.FirebaseVisionOnDeviceImageLabelerOptions;
import java.util.List;

public final class zzqe implements zznm<List<FirebaseVisionImageLabel>, zzpz>, zznw {
    @VisibleForTesting
    public static boolean zzata = true;
    public static volatile Boolean zzaza;
    public final Context zzad;
    public final zznu zzaqs;
    public final FirebaseVisionOnDeviceImageLabelerOptions zzazb;
    @GuardedBy("this")
    public ImageLabeler zzazc;

    public zzqe(@NonNull FirebaseApp firebaseApp, @NonNull FirebaseVisionOnDeviceImageLabelerOptions firebaseVisionOnDeviceImageLabelerOptions) {
        Preconditions.checkNotNull(firebaseApp, "Context can not be null");
        Preconditions.checkNotNull(firebaseVisionOnDeviceImageLabelerOptions, "FirebaseVisionOnDeviceImageLabelerOptions can not be null");
        this.zzad = firebaseApp.getApplicationContext();
        this.zzazb = firebaseVisionOnDeviceImageLabelerOptions;
        this.zzaqs = zznu.zza(firebaseApp, 1);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0020  */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<com.google.firebase.p027ml.vision.label.FirebaseVisionImageLabel> zza(com.google.android.gms.internal.firebase_ml.zzpz r9) throws com.google.firebase.p027ml.common.FirebaseMLException {
        /*
        // Method dump skipped, instructions count: 158
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzqe.zza(com.google.android.gms.internal.firebase_ml.zzpz):java.util.List");
    }

    @Override // com.google.android.gms.internal.firebase_ml.zznw
    @WorkerThread
    public final synchronized void release() {
        if (this.zzazc != null) {
            this.zzazc.release();
            this.zzazc = null;
        }
        zzata = true;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zznm
    public final zznw zzlm() {
        return this;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zznw
    @WorkerThread
    public final synchronized void zzlp() {
        if (this.zzazc == null) {
            this.zzazc = new ImageLabeler.Builder(this.zzad).setScoreThreshold(this.zzazb.getConfidenceThreshold()).build();
        }
    }

    private final void zza(zzmk zzmk, long j, zzpz zzpz) {
        this.zzaqs.zza(new zzqf(this, j, zzmk, zzpz), zzmn.ON_DEVICE_IMAGE_LABEL_DETECT);
    }

    public final /* synthetic */ zzmd.zzq.zza zza(long j, zzmk zzmk, zzpz zzpz) {
        return zzmd.zzq.zzjx().zzb(zzmd.zzx.zzkm().zze(zzmd.zzs.zzkb().zzn(SystemClock.elapsedRealtime() - j).zzc(zzmk).zzz(zzata).zzaa(true).zzab(true)).zzb(this.zzazb.zzno()).zzd(zzpv.zzc(zzpz)));
    }
}
