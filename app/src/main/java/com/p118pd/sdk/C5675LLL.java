package com.p118pd.sdk;

import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.LL丨L  reason: invalid class name and case insensitive filesystem */
public class C5675LLL extends lI11L1I1 {
    public LIlL OooO00o = new LIlL(new C6858liI());

    public C5675LLL(LlLI1 llLI1, char[] cArr) {
        super(llLI1, cArr);
    }

    public C5675LLL OooO00o(String str) {
        this.OooO00o = new LIlL(new C6224ii11l(str));
        return this;
    }

    public C5675LLL OooO00o(Provider provider) {
        this.OooO00o = new LIlL(new C9443ILiII(provider));
        return this;
    }

    @Override // com.p118pd.sdk.lI11L1I1
    public byte[] OooO00o(int i, C6456l1ilL r4, int i2) throws CMSException {
        return this.OooO00o.OooO00o(i, ((lI11L1I1) this).f18320OooO00o, r4, i2);
    }

    @Override // com.p118pd.sdk.lI11L1I1
    public byte[] OooO00o(C6456l1ilL r5, byte[] bArr, LIiI11 r7) throws CMSException {
        Key OooO00o2 = this.OooO00o.OooO00o(r7);
        Cipher OooO0O0 = this.OooO00o.OooO0O0(r5.OooO00o());
        try {
            OooO0O0.init(3, new SecretKeySpec(bArr, OooO0O0.getAlgorithm()), new IvParameterSpec(AbstractC6804llL1ii.OooO00o(r5.m17587OooO0O0()).m17938OooO00o()));
            return OooO0O0.wrap(OooO00o2);
        } catch (GeneralSecurityException e) {
            throw new CMSException("cannot process content encryption key: " + e.getMessage(), e);
        }
    }
}
