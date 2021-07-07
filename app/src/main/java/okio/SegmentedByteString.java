package okio;

import com.p118pd.sdk.C8927ooOOO00o;
import com.p118pd.sdk.C8976ooOOoO00;
import com.p118pd.sdk.OOOO000;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

public final class SegmentedByteString extends ByteString {
    public final transient int[] directory;
    public final transient byte[][] segments;

    public SegmentedByteString(OOOO000 oooo000, int i) {
        super(null);
        C8976ooOOoO00.OooO00o(oooo000.f16981OooO00o, 0, (long) i);
        C8927ooOOO00o ooooo00o = oooo000.f16982OooO00o;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = ooooo00o.OooO0O0;
            int i6 = ooooo00o.OooO00o;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                ooooo00o = ooooo00o.f22168OooO00o;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.segments = new byte[i4][];
        this.directory = new int[(i4 * 2)];
        C8927ooOOO00o ooooo00o2 = oooo000.f16982OooO00o;
        int i7 = 0;
        while (i2 < i) {
            this.segments[i7] = ooooo00o2.f22170OooO00o;
            i2 += ooooo00o2.OooO0O0 - ooooo00o2.OooO00o;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.directory;
            iArr[i7] = i2;
            iArr[this.segments.length + i7] = ooooo00o2.OooO00o;
            ooooo00o2.f22169OooO00o = true;
            i7++;
            ooooo00o2 = ooooo00o2.f22168OooO00o;
        }
    }

    private int OooO00o(int i) {
        int binarySearch = Arrays.binarySearch(this.directory, 0, this.segments.length, i + 1);
        return binarySearch >= 0 ? binarySearch : binarySearch ^ -1;
    }

    private Object writeReplace() {
        return OooO00o();
    }

    @Override // okio.ByteString
    public ByteBuffer asByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // okio.ByteString
    public String base64() {
        return OooO00o().base64();
    }

    @Override // okio.ByteString
    public String base64Url() {
        return OooO00o().base64Url();
    }

    @Override // okio.ByteString
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() != size() || !rangeEquals(0, byteString, 0, size())) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // okio.ByteString
    public byte getByte(int i) {
        int i2;
        C8976ooOOoO00.OooO00o((long) this.directory[this.segments.length - 1], (long) i, 1);
        int OooO00o = OooO00o(i);
        if (OooO00o == 0) {
            i2 = 0;
        } else {
            i2 = this.directory[OooO00o - 1];
        }
        int[] iArr = this.directory;
        byte[][] bArr = this.segments;
        return bArr[OooO00o][(i - i2) + iArr[bArr.length + OooO00o]];
    }

    @Override // okio.ByteString
    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int length = this.segments.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr = this.segments[i2];
            int[] iArr = this.directory;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i3) + i5;
            while (i5 < i7) {
                i4 = (i4 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        this.hashCode = i4;
        return i4;
    }

    @Override // okio.ByteString
    public String hex() {
        return OooO00o().hex();
    }

    @Override // okio.ByteString
    public ByteString hmacSha1(ByteString byteString) {
        return OooO00o().hmacSha1(byteString);
    }

    @Override // okio.ByteString
    public ByteString hmacSha256(ByteString byteString) {
        return OooO00o().hmacSha256(byteString);
    }

    @Override // okio.ByteString
    public int indexOf(byte[] bArr, int i) {
        return OooO00o().indexOf(bArr, i);
    }

    @Override // okio.ByteString
    public byte[] internalArray() {
        return toByteArray();
    }

    @Override // okio.ByteString
    public int lastIndexOf(byte[] bArr, int i) {
        return OooO00o().lastIndexOf(bArr, i);
    }

    @Override // okio.ByteString
    public ByteString md5() {
        return OooO00o().md5();
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int i, ByteString byteString, int i2, int i3) {
        int i4;
        if (i < 0 || i > size() - i3) {
            return false;
        }
        int OooO00o = OooO00o(i);
        while (i3 > 0) {
            if (OooO00o == 0) {
                i4 = 0;
            } else {
                i4 = this.directory[OooO00o - 1];
            }
            int min = Math.min(i3, ((this.directory[OooO00o] - i4) + i4) - i);
            int[] iArr = this.directory;
            byte[][] bArr = this.segments;
            if (!byteString.rangeEquals(i2, bArr[OooO00o], (i - i4) + iArr[bArr.length + OooO00o], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            OooO00o++;
        }
        return true;
    }

    @Override // okio.ByteString
    public ByteString sha1() {
        return OooO00o().sha1();
    }

    @Override // okio.ByteString
    public ByteString sha256() {
        return OooO00o().sha256();
    }

    @Override // okio.ByteString
    public int size() {
        return this.directory[this.segments.length - 1];
    }

    @Override // okio.ByteString
    public String string(Charset charset) {
        return OooO00o().string(charset);
    }

    @Override // okio.ByteString
    public ByteString substring(int i) {
        return OooO00o().substring(i);
    }

    @Override // okio.ByteString
    public ByteString toAsciiLowercase() {
        return OooO00o().toAsciiLowercase();
    }

    @Override // okio.ByteString
    public ByteString toAsciiUppercase() {
        return OooO00o().toAsciiUppercase();
    }

    @Override // okio.ByteString
    public byte[] toByteArray() {
        int[] iArr = this.directory;
        byte[][] bArr = this.segments;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.directory;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.segments[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    @Override // okio.ByteString
    public String toString() {
        return OooO00o().toString();
    }

    @Override // okio.ByteString
    public String utf8() {
        return OooO00o().utf8();
    }

    @Override // okio.ByteString
    public void write(OutputStream outputStream) throws IOException {
        if (outputStream != null) {
            int length = this.segments.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int[] iArr = this.directory;
                int i3 = iArr[length + i];
                int i4 = iArr[i];
                outputStream.write(this.segments[i], i3, i4 - i2);
                i++;
                i2 = i4;
            }
            return;
        }
        throw new IllegalArgumentException("out == null");
    }

    private ByteString OooO00o() {
        return new ByteString(toByteArray());
    }

    @Override // okio.ByteString
    public ByteString substring(int i, int i2) {
        return OooO00o().substring(i, i2);
    }

    @Override // okio.ByteString
    public void write(OOOO000 oooo000) {
        int length = this.segments.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.directory;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            C8927ooOOO00o ooooo00o = new C8927ooOOO00o(this.segments[i], i3, (i3 + i4) - i2, true, false);
            C8927ooOOO00o ooooo00o2 = oooo000.f16982OooO00o;
            if (ooooo00o2 == null) {
                ooooo00o.f22171OooO0O0 = ooooo00o;
                ooooo00o.f22168OooO00o = ooooo00o;
                oooo000.f16982OooO00o = ooooo00o;
            } else {
                ooooo00o2.f22171OooO0O0.OooO00o(ooooo00o);
            }
            i++;
            i2 = i4;
        }
        oooo000.f16981OooO00o += (long) i2;
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int i, byte[] bArr, int i2, int i3) {
        int i4;
        if (i < 0 || i > size() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int OooO00o = OooO00o(i);
        while (i3 > 0) {
            if (OooO00o == 0) {
                i4 = 0;
            } else {
                i4 = this.directory[OooO00o - 1];
            }
            int min = Math.min(i3, ((this.directory[OooO00o] - i4) + i4) - i);
            int[] iArr = this.directory;
            byte[][] bArr2 = this.segments;
            if (!C8976ooOOoO00.OooO00o(bArr2[OooO00o], (i - i4) + iArr[bArr2.length + OooO00o], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            OooO00o++;
        }
        return true;
    }
}
