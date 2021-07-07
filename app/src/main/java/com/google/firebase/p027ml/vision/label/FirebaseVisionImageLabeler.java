package com.google.firebase.p027ml.vision.label;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zznt;
import com.google.android.gms.internal.firebase_ml.zzqc;
import com.google.android.gms.internal.firebase_ml.zzqd;
import com.google.android.gms.internal.firebase_ml.zzqg;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p027ml.vision.cloud.FirebaseVisionCloudDetectorOptions;
import com.google.firebase.p027ml.vision.common.FirebaseVisionImage;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.firebase.ml.vision.label.FirebaseVisionImageLabeler */
public class FirebaseVisionImageLabeler implements Closeable {
    public static final int CLOUD = 2;
    public static final int ON_DEVICE = 1;
    @GuardedBy("FirebaseVisionImageLabeler.class")
    public static final Map<zznt<FirebaseVisionOnDeviceImageLabelerOptions>, FirebaseVisionImageLabeler> zzayw = new HashMap();
    @GuardedBy("FirebaseVisionImageLabeler.class")
    public static final Map<zznt<FirebaseVisionCloudImageLabelerOptions>, FirebaseVisionImageLabeler> zzayx = new HashMap();
    @GuardedBy("FirebaseVisionImageLabeler.class")
    public static final Map<zznt<Object>, FirebaseVisionImageLabeler> zzayy = new HashMap();
    public final zzqc zzayr;
    public final zzqd zzays;
    public final zzqg zzayt;
    public final FirebaseVisionCloudImageLabelerOptions zzayu;
    @ImageLabelerType
    public final int zzayv;

    /* renamed from: com.google.firebase.ml.vision.label.FirebaseVisionImageLabeler$ImageLabelerType */
    public @interface ImageLabelerType {
    }

    public FirebaseVisionImageLabeler(@Nullable zzqd zzqd) {
        this(zzqd, null, null, null);
    }

    public static synchronized FirebaseVisionImageLabeler zza(@NonNull FirebaseApp firebaseApp, @NonNull FirebaseVisionOnDeviceImageLabelerOptions firebaseVisionOnDeviceImageLabelerOptions) {
        FirebaseVisionImageLabeler firebaseVisionImageLabeler;
        synchronized (FirebaseVisionImageLabeler.class) {
            Preconditions.checkNotNull(firebaseApp, "FirebaseApp must not be null");
            Preconditions.checkNotNull(firebaseApp.getPersistenceKey(), "Firebase app name must not be null");
            zznt<FirebaseVisionOnDeviceImageLabelerOptions> zzj = zznt.zzj(firebaseApp.getPersistenceKey(), firebaseVisionOnDeviceImageLabelerOptions);
            firebaseVisionImageLabeler = zzayw.get(zzj);
            if (firebaseVisionImageLabeler == null) {
                FirebaseVisionImageLabeler firebaseVisionImageLabeler2 = new FirebaseVisionImageLabeler(new zzqd(firebaseApp, firebaseVisionOnDeviceImageLabelerOptions));
                zzayw.put(zzj, firebaseVisionImageLabeler2);
                firebaseVisionImageLabeler = firebaseVisionImageLabeler2;
            }
        }
        return firebaseVisionImageLabeler;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        zzqd zzqd = this.zzays;
        if (zzqd != null) {
            zzqd.close();
        }
        zzqc zzqc = this.zzayr;
        if (zzqc != null) {
            zzqc.close();
        }
    }

    @ImageLabelerType
    public int getImageLabelerType() {
        return this.zzayv;
    }

    public Task<List<FirebaseVisionImageLabel>> processImage(@NonNull FirebaseVisionImage firebaseVisionImage) {
        Preconditions.checkState((this.zzays == null && this.zzayr == null) ? false : true, "One of on-device, cloud, or on-device AutoML image labeler should be set.");
        zzqd zzqd = this.zzays;
        if (zzqd != null) {
            return zzqd.detectInImage(firebaseVisionImage);
        }
        return this.zzayr.detectInImage(firebaseVisionImage).continueWith(new zzb(this));
    }

    public FirebaseVisionImageLabeler(@Nullable zzqc zzqc, @Nullable FirebaseVisionCloudImageLabelerOptions firebaseVisionCloudImageLabelerOptions) {
        this(null, zzqc, null, firebaseVisionCloudImageLabelerOptions);
    }

    public FirebaseVisionImageLabeler(@Nullable zzqd zzqd, @Nullable zzqc zzqc, @Nullable zzqg zzqg, @Nullable FirebaseVisionCloudImageLabelerOptions firebaseVisionCloudImageLabelerOptions) {
        Preconditions.checkArgument((zzqd == null && zzqc == null) ? false : true, "One of on-device, cloud or on-device AutoML image labeler should be set.");
        this.zzays = zzqd;
        this.zzayr = zzqc;
        this.zzayu = firebaseVisionCloudImageLabelerOptions;
        this.zzayt = null;
        if (zzqc != null) {
            this.zzayv = 2;
        } else if (zzqd != null) {
            this.zzayv = 1;
        } else {
            this.zzayv = 3;
        }
    }

    public static synchronized FirebaseVisionImageLabeler zza(@NonNull FirebaseApp firebaseApp, @NonNull FirebaseVisionCloudImageLabelerOptions firebaseVisionCloudImageLabelerOptions) {
        FirebaseVisionImageLabeler firebaseVisionImageLabeler;
        synchronized (FirebaseVisionImageLabeler.class) {
            Preconditions.checkNotNull(firebaseApp, "FirebaseApp must not be null");
            Preconditions.checkNotNull(firebaseApp.getPersistenceKey(), "Firebase app name must not be null");
            zznt<FirebaseVisionCloudImageLabelerOptions> zzj = zznt.zzj(firebaseApp.getPersistenceKey(), firebaseVisionCloudImageLabelerOptions);
            firebaseVisionImageLabeler = zzayx.get(zzj);
            if (firebaseVisionImageLabeler == null) {
                FirebaseVisionCloudDetectorOptions.Builder maxResults = new FirebaseVisionCloudDetectorOptions.Builder().setMaxResults(20);
                if (firebaseVisionCloudImageLabelerOptions.isEnforceCertFingerprintMatch()) {
                    maxResults.enforceCertFingerprintMatch();
                }
                firebaseVisionImageLabeler = new FirebaseVisionImageLabeler(new zzqc(firebaseApp, maxResults.build()), firebaseVisionCloudImageLabelerOptions);
                zzayx.put(zzj, firebaseVisionImageLabeler);
            }
        }
        return firebaseVisionImageLabeler;
    }
}
