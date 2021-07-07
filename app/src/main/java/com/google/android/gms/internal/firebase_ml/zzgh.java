package com.google.android.gms.internal.firebase_ml;

import java.util.Collection;
import java.util.HashSet;

public final class zzgh {
    public final zzge zzwf;
    public Collection<String> zzwi = new HashSet();

    public zzgh(zzge zzge) {
        this.zzwf = (zzge) zzks.checkNotNull(zzge);
    }

    public final zzgh zza(Collection<String> collection) {
        this.zzwi = collection;
        return this;
    }

    public final zzgg zzgf() {
        return new zzgg(this);
    }
}
