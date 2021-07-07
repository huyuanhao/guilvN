package com.p118pd.sdk;

import java.util.Hashtable;

/* renamed from: com.pd.sdk.i丨Ll1  reason: invalid class name and case insensitive filesystem */
public class C6383iLl1 implements AbstractC6769llL1L {
    public static final byte OooO00o = 54;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Hashtable f18175OooO00o = null;
    public static final byte OooO0O0 = 92;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f18176OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6186iLi1 f18177OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6436l11LI f18178OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f18179OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public int f18180OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public AbstractC6186iLi1 f18181OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f18182OooO0O0;

    static {
        Hashtable hashtable = new Hashtable();
        f18175OooO00o = hashtable;
        hashtable.put("GOST3411", I11I.OooO00o(32));
        f18175OooO00o.put("MD2", I11I.OooO00o(16));
        f18175OooO00o.put("MD4", I11I.OooO00o(64));
        f18175OooO00o.put("MD5", I11I.OooO00o(64));
        f18175OooO00o.put("RIPEMD128", I11I.OooO00o(64));
        f18175OooO00o.put("RIPEMD160", I11I.OooO00o(64));
        f18175OooO00o.put(LL1i.OooO0O0, I11I.OooO00o(64));
        f18175OooO00o.put(LL1i.OooO0OO, I11I.OooO00o(64));
        f18175OooO00o.put(LL1i.OooO0Oo, I11I.OooO00o(64));
        f18175OooO00o.put(LL1i.f16409OooO0o0, I11I.OooO00o(128));
        f18175OooO00o.put(LL1i.f16408OooO0o, I11I.OooO00o(128));
        f18175OooO00o.put("Tiger", I11I.OooO00o(64));
        f18175OooO00o.put("Whirlpool", I11I.OooO00o(64));
    }

    public C6383iLl1(AbstractC6436l11LI r2) {
        this(r2, OooO00o(r2));
    }

    public C6383iLl1(AbstractC6436l11LI r2, int i) {
        this.f18178OooO00o = r2;
        int OooO0O02 = r2.OooO0O0();
        this.f18176OooO00o = OooO0O02;
        this.f18180OooO0O0 = i;
        this.f18179OooO00o = new byte[i];
        this.f18182OooO0O0 = new byte[(i + OooO0O02)];
    }

    public static int OooO00o(AbstractC6436l11LI r3) {
        if (r3 instanceof lIL1i11) {
            return ((lIL1i11) r3).OooO00o();
        }
        Integer num = (Integer) f18175OooO00o.get(r3.OooO00o());
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException("unknown digest passed: " + r3.OooO00o());
    }

    public static void OooO00o(byte[] bArr, int i, byte b) {
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) (bArr[i2] ^ b);
        }
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L, com.p118pd.sdk.AbstractC6769llL1L
    public int OooO00o() {
        return this.f18176OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public int OooO00o(byte[] bArr, int i) {
        this.f18178OooO00o.OooO00o(this.f18182OooO0O0, this.f18180OooO0O0);
        AbstractC6186iLi1 r0 = this.f18181OooO0O0;
        if (r0 != null) {
            ((AbstractC6186iLi1) this.f18178OooO00o).OooO00o(r0);
            AbstractC6436l11LI r02 = this.f18178OooO00o;
            r02.update(this.f18182OooO0O0, this.f18180OooO0O0, r02.OooO0O0());
        } else {
            AbstractC6436l11LI r03 = this.f18178OooO00o;
            byte[] bArr2 = this.f18182OooO0O0;
            r03.update(bArr2, 0, bArr2.length);
        }
        int OooO00o2 = this.f18178OooO00o.OooO00o(bArr, i);
        int i2 = this.f18180OooO0O0;
        while (true) {
            byte[] bArr3 = this.f18182OooO0O0;
            if (i2 >= bArr3.length) {
                break;
            }
            bArr3[i2] = 0;
            i2++;
        }
        AbstractC6186iLi1 r7 = this.f18177OooO00o;
        if (r7 != null) {
            ((AbstractC6186iLi1) this.f18178OooO00o).OooO00o(r7);
        } else {
            AbstractC6436l11LI r72 = this.f18178OooO00o;
            byte[] bArr4 = this.f18179OooO00o;
            r72.update(bArr4, 0, bArr4.length);
        }
        return OooO00o2;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L, com.p118pd.sdk.AbstractC6769llL1L
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6436l11LI m17500OooO00o() {
        return this.f18178OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L, com.p118pd.sdk.AbstractC6769llL1L
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m17501OooO00o() {
        return this.f18178OooO00o.OooO00o() + "/HMAC";
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void OooO00o(AbstractC6370iIIIl r4) {
        byte[] bArr;
        this.f18178OooO00o.reset();
        byte[] OooO00o2 = ((C6642li1LI) r4).OooO00o();
        int length = OooO00o2.length;
        if (length > this.f18180OooO0O0) {
            this.f18178OooO00o.update(OooO00o2, 0, length);
            this.f18178OooO00o.OooO00o(this.f18179OooO00o, 0);
            length = this.f18176OooO00o;
        } else {
            System.arraycopy(OooO00o2, 0, this.f18179OooO00o, 0, length);
        }
        while (true) {
            bArr = this.f18179OooO00o;
            if (length >= bArr.length) {
                break;
            }
            bArr[length] = 0;
            length++;
        }
        System.arraycopy(bArr, 0, this.f18182OooO0O0, 0, this.f18180OooO0O0);
        OooO00o(this.f18179OooO00o, this.f18180OooO0O0, (byte) 54);
        OooO00o(this.f18182OooO0O0, this.f18180OooO0O0, (byte) 92);
        AbstractC6436l11LI r42 = this.f18178OooO00o;
        if (r42 instanceof AbstractC6186iLi1) {
            AbstractC6186iLi1 OooO00o3 = ((AbstractC6186iLi1) r42).OooO00o();
            this.f18181OooO0O0 = OooO00o3;
            ((AbstractC6436l11LI) OooO00o3).update(this.f18182OooO0O0, 0, this.f18180OooO0O0);
        }
        AbstractC6436l11LI r43 = this.f18178OooO00o;
        byte[] bArr2 = this.f18179OooO00o;
        r43.update(bArr2, 0, bArr2.length);
        AbstractC6436l11LI r44 = this.f18178OooO00o;
        if (r44 instanceof AbstractC6186iLi1) {
            this.f18177OooO00o = ((AbstractC6186iLi1) r44).OooO00o();
        }
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void reset() {
        this.f18178OooO00o.reset();
        AbstractC6436l11LI r0 = this.f18178OooO00o;
        byte[] bArr = this.f18179OooO00o;
        r0.update(bArr, 0, bArr.length);
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void update(byte b) {
        this.f18178OooO00o.update(b);
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void update(byte[] bArr, int i, int i2) {
        this.f18178OooO00o.update(bArr, i, i2);
    }
}
