package com.p118pd.sdk;

import java.security.AlgorithmParameters;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.SecureRandom;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.I1LiLiI */
public class I1LiLiI {
    public LIlL OooO00o = new LIlL(new C6858liI());

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f15349OooO00o;

    public I1LiLiI OooO00o(String str) {
        this.OooO00o = new LIlL(new C6224ii11l(str));
        return this;
    }

    public I1LiLiI OooO00o(Provider provider) {
        this.OooO00o = new LIlL(new C9443ILiII(provider));
        return this;
    }

    public AlgorithmParameters OooO00o(C6456l1ilL r3) throws CMSException {
        if (r3.m17587OooO0O0() == null) {
            return null;
        }
        try {
            AlgorithmParameters OooO00o2 = this.OooO00o.m16119OooO00o(r3.OooO00o());
            C5334IL1.OooO00o(OooO00o2, r3.m17587OooO0O0());
            return OooO00o2;
        } catch (NoSuchAlgorithmException e) {
            throw new CMSException("can't find parameters for algorithm", e);
        } catch (NoSuchProviderException e2) {
            throw new CMSException("can't find provider for algorithm", e2);
        }
    }
}
