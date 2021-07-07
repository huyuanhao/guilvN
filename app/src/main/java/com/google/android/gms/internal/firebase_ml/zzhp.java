package com.google.android.gms.internal.firebase_ml;

import com.umeng.message.proguard.C3848l;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class zzhp extends ByteArrayOutputStream {
    public boolean closed;
    public final Logger logger;
    public final int zzaaa;
    public final Level zzaab;
    public int zzzz;

    public zzhp(Logger logger2, Level level, int i) {
        this.logger = (Logger) zzks.checkNotNull(logger2);
        this.zzaab = (Level) zzks.checkNotNull(level);
        zzks.checkArgument(i >= 0);
        this.zzaaa = i;
    }

    public static void zza(StringBuilder sb, int i) {
        if (i == 1) {
            sb.append("1 byte");
            return;
        }
        sb.append(NumberFormat.getInstance().format((long) i));
        sb.append(" bytes");
    }

    @Override // java.io.OutputStream, java.io.ByteArrayOutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (!this.closed) {
            if (this.zzzz != 0) {
                StringBuilder sb = new StringBuilder("Total: ");
                zza(sb, this.zzzz);
                if (((ByteArrayOutputStream) this).count != 0 && ((ByteArrayOutputStream) this).count < this.zzzz) {
                    sb.append(" (logging first ");
                    zza(sb, ((ByteArrayOutputStream) this).count);
                    sb.append(C3848l.f10402t);
                }
                this.logger.logp(Level.CONFIG, "com.google.api.client.util.LoggingByteArrayOutputStream", "close", sb.toString());
                if (((ByteArrayOutputStream) this).count != 0) {
                    this.logger.logp(this.zzaab, "com.google.api.client.util.LoggingByteArrayOutputStream", "close", toString("UTF-8").replaceAll("[\\x00-\\x09\\x0B\\x0C\\x0E-\\x1F\\x7F]", " "));
                }
            }
            this.closed = true;
        }
    }

    @Override // java.io.OutputStream, java.io.ByteArrayOutputStream
    public final synchronized void write(int i) {
        zzks.checkArgument(!this.closed);
        this.zzzz++;
        if (((ByteArrayOutputStream) this).count < this.zzaaa) {
            super.write(i);
        }
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        zzks.checkArgument(!this.closed);
        this.zzzz += i2;
        if (((ByteArrayOutputStream) this).count < this.zzaaa) {
            int i3 = ((ByteArrayOutputStream) this).count + i2;
            if (i3 > this.zzaaa) {
                i2 += this.zzaaa - i3;
            }
            super.write(bArr, i, i2);
        }
    }
}
