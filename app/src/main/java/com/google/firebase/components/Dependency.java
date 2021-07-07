package com.google.firebase.components;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.p118pd.sdk.C7522o0Ooo0o;

@KeepForSdk
public final class Dependency {
    public final Class<?> zza;
    public final int zzb;
    public final int zzc;

    public Dependency(Class<?> cls, int i, int i2) {
        this.zza = (Class) Preconditions.checkNotNull(cls, "Null dependency anInterface.");
        this.zzb = i;
        this.zzc = i2;
    }

    @KeepForSdk
    public static Dependency optional(Class<?> cls) {
        return new Dependency(cls, 0, 0);
    }

    @KeepForSdk
    public static Dependency optionalProvider(Class<?> cls) {
        return new Dependency(cls, 0, 1);
    }

    @KeepForSdk
    public static Dependency required(Class<?> cls) {
        return new Dependency(cls, 1, 0);
    }

    @KeepForSdk
    public static Dependency requiredProvider(Class<?> cls) {
        return new Dependency(cls, 1, 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Dependency) {
            Dependency dependency = (Dependency) obj;
            if (this.zza == dependency.zza && this.zzb == dependency.zzb && this.zzc == dependency.zzc) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() ^ 1000003) * 1000003) ^ this.zzb) * 1000003) ^ this.zzc;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.zza);
        sb.append(", required=");
        boolean z = false;
        sb.append(this.zzb == 1);
        sb.append(", direct=");
        if (this.zzc == 0) {
            z = true;
        }
        sb.append(z);
        sb.append(C7522o0Ooo0o.OooO0Oo);
        return sb.toString();
    }

    public final Class<?> zza() {
        return this.zza;
    }

    public final boolean zzb() {
        return this.zzb == 1;
    }

    public final boolean zzc() {
        return this.zzc == 0;
    }
}
