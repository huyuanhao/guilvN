package com.google.android.gms.internal.vision;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class zzhs {
    public static final zzhs zzzw = new zzhs();
    public final zzhx zzzx;
    public final ConcurrentMap<Class<?>, zzhw<?>> zzzy = new ConcurrentHashMap();

    public zzhs() {
        String[] strArr = {"com.google.protobuf.AndroidProto3SchemaFactory"};
        zzhx zzhx = null;
        for (int i = 0; i <= 0; i++) {
            zzhx = zzr(strArr[0]);
            if (zzhx != null) {
                break;
            }
        }
        this.zzzx = zzhx == null ? new zzgu() : zzhx;
    }

    public static zzhs zzgl() {
        return zzzw;
    }

    public static zzhx zzr(String str) {
        try {
            return (zzhx) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final <T> zzhw<T> zzf(Class<T> cls) {
        zzga.zza((Object) cls, "messageType");
        zzhw<T> zzhw = (zzhw<T>) this.zzzy.get(cls);
        if (zzhw != null) {
            return zzhw;
        }
        zzhw<T> zze = this.zzzx.zze(cls);
        zzga.zza((Object) cls, "messageType");
        zzga.zza((Object) zze, "schema");
        zzhw<T> zzhw2 = (zzhw<T>) this.zzzy.putIfAbsent(cls, zze);
        return zzhw2 != null ? zzhw2 : zze;
    }

    public final <T> zzhw<T> zzs(T t) {
        return zzf(t.getClass());
    }
}
