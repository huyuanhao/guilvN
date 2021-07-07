package com.google.android.gms.internal.firebase_messaging;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public final class zzf extends WeakReference<Throwable> {
    public final int zzg;

    public zzf(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.zzg = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == zzf.class) {
            if (this == obj) {
                return true;
            }
            zzf zzf = (zzf) obj;
            return this.zzg == zzf.zzg && get() == zzf.get();
        }
    }

    public final int hashCode() {
        return this.zzg;
    }
}
