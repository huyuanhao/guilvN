package com.p118pd.sdk;

import java.util.Hashtable;

/* renamed from: com.pd.sdk.lLiL丨i  reason: invalid class name and case insensitive filesystem */
public class C6596lLiLi implements AbstractC6863liiI {
    public static final Hashtable OooO00o;
    public static final long OooO0O0 = 140737488355328L;
    public static final int OooO0OO = 262144;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final byte[] f18530OooO0OO = {1};

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f18531OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f18532OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC5552Iil f18533OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6436l11LI f18534OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f18535OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int f18536OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f18537OooO0O0;

    static {
        Hashtable hashtable = new Hashtable();
        OooO00o = hashtable;
        hashtable.put(LL1i.OooO0O0, I11I.OooO00o(440));
        OooO00o.put(LL1i.OooO0OO, I11I.OooO00o(440));
        OooO00o.put(LL1i.OooO0Oo, I11I.OooO00o(440));
        OooO00o.put("SHA-512/256", I11I.OooO00o(440));
        OooO00o.put("SHA-512/224", I11I.OooO00o(440));
        OooO00o.put(LL1i.f16409OooO0o0, I11I.OooO00o(888));
        OooO00o.put(LL1i.f16408OooO0o, I11I.OooO00o(888));
    }

    public C6596lLiLi(AbstractC6436l11LI r2, int i, AbstractC5552Iil r4, byte[] bArr, byte[] bArr2) {
        if (i > C9510Lii1L.OooO00o(r2)) {
            throw new IllegalArgumentException("Requested security strength is not supported by the derivation function");
        } else if (r4.OooO00o() >= i) {
            this.f18534OooO00o = r2;
            this.f18533OooO00o = r4;
            this.f18531OooO00o = i;
            this.f18536OooO0O0 = ((Integer) OooO00o.get(r2.OooO00o())).intValue();
            byte[] OooO00o2 = C9510Lii1L.OooO00o(this.f18534OooO00o, C9586iIILl.OooO00o(OooO00o(), bArr2, bArr), this.f18536OooO0O0);
            this.f18535OooO00o = OooO00o2;
            byte[] bArr3 = new byte[(OooO00o2.length + 1)];
            System.arraycopy(OooO00o2, 0, bArr3, 1, OooO00o2.length);
            this.f18537OooO0O0 = C9510Lii1L.OooO00o(this.f18534OooO00o, bArr3, this.f18536OooO0O0);
            this.f18532OooO00o = 1;
        } else {
            throw new IllegalArgumentException("Not enough entropy for security strength required");
        }
    }

    private void OooO00o(byte[] bArr, byte[] bArr2) {
        int i = 0;
        for (int i2 = 1; i2 <= bArr2.length; i2++) {
            int i3 = (bArr[bArr.length - i2] & 255) + (bArr2[bArr2.length - i2] & 255) + i;
            i = i3 > 255 ? 1 : 0;
            bArr[bArr.length - i2] = (byte) i3;
        }
        for (int length = bArr2.length + 1; length <= bArr.length; length++) {
            int i4 = (bArr[bArr.length - length] & 255) + i;
            i = i4 > 255 ? 1 : 0;
            bArr[bArr.length - length] = (byte) i4;
        }
    }

    @Override // com.p118pd.sdk.AbstractC6863liiI
    private byte[] OooO00o() {
        byte[] OooO00o2 = this.f18533OooO00o.m15831OooO00o();
        if (OooO00o2.length >= (this.f18531OooO00o + 7) / 8) {
            return OooO00o2;
        }
        throw new IllegalStateException("Insufficient entropy provided by entropy source");
    }

    @Override // com.p118pd.sdk.AbstractC6863liiI
    private byte[] OooO00o(byte[] bArr) {
        byte[] bArr2 = new byte[this.f18534OooO00o.OooO0O0()];
        OooO0O0(bArr, bArr2);
        return bArr2;
    }

