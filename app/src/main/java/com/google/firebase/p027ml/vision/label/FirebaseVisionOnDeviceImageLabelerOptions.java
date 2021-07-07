package com.google.firebase.p027ml.vision.label;

import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzmd;
import com.google.android.gms.internal.firebase_ml.zzue;
import javax.annotation.concurrent.Immutable;

@Immutable
/* renamed from: com.google.firebase.ml.vision.label.FirebaseVisionOnDeviceImageLabelerOptions */
public class FirebaseVisionOnDeviceImageLabelerOptions {
    public final float zzavp;

    /* renamed from: com.google.firebase.ml.vision.label.FirebaseVisionOnDeviceImageLabelerOptions$Builder */
    public static class Builder {
        public float zzavp = 0.5f;

        public FirebaseVisionOnDeviceImageLabelerOptions build() {
            return new FirebaseVisionOnDeviceImageLabelerOptions(this.zzavp);
        }

        public Builder setConfidenceThreshold(float f) {
            Preconditions.checkArgument(Float.compare(f, 0.0f) >= 0 && Float.compare(f, 1.0f) <= 0, "Confidence Threshold should be in range [0.0f, 1.0f].");
            this.zzavp = f;
            return this;
        }
    }

    public FirebaseVisionOnDeviceImageLabelerOptions(float f) {
        this.zzavp = f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof FirebaseVisionOnDeviceImageLabelerOptions) && this.zzavp == ((FirebaseVisionOnDeviceImageLabelerOptions) obj).zzavp;
    }

    public float getConfidenceThreshold() {
        return this.zzavp;
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.zzavp));
    }

    public final zzmd.zzy zzno() {
        return (zzmd.zzy) ((zzue) zzmd.zzy.zzko().zzq(this.zzavp).zzrj());
    }
}
