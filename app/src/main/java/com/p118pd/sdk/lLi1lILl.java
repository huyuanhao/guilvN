package com.p118pd.sdk;

import java.security.spec.AlgorithmParameterSpec;

/* renamed from: com.pd.sdk.lLi1lILl */
public class lLi1lILl implements AlgorithmParameterSpec, AbstractC5161I11ill {
    public C9683lIi OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f18528OooO00o;
    public String OooO0O0;
    public String OooO0OO;

    public lLi1lILl(C9683lIi r1) {
        this.OooO00o = r1;
        this.OooO0O0 = AbstractC5331ILi.OooOOOo.m16387OooO0O0();
        this.OooO0OO = null;
    }

    public lLi1lILl(String str) {
        this(str, AbstractC5331ILi.OooOOOo.m16387OooO0O0(), null);
    }

    public lLi1lILl(String str, String str2) {
        this(str, str2, null);
    }

    public lLi1lILl(String str, String str2, String str3) {
        C1683Ll ll;
        try {
            ll = C5669LLl.OooO00o(new LlLI1(str));
        } catch (IllegalArgumentException unused) {
            LlLI1 OooO00o2 = C5669LLl.m16240OooO00o(str);
            if (OooO00o2 != null) {
                str = OooO00o2.m16387OooO0O0();
                ll = C5669LLl.OooO00o(OooO00o2);
            } else {
                ll = null;
            }
        }
        if (ll != null) {
            this.OooO00o = new C9683lIi(ll.m16352OooO0O0(), ll.m16353OooO0OO(), ll.OooO00o());
            this.f18528OooO00o = str;
            this.OooO0O0 = str2;
            this.OooO0OO = str3;
            return;
        }
        throw new IllegalArgumentException("no key parameter set for passed in name/OID.");
    }

    public static lLi1lILl OooO00o(C9574i1iIiI r3) {
        return r3.OooO0O0() != null ? new lLi1lILl(r3.OooO0OO().m16387OooO0O0(), r3.OooO00o().m16387OooO0O0(), r3.OooO0O0().m16387OooO0O0()) : new lLi1lILl(r3.OooO0OO().m16387OooO0O0(), r3.OooO00o().m16387OooO0O0());
    }

    @Override // com.p118pd.sdk.AbstractC5161I11ill, com.p118pd.sdk.AbstractC5161I11ill
    public C9683lIi OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5161I11ill, com.p118pd.sdk.AbstractC5161I11ill
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m17689OooO00o() {
        return this.f18528OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5161I11ill
    public String OooO0O0() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC5161I11ill
    public String OooO0OO() {
        return this.OooO0OO;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof lLi1lILl)) {
            return false;
        }
        lLi1lILl lli1lill = (lLi1lILl) obj;
        if (!this.OooO00o.equals(lli1lill.OooO00o) || !this.OooO0O0.equals(lli1lill.OooO0O0)) {
            return false;
        }
        String str = this.OooO0OO;
        String str2 = lli1lill.OooO0OO;
        return str == str2 || (str != null && str.equals(str2));
    }

    public int hashCode() {
        int hashCode = this.OooO00o.hashCode() ^ this.OooO0O0.hashCode();
        String str = this.OooO0OO;
        return hashCode ^ (str != null ? str.hashCode() : 0);
    }
}
