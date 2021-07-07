package com.p118pd.sdk;

import java.util.Date;

/* renamed from: com.pd.sdk.I1ILl1LL */
public class I1ILl1LL {
    public L1 OooO00o;

    public I1ILl1LL(L1 r1) {
        this.OooO00o = r1;
    }

    public int OooO00o() {
        return this.OooO00o.m15997OooO00o().m17647OooO0O0().intValue() + 1;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public iI11IL m15264OooO00o() {
        return this.OooO00o.m15996OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9613ii m15265OooO00o() {
        return new C9613ii(this.OooO00o.m15998OooO00o());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Date m15266OooO00o() {
        return C5787LlL1.OooO00o(this.OooO00o.m15999OooO00o());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5359IiLlL[] m15267OooO00o() {
        I11li1 OooO00o2 = this.OooO00o.OooO00o();
        int size = OooO00o2.size();
        C5359IiLlL[] iiLlLArr = new C5359IiLlL[size];
        for (int i = 0; i != size; i++) {
            iiLlLArr[i] = new C5359IiLlL(C6286iii.OooO00o(OooO00o2.OooO00o(i)));
        }
        return iiLlLArr;
    }
}
