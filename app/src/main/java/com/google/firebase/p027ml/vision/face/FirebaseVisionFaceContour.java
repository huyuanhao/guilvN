package com.google.firebase.p027ml.vision.face;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.firebase_ml.zzkj;
import com.google.firebase.p027ml.vision.common.FirebaseVisionPoint;
import java.util.List;

/* renamed from: com.google.firebase.ml.vision.face.FirebaseVisionFaceContour */
public class FirebaseVisionFaceContour {
    public static final int ALL_POINTS = 1;
    public static final int FACE = 2;
    public static final int LEFT_EYE = 7;
    public static final int LEFT_EYEBROW_BOTTOM = 4;
    public static final int LEFT_EYEBROW_TOP = 3;
    public static final int LOWER_LIP_BOTTOM = 12;
    public static final int LOWER_LIP_TOP = 11;
    public static final int NOSE_BOTTOM = 14;
    public static final int NOSE_BRIDGE = 13;
    public static final int RIGHT_EYE = 8;
    public static final int RIGHT_EYEBROW_BOTTOM = 6;
    public static final int RIGHT_EYEBROW_TOP = 5;
    public static final int UPPER_LIP_BOTTOM = 10;
    public static final int UPPER_LIP_TOP = 9;
    public final int type;
    public final List<FirebaseVisionPoint> zzayd;

    /* renamed from: com.google.firebase.ml.vision.face.FirebaseVisionFaceContour$ContourType */
    public @interface ContourType {
    }

    public FirebaseVisionFaceContour(@ContourType int i, @NonNull List<FirebaseVisionPoint> list) {
        this.type = i;
        this.zzayd = list;
    }

    @ContourType
    public int getFaceContourType() {
        return this.type;
    }

    public List<FirebaseVisionPoint> getPoints() {
        return this.zzayd;
    }

    public String toString() {
        return zzkj.zzaz("FirebaseVisionFaceContour").zzb("type", this.type).zzh("points", this.zzayd.toArray()).toString();
    }
}
