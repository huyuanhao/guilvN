package com.google.android.gms.internal.vision;

import java.util.Map;

public final class zzgk<K> implements Map.Entry<K, Object> {
    public Map.Entry<K, zzgi> zzyf;

    public zzgk(Map.Entry<K, zzgi> entry) {
        this.zzyf = entry;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.zzyf.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.zzyf.getValue() == null) {
            return null;
        }
        return zzgi.zzfr();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof zzhf) {
            return this.zzyf.getValue().zzi((zzhf) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    public final zzgi zzfs() {
        return this.zzyf.getValue();
    }
}
