package com.google.android.gms.internal.firebase_ml;

import com.p118pd.sdk.C8932ooOOO0o;
import java.util.Map;

public final class zzwo implements Comparable<zzwo>, Map.Entry<K, V> {
    public V value;
    public final /* synthetic */ zzwh zzbsf;
    public final K zzbsi;

    public zzwo(zzwh zzwh, Map.Entry<K, V> entry) {
        this(zzwh, entry.getKey(), entry.getValue());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(zzwo zzwo) {
        return ((Comparable) getKey()).compareTo((Comparable) zzwo.getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return equals(this.zzbsi, entry.getKey()) && equals(this.value, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.zzbsi;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.value;
    }

    public final int hashCode() {
        K k = this.zzbsi;
        int i = 0;
        int hashCode = k == null ? 0 : k.hashCode();
        V v = this.value;
        if (v != null) {
            i = v.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public final V setValue(V v) {
        this.zzbsf.zzta();
        V v2 = this.value;
        this.value = v;
        return v2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzbsi);
        String valueOf2 = String.valueOf(this.value);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append(C8932ooOOO0o.OooO0Oo);
        sb.append(valueOf2);
        return sb.toString();
    }

    public zzwo(zzwh zzwh, K k, V v) {
        this.zzbsf = zzwh;
        this.zzbsi = k;
        this.value = v;
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }
}
