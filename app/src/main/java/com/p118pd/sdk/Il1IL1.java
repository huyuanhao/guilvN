package com.p118pd.sdk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.cert.X509AttributeCertificateHolder;
import org.bouncycastle.cert.X509CRLHolder;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.Il1IL1丨  reason: invalid class name */
public class Il1IL1 {
    public static final String OooO = AbstractC9468L1lL.OooO0OO.m16387OooO0O0();
    public static final String OooO00o = AbstractC6252iiLl.OooO00o.m16387OooO0O0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Set f15783OooO00o = new HashSet();
    public static final String OooO0O0 = AbstractC9733l.OooO.m16387OooO0O0();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final Map f15784OooO0O0 = new HashMap();
    public static final String OooO0OO = AbstractC5905LllI.OooO0o.m16387OooO0O0();
    public static final String OooO0Oo = AbstractC5905LllI.OooO0OO.m16387OooO0O0();
    public static final String OooO0o = AbstractC5905LllI.OooO0o0.m16387OooO0O0();
    public static final String OooO0o0 = AbstractC5905LllI.OooO0Oo.m16387OooO0O0();
    public static final String OooO0oO = AbstractC5711LiLli.Oooooo0.m16387OooO0O0();
    public static final String OooO0oo = AbstractC5331ILi.OooO0O0.m16387OooO0O0();
    public static final String OooOO0 = AbstractC9468L1lL.OooO0O0.m16387OooO0O0();
    public static final String OooOO0O = AbstractC9468L1lL.OooO0Oo.m16387OooO0O0();
    public static final String OooOO0o = AbstractC5711LiLli.OooOoO0.m16387OooO0O0();
    public static final String OooOOO = AbstractC5420Il1iIL.o00O0o0.m16387OooO0O0();
    public static final String OooOOO0 = AbstractC5420Il1iIL.o00OoOoO.m16387OooO0O0();
    public static final String OooOOOO = AbstractC5711LiLli.Oooo00o.m16387OooO0O0();
    public static final String OooOOOo = AbstractC5331ILi.OooOO0o.m16387OooO0O0();
    public static final String OooOOo = LLiII.OooO0oO.m16387OooO0O0();
    public static final String OooOOo0 = AbstractC5331ILi.OooOOO0.m16387OooO0O0();
    public static final String OooOOoo = LLiII.OooO0oo.m16387OooO0O0();
    public static final String OooOo = AbstractC5420Il1iIL.o00O0oo0.m16387OooO0O0();
    public static final String OooOo0 = AbstractC5420Il1iIL.o00O0oO.m16387OooO0O0();
    public static final String OooOo00 = AbstractC5420Il1iIL.o00O0o0.m16387OooO0O0();
    public static final String OooOo0O = AbstractC5420Il1iIL.o00O0oOO.m16387OooO0O0();
    public static final String OooOo0o = AbstractC5420Il1iIL.o00O0oOo.m16387OooO0O0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public List f15785OooO00o = new ArrayList();

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map f15786OooO00o = new HashMap();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public List f15787OooO0O0 = new ArrayList();

    /* renamed from: OooO0OO  reason: collision with other field name */
    public List f15788OooO0OO = new ArrayList();

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public List f15789OooO0Oo = new ArrayList();

    static {
        f15783OooO00o.add(OooOOO0);
        f15783OooO00o.add(OooOOO);
        f15783OooO00o.add(OooOo00);
        f15783OooO00o.add(OooOo0);
        f15783OooO00o.add(OooOo0O);
        f15783OooO00o.add(OooOo0o);
        f15783OooO00o.add(OooOo);
        f15784OooO0O0.put(OooO0O0, OooOo00);
        f15784OooO0O0.put(OooO0OO, OooOo0);
        f15784OooO0O0.put(OooO0Oo, OooOo0O);
        f15784OooO0O0.put(OooO0o0, OooOo0o);
        f15784OooO0O0.put(OooO0o, OooOo);
    }

    public Map OooO00o() {
        return new HashMap(this.f15786OooO00o);
    }

    public Map OooO00o(LlLI1 llLI1, C6456l1ilL r4, byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put(AbstractC9852lIli.OooO00o, llLI1);
        hashMap.put(AbstractC9852lIli.OooO0Oo, r4);
        hashMap.put(AbstractC9852lIli.OooO0O0, C9586iIILl.m21630OooO00o(bArr));
        return hashMap;
    }

    public void OooO00o(L1L1ll r3) {
        for (C5510IIl r1 : r3.OooO00o()) {
            this.f15788OooO0OO.add(r1);
        }
    }

    public void OooO00o(LlLI1 llLI1, AbstractC6271iilI iili) {
        this.f15787OooO0O0.addAll(C5799LllI.OooO00o(llLI1, iili));
    }

    public void OooO00o(LlLI1 llLI1, AbstractC6854lLi1LL r5) {
        this.f15787OooO0O0.add(new ILI1Ll(false, 1, new C9732ll(llLI1, r5)));
    }

    public void OooO00o(C6248iiLLi iilli) {
        this.f15789OooO0Oo.add(iilli);
    }

    public void OooO00o(AbstractC6271iilI iili) throws CMSException {
        this.f15785OooO00o.addAll(C5799LllI.OooO00o(iili));
    }

    public void OooO00o(X509AttributeCertificateHolder x509AttributeCertificateHolder) throws CMSException {
        this.f15785OooO00o.add(new ILI1Ll(false, 2, x509AttributeCertificateHolder.toASN1Structure()));
    }

    public void OooO00o(X509CRLHolder x509CRLHolder) {
        this.f15787OooO0O0.add(x509CRLHolder.toASN1Structure());
    }

    public void OooO00o(X509CertificateHolder x509CertificateHolder) throws CMSException {
        this.f15785OooO00o.add(x509CertificateHolder.toASN1Structure());
    }

    public void OooO0O0(AbstractC6271iilI iili) throws CMSException {
        this.f15787OooO0O0.addAll(C5799LllI.OooO0O0(iili));
    }

    public void OooO0OO(AbstractC6271iilI iili) throws CMSException {
        this.f15785OooO00o.addAll(C5799LllI.OooO0OO(iili));
    }
}
