package com.google.android.gms.internal.clearcut;

import com.p118pd.sdk.AbstractC8352oOoOOoO0;

public enum zzcq {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, 0),
    zzkz(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf((double) AbstractC8352oOoOOoO0.OooO0O0)),
    BOOLEAN(Boolean.TYPE, Boolean.class, false),
    STRING(String.class, String.class, ""),
    BYTE_STRING(zzbb.class, zzbb.class, zzbb.zzfi),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);
    
    public final Class<?> zzlh;
    public final Class<?> zzli;
    public final Object zzlj;

    /* access modifiers changed from: public */
    zzcq(Class cls, Class cls2, Object obj) {
        this.zzlh = cls;
        this.zzli = cls2;
        this.zzlj = obj;
    }

    public final Class<?> zzbq() {
        return this.zzli;
    }
}
