package com.google.firebase.p027ml.common.modeldownload;

import android.annotation.TargetApi;
import androidx.annotation.RequiresApi;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.firebase_ml.zzmd;
import com.google.android.gms.internal.firebase_ml.zzue;

/* renamed from: com.google.firebase.ml.common.modeldownload.FirebaseModelDownloadConditions */
public class FirebaseModelDownloadConditions {
    public final boolean zzarw;
    public final boolean zzarx;
    public final boolean zzary;

    /* renamed from: com.google.firebase.ml.common.modeldownload.FirebaseModelDownloadConditions$Builder */
    public static class Builder {
        public boolean zzarw = false;
        public boolean zzarx = false;
        public boolean zzary = false;

        public FirebaseModelDownloadConditions build() {
            return new FirebaseModelDownloadConditions(this.zzarw, this.zzarx, this.zzary);
        }

        @RequiresApi(24)
        @TargetApi(24)
        public Builder requireCharging() {
            this.zzarw = true;
            return this;
        }

        @RequiresApi(24)
        @TargetApi(24)
        public Builder requireDeviceIdle() {
            this.zzary = true;
            return this;
        }

        public Builder requireWifi() {
            this.zzarx = true;
            return this;
        }
    }

    public FirebaseModelDownloadConditions(boolean z, boolean z2, boolean z3) {
        this.zzarw = z;
        this.zzarx = z2;
        this.zzary = z3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FirebaseModelDownloadConditions)) {
            return false;
        }
        FirebaseModelDownloadConditions firebaseModelDownloadConditions = (FirebaseModelDownloadConditions) obj;
        return this.zzarw == firebaseModelDownloadConditions.zzarw && this.zzary == firebaseModelDownloadConditions.zzary && this.zzarx == firebaseModelDownloadConditions.zzarx;
    }

    public int hashCode() {
        return Objects.hashCode(Boolean.valueOf(this.zzarw), Boolean.valueOf(this.zzarx), Boolean.valueOf(this.zzary));
    }

    public boolean isChargingRequired() {
        return this.zzarw;
    }

    public boolean isDeviceIdleRequired() {
        return this.zzary;
    }

    public boolean isWifiRequired() {
        return this.zzarx;
    }

    public final zzmd.zzo.zzb zzmi() {
        return (zzmd.zzo.zzb) ((zzue) zzmd.zzo.zzb.zzjs().zzr(this.zzarw).zzt(this.zzary).zzs(this.zzarx).zzrj());
    }
}
