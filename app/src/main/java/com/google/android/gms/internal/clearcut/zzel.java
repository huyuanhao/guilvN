package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map;

public final class zzel extends zzer {
    public final /* synthetic */ zzei zzos;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzel(zzei zzei) {
        super(zzei, null);
        this.zzos = zzei;
    }

    public /* synthetic */ zzel(zzei zzei, zzej zzej) {
        this(zzei);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, com.google.android.gms.internal.clearcut.zzer, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new zzek(this.zzos, null);
    }
}
