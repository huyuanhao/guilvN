package com.google.android.gms.internal.firebase_ml;

import java.lang.reflect.Field;
import java.util.Map;

public final class zzgy {
    public final Map<String, zzgz> zzye = new zzgx();
    public final Map<Field, zzgz> zzyf = new zzgx();
    public final Object zzyg;

    public zzgy(Object obj) {
        this.zzyg = obj;
    }

    public final void zza(Field field, Class<?> cls, Object obj) {
        zzgz zzgz = this.zzyf.get(field);
        if (zzgz == null) {
            zzgz = new zzgz(cls);
            this.zzyf.put(field, zzgz);
        }
        zzks.checkArgument(cls == zzgz.zzyh);
        zzgz.zzyi.add(obj);
    }

    public final void zzha() {
        for (Map.Entry<String, zzgz> entry : this.zzye.entrySet()) {
            ((Map) this.zzyg).put(entry.getKey(), entry.getValue().zzhb());
        }
        for (Map.Entry<Field, zzgz> entry2 : this.zzyf.entrySet()) {
            zzhl.zza(entry2.getKey(), this.zzyg, entry2.getValue().zzhb());
        }
    }
}
