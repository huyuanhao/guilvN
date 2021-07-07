package com.p118pd.sdk;

import com.umeng.message.proguard.C3848l;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import okio.ByteString;

/* renamed from: com.pd.sdk.OoOOO00 */
public final class OoOOO00 implements oOOO0000 {
    public final OOOO000 OooO00o = new OOOO000();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC8210oOOoO0o0 f17004OooO00o;
    public boolean OooO0O0;

    public OoOOO00(AbstractC8210oOOoO0o0 ooooo0o0) {
        if (ooooo0o0 != null) {
            this.f17004OooO00o = ooooo0o0;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    @Override // com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO0000
    public OOOO000 OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.oOOO0000
    public oOOO0000 OooO0O0(int i) throws IOException {
        if (!this.OooO0O0) {
            this.OooO00o.OooO0O0(i);
            return OooO0O0();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.p118pd.sdk.oOOO0000
    public oOOO0000 OooO0OO(int i) throws IOException {
        if (!this.OooO0O0) {
            this.OooO00o.OooO0OO(i);
            return OooO0O0();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.p118pd.sdk.oOOO0000
    public oOOO0000 OooO0Oo(int i) throws IOException {
        if (!this.OooO0O0) {
            this.OooO00o.OooO0Oo(i);
            return OooO0O0();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.p118pd.sdk.oOOO0000
    public oOOO0000 OooO0o(int i) throws IOException {
        if (!this.OooO0O0) {
            this.OooO00o.OooO0o(i);
            return OooO0O0();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.p118pd.sdk.oOOO0000
    public oOOO0000 OooO0o0(int i) throws IOException {
        if (!this.OooO0O0) {
            this.OooO00o.OooO0o0(i);
            return OooO0O0();
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.io.Closeable, com.p118pd.sdk.AbstractC8210oOOoO0o0, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() throws IOException {
        if (!this.OooO0O0) {
            Throwable th = null;
            try {
                if (this.OooO00o.f16981OooO00o > 0) {
                    this.f17004OooO00o.write(this.OooO00o, this.OooO00o.f16981OooO00o);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f17004OooO00o.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.OooO0O0 = true;
            if (th != null) {
                C8976ooOOoO00.OooO00o(th);
            }
        }
    }

    @Override // com.p118pd.sdk.oOOO0000, com.p118pd.sdk.AbstractC8210oOOoO0o0, java.io.Flushable
    public void flush() throws IOException {
        if (!this.OooO0O0) {
            OOOO000 oooo000 = this.OooO00o;
            long j = oooo000.f16981OooO00o;
            if (j > 0) {
                this.f17004OooO00o.write(oooo000, j);
            }
            this.f17004OooO00o.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public boolean isOpen() {
        return !this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC8210oOOoO0o0
    public C9193oooOoo timeout() {
        return this.f17004OooO00o.timeout();
    }

    public String toString() {
        return "buffer(" + this.f17004OooO00o + C3848l.f10402t;
    }

    @Override // com.p118pd.sdk.AbstractC8210oOOoO0o0
    public void write(OOOO000 oooo000, long j) throws IOException {
        if (!this.OooO0O0) {
            this.OooO00o.write(oooo000, j);
            OooO0O0();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.p118pd.sdk.oOOO0000
    public oOOO0000 OooO00o(ByteString byteString) throws IOException {
        if (!this.OooO0O0) {
            this.OooO00o.OooO00o(byteString);
            return OooO0O0();
        }
        throw new IllegalStateException("closed");
    }

    /* renamed from: com.pd.sdk.OoOOO00$OooO00o */
    public class OooO00o extends OutputStream {
        public OooO00o() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            OoOOO00.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            OoOOO00 ooOOO00 = OoOOO00.this;
            if (!ooOOO00.OooO0O0) {
                ooOOO00.flush();
            }
        }

        public String toString() {
            return OoOOO00.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
            OoOOO00 ooOOO00 = OoOOO00.this;
            if (!ooOOO00.OooO0O0) {
                ooOOO00.OooO00o.OooO0o0((int) ((byte) i));
                OoOOO00.this.OooO0O0();
                return;
            }
            throw new IOException("closed");
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            OoOOO00 ooOOO00 = OoOOO00.this;
            if (!ooOOO00.OooO0O0) {
                ooOOO00.OooO00o.OooO00o(bArr, i, i2);
                OoOOO00.this.OooO0O0();
                return;
            }
            throw new IOException("closed");
        }
    }

    @Override // com.p118pd.sdk.oOOO0000
    public oOOO0000 OooO0O0(long j) throws IOException {
        if (!this.OooO0O0) {
            this.OooO00o.OooO0O0(j);
            return OooO0O0();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.p118pd.sdk.oOOO0000
    public oOOO0000 OooO0OO(long j) throws IOException {
        if (!this.OooO0O0) {
            this.OooO00o.OooO0OO(j);
            return OooO0O0();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.p118pd.sdk.oOOO0000
    public oOOO0000 OooO0Oo(long j) throws IOException {
        if (!this.OooO0O0) {
            this.OooO00o.OooO0Oo(j);
            return OooO0O0();
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (!this.OooO0O0) {
            int write = this.OooO00o.write(byteBuffer);
            OooO0O0();
            return write;
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.p118pd.sdk.oOOO0000
    public oOOO0000 OooO00o(String str) throws IOException {
        if (!this.OooO0O0) {
            this.OooO00o.OooO00o(str);
            return OooO0O0();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.p118pd.sdk.oOOO0000
    public oOOO0000 OooO0O0() throws IOException {
        if (!this.OooO0O0) {
            long OooO0Oo = this.OooO00o.OooO0Oo();
            if (OooO0Oo > 0) {
                this.f17004OooO00o.write(this.OooO00o, OooO0Oo);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.p118pd.sdk.oOOO0000
    public oOOO0000 OooO00o(String str, int i, int i2) throws IOException {
        if (!this.OooO0O0) {
            this.OooO00o.OooO00o(str, i, i2);
            return OooO0O0();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.p118pd.sdk.oOOO0000
    public oOOO0000 OooO00o(String str, Charset charset) throws IOException {
        if (!this.OooO0O0) {
            this.OooO00o.OooO00o(str, charset);
            return OooO0O0();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.p118pd.sdk.oOOO0000
    public oOOO0000 OooO00o(String str, int i, int i2, Charset charset) throws IOException {
        if (!this.OooO0O0) {
            this.OooO00o.OooO00o(str, i, i2, charset);
            return OooO0O0();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.p118pd.sdk.oOOO0000
    public oOOO0000 OooO00o(byte[] bArr) throws IOException {
        if (!this.OooO0O0) {
            this.OooO00o.OooO00o(bArr);
            return OooO0O0();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.p118pd.sdk.oOOO0000
    public oOOO0000 OooO00o(byte[] bArr, int i, int i2) throws IOException {
        if (!this.OooO0O0) {
            this.OooO00o.OooO00o(bArr, i, i2);
            return OooO0O0();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.p118pd.sdk.oOOO0000
    public long OooO00o(AbstractC8930ooOOO0OO ooooo0oo) throws IOException {
        if (ooooo0oo != null) {
            long j = 0;
            while (true) {
                long read = ooooo0oo.read(this.OooO00o, 8192);
                if (read == -1) {
                    return j;
                }
                j += read;
                OooO0O0();
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    @Override // com.p118pd.sdk.oOOO0000
    public oOOO0000 OooO00o(AbstractC8930ooOOO0OO ooooo0oo, long j) throws IOException {
        while (j > 0) {
            long read = ooooo0oo.read(this.OooO00o, j);
            if (read != -1) {
                j -= read;
                OooO0O0();
            } else {
                throw new EOFException();
            }
        }
        return this;
    }

    @Override // com.p118pd.sdk.oOOO0000
    public oOOO0000 OooO00o(int i) throws IOException {
        if (!this.OooO0O0) {
            this.OooO00o.OooO00o(i);
            return OooO0O0();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.p118pd.sdk.oOOO0000
    public oOOO0000 OooO00o(long j) throws IOException {
        if (!this.OooO0O0) {
            this.OooO00o.OooO00o(j);
            return OooO0O0();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO0000
    /* renamed from: OooO00o  reason: collision with other method in class */
    public oOOO0000 m16631OooO00o() throws IOException {
        if (!this.OooO0O0) {
            long OooO0o0 = this.OooO00o.OooO0o0();
            if (OooO0o0 > 0) {
                this.f17004OooO00o.write(this.OooO00o, OooO0o0);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO0000
    /* renamed from: OooO00o  reason: collision with other method in class */
    public OutputStream m16632OooO00o() {
        return new OooO00o();
    }
}
