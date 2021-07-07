package com.google.android.gms.internal.firebase_ml;

import java.util.Iterator;
import java.util.Map;

public final class zzwk extends zzwq {
    public final /* synthetic */ zzwh zzbsf;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzwk(zzwh zzwh) {
        super(zzwh, null);
        this.zzbsf = zzwh;
    }

    @Override // java.util.AbstractCollection, com.google.android.gms.internal.firebase_ml.zzwq, java.util.Collection, java.util.Set, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new zzwj(this.zzbsf, null);
    }

    public /* synthetic */ zzwk(zzwh zzwh, zzwi zzwi) {
        this(zzwh);
    }
}
