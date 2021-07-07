package com.p118pd.sdk;

import java.lang.reflect.Array;
import java.security.SecureRandom;

/* renamed from: com.pd.sdk.iiL丨丨1丨L  reason: invalid class name and case insensitive filesystem */
public class C6257iiL1L implements l1lILl {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5304ILLli f17885OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5673LLll f17886OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6054i1l1 f17887OooO00o = new C6054i1l1();

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6094iILI1 f17888OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6237iiL f17889OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6436l11LI f17890OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9696lLl1 f17891OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f17892OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f17893OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f17894OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[][] f17895OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[][][] f17896OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public AbstractC6436l11LI f17897OooO0O0;

    public C6257iiL1L(AbstractC9696lLl1 r2) {
        this.f17891OooO00o = r2;
        AbstractC6436l11LI OooO00o2 = r2.OooO00o();
        this.f17890OooO00o = OooO00o2;
        this.f17897OooO0O0 = OooO00o2;
        this.OooO00o = OooO00o2.OooO0O0();
        this.f17889OooO00o = new C6237iiL(this.f17890OooO00o);
    }

    private void OooO00o() {
        int i;
        this.f17890OooO00o.reset();
        C6772llLil lllil = (C6772llLil) this.f17885OooO00o;
        if (lllil.OooO0O0()) {
            throw new IllegalStateException("Private key already used");
        } else if (lllil.m17881OooO00o(0) < lllil.m17888OooO0O0(0)) {
            C5673LLll OooO00o2 = lllil.OooO00o();
            this.f17886OooO00o = OooO00o2;
            this.OooO0O0 = OooO00o2.OooO00o();
            byte[] bArr = lllil.m17886OooO00o()[this.OooO0O0 - 1];
            int i2 = this.OooO00o;
            byte[] bArr2 = new byte[i2];
            byte[] bArr3 = new byte[i2];
            System.arraycopy(bArr, 0, bArr3, 0, i2);
            this.f17888OooO00o = new C6094iILI1(this.f17889OooO00o.m17248OooO00o(bArr3), this.f17891OooO00o.OooO00o(), this.f17886OooO00o.OooO0OO()[this.OooO0O0 - 1]);
            byte[][][] OooO00o3 = lllil.m17887OooO00o();
            this.f17896OooO00o = new byte[this.OooO0O0][][];
            int i3 = 0;
            while (true) {
                i = this.OooO0O0;
                if (i3 >= i) {
                    break;
                }
                byte[][][] bArr4 = this.f17896OooO00o;
                int length = OooO00o3[i3].length;
                int[] iArr = new int[2];
                iArr[1] = this.OooO00o;
                iArr[0] = length;
                bArr4[i3] = (byte[][]) Array.newInstance(byte.class, iArr);
                for (int i4 = 0; i4 < OooO00o3[i3].length; i4++) {
                    System.arraycopy(OooO00o3[i3][i4], 0, this.f17896OooO00o[i3][i4], 0, this.OooO00o);
                }
                i3++;
            }
            this.f17894OooO00o = new int[i];
            System.arraycopy(lllil.m17885OooO00o(), 0, this.f17894OooO00o, 0, this.OooO0O0);
            this.f17895OooO00o = new byte[(this.OooO0O0 - 1)][];
            for (int i5 = 0; i5 < this.OooO0O0 - 1; i5++) {
                byte[] OooO00o4 = lllil.m17884OooO00o(i5);
                byte[][] bArr5 = this.f17895OooO00o;
                bArr5[i5] = new byte[OooO00o4.length];
                System.arraycopy(OooO00o4, 0, bArr5[i5], 0, OooO00o4.length);
            }
            lllil.m17883OooO00o();
        } else {
            throw new IllegalStateException("No more signatures can be generated");
        }
    }

    private void OooO0O0() {
        this.f17890OooO00o.reset();
        II11 r0 = (II11) this.f17885OooO00o;
        this.f17893OooO00o = r0.OooO0O0();
        C5673LLll OooO00o2 = r0.OooO00o();
        this.f17886OooO00o = OooO00o2;
        this.OooO0O0 = OooO00o2.OooO00o();
    }

    @Override // com.p118pd.sdk.l1lILl
    public void OooO00o(boolean z, AbstractC6370iIIIl r2) {
        if (z) {
            if (r2 instanceof liLL1l) {
                liLL1l r22 = (liLL1l) r2;
                this.f17892OooO00o = r22.m17752OooO00o();
                this.f17885OooO00o = (C6772llLil) r22.OooO00o();
            } else {
                this.f17892OooO00o = IIllii.OooO00o();
                this.f17885OooO00o = (C6772llLil) r2;
            }
            OooO00o();
            return;
        }
        this.f17885OooO00o = (II11) r2;
        OooO0O0();
    }

