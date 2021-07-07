package com.google.firebase.p027ml.vision.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.react.views.text.FontMetricsUtil;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.firebase_ml.zzkj;

/* renamed from: com.google.firebase.ml.vision.common.FirebaseVisionPoint */
public final class FirebaseVisionPoint {
    public final Float zzaxj;
    public final Float zzaxk;
    public final Float zzaxl = null;

    public FirebaseVisionPoint(@NonNull Float f, @NonNull Float f2, @Nullable Float f3) {
        this.zzaxj = f;
        this.zzaxk = f2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseVisionPoint)) {
            return false;
        }
        FirebaseVisionPoint firebaseVisionPoint = (FirebaseVisionPoint) obj;
        return Objects.equal(this.zzaxj, firebaseVisionPoint.zzaxj) && Objects.equal(this.zzaxk, firebaseVisionPoint.zzaxk) && Objects.equal(null, null);
    }

    public final Float getX() {
        return this.zzaxj;
    }

    public final Float getY() {
        return this.zzaxk;
    }

    @Nullable
    public final Float getZ() {
        return null;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzaxj, this.zzaxk, null);
    }

    public final String toString() {
        return zzkj.zzaz("FirebaseVisionPoint").zzh(FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT, this.zzaxj).zzh("y", this.zzaxk).zzh("z", null).toString();
    }
}
