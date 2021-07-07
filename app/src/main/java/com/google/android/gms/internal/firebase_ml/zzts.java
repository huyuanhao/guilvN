package com.google.android.gms.internal.firebase_ml;

public final class zzts {
    public final int number;
    public final Object object;

    public zzts(Object obj, int i) {
        this.object = obj;
        this.number = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzts)) {
            return false;
        }
        zzts zzts = (zzts) obj;
        if (this.object == zzts.object && this.number == zzts.number) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.object) * 65535) + this.number;
    }
}
