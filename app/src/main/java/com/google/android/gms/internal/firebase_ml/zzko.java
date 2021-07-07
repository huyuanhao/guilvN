package com.google.android.gms.internal.firebase_ml;

import java.io.Serializable;

public abstract class zzko<T> implements Serializable {
    public static <T> zzko<T> zzig() {
        return zzjy.zzaas;
    }

    public static <T> zzko<T> zzk(T t) {
        return new zzkt(zzks.checkNotNull(t));
    }

    public abstract T get();

    public abstract boolean isPresent();
}
