package com.google.android.gms.internal.firebase_ml;

import android.content.Context;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.vision.dynamite.face.ModuleDescriptor;
import com.google.android.gms.internal.firebase_ml.zzmd;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.FaceDetector;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p027ml.common.FirebaseMLException;
import com.google.firebase.p027ml.vision.face.FirebaseVisionFace;
import com.google.firebase.p027ml.vision.face.FirebaseVisionFaceDetectorOptions;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzqa implements zznm<List<FirebaseVisionFace>, zzpz>, zznw {
    @VisibleForTesting
    public static AtomicBoolean zzato = new AtomicBoolean(true);
    public static volatile Boolean zzaub;
    public final Context zzad;
    public final zznu zzaqs;
    public zzpu zzawc = new zzpu();
    public final FirebaseVisionFaceDetectorOptions zzaye;
    @GuardedBy("this")
    public FaceDetector zzayl;
    @GuardedBy("this")
    public FaceDetector zzaym;

    public zzqa(@NonNull FirebaseApp firebaseApp, @NonNull FirebaseVisionFaceDetectorOptions firebaseVisionFaceDetectorOptions) {
        Preconditions.checkNotNull(firebaseApp, "FirebaseApp can not be null");
        Preconditions.checkNotNull(firebaseVisionFaceDetectorOptions, "FirebaseVisionFaceDetectorOptions can not be null");
        this.zzad = firebaseApp.getApplicationContext();
        this.zzaye = firebaseVisionFaceDetectorOptions;
        this.zzaqs = zznu.zza(firebaseApp, 1);
    }

    @VisibleForTesting
    @WorkerThread
    private final synchronized List<FirebaseVisionFace> zza(@NonNull FaceDetector faceDetector, @NonNull zzpz zzpz, long j) throws FirebaseMLException {
        ArrayList arrayList;
        if (this.zzaym != null) {
            if (zzaub == null) {
                zzaub = Boolean.valueOf(DynamiteModule.getLocalVersion(this.zzad, ModuleDescriptor.MODULE_ID) > 0);
            }
            if (!zzaub.booleanValue()) {
                throw new FirebaseMLException("No Face Contour model is bundled. Please check your app setup to include firebase-ml-vision-face-model dependency.", 14);
            }
        }
        if (faceDetector.isOperational()) {
            SparseArray<Face> detect = faceDetector.detect(zzpz.zzaxe);
            arrayList = new ArrayList();
            for (int i = 0; i < detect.size(); i++) {
                arrayList.add(new FirebaseVisionFace(detect.get(detect.keyAt(i))));
            }
        } else {
            zza(zzmk.MODEL_NOT_DOWNLOADED, j, zzpz, 0, 0);
            throw new FirebaseMLException("Waiting for the face detection model to be downloaded. Please wait.", 14);
        }
        return arrayList;
    }

    public static void zzh(@NonNull List<FirebaseVisionFace> list) {
        for (FirebaseVisionFace firebaseVisionFace : list) {
            firebaseVisionFace.zzbr(-1);
        }
    }

    @Override // com.google.android.gms.internal.firebase_ml.zznw
    @WorkerThread
    public final synchronized void release() {
        if (this.zzayl != null) {
            this.zzayl.release();
            this.zzayl = null;
        }
        if (this.zzaym != null) {
            this.zzaym.release();
            this.zzaym = null;
        }
        zzato.set(true);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zznm
    public final zznw zzlm() {
        return this;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zznw
    @WorkerThread
    public final synchronized void zzlp() {
        if (this.zzaye.getContourMode() == 2) {
            if (this.zzaym == null) {
                this.zzaym = new FaceDetector.Builder(this.zzad).setLandmarkType(2).setMode(2).setTrackingEnabled(false).setProminentFaceOnly(true).build();
            }
            if ((this.zzaye.getLandmarkMode() == 2 || this.zzaye.getClassificationMode() == 2 || this.zzaye.getPerformanceMode() == 2) && this.zzayl == null) {
                this.zzayl = new FaceDetector.Builder(this.zzad).setLandmarkType(zzpv.zzbn(this.zzaye.getLandmarkMode())).setClassificationType(zzpv.zzbp(this.zzaye.getClassificationMode())).setMode(zzpv.zzbo(this.zzaye.getPerformanceMode())).setMinFaceSize(this.zzaye.getMinFaceSize()).setTrackingEnabled(this.zzaye.isTrackingEnabled()).build();
            }
        } else if (this.zzayl == null) {
            this.zzayl = new FaceDetector.Builder(this.zzad).setLandmarkType(zzpv.zzbn(this.zzaye.getLandmarkMode())).setClassificationType(zzpv.zzbp(this.zzaye.getClassificationMode())).setMode(zzpv.zzbo(this.zzaye.getPerformanceMode())).setMinFaceSize(this.zzaye.getMinFaceSize()).setTrackingEnabled(this.zzaye.isTrackingEnabled()).build();
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x011b A[SYNTHETIC] */
    @androidx.annotation.WorkerThread
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<com.google.firebase.p027ml.vision.face.FirebaseVisionFace> zza(@androidx.annotation.NonNull com.google.android.gms.internal.firebase_ml.zzpz r22) throws com.google.firebase.p027ml.common.FirebaseMLException {
        /*
        // Method dump skipped, instructions count: 363
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.firebase_ml.zzqa.zza(com.google.android.gms.internal.firebase_ml.zzpz):java.util.List");
    }

    private final synchronized void zza(zzmk zzmk, long j, zzpz zzpz, int i, int i2) {
        this.zzaqs.zza(new zzqb(this, j, zzmk, i, i2, zzpz), zzmn.ON_DEVICE_FACE_DETECT);
    }

    public final /* synthetic */ zzmd.zzq.zza zza(long j, zzmk zzmk, int i, int i2, zzpz zzpz) {
        return zzmd.zzq.zzjx().zzb(zzmd.zzw.zzkk().zzd(zzmd.zzs.zzkb().zzn(SystemClock.elapsedRealtime() - j).zzc(zzmk).zzz(zzato.get()).zzaa(true).zzab(true)).zzb(this.zzaye.zznn()).zzbc(i).zzbd(i2).zzc(zzpv.zzc(zzpz)));
    }
}
