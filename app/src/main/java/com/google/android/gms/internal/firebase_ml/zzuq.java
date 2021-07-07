package com.google.android.gms.internal.firebase_ml;

import com.p118pd.sdk.AbstractC8352oOoOOoO0;

public enum zzuq {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, 0),
    zzbpk(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf((double) AbstractC8352oOoOOoO0.OooO0O0)),
    BOOLEAN(Boolean.TYPE, Boolean.class, false),
    STRING(String.class, String.class, ""),
    BYTE_STRING(zzsw.class, zzsw.class, zzsw.zzbkl),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);
    
    public final Class<?> zzbps;
    public final Class<?> zzbpt;
    public final Object zzbpu;

    /* access modifiers changed from: public */
    zzuq(Class cls, Class cls2, Object obj) {
        this.zzbps = cls;
        this.zzbpt = cls2;
        this.zzbpu = obj;
    }

    public final Class<?> zzrs() {
        return this.zzbpt;
    }
}
