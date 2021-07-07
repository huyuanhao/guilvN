package com.baidu.idl.face.platform.utils;

import com.p118pd.sdk.C8027oOO00oo;
import java.io.UnsupportedEncodingException;

public class Base64Utils {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int CRLF = 4;
    public static final int DEFAULT = 0;
    public static final int NO_CLOSE = 16;
    public static final int NO_PADDING = 1;
    public static final int NO_WRAP = 2;
    public static final int URL_SAFE = 8;

    public static abstract class Coder {

        /* renamed from: op */
        public int f952op;
        public byte[] output;

        public abstract int maxOutputSize(int i);

        public abstract boolean process(byte[] bArr, int i, int i2, boolean z);
    }

    public static class Decoder extends Coder {
        public static final int[] DECODE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        public static final int[] DECODE_WEBSAFE = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        public static final int EQUALS = -2;
        public static final int SKIP = -1;
        public final int[] alphabet;
        public int state;
        public int value;

        public Decoder(int i, byte[] bArr) {
            this.output = bArr;
            this.alphabet = (i & 8) == 0 ? DECODE : DECODE_WEBSAFE;
            this.state = 0;
            this.value = 0;
        }

        @Override // com.baidu.idl.face.platform.utils.Base64Utils.Coder
        public int maxOutputSize(int i) {
            return ((i * 3) / 4) + 10;
        }

        /* JADX WARNING: Removed duplicated region for block: B:70:0x00f1 A[EDGE_INSN: B:70:0x00f1->B:53:0x00f1 ?: BREAK  , SYNTHETIC] */
        @Override // com.baidu.idl.face.platform.utils.Base64Utils.Coder
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean process(byte[] r17, int r18, int r19, boolean r20) {
            /*
            // Method dump skipped, instructions count: 293
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baidu.idl.face.platform.utils.Base64Utils.Decoder.process(byte[], int, int, boolean):boolean");
        }
    }

    public static class Encoder extends Coder {
        public static final /* synthetic */ boolean $assertionsDisabled = false;
        public static final byte[] ENCODE = {C8027oOO00oo.OooO00o, 66, 67, 68, 69, 70, C8027oOO00oo.OooO0O0, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        public static final byte[] ENCODE_WEBSAFE = {C8027oOO00oo.OooO00o, 66, 67, 68, 69, 70, C8027oOO00oo.OooO0O0, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        public static final int LINE_GROUPS = 19;
        public final byte[] alphabet;
        public int count;
        public final boolean do_cr;
        public final boolean do_newline;
        public final boolean do_padding;
        public final byte[] tail;
        public int tailLen;

        public Encoder(int i, byte[] bArr) {
            this.output = bArr;
            boolean z = true;
            this.do_padding = (i & 1) == 0;
            this.do_newline = (i & 2) == 0;
            this.do_cr = (i & 4) == 0 ? false : z;
            this.alphabet = (i & 8) == 0 ? ENCODE : ENCODE_WEBSAFE;
            this.tail = new byte[2];
            this.tailLen = 0;
            this.count = this.do_newline ? 19 : -1;
        }

        @Override // com.baidu.idl.face.platform.utils.Base64Utils.Coder
        public int maxOutputSize(int i) {
            return ((i * 8) / 5) + 10;
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
            */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0094  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x00e8  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x01b5  */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x00e6 A[SYNTHETIC] */
        @Override // com.baidu.idl.face.platform.utils.Base64Utils.Coder
        public boolean process(byte[] r18, int r19, int r20, boolean r21) {
            /*
            // Method dump skipped, instructions count: 483
            */
            throw new UnsupportedOperationException("Method not decompiled: com.baidu.idl.face.platform.utils.Base64Utils.Encoder.process(byte[], int, int, boolean):boolean");
        }
    }

    public static byte[] decode(String str, int i) throws IllegalArgumentException {
        return decode(str.getBytes(), i);
    }

    public static byte[] encode(byte[] bArr, int i) {
        return encode(bArr, 0, bArr.length, i);
    }

    public static String encodeToString(byte[] bArr, int i) {
        try {
            return new String(encode(bArr, i), "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    public static byte[] decode(byte[] bArr, int i) throws IllegalArgumentException {
        return decode(bArr, 0, bArr.length, i);
    }

    public static byte[] encode(byte[] bArr, int i, int i2, int i3) {
        Encoder encoder = new Encoder(i3, null);
        int i4 = (i2 / 3) * 4;
        int i5 = 2;
        if (!encoder.do_padding) {
            int i6 = i2 % 3;
            if (i6 == 1) {
                i4 += 2;
            } else if (i6 == 2) {
                i4 += 3;
            }
        } else if (i2 % 3 > 0) {
            i4 += 4;
        }
        if (encoder.do_newline && i2 > 0) {
            int i7 = ((i2 - 1) / 57) + 1;
            if (!encoder.do_cr) {
                i5 = 1;
            }
            i4 += i7 * i5;
        }
        encoder.output = new byte[i4];
        encoder.process(bArr, i, i2, true);
        return encoder.output;
    }

    public static byte[] decode(byte[] bArr, int i, int i2, int i3) throws IllegalArgumentException {
        Decoder decoder = new Decoder(i3, new byte[((i2 * 3) / 4)]);
        if (decoder.process(bArr, i, i2, true)) {
            int i4 = decoder.f952op;
            byte[] bArr2 = decoder.output;
            if (i4 == bArr2.length) {
                return bArr2;
            }
            byte[] bArr3 = new byte[i4];
            System.arraycopy(bArr2, 0, bArr3, 0, i4);
            return bArr3;
        }
        throw new IllegalArgumentException("bad base-64");
    }

    public static String encodeToString(byte[] bArr, int i, int i2, int i3) {
        try {
            return new String(encode(bArr, i, i2, i3), "US-ASCII");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
