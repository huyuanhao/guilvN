package com.p118pd.sdk;

import java.util.Date;
import java.util.List;
import java.util.Set;

/* renamed from: com.pd.sdk.IiLlL  reason: case insensitive filesystem */
public class C5359IiLlL {
    public C6286iii OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iI11IL f15725OooO00o;

    public C5359IiLlL(C6286iii r1) {
        this.OooO00o = r1;
        this.f15725OooO00o = r1.m17309OooO00o();
    }

    public C5237III OooO00o(LlLI1 llLI1) {
        iI11IL r0 = this.f15725OooO00o;
        if (r0 != null) {
            return r0.OooO00o(llLI1);
        }
        return null;
    }

    public AbstractC6294il1LI OooO00o() {
        C9450IL1L OooO00o2 = this.OooO00o.m17310OooO00o();
        if (OooO00o2.OooO00o() == 0) {
            return null;
        }
        return OooO00o2.OooO00o() == 1 ? new LIil1ii(LIiLLLiL.OooO00o(OooO00o2.m21497OooO0O0())) : new C6409ilIl();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6390ii1 m15597OooO00o() {
        return new C6390ii1(this.OooO00o.OooO00o());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Date m15598OooO00o() {
        if (this.OooO00o.m17311OooO00o() == null) {
            return null;
        }
        return C5787LlL1.OooO00o(this.OooO00o.m17311OooO00o());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public List m15599OooO00o() {
        return C5787LlL1.OooO00o(this.f15725OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Set m15600OooO00o() {
        return C5787LlL1.m16383OooO00o(this.f15725OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m15601OooO00o() {
        return this.f15725OooO00o != null;
    }

    public Date OooO0O0() {
        return C5787LlL1.OooO00o(this.OooO00o.m17312OooO0O0());
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public Set m15602OooO0O0() {
        return C5787LlL1.OooO0O0(this.f15725OooO00o);
    }
}
