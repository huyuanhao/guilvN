package com.p118pd.sdk;

import java.io.IOException;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.tls.TlsFatalAlert;

/* renamed from: com.pd.sdk.iilill1I */
public class iilill1I extends AbstractC6787lliL {
    public II1LLIl OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public L1Illl1i f17944OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iL1liI f17945OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6213iL11I f17946OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6827lIIi1I1 f17947OooO00o;

    public iilill1I(iL1liI il1lii, C6827lIIi1I1 r3, C6213iL11I r4) {
        this(il1lii, r3, r4, null);
    }

    public iilill1I(iL1liI il1lii, C6827lIIi1I1 r3, C6213iL11I r4, II1LLIl iI1LLIl) {
        L1Illl1i r0;
        if (r3 == null) {
            throw new IllegalArgumentException("'certificate' cannot be null");
        } else if (r3.m17955OooO00o()) {
            throw new IllegalArgumentException("'certificate' cannot be empty");
        } else if (r4 == null) {
            throw new IllegalArgumentException("'privateKey' cannot be null");
        } else if (!r4.OooO00o()) {
            throw new IllegalArgumentException("'privateKey' must be private");
        } else if (!L1LL1Ii.OooO0OO(il1lii) || iI1LLIl != null) {
            if (r4 instanceof liLI1l1i) {
                r0 = new C6191iLlLIl1();
            } else if (r4 instanceof C5907Ll1LI) {
                r0 = new C5302ILI();
            } else if (r4 instanceof C6512lIilLl) {
                r0 = new C6341il1();
            } else {
                throw new IllegalArgumentException("'privateKey' type not supported: " + r4.getClass().getName());
            }
            this.f17944OooO00o = r0;
            this.f17944OooO00o.OooO00o(il1lii);
            this.f17945OooO00o = il1lii;
            this.f17947OooO00o = r3;
            this.f17946OooO00o = r4;
            this.OooO00o = iI1LLIl;
        } else {
            throw new IllegalArgumentException("'signatureAndHashAlgorithm' cannot be null for (D)TLS 1.2+");
        }
    }

    @Override // com.p118pd.sdk.AbstractC5842L1, com.p118pd.sdk.ll1iiLI, com.p118pd.sdk.AbstractC6787lliL
    public II1LLIl OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5842L1, com.p118pd.sdk.ll1iiLI, com.p118pd.sdk.AbstractC6787lliL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6827lIIi1I1 m17302OooO00o() {
        return this.f17947OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5842L1
    public byte[] OooO00o(byte[] bArr) throws IOException {
        try {
            return L1LL1Ii.OooO0OO(this.f17945OooO00o) ? this.f17944OooO00o.OooO00o(this.OooO00o, this.f17946OooO00o, bArr) : this.f17944OooO00o.OooO00o(this.f17946OooO00o, bArr);
        } catch (CryptoException e) {
            throw new TlsFatalAlert(80, e);
        }
    }
}
