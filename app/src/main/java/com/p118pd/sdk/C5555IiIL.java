package com.p118pd.sdk;

/* renamed from: com.pd.sdk.I丨i丨丨丨IL  reason: invalid class name and case insensitive filesystem */
public class C5555IiIL {
    public static final int OooO00o = 4096;
    public static final int OooO0O0 = 262144;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final long f16067OooO0O0 = 32768;
    public static final long OooO0OO = 8388608;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f16068OooO00o = 1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC5552Iil f16069OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final li1l11I1 f16070OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f16071OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final byte[] f16072OooO0O0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public final byte[] f16073OooO0OO;
    public byte[] OooO0Oo;

    public C5555IiIL(li1l11I1 li1l11i1, byte[] bArr, AbstractC5552Iil r5) {
        this.f16070OooO00o = li1l11i1;
        this.f16069OooO00o = r5;
        byte[] bArr2 = new byte[li1l11i1.OooO00o()];
        this.f16071OooO00o = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.f16072OooO0O0 = new byte[li1l11i1.OooO00o()];
        this.f16073OooO0OO = new byte[li1l11i1.OooO00o()];
    }

    private void OooO00o(byte[] bArr) {
        for (int length = bArr.length - 1; length >= 0; length--) {
            byte b = (byte) (bArr[length] + 1);
            bArr[length] = b;
            if (b != 0) {
                return;
            }
        }
    }

    private void OooO00o(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = (byte) (bArr2[i] ^ bArr3[i]);
        }
        this.f16070OooO00o.OooO00o(bArr, 0, bArr, 0);
    }

    public static boolean OooO00o(byte[] bArr, int i) {
        return bArr != null && bArr.length > i;
    }

    public int OooO00o(byte[] bArr, boolean z) {
        if (this.f16073OooO0OO.length == 8) {
            if (this.f16068OooO00o > 32768) {
                return -1;
            }
            if (OooO00o(bArr, 512)) {
                throw new IllegalArgumentException("Number of bits per request limited to 4096");
            }
        } else if (this.f16068OooO00o > OooO0OO) {
            return -1;
        } else {
            if (OooO00o(bArr, 32768)) {
                throw new IllegalArgumentException("Number of bits per request limited to 262144");
            }
        }
        if (z || this.OooO0Oo == null) {
            byte[] OooO00o2 = this.f16069OooO00o.m15831OooO00o();
            this.OooO0Oo = OooO00o2;
            if (OooO00o2.length != this.f16070OooO00o.OooO00o()) {
                throw new IllegalStateException("Insufficient entropy returned");
            }
        }
        int length = bArr.length / this.f16073OooO0OO.length;
        for (int i = 0; i < length; i++) {
            this.f16070OooO00o.OooO00o(this.f16071OooO00o, 0, this.f16072OooO0O0, 0);
            OooO00o(this.f16073OooO0OO, this.f16072OooO0O0, this.OooO0Oo);
            OooO00o(this.OooO0Oo, this.f16073OooO0OO, this.f16072OooO0O0);
            byte[] bArr2 = this.f16073OooO0OO;
            System.arraycopy(bArr2, 0, bArr, bArr2.length * i, bArr2.length);
            OooO00o(this.f16071OooO00o);
        }
        int length2 = bArr.length - (this.f16073OooO0OO.length * length);
        if (length2 > 0) {
            this.f16070OooO00o.OooO00o(this.f16071OooO00o, 0, this.f16072OooO0O0, 0);
            OooO00o(this.f16073OooO0OO, this.f16072OooO0O0, this.OooO0Oo);
            OooO00o(this.OooO0Oo, this.f16073OooO0OO, this.f16072OooO0O0);
            byte[] bArr3 = this.f16073OooO0OO;
            System.arraycopy(bArr3, 0, bArr, length * bArr3.length, length2);
            OooO00o(this.f16071OooO00o);
        }
        this.f16068OooO00o++;
        return bArr.length;
    }

    public AbstractC5552Iil OooO00o() {
        return this.f16069OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m15834OooO00o() {
        byte[] OooO00o2 = this.f16069OooO00o.m15831OooO00o();
        this.OooO0Oo = OooO00o2;
        if (OooO00o2.length == this.f16070OooO00o.OooO00o()) {
            this.f16068OooO00o = 1;
            return;
        }
        throw new IllegalStateException("Insufficient entropy returned");
    }
}
