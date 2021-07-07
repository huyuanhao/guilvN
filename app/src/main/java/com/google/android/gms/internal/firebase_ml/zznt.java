package com.google.android.gms.internal.firebase_ml;

import com.google.android.gms.common.internal.Objects;
import com.p118pd.sdk.C7522o0Ooo0o;

public final class zznt<T> {
    public final String zzapl;
    public final T zzapm;

    public zznt(String str, T t) {
        if (str != null) {
            this.zzapl = str;
            if (t != null) {
                this.zzapm = t;
                return;
            }
            throw new NullPointerException("Null options");
        }
        throw new NullPointerException("Null firebasePersistentKey");
    }

    public static <T> zznt<T> zzj(String str, T t) {
        return new zznt<>(str, t);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zznt) {
            zznt zznt = (zznt) obj;
            return this.zzapl.equals(zznt.zzapl) && this.zzapm.equals(zznt.zzapm);
        }
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzapl, this.zzapm);
    }

    public final String toString() {
        String str = this.zzapl;
        String valueOf = String.valueOf(this.zzapm);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 58 + String.valueOf(valueOf).length());
        sb.append("MlModelDriverInstanceKey{firebasePersistentKey=");
        sb.append(str);
        sb.append(", options=");
        sb.append(valueOf);
        sb.append(C7522o0Ooo0o.OooO0Oo);
        return sb.toString();
    }
}
