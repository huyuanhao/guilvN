package com.google.android.gms.internal.firebase_ml;

import java.util.Map;

public final class zzvk implements zzvj {
    @Override // com.google.android.gms.internal.firebase_ml.zzvj
    public final int zzd(int i, Object obj, Object obj2) {
        zzvi zzvi = (zzvi) obj;
        zzvg zzvg = (zzvg) obj2;
        int i2 = 0;
        if (zzvi.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : zzvi.entrySet()) {
            i2 += zzvg.zzc(i, entry.getKey(), entry.getValue());
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzvj
    public final Object zzf(Object obj, Object obj2) {
        zzvi zzvi = (zzvi) obj;
        zzvi zzvi2 = (zzvi) obj2;
        if (!zzvi2.isEmpty()) {
            if (!zzvi.isMutable()) {
                zzvi = zzvi.zzsc();
            }
            zzvi.zza(zzvi2);
        }
        return zzvi;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzvj
    public final Map<?, ?> zzu(Object obj) {
        return (zzvi) obj;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzvj
    public final Map<?, ?> zzv(Object obj) {
        return (zzvi) obj;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzvj
    public final boolean zzw(Object obj) {
        return !((zzvi) obj).isMutable();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzvj
    public final Object zzx(Object obj) {
        ((zzvi) obj).zzpt();
        return obj;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzvj
    public final Object zzy(Object obj) {
        return zzvi.zzsb().zzsc();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzvj
    public final zzvh<?, ?> zzz(Object obj) {
        return ((zzvg) obj).zzsa();
    }
}
