package com.google.firebase.p027ml.vision;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzoa;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p027ml.vision.barcode.FirebaseVisionBarcodeDetector;
import com.google.firebase.p027ml.vision.barcode.FirebaseVisionBarcodeDetectorOptions;
import com.google.firebase.p027ml.vision.cloud.FirebaseVisionCloudDetectorOptions;
import com.google.firebase.p027ml.vision.cloud.landmark.FirebaseVisionCloudLandmarkDetector;
import com.google.firebase.p027ml.vision.document.FirebaseVisionCloudDocumentRecognizerOptions;
import com.google.firebase.p027ml.vision.document.FirebaseVisionDocumentTextRecognizer;
import com.google.firebase.p027ml.vision.face.FirebaseVisionFaceDetector;
import com.google.firebase.p027ml.vision.face.FirebaseVisionFaceDetectorOptions;
import com.google.firebase.p027ml.vision.label.FirebaseVisionCloudImageLabelerOptions;
import com.google.firebase.p027ml.vision.label.FirebaseVisionImageLabeler;
import com.google.firebase.p027ml.vision.label.FirebaseVisionOnDeviceImageLabelerOptions;
import com.google.firebase.p027ml.vision.object.zza;
import com.google.firebase.p027ml.vision.object.zzc;
import com.google.firebase.p027ml.vision.text.FirebaseVisionCloudTextRecognizerOptions;
import com.google.firebase.p027ml.vision.text.FirebaseVisionTextRecognizer;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.firebase.ml.vision.FirebaseVision */
public class FirebaseVision {
    public static final FirebaseVisionCloudDetectorOptions zzaut = new FirebaseVisionCloudDetectorOptions.Builder().build();
    public static final FirebaseVisionFaceDetectorOptions zzauu = new FirebaseVisionFaceDetectorOptions.Builder().build();
    public static final FirebaseVisionBarcodeDetectorOptions zzauv = new FirebaseVisionBarcodeDetectorOptions.Builder().build();
    public static final FirebaseVisionCloudTextRecognizerOptions zzauw = new FirebaseVisionCloudTextRecognizerOptions.Builder().build();
    public static final FirebaseVisionCloudDocumentRecognizerOptions zzaux = new FirebaseVisionCloudDocumentRecognizerOptions.Builder().build();
    public static final FirebaseVisionOnDeviceImageLabelerOptions zzauy = new FirebaseVisionOnDeviceImageLabelerOptions.Builder().build();
    public static final FirebaseVisionCloudImageLabelerOptions zzauz = new FirebaseVisionCloudImageLabelerOptions.Builder().build();
    public static final zza zzava = new zzc().zznp();
    public static final Map<String, FirebaseVision> zzax = new HashMap();
    public final FirebaseApp zzaso;

    public FirebaseVision(FirebaseApp firebaseApp) {
        this.zzaso = firebaseApp;
    }

    public static FirebaseVision getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    public FirebaseVisionDocumentTextRecognizer getCloudDocumentTextRecognizer(@NonNull FirebaseVisionCloudDocumentRecognizerOptions firebaseVisionCloudDocumentRecognizerOptions) {
        return FirebaseVisionDocumentTextRecognizer.zza(this.zzaso, firebaseVisionCloudDocumentRecognizerOptions);
    }

    public FirebaseVisionImageLabeler getCloudImageLabeler(@NonNull FirebaseVisionCloudImageLabelerOptions firebaseVisionCloudImageLabelerOptions) {
        return FirebaseVisionImageLabeler.zza(this.zzaso, firebaseVisionCloudImageLabelerOptions);
    }

    public FirebaseVisionTextRecognizer getCloudTextRecognizer() {
        return FirebaseVisionTextRecognizer.zza(this.zzaso, zzauw, false);
    }

