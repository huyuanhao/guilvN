package com.google.android.gms.internal.firebase_ml;

import com.umeng.message.proguard.C3848l;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class zzkt<T> extends zzko<T> {
    public final T zzabi;

    public zzkt(T t) {
        this.zzabi = t;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof zzkt) {
            return this.zzabi.equals(((zzkt) obj).zzabi);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzko
    public final T get() {
        return this.zzabi;
    }

    public final int hashCode() {
        return this.zzabi.hashCode() + 1502476572;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzko
    public final boolean isPresent() {
        return true;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzabi);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 13);
        sb.append("Optional.of(");
        sb.append(valueOf);
        sb.append(C3848l.f10402t);
        return sb.toString();
    }
}
