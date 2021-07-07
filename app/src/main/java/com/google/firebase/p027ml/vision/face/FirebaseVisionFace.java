package com.google.firebase.p027ml.vision.face;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.firebase_ml.zzkj;
import com.google.android.gms.internal.firebase_ml.zzkl;
import com.google.android.gms.vision.face.Contour;
import com.google.android.gms.vision.face.Face;
import com.google.android.gms.vision.face.Landmark;
import com.google.firebase.p027ml.vision.common.FirebaseVisionPoint;
import com.google.firebase.p027ml.vision.face.FirebaseVisionFaceContour;
import com.google.firebase.p027ml.vision.face.FirebaseVisionFaceLandmark;
import java.util.ArrayList;
import java.util.Iterator;
import javax.annotation.concurrent.Immutable;

@Immutable
/* renamed from: com.google.firebase.ml.vision.face.FirebaseVisionFace */
public class FirebaseVisionFace {
    public static final int INVALID_ID = -1;
    public static final float UNCOMPUTED_PROBABILITY = -1.0f;
    public Rect zzawz;
    public int zzaxv = -1;
    public float zzaxw = -1.0f;
    public float zzaxx = -1.0f;
    public float zzaxy = -1.0f;
    public float zzaxz;
    public float zzaya;
    public final SparseArray<FirebaseVisionFaceLandmark> zzayb = new SparseArray<>();
    public final SparseArray<FirebaseVisionFaceContour> zzayc = new SparseArray<>();

    public FirebaseVisionFace(@NonNull Face face) {
        int i;
        PointF position = face.getPosition();
        float f = position.x;
        this.zzawz = new Rect((int) f, (int) position.y, (int) (f + face.getWidth()), (int) (position.y + face.getHeight()));
        this.zzaxv = face.getId();
        for (Landmark landmark : face.getLandmarks()) {
            if (zzbq(landmark.getType()) && landmark.getPosition() != null) {
                this.zzayb.put(landmark.getType(), new FirebaseVisionFaceLandmark(landmark.getType(), new FirebaseVisionPoint(Float.valueOf(landmark.getPosition().x), Float.valueOf(landmark.getPosition().y), null)));
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Contour> it = face.getContours().iterator();
        while (true) {
            boolean z = true;
            if (it.hasNext()) {
                Contour next = it.next();
                switch (next.getType()) {
                    case 1:
                        i = 2;
                        break;
                    case 2:
                        i = 3;
                        break;
                    case 3:
                        i = 4;
                        break;
                    case 4:
                        i = 5;
                        break;
                    case 5:
                        i = 6;
                        break;
                    case 6:
                        i = 7;
                        break;
                    case 7:
                        i = 8;
                        break;
                    case 8:
                        i = 9;
                        break;
                    case 9:
                        i = 10;
                        break;
                    case 10:
                        i = 11;
                        break;
                    case 11:
                        i = 12;
                        break;
                    case 12:
                        i = 13;
                        break;
                    case 13:
                        i = 14;
                        break;
                    default:
                        i = -1;
                        break;
                }
                if ((i > 14 || i <= 0) ? false : z) {
                    PointF[] positions = next.getPositions();
                    ArrayList arrayList2 = new ArrayList();
                    if (positions != null) {
                        for (PointF pointF : positions) {
                            arrayList2.add(new FirebaseVisionPoint(Float.valueOf(pointF.x), Float.valueOf(pointF.y), null));
                        }
                        this.zzayc.put(i, new FirebaseVisionFaceContour(i, arrayList2));
                        arrayList.addAll(arrayList2);
                    }
                }
            } else {
                this.zzayc.put(1, new FirebaseVisionFaceContour(1, arrayList));
                this.zzaxz = face.getEulerY();
                this.zzaya = face.getEulerZ();
                this.zzaxy = face.getIsSmilingProbability();
                this.zzaxx = face.getIsLeftEyeOpenProbability();
                this.zzaxw = face.getIsRightEyeOpenProbability();
                return;
            }
        }
    }

    public static boolean zzbq(@FirebaseVisionFaceLandmark.LandmarkType int i) {
        return i == 0 || i == 1 || i == 7 || i == 3 || i == 9 || i == 4 || i == 10 || i == 5 || i == 11 || i == 6;
    }

    public Rect getBoundingBox() {
        return this.zzawz;
    }

    public FirebaseVisionFaceContour getContour(@FirebaseVisionFaceContour.ContourType int i) {
        FirebaseVisionFaceContour firebaseVisionFaceContour = this.zzayc.get(i);
        if (firebaseVisionFaceContour != null) {
            return firebaseVisionFaceContour;
        }
        return new FirebaseVisionFaceContour(i, new ArrayList());
    }

    public float getHeadEulerAngleY() {
        return this.zzaxz;
    }

    public float getHeadEulerAngleZ() {
        return this.zzaya;
    }

    @Nullable
    public FirebaseVisionFaceLandmark getLandmark(@FirebaseVisionFaceLandmark.LandmarkType int i) {
        return this.zzayb.get(i);
    }

    public float getLeftEyeOpenProbability() {
        return this.zzaxx;
    }

    public float getRightEyeOpenProbability() {
        return this.zzaxw;
    }

    public float getSmilingProbability() {
        return this.zzaxy;
    }

    public int getTrackingId() {
        return this.zzaxv;
    }

    public String toString() {
        zzkl zza = zzkj.zzaz("FirebaseVisionFace").zzh("boundingBox", this.zzawz).zzb("trackingId", this.zzaxv).zza("rightEyeOpenProbability", this.zzaxw).zza("leftEyeOpenProbability", this.zzaxx).zza("smileProbability", this.zzaxy).zza("eulerY", this.zzaxz).zza("eulerZ", this.zzaya);
        zzkl zzaz = zzkj.zzaz("Landmarks");
        for (int i = 0; i <= 11; i++) {
            if (zzbq(i)) {
                StringBuilder sb = new StringBuilder(20);
                sb.append("landmark_");
                sb.append(i);
                zzaz.zzh(sb.toString(), getLandmark(i));
            }
        }
        zza.zzh("landmarks", zzaz.toString());
        zzkl zzaz2 = zzkj.zzaz("Contours");
        for (int i2 = 1; i2 <= 14; i2++) {
            StringBuilder sb2 = new StringBuilder(19);
            sb2.append("Contour_");
            sb2.append(i2);
            zzaz2.zzh(sb2.toString(), getContour(i2));
        }
        zza.zzh("contours", zzaz2.toString());
        return zza.toString();
    }

    public final void zza(SparseArray<FirebaseVisionFaceContour> sparseArray) {
        this.zzayc.clear();
        for (int i = 0; i < sparseArray.size(); i++) {
            this.zzayc.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
        }
    }

    public final void zzbr(int i) {
        this.zzaxv = -1;
    }

    public final SparseArray<FirebaseVisionFaceContour> zznm() {
        return this.zzayc;
    }
}
