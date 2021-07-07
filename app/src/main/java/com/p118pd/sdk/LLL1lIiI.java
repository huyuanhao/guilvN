package com.p118pd.sdk;

import java.io.IOException;
import org.bouncycastle.crypto.tls.TlsFatalAlert;

/* renamed from: com.pd.sdk.LLL1lIiI */
public class LLL1lIiI implements C11iil {
    public C5712LiLl OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iL1liI f16448OooO00o;
    public C5712LiLl OooO0O0;

    public LLL1lIiI(iL1liI il1lii) {
        this.f16448OooO00o = il1lii;
        this.OooO00o = null;
        this.OooO0O0 = null;
    }

    public LLL1lIiI(iL1liI il1lii, AbstractC6436l11LI r13, AbstractC6436l11LI r14) throws IOException {
        C5712LiLl r1;
        if ((r13 == null) == (r14 != null ? false : true)) {
            this.f16448OooO00o = il1lii;
            C5712LiLl r0 = null;
            if (r13 != null) {
                int OooO0O02 = r13.OooO0O0() + r14.OooO0O0();
                byte[] OooO00o2 = L1LL1Ii.OooO00o(il1lii, OooO0O02);
                C5712LiLl r10 = new C5712LiLl(il1lii, r13, OooO00o2, 0, r13.OooO0O0());
                int OooO0O03 = r13.OooO0O0() + 0;
                r1 = new C5712LiLl(il1lii, r14, OooO00o2, OooO0O03, r14.OooO0O0());
                if (OooO0O03 + r14.OooO0O0() == OooO0O02) {
                    r0 = r10;
                } else {
                    throw new TlsFatalAlert(80);
                }
            } else {
                r1 = null;
            }
            if (il1lii.m17079OooO00o()) {
                this.OooO00o = r1;
                this.OooO0O0 = r0;
                return;
            }
            this.OooO00o = r0;
            this.OooO0O0 = r1;
            return;
        }
        throw new TlsFatalAlert(80);
    }

    @Override // com.p118pd.sdk.C11iil
    public int OooO00o(int i) {
        C5712LiLl r0 = this.OooO00o;
        return r0 != null ? i - r0.OooO00o() : i;
    }

    @Override // com.p118pd.sdk.C11iil
    public byte[] OooO00o(long j, short s, byte[] bArr, int i, int i2) throws IOException {
        C5712LiLl r0 = this.OooO0O0;
        if (r0 == null) {
            return C9586iIILl.m21632OooO00o(bArr, i, i2 + i);
        }
        int OooO00o2 = r0.OooO00o();
        if (i2 >= OooO00o2) {
            int i3 = i2 - OooO00o2;
            int i4 = i + i3;
            if (C9586iIILl.OooO0O0(C9586iIILl.m21632OooO00o(bArr, i4, i2 + i), this.OooO0O0.OooO00o(j, s, bArr, i, i3))) {
                return C9586iIILl.m21632OooO00o(bArr, i, i4);
            }
            throw new TlsFatalAlert(20);
        }
        throw new TlsFatalAlert(50);
    }

    @Override // com.p118pd.sdk.C11iil
    public byte[] OooO0O0(long j, short s, byte[] bArr, int i, int i2) throws IOException {
        C5712LiLl r0 = this.OooO00o;
        if (r0 == null) {
            return C9586iIILl.m21632OooO00o(bArr, i, i2 + i);
        }
        byte[] OooO00o2 = r0.OooO00o(j, s, bArr, i, i2);
        byte[] bArr2 = new byte[(OooO00o2.length + i2)];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        System.arraycopy(OooO00o2, 0, bArr2, i2, OooO00o2.length);
        return bArr2;
    }
}
