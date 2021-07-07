package com.google.android.gms.internal.firebase_ml;

import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p027ml.common.FirebaseMLException;
import com.google.firebase.p027ml.vision.cloud.FirebaseVisionCloudDetectorOptions;
import com.google.firebase.p027ml.vision.common.FirebaseVisionImage;
import java.io.Closeable;
import java.io.IOException;
import java.util.Collections;

public abstract class zzpo<ResultType> implements Closeable {
    public final zzjf imageContext;
    public final FirebaseApp zzapo;
    public final zznq zzasm;
    public final zzpp zzawm;
    public final zzjc zzawn;

    public zzpo(@NonNull FirebaseApp firebaseApp, @NonNull String str, @NonNull FirebaseVisionCloudDetectorOptions firebaseVisionCloudDetectorOptions) {
        this(firebaseApp, new zzjc().zza(Integer.valueOf(firebaseVisionCloudDetectorOptions.getMaxResults())).zzay(str).zzax(zzpm.zzbl(firebaseVisionCloudDetectorOptions.getModelType())), (zzjf) null, firebaseVisionCloudDetectorOptions.isEnforceCertFingerprintMatch());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    public final Task<ResultType> zza(@NonNull FirebaseVisionImage firebaseVisionImage) {
        Preconditions.checkNotNull(firebaseVisionImage, "Input image can not be null");
        Pair<byte[], Float> zze = firebaseVisionImage.zze(zznh(), zzni());
        if (zze.first == null) {
            return Tasks.forException(new FirebaseMLException("Can not convert the image format", 3));
        }
        return this.zzasm.zza(this.zzawm, new zzpn((byte[]) zze.first, ((Float) zze.second).floatValue(), Collections.singletonList(this.zzawn), this.imageContext));
    }

    public abstract ResultType zza(@NonNull zzir zzir, float f);

    public abstract int zznh();

    public abstract int zzni();

    public zzpo(@NonNull FirebaseApp firebaseApp, @NonNull String str, @NonNull zzjf zzjf, boolean z) {
        this(firebaseApp, new zzjc().zzay(str).zzax(zzpm.zzbl(1)), (zzjf) Preconditions.checkNotNull(zzjf, "ImageContext must not be null"), z);
    }

    public zzpo(@NonNull FirebaseApp firebaseApp, @NonNull zzjc zzjc, @Nullable zzjf zzjf, boolean z) {
        Preconditions.checkNotNull(firebaseApp, "FirebaseApp must not be null");
        Preconditions.checkNotNull(firebaseApp.getPersistenceKey(), "Firebase app name must not be null");
        this.zzawn = (zzjc) Preconditions.checkNotNull(zzjc);
        this.zzasm = zznq.zza(firebaseApp);
        this.zzawm = new zzpp(this, firebaseApp, z);
        this.zzapo = firebaseApp;
        this.imageContext = zzjf;
    }
}
