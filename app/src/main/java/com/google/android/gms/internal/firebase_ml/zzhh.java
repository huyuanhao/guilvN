package com.google.android.gms.internal.firebase_ml;

import java.util.Locale;
import java.util.Map;

public final class zzhh implements Map.Entry<String, Object> {
    public Object zzzd;
    public final zzhl zzze;
    public final /* synthetic */ zzhg zzzf;

    public zzhh(zzhg zzhg, zzhl zzhl, Object obj) {
        this.zzzf = zzhg;
        this.zzze = zzhl;
        this.zzzd = zzks.checkNotNull(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return ((String) getKey()).equals(entry.getKey()) && getValue().equals(entry.getValue());
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Map.Entry
    public final /* synthetic */ String getKey() {
        String name = this.zzze.getName();
        return this.zzzf.zztx.zzhc() ? name.toLowerCase(Locale.US) : name;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.zzzd;
    }

    public final int hashCode() {
        return ((String) getKey()).hashCode() ^ getValue().hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.zzzd;
        this.zzzd = zzks.checkNotNull(obj);
        this.zzze.zzb(this.zzzf.object, obj);
        return obj2;
    }
}
