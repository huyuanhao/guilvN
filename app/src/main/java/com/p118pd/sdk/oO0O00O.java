package com.p118pd.sdk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* renamed from: com.pd.sdk.oO0O00O */
public class oO0O00O extends InputStream {
    public static final Queue<oO0O00O> OooO00o = oO0O0O00.m19524OooO00o(0);

    /* renamed from: OooO00o  reason: collision with other field name */
    public IOException f20891OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public InputStream f20892OooO00o;

    @NonNull
    public static oO0O00O OooO00o(@NonNull InputStream inputStream) {
        oO0O00O poll;
        synchronized (OooO00o) {
            poll = OooO00o.poll();
        }
        if (poll == null) {
            poll = new oO0O00O();
        }
        poll.m19517OooO00o(inputStream);
        return poll;
    }

    public static void OooO0O0() {
        while (!OooO00o.isEmpty()) {
            OooO00o.remove();
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f20892OooO00o.available();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public void close() throws IOException {
        this.f20892OooO00o.close();
    }

    public void mark(int i) {
        this.f20892OooO00o.mark(i);
    }

    public boolean markSupported() {
        return this.f20892OooO00o.markSupported();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.f20892OooO00o.read(bArr);
        } catch (IOException e) {
            this.f20891OooO00o = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f20892OooO00o.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        try {
            return this.f20892OooO00o.skip(j);
        } catch (IOException e) {
            this.f20891OooO00o = e;
            return 0;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        try {
            return this.f20892OooO00o.read(bArr, i, i2);
        } catch (IOException e) {
            this.f20891OooO00o = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.f20892OooO00o.read();
        } catch (IOException e) {
            this.f20891OooO00o = e;
            return -1;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19517OooO00o(@NonNull InputStream inputStream) {
        this.f20892OooO00o = inputStream;
    }

    @Nullable
    public IOException OooO00o() {
        return this.f20891OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19516OooO00o() {
        this.f20891OooO00o = null;
        this.f20892OooO00o = null;
        synchronized (OooO00o) {
            OooO00o.offer(this);
        }
    }
}
