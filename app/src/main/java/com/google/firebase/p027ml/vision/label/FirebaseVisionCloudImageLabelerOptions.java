package com.google.firebase.p027ml.vision.label;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import javax.annotation.concurrent.Immutable;

@Immutable
/* renamed from: com.google.firebase.ml.vision.label.FirebaseVisionCloudImageLabelerOptions */
public class FirebaseVisionCloudImageLabelerOptions {
    public final float zzavp;
    public final boolean zzawj;

    /* renamed from: com.google.firebase.ml.vision.label.FirebaseVisionCloudImageLabelerOptions$Builder */
    public static class Builder {
        public float zzavp = 0.5f;
        public boolean zzawj = false;

        public FirebaseVisionCloudImageLabelerOptions build() {
            return new FirebaseVisionCloudImageLabelerOptions(this.zzavp, this.zzawj);
        }

        public Builder enforceCertFingerprintMatch() {
            this.zzawj = true;
            return this;
        }

        public Builder setConfidenceThreshold(float f) {
            Preconditions.checkArgument(Float.compare(f, 0.0f) >= 0 && Float.compare(f, 1.0f) <= 0, "Confidence Threshold should be in range [0.0f, 1.0f].");
            this.zzavp = f;
            return this;
        }
    }

    public FirebaseVisionCloudImageLabelerOptions(float f, boolean z) {
        this.zzavp = f;
        this.zzawj = z;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseVisionCloudImageLabelerOptions)) {
            return false;
        }
        FirebaseVisionCloudImageLabelerOptions firebaseVisionCloudImageLabelerOptions = (FirebaseVisionCloudImageLabelerOptions) obj;
        return Float.compare(this.zzavp, firebaseVisionCloudImageLabelerOptions.zzavp) == 0 && this.zzawj == firebaseVisionCloudImageLabelerOptions.zzawj;
    }

    public float getConfidenceThreshold() {
        return this.zzavp;
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.zzavp), Boolean.valueOf(this.zzawj));
    }

    public boolean isEnforceCertFingerprintMatch() {
        return this.zzawj;
    }
}
