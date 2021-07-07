package com.p118pd.sdk;

import com.p118pd.sdk.C6782lli11;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.Set;

/* renamed from: com.pd.sdk.IIl丨  reason: invalid class name and case insensitive filesystem */
public class C5235IIl {
    public C5845LIillll OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6782lli11.OooO0O0 f15518OooO00o;

    public C5235IIl(C6782lli11.OooO0O0 oooO0O0, boolean z, C5845LIillll r3) {
        C5237III OooO00o2;
        this.f15518OooO00o = oooO0O0;
        this.OooO00o = r3;
        if (z && oooO0O0.m17911OooO00o() && (OooO00o2 = oooO0O0.m17909OooO00o().OooO00o(C5237III.o00Ooooo)) != null) {
            this.OooO00o = C5845LIillll.OooO00o(OooO00o2.m15435OooO0O0());
        }
    }

    public C5237III OooO00o(LlLI1 llLI1) {
        iI11IL OooO00o2 = this.f15518OooO00o.m17909OooO00o();
        if (OooO00o2 != null) {
            return OooO00o2.OooO00o(llLI1);
        }
        return null;
    }

    public C5845LIillll OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public iI11IL m15424OooO00o() {
        return this.f15518OooO00o.m17909OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public BigInteger m15425OooO00o() {
        return this.f15518OooO00o.m17910OooO00o().m17647OooO0O0();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Date m15426OooO00o() {
        return this.f15518OooO00o.OooO00o().OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public List m15427OooO00o() {
        return lIil1IL.OooO00o(this.f15518OooO00o.m17909OooO00o());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Set m15428OooO00o() {
        return lIil1IL.m17645OooO00o(this.f15518OooO00o.m17909OooO00o());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m15429OooO00o() {
        return this.f15518OooO00o.m17911OooO00o();
    }

    public Set OooO0O0() {
        return lIil1IL.OooO0O0(this.f15518OooO00o.m17909OooO00o());
    }
}
