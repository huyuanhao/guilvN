package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzjn;
import java.io.IOException;

public abstract class zzjn<M extends zzjn<M>> extends zzjt {
    public zzjp zzadg;

    @Override // com.google.android.gms.internal.vision.zzjt
    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzjn zzjn = (zzjn) super.clone();
        zzjr.zza(this, zzjn);
        return zzjn;
    }

    @Override // com.google.android.gms.internal.vision.zzjt
    public void zza(zzjl zzjl) throws IOException {
        if (this.zzadg != null) {
            for (int i = 0; i < this.zzadg.size(); i++) {
                this.zzadg.zzbx(i).zza(zzjl);
            }
        }
    }

    @Override // com.google.android.gms.internal.vision.zzjt
    public final /* synthetic */ zzjt zzhr() throws CloneNotSupportedException {
        return (zzjn) clone();
    }

    @Override // com.google.android.gms.internal.vision.zzjt
    public int zzt() {
        if (this.zzadg == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.zzadg.size(); i2++) {
            i += this.zzadg.zzbx(i2).zzt();
        }
        return i;
    }

    public final boolean zza(zzjk zzjk, int i) throws IOException {
        int position = zzjk.getPosition();
        if (!zzjk.zzal(i)) {
            return false;
        }
        int i2 = i >>> 3;
        zzjv zzjv = new zzjv(i, zzjk.zzv(position, zzjk.getPosition() - position));
        zzjq zzjq = null;
        zzjp zzjp = this.zzadg;
        if (zzjp == null) {
            this.zzadg = new zzjp();
        } else {
            zzjq = zzjp.zzbw(i2);
        }
        if (zzjq == null) {
            zzjq = new zzjq();
            this.zzadg.zza(i2, zzjq);
        }
        zzjq.zza(zzjv);
        return true;
    }
}
