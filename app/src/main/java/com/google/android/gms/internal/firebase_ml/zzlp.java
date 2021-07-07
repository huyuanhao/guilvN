package com.google.android.gms.internal.firebase_ml;

import java.util.AbstractMap;
import java.util.Map;

public final class zzlp extends zzlg<Map.Entry<K, V>> {
    public final /* synthetic */ zzlo zzadm;

    public zzlp(zzlo zzlo) {
        this.zzadm = zzlo;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        zzks.zzb(i, this.zzadm.size);
        int i2 = i * 2;
        return new AbstractMap.SimpleImmutableEntry(this.zzadm.zzadd[i2], this.zzadm.zzadd[i2 + 1]);
    }

    public final int size() {
        return this.zzadm.size;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzlf
    public final boolean zzio() {
        return true;
    }
}
