package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

public final class zzex implements zzfb {
    @Override // com.google.android.gms.internal.firebase_ml.zzfb
    public final String getName() {
        return "gzip";
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzfb
    public final void zza(zzhy zzhy, OutputStream outputStream) throws IOException {
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(new zzey(this, outputStream));
        zzhy.writeTo(gZIPOutputStream);
        gZIPOutputStream.close();
    }
}
