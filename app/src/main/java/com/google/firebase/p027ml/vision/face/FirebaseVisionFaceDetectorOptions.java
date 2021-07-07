package com.google.firebase.p027ml.vision.face;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.firebase_ml.zzkj;
import com.google.android.gms.internal.firebase_ml.zzmd;
import com.google.android.gms.internal.firebase_ml.zzue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions */
public class FirebaseVisionFaceDetectorOptions {
    public static final int ACCURATE = 2;
    public static final int ALL_CLASSIFICATIONS = 2;
    public static final int ALL_CONTOURS = 2;
    public static final int ALL_LANDMARKS = 2;
    public static final int FAST = 1;
    public static final int NO_CLASSIFICATIONS = 1;
    public static final int NO_CONTOURS = 1;
    public static final int NO_LANDMARKS = 1;
    public final boolean trackingEnabled;
    public final int zzayf;
    public final int zzayg;
    public final int zzayh;
    public final int zzayi;
    public final float zzayj;

    /* renamed from: com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions$Builder */
    public static class Builder {
        public boolean trackingEnabled = false;
        public int zzayf = 1;
        public int zzayg = 1;
        public int zzayh = 1;
        public int zzayi = 1;
        public float zzayj = 0.1f;

        public FirebaseVisionFaceDetectorOptions build() {
            return new FirebaseVisionFaceDetectorOptions(this.zzayf, this.zzayg, this.zzayh, this.zzayi, this.trackingEnabled, this.zzayj);
        }

        public Builder enableTracking() {
            this.trackingEnabled = true;
            return this;
        }

        public Builder setClassificationMode(int i) {
            this.zzayh = i;
            return this;
        }

        public Builder setContourMode(int i) {
            this.zzayg = i;
            return this;
        }

        public Builder setLandmarkMode(int i) {
            this.zzayf = i;
            return this;
        }

        public Builder setMinFaceSize(float f) {
            this.zzayj = f;
            return this;
        }

        public Builder setPerformanceMode(int i) {
            this.zzayi = i;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions$ClassificationMode */
    public @interface ClassificationMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions$ContourMode */
    public @interface ContourMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions$LandmarkMode */
    public @interface LandmarkMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.firebase.ml.vision.face.FirebaseVisionFaceDetectorOptions$PerformanceMode */
    public @interface PerformanceMode {
    }

    public FirebaseVisionFaceDetectorOptions(int i, int i2, int i3, int i4, boolean z, float f) {
        this.zzayf = i;
        this.zzayg = i2;
        this.zzayh = i3;
        this.zzayi = i4;
        this.trackingEnabled = z;
        this.zzayj = f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseVisionFaceDetectorOptions)) {
            return false;
        }
        FirebaseVisionFaceDetectorOptions firebaseVisionFaceDetectorOptions = (FirebaseVisionFaceDetectorOptions) obj;
        return Float.floatToIntBits(this.zzayj) == Float.floatToIntBits(firebaseVisionFaceDetectorOptions.zzayj) && this.zzayf == firebaseVisionFaceDetectorOptions.zzayf && this.zzayg == firebaseVisionFaceDetectorOptions.zzayg && this.zzayi == firebaseVisionFaceDetectorOptions.zzayi && this.trackingEnabled == firebaseVisionFaceDetectorOptions.trackingEnabled && this.zzayh == firebaseVisionFaceDetectorOptions.zzayh;
    }

    public int getClassificationMode() {
        return this.zzayh;
    }

    public int getContourMode() {
        return this.zzayg;
    }

    public int getLandmarkMode() {
        return this.zzayf;
    }

    public float getMinFaceSize() {
        return this.zzayj;
    }

    public int getPerformanceMode() {
        return this.zzayi;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Float.floatToIntBits(this.zzayj)), Integer.valueOf(this.zzayf), Integer.valueOf(this.zzayg), Integer.valueOf(this.zzayi), Boolean.valueOf(this.trackingEnabled), Integer.valueOf(this.zzayh));
    }

    public boolean isTrackingEnabled() {
        return this.trackingEnabled;
    }

    public String toString() {
        return zzkj.zzaz("FaceDetectorOptions").zzb("landmarkMode", this.zzayf).zzb("contourMode", this.zzayg).zzb("classificationMode", this.zzayh).zzb("performanceMode", this.zzayi).zza("trackingEnabled", this.trackingEnabled).zza("minFaceSize", this.zzayj).toString();
    }

    public final zzmd.zzp zznn() {
        zzmd.zzp.zzd zzd;
        zzmd.zzp.zzb zzb;
        zzmd.zzp.zze zze;
        zzmd.zzp.zzc zzc;
        zzmd.zzp.zza zzju = zzmd.zzp.zzju();
        int i = this.zzayf;
        if (i == 1) {
            zzd = zzmd.zzp.zzd.NO_LANDMARKS;
        } else if (i != 2) {
            zzd = zzmd.zzp.zzd.UNKNOWN_LANDMARKS;
        } else {
            zzd = zzmd.zzp.zzd.ALL_LANDMARKS;
        }
        zzmd.zzp.zza zzb2 = zzju.zzb(zzd);
        int i2 = this.zzayh;
        if (i2 == 1) {
            zzb = zzmd.zzp.zzb.NO_CLASSIFICATIONS;
        } else if (i2 != 2) {
            zzb = zzmd.zzp.zzb.UNKNOWN_CLASSIFICATIONS;
        } else {
            zzb = zzmd.zzp.zzb.ALL_CLASSIFICATIONS;
        }
        zzmd.zzp.zza zzb3 = zzb2.zzb(zzb);
        int i3 = this.zzayi;
        if (i3 == 1) {
            zze = zzmd.zzp.zze.FAST;
        } else if (i3 != 2) {
            zze = zzmd.zzp.zze.UNKNOWN_PERFORMANCE;
        } else {
            zze = zzmd.zzp.zze.ACCURATE;
        }
        zzmd.zzp.zza zzb4 = zzb3.zzb(zze);
        int i4 = this.zzayg;
        if (i4 == 1) {
            zzc = zzmd.zzp.zzc.NO_CONTOURS;
        } else if (i4 != 2) {
            zzc = zzmd.zzp.zzc.UNKNOWN_CONTOURS;
        } else {
            zzc = zzmd.zzp.zzc.ALL_CONTOURS;
        }
        return (zzmd.zzp) ((zzue) zzb4.zzb(zzc).zzv(isTrackingEnabled()).zzn(this.zzayj).zzrj());
    }
}
