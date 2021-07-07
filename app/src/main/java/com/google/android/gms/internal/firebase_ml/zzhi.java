package com.google.android.gms.internal.firebase_ml;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

public final class zzhi implements Iterator<Map.Entry<String, Object>> {
    public final /* synthetic */ zzhg zzzf;
    public int zzzg = -1;
    public zzhl zzzh;
    public Object zzzi;
    public boolean zzzj;
    public boolean zzzk;
    public zzhl zzzl;

    public zzhi(zzhg zzhg) {
        this.zzzf = zzhg;
    }

    public final boolean hasNext() {
        if (!this.zzzk) {
            this.zzzk = true;
            this.zzzi = null;
            while (this.zzzi == null) {
                int i = this.zzzg + 1;
                this.zzzg = i;
                if (i >= this.zzzf.zztx.zzyp.size()) {
                    break;
                }
                zzhd zzhd = this.zzzf.zztx;
                zzhl zzao = zzhd.zzao(zzhd.zzyp.get(this.zzzg));
                this.zzzh = zzao;
                this.zzzi = zzao.zzh(this.zzzf.object);
            }
        }
        if (this.zzzi != null) {
            return true;
        }
        return false;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.Iterator
    public final /* synthetic */ Map.Entry<String, Object> next() {
        if (hasNext()) {
            zzhl zzhl = this.zzzh;
            this.zzzl = zzhl;
            Object obj = this.zzzi;
            this.zzzk = false;
            this.zzzj = false;
            this.zzzh = null;
            this.zzzi = null;
            return new zzhh(this.zzzf, zzhl, obj);
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        zzks.checkState(this.zzzl != null && !this.zzzj);
        this.zzzj = true;
        this.zzzl.zzb(this.zzzf.object, null);
    }
}
