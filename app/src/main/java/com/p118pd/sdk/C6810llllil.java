package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.ll丨l丨lil  reason: invalid class name and case insensitive filesystem */
public class C6810llllil extends C6744ll1L {
    public int OooO0O0;

    public C6810llllil(li1l11I1 li1l11i1) {
        if (!(li1l11i1 instanceof AbstractC9563i1I)) {
            ((C6744ll1L) this).f18716OooO00o = li1l11i1;
            int OooO00o = li1l11i1.OooO00o();
            this.OooO0O0 = OooO00o;
            ((C6744ll1L) this).f18718OooO00o = new byte[(OooO00o * 2)];
            ((C6744ll1L) this).OooO00o = 0;
            return;
        }
        throw new IllegalArgumentException("CTSBlockCipher can only accept ECB, or CBC ciphers");
    }

    @Override // com.p118pd.sdk.C6744ll1L
    public int OooO00o(byte b, byte[] bArr, int i) throws DataLengthException, IllegalStateException {
        int i2 = ((C6744ll1L) this).OooO00o;
        byte[] bArr2 = ((C6744ll1L) this).f18718OooO00o;
        int i3 = 0;
        if (i2 == bArr2.length) {
            int OooO00o = ((C6744ll1L) this).f18716OooO00o.OooO00o(bArr2, 0, bArr, i);
            byte[] bArr3 = ((C6744ll1L) this).f18718OooO00o;
            int i4 = this.OooO0O0;
            System.arraycopy(bArr3, i4, bArr3, 0, i4);
            ((C6744ll1L) this).OooO00o = this.OooO0O0;
            i3 = OooO00o;
        }
        byte[] bArr4 = ((C6744ll1L) this).f18718OooO00o;
        int i5 = ((C6744ll1L) this).OooO00o;
        ((C6744ll1L) this).OooO00o = i5 + 1;
        bArr4[i5] = b;
        return i3;
    }

    @Override // com.p118pd.sdk.C6744ll1L
    public int OooO00o(int i) {
        return i + ((C6744ll1L) this).OooO00o;
    }

