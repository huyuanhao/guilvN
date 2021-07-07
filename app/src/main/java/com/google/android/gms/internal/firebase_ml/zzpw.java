package com.google.android.gms.internal.firebase_ml;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p027ml.vision.common.FirebaseVisionImage;
import java.io.Closeable;
import java.io.IOException;

public class zzpw<TDetectionResult> implements Closeable {
    public final zznq zzasm;
    public final zznm<TDetectionResult, zzpz> zzaxo;

    public zzpw(@NonNull FirebaseApp firebaseApp, zznm<TDetectionResult, zzpz> zznm) {
        Preconditions.checkNotNull(firebaseApp, "FirebaseApp must not be null");
        Preconditions.checkNotNull(firebaseApp.getPersistenceKey(), "Firebase app name must not be null");
        this.zzaxo = zznm;
        zznq zza = zznq.zza(firebaseApp);
        this.zzasm = zza;
        zza.zza(zznm);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.zzasm.zzb(this.zzaxo);
    }

    public final Task<TDetectionResult> zza(@NonNull FirebaseVisionImage firebaseVisionImage, boolean z, boolean z2) {
        Preconditions.checkNotNull(firebaseVisionImage, "FirebaseVisionImage can not be null");
        return this.zzasm.zza(this.zzaxo, new zzpz(firebaseVisionImage.zza(z, z2)));
    }
}
