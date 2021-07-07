package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨丨丨  reason: contains not printable characters */
public class C4983 {
    public AbstractC6092iILIii OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6593lLi f23480OooO00o;

    public C4983(C6593lLi lli) {
        this(lli, new C6056i1I());
    }

    public C4983(C6593lLi lli, AbstractC6092iILIii r2) {
        this.OooO00o = r2;
        this.f23480OooO00o = lli;
    }

    public C6593lLi OooO00o() {
        return this.f23480OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5814LlilI[] m21950OooO00o() {
        LLlIiil[] OooO00o2 = this.f23480OooO00o.OooO00o();
        int length = OooO00o2.length;
        C5814LlilI[] r2 = new C5814LlilI[length];
        for (int i = 0; i != length; i++) {
            r2[i] = new C5814LlilI(this.OooO00o, OooO00o2[i]);
        }
        return r2;
    }
}
