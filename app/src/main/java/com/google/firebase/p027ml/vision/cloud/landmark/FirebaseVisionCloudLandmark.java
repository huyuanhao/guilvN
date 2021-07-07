package com.google.firebase.p027ml.vision.cloud.landmark;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.firebase_ml.zzjb;
import com.google.android.gms.internal.firebase_ml.zzjk;
import com.google.android.gms.internal.firebase_ml.zzpm;
import com.google.firebase.p027ml.vision.common.FirebaseVisionLatLng;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.concurrent.Immutable;

@Immutable
/* renamed from: com.google.firebase.ml.vision.cloud.landmark.FirebaseVisionCloudLandmark */
public class FirebaseVisionCloudLandmark {
    public final List<FirebaseVisionLatLng> locations;
    public final String mid;
    public final float zzatw;
    public final String zzawy;
    public final Rect zzawz;

    public FirebaseVisionCloudLandmark(@Nullable String str, float f, @Nullable Rect rect, @Nullable String str2, @NonNull List<FirebaseVisionLatLng> list) {
        this.zzawz = rect;
        this.zzawy = str == null ? "" : str;
        this.mid = str2 == null ? "" : str2;
        this.locations = list;
        if (Float.compare(f, 0.0f) < 0) {
            f = 0.0f;
        } else if (Float.compare(f, 1.0f) > 0) {
            f = 1.0f;
        }
        this.zzatw = f;
    }

    @Nullable
    public static FirebaseVisionCloudLandmark zza(@Nullable zzjb zzjb, float f) {
        ArrayList arrayList;
        if (zzjb == null) {
            return null;
        }
        float zza = zzpm.zza(zzjb.zzhv());
        Rect zza2 = zzpm.zza(zzjb.zzhu(), f);
        String description = zzjb.getDescription();
        String mid2 = zzjb.getMid();
        List<zzjk> locations2 = zzjb.getLocations();
        if (locations2 == null) {
            arrayList = new ArrayList();
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (zzjk zzjk : locations2) {
                if (!(zzjk.zzhy() == null || zzjk.zzhy().zzhw() == null || zzjk.zzhy().zzhx() == null)) {
                    arrayList2.add(new FirebaseVisionLatLng(zzjk.zzhy().zzhw().doubleValue(), zzjk.zzhy().zzhx().doubleValue()));
                }
            }
            arrayList = arrayList2;
        }
        return new FirebaseVisionCloudLandmark(description, zza, zza2, mid2, arrayList);
    }

    @Nullable
    public Rect getBoundingBox() {
        return this.zzawz;
    }

    public float getConfidence() {
        return this.zzatw;
    }

    public String getEntityId() {
        return this.mid;
    }

    public String getLandmark() {
        return this.zzawy;
    }

    public List<FirebaseVisionLatLng> getLocations() {
        return this.locations;
    }
}
