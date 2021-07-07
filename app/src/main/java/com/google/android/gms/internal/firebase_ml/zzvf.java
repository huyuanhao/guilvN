package com.google.android.gms.internal.firebase_ml;

public final class zzvf implements zzvn {
    public zzvn[] zzbql;

    public zzvf(zzvn... zzvnArr) {
        this.zzbql = zzvnArr;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzvn
    public final boolean zzg(Class<?> cls) {
        for (zzvn zzvn : this.zzbql) {
            if (zzvn.zzg(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzvn
    public final zzvm zzh(Class<?> cls) {
        zzvn[] zzvnArr = this.zzbql;
        for (zzvn zzvn : zzvnArr) {
            if (zzvn.zzg(cls)) {
                return zzvn.zzh(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
