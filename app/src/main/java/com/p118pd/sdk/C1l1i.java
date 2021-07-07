package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.丨丨丨1l丨1i  reason: invalid class name */
public class C1l1i extends AbstractC9563i1I {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f23481OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f23482OooO00o;
    public li1l11I1 OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f23483OooO0O0;
    public byte[] OooO0OO;

    public C1l1i(li1l11I1 li1l11i1) {
        super(li1l11i1);
        this.OooO0O0 = li1l11i1;
        this.f23482OooO00o = new byte[li1l11i1.OooO00o()];
        this.f23483OooO0O0 = new byte[li1l11i1.OooO00o()];
        this.OooO0OO = new byte[li1l11i1.OooO00o()];
    }

    @Override // com.p118pd.sdk.AbstractC9563i1I, com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    private void OooO00o() {
    }

    private void OooO00o(int i) {
        while (true) {
            byte[] bArr = this.f23483OooO0O0;
            if (i < bArr.length) {
                int i2 = i + 1;
                byte b = (byte) (bArr[i] + 1);
                bArr[i] = b;
                if (b == 0) {
                    i = i2;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC9563i1I, com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m21951OooO00o() {
        return this.OooO0O0.OooO00o();
    }

    @Override // com.p118pd.sdk.li1l11I1
    public int OooO00o(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        if (bArr.length - i < m21951OooO00o()) {
            throw new DataLengthException("input buffer too short");
        } else if (bArr2.length - i2 >= m21951OooO00o()) {
            OooO00o(bArr, i, m21951OooO00o(), bArr2, i2);
            return m21951OooO00o();
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }

    @Override // com.p118pd.sdk.AbstractC9563i1I, com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m21952OooO00o() {
        return this.OooO0O0.m17732OooO00o() + "/KCTR";
    }

    @Override // com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1
    public void OooO00o(boolean z, AbstractC6370iIIIl r7) throws IllegalArgumentException {
        this.f23481OooO00o = true;
        if (r7 instanceof C6274iilL1L) {
            C6274iilL1L r72 = (C6274iilL1L) r7;
            byte[] OooO00o2 = r72.m17301OooO00o();
            byte[] bArr = this.f23482OooO00o;
            C9586iIILl.OooO00o(bArr, (byte) 0);
            System.arraycopy(OooO00o2, 0, this.f23482OooO00o, bArr.length - OooO00o2.length, OooO00o2.length);
            AbstractC6370iIIIl OooO00o3 = r72.OooO00o();
            if (OooO00o3 != null) {
                this.OooO0O0.OooO00o(true, OooO00o3);
            }
            reset();
            return;
        }
        throw new IllegalArgumentException("invalid parameter passed");
    }

    @Override // com.p118pd.sdk.AbstractC9563i1I
    public byte OooO0O0(byte b) {
        int i = this.OooO00o;
        if (i == 0) {
            OooO00o(0);
            OooO00o();
            this.OooO0O0.OooO00o(this.f23483OooO0O0, 0, this.OooO0OO, 0);
            byte[] bArr = this.OooO0OO;
            int i2 = this.OooO00o;
            this.OooO00o = i2 + 1;
            return (byte) (b ^ bArr[i2]);
        }
        byte[] bArr2 = this.OooO0OO;
        int i3 = i + 1;
        this.OooO00o = i3;
        byte b2 = (byte) (b ^ bArr2[i]);
        if (i3 == this.f23483OooO0O0.length) {
            this.OooO00o = 0;
        }
        return b2;
    }

    @Override // com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1
    public void reset() {
        if (this.f23481OooO00o) {
            this.OooO0O0.OooO00o(this.f23482OooO00o, 0, this.f23483OooO0O0, 0);
        }
        this.OooO0O0.reset();
        this.OooO00o = 0;
    }
}
