package com.google.android.gms.internal.firebase_ml;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class zzwb {
    public static final zzwb zzbrq = new zzwb();
    public final zzwf zzbrr = new zzvd();
    public final ConcurrentMap<Class<?>, zzwe<?>> zzbrs = new ConcurrentHashMap();

    public static zzwb zzso() {
        return zzbrq;
    }

    public final <T> zzwe<T> zzad(T t) {
        return zzk(t.getClass());
    }

    public final <T> zzwe<T> zzk(Class<T> cls) {
        zzug.zza(cls, "messageType");
        zzwe<T> zzwe = (zzwe<T>) this.zzbrs.get(cls);
        if (zzwe != null) {
            return zzwe;
        }
        zzwe<T> zzj = this.zzbrr.zzj(cls);
        zzug.zza(cls, "messageType");
        zzug.zza(zzj, "schema");
        zzwe<T> zzwe2 = (zzwe<T>) this.zzbrs.putIfAbsent(cls, zzj);
        return zzwe2 != null ? zzwe2 : zzj;
    }
}
