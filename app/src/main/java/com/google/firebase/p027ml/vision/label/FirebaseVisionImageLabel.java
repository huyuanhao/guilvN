package com.google.firebase.p027ml.vision.label;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.firebase_ml.zzjb;
import com.google.android.gms.internal.firebase_ml.zzpm;
import com.google.android.gms.vision.label.ImageLabel;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;

@Immutable
/* renamed from: com.google.firebase.ml.vision.label.FirebaseVisionImageLabel */
public class FirebaseVisionImageLabel {
    public final String text;
    public final float zzatw;
    public final String zzavo;

    public FirebaseVisionImageLabel(@NonNull ImageLabel imageLabel) {
        this(imageLabel.getLabel(), imageLabel.getConfidence(), imageLabel.getMid());
    }

    @Nullable
    public static FirebaseVisionImageLabel zza(@Nullable zzjb zzjb) {
        if (zzjb == null) {
            return null;
        }
        return new FirebaseVisionImageLabel(zzjb.getDescription(), zzpm.zza(zzjb.zzhv()), zzjb.getMid());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseVisionImageLabel)) {
            return false;
        }
        FirebaseVisionImageLabel firebaseVisionImageLabel = (FirebaseVisionImageLabel) obj;
        return Objects.equal(this.zzavo, firebaseVisionImageLabel.getEntityId()) && Objects.equal(this.text, firebaseVisionImageLabel.getText()) && Float.compare(this.zzatw, firebaseVisionImageLabel.getConfidence()) == 0;
    }

    public float getConfidence() {
        return this.zzatw;
    }

    @Nullable
    public String getEntityId() {
        return this.zzavo;
    }

    public String getText() {
        return this.text;
    }

    public int hashCode() {
        return Objects.hashCode(this.zzavo, this.text, Float.valueOf(this.zzatw));
    }

    @VisibleForTesting
    public FirebaseVisionImageLabel(@Nullable String str, float f, @Nullable String str2) {
        this.text = str == null ? "" : str;
        this.zzavo = str2;
        if (Float.compare(f, 0.0f) < 0) {
            f = 0.0f;
        } else if (Float.compare(f, 1.0f) > 0) {
            f = 1.0f;
        }
        this.zzatw = f;
    }
}
