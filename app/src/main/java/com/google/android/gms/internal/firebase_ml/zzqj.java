package com.google.android.gms.internal.firebase_ml;

import android.content.Context;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.vision.text.TextBlock;
import com.google.android.gms.vision.text.TextRecognizer;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p027ml.common.FirebaseMLException;
import com.google.firebase.p027ml.vision.text.FirebaseVisionText;

public final class zzqj implements zznm<FirebaseVisionText, zzpz>, zznw {
    @VisibleForTesting
    public static boolean zzata = true;
    public final Context zzad;
    public final zznu zzaqs;
    public zzpu zzawc = new zzpu();
    @GuardedBy("this")
    public TextRecognizer zzazt;

    public zzqj(@NonNull FirebaseApp firebaseApp) {
        Preconditions.checkNotNull(firebaseApp, "Firebase App can not be null");
        this.zzad = firebaseApp.getApplicationContext();
        this.zzaqs = zznu.zza(firebaseApp, 1);
    }

    private final void zza(zzmk zzmk, long j, zzpz zzpz) {
        this.zzaqs.zza(new zzqk(j, zzmk, zzpz), zzmn.ON_DEVICE_TEXT_DETECT);
    }

    /* access modifiers changed from: private */
    @Nullable
    @WorkerThread
    /* renamed from: zzd */
    public final synchronized FirebaseVisionText zza(@NonNull zzpz zzpz) throws FirebaseMLException {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzazt == null) {
            zza(zzmk.UNKNOWN_ERROR, elapsedRealtime, zzpz);
            throw new FirebaseMLException("Model source is unavailable. Please load the model resource first.", 13);
        } else if (this.zzazt.isOperational()) {
            this.zzawc.zzb(zzpz);
            SparseArray<TextBlock> detect = this.zzazt.detect(zzpz.zzaxe);
            zza(zzmk.NO_ERROR, elapsedRealtime, zzpz);
            zzata = false;
            if (detect == null) {
                return null;
            }
            return new FirebaseVisionText(detect);
        } else {
            zza(zzmk.MODEL_NOT_DOWNLOADED, elapsedRealtime, zzpz);
            throw new FirebaseMLException("Waiting for the text recognition model to be downloaded. Please wait.", 14);
        }
    }

    @Override // com.google.android.gms.internal.firebase_ml.zznw
    @WorkerThread
    public final synchronized void release() {
        if (this.zzazt != null) {
            this.zzazt.release();
            this.zzazt = null;
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
        if (this.zzazt == null) {
            this.zzazt = new TextRecognizer.Builder(this.zzad).build();
        }
    }
}
