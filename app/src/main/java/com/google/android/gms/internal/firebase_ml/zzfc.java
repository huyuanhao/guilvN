package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.io.OutputStream;

public final class zzfc implements zzhy {
    public final zzhy zztt;
    public final zzfb zztu;

    public zzfc(zzhy zzhy, zzfb zzfb) {
        this.zztt = (zzhy) zzks.checkNotNull(zzhy);
        this.zztu = (zzfb) zzks.checkNotNull(zzfb);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzhy
    public final void writeTo(OutputStream outputStream) throws IOException {
        this.zztu.zza(this.zztt, outputStream);
    }
}
