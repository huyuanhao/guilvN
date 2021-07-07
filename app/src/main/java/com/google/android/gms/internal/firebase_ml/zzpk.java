package com.google.android.gms.internal.firebase_ml;

import android.content.Context;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzmd;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.BarcodeDetector;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p027ml.common.FirebaseMLException;
import com.google.firebase.p027ml.vision.barcode.FirebaseVisionBarcode;
import com.google.firebase.p027ml.vision.barcode.FirebaseVisionBarcodeDetectorOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class zzpk implements zznm<List<FirebaseVisionBarcode>, zzpz>, zznw {
    @VisibleForTesting
    public static boolean zzata = true;
    public final Context zzad;
    public final zznu zzaqs;
    public final FirebaseVisionBarcodeDetectorOptions zzawa;
    @GuardedBy("this")
    @VisibleForTesting
    public BarcodeDetector zzawb;
    public zzpu zzawc = new zzpu();

    public zzpk(@NonNull FirebaseApp firebaseApp, @NonNull FirebaseVisionBarcodeDetectorOptions firebaseVisionBarcodeDetectorOptions) {
        Preconditions.checkNotNull(firebaseApp, "FirebaseApp can not be null");
        Preconditions.checkNotNull(firebaseVisionBarcodeDetectorOptions, "FirebaseVisionBarcodeDetectorOptions can not be null");
        this.zzad = firebaseApp.getApplicationContext();
        this.zzawa = firebaseVisionBarcodeDetectorOptions;
        this.zzaqs = zznu.zza(firebaseApp, 1);
    }

    /* access modifiers changed from: private */
    @WorkerThread
    public final synchronized List<FirebaseVisionBarcode> zza(@NonNull zzpz zzpz) throws FirebaseMLException {
        ArrayList arrayList;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzawb == null) {
            zza(zzmk.UNKNOWN_ERROR, elapsedRealtime, zzpz, (List<FirebaseVisionBarcode>) null);
            throw new FirebaseMLException("Model source is unavailable. Please load the model resource first.", 13);
        } else if (this.zzawb.isOperational()) {
            this.zzawc.zzb(zzpz);
            SparseArray<Barcode> detect = this.zzawb.detect(zzpz.zzaxe);
            arrayList = new ArrayList();
            for (int i = 0; i < detect.size(); i++) {
                Barcode barcode = detect.get(detect.keyAt(i));
                if (barcode != null) {
                    arrayList.add(new FirebaseVisionBarcode(barcode));
                }
            }
            zza(zzmk.NO_ERROR, elapsedRealtime, zzpz, arrayList);
            zzata = false;
        } else {
            zza(zzmk.MODEL_NOT_DOWNLOADED, elapsedRealtime, zzpz, (List<FirebaseVisionBarcode>) null);
            throw new FirebaseMLException("Waiting for the barcode detection model to be downloaded. Please wait.", 14);
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zznw
    @WorkerThread
    public final synchronized void release() {
        if (this.zzawb != null) {
            this.zzawb.release();
            this.zzawb = null;
        }
        zzata = true;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zznm
    public final zznw zzlm() {
        return this;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zznw
    @WorkerThread
    public final synchronized void zzlp() {
        if (this.zzawb == null) {
            this.zzawb = new BarcodeDetector.Builder(this.zzad).setBarcodeFormats(this.zzawa.zznf()).build();
        }
    }

    private final void zza(zzmk zzmk, long j, @NonNull zzpz zzpz, @Nullable List<FirebaseVisionBarcode> list) {
        this.zzaqs.zza(new zzpl(this, j, zzmk, zzpz, list), zzmn.ON_DEVICE_BARCODE_DETECT);
    }

    public final /* synthetic */ zzmd.zzq.zza zza(long j, zzmk zzmk, zzpz zzpz, List list) {
        zzmd.zzv.zzc zzb = zzmd.zzv.zzki().zzc(zzmd.zzs.zzkb().zzn(SystemClock.elapsedRealtime() - j).zzc(zzmk).zzz(zzata).zzaa(true).zzab(true)).zzb(this.zzawa.zzng()).zzb(zzpv.zzc(zzpz));
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                FirebaseVisionBarcode firebaseVisionBarcode = (FirebaseVisionBarcode) it.next();
                arrayList.add(firebaseVisionBarcode.zznd());
                arrayList2.add(firebaseVisionBarcode.zzne());
            }
            zzb.zzk(arrayList).zzl(arrayList2);
        }
        return zzmd.zzq.zzjx().zzb(zzb);
    }
}
