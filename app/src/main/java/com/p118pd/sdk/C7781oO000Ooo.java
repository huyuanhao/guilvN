package com.p118pd.sdk;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* renamed from: com.pd.sdk.oO000Ooo  reason: case insensitive filesystem */
public final class C7781oO000Ooo implements ImageHeaderParser {
    public static final int OooO = 255;
    public static final String OooO00o = "DfltImageHeaderParser";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final byte[] f20821OooO00o = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final int[] f20822OooO00o = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};
    public static final int OooO0O0 = 4671814;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final String f20823OooO0O0 = "Exif\u0000\u0000";
    public static final int OooO0OO = -1991225785;
    public static final int OooO0Oo = 65496;
    public static final int OooO0o = 18761;
    public static final int OooO0o0 = 19789;
    public static final int OooO0oO = 218;
    public static final int OooO0oo = 217;
    public static final int OooOO0 = 225;
    public static final int OooOO0O = 274;
    public static final int OooOO0o = 1380533830;
    public static final int OooOOO = 1448097792;
    public static final int OooOOO0 = 1464156752;
    public static final int OooOOOO = -256;
    public static final int OooOOOo = 255;
    public static final int OooOOo = 76;
    public static final int OooOOo0 = 88;
    public static final int OooOOoo = 16;
    public static final int OooOo00 = 8;

    /* renamed from: com.pd.sdk.oO000Ooo$OooO00o */
    public static final class OooO00o implements OooO0OO {
        public final ByteBuffer OooO00o;

        public OooO00o(ByteBuffer byteBuffer) {
            this.OooO00o = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.p118pd.sdk.C7781oO000Ooo.OooO0OO, com.p118pd.sdk.C7781oO000Ooo.OooO0OO
        public int OooO00o() {
            return ((OooO0O0() << 8) & 65280) | (OooO0O0() & 255);
        }

        @Override // com.p118pd.sdk.C7781oO000Ooo.OooO0OO
        public int OooO0O0() {
            if (this.OooO00o.remaining() < 1) {
                return -1;
            }
            return this.OooO00o.get();
        }

        @Override // com.p118pd.sdk.C7781oO000Ooo.OooO0OO
        public long skip(long j) {
            int min = (int) Math.min((long) this.OooO00o.remaining(), j);
            ByteBuffer byteBuffer = this.OooO00o;
            byteBuffer.position(byteBuffer.position() + min);
            return (long) min;
        }

        @Override // com.p118pd.sdk.C7781oO000Ooo.OooO0OO, com.p118pd.sdk.C7781oO000Ooo.OooO0OO
        /* renamed from: OooO00o  reason: collision with other method in class */
        public short m19436OooO00o() {
            return (short) (OooO0O0() & 255);
        }

        @Override // com.p118pd.sdk.C7781oO000Ooo.OooO0OO
        public int OooO00o(byte[] bArr, int i) {
            int min = Math.min(i, this.OooO00o.remaining());
            if (min == 0) {
                return -1;
            }
            this.OooO00o.get(bArr, 0, min);
            return min;
        }
    }

    /* renamed from: com.pd.sdk.oO000Ooo$OooO0O0 */
    public static final class OooO0O0 {
        public final ByteBuffer OooO00o;

        public OooO0O0(byte[] bArr, int i) {
            this.OooO00o = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        public void OooO00o(ByteOrder byteOrder) {
            this.OooO00o.order(byteOrder);
        }

        public int OooO00o() {
            return this.OooO00o.remaining();
        }

        public int OooO00o(int i) {
            if (OooO00o(i, 4)) {
                return this.OooO00o.getInt(i);
            }
            return -1;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public short m19437OooO00o(int i) {
            if (OooO00o(i, 2)) {
                return this.OooO00o.getShort(i);
            }
            return -1;
        }

        private boolean OooO00o(int i, int i2) {
            return this.OooO00o.remaining() - i >= i2;
        }
    }

    /* renamed from: com.pd.sdk.oO000Ooo$OooO0OO */
    public interface OooO0OO {
        int OooO00o() throws IOException;

        int OooO00o(byte[] bArr, int i) throws IOException;

        /* renamed from: OooO00o  reason: collision with other method in class */
        short m19438OooO00o() throws IOException;

        int OooO0O0() throws IOException;

        long skip(long j) throws IOException;
    }

    /* renamed from: com.pd.sdk.oO000Ooo$OooO0Oo  reason: case insensitive filesystem */
    public static final class C7782OooO0Oo implements OooO0OO {
        public final InputStream OooO00o;

        public C7782OooO0Oo(InputStream inputStream) {
            this.OooO00o = inputStream;
        }

        @Override // com.p118pd.sdk.C7781oO000Ooo.OooO0OO, com.p118pd.sdk.C7781oO000Ooo.OooO0OO
        public int OooO00o() throws IOException {
            return ((this.OooO00o.read() << 8) & 65280) | (this.OooO00o.read() & 255);
        }

        @Override // com.p118pd.sdk.C7781oO000Ooo.OooO0OO
        public int OooO0O0() throws IOException {
            return this.OooO00o.read();
        }

        @Override // com.p118pd.sdk.C7781oO000Ooo.OooO0OO
        public long skip(long j) throws IOException {
            if (j < 0) {
                return 0;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.OooO00o.skip(j2);
                if (skip <= 0) {
                    if (this.OooO00o.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }

        @Override // com.p118pd.sdk.C7781oO000Ooo.OooO0OO, com.p118pd.sdk.C7781oO000Ooo.OooO0OO
        /* renamed from: OooO00o  reason: collision with other method in class */
        public short m19439OooO00o() throws IOException {
            return (short) (this.OooO00o.read() & 255);
        }

        @Override // com.p118pd.sdk.C7781oO000Ooo.OooO0OO
        public int OooO00o(byte[] bArr, int i) throws IOException {
            int i2 = i;
            while (i2 > 0) {
                int read = this.OooO00o.read(bArr, i - i2, i2);
                if (read == -1) {
                    break;
                }
                i2 -= read;
            }
            return i - i2;
        }
    }

    public static int OooO00o(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    public static boolean OooO00o(int i) {
        return (i & OooO0Oo) == 65496 || i == 19789 || i == 18761;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public ImageHeaderParser.ImageType OooO00o(@NonNull InputStream inputStream) throws IOException {
        return m19435OooO00o((OooO0OO) new C7782OooO0Oo((InputStream) C7842oO0O0.OooO00o(inputStream)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public ImageHeaderParser.ImageType OooO00o(@NonNull ByteBuffer byteBuffer) throws IOException {
        return m19435OooO00o((OooO0OO) new OooO00o((ByteBuffer) C7842oO0O0.OooO00o(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int OooO00o(@NonNull InputStream inputStream, @NonNull AbstractC7707o0ooO00O o0ooo00o) throws IOException {
        return OooO00o(new C7782OooO0Oo((InputStream) C7842oO0O0.OooO00o(inputStream)), (AbstractC7707o0ooO00O) C7842oO0O0.OooO00o(o0ooo00o));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int OooO00o(@NonNull ByteBuffer byteBuffer, @NonNull AbstractC7707o0ooO00O o0ooo00o) throws IOException {
        return OooO00o(new OooO00o((ByteBuffer) C7842oO0O0.OooO00o(byteBuffer)), (AbstractC7707o0ooO00O) C7842oO0O0.OooO00o(o0ooo00o));
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    private ImageHeaderParser.ImageType m19435OooO00o(OooO0OO oooO0OO) throws IOException {
        int OooO00o2 = oooO0OO.OooO00o();
        if (OooO00o2 == 65496) {
            return ImageHeaderParser.ImageType.JPEG;
        }
        int OooO00o3 = ((OooO00o2 << 16) & -65536) | (oooO0OO.OooO00o() & 65535);
        if (OooO00o3 == -1991225785) {
            oooO0OO.skip(21);
            return oooO0OO.OooO0O0() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
        } else if ((OooO00o3 >> 8) == 4671814) {
            return ImageHeaderParser.ImageType.GIF;
        } else {
            if (OooO00o3 != 1380533830) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            oooO0OO.skip(4);
            if ((((oooO0OO.OooO00o() << 16) & -65536) | (oooO0OO.OooO00o() & 65535)) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int OooO00o4 = ((oooO0OO.OooO00o() << 16) & -65536) | (oooO0OO.OooO00o() & 65535);
            if ((OooO00o4 & -256) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i = OooO00o4 & 255;
            if (i == 88) {
                oooO0OO.skip(4);
                return (oooO0OO.OooO0O0() & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            } else if (i != 76) {
                return ImageHeaderParser.ImageType.WEBP;
            } else {
                oooO0OO.skip(4);
                return (oooO0OO.OooO0O0() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
        }
    }

    private int OooO00o(OooO0OO oooO0OO, AbstractC7707o0ooO00O o0ooo00o) throws IOException {
        int OooO00o2 = oooO0OO.OooO00o();
        if (!OooO00o(OooO00o2)) {
            if (Log.isLoggable(OooO00o, 3)) {
                String str = "Parser doesn't handle magic number: " + OooO00o2;
            }
            return -1;
        }
        int OooO00o3 = OooO00o(oooO0OO);
        if (OooO00o3 == -1) {
            Log.isLoggable(OooO00o, 3);
            return -1;
        }
        byte[] bArr = (byte[]) o0ooo00o.OooO0O0(OooO00o3, byte[].class);
        try {
            return OooO00o(oooO0OO, bArr, OooO00o3);
        } finally {
            o0ooo00o.OooO00o(bArr);
        }
    }

    private int OooO00o(OooO0OO oooO0OO, byte[] bArr, int i) throws IOException {
        int OooO00o2 = oooO0OO.OooO00o(bArr, i);
        if (OooO00o2 != i) {
            if (Log.isLoggable(OooO00o, 3)) {
                String str = "Unable to read exif segment data, length: " + i + ", actually read: " + OooO00o2;
            }
            return -1;
        } else if (OooO00o(bArr, i)) {
            return OooO00o(new OooO0O0(bArr, i));
        } else {
            Log.isLoggable(OooO00o, 3);
            return -1;
        }
    }

    private boolean OooO00o(byte[] bArr, int i) {
        boolean z = bArr != null && i > f20821OooO00o.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = f20821OooO00o;
                if (i2 >= bArr2.length) {
                    break;
                } else if (bArr[i2] != bArr2[i2]) {
                    return false;
                } else {
                    i2++;
                }
            }
        }
        return z;
    }

    private int OooO00o(OooO0OO oooO0OO) throws IOException {
        short OooO00o2;
        int OooO00o3;
        long j;
        long skip;
        do {
            short OooO00o4 = oooO0OO.m19438OooO00o();
            if (OooO00o4 != 255) {
                if (Log.isLoggable(OooO00o, 3)) {
                    String str = "Unknown segmentId=" + ((int) OooO00o4);
                }
                return -1;
            }
            OooO00o2 = oooO0OO.m19438OooO00o();
            if (OooO00o2 == 218) {
                return -1;
            }
            if (OooO00o2 == 217) {
                Log.isLoggable(OooO00o, 3);
                return -1;
            }
            OooO00o3 = oooO0OO.OooO00o() - 2;
            if (OooO00o2 == 225) {
                return OooO00o3;
            }
            j = (long) OooO00o3;
            skip = oooO0OO.skip(j);
        } while (skip == j);
        if (Log.isLoggable(OooO00o, 3)) {
            String str2 = "Unable to skip enough data, type: " + ((int) OooO00o2) + ", wanted to skip: " + OooO00o3 + ", but actually skipped: " + skip;
        }
        return -1;
    }

    public static int OooO00o(OooO0O0 oooO0O0) {
        ByteOrder byteOrder;
        short OooO00o2 = oooO0O0.m19437OooO00o(6);
        if (OooO00o2 == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (OooO00o2 != 19789) {
            if (Log.isLoggable(OooO00o, 3)) {
                String str = "Unknown endianness = " + ((int) OooO00o2);
            }
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        oooO0O0.OooO00o(byteOrder);
        int OooO00o3 = oooO0O0.OooO00o(10) + 6;
        short OooO00o4 = oooO0O0.m19437OooO00o(OooO00o3);
        for (int i = 0; i < OooO00o4; i++) {
            int OooO00o5 = OooO00o(OooO00o3, i);
            short OooO00o6 = oooO0O0.m19437OooO00o(OooO00o5);
            if (OooO00o6 == 274) {
                short OooO00o7 = oooO0O0.m19437OooO00o(OooO00o5 + 2);
                if (OooO00o7 >= 1 && OooO00o7 <= 12) {
                    int OooO00o8 = oooO0O0.OooO00o(OooO00o5 + 4);
                    if (OooO00o8 < 0) {
                        Log.isLoggable(OooO00o, 3);
                    } else {
                        if (Log.isLoggable(OooO00o, 3)) {
                            String str2 = "Got tagIndex=" + i + " tagType=" + ((int) OooO00o6) + " formatCode=" + ((int) OooO00o7) + " componentCount=" + OooO00o8;
                        }
                        int i2 = OooO00o8 + f20822OooO00o[OooO00o7];
                        if (i2 <= 4) {
                            int i3 = OooO00o5 + 8;
                            if (i3 < 0 || i3 > oooO0O0.OooO00o()) {
                                if (Log.isLoggable(OooO00o, 3)) {
                                    String str3 = "Illegal tagValueOffset=" + i3 + " tagType=" + ((int) OooO00o6);
                                }
                            } else if (i2 >= 0 && i2 + i3 <= oooO0O0.OooO00o()) {
                                return oooO0O0.m19437OooO00o(i3);
                            } else {
                                if (Log.isLoggable(OooO00o, 3)) {
                                    String str4 = "Illegal number of bytes for TI tag data tagType=" + ((int) OooO00o6);
                                }
                            }
                        } else if (Log.isLoggable(OooO00o, 3)) {
                            String str5 = "Got byte count > 4, not orientation, continuing, formatCode=" + ((int) OooO00o7);
                        }
                    }
                } else if (Log.isLoggable(OooO00o, 3)) {
                    String str6 = "Got invalid format code = " + ((int) OooO00o7);
                }
            }
        }
        return -1;
    }
}
