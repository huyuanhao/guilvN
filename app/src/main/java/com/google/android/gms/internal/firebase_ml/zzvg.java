package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;

public final class zzvg<K, V> {
    public final V value;
    public final zzvh<K, V> zzbqm;
    public final K zzbqn;

    public zzvg(zzxl zzxl, K k, zzxl zzxl2, V v) {
        this.zzbqm = new zzvh<>(zzxl, k, zzxl2, v);
        this.zzbqn = k;
        this.value = v;
    }

    public static <K, V> zzvg<K, V> zza(zzxl zzxl, K k, zzxl zzxl2, V v) {
        return new zzvg<>(zzxl, k, zzxl2, v);
    }

    public final int zzc(int i, K k, V v) {
        return zztl.zzcu(i) + zztl.zzdb(zza(this.zzbqm, k, v));
    }

    public final zzvh<K, V> zzsa() {
        return this.zzbqm;
    }

    public static <K, V> void zza(zztl zztl, zzvh<K, V> zzvh, K k, V v) throws IOException {
        zztw.zza(zztl, zzvh.zzbqo, 1, k);
        zztw.zza(zztl, zzvh.zzbqq, 2, v);
    }

    public static <K, V> int zza(zzvh<K, V> zzvh, K k, V v) {
        return zztw.zza(zzvh.zzbqo, 1, k) + zztw.zza(zzvh.zzbqq, 2, v);
    }
}
