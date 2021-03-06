package com.google.android.gms.internal.vision;

import com.p118pd.sdk.AbstractC8352oOoOOoO0;

public enum zzgh {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, 0),
    zzxt(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf((double) AbstractC8352oOoOOoO0.OooO0O0)),
    BOOLEAN(Boolean.TYPE, Boolean.class, false),
    STRING(String.class, String.class, ""),
    BYTE_STRING(zzeo.class, zzeo.class, zzeo.zzrx),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);
    
    public final Class<?> zzyb;
    public final Class<?> zzyc;
    public final Object zzyd;

    /* access modifiers changed from: public */
    zzgh(Class cls, Class cls2, Object obj) {
        this.zzyb = cls;
        this.zzyc = cls2;
        this.zzyd = obj;
    }

    public final Class<?> zzfq() {
        return this.zzyc;
    }
}
