package com.google.firebase.p027ml.vision.document;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzir;
import com.google.android.gms.internal.firebase_ml.zzjf;
import com.google.android.gms.internal.firebase_ml.zzmd;
import com.google.android.gms.internal.firebase_ml.zzmn;
import com.google.android.gms.internal.firebase_ml.zznt;
import com.google.android.gms.internal.firebase_ml.zznu;
import com.google.android.gms.internal.firebase_ml.zzpo;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p027ml.vision.common.FirebaseVisionImage;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.firebase.ml.vision.document.FirebaseVisionDocumentTextRecognizer */
public class FirebaseVisionDocumentTextRecognizer extends zzpo<FirebaseVisionDocumentText> {
    public static final Map<zznt<FirebaseVisionCloudDocumentRecognizerOptions>, FirebaseVisionDocumentTextRecognizer> zzax = new HashMap();

    public FirebaseVisionDocumentTextRecognizer(@NonNull FirebaseApp firebaseApp, @NonNull zzjf zzjf, boolean z) {
        super(firebaseApp, "DOCUMENT_TEXT_DETECTION", zzjf, z);
        zznu.zza(firebaseApp, 1).zza(zzmd.zzq.zzjx(), zzmn.CLOUD_DOCUMENT_TEXT_CREATE);
    }

    public static synchronized FirebaseVisionDocumentTextRecognizer zza(@NonNull FirebaseApp firebaseApp, @NonNull FirebaseVisionCloudDocumentRecognizerOptions firebaseVisionCloudDocumentRecognizerOptions) {
        FirebaseVisionDocumentTextRecognizer firebaseVisionDocumentTextRecognizer;
        synchronized (FirebaseVisionDocumentTextRecognizer.class) {
            Preconditions.checkNotNull(firebaseApp, "FirebaseApp must not be null");
            Preconditions.checkNotNull(firebaseApp.getPersistenceKey(), "Firebase app name must not be null");
            Preconditions.checkNotNull(firebaseVisionCloudDocumentRecognizerOptions, "Options must not be null");
            zznt<FirebaseVisionCloudDocumentRecognizerOptions> zzj = zznt.zzj(firebaseApp.getPersistenceKey(), firebaseVisionCloudDocumentRecognizerOptions);
            firebaseVisionDocumentTextRecognizer = zzax.get(zzj);
            if (firebaseVisionDocumentTextRecognizer == null) {
                zzjf zzjf = new zzjf();
                zzjf.zzd(firebaseVisionCloudDocumentRecognizerOptions.getHintedLanguages());
                FirebaseVisionDocumentTextRecognizer firebaseVisionDocumentTextRecognizer2 = new FirebaseVisionDocumentTextRecognizer(firebaseApp, zzjf, firebaseVisionCloudDocumentRecognizerOptions.isEnforceCertFingerprintMatch());
                zzax.put(zzj, firebaseVisionDocumentTextRecognizer2);
                firebaseVisionDocumentTextRecognizer = firebaseVisionDocumentTextRecognizer2;
            }
        }
        return firebaseVisionDocumentTextRecognizer;
    }

    public Task<FirebaseVisionDocumentText> processImage(@NonNull FirebaseVisionImage firebaseVisionImage) {
        zznu.zza(this.zzapo, 1).zza(zzmd.zzq.zzjx(), zzmn.CLOUD_DOCUMENT_TEXT_DETECT);
        return super.zza(firebaseVisionImage);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzpo
    public final int zznh() {
        return 1024;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzpo
    public final int zzni() {
        return 768;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.firebase_ml.zzpo
    @Nullable
    public final /* synthetic */ FirebaseVisionDocumentText zza(@NonNull zzir zzir, float f) {
        return FirebaseVisionDocumentText.zza(zzir.zzhm(), 1.0f / f);
    }
}