    private byte[] OooO00o(byte[] bArr, int i) {
        int i2 = i / 8;
        int OooO0O02 = i2 / this.f18534OooO00o.OooO0O0();
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        byte[] bArr3 = new byte[i2];
        int OooO0O03 = this.f18534OooO00o.OooO0O0();
        byte[] bArr4 = new byte[OooO0O03];
        for (int i3 = 0; i3 <= OooO0O02; i3++) {
            OooO0O0(bArr2, bArr4);
            int i4 = i3 * OooO0O03;
            int i5 = i2 - i4;
            if (i5 > OooO0O03) {
                i5 = OooO0O03;
            }
            System.arraycopy(bArr4, 0, bArr3, i4, i5);
            OooO00o(bArr2, f18530OooO0OO);
        }
        return bArr3;
    }

    private void OooO0O0(byte[] bArr, byte[] bArr2) {
        this.f18534OooO00o.update(bArr, 0, bArr.length);
        this.f18534OooO00o.OooO00o(bArr2, 0);
    }

    @Override // com.p118pd.sdk.AbstractC6863liiI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m17691OooO00o() {
        return this.f18534OooO00o.OooO0O0() * 8;
    }

    @Override // com.p118pd.sdk.AbstractC6863liiI
    public int OooO00o(byte[] bArr, byte[] bArr2, boolean z) {
        int length = bArr.length * 8;
        if (length > 262144) {
            throw new IllegalArgumentException("Number of bits per request limited to 262144");
        } else if (this.f18532OooO00o > 140737488355328L) {
            return -1;
        } else {
            if (z) {
                m17692OooO00o(bArr2);
                bArr2 = null;
            }
            if (bArr2 != null) {
                byte[] bArr3 = this.f18535OooO00o;
                byte[] bArr4 = new byte[(bArr3.length + 1 + bArr2.length)];
                bArr4[0] = 2;
                System.arraycopy(bArr3, 0, bArr4, 1, bArr3.length);
                System.arraycopy(bArr2, 0, bArr4, this.f18535OooO00o.length + 1, bArr2.length);
                OooO00o(this.f18535OooO00o, OooO00o(bArr4));
            }
            byte[] OooO00o2 = OooO00o(this.f18535OooO00o, length);
            byte[] bArr5 = this.f18535OooO00o;
            byte[] bArr6 = new byte[(bArr5.length + 1)];
            System.arraycopy(bArr5, 0, bArr6, 1, bArr5.length);
            bArr6[0] = 3;
            OooO00o(this.f18535OooO00o, OooO00o(bArr6));
            OooO00o(this.f18535OooO00o, this.f18537OooO0O0);
            long j = this.f18532OooO00o;
            OooO00o(this.f18535OooO00o, new byte[]{(byte) ((int) (j >> 24)), (byte) ((int) (j >> 16)), (byte) ((int) (j >> 8)), (byte) ((int) j)});
            this.f18532OooO00o++;
            System.arraycopy(OooO00o2, 0, bArr, 0, bArr.length);
            return length;
        }
    }

    @Override // com.p118pd.sdk.AbstractC6863liiI
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m17692OooO00o(byte[] bArr) {
        byte[] OooO00o2 = C9510Lii1L.OooO00o(this.f18534OooO00o, C9586iIILl.OooO00o(f18530OooO0OO, this.f18535OooO00o, OooO00o(), bArr), this.f18536OooO0O0);
        this.f18535OooO00o = OooO00o2;
        byte[] bArr2 = new byte[(OooO00o2.length + 1)];
        bArr2[0] = 0;
        System.arraycopy(OooO00o2, 0, bArr2, 1, OooO00o2.length);
        this.f18537OooO0O0 = C9510Lii1L.OooO00o(this.f18534OooO00o, bArr2, this.f18536OooO0O0);
        this.f18532OooO00o = 1;
    }
}
