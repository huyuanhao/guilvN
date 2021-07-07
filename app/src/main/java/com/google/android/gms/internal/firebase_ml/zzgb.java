package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.io.OutputStream;

public final class zzgb extends zzev {
    public final Object data;
    public final zzge zzwf;
    public String zzwg;

    public zzgb(zzge zzge, Object obj) {
        super("application/json; charset=UTF-8");
        this.zzwf = (zzge) zzks.checkNotNull(zzge);
        this.data = zzks.checkNotNull(obj);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhy
    public final void writeTo(OutputStream outputStream) throws IOException {
        zzgf zza = this.zzwf.zza(outputStream, zzeu());
        if (this.zzwg != null) {
            zza.zzga();
            zza.zzan(this.zzwg);
        }
        zza.zzd(this.data);
        if (this.zzwg != null) {
            zza.zzgb();
        }
        zza.flush();
    }

    public final zzgb zzal(String str) {
        this.zzwg = str;
        return this;
    }
}
