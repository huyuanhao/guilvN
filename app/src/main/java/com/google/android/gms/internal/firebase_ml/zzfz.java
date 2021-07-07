package com.google.android.gms.internal.firebase_ml;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class zzfz extends FilterInputStream {
    public long zzwb = 0;
    public final /* synthetic */ zzfy zzwc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzfz(zzfy zzfy, InputStream inputStream) {
        super(inputStream);
        this.zzwc = zzfy;
    }

    private final void zzfw() throws IOException {
        long contentLength = this.zzwc.getContentLength();
        if (contentLength != -1) {
            long j = this.zzwb;
            if (j != 0 && j < contentLength) {
                long j2 = this.zzwb;
                StringBuilder sb = new StringBuilder(102);
                sb.append("Connection closed prematurely: bytesRead = ");
                sb.append(j2);
                sb.append(", Content-Length = ");
                sb.append(contentLength);
                throw new IOException(sb.toString());
            }
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int read = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (read == -1) {
            zzfw();
        } else {
            this.zzwb += (long) read;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long skip = ((FilterInputStream) this).in.skip(j);
        this.zzwb += skip;
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int read = ((FilterInputStream) this).in.read();
        if (read == -1) {
            zzfw();
        } else {
            this.zzwb++;
        }
        return read;
    }
}
