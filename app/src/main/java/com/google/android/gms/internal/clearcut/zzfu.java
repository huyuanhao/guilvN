package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzfu;
import java.io.IOException;

public class zzfu<M extends zzfu<M>> extends zzfz {
    public zzfw zzrj;

    @Override // com.google.android.gms.internal.clearcut.zzfz
    public void zza(zzfs zzfs) throws IOException {
        if (this.zzrj != null) {
            for (int i = 0; i < this.zzrj.size(); i++) {
                this.zzrj.zzaq(i).zza(zzfs);
            }
        }
    }

    @Override // com.google.android.gms.internal.clearcut.zzfz
    public int zzen() {
        if (this.zzrj != null) {
            for (int i = 0; i < this.zzrj.size(); i++) {
                this.zzrj.zzaq(i).zzen();
            }
        }
        return 0;
    }

    /* renamed from: zzeo */
    public M clone() throws CloneNotSupportedException {
        M m = (M) ((zzfu) super.clone());
        zzfy.zza(this, m);
        return m;
    }

    @Override // com.google.android.gms.internal.clearcut.zzfz
    public /* synthetic */ zzfz zzep() throws CloneNotSupportedException {
        return (zzfu) clone();
    }
}
