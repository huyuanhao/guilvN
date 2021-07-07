package com.p118pd.sdk;

import java.io.IOException;
import java.security.Provider;
import java.security.PublicKey;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.cert.crmf.CRMFException;

/* renamed from: com.pd.sdk.lii  reason: case insensitive filesystem */
public class C6683lii extends C9501LLll {
    public C5863LL1LI OooO00o;

    public C6683lii(C5309ILiL iLiL) {
        super(iLiL);
        this.OooO00o = new C5863LL1LI(new ILLli());
    }

    public C6683lii(C9501LLll r1) {
        this(r1.m21554OooO00o());
    }

    public C6683lii(byte[] bArr) {
        this(C5309ILiL.OooO00o(bArr));
    }

    public C6683lii OooO00o(String str) {
        this.OooO00o = new C5863LL1LI(new C9588iIi(str));
        return this;
    }

    public C6683lii OooO00o(Provider provider) {
        this.OooO00o = new C5863LL1LI(new LLIlii(provider));
        return this;
    }

    @Override // com.p118pd.sdk.C9501LLll, com.p118pd.sdk.C9501LLll, com.p118pd.sdk.C9501LLll, com.p118pd.sdk.C9501LLll
    public PublicKey OooO00o() throws CRMFException {
        C6888ll OooO00o2 = m21556OooO00o().m21564OooO00o();
        if (OooO00o2 != null) {
            return this.OooO00o.OooO00o(OooO00o2);
        }
        return null;
    }

    @Override // com.p118pd.sdk.C9501LLll, com.p118pd.sdk.C9501LLll, com.p118pd.sdk.C9501LLll, com.p118pd.sdk.C9501LLll
    /* renamed from: OooO00o  reason: collision with other method in class */
    public X500Principal m17759OooO00o() {
        l1LILI1 OooO0O0 = m21556OooO00o().m21567OooO0O0();
        if (OooO0O0 == null) {
            return null;
        }
        try {
            return new X500Principal(OooO0O0.OooO00o(AbstractC5533IiL.OooO00o));
        } catch (IOException e) {
            throw new IllegalStateException("unable to construct DER encoding of name: " + e.getMessage());
        }
    }
}
