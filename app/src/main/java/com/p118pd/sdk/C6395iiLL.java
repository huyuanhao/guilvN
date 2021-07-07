package com.p118pd.sdk;

import com.p118pd.sdk.C93211ll;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.util.Collection;
import org.bouncycastle.x509.NoSuchStoreException;

/* renamed from: com.pd.sdk.i丨iLL  reason: invalid class name and case insensitive filesystem */
public class C6395iiLL implements AbstractC6271iilI {
    public LIiL11 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Provider f18203OooO00o;

    public C6395iiLL(Provider provider, LIiL11 lIiL11) {
        this.f18203OooO00o = provider;
        this.OooO00o = lIiL11;
    }

    public static C6395iiLL OooO00o(C93211ll.OooO00o oooO00o, IIllL1L r2) {
        LIiL11 lIiL11 = (LIiL11) oooO00o.OooO00o();
        lIiL11.OooO00o(r2);
        return new C6395iiLL(oooO00o.m21357OooO00o(), lIiL11);
    }

    public static C6395iiLL OooO00o(String str, IIllL1L r2) throws NoSuchStoreException {
        try {
            return OooO00o(C93211ll.OooO00o("X509Store", str), r2);
        } catch (NoSuchAlgorithmException e) {
            throw new NoSuchStoreException(e.getMessage());
        }
    }

    public static C6395iiLL OooO00o(String str, IIllL1L r1, String str2) throws NoSuchStoreException, NoSuchProviderException {
        return OooO00o(str, r1, C93211ll.m21354OooO00o(str2));
    }

    public static C6395iiLL OooO00o(String str, IIllL1L r2, Provider provider) throws NoSuchStoreException {
        try {
            return OooO00o(C93211ll.OooO00o("X509Store", str, provider), r2);
        } catch (NoSuchAlgorithmException e) {
            throw new NoSuchStoreException(e.getMessage());
        }
    }

    public Provider OooO00o() {
        return this.f18203OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6271iilI
    public Collection OooO00o(AbstractC6317ilLi illi) {
        return this.OooO00o.OooO00o(illi);
    }
}
