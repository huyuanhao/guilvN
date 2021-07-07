package com.google.firebase.p027ml.vision.barcode;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzmd;
import com.google.android.gms.internal.firebase_ml.zzmn;
import com.google.android.gms.internal.firebase_ml.zznt;
import com.google.android.gms.internal.firebase_ml.zznu;
import com.google.android.gms.internal.firebase_ml.zzpk;
import com.google.android.gms.internal.firebase_ml.zzpw;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p027ml.vision.common.FirebaseVisionImage;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.firebase.ml.vision.barcode.FirebaseVisionBarcodeDetector */
public class FirebaseVisionBarcodeDetector extends zzpw<List<FirebaseVisionBarcode>> implements Closeable {
    public static final Map<zznt<FirebaseVisionBarcodeDetectorOptions>, FirebaseVisionBarcodeDetector> zzax = new HashMap();

    public FirebaseVisionBarcodeDetector(@NonNull FirebaseApp firebaseApp, @NonNull FirebaseVisionBarcodeDetectorOptions firebaseVisionBarcodeDetectorOptions) {
        super(firebaseApp, new zzpk(firebaseApp, firebaseVisionBarcodeDetectorOptions));
        zznu.zza(firebaseApp, 1).zza(zzmd.zzq.zzjx().zzb(zzmd.zzv.zzki().zzb(firebaseVisionBarcodeDetectorOptions.zzng())), zzmn.ON_DEVICE_BARCODE_CREATE);
    }

    public static synchronized FirebaseVisionBarcodeDetector zza(@NonNull FirebaseApp firebaseApp, @NonNull FirebaseVisionBarcodeDetectorOptions firebaseVisionBarcodeDetectorOptions) {
        FirebaseVisionBarcodeDetector firebaseVisionBarcodeDetector;
        synchronized (FirebaseVisionBarcodeDetector.class) {
            Preconditions.checkNotNull(firebaseApp, "You must provide a valid FirebaseApp.");
            Preconditions.checkNotNull(firebaseApp.getPersistenceKey(), "Firebase app name must not be null");
            Preconditions.checkNotNull(firebaseApp.getApplicationContext(), "You must provide a valid Context.");
            Preconditions.checkNotNull(firebaseVisionBarcodeDetectorOptions, "You must provide a valid FirebaseVisionBarcodeDetectorOptions.");
            zznt<FirebaseVisionBarcodeDetectorOptions> zzj = zznt.zzj(firebaseApp.getPersistenceKey(), firebaseVisionBarcodeDetectorOptions);
            firebaseVisionBarcodeDetector = zzax.get(zzj);
            if (firebaseVisionBarcodeDetector == null) {
                firebaseVisionBarcodeDetector = new FirebaseVisionBarcodeDetector(firebaseApp, firebaseVisionBarcodeDetectorOptions);
                zzax.put(zzj, firebaseVisionBarcodeDetector);
            }
        }
        return firebaseVisionBarcodeDetector;
    }

    @Override // java.io.Closeable, com.google.android.gms.internal.firebase_ml.zzpw, java.lang.AutoCloseable
    public void close() throws IOException {
        super.close();
    }

    public Task<List<FirebaseVisionBarcode>> detectInImage(@NonNull FirebaseVisionImage firebaseVisionImage) {
        Preconditions.checkNotNull(firebaseVisionImage, "FirebaseVisionImage can not be null");
        return zza(firebaseVisionImage, false, false);
    }
}