    @Override // com.p118pd.sdk.C6744ll1L
    public int OooO00o(byte[] bArr, int i) throws DataLengthException, IllegalStateException, InvalidCipherTextException {
        if (((C6744ll1L) this).OooO00o + i <= bArr.length) {
            int OooO00o = ((C6744ll1L) this).f18716OooO00o.OooO00o();
            int i2 = ((C6744ll1L) this).OooO00o;
            int i3 = i2 - OooO00o;
            byte[] bArr2 = new byte[OooO00o];
            if (((C6744ll1L) this).f18717OooO00o) {
                if (i2 >= OooO00o) {
                    ((C6744ll1L) this).f18716OooO00o.OooO00o(((C6744ll1L) this).f18718OooO00o, 0, bArr2, 0);
                    int i4 = ((C6744ll1L) this).OooO00o;
                    if (i4 > OooO00o) {
                        while (true) {
                            byte[] bArr3 = ((C6744ll1L) this).f18718OooO00o;
                            if (i4 == bArr3.length) {
                                break;
                            }
                            bArr3[i4] = bArr2[i4 - OooO00o];
                            i4++;
                        }
                        for (int i5 = OooO00o; i5 != ((C6744ll1L) this).OooO00o; i5++) {
                            byte[] bArr4 = ((C6744ll1L) this).f18718OooO00o;
                            bArr4[i5] = (byte) (bArr4[i5] ^ bArr2[i5 - OooO00o]);
                        }
                        li1l11I1 li1l11i1 = ((C6744ll1L) this).f18716OooO00o;
                        if (li1l11i1 instanceof C6927lll1) {
                            ((C6927lll1) li1l11i1).m18073OooO00o().OooO00o(((C6744ll1L) this).f18718OooO00o, OooO00o, bArr, i);
                        } else {
                            li1l11i1.OooO00o(((C6744ll1L) this).f18718OooO00o, OooO00o, bArr, i);
                        }
                        System.arraycopy(bArr2, 0, bArr, i + OooO00o, i3);
                        int i6 = ((C6744ll1L) this).OooO00o;
                        m17843OooO00o();
                        return i6;
                    }
                } else {
                    throw new DataLengthException("need at least one block of input for CTS");
                }
            } else if (i2 >= OooO00o) {
                byte[] bArr5 = new byte[OooO00o];
                if (i2 > OooO00o) {
                    li1l11I1 li1l11i12 = ((C6744ll1L) this).f18716OooO00o;
                    if (li1l11i12 instanceof C6927lll1) {
                        ((C6927lll1) li1l11i12).m18073OooO00o().OooO00o(((C6744ll1L) this).f18718OooO00o, 0, bArr2, 0);
                    } else {
                        li1l11i12.OooO00o(((C6744ll1L) this).f18718OooO00o, 0, bArr2, 0);
                    }
                    for (int i7 = OooO00o; i7 != ((C6744ll1L) this).OooO00o; i7++) {
                        int i8 = i7 - OooO00o;
                        bArr5[i8] = (byte) (bArr2[i8] ^ ((C6744ll1L) this).f18718OooO00o[i7]);
                    }
                    System.arraycopy(((C6744ll1L) this).f18718OooO00o, OooO00o, bArr2, 0, i3);
                    ((C6744ll1L) this).f18716OooO00o.OooO00o(bArr2, 0, bArr, i);
                    System.arraycopy(bArr5, 0, bArr, i + OooO00o, i3);
                    int i62 = ((C6744ll1L) this).OooO00o;
                    m17843OooO00o();
                    return i62;
                }
                ((C6744ll1L) this).f18716OooO00o.OooO00o(((C6744ll1L) this).f18718OooO00o, 0, bArr2, 0);
            } else {
                throw new DataLengthException("need at least one block of input for CTS");
            }
            System.arraycopy(bArr2, 0, bArr, i, OooO00o);
            int i622 = ((C6744ll1L) this).OooO00o;
            m17843OooO00o();
            return i622;
        }
        throw new OutputLengthException("output buffer to small in doFinal");
    }

    @Override // com.p118pd.sdk.C6744ll1L
    public int OooO00o(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException, IllegalStateException {
        if (i2 >= 0) {
            int OooO00o = OooO00o();
            int OooO0O02 = OooO0O0(i2);
            if (OooO0O02 <= 0 || OooO0O02 + i3 <= bArr2.length) {
                byte[] bArr3 = ((C6744ll1L) this).f18718OooO00o;
                int length = bArr3.length;
                int i4 = ((C6744ll1L) this).OooO00o;
                int i5 = length - i4;
                int i6 = 0;
                if (i2 > i5) {
                    System.arraycopy(bArr, i, bArr3, i4, i5);
                    int OooO00o2 = ((C6744ll1L) this).f18716OooO00o.OooO00o(((C6744ll1L) this).f18718OooO00o, 0, bArr2, i3) + 0;
                    byte[] bArr4 = ((C6744ll1L) this).f18718OooO00o;
                    System.arraycopy(bArr4, OooO00o, bArr4, 0, OooO00o);
                    ((C6744ll1L) this).OooO00o = OooO00o;
                    i2 -= i5;
                    i += i5;
                    while (i2 > OooO00o) {
                        System.arraycopy(bArr, i, ((C6744ll1L) this).f18718OooO00o, ((C6744ll1L) this).OooO00o, OooO00o);
                        OooO00o2 += ((C6744ll1L) this).f18716OooO00o.OooO00o(((C6744ll1L) this).f18718OooO00o, 0, bArr2, i3 + OooO00o2);
                        byte[] bArr5 = ((C6744ll1L) this).f18718OooO00o;
                        System.arraycopy(bArr5, OooO00o, bArr5, 0, OooO00o);
                        i2 -= OooO00o;
                        i += OooO00o;
                    }
                    i6 = OooO00o2;
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
