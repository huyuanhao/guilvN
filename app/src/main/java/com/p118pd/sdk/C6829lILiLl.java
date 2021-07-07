package com.p118pd.sdk;

import org.bouncycastle.cert.crmf.CRMFException;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.l丨ILiL丨l  reason: invalid class name and case insensitive filesystem */
public class C6829lILiLl implements AbstractC5503II11L {
    public static final int OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final LlLI1 f18878OooO00o = LLIl11l.OooO0oO;
    public static final int OooO0O0 = 1;
    public static final int OooO0OO = 2;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LIL f18879OooO00o;

    public C6829lILiLl(LIL lil) {
        this.f18879OooO00o = lil;
    }

    @Override // com.p118pd.sdk.AbstractC5503II11L, com.p118pd.sdk.AbstractC5503II11L
    public int OooO00o() {
        return this.f18879OooO00o.OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC5503II11L, com.p118pd.sdk.AbstractC5503II11L
    /* renamed from: OooO00o  reason: collision with other method in class */
    public LlLI1 m17959OooO00o() {
        return f18878OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5503II11L, com.p118pd.sdk.AbstractC5503II11L
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6636li1I m17960OooO00o() throws CRMFException {
        try {
            return new C6636li1I(new C5753LiI1(AbstractC6252iiLl.OooO0OO, Ii1I1LlI.OooO00o(ii1IlLLL.OooO00o(this.f18879OooO00o.m16041OooO0O0()).m17229OooO0O0())));
        } catch (CMSException e) {
            throw new CRMFException("CMS parsing error: " + e.getMessage(), e.getCause());
        } catch (Exception e2) {
            throw new CRMFException("CRMF parsing error: " + e2.getMessage(), e2);
        }
    }

    @Override // com.p118pd.sdk.AbstractC5503II11L, com.p118pd.sdk.AbstractC5503II11L
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6854lLi1LL m17961OooO00o() {
        return this.f18879OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5503II11L, com.p118pd.sdk.AbstractC5503II11L
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17962OooO00o() {
        return !ii1IlLLL.OooO00o(this.f18879OooO00o.m16041OooO0O0()).OooO00o();
    }
}
