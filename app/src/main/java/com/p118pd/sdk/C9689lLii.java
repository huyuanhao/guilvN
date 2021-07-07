package com.p118pd.sdk;

import java.math.BigInteger;
import org.bouncycastle.crypto.CryptoException;

/* renamed from: com.pd.sdk.丨lLii丨  reason: invalid class name and case insensitive filesystem */
public class C9689lLii implements AbstractC93171I1 {
    public static final int OooO = 14028;
    public static final int OooO0OO = 188;
    public static final int OooO0Oo = 12748;
    public static final int OooO0o = 13260;
    public static final int OooO0o0 = 13004;
    public static final int OooO0oO = 13516;
    public static final int OooO0oo = 13772;
    public static final int OooOO0 = 14284;
    public static final int OooOO0O = 14540;
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6436l11LI f23300OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public liLI1l1i f23301OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Ii1IliL f23302OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f23303OooO00o;
    public int OooO0O0;

    public C9689lLii(Ii1IliL r2, AbstractC6436l11LI r3) {
        this(r2, r3, false);
    }

    public C9689lLii(Ii1IliL r2, AbstractC6436l11LI r3, boolean z) {
        int intValue;
        this.f23302OooO00o = r2;
        this.f23300OooO00o = r3;
        if (z) {
            intValue = 188;
        } else {
            Integer OooO00o2 = I11.OooO00o(r3);
            if (OooO00o2 != null) {
                intValue = OooO00o2.intValue();
            } else {
                throw new IllegalArgumentException("no valid trailer for digest: " + r3.OooO00o());
            }
        }
        this.OooO00o = intValue;
    }

    private void OooO00o(int i) {
        int i2;
        int OooO0O02 = this.f23300OooO00o.OooO0O0();
        if (i == 188) {
            byte[] bArr = this.f23303OooO00o;
            i2 = (bArr.length - OooO0O02) - 1;
            this.f23300OooO00o.OooO00o(bArr, i2);
            byte[] bArr2 = this.f23303OooO00o;
            bArr2[bArr2.length - 1] = C9684lIl.OooO0O0;
        } else {
            byte[] bArr3 = this.f23303OooO00o;
            int length = (bArr3.length - OooO0O02) - 2;
            this.f23300OooO00o.OooO00o(bArr3, length);
            byte[] bArr4 = this.f23303OooO00o;
            bArr4[bArr4.length - 2] = (byte) (i >>> 8);
            bArr4[bArr4.length - 1] = (byte) i;
            i2 = length;
        }
        this.f23303OooO00o[0] = 107;
        for (int i3 = i2 - 2; i3 != 0; i3--) {
            this.f23303OooO00o[i3] = -69;
        }
        this.f23303OooO00o[i2 - 1] = -70;
    }

    private void OooO0O0(byte[] bArr) {
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = 0;
        }
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public void OooO00o(boolean z, AbstractC6370iIIIl r3) {
        liLI1l1i lili1l1i = (liLI1l1i) r3;
        this.f23301OooO00o = lili1l1i;
        this.f23302OooO00o.OooO00o(z, lili1l1i);
        int bitLength = this.f23301OooO00o.OooO0O0().bitLength();
        this.OooO0O0 = bitLength;
        this.f23303OooO00o = new byte[((bitLength + 7) / 8)];
        reset();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002d, code lost:
        if ((r4.intValue() & 15) == 12) goto L_0x002f;
     */
    @Override // com.p118pd.sdk.AbstractC93171I1
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean OooO00o(byte[] r4) {
        /*
            r3 = this;
            r0 = 0
            com.pd.sdk.丨Ii1IliL r1 = r3.f23302OooO00o     // Catch:{ Exception -> 0x005e }
            int r2 = r4.length     // Catch:{ Exception -> 0x005e }
            byte[] r4 = r1.OooO00o(r4, r0, r2)     // Catch:{ Exception -> 0x005e }
            r3.f23303OooO00o = r4     // Catch:{ Exception -> 0x005e }
            java.math.BigInteger r4 = new java.math.BigInteger
            r1 = 1
            byte[] r2 = r3.f23303OooO00o
            r4.<init>(r1, r2)
            int r1 = r4.intValue()
            r1 = r1 & 15
            r2 = 12
            if (r1 != r2) goto L_0x001d
            goto L_0x002f
        L_0x001d:
            com.pd.sdk.liLI1l1i r1 = r3.f23301OooO00o
            java.math.BigInteger r1 = r1.OooO0O0()
            java.math.BigInteger r4 = r1.subtract(r4)
            int r1 = r4.intValue()
            r1 = r1 & 15
            if (r1 != r2) goto L_0x005e
        L_0x002f:
            int r0 = r3.OooO00o
            r3.OooO00o(r0)
            byte[] r0 = r3.f23303OooO00o
            int r0 = r0.length
            byte[] r4 = com.p118pd.sdk.IIiL.OooO00o(r0, r4)
            byte[] r0 = r3.f23303OooO00o
            boolean r0 = com.p118pd.sdk.C9586iIILl.OooO0O0(r0, r4)
            int r1 = r3.OooO00o
            r2 = 15052(0x3acc, float:2.1092E-41)
            if (r1 != r2) goto L_0x0056
            if (r0 != 0) goto L_0x0056
            byte[] r0 = r3.f23303OooO00o
            int r1 = r0.length
            int r1 = r1 + -2
            r2 = 64
            r0[r1] = r2
            boolean r0 = com.p118pd.sdk.C9586iIILl.OooO0O0(r0, r4)
        L_0x0056:
            byte[] r1 = r3.f23303OooO00o
            r3.OooO0O0(r1)
            r3.OooO0O0(r4)
        L_0x005e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C9689lLii.OooO00o(byte[]):boolean");
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public byte[] OooO0O0() throws CryptoException {
        OooO00o(this.OooO00o);
        Ii1IliL r1 = this.f23302OooO00o;
        byte[] bArr = this.f23303OooO00o;
        BigInteger bigInteger = new BigInteger(1, r1.OooO00o(bArr, 0, bArr.length));
        OooO0O0(this.f23303OooO00o);
        return IIiL.OooO00o((this.f23301OooO00o.OooO0O0().bitLength() + 7) / 8, bigInteger.min(this.f23301OooO00o.OooO0O0().subtract(bigInteger)));
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public void reset() {
        this.f23300OooO00o.reset();
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public void update(byte b) {
        this.f23300OooO00o.update(b);
    }

    @Override // com.p118pd.sdk.AbstractC93171I1
    public void update(byte[] bArr, int i, int i2) {
        this.f23300OooO00o.update(bArr, i, i2);
    }
}
