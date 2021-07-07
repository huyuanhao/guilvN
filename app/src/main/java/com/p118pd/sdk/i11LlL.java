package com.p118pd.sdk;

import java.security.Key;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.operator.OperatorException;

/* renamed from: com.pd.sdk.i11Ll丨L  reason: invalid class name */
public abstract class i11LlL implements AbstractC6520lIlLi {
    public LIlL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public PrivateKey f17331OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map f17332OooO00o = new HashMap();

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f17333OooO00o = false;
    public LIlL OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f17334OooO0O0;

    public i11LlL(PrivateKey privateKey) {
        LIlL lIlL = new LIlL(new C6858liI());
        this.OooO00o = lIlL;
        this.OooO0O0 = lIlL;
        this.f17331OooO00o = privateKey;
    }

    public i11LlL OooO00o(LlLI1 llLI1, String str) {
        this.f17332OooO00o.put(llLI1, str);
        return this;
    }

    public i11LlL OooO00o(String str) {
        this.OooO0O0 = C5334IL1.OooO00o(str);
        return this;
    }

    public i11LlL OooO00o(Provider provider) {
        this.OooO0O0 = C5334IL1.OooO00o(provider);
        return this;
    }

    public i11LlL OooO00o(boolean z) {
        this.f17333OooO00o = z;
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC6520lIlLi
    public Key OooO00o(C6456l1ilL r7, C6456l1ilL r8, byte[] bArr) throws CMSException {
        if (C5334IL1.OooO0O0(r7.OooO00o())) {
            try {
                C6187iLl OooO00o2 = C6187iLl.OooO00o(bArr);
                C6311ilILI OooO00o3 = OooO00o2.OooO00o();
                PublicKey generatePublic = this.OooO00o.m16120OooO00o(r7.OooO00o()).generatePublic(new X509EncodedKeySpec(OooO00o3.m17351OooO00o().getEncoded()));
                KeyAgreement OooO00o4 = this.OooO00o.m16123OooO00o(r7.OooO00o());
                OooO00o4.init(this.f17331OooO00o, new C6350illI1i(OooO00o3.m17352OooO00o()));
                OooO00o4.doPhase(generatePublic, true);
                SecretKey generateSecret = OooO00o4.generateSecret(AbstractC5331ILi.OooO0o0.m16387OooO0O0());
                Cipher OooO00o5 = this.OooO00o.m16122OooO00o(AbstractC5331ILi.OooO0o0);
                OooO00o5.init(4, generateSecret, new C5621LILiI(OooO00o3.OooO00o(), OooO00o3.m17352OooO00o()));
                C6702lili OooO00o6 = OooO00o2.m17148OooO00o();
                return OooO00o5.unwrap(C9586iIILl.m21645OooO0O0(OooO00o6.OooO00o(), OooO00o6.m17792OooO0O0()), this.OooO00o.OooO00o(r8.OooO00o()), 3);
            } catch (Exception e) {
                throw new CMSException("exception unwrapping key: " + e.getMessage(), e);
            }
        } else {
            iLLl1I OooO00o7 = this.OooO00o.OooO00o(r7, this.f17331OooO00o).OooO00o(this.f17334OooO0O0);
            if (!this.f17332OooO00o.isEmpty()) {
                for (LlLI1 llLI1 : this.f17332OooO00o.keySet()) {
                    OooO00o7.OooO00o(llLI1, (String) this.f17332OooO00o.get(llLI1));
                }
            }
            try {
                Key OooO00o8 = this.OooO00o.OooO00o(r8.OooO00o(), OooO00o7.OooO00o(r8, bArr));
                if (this.f17333OooO00o) {
                    this.OooO00o.OooO00o(r8, OooO00o8);
                }
                return OooO00o8;
            } catch (OperatorException e2) {
                throw new CMSException("exception unwrapping key: " + e2.getMessage(), e2);
            }
        }
    }

    public i11LlL OooO0O0(String str) {
        LIlL lIlL = new LIlL(new C6224ii11l(str));
        this.OooO00o = lIlL;
        this.OooO0O0 = lIlL;
        return this;
    }

    public i11LlL OooO0O0(Provider provider) {
        LIlL lIlL = new LIlL(new C9443ILiII(provider));
        this.OooO00o = lIlL;
        this.OooO0O0 = lIlL;
        return this;
    }

    public i11LlL OooO0O0(boolean z) {
        this.f17334OooO0O0 = z;
        return this;
    }
}
