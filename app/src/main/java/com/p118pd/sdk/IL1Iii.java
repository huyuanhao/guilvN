package com.p118pd.sdk;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1ParsingException;

/* renamed from: com.pd.sdk.IL1Iii */
public abstract class IL1Iii extends AbstractC6122iIlLiL implements AbstractC98681 {
    public static final char[] OooO00o = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f15549OooO00o;
    public final int o00oO0O;

    public IL1Iii(byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException("data cannot be null");
        } else if (bArr.length == 0 && i != 0) {
            throw new IllegalArgumentException("zero length data with non-zero pad bits");
        } else if (i > 7 || i < 0) {
            throw new IllegalArgumentException("pad bits cannot be greater than 7 or less than 0");
        } else {
            this.f15549OooO00o = C9586iIILl.m21630OooO00o(bArr);
            this.o00oO0O = i;
        }
    }

    public static int OooO00o(int i) {
        int i2;
        int i3 = 3;
        while (true) {
            if (i3 < 0) {
                i2 = 0;
                break;
            }
            if (i3 != 0) {
                int i4 = i >> (i3 * 8);
                if (i4 != 0) {
                    i2 = i4 & 255;
                    break;
                }
            } else if (i != 0) {
                i2 = i & 255;
                break;
            }
            i3--;
        }
        if (i2 == 0) {
            return 0;
        }
        int i5 = 1;
        while (true) {
            i2 <<= 1;
            if ((i2 & 255) == 0) {
                return 8 - i5;
            }
            i5++;
        }
    }

    public static IL1Iii OooO00o(int i, InputStream inputStream) throws IOException {
        if (i >= 1) {
            int read = inputStream.read();
            int i2 = i - 1;
            byte[] bArr = new byte[i2];
            if (i2 != 0) {
                if (C6304ilIi1.OooO00o(inputStream, bArr) != i2) {
                    throw new EOFException("EOF encountered in middle of BIT STRING");
                } else if (read > 0 && read < 8) {
                    int i3 = i2 - 1;
                    if (bArr[i3] != ((byte) (bArr[i3] & (255 << read)))) {
                        return new C9386IillIi(bArr, read);
                    }
                }
            }
            return new iIilII1(bArr, read);
        }
        throw new IllegalArgumentException("truncated BIT STRING detected");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m15473OooO00o(int i) {
        if (i == 0) {
            return new byte[0];
        }
        int i2 = 4;
        int i3 = 3;
        while (i3 >= 1 && ((255 << (i3 * 8)) & i) == 0) {
            i2--;
            i3--;
        }
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) ((i >> (i4 * 8)) & 255);
        }
        return bArr;
    }

    public static byte[] OooO00o(byte[] bArr, int i) {
        byte[] OooO00o2 = C9586iIILl.m21630OooO00o(bArr);
        if (i > 0) {
            int length = bArr.length - 1;
            OooO00o2[length] = (byte) ((255 << i) & OooO00o2[length]);
        }
        return OooO00o2;
    }

    @Override // com.p118pd.sdk.AbstractC98681, com.p118pd.sdk.AbstractC6122iIlLiL
    public AbstractC6122iIlLiL OooO00o() {
        return m17017OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC98681, com.p118pd.sdk.AbstractC6122iIlLiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m15474OooO00o() {
        StringBuffer stringBuffer = new StringBuffer("#");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new C6103iIi1(byteArrayOutputStream).OooO00o((AbstractC6854lLi1LL) this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int i = 0; i != byteArray.length; i++) {
                stringBuffer.append(OooO00o[(byteArray[i] >>> 4) & 15]);
                stringBuffer.append(OooO00o[byteArray[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e) {
            throw new ASN1ParsingException("Internal error encoding BitString: " + e.getMessage(), e);
        }
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public abstract void OooO00o(C6103iIi1 iii1) throws IOException;

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public boolean OooO00o(AbstractC6122iIlLiL iillil) {
        if (!(iillil instanceof IL1Iii)) {
            return false;
        }
        IL1Iii iL1Iii = (IL1Iii) iillil;
        return this.o00oO0O == iL1Iii.o00oO0O && C9586iIILl.m21627OooO00o(m15475OooO00o(), iL1Iii.m15475OooO00o());
    }

    @Override // com.p118pd.sdk.AbstractC98681, com.p118pd.sdk.AbstractC6122iIlLiL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m15475OooO00o() {
        return OooO00o(this.f15549OooO00o, this.o00oO0O);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6854lLi1LL
    public byte[] OooO0O0() {
        if (this.o00oO0O == 0) {
            return C9586iIILl.m21630OooO00o(this.f15549OooO00o);
        }
        throw new IllegalStateException("attempt to get non-octet aligned data from BIT STRING");
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil
    public int OooO0OO() {
        return this.o00oO0O;
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public int OooO0Oo() {
        byte[] bArr = this.f15549OooO00o;
        int i = this.o00oO0O;
        if (i > 0 && bArr.length <= 4) {
            bArr = OooO00o(bArr, i);
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 != bArr.length && i2 != 4) {
            i3 |= (bArr[i2] & 255) << (i2 * 8);
            i2++;
        }
        return i3;
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public AbstractC6122iIlLiL m15476OooO0Oo() {
        return new iIilII1(this.f15549OooO00o, this.o00oO0O);
    }

    @Override // com.p118pd.sdk.AbstractC6122iIlLiL
    public AbstractC6122iIlLiL OooO0o0() {
        return new C9386IillIi(this.f15549OooO00o, this.o00oO0O);
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6122iIlLiL
    public int hashCode() {
        return this.o00oO0O ^ C9586iIILl.OooO00o(m15475OooO00o());
    }

    public String toString() {
        return m15474OooO00o();
    }
}
