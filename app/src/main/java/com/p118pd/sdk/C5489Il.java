package com.p118pd.sdk;

import java.io.IOException;
import org.bouncycastle.crypto.tls.TlsFatalAlert;

/* renamed from: com.pd.sdk.Il丨丨  reason: invalid class name and case insensitive filesystem */
public class C5489Il implements C11iil {
    public static final byte[] OooO0OO = new byte[15];
    public IIIli1L OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iL1liI f15925OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f15926OooO00o;
    public IIIli1L OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f15927OooO0O0;

    public C5489Il(iL1liI il1lii) throws IOException {
        if (L1LL1Ii.OooO0OO(il1lii)) {
            this.f15925OooO00o = il1lii;
            byte[] OooO00o2 = L1LL1Ii.OooO00o(il1lii, 88);
            C6642li1LI r2 = new C6642li1LI(OooO00o2, 0, 32);
            C6642li1LI r5 = new C6642li1LI(OooO00o2, 32, 32);
            byte[] OooO00o3 = C9586iIILl.m21632OooO00o(OooO00o2, 64, 76);
            byte[] OooO00o4 = C9586iIILl.m21632OooO00o(OooO00o2, 76, 88);
            this.OooO00o = new IIIli1L();
            this.OooO0O0 = new IIIli1L();
            if (il1lii.m17079OooO00o()) {
                this.f15926OooO00o = OooO00o4;
                this.f15927OooO0O0 = OooO00o3;
                r5 = r2;
                r2 = r5;
            } else {
                this.f15926OooO00o = OooO00o3;
                this.f15927OooO0O0 = OooO00o4;
            }
            this.OooO00o.OooO00o(true, (AbstractC6370iIIIl) new C6274iilL1L(r2, this.f15926OooO00o));
            this.OooO0O0.OooO00o(false, (AbstractC6370iIIIl) new C6274iilL1L(r5, this.f15927OooO0O0));
            return;
        }
        throw new TlsFatalAlert(80);
    }

    @Override // com.p118pd.sdk.C11iil
    public int OooO00o(int i) {
        return i - 16;
    }

    public C6642li1LI OooO00o(I1LLllll i1LLllll) {
        byte[] bArr = new byte[64];
        i1LLllll.OooO00o(bArr, 0, 64, bArr, 0);
        C6642li1LI r8 = new C6642li1LI(bArr, 0, 32);
        C9586iIILl.OooO00o(bArr, (byte) 0);
        return r8;
    }

    public C6642li1LI OooO00o(I1LLllll i1LLllll, boolean z, long j, byte[] bArr) {
        i1LLllll.OooO00o(z, new C6274iilL1L(null, OooO00o(j, bArr)));
        return OooO00o(i1LLllll);
    }

    public void OooO00o(AbstractC6769llL1L lll1l, int i) {
        byte[] OooO0O02 = AbstractC6464l1l.OooO0O0(((long) i) & 4294967295L);
        lll1l.update(OooO0O02, 0, OooO0O02.length);
    }

    public void OooO00o(AbstractC6769llL1L lll1l, byte[] bArr, int i, int i2) {
        lll1l.update(bArr, i, i2);
        int i3 = i2 % 16;
        if (i3 != 0) {
            lll1l.update(OooO0OO, 0, 16 - i3);
        }
    }

    public byte[] OooO00o(long j, short s, int i) throws IOException {
        byte[] bArr = new byte[13];
        L1LL1Ii.OooO0OO(j, bArr, 0);
        L1LL1Ii.OooO00o(s, bArr, 8);
        L1LL1Ii.OooO00o(this.f15925OooO00o.OooO0O0(), bArr, 9);
        L1LL1Ii.OooO00o(i, bArr, 11);
        return bArr;
    }

    @Override // com.p118pd.sdk.C11iil
    public byte[] OooO00o(long j, short s, byte[] bArr, int i, int i2) throws IOException {
        if (OooO00o(i2) >= 0) {
            int i3 = i2 - 16;
            if (C9586iIILl.OooO0O0(OooO00o(OooO00o((I1LLllll) this.OooO0O0, false, j, this.f15927OooO0O0), OooO00o(j, s, i3), bArr, i, i3), C9586iIILl.m21632OooO00o(bArr, i + i3, i + i2))) {
                byte[] bArr2 = new byte[i3];
                this.OooO0O0.OooO00o(bArr, i, i3, bArr2, 0);
                return bArr2;
            }
            throw new TlsFatalAlert(20);
        }
        throw new TlsFatalAlert(50);
    }

    public byte[] OooO00o(long j, byte[] bArr) {
        byte[] bArr2 = new byte[12];
        L1LL1Ii.OooO0OO(j, bArr2, 4);
        for (int i = 0; i < 12; i++) {
            bArr2[i] = (byte) (bArr2[i] ^ bArr[i]);
        }
        return bArr2;
    }

    public byte[] OooO00o(C6642li1LI r3, byte[] bArr, byte[] bArr2, int i, int i2) {
        C6117iIl1 iil1 = new C6117iIl1();
        iil1.OooO00o(r3);
        OooO00o(iil1, bArr, 0, bArr.length);
        OooO00o(iil1, bArr2, i, i2);
        OooO00o(iil1, bArr.length);
        OooO00o(iil1, i2);
        byte[] bArr3 = new byte[iil1.OooO00o()];
        iil1.OooO00o(bArr3, 0);
        return bArr3;
    }

    @Override // com.p118pd.sdk.C11iil
    public byte[] OooO0O0(long j, short s, byte[] bArr, int i, int i2) throws IOException {
        C6642li1LI OooO00o2 = OooO00o((I1LLllll) this.OooO00o, true, j, this.f15926OooO00o);
        byte[] bArr2 = new byte[(i2 + 16)];
        this.OooO00o.OooO00o(bArr, i, i2, bArr2, 0);
        byte[] OooO00o3 = OooO00o(OooO00o2, OooO00o(j, s, i2), bArr2, 0, i2);
        System.arraycopy(OooO00o3, 0, bArr2, i2, OooO00o3.length);
        return bArr2;
    }
}
