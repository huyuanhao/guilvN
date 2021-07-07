package com.p118pd.sdk;

import java.io.IOException;
import java.math.BigInteger;
import org.bouncycastle.tsp.TSPIOException;

/* renamed from: com.pd.sdk.L丨L丨丨丨  reason: invalid class name and case insensitive filesystem */
public class C5864LL {
    public C5514IL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public L11l1i f16826OooO00o = new L11l1i();

    /* renamed from: OooO00o  reason: collision with other field name */
    public LlLI1 f16827OooO00o;

    public C1LI1l OooO00o(LlLI1 llLI1, byte[] bArr) {
        return OooO00o(llLI1.m16387OooO0O0(), bArr);
    }

    public C1LI1l OooO00o(LlLI1 llLI1, byte[] bArr, BigInteger bigInteger) {
        return OooO00o(llLI1.m16387OooO0O0(), bArr, bigInteger);
    }

    public C1LI1l OooO00o(String str, byte[] bArr) {
        return OooO00o(str, bArr, (BigInteger) null);
    }

    public C1LI1l OooO00o(String str, byte[] bArr, BigInteger bigInteger) {
        C1LI1l r9;
        if (str != null) {
            C6506lIi lii = new C6506lIi(new C6456l1ilL(new LlLI1(str), C6452l1Lll.OooO00o), bArr);
            iI11IL r92 = null;
            if (!this.f16826OooO00o.m15892OooO00o()) {
                r92 = this.f16826OooO00o.OooO00o();
            }
            LlLI1 llLI1 = this.f16827OooO00o;
            if (bigInteger != null) {
                new C6513lIiI(bigInteger);
                C5514IL r6 = this.OooO00o;
                return r9;
            }
            r9 = new C1LI1l(new C6816l1Ii(lii, llLI1, null, this.OooO00o, r92));
            return r9;
        }
        throw new IllegalArgumentException("No digest algorithm specified");
    }

    public void OooO00o(LlLI1 llLI1) {
        this.f16827OooO00o = llLI1;
    }

    public void OooO00o(LlLI1 llLI1, boolean z, AbstractC6854lLi1LL r4) throws TSPIOException {
        IL11iL.OooO00o(this.f16826OooO00o, llLI1, z, r4);
    }

    public void OooO00o(LlLI1 llLI1, boolean z, byte[] bArr) {
        this.f16826OooO00o.OooO00o(llLI1, z, bArr);
    }

    public void OooO00o(String str) {
        this.f16827OooO00o = new LlLI1(str);
    }

    public void OooO00o(String str, boolean z, AbstractC6854lLi1LL r3) throws IOException {
        OooO00o(str, z, r3.OooO0O0().getEncoded());
    }

    public void OooO00o(String str, boolean z, byte[] bArr) {
        this.f16826OooO00o.OooO00o(new LlLI1(str), z, bArr);
    }

    public void OooO00o(boolean z) {
        this.OooO00o = C5514IL.OooO00o(z);
    }
}
