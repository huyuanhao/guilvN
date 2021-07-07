package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.ili丨1L  reason: invalid class name */
public class ili1L implements AbstractC6769llL1L {
    public static final int OooO0O0 = 8;
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f18062OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Ilii1 f18063OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f18064OooO00o = null;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f18065OooO0O0 = null;

    public ili1L(int i) {
        this.f18063OooO00o = new Ilii1(i);
        this.OooO00o = i / 8;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L, com.p118pd.sdk.AbstractC6769llL1L
    private void OooO00o() {
        int OooO00o2 = this.f18063OooO00o.OooO00o() - ((int) (this.f18062OooO00o % ((long) this.f18063OooO00o.OooO00o())));
        if (OooO00o2 < 13) {
            OooO00o2 += this.f18063OooO00o.OooO00o();
        }
        byte[] bArr = new byte[OooO00o2];
        bArr[0] = O0O00O.OooO00o;
        AbstractC6464l1l.OooO0O0(this.f18062OooO00o * 8, bArr, OooO00o2 - 12);
        this.f18063OooO00o.update(bArr, 0, OooO00o2);
    }

    private byte[] OooO00o(byte[] bArr) {
        int length = (((bArr.length + this.f18063OooO00o.OooO00o()) - 1) / this.f18063OooO00o.OooO00o()) * this.f18063OooO00o.OooO00o();
        if (this.f18063OooO00o.OooO00o() - (bArr.length % this.f18063OooO00o.OooO00o()) < 13) {
            length += this.f18063OooO00o.OooO00o();
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        bArr2[bArr.length] = O0O00O.OooO00o;
        AbstractC6464l1l.OooO0O0(bArr.length * 8, bArr2, length - 12);
        return bArr2;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L, com.p118pd.sdk.AbstractC6769llL1L
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m17393OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public int OooO00o(byte[] bArr, int i) throws DataLengthException, IllegalStateException {
        if (this.f18064OooO00o == null) {
            throw new IllegalStateException(m17394OooO00o() + " not initialised");
        } else if (bArr.length - i >= this.OooO00o) {
            OooO00o();
            Ilii1 r0 = this.f18063OooO00o;
            byte[] bArr2 = this.f18065OooO0O0;
            r0.update(bArr2, 0, bArr2.length);
            this.f18062OooO00o = 0;
            return this.f18063OooO00o.m15697OooO00o(bArr, i);
        } else {
            throw new OutputLengthException("Output buffer too short");
        }
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L, com.p118pd.sdk.AbstractC6769llL1L
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m17394OooO00o() {
        return "DSTU7564Mac";
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void OooO00o(AbstractC6370iIIIl r5) throws IllegalArgumentException {
        if (r5 instanceof C6642li1LI) {
            byte[] OooO00o2 = ((C6642li1LI) r5).OooO00o();
            this.f18065OooO0O0 = new byte[OooO00o2.length];
            this.f18064OooO00o = OooO00o(OooO00o2);
            int i = 0;
            while (true) {
                byte[] bArr = this.f18065OooO0O0;
                if (i < bArr.length) {
                    bArr[i] = (byte) (OooO00o2[i] ^ -1);
                    i++;
                } else {
                    Ilii1 r52 = this.f18063OooO00o;
                    byte[] bArr2 = this.f18064OooO00o;
                    r52.update(bArr2, 0, bArr2.length);
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Bad parameter passed");
        }
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void reset() {
        this.f18062OooO00o = 0;
        this.f18063OooO00o.reset();
        byte[] bArr = this.f18064OooO00o;
        if (bArr != null) {
            this.f18063OooO00o.update(bArr, 0, bArr.length);
        }
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void update(byte b) throws IllegalStateException {
        this.f18063OooO00o.update(b);
        this.f18062OooO00o++;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void update(byte[] bArr, int i, int i2) throws DataLengthException, IllegalStateException {
        if (bArr.length - i < i2) {
            throw new DataLengthException("Input buffer too short");
        } else if (this.f18064OooO00o != null) {
            this.f18063OooO00o.update(bArr, i, i2);
            this.f18062OooO00o += (long) i2;
        } else {
            throw new IllegalStateException(m17394OooO00o() + " not initialised");
        }
    }
}
