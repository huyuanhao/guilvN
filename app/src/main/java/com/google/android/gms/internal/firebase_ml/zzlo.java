package com.google.android.gms.internal.firebase_ml;

import java.util.Map;

public final class zzlo<K, V> extends zzll<Map.Entry<K, V>> {
    public final transient int size;
    public final transient Object[] zzadd;
    public final transient zzlj<K, V> zzadk;
    public final transient int zzadl = 0;

    public zzlo(zzlj<K, V> zzlj, Object[] objArr, int i, int i2) {
        this.zzadk = zzlj;
        this.zzadd = objArr;
        this.size = i2;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzlf
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.zzadk.get(key))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int size() {
        return this.size;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzlf
    public final int zza(Object[] objArr, int i) {
        return zzin().zza(objArr, i);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzlf
    /* renamed from: zzij */
    public final zzlt<Map.Entry<K, V>> iterator() {
        return (zzlt) zzin().iterator();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzlf
    public final boolean zzio() {
        return true;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzll
    public final zzlg<Map.Entry<K, V>> zziu() {
        return new zzlp(this);
    }
}
