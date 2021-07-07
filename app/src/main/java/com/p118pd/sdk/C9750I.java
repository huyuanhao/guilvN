package com.p118pd.sdk;

import org.bouncycastle.crypto.DataLengthException;

/* renamed from: com.pd.sdk.丨丨I  reason: invalid class name and case insensitive filesystem */
public class C9750I extends AbstractC9563i1I {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f23389OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f23390OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public li1l11I1 f23391OooO0O0 = null;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f23392OooO0O0;
    public byte[] OooO0OO;
    public byte[] OooO0Oo;

    public C9750I(li1l11I1 li1l11i1, int i) {
        super(li1l11i1);
        this.f23391OooO0O0 = li1l11i1;
        this.OooO00o = i / 8;
        this.f23390OooO00o = new byte[li1l11i1.OooO00o()];
        this.f23392OooO0O0 = new byte[li1l11i1.OooO00o()];
        this.OooO0OO = new byte[li1l11i1.OooO00o()];
        this.OooO0Oo = new byte[this.OooO00o];
    }

    private byte OooO0OO(byte b) {
        if (this.OooO0O0 == 0) {
            this.f23391OooO0O0.OooO00o(this.f23392OooO0O0, 0, this.OooO0OO, 0);
        }
        byte[] bArr = this.OooO0Oo;
        int i = this.OooO0O0;
        bArr[i] = b;
        byte[] bArr2 = this.OooO0OO;
        int i2 = i + 1;
        this.OooO0O0 = i2;
        byte b2 = (byte) (b ^ bArr2[i]);
        int i3 = this.OooO00o;
        if (i2 == i3) {
            this.OooO0O0 = 0;
            byte[] bArr3 = this.f23392OooO0O0;
            System.arraycopy(bArr3, i3, bArr3, 0, bArr3.length - i3);
            byte[] bArr4 = this.OooO0Oo;
            byte[] bArr5 = this.f23392OooO0O0;
            int length = bArr5.length;
            int i4 = this.OooO00o;
            System.arraycopy(bArr4, 0, bArr5, length - i4, i4);
        }
        return b2;
    }

    private byte OooO0Oo(byte b) {
        if (this.OooO0O0 == 0) {
            this.f23391OooO0O0.OooO00o(this.f23392OooO0O0, 0, this.OooO0OO, 0);
        }
        byte[] bArr = this.OooO0OO;
        int i = this.OooO0O0;
        byte b2 = (byte) (b ^ bArr[i]);
        byte[] bArr2 = this.OooO0Oo;
        int i2 = i + 1;
        this.OooO0O0 = i2;
        bArr2[i] = b2;
        int i3 = this.OooO00o;
        if (i2 == i3) {
            this.OooO0O0 = 0;
            byte[] bArr3 = this.f23392OooO0O0;
            System.arraycopy(bArr3, i3, bArr3, 0, bArr3.length - i3);
            byte[] bArr4 = this.OooO0Oo;
            byte[] bArr5 = this.f23392OooO0O0;
            int length = bArr5.length;
            int i4 = this.OooO00o;
            System.arraycopy(bArr4, 0, bArr5, length - i4, i4);
        }
        return b2;
    }

    @Override // com.p118pd.sdk.AbstractC9563i1I, com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    public int OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.li1l11I1
    public int OooO00o(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        OooO00o(bArr, i, this.OooO00o, bArr2, i2);
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC9563i1I, com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m21886OooO00o() {
        return this.f23391OooO0O0.m17732OooO00o() + "/CFB" + (this.OooO00o * 8);
    }

    @Override // com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1
    public void OooO00o(boolean z, AbstractC6370iIIIl r8) throws IllegalArgumentException {
        li1l11I1 li1l11i1;
        this.f23389OooO00o = z;
        if (r8 instanceof C6274iilL1L) {
            C6274iilL1L r82 = (C6274iilL1L) r8;
            byte[] OooO00o2 = r82.m17301OooO00o();
            int length = OooO00o2.length;
            byte[] bArr = this.f23390OooO00o;
            if (length < bArr.length) {
                System.arraycopy(OooO00o2, 0, bArr, bArr.length - OooO00o2.length, OooO00o2.length);
                int i = 0;
                while (true) {
                    byte[] bArr2 = this.f23390OooO00o;
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
                li1l11i1 = this.f23391OooO0O0;
                r8 = r82.OooO00o();
            } else {
                return;
            }
        } else {
            reset();
            if (r8 != null) {
                li1l11i1 = this.f23391OooO0O0;
            } else {
                return;
            }
        }
        li1l11i1.OooO00o(true, r8);
    }

    @Override // com.p118pd.sdk.AbstractC9563i1I, com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m21887OooO00o() {
        return C9586iIILl.m21630OooO00o(this.f23392OooO0O0);
    }

    @Override // com.p118pd.sdk.AbstractC9563i1I
    public byte OooO0O0(byte b) throws DataLengthException, IllegalStateException {
        return this.f23389OooO00o ? OooO0Oo(b) : OooO0OO(b);
    }

    public int OooO0O0(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        OooO00o(bArr, i, this.OooO00o, bArr2, i2);
        return this.OooO00o;
    }

    public int OooO0OO(byte[] bArr, int i, byte[] bArr2, int i2) throws DataLengthException, IllegalStateException {
        OooO00o(bArr, i, this.OooO00o, bArr2, i2);
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.I1LLllll, com.p118pd.sdk.li1l11I1
    public void reset() {
        byte[] bArr = this.f23390OooO00o;
        System.arraycopy(bArr, 0, this.f23392OooO0O0, 0, bArr.length);
        C9586iIILl.OooO00o(this.OooO0Oo, (byte) 0);
        this.OooO0O0 = 0;
        this.f23391OooO0O0.reset();
    }
}
