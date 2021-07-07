package com.p118pd.sdk;

import com.p118pd.sdk.C5786LlL;
import java.security.SecureRandom;

/* renamed from: com.pd.sdk.iliiL丨i  reason: invalid class name */
public class iliiLi implements AbstractC5599L1Ii {
    public static final String OooO00o = "1.3.6.1.4.1.8301.3.1.3.4.2";

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f18049OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5197IIIi f18050OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f18051OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f18052OooO00o = false;
    public int OooO0O0;
    public int OooO0OO;
    public int OooO0Oo;

    @Override // com.p118pd.sdk.AbstractC5599L1Ii
    private void OooO00o() {
        OooO00o(new C5197IIIi(IIllii.OooO00o(), new C9382Iii()));
    }

    @Override // com.p118pd.sdk.AbstractC5599L1Ii
    /* renamed from: OooO00o  reason: collision with other method in class */
    public i1LLl1L m17386OooO00o() {
        if (!this.f18052OooO00o) {
            OooO00o();
        }
        Ll111 ll111 = new Ll111(this.f18049OooO00o, this.OooO0Oo);
        C5585L1L r5 = new C5585L1L(ll111, this.OooO0OO, 'I', this.f18051OooO00o);
        C5786LlL.OooO00o OooO00o2 = C5786LlL.OooO00o(C5786LlL.OooO00o(ll111, r5), this.f18051OooO00o);
        llILLI1 OooO0O02 = OooO00o2.OooO0O0();
        C6051i1lli OooO00o3 = OooO00o2.OooO00o();
        llILLI1 r0 = (llILLI1) OooO0O02.OooO0O0();
        return new i1LLl1L((C6213iL11I) new C93221(this.OooO0O0, this.OooO0OO, r0, this.f18050OooO00o.OooO00o().OooO00o()), (C6213iL11I) new C9844iLi(this.OooO0O0, r0.OooO0O0(), ll111, r5, OooO00o3, this.f18050OooO00o.OooO00o().OooO00o()));
    }

    @Override // com.p118pd.sdk.AbstractC5599L1Ii
    public void OooO00o(C6470l1i r1) {
        this.f18050OooO00o = (C5197IIIi) r1;
        this.f18051OooO00o = IIllii.OooO00o();
        this.f18049OooO00o = this.f18050OooO00o.OooO00o().OooO0O0();
        this.OooO0O0 = this.f18050OooO00o.OooO00o().OooO0OO();
        this.OooO0OO = this.f18050OooO00o.OooO00o().OooO0Oo();
        this.OooO0Oo = this.f18050OooO00o.OooO00o().OooO00o();
        this.f18052OooO00o = true;
    }
}
