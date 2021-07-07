package com.google.android.gms.internal.firebase_ml;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public final class zzma extends WeakReference<Throwable> {
    public final int zzadu;

    public zzma(Throwable th, ReferenceQueue<Throwable> referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.zzadu = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final boolean equals(Object obj) {
        if (obj != null && obj.getClass() == zzma.class) {
            if (this == obj) {
                return true;
            }
            zzma zzma = (zzma) obj;
            return this.zzadu == zzma.zzadu && get() == zzma.get();
        }
    }

    public final int hashCode() {
        return this.zzadu;
    }
}
