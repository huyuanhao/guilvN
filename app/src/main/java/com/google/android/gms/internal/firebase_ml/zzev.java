package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.nio.charset.Charset;

public abstract class zzev implements zzfa {
    public zzfg zztm;
    public long zztn;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public zzev(String str) {
        this(str == null ? null : new zzfg(str));
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzfa
    public final long getLength() throws IOException {
        if (this.zztn == -1) {
            this.zztn = zzhn.zzb(this);
        }
        return this.zztn;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzfa
    public final String getType() {
        zzfg zzfg = this.zztm;
        if (zzfg == null) {
            return null;
        }
        return zzfg.zzew();
    }

    public final Charset zzeu() {
        zzfg zzfg = this.zztm;
        return (zzfg == null || zzfg.zzey() == null) ? zzhc.UTF_8 : this.zztm.zzey();
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzfa
    public final boolean zzev() {
        return true;
    }

    public zzev(zzfg zzfg) {
        this.zztn = -1;
        this.zztm = zzfg;
    }
}
