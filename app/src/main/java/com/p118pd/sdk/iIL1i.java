package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pd.sdk.iIL1i */
public class iIL1i {
    public l1LILI1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6888ll f17507OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List f17508OooO00o = new ArrayList();

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f17509OooO00o = false;

    public iIL1i(iIL1i iil1i) {
        this.f17507OooO00o = iil1i.f17507OooO00o;
        this.OooO00o = iil1i.OooO00o;
        this.f17509OooO00o = iil1i.f17509OooO00o;
        this.f17508OooO00o = new ArrayList(iil1i.f17508OooO00o);
    }

    public iIL1i(l1LILI1 r2, C6888ll r3) {
        this.OooO00o = r2;
        this.f17507OooO00o = r3;
    }

    public iIL1i OooO00o(LlLI1 llLI1, AbstractC6854lLi1LL r5) {
        this.f17508OooO00o.add(new LIIi(llLI1, new i1I1I1l(r5)));
        return this;
    }

    public iIL1i OooO00o(LlLI1 llLI1, AbstractC6854lLi1LL[] r5) {
        this.f17508OooO00o.add(new LIIi(llLI1, new i1I1I1l(r5)));
        return this;
    }

    public iIL1i OooO00o(boolean z) {
        this.f17509OooO00o = z;
        return this;
    }

    public l1ili1 OooO00o(Lii1ii1 r6) {
        L1IIlli l1IIlli;
        if (this.f17508OooO00o.isEmpty()) {
            l1IIlli = this.f17509OooO00o ? new L1IIlli(this.OooO00o, this.f17507OooO00o, (I11L) null) : new L1IIlli(this.OooO00o, this.f17507OooO00o, new i1I1I1l());
        } else {
            iILLL1 r0 = new iILLL1();
            for (Object obj : this.f17508OooO00o) {
                r0.OooO00o(LIIi.OooO00o(obj));
            }
            l1IIlli = new L1IIlli(this.OooO00o, this.f17507OooO00o, new i1I1I1l(r0));
        }
        try {
            OutputStream OooO00o2 = r6.m16310OooO00o();
            OooO00o2.write(l1IIlli.OooO00o(AbstractC5533IiL.OooO00o));
            OooO00o2.close();
            return new l1ili1(new C9764Il1(l1IIlli, r6.OooO00o(), new iIilII1(r6.getSignature())));
        } catch (IOException unused) {
            throw new IllegalStateException("cannot produce certification request signature");
        }
    }

    public iIL1i OooO0O0(LlLI1 llLI1, AbstractC6854lLi1LL r4) {
        for (LIIi r1 : this.f17508OooO00o) {
            if (r1.m16037OooO00o().equals(llLI1)) {
                throw new IllegalStateException("Attribute " + llLI1.toString() + " is already set");
            }
        }
        OooO00o(llLI1, r4);
        return this;
    }

    public iIL1i OooO0O0(LlLI1 llLI1, AbstractC6854lLi1LL[] r4) {
        for (LIIi r1 : this.f17508OooO00o) {
            if (r1.m16037OooO00o().equals(llLI1)) {
                throw new IllegalStateException("Attribute " + llLI1.toString() + " is already set");
            }
        }
        OooO00o(llLI1, r4);
        return this;
    }
}
