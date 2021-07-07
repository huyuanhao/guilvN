package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;

/* renamed from: com.pd.sdk.IlLilI */
public class IlLilI extends AbstractC9563i1I {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f15840OooO00o;
    public final int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final li1l11I1 f15841OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f15842OooO0O0;
    public byte[] OooO0OO;

    public IlLilI(li1l11I1 li1l11i1, int i) {
        super(li1l11i1);
        this.f15841OooO0O0 = li1l11i1;
        this.OooO0O0 = i / 8;
        this.f15840OooO00o = new byte[li1l11i1.OooO00o()];
        this.f15842OooO0O0 = new byte[li1l11i1.OooO00o()];
        this.OooO0OO = new byte[li1l11i1.OooO00o()];
    }

    @Override // com.p118pd.sdk.AbstractC9563i1I, com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    public int OooO00o() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.li1l11I1
    public int OooO00o(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        OooO00o(bArr, i, this.OooO0O0, bArr2, i2);
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC9563i1I, com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m15671OooO00o() {
        return this.f15841OooO0O0.m17732OooO00o() + "/OFB" + (this.OooO0O0 * 8);
    }

    @Override // com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1
    public void OooO00o(boolean z, AbstractC6370iIIIl r8) throws IllegalArgumentException {
        li1l11I1 li1l11i1;
        if (r8 instanceof C6274iilL1L) {
            C6274iilL1L r82 = (C6274iilL1L) r8;
            byte[] OooO00o2 = r82.m17301OooO00o();
            int length = OooO00o2.length;
            byte[] bArr = this.f15840OooO00o;
            if (length < bArr.length) {
                System.arraycopy(OooO00o2, 0, bArr, bArr.length - OooO00o2.length, OooO00o2.length);
                int i = 0;
                while (true) {
                    byte[] bArr2 = this.f15840OooO00o;
                    if (i >= bArr2.length - OooO00o2.length) {
                        break;
                    }
                    bArr2[i] = 0;
                    i++;
                }
            } else {
                System.arraycopy(OooO00o2, 0, bArr, 0, bArr.length);
            }
            reset();
            if (r82.OooO00o() != null) {
                li1l11i1 = this.f15841OooO0O0;
                r8 = r82.OooO00o();
            } else {
                return;
            }
        } else {
            reset();
            if (r8 != null) {
                li1l11i1 = this.f15841OooO0O0;
            } else {
                return;
            }
        }
        li1l11i1.OooO00o(true, r8);
    }

    @Override // com.p118pd.sdk.AbstractC9563i1I
    public byte OooO0O0(byte b) throws DataLengthException, IllegalStateException {
        if (this.OooO00o == 0) {
            this.f15841OooO0O0.OooO00o(this.f15842OooO0O0, 0, this.OooO0OO, 0);
        }
        byte[] bArr = this.OooO0OO;
        int i = this.OooO00o;
        int i2 = i + 1;
        this.OooO00o = i2;
        byte b2 = (byte) (b ^ bArr[i]);
        int i3 = this.OooO0O0;
        if (i2 == i3) {
            this.OooO00o = 0;
            byte[] bArr2 = this.f15842OooO0O0;
            System.arraycopy(bArr2, i3, bArr2, 0, bArr2.length - i3);
            byte[] bArr3 = this.OooO0OO;
            byte[] bArr4 = this.f15842OooO0O0;
            int length = bArr4.length;
            int i4 = this.OooO0O0;
            System.arraycopy(bArr3, 0, bArr4, length - i4, i4);
        }
        return b2;
    }

    @Override // com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1
    public void reset() {
        byte[] bArr = this.f15840OooO00o;
        System.arraycopy(bArr, 0, this.f15842OooO0O0, 0, bArr.length);
        this.OooO00o = 0;
        this.f15841OooO0O0.reset();
    }
}