    @Override // com.p118pd.sdk.l1lILl
    public boolean OooO00o(byte[] bArr, byte[] bArr2) {
        this.f17897OooO0O0.reset();
        int i = 0;
        for (int i2 = this.OooO0O0 - 1; i2 >= 0; i2--) {
            C5735LiiII r4 = new C5735LiiII(this.f17891OooO00o.OooO00o(), this.f17886OooO00o.OooO0OO()[i2]);
            int OooO00o2 = r4.OooO00o();
            int OooO00o3 = this.f17887OooO00o.OooO00o(bArr2, i);
            int i3 = i + 4;
            byte[] bArr3 = new byte[OooO00o2];
            System.arraycopy(bArr2, i3, bArr3, 0, OooO00o2);
            i = i3 + OooO00o2;
            bArr = r4.OooO00o(bArr, bArr3);
            if (bArr == null) {
                System.err.println("OTS Public Key is null in GMSSSignature.verify");
                return false;
            }
            int i4 = this.f17886OooO00o.m16250OooO00o()[i2];
            int[] iArr = new int[2];
            iArr[1] = this.OooO00o;
            iArr[0] = i4;
            byte[][] bArr4 = (byte[][]) Array.newInstance(byte.class, iArr);
            for (byte[] bArr5 : bArr4) {
                System.arraycopy(bArr2, i, bArr5, 0, this.OooO00o);
                i += this.OooO00o;
            }
            byte[] bArr6 = new byte[this.OooO00o];
            int length = (1 << bArr4.length) + OooO00o3;
            for (int i5 = 0; i5 < bArr4.length; i5++) {
                int i6 = this.OooO00o;
                int i7 = i6 << 1;
                byte[] bArr7 = new byte[i7];
                if (length % 2 == 0) {
                    System.arraycopy(bArr, 0, bArr7, 0, i6);
                    byte[] bArr8 = bArr4[i5];
                    int i8 = this.OooO00o;
                    System.arraycopy(bArr8, 0, bArr7, i8, i8);
                    length /= 2;
                } else {
                    System.arraycopy(bArr4[i5], 0, bArr7, 0, i6);
                    System.arraycopy(bArr, 0, bArr7, this.OooO00o, bArr.length);
                    length = (length - 1) / 2;
                }
                this.f17890OooO00o.update(bArr7, 0, i7);
                bArr = new byte[this.f17890OooO00o.OooO0O0()];
                this.f17890OooO00o.OooO00o(bArr, 0);
            }
        }
        return C9586iIILl.m21627OooO00o(this.f17893OooO00o, bArr);
    }

    @Override // com.p118pd.sdk.l1lILl
    public byte[] OooO00o(byte[] bArr) {
        byte[] bArr2 = new byte[this.OooO00o];
        byte[] OooO00o2 = this.f17888OooO00o.OooO00o(bArr);
        byte[] OooO00o3 = this.f17887OooO00o.OooO00o(this.f17896OooO00o[this.OooO0O0 - 1]);
        byte[] OooO00o4 = this.f17887OooO00o.m16922OooO00o(this.f17894OooO00o[this.OooO0O0 - 1]);
        int length = OooO00o4.length + OooO00o2.length + OooO00o3.length;
        byte[] bArr3 = new byte[length];
        System.arraycopy(OooO00o4, 0, bArr3, 0, OooO00o4.length);
        System.arraycopy(OooO00o2, 0, bArr3, OooO00o4.length, OooO00o2.length);
        System.arraycopy(OooO00o3, 0, bArr3, OooO00o4.length + OooO00o2.length, OooO00o3.length);
        byte[] bArr4 = new byte[0];
        for (int i = (this.OooO0O0 - 1) - 1; i >= 0; i--) {
            byte[] OooO00o5 = this.f17887OooO00o.OooO00o(this.f17896OooO00o[i]);
            byte[] OooO00o6 = this.f17887OooO00o.m16922OooO00o(this.f17894OooO00o[i]);
            int length2 = bArr4.length;
            byte[] bArr5 = new byte[length2];
            System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length);
            bArr4 = new byte[(OooO00o6.length + length2 + this.f17895OooO00o[i].length + OooO00o5.length)];
            System.arraycopy(bArr5, 0, bArr4, 0, length2);
            System.arraycopy(OooO00o6, 0, bArr4, length2, OooO00o6.length);
            byte[][] bArr6 = this.f17895OooO00o;
            System.arraycopy(bArr6[i], 0, bArr4, OooO00o6.length + length2, bArr6[i].length);
            System.arraycopy(OooO00o5, 0, bArr4, length2 + OooO00o6.length + this.f17895OooO00o[i].length, OooO00o5.length);
        }
        byte[] bArr7 = new byte[(bArr4.length + length)];
        System.arraycopy(bArr3, 0, bArr7, 0, length);
        System.arraycopy(bArr4, 0, bArr7, length, bArr4.length);
        return bArr7;
    }
}
