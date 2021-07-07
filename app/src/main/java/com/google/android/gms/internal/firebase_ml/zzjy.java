package com.google.android.gms.internal.firebase_ml;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class zzjy<T> extends zzko<T> {
    public static final zzjy<Object> zzaas = new zzjy<>();

    public final boolean equals(@NullableDecl Object obj) {
        return obj == this;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzko
    public final T get() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final int hashCode() {
        return 2040732332;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzko
    public final boolean isPresent() {
        return false;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
