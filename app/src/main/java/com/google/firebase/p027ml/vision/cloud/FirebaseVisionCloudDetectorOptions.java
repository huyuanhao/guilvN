package com.google.firebase.p027ml.vision.cloud;

import com.google.android.gms.common.internal.Objects;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import javax.annotation.concurrent.Immutable;

@Immutable
/* renamed from: com.google.firebase.ml.vision.cloud.FirebaseVisionCloudDetectorOptions */
public class FirebaseVisionCloudDetectorOptions {
    public static final FirebaseVisionCloudDetectorOptions DEFAULT = new Builder().build();
    public static final int LATEST_MODEL = 2;
    public static final int STABLE_MODEL = 1;
    public final int zzawh;
    public final int zzawi;
    public final boolean zzawj;

    /* renamed from: com.google.firebase.ml.vision.cloud.FirebaseVisionCloudDetectorOptions$Builder */
    public static class Builder {
        public int zzawh = 10;
        public int zzawi = 1;
        public boolean zzawj = false;

        public FirebaseVisionCloudDetectorOptions build() {
            return new FirebaseVisionCloudDetectorOptions(this.zzawh, this.zzawi, this.zzawj);
        }

        public Builder enforceCertFingerprintMatch() {
            this.zzawj = true;
            return this;
        }

        public Builder setMaxResults(int i) {
            this.zzawh = i;
            return this;
        }

        public Builder setModelType(int i) {
            this.zzawi = i;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.firebase.ml.vision.cloud.FirebaseVisionCloudDetectorOptions$ModelType */
    public @interface ModelType {
    }

    public FirebaseVisionCloudDetectorOptions(int i, int i2, boolean z) {
        this.zzawh = i;
        this.zzawi = i2;
        this.zzawj = z;
    }

    public Builder builder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseVisionCloudDetectorOptions)) {
            return false;
        }
        FirebaseVisionCloudDetectorOptions firebaseVisionCloudDetectorOptions = (FirebaseVisionCloudDetectorOptions) obj;
        return this.zzawh == firebaseVisionCloudDetectorOptions.zzawh && this.zzawi == firebaseVisionCloudDetectorOptions.zzawi && this.zzawj == firebaseVisionCloudDetectorOptions.zzawj;
    }

    public int getMaxResults() {
        return this.zzawh;
    }

    public int getModelType() {
        return this.zzawi;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzawh), Integer.valueOf(this.zzawi), Boolean.valueOf(this.zzawj));
    }

    public final boolean isEnforceCertFingerprintMatch() {
        return this.zzawj;
    }
}
