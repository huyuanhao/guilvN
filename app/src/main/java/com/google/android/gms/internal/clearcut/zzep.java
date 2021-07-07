package com.google.android.gms.internal.clearcut;

import com.p118pd.sdk.C8932ooOOO0o;
import java.util.Map;

public final class zzep implements Comparable<zzep>, Map.Entry<K, V> {
    public V value;
    public final /* synthetic */ zzei zzos;
    public final K zzov;

    public zzep(zzei zzei, K k, V v) {
        this.zzos = zzei;
        this.zzov = k;
        this.value = v;
    }

    public zzep(zzei zzei, Map.Entry<K, V> entry) {
        this(zzei, entry.getKey(), entry.getValue());
    }

    public static boolean equals(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(zzep zzep) {
        return ((Comparable) getKey()).compareTo((Comparable) zzep.getKey());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return equals(this.zzov, entry.getKey()) && equals(this.value, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.zzov;
    }

    @Override // java.util.Map.Entry
    public final V getValue() {
        return this.value;
    }

    public final int hashCode() {
        K k = this.zzov;
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
        this.zzos.zzdu();
        V v2 = this.value;
        this.value = v;
        return v2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzov);
        String valueOf2 = String.valueOf(this.value);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append(C8932ooOOO0o.OooO0Oo);
        sb.append(valueOf2);
        return sb.toString();
    }
}
