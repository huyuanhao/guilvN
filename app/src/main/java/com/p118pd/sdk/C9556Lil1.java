package com.p118pd.sdk;

import com.p118pd.sdk.C5786LlL;
import java.security.SecureRandom;

/* renamed from: com.pd.sdk.丨L丨il1  reason: invalid class name and case insensitive filesystem */
public class C9556Lil1 implements AbstractC5599L1Ii {
    public static final String OooO00o = "1.3.6.1.4.1.8301.3.1.3.4.1";

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f23135OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ILL11 f23136OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f23137OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f23138OooO00o = false;
    public int OooO0O0;
    public int OooO0OO;
    public int OooO0Oo;

    @Override // com.p118pd.sdk.AbstractC5599L1Ii
    private void OooO00o() {
        OooO0O0(new ILL11(IIllii.OooO00o(), new C9383Iiill()));
    }

    private i1LLl1L OooO0O0() {
        if (!this.f23138OooO00o) {
            OooO00o();
        }
        Ll111 ll111 = new Ll111(this.f23135OooO00o, this.OooO0Oo);
        C5585L1L r5 = new C5585L1L(ll111, this.OooO0OO, 'I', this.f23137OooO00o);
        new ILI1i(ll111, r5).m15484OooO00o();
        C5786LlL.OooO00o OooO00o2 = C5786LlL.OooO00o(C5786LlL.OooO00o(ll111, r5), this.f23137OooO00o);
        llILLI1 OooO0O02 = OooO00o2.OooO0O0();
        C6051i1lli OooO00o3 = OooO00o2.OooO00o();
        llILLI1 r0 = (llILLI1) OooO0O02.OooO0O0();
        llILLI1 OooO00o4 = r0.m17857OooO00o();
        int OooO0O03 = r0.OooO0O0();
        llILLI1[] OooO00o5 = llILLI1.m17855OooO00o(OooO0O03, this.f23137OooO00o);
        C6051i1lli i1lli = new C6051i1lli(this.OooO0O0, this.f23137OooO00o);
        return new i1LLl1L((C6213iL11I) new i1iILI(this.OooO0O0, this.OooO0OO, (llILLI1) ((llILLI1) OooO00o5[0].OooO00o(OooO00o4)).OooO00o(i1lli)), (C6213iL11I) new LIi1L1(this.OooO0O0, OooO0O03, ll111, r5, OooO00o3, i1lli, OooO00o5[1]));
    }

    private void OooO0O0(C6470l1i r1) {
        this.f23136OooO00o = (ILL11) r1;
        this.f23137OooO00o = IIllii.OooO00o();
        this.f23135OooO00o = this.f23136OooO00o.OooO00o().OooO0O0();
        this.OooO0O0 = this.f23136OooO00o.OooO00o().OooO0OO();
        this.OooO0OO = this.f23136OooO00o.OooO00o().OooO0Oo();
        this.OooO0Oo = this.f23136OooO00o.OooO00o().OooO00o();
        this.f23138OooO00o = true;
    }

    @Override // com.p118pd.sdk.AbstractC5599L1Ii
    /* renamed from: OooO00o  reason: collision with other method in class */
    public i1LLl1L m21609OooO00o() {
        return OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC5599L1Ii
    public void OooO00o(C6470l1i r1) {
        OooO0O0(r1);
    }
}
