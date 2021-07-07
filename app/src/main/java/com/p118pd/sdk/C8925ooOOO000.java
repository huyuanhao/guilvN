package com.p118pd.sdk;

import com.umeng.commonsdk.proguard.C3571am;
import com.umeng.message.proguard.C3848l;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
import okio.ByteString;

/* renamed from: com.pd.sdk.ooOOO000  reason: case insensitive filesystem */
public final class C8925ooOOO000 implements oOOO000O {
    public final OOOO000 OooO00o = new OOOO000();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC8930ooOOO0OO f22166OooO00o;
    public boolean OooO0O0;

    public C8925ooOOO000(AbstractC8930ooOOO0OO ooooo0oo) {
        if (ooooo0oo != null) {
            this.f22166OooO00o = ooooo0oo;
            return;
        }
        throw new NullPointerException("source == null");
    }

    @Override // com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public OOOO000 m20577OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m20587OooO0O0(long j) throws IOException {
        if (!m20583OooO00o(j)) {
            throw new EOFException();
        }
    }

    @Override // com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m20589OooO0OO() throws IOException {
        if (!this.OooO0O0) {
            return this.OooO00o.m16616OooO0OO() && this.f22166OooO00o.read(this.OooO00o, 8192) == -1;
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.p118pd.sdk.oOOO000O
    public String OooO0Oo() throws IOException {
        return OooO00o(Long.MAX_VALUE);
    }

    @Override // com.p118pd.sdk.oOOO000O
    @Nullable
    public String OooO0o() throws IOException {
        long OooO00o2 = OooO00o((byte) 10);
        if (OooO00o2 != -1) {
            return this.OooO00o.m16614OooO0OO(OooO00o2);
        }
        long j = this.OooO00o.f16981OooO00o;
        if (j != 0) {
            return OooO0O0(j);
        }
        return null;
    }

    @Override // java.io.Closeable, com.p118pd.sdk.AbstractC8930ooOOO0OO, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() throws IOException {
        if (!this.OooO0O0) {
            this.OooO0O0 = true;
            this.f22166OooO00o.close();
            this.OooO00o.m16610OooO0O0();
        }
    }

    public boolean isOpen() {
        return !this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC8930ooOOO0OO
    public long read(OOOO000 oooo000, long j) throws IOException {
        if (oooo000 == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (!this.OooO0O0) {
            OOOO000 oooo0002 = this.OooO00o;
            if (oooo0002.f16981OooO00o == 0 && this.f22166OooO00o.read(oooo0002, 8192) == -1) {
                return -1;
            }
            return this.OooO00o.read(oooo000, Math.min(j, this.OooO00o.f16981OooO00o));
        } else {
            throw new IllegalStateException("closed");
        }
    }

    @Override // com.p118pd.sdk.oOOO000O
    public byte readByte() throws IOException {
        m20587OooO0O0(1L);
        return this.OooO00o.readByte();
    }

    @Override // com.p118pd.sdk.oOOO000O
    public void readFully(byte[] bArr) throws IOException {
        try {
            m20587OooO0O0((long) bArr.length);
            this.OooO00o.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                OOOO000 oooo000 = this.OooO00o;
                long j = oooo000.f16981OooO00o;
                if (j > 0) {
                    int read = oooo000.read(bArr, i, (int) j);
                    if (read != -1) {
                        i += read;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e;
                }
            }
        }
    }

    @Override // com.p118pd.sdk.oOOO000O
    public int readInt() throws IOException {
        m20587OooO0O0(4L);
        return this.OooO00o.readInt();
    }

    @Override // com.p118pd.sdk.oOOO000O
    public long readLong() throws IOException {
        m20587OooO0O0(8L);
        return this.OooO00o.readLong();
    }

    @Override // com.p118pd.sdk.oOOO000O
    public short readShort() throws IOException {
        m20587OooO0O0(2L);
        return this.OooO00o.readShort();
    }

    @Override // com.p118pd.sdk.AbstractC8930ooOOO0OO
    public C9193oooOoo timeout() {
        return this.f22166OooO00o.timeout();
    }

    public String toString() {
        return "buffer(" + this.f22166OooO00o + C3848l.f10402t;
    }

    @Override // com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20583OooO00o(long j) throws IOException {
        OOOO000 oooo000;
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (!this.OooO0O0) {
            do {
                oooo000 = this.OooO00o;
                if (oooo000.f16981OooO00o >= j) {
                    return true;
                }
            } while (this.f22166OooO00o.read(oooo000, 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    @Override // com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public String m20586OooO0O0() throws IOException {
        this.OooO00o.OooO00o(this.f22166OooO00o);
        return this.OooO00o.m16606OooO0O0();
    }

    @Override // com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    public String OooO0O0(long j) throws IOException {
        m20587OooO0O0(j);
        return this.OooO00o.m16607OooO0O0(j);
    }

    @Override // com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    public int OooO0OO() throws IOException {
        m20587OooO0O0(1L);
        byte OooO00o2 = this.OooO00o.OooO00o(0L);
        if ((OooO00o2 & C3571am.f9205k) == 192) {
            m20587OooO0O0(2L);
        } else if ((OooO00o2 & 240) == 224) {
            m20587OooO0O0(3L);
        } else if ((OooO00o2 & 248) == 240) {
            m20587OooO0O0(4L);
        }
        return this.OooO00o.OooO0OO();
    }

    /* renamed from: com.pd.sdk.ooOOO000$OooO00o */
    public class OooO00o extends InputStream {
        public OooO00o() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            C8925ooOOO000 ooooo000 = C8925ooOOO000.this;
            if (!ooooo000.OooO0O0) {
                return (int) Math.min(ooooo000.OooO00o.f16981OooO00o, 2147483647L);
            }
            throw new IOException("closed");
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
        public void close() throws IOException {
            C8925ooOOO000.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            C8925ooOOO000 ooooo000 = C8925ooOOO000.this;
            if (!ooooo000.OooO0O0) {
                OOOO000 oooo000 = ooooo000.OooO00o;
                if (oooo000.f16981OooO00o == 0 && ooooo000.f22166OooO00o.read(oooo000, 8192) == -1) {
                    return -1;
                }
                return C8925ooOOO000.this.OooO00o.readByte() & 255;
            }
            throw new IOException("closed");
        }

        public String toString() {
            return C8925ooOOO000.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            if (!C8925ooOOO000.this.OooO0O0) {
                C8976ooOOoO00.OooO00o((long) bArr.length, (long) i, (long) i2);
                C8925ooOOO000 ooooo000 = C8925ooOOO000.this;
                OOOO000 oooo000 = ooooo000.OooO00o;
                if (oooo000.f16981OooO00o == 0 && ooooo000.f22166OooO00o.read(oooo000, 8192) == -1) {
                    return -1;
                }
                return C8925ooOOO000.this.OooO00o.read(bArr, i, i2);
            }
            throw new IOException("closed");
        }
    }

    @Override // com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    public long OooO0O0() throws IOException {
        m20587OooO0O0(8L);
        return this.OooO00o.OooO0O0();
    }

    @Override // com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public ByteString m20579OooO00o() throws IOException {
        this.OooO00o.OooO00o(this.f22166OooO00o);
        return this.OooO00o.m16595OooO00o();
    }

    @Override // com.p118pd.sdk.oOOO000O
    public long OooO0O0(ByteString byteString) throws IOException {
        return OooO0O0(byteString, 0);
    }

    @Override // com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public ByteString m20580OooO00o(long j) throws IOException {
        m20587OooO0O0(j);
        return this.OooO00o.m16597OooO00o(j);
    }

    @Override // com.p118pd.sdk.oOOO000O
    public long OooO0O0(ByteString byteString, long j) throws IOException {
        if (!this.OooO0O0) {
            while (true) {
                long OooO0O02 = this.OooO00o.OooO0O0(byteString, j);
                if (OooO0O02 != -1) {
                    return OooO0O02;
                }
                OOOO000 oooo000 = this.OooO00o;
                long j2 = oooo000.f16981OooO00o;
                if (this.f22166OooO00o.read(oooo000, 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, j2);
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    @Override // com.p118pd.sdk.oOOO000O
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    @Override // com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    /* renamed from: OooO0OO  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long m20588OooO0OO() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 1
            r6.m20587OooO0O0(r0)
            r0 = 0
            r1 = 0
        L_0x0007:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r6.m20583OooO00o(r3)
            if (r3 == 0) goto L_0x0040
            com.pd.sdk.OOOO000 r3 = r6.OooO00o
            long r4 = (long) r1
            byte r3 = r3.OooO00o(r4)
            r4 = 48
            if (r3 < r4) goto L_0x001f
            r4 = 57
            if (r3 <= r4) goto L_0x0026
        L_0x001f:
            if (r1 != 0) goto L_0x0028
            r4 = 45
            if (r3 == r4) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r1 = r2
            goto L_0x0007
        L_0x0028:
            if (r1 == 0) goto L_0x002b
            goto L_0x0040
        L_0x002b:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2[r0] = r3
            java.lang.String r0 = "Expected leading [0-9] or '-' character but was %#x"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L_0x0040:
            com.pd.sdk.OOOO000 r0 = r6.OooO00o
            long r0 = r0.m16612OooO0OO()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8925ooOOO000.m20588OooO0OO():long");
    }

    @Override // com.p118pd.sdk.oOOO000O
    public int read(byte[] bArr, int i, int i2) throws IOException {
        long j = (long) i2;
        C8976ooOOoO00.OooO00o((long) bArr.length, (long) i, j);
        OOOO000 oooo000 = this.OooO00o;
        if (oooo000.f16981OooO00o == 0 && this.f22166OooO00o.read(oooo000, 8192) == -1) {
            return -1;
        }
        return this.OooO00o.read(bArr, i, (int) Math.min(j, this.OooO00o.f16981OooO00o));
    }

    @Override // com.p118pd.sdk.oOOO000O
    public int OooO00o(C5987Ooooo ooooo) throws IOException {
        if (!this.OooO0O0) {
            do {
                int OooO00o2 = this.OooO00o.OooO00o(ooooo, true);
                if (OooO00o2 == -1) {
                    return -1;
                }
                if (OooO00o2 != -2) {
                    this.OooO00o.m16600OooO00o((long) ooooo.f17289OooO00o[OooO00o2].size());
                    return OooO00o2;
                }
            } while (this.f22166OooO00o.read(this.OooO00o, 8192) != -1);
            return -1;
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        OOOO000 oooo000 = this.OooO00o;
        if (oooo000.f16981OooO00o == 0 && this.f22166OooO00o.read(oooo000, 8192) == -1) {
            return -1;
        }
        return this.OooO00o.read(byteBuffer);
    }

    @Override // com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m20584OooO00o() throws IOException {
        this.OooO00o.OooO00o(this.f22166OooO00o);
        return this.OooO00o.m16602OooO00o();
    }

    @Override // com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m20585OooO00o(long j) throws IOException {
        m20587OooO0O0(j);
        return this.OooO00o.m16603OooO00o(j);
    }

    @Override // com.p118pd.sdk.oOOO000O
    public void OooO00o(OOOO000 oooo000, long j) throws IOException {
        try {
            m20587OooO0O0(j);
            this.OooO00o.OooO00o(oooo000, j);
        } catch (EOFException e) {
            oooo000.OooO00o((AbstractC8930ooOOO0OO) this.OooO00o);
            throw e;
        }
    }

    @Override // com.p118pd.sdk.oOOO000O
    public long OooO00o(AbstractC8210oOOoO0o0 ooooo0o0) throws IOException {
        if (ooooo0o0 != null) {
            long j = 0;
            while (this.f22166OooO00o.read(this.OooO00o, 8192) != -1) {
                long OooO0Oo = this.OooO00o.OooO0Oo();
                if (OooO0Oo > 0) {
                    j += OooO0Oo;
                    ooooo0o0.write(this.OooO00o, OooO0Oo);
                }
            }
            if (this.OooO00o.OooO0o0() <= 0) {
                return j;
            }
            long OooO0o0 = j + this.OooO00o.OooO0o0();
            OOOO000 oooo000 = this.OooO00o;
            ooooo0o0.write(oooo000, oooo000.OooO0o0());
            return OooO0o0;
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override // com.p118pd.sdk.oOOO000O
    public String OooO00o(Charset charset) throws IOException {
        if (charset != null) {
            this.OooO00o.OooO00o(this.f22166OooO00o);
            return this.OooO00o.OooO00o(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override // com.p118pd.sdk.oOOO000O
    public String OooO00o(long j, Charset charset) throws IOException {
        m20587OooO0O0(j);
        if (charset != null) {
            return this.OooO00o.OooO00o(j, charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override // com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    public String OooO00o(long j) throws IOException {
        if (j >= 0) {
            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            long OooO00o2 = OooO00o((byte) 10, 0, j2);
            if (OooO00o2 != -1) {
                return this.OooO00o.m16614OooO0OO(OooO00o2);
            }
            if (j2 < Long.MAX_VALUE && m20583OooO00o(j2) && this.OooO00o.OooO00o(j2 - 1) == 13 && m20583OooO00o(1 + j2) && this.OooO00o.OooO00o(j2) == 10) {
                return this.OooO00o.m16614OooO0OO(j2);
            }
            OOOO000 oooo000 = new OOOO000();
            OOOO000 oooo0002 = this.OooO00o;
            oooo0002.OooO00o(oooo000, 0, Math.min(32L, oooo0002.OooO0o0()));
            throw new EOFException("\\n not found: limit=" + Math.min(this.OooO00o.OooO0o0(), j) + " content=" + oooo000.m16595OooO00o().hex() + C8318oOo0oooo.OooOooo);
        }
        throw new IllegalArgumentException("limit < 0: " + j);
    }

    @Override // com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public short m20581OooO00o() throws IOException {
        m20587OooO0O0(2L);
        return this.OooO00o.m16599OooO00o();
    }

    @Override // com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    public int OooO00o() throws IOException {
        m20587OooO0O0(4L);
        return this.OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public long m20576OooO00o() throws IOException {
        m20587OooO0O0(1L);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!m20583OooO00o((long) i2)) {
                break;
            }
            byte OooO00o2 = this.OooO00o.OooO00o((long) i);
            if ((OooO00o2 >= 48 && OooO00o2 <= 57) || ((OooO00o2 >= 97 && OooO00o2 <= 102) || (OooO00o2 >= 65 && OooO00o2 <= 70))) {
                i = i2;
            } else if (i == 0) {
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", Byte.valueOf(OooO00o2)));
            }
        }
        return this.OooO00o.m16583OooO00o();
    }

    @Override // com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20582OooO00o(long j) throws IOException {
        if (!this.OooO0O0) {
            while (j > 0) {
                OOOO000 oooo000 = this.OooO00o;
                if (oooo000.f16981OooO00o == 0 && this.f22166OooO00o.read(oooo000, 8192) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.OooO00o.OooO0o0());
                this.OooO00o.m16600OooO00o(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.p118pd.sdk.oOOO000O
    public long OooO00o(byte b) throws IOException {
        return OooO00o(b, 0, Long.MAX_VALUE);
    }

    @Override // com.p118pd.sdk.oOOO000O
    public long OooO00o(byte b, long j) throws IOException {
        return OooO00o(b, j, Long.MAX_VALUE);
    }

    @Override // com.p118pd.sdk.oOOO000O
    public long OooO00o(byte b, long j, long j2) throws IOException {
        if (this.OooO0O0) {
            throw new IllegalStateException("closed");
        } else if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", Long.valueOf(j), Long.valueOf(j2)));
        } else {
            while (j < j2) {
                long OooO00o2 = this.OooO00o.OooO00o(b, j, j2);
                if (OooO00o2 == -1) {
                    OOOO000 oooo000 = this.OooO00o;
                    long j3 = oooo000.f16981OooO00o;
                    if (j3 >= j2 || this.f22166OooO00o.read(oooo000, 8192) == -1) {
                        break;
                    }
                    j = Math.max(j, j3);
                } else {
                    return OooO00o2;
                }
            }
            return -1;
        }
    }

    @Override // com.p118pd.sdk.oOOO000O
    public long OooO00o(ByteString byteString) throws IOException {
        return OooO00o(byteString, 0);
    }

    @Override // com.p118pd.sdk.oOOO000O
    public long OooO00o(ByteString byteString, long j) throws IOException {
        if (!this.OooO0O0) {
            while (true) {
                long OooO00o2 = this.OooO00o.OooO00o(byteString, j);
                if (OooO00o2 != -1) {
                    return OooO00o2;
                }
                OOOO000 oooo000 = this.OooO00o;
                long j2 = oooo000.f16981OooO00o;
                if (this.f22166OooO00o.read(oooo000, 8192) == -1) {
                    return -1;
                }
                j = Math.max(j, (j2 - ((long) byteString.size())) + 1);
            }
        } else {
            throw new IllegalStateException("closed");
        }
    }

    @Override // com.p118pd.sdk.oOOO000O
    public boolean OooO00o(long j, ByteString byteString) throws IOException {
        return OooO00o(j, byteString, 0, byteString.size());
    }

    @Override // com.p118pd.sdk.oOOO000O
    public boolean OooO00o(long j, ByteString byteString, int i, int i2) throws IOException {
        if (this.OooO0O0) {
            throw new IllegalStateException("closed");
        } else if (j < 0 || i < 0 || i2 < 0 || byteString.size() - i < i2) {
            return false;
        } else {
            for (int i3 = 0; i3 < i2; i3++) {
                long j2 = ((long) i3) + j;
                if (!(m20583OooO00o(1 + j2) && this.OooO00o.OooO00o(j2) == byteString.getByte(i + i3))) {
                    return false;
                }
            }
            return true;
        }
    }

    @Override // com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public InputStream m20578OooO00o() {
        return new OooO00o();
    }
}
