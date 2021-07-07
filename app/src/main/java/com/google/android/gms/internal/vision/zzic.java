package com.google.android.gms.internal.vision;

import java.util.Iterator;
import java.util.Map;

public final class zzic extends zzii {
    public final /* synthetic */ zzhz zzaal;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzic(zzhz zzhz) {
        super(zzhz, null);
        this.zzaal = zzhz;
    }

    @Override // com.google.android.gms.internal.vision.zzii, java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        return new zzib(this.zzaal, null);
    }

    public /* synthetic */ zzic(zzhz zzhz, zzia zzia) {
        this(zzhz);
    }
}
