package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.LI1liiL */
public class LI1liiL {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public li1l11I1 f16265OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f16266OooO00o;
    public byte[] OooO0O0;
    public byte[] OooO0OO;

    public LI1liiL(li1l11I1 li1l11i1, int i) {
        this.f16265OooO00o = li1l11i1;
        this.OooO00o = i / 8;
        this.f16266OooO00o = new byte[li1l11i1.OooO00o()];
        this.OooO0O0 = new byte[li1l11i1.OooO00o()];
        this.OooO0OO = new byte[li1l11i1.OooO00o()];
    }

    public int OooO00o() {
        return this.OooO00o;
    }

    public int OooO00o(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        int i3 = this.OooO00o;
        if (i + i3 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i3 + i2 <= bArr2.length) {
            this.f16265OooO00o.OooO00o(this.OooO0O0, 0, this.OooO0OO, 0);
            int i4 = 0;
            while (true) {
                int i5 = this.OooO00o;
                if (i4 < i5) {
                    bArr2[i2 + i4] = (byte) (this.OooO0OO[i4] ^ bArr[i + i4]);
                    i4++;
                } else {
                    byte[] bArr3 = this.OooO0O0;
                    System.arraycopy(bArr3, i5, bArr3, 0, bArr3.length - i5);
                    byte[] bArr4 = this.OooO0O0;
                    int length = bArr4.length;
                    int i6 = this.OooO00o;
                    System.arraycopy(bArr2, i2, bArr4, length - i6, i6);
                    return this.OooO00o;
                }
            }
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m16016OooO00o() {
        return this.f16265OooO00o.m17732OooO00o() + "/CFB" + (this.OooO00o * 8);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m16017OooO00o() {
        byte[] bArr = this.f16266OooO00o;
        System.arraycopy(bArr, 0, this.OooO0O0, 0, bArr.length);
        this.f16265OooO00o.reset();
    }

    public void OooO00o(AbstractC6370iIIIl r7) throws IllegalArgumentException {
        li1l11I1 li1l11i1;
        if (r7 instanceof C6274iilL1L) {
            C6274iilL1L r72 = (C6274iilL1L) r7;
            byte[] OooO00o2 = r72.m17301OooO00o();
            int length = OooO00o2.length;
            byte[] bArr = this.f16266OooO00o;
            if (length < bArr.length) {
                System.arraycopy(OooO00o2, 0, bArr, bArr.length - OooO00o2.length, OooO00o2.length);
            } else {
                System.arraycopy(OooO00o2, 0, bArr, 0, bArr.length);
            }
            m16017OooO00o();
            li1l11i1 = this.f16265OooO00o;
            r7 = r72.OooO00o();
        } else {
            m16017OooO00o();
            li1l11i1 = this.f16265OooO00o;
        }
        li1l11i1.OooO00o(true, r7);
    }

    public void OooO00o(byte[] bArr) {
        this.f16265OooO00o.OooO00o(this.OooO0O0, 0, bArr, 0);
    }
}
