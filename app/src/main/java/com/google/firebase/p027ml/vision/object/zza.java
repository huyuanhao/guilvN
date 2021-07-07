package com.google.firebase.p027ml.vision.object;

import com.google.android.gms.common.internal.Objects;

/* renamed from: com.google.firebase.ml.vision.object.zza */
public final class zza {
    public final int zzaze;
    public final boolean zzazf;
    public final boolean zzazg;

    public zza(int i, boolean z, boolean z2) {
        this.zzaze = i;
        this.zzazf = z;
        this.zzazg = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zza)) {
            return false;
        }
        zza zza = (zza) obj;
        return zza.zzaze == this.zzaze && zza.zzazg == this.zzazg && zza.zzazf == this.zzazf;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zzaze), Boolean.valueOf(this.zzazg), Boolean.valueOf(this.zzazf));
    }
}
