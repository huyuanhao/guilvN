package com.google.android.gms.internal.firebase_ml;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class zzhs implements zzhy {
    public final Logger logger;
    public final Level zzaab;
    public final zzhy zztt;
    public final int zzuk;

    public zzhs(zzhy zzhy, Logger logger2, Level level, int i) {
        this.zztt = zzhy;
        this.logger = logger2;
        this.zzaab = level;
        this.zzuk = i;
    }

    /* JADX INFO: finally extract failed */
    @Override // com.google.android.gms.internal.firebase_ml.zzhy
    public final void writeTo(OutputStream outputStream) throws IOException {
        zzhr zzhr = new zzhr(outputStream, this.logger, this.zzaab, this.zzuk);
        try {
            this.zztt.writeTo(zzhr);
            zzhr.zzhj().close();
            outputStream.flush();
        } catch (Throwable th) {
            zzhr.zzhj().close();
            throw th;
        }
    }
}
