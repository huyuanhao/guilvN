package com.p118pd.sdk;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: com.pd.sdk.ooOOOOo  reason: case insensitive filesystem */
public class C8946ooOOOOo implements Closeable {
    public static final byte OooO00o = 13;
    public static final byte OooO0O0 = 10;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final InputStream f22206OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Charset f22207OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f22208OooO00o;
    public int o00oO0O;
    public int o0ooOO0;

    /* renamed from: com.pd.sdk.ooOOOOo$OooO00o */
    public class OooO00o extends ByteArrayOutputStream {
        public OooO00o(int i) {
            super(i);
        }

        public String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, (i <= 0 || ((ByteArrayOutputStream) this).buf[i + -1] != 13) ? ((ByteArrayOutputStream) this).count : i - 1, C8946ooOOOOo.this.f22207OooO00o.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public C8946ooOOOOo(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f22206OooO00o) {
            if (this.f22208OooO00o != null) {
                this.f22208OooO00o = null;
                this.f22206OooO00o.close();
            }
        }
    }

    public C8946ooOOOOo(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        } else if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        } else if (charset.equals(C8951ooOOOo0.OooO00o)) {
            this.f22206OooO00o = inputStream;
            this.f22207OooO00o = charset;
            this.f22208OooO00o = new byte[i];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m20619OooO00o() throws IOException {
        int i;
        int i2;
        synchronized (this.f22206OooO00o) {
            if (this.f22208OooO00o != null) {
                if (this.o00oO0O >= this.o0ooOO0) {
                    OooO00o();
                }
                for (int i3 = this.o00oO0O; i3 != this.o0ooOO0; i3++) {
                    if (this.f22208OooO00o[i3] == 10) {
                        if (i3 != this.o00oO0O) {
                            i2 = i3 - 1;
                            if (this.f22208OooO00o[i2] == 13) {
                                String str = new String(this.f22208OooO00o, this.o00oO0O, i2 - this.o00oO0O, this.f22207OooO00o.name());
                                this.o00oO0O = i3 + 1;
                                return str;
                            }
                        }
                        i2 = i3;
                        String str2 = new String(this.f22208OooO00o, this.o00oO0O, i2 - this.o00oO0O, this.f22207OooO00o.name());
                        this.o00oO0O = i3 + 1;
                        return str2;
                    }
                }
                OooO00o oooO00o = new OooO00o((this.o0ooOO0 - this.o00oO0O) + 80);
                loop1:
                while (true) {
                    oooO00o.write(this.f22208OooO00o, this.o00oO0O, this.o0ooOO0 - this.o00oO0O);
                    this.o0ooOO0 = -1;
                    OooO00o();
                    i = this.o00oO0O;
                    while (true) {
                        if (i != this.o0ooOO0) {
                            if (this.f22208OooO00o[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                if (i != this.o00oO0O) {
                    oooO00o.write(this.f22208OooO00o, this.o00oO0O, i - this.o00oO0O);
                }
                this.o00oO0O = i + 1;
                return oooO00o.toString();
            }
            throw new IOException("LineReader is closed");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20620OooO00o() {
        return this.o0ooOO0 == -1;
    }

    private void OooO00o() throws IOException {
        InputStream inputStream = this.f22206OooO00o;
        byte[] bArr = this.f22208OooO00o;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.o00oO0O = 0;
            this.o0ooOO0 = read;
            return;
        }
        throw new EOFException();
    }
}
