package com.google.android.gms.internal.firebase_ml;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.firebase_ml.zzmd;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p027ml.vision.cloud.FirebaseVisionCloudDetectorOptions;
import com.google.firebase.p027ml.vision.common.FirebaseVisionImage;
import com.google.firebase.p027ml.vision.label.FirebaseVisionImageLabel;
import com.p118pd.sdk.C7997oO0ooOO0;
import exocr.idcard.CameraManager;
import java.util.ArrayList;
import java.util.List;

public final class zzqc extends zzpo<List<FirebaseVisionImageLabel>> {
    public zzqc(@NonNull FirebaseApp firebaseApp, @NonNull FirebaseVisionCloudDetectorOptions firebaseVisionCloudDetectorOptions) {
        super(firebaseApp, "LABEL_DETECTION", firebaseVisionCloudDetectorOptions);
        zznu.zza(firebaseApp, 1).zza(zzmd.zzq.zzjx(), zzmn.CLOUD_IMAGE_LABEL_CREATE);
    }

    public final Task<List<FirebaseVisionImageLabel>> detectInImage(@NonNull FirebaseVisionImage firebaseVisionImage) {
        zznu.zza(this.zzapo, 1).zza(zzmd.zzq.zzjx(), zzmn.CLOUD_IMAGE_LABEL_DETECT);
        return super.zza(firebaseVisionImage);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.android.gms.internal.firebase_ml.zzpo
    public final /* synthetic */ List<FirebaseVisionImageLabel> zza(@NonNull zzir zzir, float f) {
        if (zzir.zzhn() == null) {
            return new ArrayList();
        }
        List<zzjb> zzhn = zzir.zzhn();
        ArrayList arrayList = new ArrayList();
        for (zzjb zzjb : zzhn) {
            FirebaseVisionImageLabel zza = FirebaseVisionImageLabel.zza(zzjb);
            if (zza != null) {
                arrayList.add(zza);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzpo
    public final int zznh() {
        return C7997oO0ooOO0.OooOoO;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzpo
    public final int zzni() {
        return CameraManager.OooO0O0;
    }
}
