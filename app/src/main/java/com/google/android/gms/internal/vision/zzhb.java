package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;

public final class zzhb implements zzha {
    @Override // com.google.android.gms.internal.vision.zzha
    public final Object zzb(Object obj, Object obj2) {
        zzgz zzgz = (zzgz) obj;
        zzgz zzgz2 = (zzgz) obj2;
        if (!zzgz2.isEmpty()) {
            if (!zzgz.isMutable()) {
                zzgz = zzgz.zzfz();
            }
            zzgz.zza(zzgz2);
        }
        return zzgz;
    }

    @Override // com.google.android.gms.internal.vision.zzha
    public final Map<?, ?> zzj(Object obj) {
        return (zzgz) obj;
    }

    @Override // com.google.android.gms.internal.vision.zzha
    public final Map<?, ?> zzk(Object obj) {
        return (zzgz) obj;
    }

    @Override // com.google.android.gms.internal.vision.zzha
    public final boolean zzl(Object obj) {
        return !((zzgz) obj).isMutable();
    }

    @Override // com.google.android.gms.internal.vision.zzha
    public final Object zzm(Object obj) {
        ((zzgz) obj).zzci();
        return obj;
    }

    @Override // com.google.android.gms.internal.vision.zzha
    public final Object zzn(Object obj) {
        return zzgz.zzfy().zzfz();
    }

    @Override // com.google.android.gms.internal.vision.zzha
    public final zzgy<?, ?> zzo(Object obj) {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.vision.zzha
    public final int zzb(int i, Object obj, Object obj2) {
        zzgz zzgz = (zzgz) obj;
        if (zzgz.isEmpty()) {
            return 0;
        }
        Iterator it = zzgz.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }
}
