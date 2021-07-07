package com.google.android.gms.internal.firebase_ml;

import java.util.Map;

public final class zzut<K> implements Map.Entry<K, Object> {
    public Map.Entry<K, zzur> zzbpw;

    public zzut(Map.Entry<K, zzur> entry) {
        this.zzbpw = entry;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.zzbpw.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.zzbpw.getValue() == null) {
            return null;
        }
        return zzur.zzrt();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof zzvo) {
            return this.zzbpw.getValue().zzi((zzvo) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    public final zzur zzru() {
        return this.zzbpw.getValue();
    }
}
