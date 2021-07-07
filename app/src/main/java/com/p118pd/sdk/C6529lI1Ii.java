package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.pd.sdk.lI丨1Ii  reason: invalid class name and case insensitive filesystem */
public class C6529lI1Ii implements AbstractC6469l1LIL {
    public byte OooO00o = 61;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f18411OooO00o = {C8027oOO00oo.OooO00o, 66, 67, 68, 69, 70, C8027oOO00oo.OooO0O0, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    public final byte[] OooO0O0 = new byte[128];

    public C6529lI1Ii() {
        OooO00o();
    }

    private int OooO00o(OutputStream outputStream, char c, char c2, char c3, char c4) throws IOException {
        byte b = this.OooO00o;
        if (c3 == b) {
            if (c4 == b) {
                byte[] bArr = this.OooO0O0;
                byte b2 = bArr[c];
                byte b3 = bArr[c2];
                if ((b2 | b3) >= 0) {
                    outputStream.write((b2 << 2) | (b3 >> 4));
                    return 1;
                }
                throw new IOException("invalid characters encountered at end of base64 data");
            }
            throw new IOException("invalid characters encountered at end of base64 data");
        } else if (c4 == b) {
            byte[] bArr2 = this.OooO0O0;
            byte b4 = bArr2[c];
            byte b5 = bArr2[c2];
            byte b6 = bArr2[c3];
            if ((b4 | b5 | b6) >= 0) {
                outputStream.write((b4 << 2) | (b5 >> 4));
                outputStream.write((b5 << 4) | (b6 >> 2));
                return 2;
            }
            throw new IOException("invalid characters encountered at end of base64 data");
        } else {
            byte[] bArr3 = this.OooO0O0;
            byte b7 = bArr3[c];
            byte b8 = bArr3[c2];
            byte b9 = bArr3[c3];
            byte b10 = bArr3[c4];
            if ((b7 | b8 | b9 | b10) >= 0) {
                outputStream.write((b7 << 2) | (b8 >> 4));
                outputStream.write((b8 << 4) | (b9 >> 2));
                outputStream.write((b9 << 6) | b10);
                return 3;
            }
            throw new IOException("invalid characters encountered at end of base64 data");
        }
    }

    private int OooO00o(String str, int i, int i2) {
        while (i < i2 && OooO00o(str.charAt(i))) {
            i++;
        }
        return i;
    }

    private int OooO00o(byte[] bArr, int i, int i2) {
        while (i < i2 && OooO00o((char) bArr[i])) {
            i++;
        }
        return i;
    }

    private boolean OooO00o(char c) {
        return c == '\n' || c == '\r' || c == '\t' || c == ' ';
    }

    @Override // com.p118pd.sdk.AbstractC6469l1LIL
    public int OooO00o(String str, OutputStream outputStream) throws IOException {
        int length = str.length();
        while (length > 0 && OooO00o(str.charAt(length - 1))) {
            length--;
        }
        int i = 0;
        if (length == 0) {
            return 0;
        }
        int i2 = length;
        int i3 = 0;
        while (i2 > 0 && i3 != 4) {
            if (!OooO00o(str.charAt(i2 - 1))) {
                i3++;
            }
            i2--;
        }
        int OooO00o2 = OooO00o(str, 0, i2);
        while (OooO00o2 < i2) {
            int i4 = OooO00o2 + 1;
            byte b = this.OooO0O0[str.charAt(OooO00o2)];
            int OooO00o3 = OooO00o(str, i4, i2);
            int i5 = OooO00o3 + 1;
            byte b2 = this.OooO0O0[str.charAt(OooO00o3)];
            int OooO00o4 = OooO00o(str, i5, i2);
            int i6 = OooO00o4 + 1;
            byte b3 = this.OooO0O0[str.charAt(OooO00o4)];
            int OooO00o5 = OooO00o(str, i6, i2);
            int i7 = OooO00o5 + 1;
            byte b4 = this.OooO0O0[str.charAt(OooO00o5)];
            if ((b | b2 | b3 | b4) >= 0) {
                outputStream.write((b << 2) | (b2 >> 4));
                outputStream.write((b2 << 4) | (b3 >> 2));
                outputStream.write((b3 << 6) | b4);
                i += 3;
                OooO00o2 = OooO00o(str, i7, i2);
            } else {
                throw new IOException("invalid characters encountered in base64 data");
            }
        }
        int OooO00o6 = OooO00o(str, OooO00o2, length);
        int OooO00o7 = OooO00o(str, OooO00o6 + 1, length);
        int OooO00o8 = OooO00o(str, OooO00o7 + 1, length);
        return i + OooO00o(outputStream, str.charAt(OooO00o6), str.charAt(OooO00o7), str.charAt(OooO00o8), str.charAt(OooO00o(str, OooO00o8 + 1, length)));
    }

    @Override // com.p118pd.sdk.AbstractC6469l1LIL
    public int OooO00o(byte[] bArr, int i, int i2, OutputStream outputStream) throws IOException {
        int i3 = i2 + i;
        while (i3 > i && OooO00o((char) bArr[i3 - 1])) {
            i3--;
        }
        int i4 = 0;
        if (i3 == 0) {
            return 0;
        }
        int i5 = i3;
        int i6 = 0;
        while (i5 > i && i6 != 4) {
            if (!OooO00o((char) bArr[i5 - 1])) {
                i6++;
            }
            i5--;
        }
        int OooO00o2 = OooO00o(bArr, i, i5);
        while (OooO00o2 < i5) {
            int i7 = OooO00o2 + 1;
            byte b = this.OooO0O0[bArr[OooO00o2]];
            int OooO00o3 = OooO00o(bArr, i7, i5);
            int i8 = OooO00o3 + 1;
            byte b2 = this.OooO0O0[bArr[OooO00o3]];
            int OooO00o4 = OooO00o(bArr, i8, i5);
            int i9 = OooO00o4 + 1;
            byte b3 = this.OooO0O0[bArr[OooO00o4]];
            int OooO00o5 = OooO00o(bArr, i9, i5);
            int i10 = OooO00o5 + 1;
            byte b4 = this.OooO0O0[bArr[OooO00o5]];
            if ((b | b2 | b3 | b4) >= 0) {
                outputStream.write((b << 2) | (b2 >> 4));
                outputStream.write((b2 << 4) | (b3 >> 2));
                outputStream.write((b3 << 6) | b4);
                i4 += 3;
                OooO00o2 = OooO00o(bArr, i10, i5);
            } else {
                throw new IOException("invalid characters encountered in base64 data");
            }
        }
        int OooO00o6 = OooO00o(bArr, OooO00o2, i3);
        int OooO00o7 = OooO00o(bArr, OooO00o6 + 1, i3);
        int OooO00o8 = OooO00o(bArr, OooO00o7 + 1, i3);
        return i4 + OooO00o(outputStream, (char) bArr[OooO00o6], (char) bArr[OooO00o7], (char) bArr[OooO00o8], (char) bArr[OooO00o(bArr, OooO00o8 + 1, i3)]);
    }

    public void OooO00o() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.OooO0O0;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        while (true) {
            byte[] bArr2 = this.f18411OooO00o;
            if (i < bArr2.length) {
                this.OooO0O0[bArr2[i]] = (byte) i;
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x00a4  */
    @Override // com.p118pd.sdk.AbstractC6469l1LIL
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int OooO0O0(byte[] r10, int r11, int r12, java.io.OutputStream r13) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 167
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C6529lI1Ii.OooO0O0(byte[], int, int, java.io.OutputStream):int");
    }
}