    public FirebaseVisionImageLabeler getOnDeviceImageLabeler(@NonNull FirebaseVisionOnDeviceImageLabelerOptions firebaseVisionOnDeviceImageLabelerOptions) {
        return FirebaseVisionImageLabeler.zza(this.zzaso, (FirebaseVisionOnDeviceImageLabelerOptions) Preconditions.checkNotNull(firebaseVisionOnDeviceImageLabelerOptions, "Please provide a valid FirebaseVisionOnDeviceImageLabelerOptions"));
    }

    public FirebaseVisionTextRecognizer getOnDeviceTextRecognizer() {
        return FirebaseVisionTextRecognizer.zza(this.zzaso, null, true);
    }

    public FirebaseVisionBarcodeDetector getVisionBarcodeDetector(@NonNull FirebaseVisionBarcodeDetectorOptions firebaseVisionBarcodeDetectorOptions) {
        return FirebaseVisionBarcodeDetector.zza(this.zzaso, (FirebaseVisionBarcodeDetectorOptions) Preconditions.checkNotNull(firebaseVisionBarcodeDetectorOptions, "Please provide a valid FirebaseVisionBarcodeDetectorOptions"));
    }

    public FirebaseVisionCloudLandmarkDetector getVisionCloudLandmarkDetector(@NonNull FirebaseVisionCloudDetectorOptions firebaseVisionCloudDetectorOptions) {
        return FirebaseVisionCloudLandmarkDetector.zza(this.zzaso, firebaseVisionCloudDetectorOptions);
    }

    public FirebaseVisionFaceDetector getVisionFaceDetector(@NonNull FirebaseVisionFaceDetectorOptions firebaseVisionFaceDetectorOptions) {
        Preconditions.checkNotNull(firebaseVisionFaceDetectorOptions, "Please provide a valid FirebaseVisionFaceDetectorOptions");
        return FirebaseVisionFaceDetector.zza(this.zzaso, firebaseVisionFaceDetectorOptions);
    }

    public boolean isStatsCollectionEnabled() {
        return zzoa.zzc(this.zzaso);
    }

    public void setStatsCollectionEnabled(boolean z) {
        zzoa.zza(this.zzaso, z);
    }

    public static FirebaseVision getInstance(@NonNull FirebaseApp firebaseApp) {
        FirebaseVision firebaseVision;
        Preconditions.checkNotNull(firebaseApp, "FirebaseApp can not be null");
        String persistenceKey = firebaseApp.getPersistenceKey();
        synchronized (zzax) {
            firebaseVision = zzax.get(persistenceKey);
            if (firebaseVision == null) {
                firebaseVision = new FirebaseVision(firebaseApp);
                zzax.put(persistenceKey, firebaseVision);
            }
        }
        return firebaseVision;
    }

    public FirebaseVisionDocumentTextRecognizer getCloudDocumentTextRecognizer() {
        return FirebaseVisionDocumentTextRecognizer.zza(this.zzaso, zzaux);
    }

    public FirebaseVisionImageLabeler getCloudImageLabeler() {
        return FirebaseVisionImageLabeler.zza(this.zzaso, zzauz);
    }

    public FirebaseVisionTextRecognizer getCloudTextRecognizer(FirebaseVisionCloudTextRecognizerOptions firebaseVisionCloudTextRecognizerOptions) {
        return FirebaseVisionTextRecognizer.zza(this.zzaso, firebaseVisionCloudTextRecognizerOptions, false);
    }

    public FirebaseVisionCloudLandmarkDetector getVisionCloudLandmarkDetector() {
        return FirebaseVisionCloudLandmarkDetector.zza(this.zzaso, zzaut);
    }

    public FirebaseVisionFaceDetector getVisionFaceDetector() {
        return FirebaseVisionFaceDetector.zza(this.zzaso, zzauu);
    }

    public FirebaseVisionImageLabeler getOnDeviceImageLabeler() {
        return FirebaseVisionImageLabeler.zza(this.zzaso, zzauy);
    }

    public FirebaseVisionBarcodeDetector getVisionBarcodeDetector() {
        return FirebaseVisionBarcodeDetector.zza(this.zzaso, zzauv);
    }
}
