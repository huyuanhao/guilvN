package anet.channel.util;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: anet.channel.util.a */
public class C0217a extends InputStream {

    /* renamed from: a */
    public InputStream f470a = null;

    /* renamed from: b */
    public long f471b = 0;

    public C0217a(InputStream inputStream) {
        if (inputStream != null) {
            this.f470a = inputStream;
            return;
        }
        throw new NullPointerException("input stream cannot be null");
    }

    /* renamed from: a */
    public long mo3765a() {
        return this.f471b;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        this.f471b++;
        return this.f470a.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.f470a.read(bArr, i, i2);
        if (read != -1) {
            this.f471b += (long) read;
        }
        return read;
    }
}
