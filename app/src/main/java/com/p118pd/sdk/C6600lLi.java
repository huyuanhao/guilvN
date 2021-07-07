package com.p118pd.sdk;

import java.security.SecureRandom;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.lLi丨丨  reason: invalid class name and case insensitive filesystem */
public class C6600lLi extends C6744ll1L {
    public LLLIl OooO00o;

    public C6600lLi(li1l11I1 li1l11i1) {
        this(li1l11i1, new C5346IiIIL());
    }

    public C6600lLi(li1l11I1 li1l11i1, LLLIl r2) {
        ((C6744ll1L) this).f18716OooO00o = li1l11i1;
        this.OooO00o = r2;
        ((C6744ll1L) this).f18718OooO00o = new byte[li1l11i1.OooO00o()];
        ((C6744ll1L) this).OooO00o = 0;
    }

    @Override // com.p118pd.sdk.C6744ll1L
    public int OooO00o(byte b, byte[] bArr, int i) throws DataLengthException, IllegalStateException {
        int i2 = ((C6744ll1L) this).OooO00o;
        byte[] bArr2 = ((C6744ll1L) this).f18718OooO00o;
        int i3 = 0;
        if (i2 == bArr2.length) {
            int OooO00o2 = ((C6744ll1L) this).f18716OooO00o.OooO00o(bArr2, 0, bArr, i);
            ((C6744ll1L) this).OooO00o = 0;
            i3 = OooO00o2;
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
        int OooO00o2;
        int i2;
        int OooO00o3 = ((C6744ll1L) this).f18716OooO00o.OooO00o();
        if (((C6744ll1L) this).f18717OooO00o) {
            if (((C6744ll1L) this).OooO00o != OooO00o3) {
                i2 = 0;
            } else if ((OooO00o3 * 2) + i <= bArr.length) {
                i2 = ((C6744ll1L) this).f18716OooO00o.OooO00o(((C6744ll1L) this).f18718OooO00o, 0, bArr, i);
                ((C6744ll1L) this).OooO00o = 0;
            } else {
                m17843OooO00o();
                throw new OutputLengthException("output buffer too short");
            }
            this.OooO00o.OooO00o(((C6744ll1L) this).f18718OooO00o, ((C6744ll1L) this).OooO00o);
            OooO00o2 = i2 + ((C6744ll1L) this).f18716OooO00o.OooO00o(((C6744ll1L) this).f18718OooO00o, 0, bArr, i + i2);
        } else if (((C6744ll1L) this).OooO00o == OooO00o3) {
            li1l11I1 li1l11i1 = ((C6744ll1L) this).f18716OooO00o;
            byte[] bArr2 = ((C6744ll1L) this).f18718OooO00o;
            int OooO00o4 = li1l11i1.OooO00o(bArr2, 0, bArr2, 0);
            ((C6744ll1L) this).OooO00o = 0;
            try {
                OooO00o2 = OooO00o4 - this.OooO00o.OooO00o(((C6744ll1L) this).f18718OooO00o);
                System.arraycopy(((C6744ll1L) this).f18718OooO00o, 0, bArr, i, OooO00o2);
            } catch (Throwable th) {
                m17843OooO00o();
                throw th;
            }
        } else {
            m17843OooO00o();
            throw new DataLengthException("last block incomplete in decryption");
        }
        m17843OooO00o();
        return OooO00o2;
    }

    @Override // com.p118pd.sdk.C6744ll1L
    public int OooO00o(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException, IllegalStateException {
        if (i2 >= 0) {
            int OooO00o2 = OooO00o();
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
                        i2 -= OooO00o2;
                        i += OooO00o2;
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
    public void OooO00o(boolean z, AbstractC6370iIIIl r4) throws IllegalArgumentException {
        li1l11I1 li1l11i1;
        ((C6744ll1L) this).f18717OooO00o = z;
        m17843OooO00o();
        if (r4 instanceof liLL1l) {
            liLL1l r42 = (liLL1l) r4;
            this.OooO00o.OooO00o(r42.m17752OooO00o());
            li1l11i1 = ((C6744ll1L) this).f18716OooO00o;
            r4 = r42.OooO00o();
        } else {
            this.OooO00o.OooO00o((SecureRandom) null);
            li1l11i1 = ((C6744ll1L) this).f18716OooO00o;
        }
        li1l11i1.OooO00o(z, r4);
    }

    @Override // com.p118pd.sdk.C6744ll1L
    public int OooO0O0(int i) {
        int i2 = i + ((C6744ll1L) this).OooO00o;
        byte[] bArr = ((C6744ll1L) this).f18718OooO00o;
        int length = i2 % bArr.length;
        return length == 0 ? Math.max(0, i2 - bArr.length) : i2 - length;
    }
}
