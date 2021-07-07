package com.google.android.gms.internal.firebase_ml;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

public final class zzff {
    public final zzgy zztv;
    public final StringBuilder zztw;
    public final zzhd zztx;
    public final List<Type> zzty;

    public zzff(zzfe zzfe, StringBuilder sb) {
        Class<?> cls = zzfe.getClass();
        this.zzty = Arrays.asList(cls);
        this.zztx = zzhd.zza(cls, true);
        this.zztw = sb;
        this.zztv = new zzgy(zzfe);
    }
}
