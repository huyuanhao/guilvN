package com.google.android.gms.internal.firebase_ml;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;

public final class zzhg extends AbstractMap<String, Object> {
    public final Object object;
    public final zzhd zztx;

    public zzhg(Object obj, boolean z) {
        this.object = obj;
        zzhd zza = zzhd.zza(obj.getClass(), z);
        this.zztx = zza;
        zzks.checkArgument(!zza.isEnum());
    }

    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    /* Return type fixed from 'java.util.Set' to match base method */
    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Set<Map.Entry<String, Object>> entrySet() {
        return new zzhj(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        zzhl zzao;
        if ((obj instanceof String) && (zzao = this.zztx.zzao((String) obj)) != null) {
            return zzao.zzh(this.object);
        }
        return null;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // java.util.AbstractMap, java.util.Map
    public final /* synthetic */ Object put(String str, Object obj) {
        String str2 = str;
        zzhl zzao = this.zztx.zzao(str2);
        String valueOf = String.valueOf(str2);
        zzks.checkNotNull(zzao, valueOf.length() != 0 ? "no field of key ".concat(valueOf) : new String("no field of key "));
        Object zzh = zzao.zzh(this.object);
        zzao.zzb(this.object, zzks.checkNotNull(obj));
        return zzh;
    }
}
