package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.iiliI丨i  reason: invalid class name and case insensitive filesystem */
public class C6276iiliIi extends C6744ll1L {
    public C6276iiliIi(li1l11I1 li1l11i1) {
        ((C6744ll1L) this).f18716OooO00o = li1l11i1;
        ((C6744ll1L) this).f18718OooO00o = new byte[li1l11i1.OooO00o()];
        ((C6744ll1L) this).OooO00o = 0;
    }

    @Override // com.p118pd.sdk.C6744ll1L
    public int OooO00o(byte b, byte[] bArr, int i) throws DataLengthException, IllegalStateException {
        int i2 = ((C6744ll1L) this).OooO00o;
        byte[] bArr2 = ((C6744ll1L) this).f18718OooO00o;
        int i3 = 0;
        if (i2 == bArr2.length) {
            int OooO00o = ((C6744ll1L) this).f18716OooO00o.OooO00o(bArr2, 0, bArr, i);
            ((C6744ll1L) this).OooO00o = 0;
            i3 = OooO00o;
        }
        byte[] bArr3 = ((C6744ll1L) this).f18718OooO00o;
        int i4 = ((C6744ll1L) this).OooO00o;
        ((C6744ll1L) this).OooO00o = i4 + 1;
        bArr3[i4] = b;
        return i3;
    }

    @Override // com.p118pd.sdk.C6744ll1L
    public int OooO00o(int i) {
        int i2 = i + ((C6744ll1L) this).OooO00o;
        byte[] bArr = ((C6744ll1L) this).f18718OooO00o;
        int length = i2 % bArr.length;
        if (length != 0) {
            i2 -= length;
        } else if (!((C6744ll1L) this).f18717OooO00o) {
            return i2;
        }
        return i2 + bArr.length;
    }

    @Override // com.p118pd.sdk.C6744ll1L
    public int OooO00o(byte[] bArr, int i) throws DataLengthException, IllegalStateException, InvalidCipherTextException {
        int i2;
        int i3;
        int OooO00o = ((C6744ll1L) this).f18716OooO00o.OooO00o();
        if (((C6744ll1L) this).f18717OooO00o) {
            if (((C6744ll1L) this).OooO00o != OooO00o) {
                i3 = 0;
            } else if ((OooO00o * 2) + i <= bArr.length) {
                i3 = ((C6744ll1L) this).f18716OooO00o.OooO00o(((C6744ll1L) this).f18718OooO00o, 0, bArr, i);
                ((C6744ll1L) this).OooO00o = 0;
            } else {
                throw new OutputLengthException("output buffer too short");
            }
            byte b = (byte) (OooO00o - ((C6744ll1L) this).OooO00o);
            while (true) {
                int i4 = ((C6744ll1L) this).OooO00o;
                if (i4 >= OooO00o) {
                    break;
                }
                ((C6744ll1L) this).f18718OooO00o[i4] = b;
                ((C6744ll1L) this).OooO00o = i4 + 1;
            }
            i2 = i3 + ((C6744ll1L) this).f18716OooO00o.OooO00o(((C6744ll1L) this).f18718OooO00o, 0, bArr, i + i3);
        } else if (((C6744ll1L) this).OooO00o == OooO00o) {
            li1l11I1 li1l11i1 = ((C6744ll1L) this).f18716OooO00o;
            byte[] bArr2 = ((C6744ll1L) this).f18718OooO00o;
            int OooO00o2 = li1l11i1.OooO00o(bArr2, 0, bArr2, 0);
            ((C6744ll1L) this).OooO00o = 0;
            byte[] bArr3 = ((C6744ll1L) this).f18718OooO00o;
            int i5 = bArr3[OooO00o - 1] & 255;
            if (i5 < 0 || i5 > OooO00o) {
                throw new InvalidCipherTextException("pad block corrupted");
            }
            i2 = OooO00o2 - i5;
            System.arraycopy(bArr3, 0, bArr, i, i2);
        } else {
            throw new DataLengthException("last block incomplete in decryption");
        }
        m17843OooO00o();
        return i2;
    }

    @Override // com.p118pd.sdk.C6744ll1L
    public int OooO00o(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException, IllegalStateException {
        if (i2 >= 0) {
            int OooO00o = OooO00o();
            int OooO0O0 = OooO0O0(i2);
            if (OooO0O0 <= 0 || OooO0O0 + i3 <= bArr2.length) {
                byte[] bArr3 = ((C6744ll1L) this).f18718OooO00o;
                int length = bArr3.length;
                int i4 = ((C6744ll1L) this).OooO00o;
                int i5 = length - i4;
                int i6 = 0;
                if (i2 > i5) {
                    System.arraycopy(bArr, i, bArr3, i4, i5);
                    ((C6744ll1L) this).OooO00o = 0;
                    i2 -= i5;
                    i += i5;
                    i6 = ((C6744ll1L) this).f18716OooO00o.OooO00o(((C6744ll1L) this).f18718OooO00o, 0, bArr2, i3) + 0;
                    while (i2 > ((C6744ll1L) this).f18718OooO00o.length) {
                        i6 += ((C6744ll1L) this).f18716OooO00o.OooO00o(bArr, i, bArr2, i3 + i6);
                        i2 -= OooO00o;
                        i += OooO00o;
                    }
                }
                System.arraycopy(bArr, i, ((C6744ll1L) this).f18718OooO00o, ((C6744ll1L) this).OooO00o, i2);
                ((C6744ll1L) this).OooO00o += i2;
                return i6;
            }
            throw new OutputLengthException("output buffer too short");
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }

    @Override // com.p118pd.sdk.C6744ll1L
    public int OooO0O0(int i) {
        int i2 = i + ((C6744ll1L) this).OooO00o;
        byte[] bArr = ((C6744ll1L) this).f18718OooO00o;
        int length = i2 % bArr.length;
        return length == 0 ? i2 - bArr.length : i2 - length;
    }
}
