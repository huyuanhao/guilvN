package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;

/* renamed from: com.pd.sdk.IL1IL丨1I  reason: invalid class name */
public class IL1IL1I implements AbstractC6769llL1L {
    public static final int OooO0Oo = 8;
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public I1iIii f15544OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f15545OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f15546OooO0O0;
    public int OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public byte[] f15547OooO0OO;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public byte[] f15548OooO0Oo;

    public IL1IL1I(int i, int i2) {
        this.f15544OooO00o = new I1iIii(i);
        int i3 = i / 8;
        this.OooO0OO = i3;
        this.OooO0O0 = i2 / 8;
        this.f15546OooO0O0 = new byte[i3];
        this.f15548OooO0Oo = new byte[i3];
        this.f15547OooO0OO = new byte[i3];
        this.f15545OooO00o = new byte[i3];
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    private void OooO00o(byte[] bArr, int i) {
        OooO00o(this.f15546OooO0O0, 0, bArr, i, this.f15547OooO0OO);
        this.f15544OooO00o.m15292OooO00o(this.f15547OooO0OO, 0, this.f15546OooO0O0, 0);
    }

    private void OooO00o(byte[] bArr, int i, byte[] bArr2, int i2, byte[] bArr3) {
        int length = bArr.length - i;
        int i3 = this.OooO0OO;
        if (length < i3 || bArr2.length - i2 < i3 || bArr3.length < i3) {
            throw new IllegalArgumentException("some of input buffers too short");
        }
        for (int i4 = 0; i4 < this.OooO0OO; i4++) {
            bArr3[i4] = (byte) (bArr[i4 + i] ^ bArr2[i4 + i2]);
        }
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L, com.p118pd.sdk.AbstractC6769llL1L
    public int OooO00o() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m15471OooO00o(byte[] bArr, int i) throws DataLengthException, IllegalStateException {
        int i2 = this.OooO00o;
        byte[] bArr2 = this.f15545OooO00o;
        if (i2 % bArr2.length == 0) {
            OooO00o(this.f15546OooO0O0, 0, bArr2, 0, this.f15547OooO0OO);
            OooO00o(this.f15547OooO0OO, 0, this.f15548OooO0Oo, 0, this.f15546OooO0O0);
            I1iIii i1iIii = this.f15544OooO00o;
            byte[] bArr3 = this.f15546OooO0O0;
            i1iIii.m15292OooO00o(bArr3, 0, bArr3, 0);
            int i3 = this.OooO0O0;
            if (i3 + i <= bArr.length) {
                System.arraycopy(this.f15546OooO0O0, 0, bArr, i, i3);
                return this.OooO0O0;
            }
            throw new OutputLengthException("output buffer too short");
        }
        throw new DataLengthException("input must be a multiple of blocksize");
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L, com.p118pd.sdk.AbstractC6769llL1L
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m15472OooO00o() {
        return "DSTU7624Mac";
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void OooO00o(AbstractC6370iIIIl r3) throws IllegalArgumentException {
        if (r3 instanceof C6642li1LI) {
            this.f15544OooO00o.OooO00o(true, r3);
            I1iIii i1iIii = this.f15544OooO00o;
            byte[] bArr = this.f15548OooO0Oo;
            i1iIii.m15292OooO00o(bArr, 0, bArr, 0);
            return;
        }
        throw new IllegalArgumentException("Invalid parameter passed to DSTU7624Mac");
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void reset() {
        C9586iIILl.OooO00o(this.f15546OooO0O0, (byte) 0);
        C9586iIILl.OooO00o(this.f15547OooO0OO, (byte) 0);
        C9586iIILl.OooO00o(this.f15548OooO0Oo, (byte) 0);
        C9586iIILl.OooO00o(this.f15545OooO00o, (byte) 0);
        this.f15544OooO00o.reset();
        I1iIii i1iIii = this.f15544OooO00o;
        byte[] bArr = this.f15548OooO0Oo;
        i1iIii.m15292OooO00o(bArr, 0, bArr, 0);
        this.OooO00o = 0;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void update(byte b) {
        int i = this.OooO00o;
        byte[] bArr = this.f15545OooO00o;
        if (i == bArr.length) {
            OooO00o(bArr, 0);
            this.OooO00o = 0;
        }
        byte[] bArr2 = this.f15545OooO00o;
        int i2 = this.OooO00o;
        this.OooO00o = i2 + 1;
        bArr2[i2] = b;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void update(byte[] bArr, int i, int i2) {
        if (i2 >= 0) {
            int OooO00o2 = this.f15544OooO00o.m15291OooO00o();
            int i3 = this.OooO00o;
            int i4 = OooO00o2 - i3;
            if (i2 > i4) {
                System.arraycopy(bArr, i, this.f15545OooO00o, i3, i4);
                OooO00o(this.f15545OooO00o, 0);
                this.OooO00o = 0;
                i2 -= i4;
                i += i4;
                while (i2 > OooO00o2) {
                    OooO00o(bArr, i);
                    i2 -= OooO00o2;
                    i += OooO00o2;
                }
            }
            System.arraycopy(bArr, i, this.f15545OooO00o, this.OooO00o, i2);
            this.OooO00o += i2;
            return;
        }
        throw new IllegalArgumentException("can't have a negative input length!");
    }
}
