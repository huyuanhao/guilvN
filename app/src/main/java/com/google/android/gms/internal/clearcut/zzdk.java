package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map;

public final class zzdk implements zzdj {
    @Override // com.google.android.gms.internal.clearcut.zzdj
    public final int zzb(int i, Object obj, Object obj2) {
        zzdi zzdi = (zzdi) obj;
        if (zzdi.isEmpty()) {
            return 0;
        }
        Iterator it = zzdi.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.clearcut.zzdj
    public final Object zzb(Object obj, Object obj2) {
        zzdi zzdi = (zzdi) obj;
        zzdi zzdi2 = (zzdi) obj2;
        if (!zzdi2.isEmpty()) {
            if (!zzdi.isMutable()) {
                zzdi = zzdi.zzca();
            }
            zzdi.zza(zzdi2);
        }
        return zzdi;
    }

    @Override // com.google.android.gms.internal.clearcut.zzdj
    public final Map<?, ?> zzg(Object obj) {
        return (zzdi) obj;
    }

    @Override // com.google.android.gms.internal.clearcut.zzdj
    public final Map<?, ?> zzh(Object obj) {
        return (zzdi) obj;
    }

    @Override // com.google.android.gms.internal.clearcut.zzdj
    public final boolean zzi(Object obj) {
        return !((zzdi) obj).isMutable();
    }

    @Override // com.google.android.gms.internal.clearcut.zzdj
    public final Object zzj(Object obj) {
        ((zzdi) obj).zzv();
        return obj;
    }

    @Override // com.google.android.gms.internal.clearcut.zzdj
    public final Object zzk(Object obj) {
        return zzdi.zzbz().zzca();
    }

    @Override // com.google.android.gms.internal.clearcut.zzdj
    public final zzdh<?, ?> zzl(Object obj) {
        throw new NoSuchMethodError();
    }
}
