package com.google.android.gms.internal.firebase_ml;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

public final class zzhj extends AbstractSet<Map.Entry<String, Object>> {
    public final /* synthetic */ zzhg zzzf;

    public zzhj(zzhg zzhg) {
        this.zzzf = zzhg;
    }

    public final void clear() {
        for (String str : this.zzzf.zztx.zzyp) {
            this.zzzf.zztx.zzao(str).zzb(this.zzzf.object, null);
        }
    }

    public final boolean isEmpty() {
        for (String str : this.zzzf.zztx.zzyp) {
            if (this.zzzf.zztx.zzao(str).zzh(this.zzzf.object) != null) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzhi(this.zzzf);
    }

    public final int size() {
        int i = 0;
        for (String str : this.zzzf.zztx.zzyp) {
            if (this.zzzf.zztx.zzao(str).zzh(this.zzzf.object) != null) {
                i++;
            }
        }
        return i;
    }
}
