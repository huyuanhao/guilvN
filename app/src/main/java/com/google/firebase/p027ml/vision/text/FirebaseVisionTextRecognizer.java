package com.google.firebase.p027ml.vision.text;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzqh;
import com.google.android.gms.internal.firebase_ml.zzqi;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p027ml.vision.common.FirebaseVisionImage;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer */
public class FirebaseVisionTextRecognizer implements Closeable {
    public static final int CLOUD = 2;
    public static final int ON_DEVICE = 1;
    @GuardedBy("FirebaseVisionTextRecognizer.class")
    public static final Map<zzqi, FirebaseVisionTextRecognizer> zzayw = new HashMap();
    @GuardedBy("FirebaseVisionTextRecognizer.class")
    public static final Map<zzqh, FirebaseVisionTextRecognizer> zzayx = new HashMap();
    public final zzqi zzazp;
    public final zzqh zzazq;
    @RecognizerType
    public final int zzazr;

    /* renamed from: com.google.firebase.ml.vision.text.FirebaseVisionTextRecognizer$RecognizerType */
    public @interface RecognizerType {
    }

    public FirebaseVisionTextRecognizer(@Nullable zzqi zzqi, @Nullable zzqh zzqh, @RecognizerType int i) {
        this.zzazr = i;
        this.zzazp = zzqi;
        this.zzazq = zzqh;
    }

    public static synchronized FirebaseVisionTextRecognizer zza(@NonNull FirebaseApp firebaseApp, @Nullable FirebaseVisionCloudTextRecognizerOptions firebaseVisionCloudTextRecognizerOptions, boolean z) {
        synchronized (FirebaseVisionTextRecognizer.class) {
            Preconditions.checkNotNull(firebaseApp, "FirebaseApp must not be null");
            Preconditions.checkNotNull(firebaseApp.getPersistenceKey(), "Firebase app name must not be null");
            if (!z) {
                Preconditions.checkNotNull(firebaseVisionCloudTextRecognizerOptions, "Options must not be null");
            }
            if (z) {
                zzqi zzj = zzqi.zzj(firebaseApp);
                FirebaseVisionTextRecognizer firebaseVisionTextRecognizer = zzayw.get(zzj);
                if (firebaseVisionTextRecognizer == null) {
                    firebaseVisionTextRecognizer = new FirebaseVisionTextRecognizer(zzj, null, 1);
                    zzayw.put(zzj, firebaseVisionTextRecognizer);
                }
                return firebaseVisionTextRecognizer;
            }
            zzqh zza = zzqh.zza(firebaseApp, firebaseVisionCloudTextRecognizerOptions);
            FirebaseVisionTextRecognizer firebaseVisionTextRecognizer2 = zzayx.get(zza);
            if (firebaseVisionTextRecognizer2 == null) {
                firebaseVisionTextRecognizer2 = new FirebaseVisionTextRecognizer(null, zza, 2);
                zzayx.put(zza, firebaseVisionTextRecognizer2);
            }
            return firebaseVisionTextRecognizer2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        zzqi zzqi = this.zzazp;
        if (zzqi != null) {
            zzqi.close();
        }
        zzqh zzqh = this.zzazq;
        if (zzqh != null) {
            zzqh.close();
        }
    }

    @RecognizerType
    public int getRecognizerType() {
        return this.zzazr;
    }

    public Task<FirebaseVisionText> processImage(@NonNull FirebaseVisionImage firebaseVisionImage) {
        Preconditions.checkArgument((this.zzazp == null && this.zzazq == null) ? false : true, "Either on-device or cloud text recognizer should be enabled.");
        zzqi zzqi = this.zzazp;
        if (zzqi != null) {
            return zzqi.processImage(firebaseVisionImage);
        }
        return this.zzazq.processImage(firebaseVisionImage);
    }
}
