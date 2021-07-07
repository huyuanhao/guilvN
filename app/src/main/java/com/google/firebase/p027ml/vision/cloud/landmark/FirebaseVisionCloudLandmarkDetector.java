package com.google.firebase.p027ml.vision.cloud.landmark;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzir;
import com.google.android.gms.internal.firebase_ml.zzjb;
import com.google.android.gms.internal.firebase_ml.zzmd;
import com.google.android.gms.internal.firebase_ml.zzmn;
import com.google.android.gms.internal.firebase_ml.zznt;
import com.google.android.gms.internal.firebase_ml.zznu;
import com.google.android.gms.internal.firebase_ml.zzpo;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p027ml.vision.cloud.FirebaseVisionCloudDetectorOptions;
import com.google.firebase.p027ml.vision.common.FirebaseVisionImage;
import com.p118pd.sdk.C7997oO0ooOO0;
import exocr.idcard.CameraManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.firebase.ml.vision.cloud.landmark.FirebaseVisionCloudLandmarkDetector */
public class FirebaseVisionCloudLandmarkDetector extends zzpo<List<FirebaseVisionCloudLandmark>> {
    public static final Map<zznt<FirebaseVisionCloudDetectorOptions>, FirebaseVisionCloudLandmarkDetector> zzax = new HashMap();

    public FirebaseVisionCloudLandmarkDetector(@NonNull FirebaseApp firebaseApp, @NonNull FirebaseVisionCloudDetectorOptions firebaseVisionCloudDetectorOptions) {
        super(firebaseApp, "LANDMARK_DETECTION", firebaseVisionCloudDetectorOptions);
        zznu.zza(firebaseApp, 1).zza(zzmd.zzq.zzjx(), zzmn.CLOUD_LANDMARK_CREATE);
    }

    public static synchronized FirebaseVisionCloudLandmarkDetector zza(@NonNull FirebaseApp firebaseApp, @NonNull FirebaseVisionCloudDetectorOptions firebaseVisionCloudDetectorOptions) {
        FirebaseVisionCloudLandmarkDetector firebaseVisionCloudLandmarkDetector;
        synchronized (FirebaseVisionCloudLandmarkDetector.class) {
            Preconditions.checkNotNull(firebaseApp, "FirebaseApp must not be null");
            Preconditions.checkNotNull(firebaseApp.getPersistenceKey(), "Firebase app name must not be null");
            Preconditions.checkNotNull(firebaseVisionCloudDetectorOptions, "Options must not be null");
            zznt<FirebaseVisionCloudDetectorOptions> zzj = zznt.zzj(firebaseApp.getPersistenceKey(), firebaseVisionCloudDetectorOptions);
            firebaseVisionCloudLandmarkDetector = zzax.get(zzj);
            if (firebaseVisionCloudLandmarkDetector == null) {
                firebaseVisionCloudLandmarkDetector = new FirebaseVisionCloudLandmarkDetector(firebaseApp, firebaseVisionCloudDetectorOptions);
                zzax.put(zzj, firebaseVisionCloudLandmarkDetector);
            }
        }
        return firebaseVisionCloudLandmarkDetector;
    }

    public Task<List<FirebaseVisionCloudLandmark>> detectInImage(@NonNull FirebaseVisionImage firebaseVisionImage) {
        zznu.zza(this.zzapo, 1).zza(zzmd.zzq.zzjx(), zzmn.CLOUD_LANDMARK_DETECT);
        return super.zza(firebaseVisionImage);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzpo
    public final int zznh() {
        return C7997oO0ooOO0.OooOoO;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzpo
    public final int zzni() {
        return CameraManager.OooO0O0;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.firebase_ml.zzpo
    public final /* synthetic */ List<FirebaseVisionCloudLandmark> zza(@NonNull zzir zzir, float f) {
        if (zzir.zzho() == null) {
            return new ArrayList();
        }
        float f2 = 1.0f / f;
        List<zzjb> zzho = zzir.zzho();
        ArrayList arrayList = new ArrayList();
        for (zzjb zzjb : zzho) {
            FirebaseVisionCloudLandmark zza = FirebaseVisionCloudLandmark.zza(zzjb, f2);
            if (zza != null) {
                arrayList.add(zza);
            }
        }
        return arrayList;
    }
}
