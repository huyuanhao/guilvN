package com.p118pd.sdk;

import androidx.exifinterface.media.ExifInterface;
import com.tencent.bugly.beta.tinker.TinkerUncaughtExceptionHandler;
import com.umeng.commonsdk.proguard.C3571am;
import com.umeng.message.proguard.C3848l;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import okio.ByteString;
import okio.SegmentedByteString;

/* renamed from: com.pd.sdk.OOOO000 */
public final class OOOO000 implements oOOO000O, oOOO0000, Cloneable, ByteChannel {
    public static final byte[] OooO00o = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    public static final int o00oO0O = 65533;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f16981OooO00o;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8927ooOOO00o f16982OooO00o;

    /* renamed from: com.pd.sdk.OOOO000$OooO00o */
    public class OooO00o extends OutputStream {
        public OooO00o() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return OOOO000.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            OOOO000.this.OooO0o0((int) ((byte) i));
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            OOOO000.this.OooO00o(bArr, i, i2);
        }
    }

    /* renamed from: com.pd.sdk.OOOO000$OooO0O0 */
    public class OooO0O0 extends InputStream {
        public OooO0O0() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(OOOO000.this.f16981OooO00o, 2147483647L);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            OOOO000 oooo000 = OOOO000.this;
            if (oooo000.f16981OooO00o > 0) {
                return oooo000.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return OOOO000.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            return OOOO000.this.read(bArr, i, i2);
        }
    }

    @Override // com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public OOOO000 m16585OooO00o() {
        return this;
    }

    @Override // com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public oOOO0000 m16589OooO00o() {
        return this;
    }

    @Override // com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public OOOO000 OooO0O0() {
        return this;
    }

    @Override // java.lang.AutoCloseable, java.io.Closeable, com.p118pd.sdk.AbstractC8210oOOoO0o0, com.p118pd.sdk.AbstractC8930ooOOO0OO, java.nio.channels.Channel
    public void close() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OOOO000)) {
            return false;
        }
        OOOO000 oooo000 = (OOOO000) obj;
        long j = this.f16981OooO00o;
        if (j != oooo000.f16981OooO00o) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        C8927ooOOO00o ooooo00o = this.f16982OooO00o;
        C8927ooOOO00o ooooo00o2 = oooo000.f16982OooO00o;
        int i = ooooo00o.OooO00o;
        int i2 = ooooo00o2.OooO00o;
        while (j2 < this.f16981OooO00o) {
            long min = (long) Math.min(ooooo00o.OooO0O0 - i, ooooo00o2.OooO0O0 - i2);
            int i3 = 0;
            while (((long) i3) < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (ooooo00o.f22170OooO00o[i] != ooooo00o2.f22170OooO00o[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == ooooo00o.OooO0O0) {
                ooooo00o = ooooo00o.f22168OooO00o;
                i = ooooo00o.OooO00o;
            }
            if (i2 == ooooo00o2.OooO0O0) {
                ooooo00o2 = ooooo00o2.f22168OooO00o;
                i2 = ooooo00o2.OooO00o;
            }
            j2 += min;
        }
        return true;
    }

    @Override // com.p118pd.sdk.oOOO0000, com.p118pd.sdk.AbstractC8210oOOoO0o0, java.io.Flushable
    public void flush() {
    }

    public int hashCode() {
        C8927ooOOO00o ooooo00o = this.f16982OooO00o;
        if (ooooo00o == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = ooooo00o.OooO0O0;
            for (int i3 = ooooo00o.OooO00o; i3 < i2; i3++) {
                i = (i * 31) + ooooo00o.f22170OooO00o[i3];
            }
            ooooo00o = ooooo00o.f22168OooO00o;
        } while (ooooo00o != this.f16982OooO00o);
        return i;
    }

    public boolean isOpen() {
        return true;
    }

    @Override // com.p118pd.sdk.oOOO000O
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // com.p118pd.sdk.oOOO000O
    public byte readByte() {
        long j = this.f16981OooO00o;
        if (j != 0) {
            C8927ooOOO00o ooooo00o = this.f16982OooO00o;
            int i = ooooo00o.OooO00o;
            int i2 = ooooo00o.OooO0O0;
            int i3 = i + 1;
            byte b = ooooo00o.f22170OooO00o[i];
            this.f16981OooO00o = j - 1;
            if (i3 == i2) {
                this.f16982OooO00o = ooooo00o.OooO00o();
                OOOOO0O.OooO00o(ooooo00o);
            } else {
                ooooo00o.OooO00o = i3;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    @Override // com.p118pd.sdk.oOOO000O
    public void readFully(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read != -1) {
                i += read;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // com.p118pd.sdk.oOOO000O
    public int readInt() {
        long j = this.f16981OooO00o;
        if (j >= 4) {
            C8927ooOOO00o ooooo00o = this.f16982OooO00o;
            int i = ooooo00o.OooO00o;
            int i2 = ooooo00o.OooO0O0;
            if (i2 - i < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = ooooo00o.f22170OooO00o;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            int i6 = i4 + 1;
            int i7 = i5 | ((bArr[i4] & 255) << 8);
            int i8 = i6 + 1;
            int i9 = i7 | (bArr[i6] & 255);
            this.f16981OooO00o = j - 4;
            if (i8 == i2) {
                this.f16982OooO00o = ooooo00o.OooO00o();
                OOOOO0O.OooO00o(ooooo00o);
            } else {
                ooooo00o.OooO00o = i8;
            }
            return i9;
        }
        throw new IllegalStateException("size < 4: " + this.f16981OooO00o);
    }

    @Override // com.p118pd.sdk.oOOO000O
    public long readLong() {
        long j = this.f16981OooO00o;
        if (j >= 8) {
            C8927ooOOO00o ooooo00o = this.f16982OooO00o;
            int i = ooooo00o.OooO00o;
            int i2 = ooooo00o.OooO0O0;
            if (i2 - i < 8) {
                return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
            }
            byte[] bArr = ooooo00o.f22170OooO00o;
            int i3 = i + 1;
            int i4 = i3 + 1;
            long j2 = (((long) bArr[i3]) & 255) << 48;
            int i5 = i4 + 1;
            int i6 = i5 + 1;
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            int i9 = i8 + 1;
            int i10 = i9 + 1;
            long j3 = j2 | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i4]) & 255) << 40) | ((((long) bArr[i5]) & 255) << 32) | ((((long) bArr[i6]) & 255) << 24) | ((((long) bArr[i7]) & 255) << 16) | ((((long) bArr[i8]) & 255) << 8) | (((long) bArr[i9]) & 255);
            this.f16981OooO00o = j - 8;
            if (i10 == i2) {
                this.f16982OooO00o = ooooo00o.OooO00o();
                OOOOO0O.OooO00o(ooooo00o);
            } else {
                ooooo00o.OooO00o = i10;
            }
            return j3;
        }
        throw new IllegalStateException("size < 8: " + this.f16981OooO00o);
    }

    @Override // com.p118pd.sdk.oOOO000O
    public short readShort() {
        long j = this.f16981OooO00o;
        if (j >= 2) {
            C8927ooOOO00o ooooo00o = this.f16982OooO00o;
            int i = ooooo00o.OooO00o;
            int i2 = ooooo00o.OooO0O0;
            if (i2 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = ooooo00o.f22170OooO00o;
            int i3 = i + 1;
            int i4 = i3 + 1;
            int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            this.f16981OooO00o = j - 2;
            if (i4 == i2) {
                this.f16982OooO00o = ooooo00o.OooO00o();
                OOOOO0O.OooO00o(ooooo00o);
            } else {
                ooooo00o.OooO00o = i4;
            }
            return (short) i5;
        }
        throw new IllegalStateException("size < 2: " + this.f16981OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC8210oOOoO0o0, com.p118pd.sdk.AbstractC8930ooOOO0OO
    public C9193oooOoo timeout() {
        return C9193oooOoo.NONE;
    }

    public String toString() {
        return m16619OooO0o().toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i = remaining;
            while (i > 0) {
                C8927ooOOO00o OooO00o2 = m16590OooO00o(1);
                int min = Math.min(i, 8192 - OooO00o2.OooO0O0);
                byteBuffer.get(OooO00o2.f22170OooO00o, OooO00o2.OooO0O0, min);
                i -= min;
                OooO00o2.OooO0O0 += min;
            }
            this.f16981OooO00o += (long) remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // com.p118pd.sdk.oOOO000O
    @Nullable
    public String OooO0o() throws EOFException {
        long OooO00o2 = OooO00o((byte) 10);
        if (OooO00o2 != -1) {
            return m16614OooO0OO(OooO00o2);
        }
        long j = this.f16981OooO00o;
        if (j != 0) {
            return m16607OooO0O0(j);
        }
        return null;
    }

    public final long OooO0o0() {
        return this.f16981OooO00o;
    }

    @Override // com.p118pd.sdk.oOOO000O
    public int read(byte[] bArr, int i, int i2) {
        C8976ooOOoO00.OooO00o((long) bArr.length, (long) i, (long) i2);
        C8927ooOOO00o ooooo00o = this.f16982OooO00o;
        if (ooooo00o == null) {
            return -1;
        }
        int min = Math.min(i2, ooooo00o.OooO0O0 - ooooo00o.OooO00o);
        System.arraycopy(ooooo00o.f22170OooO00o, ooooo00o.OooO00o, bArr, i, min);
        int i3 = ooooo00o.OooO00o + min;
        ooooo00o.OooO00o = i3;
        this.f16981OooO00o -= (long) min;
        if (i3 == ooooo00o.OooO0O0) {
            this.f16982OooO00o = ooooo00o.OooO00o();
            OOOOO0O.OooO00o(ooooo00o);
        }
        return min;
    }

    @Override // com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m16616OooO0OO() {
        return this.f16981OooO00o == 0;
    }

    @Override // com.p118pd.sdk.oOOO000O
    public final long OooO0Oo() {
        long j = this.f16981OooO00o;
        if (j == 0) {
            return 0;
        }
        C8927ooOOO00o ooooo00o = this.f16982OooO00o.f22171OooO0O0;
        int i = ooooo00o.OooO0O0;
        return (i >= 8192 || !ooooo00o.f22172OooO0O0) ? j : j - ((long) (i - ooooo00o.OooO00o));
    }

    @Override // com.p118pd.sdk.oOOO0000
    /* renamed from: OooO0o0 */
    public OOOO000 OooO00o(int i) {
        return OooO0Oo((int) C8976ooOOoO00.OooO00o((short) i));
    }

    @Override // com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m16611OooO0O0(long j) throws EOFException {
        if (this.f16981OooO00o < j) {
            throw new EOFException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004b, code lost:
        if (r8 != false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004d, code lost:
        r1.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006a, code lost:
        throw new java.lang.NumberFormatException("Number too large: " + r1.m16606OooO0O0());
     */
    @Override // com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    /* renamed from: OooO0OO  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long m16612OooO0OO() {
        /*
        // Method dump skipped, instructions count: 194
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.OOOO000.m16612OooO0OO():long");
    }

    /* renamed from: OooO0o0  reason: collision with other method in class */
    public final ByteString m16620OooO0o0() {
        return OooO00o(LL1i.f16408OooO0o);
    }

    public final OOOO000 OooO0O0(OutputStream outputStream) throws IOException {
        return OooO00o(outputStream, this.f16981OooO00o);
    }

    @Override // com.p118pd.sdk.oOOO0000
    /* renamed from: OooO0o */
    public OOOO000 OooO0O0(int i) {
        if (i < 128) {
            OooO0o0(i);
        } else if (i < 2048) {
            OooO0o0((i >> 6) | 192);
            OooO0o0((i & 63) | 128);
        } else if (i < 65536) {
            if (i < 55296 || i > 57343) {
                OooO0o0((i >> 12) | C7967oO0oOo00.Ooooo0o);
                OooO0o0(((i >> 6) & 63) | 128);
                OooO0o0((i & 63) | 128);
            } else {
                OooO0o0(63);
            }
        } else if (i <= 1114111) {
            OooO0o0((i >> 18) | 240);
            OooO0o0(((i >> 12) & 63) | 128);
            OooO0o0(((i >> 6) & 63) | 128);
            OooO0o0((i & 63) | 128);
        } else {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
        }
        return this;
    }

    @Override // com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    public long OooO0O0() {
        return C8976ooOOoO00.OooO00o(readLong());
    }

    @Override // com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public String m16606OooO0O0() {
        try {
            return OooO00o(this.f16981OooO00o, C8976ooOOoO00.OooO00o);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.p118pd.sdk.oOOO000O
    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public String m16617OooO0Oo() throws EOFException {
        return m16593OooO00o(Long.MAX_VALUE);
    }

    @Override // com.p118pd.sdk.oOOO0000
    public OOOO000 OooO0Oo(int i) {
        C8927ooOOO00o OooO00o2 = m16590OooO00o(2);
        byte[] bArr = OooO00o2.f22170OooO00o;
        int i2 = OooO00o2.OooO0O0;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        OooO00o2.OooO0O0 = i3 + 1;
        this.f16981OooO00o += 2;
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC8210oOOoO0o0
    public void write(OOOO000 oooo000, long j) {
        int i;
        if (oooo000 == null) {
            throw new IllegalArgumentException("source == null");
        } else if (oooo000 != this) {
            C8976ooOOoO00.OooO00o(oooo000.f16981OooO00o, 0, j);
            while (j > 0) {
                C8927ooOOO00o ooooo00o = oooo000.f16982OooO00o;
                if (j < ((long) (ooooo00o.OooO0O0 - ooooo00o.OooO00o))) {
                    C8927ooOOO00o ooooo00o2 = this.f16982OooO00o;
                    C8927ooOOO00o ooooo00o3 = ooooo00o2 != null ? ooooo00o2.f22171OooO0O0 : null;
                    if (ooooo00o3 != null && ooooo00o3.f22172OooO0O0) {
                        long j2 = ((long) ooooo00o3.OooO0O0) + j;
                        if (ooooo00o3.f22169OooO00o) {
                            i = 0;
                        } else {
                            i = ooooo00o3.OooO00o;
                        }
                        if (j2 - ((long) i) <= 8192) {
                            oooo000.f16982OooO00o.OooO00o(ooooo00o3, (int) j);
                            oooo000.f16981OooO00o -= j;
                            this.f16981OooO00o += j;
                            return;
                        }
                    }
                    oooo000.f16982OooO00o = oooo000.f16982OooO00o.OooO00o((int) j);
                }
                C8927ooOOO00o ooooo00o4 = oooo000.f16982OooO00o;
                long j3 = (long) (ooooo00o4.OooO0O0 - ooooo00o4.OooO00o);
                oooo000.f16982OooO00o = ooooo00o4.OooO00o();
                C8927ooOOO00o ooooo00o5 = this.f16982OooO00o;
                if (ooooo00o5 == null) {
                    this.f16982OooO00o = ooooo00o4;
                    ooooo00o4.f22171OooO0O0 = ooooo00o4;
                    ooooo00o4.f22168OooO00o = ooooo00o4;
                } else {
                    ooooo00o5.f22171OooO0O0.OooO00o(ooooo00o4).m20591OooO00o();
                }
                oooo000.f16981OooO00o -= j3;
                this.f16981OooO00o += j3;
                j -= j3;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    @Override // com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public String m16607OooO0O0(long j) throws EOFException {
        return OooO00o(j, C8976ooOOoO00.OooO00o);
    }

    @Override // com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public OutputStream m16592OooO00o() {
        return new OooO00o();
    }

    @Override // com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public final void m16610OooO0O0() {
        try {
            m16600OooO00o(this.f16981OooO00o);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m16601OooO00o(long j) {
        return this.f16981OooO00o >= j;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        C8927ooOOO00o ooooo00o = this.f16982OooO00o;
        if (ooooo00o == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), ooooo00o.OooO0O0 - ooooo00o.OooO00o);
        byteBuffer.put(ooooo00o.f22170OooO00o, ooooo00o.OooO00o, min);
        int i = ooooo00o.OooO00o + min;
        ooooo00o.OooO00o = i;
        this.f16981OooO00o -= (long) min;
        if (i == ooooo00o.OooO0O0) {
            this.f16982OooO00o = ooooo00o.OooO00o();
            OOOOO0O.OooO00o(ooooo00o);
        }
        return min;
    }

    @Override // com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public InputStream m16591OooO00o() {
        return new OooO0O0();
    }

    @Override // com.p118pd.sdk.oOOO0000
    /* renamed from: OooO0O0 */
    public OOOO000 OooO0o(int i) {
        C8927ooOOO00o OooO00o2 = m16590OooO00o(4);
        byte[] bArr = OooO00o2.f22170OooO00o;
        int i2 = OooO00o2.OooO0O0;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        OooO00o2.OooO0O0 = i5 + 1;
        this.f16981OooO00o += 4;
        return this;
    }

    public final OOOO000 OooO00o(OutputStream outputStream) throws IOException {
        return OooO00o(outputStream, 0, this.f16981OooO00o);
    }

    public final OOOO000 OooO00o(OutputStream outputStream, long j, long j2) throws IOException {
        if (outputStream != null) {
            C8976ooOOoO00.OooO00o(this.f16981OooO00o, j, j2);
            if (j2 == 0) {
                return this;
            }
            C8927ooOOO00o ooooo00o = this.f16982OooO00o;
            while (true) {
                int i = ooooo00o.OooO0O0;
                int i2 = ooooo00o.OooO00o;
                if (j < ((long) (i - i2))) {
                    break;
                }
                j -= (long) (i - i2);
                ooooo00o = ooooo00o.f22168OooO00o;
            }
            while (j2 > 0) {
                int i3 = (int) (((long) ooooo00o.OooO00o) + j);
                int min = (int) Math.min((long) (ooooo00o.OooO0O0 - i3), j2);
                outputStream.write(ooooo00o.f22170OooO00o, i3, min);
                j2 -= (long) min;
                ooooo00o = ooooo00o.f22168OooO00o;
                j = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    @Override // com.p118pd.sdk.oOOO0000
    public OOOO000 OooO0Oo(long j) {
        return OooO0OO(C8976ooOOoO00.OooO00o(j));
    }

    @Override // com.p118pd.sdk.oOOO000O
    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public final ByteString m16618OooO0Oo() {
        return OooO00o(LL1i.OooO0Oo);
    }

    @Override // com.p118pd.sdk.oOOO000O
    /* renamed from: OooO0o  reason: collision with other method in class */
    public final ByteString m16619OooO0o() {
        long j = this.f16981OooO00o;
        if (j <= 2147483647L) {
            return m16596OooO00o((int) j);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f16981OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC8930ooOOO0OO
    public long read(OOOO000 oooo000, long j) {
        if (oooo000 == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j >= 0) {
            long j2 = this.f16981OooO00o;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            oooo000.write(this, j);
            return j;
        } else {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
    }

    @Override // com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    /* renamed from: OooO0O0 */
    public OOOO000 OooO00o(long j) {
        if (j == 0) {
            return OooO0o0(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        C8927ooOOO00o OooO00o2 = m16590OooO00o(numberOfTrailingZeros);
        byte[] bArr = OooO00o2.f22170OooO00o;
        int i = OooO00o2.OooO0O0;
        for (int i2 = (i + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = OooO00o[(int) (15 & j)];
            j >>>= 4;
        }
        OooO00o2.OooO0O0 += numberOfTrailingZeros;
        this.f16981OooO00o += (long) numberOfTrailingZeros;
        return this;
    }

    @Override // com.p118pd.sdk.oOOO0000
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public String m16614OooO0OO(long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (OooO00o(j2) == 13) {
                String OooO0O02 = m16607OooO0O0(j2);
                m16600OooO00o(2L);
                return OooO0O02;
            }
        }
        String OooO0O03 = m16607OooO0O0(j);
        m16600OooO00o(1L);
        return OooO0O03;
    }

    public final OOOO000 OooO00o(OOOO000 oooo000, long j, long j2) {
        if (oooo000 != null) {
            C8976ooOOoO00.OooO00o(this.f16981OooO00o, j, j2);
            if (j2 == 0) {
                return this;
            }
            oooo000.f16981OooO00o += j2;
            C8927ooOOO00o ooooo00o = this.f16982OooO00o;
            while (true) {
                int i = ooooo00o.OooO0O0;
                int i2 = ooooo00o.OooO00o;
                if (j < ((long) (i - i2))) {
                    break;
                }
                j -= (long) (i - i2);
                ooooo00o = ooooo00o.f22168OooO00o;
            }
            while (j2 > 0) {
                C8927ooOOO00o OooO0O02 = ooooo00o.OooO0O0();
                int i3 = (int) (((long) OooO0O02.OooO00o) + j);
                OooO0O02.OooO00o = i3;
                OooO0O02.OooO0O0 = Math.min(i3 + ((int) j2), OooO0O02.OooO0O0);
                C8927ooOOO00o ooooo00o2 = oooo000.f16982OooO00o;
                if (ooooo00o2 == null) {
                    OooO0O02.f22171OooO0O0 = OooO0O02;
                    OooO0O02.f22168OooO00o = OooO0O02;
                    oooo000.f16982OooO00o = OooO0O02;
                } else {
                    ooooo00o2.f22171OooO0O0.OooO00o(OooO0O02);
                }
                j2 -= (long) (OooO0O02.OooO0O0 - OooO0O02.OooO00o);
                ooooo00o = ooooo00o.f22168OooO00o;
                j = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    /* renamed from: com.pd.sdk.OOOO000$OooO0OO */
    public static final class OooO0OO implements Closeable {
        public long OooO00o = -1;

        /* renamed from: OooO00o  reason: collision with other field name */
        public OOOO000 f16983OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C8927ooOOO00o f16984OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public byte[] f16985OooO00o;
        public boolean OooO0O0;
        public int o00oO0O = -1;
        public int o0ooOO0 = -1;

        public final int OooO00o(long j) {
            if (j >= -1) {
                OOOO000 oooo000 = this.f16983OooO00o;
                long j2 = oooo000.f16981OooO00o;
                if (j <= j2) {
                    if (j == -1 || j == j2) {
                        this.f16984OooO00o = null;
                        this.OooO00o = j;
                        this.f16985OooO00o = null;
                        this.o00oO0O = -1;
                        this.o0ooOO0 = -1;
                        return -1;
                    }
                    long j3 = 0;
                    C8927ooOOO00o ooooo00o = oooo000.f16982OooO00o;
                    C8927ooOOO00o ooooo00o2 = this.f16984OooO00o;
                    if (ooooo00o2 != null) {
                        long j4 = this.OooO00o - ((long) (this.o00oO0O - ooooo00o2.OooO00o));
                        if (j4 > j) {
                            j2 = j4;
                            ooooo00o2 = ooooo00o;
                            ooooo00o = ooooo00o2;
                        } else {
                            j3 = j4;
                        }
                    } else {
                        ooooo00o2 = ooooo00o;
                    }
                    if (j2 - j > j - j3) {
                        while (true) {
                            int i = ooooo00o2.OooO0O0;
                            int i2 = ooooo00o2.OooO00o;
                            if (j < ((long) (i - i2)) + j3) {
                                break;
                            }
                            j3 += (long) (i - i2);
                            ooooo00o2 = ooooo00o2.f22168OooO00o;
                        }
                    } else {
                        while (j2 > j) {
                            ooooo00o = ooooo00o.f22171OooO0O0;
                            j2 -= (long) (ooooo00o.OooO0O0 - ooooo00o.OooO00o);
                        }
                        ooooo00o2 = ooooo00o;
                        j3 = j2;
                    }
                    if (this.OooO0O0 && ooooo00o2.f22169OooO00o) {
                        C8927ooOOO00o OooO0OO = ooooo00o2.OooO0OO();
                        OOOO000 oooo0002 = this.f16983OooO00o;
                        if (oooo0002.f16982OooO00o == ooooo00o2) {
                            oooo0002.f16982OooO00o = OooO0OO;
                        }
                        ooooo00o2 = ooooo00o2.OooO00o(OooO0OO);
                        ooooo00o2.f22171OooO0O0.OooO00o();
                    }
                    this.f16984OooO00o = ooooo00o2;
                    this.OooO00o = j;
                    this.f16985OooO00o = ooooo00o2.f22170OooO00o;
                    int i3 = ooooo00o2.OooO00o + ((int) (j - j3));
                    this.o00oO0O = i3;
                    int i4 = ooooo00o2.OooO0O0;
                    this.o0ooOO0 = i4;
                    return i4 - i3;
                }
            }
            throw new ArrayIndexOutOfBoundsException(String.format("offset=%s > size=%s", Long.valueOf(j), Long.valueOf(this.f16983OooO00o.f16981OooO00o)));
        }

        public final int OooO0O0() {
            long j = this.OooO00o;
            if (j == this.f16983OooO00o.f16981OooO00o) {
                throw new IllegalStateException();
            } else if (j == -1) {
                return OooO00o(0L);
            } else {
                return OooO00o(j + ((long) (this.o0ooOO0 - this.o00oO0O)));
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f16983OooO00o != null) {
                this.f16983OooO00o = null;
                this.f16984OooO00o = null;
                this.OooO00o = -1;
                this.f16985OooO00o = null;
                this.o00oO0O = -1;
                this.o0ooOO0 = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer");
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public final long m16621OooO00o(long j) {
            OOOO000 oooo000 = this.f16983OooO00o;
            if (oooo000 == null) {
                throw new IllegalStateException("not attached to a buffer");
            } else if (this.OooO0O0) {
                long j2 = oooo000.f16981OooO00o;
                if (j <= j2) {
                    if (j >= 0) {
                        long j3 = j2 - j;
                        while (true) {
                            if (j3 <= 0) {
                                break;
                            }
                            OOOO000 oooo0002 = this.f16983OooO00o;
                            C8927ooOOO00o ooooo00o = oooo0002.f16982OooO00o.f22171OooO0O0;
                            int i = ooooo00o.OooO0O0;
                            long j4 = (long) (i - ooooo00o.OooO00o);
                            if (j4 > j3) {
                                ooooo00o.OooO0O0 = (int) (((long) i) - j3);
                                break;
                            }
                            oooo0002.f16982OooO00o = ooooo00o.OooO00o();
                            OOOOO0O.OooO00o(ooooo00o);
                            j3 -= j4;
                        }
                        this.f16984OooO00o = null;
                        this.OooO00o = j;
                        this.f16985OooO00o = null;
                        this.o00oO0O = -1;
                        this.o0ooOO0 = -1;
                    } else {
                        throw new IllegalArgumentException("newSize < 0: " + j);
                    }
                } else if (j > j2) {
                    long j5 = j - j2;
                    boolean z = true;
                    while (j5 > 0) {
                        C8927ooOOO00o OooO00o2 = this.f16983OooO00o.m16590OooO00o(1);
                        int min = (int) Math.min(j5, (long) (8192 - OooO00o2.OooO0O0));
                        int i2 = OooO00o2.OooO0O0 + min;
                        OooO00o2.OooO0O0 = i2;
                        j5 -= (long) min;
                        if (z) {
                            this.f16984OooO00o = OooO00o2;
                            this.OooO00o = j2;
                            this.f16985OooO00o = OooO00o2.f22170OooO00o;
                            this.o00oO0O = i2 - min;
                            this.o0ooOO0 = i2;
                            z = false;
                        }
                    }
                }
                this.f16983OooO00o.f16981OooO00o = j;
                return j2;
            } else {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
        }

        public final long OooO00o(int i) {
            if (i <= 0) {
                throw new IllegalArgumentException("minByteCount <= 0: " + i);
            } else if (i <= 8192) {
                OOOO000 oooo000 = this.f16983OooO00o;
                if (oooo000 == null) {
                    throw new IllegalStateException("not attached to a buffer");
                } else if (this.OooO0O0) {
                    long j = oooo000.f16981OooO00o;
                    C8927ooOOO00o OooO00o2 = oooo000.m16590OooO00o(i);
                    int i2 = 8192 - OooO00o2.OooO0O0;
                    OooO00o2.OooO0O0 = 8192;
                    long j2 = (long) i2;
                    this.f16983OooO00o.f16981OooO00o = j + j2;
                    this.f16984OooO00o = OooO00o2;
                    this.OooO00o = j;
                    this.f16985OooO00o = OooO00o2.f22170OooO00o;
                    this.o00oO0O = 8192 - i2;
                    this.o0ooOO0 = 8192;
                    return j2;
                } else {
                    throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
                }
            } else {
                throw new IllegalArgumentException("minByteCount > Segment.SIZE: " + i);
            }
        }
    }

    @Override // com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    public int OooO0OO() throws EOFException {
        int i;
        int i2;
        int i3;
        if (this.f16981OooO00o != 0) {
            byte OooO00o2 = OooO00o(0L);
            if ((OooO00o2 & O0O00O.OooO00o) == 0) {
                i3 = OooO00o2 & O0O00O.OooO0O0;
                i2 = 1;
                i = 0;
            } else if ((OooO00o2 & C3571am.f9205k) == 192) {
                i3 = OooO00o2 & C3571am.f9204j;
                i2 = 2;
                i = 128;
            } else if ((OooO00o2 & 240) == 224) {
                i3 = OooO00o2 & 15;
                i2 = 3;
                i = 2048;
            } else if ((OooO00o2 & 248) == 240) {
                i3 = OooO00o2 & 7;
                i2 = 4;
                i = 65536;
            } else {
                m16600OooO00o(1L);
                return o00oO0O;
            }
            long j = (long) i2;
            if (this.f16981OooO00o >= j) {
                for (int i4 = 1; i4 < i2; i4++) {
                    long j2 = (long) i4;
                    byte OooO00o3 = OooO00o(j2);
                    if ((OooO00o3 & ExifInterface.OooO0Oo) == 128) {
                        i3 = (i3 << 6) | (OooO00o3 & 63);
                    } else {
                        m16600OooO00o(j2);
                        return o00oO0O;
                    }
                }
                m16600OooO00o(j);
                if (i3 > 1114111) {
                    return o00oO0O;
                }
                if ((i3 < 55296 || i3 > 57343) && i3 >= i) {
                    return i3;
                }
                return o00oO0O;
            }
            throw new EOFException("size < " + i2 + ": " + this.f16981OooO00o + " (to read code point prefixed 0x" + Integer.toHexString(OooO00o2) + C3848l.f10402t);
        }
        throw new EOFException();
    }

    @Override // com.p118pd.sdk.oOOO000O
    public long OooO0O0(ByteString byteString) {
        return OooO0O0(byteString, 0);
    }

    @Override // com.p118pd.sdk.oOOO000O
    public long OooO0O0(ByteString byteString, long j) {
        int i;
        int i2;
        long j2 = 0;
        if (j >= 0) {
            C8927ooOOO00o ooooo00o = this.f16982OooO00o;
            if (ooooo00o == null) {
                return -1;
            }
            long j3 = this.f16981OooO00o;
            if (j3 - j < j) {
                while (j3 > j) {
                    ooooo00o = ooooo00o.f22171OooO0O0;
                    j3 -= (long) (ooooo00o.OooO0O0 - ooooo00o.OooO00o);
                }
            } else {
                while (true) {
                    long j4 = ((long) (ooooo00o.OooO0O0 - ooooo00o.OooO00o)) + j2;
                    if (j4 >= j) {
                        break;
                    }
                    ooooo00o = ooooo00o.f22168OooO00o;
                    j2 = j4;
                }
                j3 = j2;
            }
            if (byteString.size() == 2) {
                byte b = byteString.getByte(0);
                byte b2 = byteString.getByte(1);
                while (j3 < this.f16981OooO00o) {
                    byte[] bArr = ooooo00o.f22170OooO00o;
                    i = (int) ((((long) ooooo00o.OooO00o) + j) - j3);
                    int i3 = ooooo00o.OooO0O0;
                    while (i < i3) {
                        byte b3 = bArr[i];
                        if (b3 == b || b3 == b2) {
                            i2 = ooooo00o.OooO00o;
                        } else {
                            i++;
                        }
                    }
                    j3 += (long) (ooooo00o.OooO0O0 - ooooo00o.OooO00o);
                    ooooo00o = ooooo00o.f22168OooO00o;
                    j = j3;
                }
                return -1;
            }
            byte[] internalArray = byteString.internalArray();
            while (j3 < this.f16981OooO00o) {
                byte[] bArr2 = ooooo00o.f22170OooO00o;
                i = (int) ((((long) ooooo00o.OooO00o) + j) - j3);
                int i4 = ooooo00o.OooO0O0;
                while (i < i4) {
                    byte b4 = bArr2[i];
                    for (byte b5 : internalArray) {
                        if (b4 == b5) {
                            i2 = ooooo00o.OooO00o;
                        }
                    }
                    i++;
                }
                j3 += (long) (ooooo00o.OooO0O0 - ooooo00o.OooO00o);
                ooooo00o = ooooo00o.f22168OooO00o;
                j = j3;
            }
            return -1;
            return ((long) (i - i2)) + j3;
        }
        throw new IllegalArgumentException("fromIndex < 0");
    }

    public final OOOO000 OooO00o(OutputStream outputStream, long j) throws IOException {
        if (outputStream != null) {
            C8976ooOOoO00.OooO00o(this.f16981OooO00o, 0, j);
            C8927ooOOO00o ooooo00o = this.f16982OooO00o;
            while (j > 0) {
                int min = (int) Math.min(j, (long) (ooooo00o.OooO0O0 - ooooo00o.OooO00o));
                outputStream.write(ooooo00o.f22170OooO00o, ooooo00o.OooO00o, min);
                int i = ooooo00o.OooO00o + min;
                ooooo00o.OooO00o = i;
                long j2 = (long) min;
                this.f16981OooO00o -= j2;
                j -= j2;
                if (i == ooooo00o.OooO0O0) {
                    C8927ooOOO00o OooO00o2 = ooooo00o.OooO00o();
                    this.f16982OooO00o = OooO00o2;
                    OOOOO0O.OooO00o(ooooo00o);
                    ooooo00o = OooO00o2;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    @Override // com.p118pd.sdk.oOOO0000
    public OOOO000 OooO0OO(int i) {
        return OooO0o(C8976ooOOoO00.OooO00o(i));
    }

    @Override // com.p118pd.sdk.oOOO0000
    public OOOO000 OooO0OO(long j) {
        C8927ooOOO00o OooO00o2 = m16590OooO00o(8);
        byte[] bArr = OooO00o2.f22170OooO00o;
        int i = OooO00o2.OooO0O0;
        int i2 = i + 1;
        bArr[i] = (byte) ((int) ((j >>> 56) & 255));
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((int) ((j >>> 48) & 255));
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((int) ((j >>> 40) & 255));
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((int) ((j >>> 32) & 255));
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((int) ((j >>> 24) & 255));
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((int) ((j >>> 16) & 255));
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((int) ((j >>> 8) & 255));
        bArr[i8] = (byte) ((int) (j & 255));
        OooO00o2.OooO0O0 = i8 + 1;
        this.f16981OooO00o += 8;
        return this;
    }

    public final OOOO000 OooO00o(InputStream inputStream) throws IOException {
        OooO00o(inputStream, Long.MAX_VALUE, true);
        return this;
    }

    public final OOOO000 OooO00o(InputStream inputStream, long j) throws IOException {
        if (j >= 0) {
            OooO00o(inputStream, j, false);
            return this;
        }
        throw new IllegalArgumentException("byteCount < 0: " + j);
    }

    private void OooO00o(InputStream inputStream, long j, boolean z) throws IOException {
        if (inputStream != null) {
            while (true) {
                if (j > 0 || z) {
                    C8927ooOOO00o OooO00o2 = m16590OooO00o(1);
                    int read = inputStream.read(OooO00o2.f22170OooO00o, OooO00o2.OooO0O0, (int) Math.min(j, (long) (8192 - OooO00o2.OooO0O0)));
                    if (read != -1) {
                        OooO00o2.OooO0O0 += read;
                        long j2 = (long) read;
                        this.f16981OooO00o += j2;
                        j -= j2;
                    } else if (!z) {
                        throw new EOFException();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("in == null");
        }
    }

    @Override // com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public final ByteString m16615OooO0OO() {
        return OooO00o(LL1i.OooO0O0);
    }

    public final ByteString OooO0OO(ByteString byteString) {
        return OooO00o("HmacSHA512", byteString);
    }

    @Override // com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    public final byte OooO00o(long j) {
        int i;
        C8976ooOOoO00.OooO00o(this.f16981OooO00o, j, 1);
        long j2 = this.f16981OooO00o;
        if (j2 - j > j) {
            C8927ooOOO00o ooooo00o = this.f16982OooO00o;
            while (true) {
                int i2 = ooooo00o.OooO0O0;
                int i3 = ooooo00o.OooO00o;
                long j3 = (long) (i2 - i3);
                if (j < j3) {
                    return ooooo00o.f22170OooO00o[i3 + ((int) j)];
                }
                j -= j3;
                ooooo00o = ooooo00o.f22168OooO00o;
            }
        } else {
            long j4 = j - j2;
            C8927ooOOO00o ooooo00o2 = this.f16982OooO00o;
            do {
                ooooo00o2 = ooooo00o2.f22171OooO0O0;
                int i4 = ooooo00o2.OooO0O0;
                i = ooooo00o2.OooO00o;
                j4 += (long) (i4 - i);
            } while (j4 < 0);
            return ooooo00o2.f22170OooO00o[i + ((int) j4)];
        }
    }

    @Override // com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public final ByteString m16608OooO0O0() {
        return OooO00o("MD5");
    }

    @Override // com.p118pd.sdk.oOOO000O
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public final ByteString m16609OooO0O0(ByteString byteString) {
        return OooO00o("HmacSHA256", byteString);
    }

    @Override // com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public OOOO000 clone() {
        OOOO000 oooo000 = new OOOO000();
        if (this.f16981OooO00o == 0) {
            return oooo000;
        }
        C8927ooOOO00o OooO0O02 = this.f16982OooO00o.OooO0O0();
        oooo000.f16982OooO00o = OooO0O02;
        OooO0O02.f22171OooO0O0 = OooO0O02;
        OooO0O02.f22168OooO00o = OooO0O02;
        C8927ooOOO00o ooooo00o = this.f16982OooO00o;
        while (true) {
            ooooo00o = ooooo00o.f22168OooO00o;
            if (ooooo00o != this.f16982OooO00o) {
                oooo000.f16982OooO00o.f22171OooO0O0.OooO00o(ooooo00o.OooO0O0());
            } else {
                oooo000.f16981OooO00o = this.f16981OooO00o;
                return oooo000;
            }
        }
    }

    @Override // com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public short m16599OooO00o() {
        return C8976ooOOoO00.OooO00o(readShort());
    }

    @Override // com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    public int OooO00o() {
        return C8976ooOOoO00.OooO00o(readInt());
    }

    @Override // com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public final OooO0OO m16604OooO0O0() {
        return OooO0O0(new OooO0OO());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0091, code lost:
        if (r8 != r9) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0093, code lost:
        r15.f16982OooO00o = r6.OooO00o();
        com.p118pd.sdk.OOOOO0O.OooO00o(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009d, code lost:
        r6.OooO00o = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009f, code lost:
        if (r1 != false) goto L_0x00a5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0076 A[SYNTHETIC] */
    @Override // com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    /* renamed from: OooO00o  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long m16583OooO00o() {
        /*
        // Method dump skipped, instructions count: 182
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.OOOO000.m16583OooO00o():long");
    }

    public final OooO0OO OooO0O0(OooO0OO oooO0OO) {
        if (oooO0OO.f16983OooO00o == null) {
            oooO0OO.f16983OooO00o = this;
            oooO0OO.OooO0O0 = false;
            return oooO0OO;
        }
        throw new IllegalStateException("already attached to a buffer");
    }

    @Override // com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public ByteString m16595OooO00o() {
        return new ByteString(m16602OooO00o());
    }

    @Override // com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public ByteString m16597OooO00o(long j) throws EOFException {
        return new ByteString(m16603OooO00o(j));
    }

    @Override // com.p118pd.sdk.oOOO000O
    public int OooO00o(C5987Ooooo ooooo) {
        int OooO00o2 = OooO00o(ooooo, false);
        if (OooO00o2 == -1) {
            return -1;
        }
        try {
            m16600OooO00o((long) ooooo.f17289OooO00o[OooO00o2].size());
            return OooO00o2;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    public int OooO00o(C5987Ooooo ooooo, boolean z) {
        int i;
        int i2;
        int i3;
        C8927ooOOO00o ooooo00o;
        int i4;
        C8927ooOOO00o ooooo00o2 = this.f16982OooO00o;
        int i5 = -2;
        if (ooooo00o2 != null) {
            byte[] bArr = ooooo00o2.f22170OooO00o;
            int i6 = ooooo00o2.OooO00o;
            int i7 = ooooo00o2.OooO0O0;
            int[] iArr = ooooo.OooO00o;
            C8927ooOOO00o ooooo00o3 = ooooo00o2;
            int i8 = 0;
            int i9 = -1;
            loop0:
            while (true) {
                int i10 = i8 + 1;
                int i11 = iArr[i8];
                int i12 = i10 + 1;
                int i13 = iArr[i10];
                if (i13 != -1) {
                    i9 = i13;
                }
                if (ooooo00o3 == null) {
                    break;
                }
                if (i11 < 0) {
                    int i14 = i12 + (i11 * -1);
                    while (true) {
                        int i15 = i6 + 1;
                        int i16 = i12 + 1;
                        if ((bArr[i6] & 255) != iArr[i12]) {
                            return i9;
                        }
                        boolean z2 = i16 == i14;
                        if (i15 == i7) {
                            C8927ooOOO00o ooooo00o4 = ooooo00o3.f22168OooO00o;
                            i4 = ooooo00o4.OooO00o;
                            byte[] bArr2 = ooooo00o4.f22170OooO00o;
                            i3 = ooooo00o4.OooO0O0;
                            if (ooooo00o4 != ooooo00o2) {
                                ooooo00o = ooooo00o4;
                                bArr = bArr2;
                            } else if (!z2) {
                                break loop0;
                            } else {
                                bArr = bArr2;
                                ooooo00o = null;
                            }
                        } else {
                            i3 = i7;
                            i4 = i15;
                            ooooo00o = ooooo00o3;
                        }
                        if (z2) {
                            i = iArr[i16];
                            i2 = i4;
                            i7 = i3;
                            ooooo00o3 = ooooo00o;
                            break;
                        }
                        i6 = i4;
                        i7 = i3;
                        i12 = i16;
                        ooooo00o3 = ooooo00o;
                    }
                } else {
                    int i17 = i6 + 1;
                    int i18 = bArr[i6] & 255;
                    int i19 = i12 + i11;
                    while (i12 != i19) {
                        if (i18 == iArr[i12]) {
                            i = iArr[i12 + i11];
                            if (i17 == i7) {
                                ooooo00o3 = ooooo00o3.f22168OooO00o;
                                i2 = ooooo00o3.OooO00o;
                                bArr = ooooo00o3.f22170OooO00o;
                                i7 = ooooo00o3.OooO0O0;
                                if (ooooo00o3 == ooooo00o2) {
                                    ooooo00o3 = null;
                                }
                            } else {
                                i2 = i17;
                            }
                        } else {
                            i12++;
                        }
                    }
                    return i9;
                }
                if (i >= 0) {
                    return i;
                }
                i8 = -i;
                i6 = i2;
                i5 = -2;
            }
            return z ? i5 : i9;
        } else if (z) {
            return -2;
        } else {
            return ooooo.indexOf(ByteString.EMPTY);
        }
    }

    @Override // com.p118pd.sdk.oOOO000O
    public void OooO00o(OOOO000 oooo000, long j) throws EOFException {
        long j2 = this.f16981OooO00o;
        if (j2 >= j) {
            oooo000.write(this, j);
        } else {
            oooo000.write(this, j2);
            throw new EOFException();
        }
    }

    @Override // com.p118pd.sdk.oOOO000O
    public long OooO00o(AbstractC8210oOOoO0o0 ooooo0o0) throws IOException {
        long j = this.f16981OooO00o;
        if (j > 0) {
            ooooo0o0.write(this, j);
        }
        return j;
    }

    @Override // com.p118pd.sdk.oOOO000O
    public String OooO00o(Charset charset) {
        try {
            return OooO00o(this.f16981OooO00o, charset);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.p118pd.sdk.oOOO000O
    public String OooO00o(long j, Charset charset) throws EOFException {
        C8976ooOOoO00.OooO00o(this.f16981OooO00o, 0, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        } else if (j == 0) {
            return "";
        } else {
            C8927ooOOO00o ooooo00o = this.f16982OooO00o;
            if (((long) ooooo00o.OooO00o) + j > ((long) ooooo00o.OooO0O0)) {
                return new String(m16603OooO00o(j), charset);
            }
            String str = new String(ooooo00o.f22170OooO00o, ooooo00o.OooO00o, (int) j, charset);
            int i = (int) (((long) ooooo00o.OooO00o) + j);
            ooooo00o.OooO00o = i;
            this.f16981OooO00o -= j;
            if (i == ooooo00o.OooO0O0) {
                this.f16982OooO00o = ooooo00o.OooO00o();
                OOOOO0O.OooO00o(ooooo00o);
            }
            return str;
        }
    }

    @Override // com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m16593OooO00o(long j) throws EOFException {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            long OooO00o2 = OooO00o((byte) 10, 0, j2);
            if (OooO00o2 != -1) {
                return m16614OooO0OO(OooO00o2);
            }
            if (j2 < OooO0o0() && OooO00o(j2 - 1) == 13 && OooO00o(j2) == 10) {
                return m16614OooO0OO(j2);
            }
            OOOO000 oooo000 = new OOOO000();
            OooO00o(oooo000, 0, Math.min(32L, OooO0o0()));
            throw new EOFException("\\n not found: limit=" + Math.min(OooO0o0(), j) + " content=" + oooo000.m16595OooO00o().hex() + C8318oOo0oooo.OooOooo);
        }
        throw new IllegalArgumentException("limit < 0: " + j);
    }

    @Override // com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16602OooO00o() {
        try {
            return m16603OooO00o(this.f16981OooO00o);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16603OooO00o(long j) throws EOFException {
        C8976ooOOoO00.OooO00o(this.f16981OooO00o, 0, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[((int) j)];
            readFully(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
    }

    @Override // com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m16600OooO00o(long j) throws EOFException {
        while (j > 0) {
            C8927ooOOO00o ooooo00o = this.f16982OooO00o;
            if (ooooo00o != null) {
                int min = (int) Math.min(j, (long) (ooooo00o.OooO0O0 - ooooo00o.OooO00o));
                long j2 = (long) min;
                this.f16981OooO00o -= j2;
                j -= j2;
                C8927ooOOO00o ooooo00o2 = this.f16982OooO00o;
                int i = ooooo00o2.OooO00o + min;
                ooooo00o2.OooO00o = i;
                if (i == ooooo00o2.OooO0O0) {
                    this.f16982OooO00o = ooooo00o2.OooO00o();
                    OOOOO0O.OooO00o(ooooo00o2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO000O
    public OOOO000 OooO00o(ByteString byteString) {
        if (byteString != null) {
            byteString.write(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    @Override // com.p118pd.sdk.oOOO0000
    public OOOO000 OooO00o(String str) {
        return OooO00o(str, 0, str.length());
    }

    @Override // com.p118pd.sdk.oOOO0000
    public OOOO000 OooO00o(String str, int i, int i2) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i);
        } else if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        } else if (i2 <= str.length()) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    C8927ooOOO00o OooO00o2 = m16590OooO00o(1);
                    byte[] bArr = OooO00o2.f22170OooO00o;
                    int i3 = OooO00o2.OooO0O0 - i;
                    int min = Math.min(i2, 8192 - i3);
                    int i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                    while (i4 < min) {
                        char charAt2 = str.charAt(i4);
                        if (charAt2 >= 128) {
                            break;
                        }
                        bArr[i4 + i3] = (byte) charAt2;
                        i4++;
                    }
                    int i5 = OooO00o2.OooO0O0;
                    int i6 = (i3 + i4) - i5;
                    OooO00o2.OooO0O0 = i5 + i6;
                    this.f16981OooO00o += (long) i6;
                    i = i4;
                } else {
                    if (charAt < 2048) {
                        OooO0o0((charAt >> 6) | 192);
                        OooO0o0((charAt & '?') | 128);
                    } else if (charAt < 55296 || charAt > 57343) {
                        OooO0o0((charAt >> '\f') | C7967oO0oOo00.Ooooo0o);
                        OooO0o0(((charAt >> 6) & 63) | 128);
                        OooO0o0((charAt & '?') | 128);
                    } else {
                        int i7 = i + 1;
                        char charAt3 = i7 < i2 ? str.charAt(i7) : 0;
                        if (charAt > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                            OooO0o0(63);
                            i = i7;
                        } else {
                            int i8 = (((charAt & 10239) << 10) | (9215 & charAt3)) + 65536;
                            OooO0o0((i8 >> 18) | 240);
                            OooO0o0(((i8 >> 12) & 63) | 128);
                            OooO0o0(((i8 >> 6) & 63) | 128);
                            OooO0o0((i8 & 63) | 128);
                            i += 2;
                        }
                    }
                    i++;
                }
            }
            return this;
        } else {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
    }

    @Override // com.p118pd.sdk.oOOO0000
    public OOOO000 OooO00o(String str, Charset charset) {
        return OooO00o(str, 0, str.length(), charset);
    }

    @Override // com.p118pd.sdk.oOOO0000
    public OOOO000 OooO00o(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + i);
        } else if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        } else if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        } else if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (charset.equals(C8976ooOOoO00.OooO00o)) {
            return OooO00o(str, i, i2);
        } else {
            byte[] bytes = str.substring(i, i2).getBytes(charset);
            return OooO00o(bytes, 0, bytes.length);
        }
    }

    @Override // com.p118pd.sdk.oOOO0000
    public OOOO000 OooO00o(byte[] bArr) {
        if (bArr != null) {
            return OooO00o(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // com.p118pd.sdk.oOOO0000
    public OOOO000 OooO00o(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = (long) i2;
            C8976ooOOoO00.OooO00o((long) bArr.length, (long) i, j);
            int i3 = i2 + i;
            while (i < i3) {
                C8927ooOOO00o OooO00o2 = m16590OooO00o(1);
                int min = Math.min(i3 - i, 8192 - OooO00o2.OooO0O0);
                System.arraycopy(bArr, i, OooO00o2.f22170OooO00o, OooO00o2.OooO0O0, min);
                i += min;
                OooO00o2.OooO0O0 += min;
            }
            this.f16981OooO00o += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // com.p118pd.sdk.oOOO0000
    public long OooO00o(AbstractC8930ooOOO0OO ooooo0oo) throws IOException {
        if (ooooo0oo != null) {
            long j = 0;
            while (true) {
                long read = ooooo0oo.read(this, 8192);
                if (read == -1) {
                    return j;
                }
                j += read;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    @Override // com.p118pd.sdk.oOOO0000
    public oOOO0000 OooO00o(AbstractC8930ooOOO0OO ooooo0oo, long j) throws IOException {
        while (j > 0) {
            long read = ooooo0oo.read(this, j);
            if (read != -1) {
                j -= read;
            } else {
                throw new EOFException();
            }
        }
        return this;
    }

    @Override // com.p118pd.sdk.oOOO0000
    /* renamed from: OooO00o */
    public OOOO000 OooO0o0(int i) {
        C8927ooOOO00o OooO00o2 = m16590OooO00o(1);
        byte[] bArr = OooO00o2.f22170OooO00o;
        int i2 = OooO00o2.OooO0O0;
        OooO00o2.OooO0O0 = i2 + 1;
        bArr[i2] = (byte) i;
        this.f16981OooO00o++;
        return this;
    }

    @Override // com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public OOOO000 OooO0O0(long j) {
        if (j == 0) {
            return OooO0o0(48);
        }
        boolean z = false;
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                return OooO00o("-9223372036854775808");
            }
            z = true;
        }
        if (j >= 100000000) {
            i = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= TinkerUncaughtExceptionHandler.QUICK_CRASH_ELAPSE) {
            i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (z) {
            i++;
        }
        C8927ooOOO00o OooO00o2 = m16590OooO00o(i);
        byte[] bArr = OooO00o2.f22170OooO00o;
        int i2 = OooO00o2.OooO0O0 + i;
        while (j != 0) {
            i2--;
            bArr[i2] = OooO00o[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i2 - 1] = 45;
        }
        OooO00o2.OooO0O0 += i;
        this.f16981OooO00o += (long) i;
        return this;
    }

    @Override // com.p118pd.sdk.oOOO0000
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C8927ooOOO00o m16590OooO00o(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        C8927ooOOO00o ooooo00o = this.f16982OooO00o;
        if (ooooo00o == null) {
            C8927ooOOO00o OooO00o2 = OOOOO0O.OooO00o();
            this.f16982OooO00o = OooO00o2;
            OooO00o2.f22171OooO0O0 = OooO00o2;
            OooO00o2.f22168OooO00o = OooO00o2;
            return OooO00o2;
        }
        C8927ooOOO00o ooooo00o2 = ooooo00o.f22171OooO0O0;
        return (ooooo00o2.OooO0O0 + i > 8192 || !ooooo00o2.f22172OooO0O0) ? ooooo00o2.OooO00o(OOOOO0O.OooO00o()) : ooooo00o2;
    }

    @Override // com.p118pd.sdk.oOOO000O
    public long OooO00o(byte b) {
        return OooO00o(b, 0, Long.MAX_VALUE);
    }

    @Override // com.p118pd.sdk.oOOO000O
    public long OooO00o(byte b, long j) {
        return OooO00o(b, j, Long.MAX_VALUE);
    }

    @Override // com.p118pd.sdk.oOOO000O
    public long OooO00o(byte b, long j, long j2) {
        C8927ooOOO00o ooooo00o;
        long j3 = 0;
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.f16981OooO00o), Long.valueOf(j), Long.valueOf(j2)));
        }
        long j4 = this.f16981OooO00o;
        if (j2 <= j4) {
            j4 = j2;
        }
        if (j == j4 || (ooooo00o = this.f16982OooO00o) == null) {
            return -1;
        }
        long j5 = this.f16981OooO00o;
        if (j5 - j < j) {
            while (j5 > j) {
                ooooo00o = ooooo00o.f22171OooO0O0;
                j5 -= (long) (ooooo00o.OooO0O0 - ooooo00o.OooO00o);
            }
        } else {
            while (true) {
                long j6 = ((long) (ooooo00o.OooO0O0 - ooooo00o.OooO00o)) + j3;
                if (j6 >= j) {
                    break;
                }
                ooooo00o = ooooo00o.f22168OooO00o;
                j3 = j6;
            }
            j5 = j3;
        }
        long j7 = j;
        while (j5 < j4) {
            byte[] bArr = ooooo00o.f22170OooO00o;
            int min = (int) Math.min((long) ooooo00o.OooO0O0, (((long) ooooo00o.OooO00o) + j4) - j5);
            for (int i = (int) ((((long) ooooo00o.OooO00o) + j7) - j5); i < min; i++) {
                if (bArr[i] == b) {
                    return ((long) (i - ooooo00o.OooO00o)) + j5;
                }
            }
            j5 += (long) (ooooo00o.OooO0O0 - ooooo00o.OooO00o);
            ooooo00o = ooooo00o.f22168OooO00o;
            j7 = j5;
        }
        return -1;
    }

    @Override // com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO000O
    public long OooO00o(ByteString byteString) throws IOException {
        return OooO00o(byteString, 0);
    }

    @Override // com.p118pd.sdk.oOOO000O
    public long OooO00o(ByteString byteString, long j) throws IOException {
        byte[] bArr;
        if (byteString.size() != 0) {
            long j2 = 0;
            if (j >= 0) {
                C8927ooOOO00o ooooo00o = this.f16982OooO00o;
                long j3 = -1;
                if (ooooo00o == null) {
                    return -1;
                }
                long j4 = this.f16981OooO00o;
                if (j4 - j < j) {
                    while (j4 > j) {
                        ooooo00o = ooooo00o.f22171OooO0O0;
                        j4 -= (long) (ooooo00o.OooO0O0 - ooooo00o.OooO00o);
                    }
                } else {
                    while (true) {
                        long j5 = ((long) (ooooo00o.OooO0O0 - ooooo00o.OooO00o)) + j2;
                        if (j5 >= j) {
                            break;
                        }
                        ooooo00o = ooooo00o.f22168OooO00o;
                        j2 = j5;
                    }
                    j4 = j2;
                }
                byte b = byteString.getByte(0);
                int size = byteString.size();
                long j6 = 1 + (this.f16981OooO00o - ((long) size));
                long j7 = j;
                C8927ooOOO00o ooooo00o2 = ooooo00o;
                long j8 = j4;
                while (j8 < j6) {
                    byte[] bArr2 = ooooo00o2.f22170OooO00o;
                    int min = (int) Math.min((long) ooooo00o2.OooO0O0, (((long) ooooo00o2.OooO00o) + j6) - j8);
                    int i = (int) ((((long) ooooo00o2.OooO00o) + j7) - j8);
                    while (i < min) {
                        if (bArr2[i] == b) {
                            bArr = bArr2;
                            if (OooO00o(ooooo00o2, i + 1, byteString, 1, size)) {
                                return ((long) (i - ooooo00o2.OooO00o)) + j8;
                            }
                        } else {
                            bArr = bArr2;
                        }
                        i++;
                        bArr2 = bArr;
                    }
                    j8 += (long) (ooooo00o2.OooO0O0 - ooooo00o2.OooO00o);
                    ooooo00o2 = ooooo00o2.f22168OooO00o;
                    j7 = j8;
                    j3 = -1;
                }
                return j3;
            }
            throw new IllegalArgumentException("fromIndex < 0");
        }
        throw new IllegalArgumentException("bytes is empty");
    }

    @Override // com.p118pd.sdk.oOOO000O
    public boolean OooO00o(long j, ByteString byteString) {
        return OooO00o(j, byteString, 0, byteString.size());
    }

    @Override // com.p118pd.sdk.oOOO000O
    public boolean OooO00o(long j, ByteString byteString, int i, int i2) {
        if (j < 0 || i < 0 || i2 < 0 || this.f16981OooO00o - j < ((long) i2) || byteString.size() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (OooO00o(((long) i3) + j) != byteString.getByte(i + i3)) {
                return false;
            }
        }
        return true;
    }

    private boolean OooO00o(C8927ooOOO00o ooooo00o, int i, ByteString byteString, int i2, int i3) {
        int i4 = ooooo00o.OooO0O0;
        byte[] bArr = ooooo00o.f22170OooO00o;
        while (i2 < i3) {
            if (i == i4) {
                ooooo00o = ooooo00o.f22168OooO00o;
                byte[] bArr2 = ooooo00o.f22170OooO00o;
                bArr = bArr2;
                i = ooooo00o.OooO00o;
                i4 = ooooo00o.OooO0O0;
            }
            if (bArr[i] != byteString.getByte(i2)) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    @Override // com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public List<Integer> m16594OooO00o() {
        if (this.f16982OooO00o == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        C8927ooOOO00o ooooo00o = this.f16982OooO00o;
        arrayList.add(Integer.valueOf(ooooo00o.OooO0O0 - ooooo00o.OooO00o));
        C8927ooOOO00o ooooo00o2 = this.f16982OooO00o;
        while (true) {
            ooooo00o2 = ooooo00o2.f22168OooO00o;
            if (ooooo00o2 == this.f16982OooO00o) {
                return arrayList;
            }
            arrayList.add(Integer.valueOf(ooooo00o2.OooO0O0 - ooooo00o2.OooO00o));
        }
    }

    @Override // com.p118pd.sdk.oOOO0000
    private ByteString OooO00o(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            if (this.f16982OooO00o != null) {
                instance.update(this.f16982OooO00o.f22170OooO00o, this.f16982OooO00o.OooO00o, this.f16982OooO00o.OooO0O0 - this.f16982OooO00o.OooO00o);
                C8927ooOOO00o ooooo00o = this.f16982OooO00o;
                while (true) {
                    ooooo00o = ooooo00o.f22168OooO00o;
                    if (ooooo00o == this.f16982OooO00o) {
                        break;
                    }
                    instance.update(ooooo00o.f22170OooO00o, ooooo00o.OooO00o, ooooo00o.OooO0O0 - ooooo00o.OooO00o);
                }
            }
            return ByteString.m14263of(instance.digest());
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        }
    }

    @Override // com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO000O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public final ByteString m16598OooO00o(ByteString byteString) {
        return OooO00o("HmacSHA1", byteString);
    }

    private ByteString OooO00o(String str, ByteString byteString) {
        try {
            Mac instance = Mac.getInstance(str);
            instance.init(new SecretKeySpec(byteString.toByteArray(), str));
            if (this.f16982OooO00o != null) {
                instance.update(this.f16982OooO00o.f22170OooO00o, this.f16982OooO00o.OooO00o, this.f16982OooO00o.OooO0O0 - this.f16982OooO00o.OooO00o);
                C8927ooOOO00o ooooo00o = this.f16982OooO00o;
                while (true) {
                    ooooo00o = ooooo00o.f22168OooO00o;
                    if (ooooo00o == this.f16982OooO00o) {
                        break;
                    }
                    instance.update(ooooo00o.f22170OooO00o, ooooo00o.OooO00o, ooooo00o.OooO0O0 - ooooo00o.OooO00o);
                }
            }
            return ByteString.m14263of(instance.doFinal());
        } catch (NoSuchAlgorithmException unused) {
            throw new AssertionError();
        } catch (InvalidKeyException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // com.p118pd.sdk.oOOO0000
    /* renamed from: OooO00o  reason: collision with other method in class */
    public final ByteString m16596OooO00o(int i) {
        if (i == 0) {
            return ByteString.EMPTY;
        }
        return new SegmentedByteString(this, i);
    }

    @Override // com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO0000, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O, com.p118pd.sdk.oOOO000O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public final OooO0OO m16584OooO00o() {
        return OooO00o(new OooO0OO());
    }

    public final OooO0OO OooO00o(OooO0OO oooO0OO) {
        if (oooO0OO.f16983OooO00o == null) {
            oooO0OO.f16983OooO00o = this;
            oooO0OO.OooO0O0 = true;
            return oooO0OO;
        }
        throw new IllegalStateException("already attached to a buffer");
    }
}
