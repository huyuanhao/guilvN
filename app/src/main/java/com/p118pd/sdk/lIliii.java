package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.pd.sdk.丨lIliii  reason: invalid class name */
public class lIliii implements AbstractC6469l1LIL {
    public final byte[] OooO00o = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    public final byte[] OooO0O0 = new byte[128];

    public lIliii() {
        OooO00o();
    }

    public static boolean OooO00o(char c) {
        return c == '\n' || c == '\r' || c == '\t' || c == ' ';
    }

    @Override // com.p118pd.sdk.AbstractC6469l1LIL
    public int OooO00o(String str, OutputStream outputStream) throws IOException {
        int length = str.length();
        while (length > 0 && OooO00o(str.charAt(length - 1))) {
            length--;
        }
        int i = 0;
        int i2 = 0;
        while (i < length) {
            while (i < length && OooO00o(str.charAt(i))) {
                i++;
            }
            int i3 = i + 1;
            byte b = this.OooO0O0[str.charAt(i)];
            while (i3 < length && OooO00o(str.charAt(i3))) {
                i3++;
            }
            int i4 = i3 + 1;
            byte b2 = this.OooO0O0[str.charAt(i3)];
            if ((b | b2) >= 0) {
                outputStream.write((b << 4) | b2);
                i2++;
                i = i4;
            } else {
                throw new IOException("invalid characters encountered in Hex string");
            }
        }
        return i2;
    }

    @Override // com.p118pd.sdk.AbstractC6469l1LIL
    public int OooO00o(byte[] bArr, int i, int i2, OutputStream outputStream) throws IOException {
        int i3 = i2 + i;
        while (i3 > i && OooO00o((char) bArr[i3 - 1])) {
            i3--;
        }
        int i4 = 0;
        while (i < i3) {
            while (i < i3 && OooO00o((char) bArr[i])) {
                i++;
            }
            int i5 = i + 1;
            byte b = this.OooO0O0[bArr[i]];
            while (i5 < i3 && OooO00o((char) bArr[i5])) {
                i5++;
            }
            int i6 = i5 + 1;
            byte b2 = this.OooO0O0[bArr[i5]];
            if ((b | b2) >= 0) {
                outputStream.write((b << 4) | b2);
                i4++;
                i = i6;
            } else {
                throw new IOException("invalid characters encountered in Hex data");
            }
        }
        return i4;
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
            byte[] bArr2 = this.OooO00o;
            if (i < bArr2.length) {
                this.OooO0O0[bArr2[i]] = (byte) i;
                i++;
            } else {
                byte[] bArr3 = this.OooO0O0;
                bArr3[65] = bArr3[97];
                bArr3[66] = bArr3[98];
                bArr3[67] = bArr3[99];
                bArr3[68] = bArr3[100];
                bArr3[69] = bArr3[101];
                bArr3[70] = bArr3[102];
                return;
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC6469l1LIL
    public int OooO0O0(byte[] bArr, int i, int i2, OutputStream outputStream) throws IOException {
        for (int i3 = i; i3 < i + i2; i3++) {
            int i4 = bArr[i3] & 255;
            outputStream.write(this.OooO00o[i4 >>> 4]);
            outputStream.write(this.OooO00o[i4 & 15]);
        }
        return i2 * 2;
    }
}
