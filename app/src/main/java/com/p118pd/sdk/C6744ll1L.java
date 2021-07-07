package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.ll1丨丨L  reason: invalid class name and case insensitive filesystem */
public class C6744ll1L {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public li1l11I1 f18716OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f18717OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f18718OooO00o;
    public boolean OooO0O0;
    public boolean OooO0OO;

    public C6744ll1L() {
    }

    public C6744ll1L(li1l11I1 li1l11i1) {
        this.f18716OooO00o = li1l11i1;
        this.f18718OooO00o = new byte[li1l11i1.OooO00o()];
        boolean z = false;
        this.OooO00o = 0;
        String OooO00o2 = li1l11i1.m17732OooO00o();
        int indexOf = OooO00o2.indexOf(47) + 1;
        boolean z2 = indexOf > 0 && OooO00o2.startsWith("PGP", indexOf);
        this.OooO0OO = z2;
        if (z2 || (li1l11i1 instanceof I1LLllll)) {
            this.OooO0O0 = true;
            return;
        }
        if (indexOf > 0 && OooO00o2.startsWith("OpenPGP", indexOf)) {
            z = true;
        }
        this.OooO0O0 = z;
    }

    public int OooO00o() {
        return this.f18716OooO00o.OooO00o();
    }

    public int OooO00o(byte b, byte[] bArr, int i) throws DataLengthException, IllegalStateException {
        byte[] bArr2 = this.f18718OooO00o;
        int i2 = this.OooO00o;
        int i3 = i2 + 1;
        this.OooO00o = i3;
        bArr2[i2] = b;
        if (i3 != bArr2.length) {
            return 0;
        }
        int OooO00o2 = this.f18716OooO00o.OooO00o(bArr2, 0, bArr, i);
        this.OooO00o = 0;
        return OooO00o2;
    }

    public int OooO00o(int i) {
        return i + this.OooO00o;
    }

    public int OooO00o(byte[] bArr, int i) throws DataLengthException, IllegalStateException, InvalidCipherTextException {
        try {
            if (this.OooO00o + i <= bArr.length) {
                int i2 = 0;
                if (this.OooO00o != 0) {
                    if (this.OooO0O0) {
                        this.f18716OooO00o.OooO00o(this.f18718OooO00o, 0, this.f18718OooO00o, 0);
                        int i3 = this.OooO00o;
                        this.OooO00o = 0;
                        System.arraycopy(this.f18718OooO00o, 0, bArr, i, i3);
                        i2 = i3;
                    } else {
                        throw new DataLengthException("data not block size aligned");
                    }
                }
                return i2;
            }
            throw new OutputLengthException("output buffer too short for doFinal()");
        } finally {
            m17843OooO00o();
        }
    }

    public int OooO00o(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws DataLengthException, IllegalStateException {
        int i4;
        if (i2 >= 0) {
            int OooO00o2 = OooO00o();
            int OooO0O02 = OooO0O0(i2);
            if (OooO0O02 <= 0 || OooO0O02 + i3 <= bArr2.length) {
                byte[] bArr3 = this.f18718OooO00o;
                int length = bArr3.length;
                int i5 = this.OooO00o;
                int i6 = length - i5;
                if (i2 > i6) {
                    System.arraycopy(bArr, i, bArr3, i5, i6);
                    i4 = this.f18716OooO00o.OooO00o(this.f18718OooO00o, 0, bArr2, i3) + 0;
                    this.OooO00o = 0;
                    i2 -= i6;
                    i += i6;
                    while (i2 > this.f18718OooO00o.length) {
                        i4 += this.f18716OooO00o.OooO00o(bArr, i, bArr2, i3 + i4);
                        i2 -= OooO00o2;
                        i += OooO00o2;
                    }
                } else {
                    i4 = 0;
                }
                System.arraycopy(bArr, i, this.f18718OooO00o, this.OooO00o, i2);
                int i7 = this.OooO00o + i2;
                this.OooO00o = i7;
                byte[] bArr4 = this.f18718OooO00o;
                if (i7 != bArr4.length) {
                    return i4;
                }
                int OooO00o3 = i4 + this.f18716OooO00o.OooO00o(bArr4, 0, bArr2, i3 + i4);
                this.OooO00o = 0;
                return OooO00o3;
            }
            throw new OutputLengthException("output buffer too short");
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public li1l11I1 m17842OooO00o() {
        return this.f18716OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m17843OooO00o() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f18718OooO00o;
            if (i < bArr.length) {
                bArr[i] = 0;
                i++;
            } else {
                this.OooO00o = 0;
                this.f18716OooO00o.reset();
                return;
            }
        }
    }

    public void OooO00o(boolean z, AbstractC6370iIIIl r3) throws IllegalArgumentException {
        this.f18717OooO00o = z;
        m17843OooO00o();
        this.f18716OooO00o.OooO00o(z, r3);
    }

    public int OooO0O0(int i) {
        int i2;
        int i3;
        int i4 = i + this.OooO00o;
        if (!this.OooO0OO) {
            i3 = this.f18718OooO00o.length;
        } else if (this.f18717OooO00o) {
            i2 = (i4 % this.f18718OooO00o.length) - (this.f18716OooO00o.OooO00o() + 2);
            return i4 - i2;
        } else {
            i3 = this.f18718OooO00o.length;
        }
        i2 = i4 % i3;
        return i4 - i2;
    }
}
