package com.google.android.gms.internal.firebase_ml;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzmd;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p027ml.vision.common.FirebaseVisionImage;
import com.google.firebase.p027ml.vision.text.FirebaseVisionText;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Map;

public final class zzqi extends zzpw<FirebaseVisionText> implements Closeable {
    @GuardedBy("OnDeviceTextRecognizer.class")
    public static final Map<String, zzqi> zzax = new HashMap();

    public zzqi(@NonNull FirebaseApp firebaseApp) {
        super(firebaseApp, new zzqj(firebaseApp));
        zznu.zza(firebaseApp, 1).zza(zzmd.zzq.zzjx().zzb(zzmd.zzab.zzlf()), zzmn.ON_DEVICE_TEXT_CREATE);
    }

    public static synchronized zzqi zzj(@NonNull FirebaseApp firebaseApp) {
        zzqi zzqi;
        synchronized (zzqi.class) {
            Preconditions.checkNotNull(firebaseApp, "FirebaseApp can not be null.");
            Preconditions.checkNotNull(firebaseApp.getPersistenceKey(), "Firebase app name must not be null");
            zzqi = zzax.get(firebaseApp.getPersistenceKey());
            if (zzqi == null) {
                zzqi = new zzqi(firebaseApp);
                zzax.put(firebaseApp.getPersistenceKey(), zzqi);
            }
        }
        return zzqi;
    }

    public final Task<FirebaseVisionText> processImage(@NonNull FirebaseVisionImage firebaseVisionImage) {
        return super.zza(firebaseVisionImage, false, true);
    }
}
