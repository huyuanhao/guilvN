package com.p118pd.sdk;

import java.io.IOException;
import org.bouncycastle.crypto.tls.TlsFatalAlert;

/* renamed from: com.pd.sdk.llL丨  reason: invalid class name and case insensitive filesystem */
public class C6776llL implements C11iil {
    public I1LLllll OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5712LiLl f18794OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iL1liI f18795OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f18796OooO00o;
    public I1LLllll OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public C5712LiLl f18797OooO0O0;

    public C6776llL(iL1liI il1lii, I1LLllll i1LLllll, I1LLllll i1LLllll2, AbstractC6436l11LI r23, AbstractC6436l11LI r24, int i, boolean z) throws IOException {
        boolean OooO00o2 = il1lii.m17079OooO00o();
        this.f18795OooO00o = il1lii;
        this.f18796OooO00o = z;
        this.OooO00o = i1LLllll;
        this.OooO0O0 = i1LLllll2;
        int OooO0O02 = (i * 2) + r23.OooO0O0() + r24.OooO0O0();
        byte[] OooO00o3 = L1LL1Ii.OooO00o(il1lii, OooO0O02);
        C5712LiLl r15 = new C5712LiLl(il1lii, r23, OooO00o3, 0, r23.OooO0O0());
        int OooO0O03 = r23.OooO0O0() + 0;
        C5712LiLl r5 = new C5712LiLl(il1lii, r24, OooO00o3, OooO0O03, r24.OooO0O0());
        int OooO0O04 = OooO0O03 + r24.OooO0O0();
        AbstractC6370iIIIl r2 = new C6642li1LI(OooO00o3, OooO0O04, i);
        int i2 = OooO0O04 + i;
        AbstractC6370iIIIl r3 = new C6642li1LI(OooO00o3, i2, i);
        if (i2 + i == OooO0O02) {
            if (OooO00o2) {
                this.f18794OooO00o = r5;
                this.f18797OooO0O0 = r15;
                this.OooO00o = i1LLllll2;
                this.OooO0O0 = i1LLllll;
                r3 = r2;
                r2 = r3;
            } else {
                this.f18794OooO00o = r15;
                this.f18797OooO0O0 = r5;
                this.OooO00o = i1LLllll;
                this.OooO0O0 = i1LLllll2;
            }
            if (z) {
                byte[] bArr = new byte[8];
                AbstractC6370iIIIl r4 = new C6274iilL1L(r2, bArr);
                r3 = new C6274iilL1L(r3, bArr);
                r2 = r4;
            }
            this.OooO00o.OooO00o(true, r2);
            this.OooO0O0.OooO00o(false, r3);
            return;
        }
        throw new TlsFatalAlert(80);
    }

    @Override // com.p118pd.sdk.C11iil
    public int OooO00o(int i) {
        return i - this.f18794OooO00o.OooO00o();
    }

    public void OooO00o(long j, short s, byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) throws IOException {
        if (!C9586iIILl.OooO0O0(C9586iIILl.m21632OooO00o(bArr, i, i2), this.f18797OooO0O0.OooO00o(j, s, bArr2, i3, i4))) {
            throw new TlsFatalAlert(20);
        }
    }

    public void OooO00o(I1LLllll i1LLllll, boolean z, long j) {
        byte[] bArr = new byte[8];
        L1LL1Ii.OooO0OO(j, bArr, 0);
        i1LLllll.OooO00o(z, new C6274iilL1L(null, bArr));
    }

    @Override // com.p118pd.sdk.C11iil
    public byte[] OooO00o(long j, short s, byte[] bArr, int i, int i2) throws IOException {
        if (this.f18796OooO00o) {
            OooO00o(this.OooO0O0, false, j);
        }
        int OooO00o2 = this.f18797OooO0O0.OooO00o();
        if (i2 >= OooO00o2) {
            int i3 = i2 - OooO00o2;
            byte[] bArr2 = new byte[i2];
            this.OooO0O0.OooO00o(bArr, i, i2, bArr2, 0);
            OooO00o(j, s, bArr2, i3, i2, bArr2, 0, i3);
            return C9586iIILl.m21632OooO00o(bArr2, 0, i3);
        }
        throw new TlsFatalAlert(50);
    }

    @Override // com.p118pd.sdk.C11iil
    public byte[] OooO0O0(long j, short s, byte[] bArr, int i, int i2) {
        if (this.f18796OooO00o) {
            OooO00o(this.OooO00o, true, j);
        }
        byte[] bArr2 = new byte[(i2 + this.f18794OooO00o.OooO00o())];
        this.OooO00o.OooO00o(bArr, i, i2, bArr2, 0);
        byte[] OooO00o2 = this.f18794OooO00o.OooO00o(j, s, bArr, i, i2);
        this.OooO00o.OooO00o(OooO00o2, 0, OooO00o2.length, bArr2, i2);
        return bArr2;
    }
}
