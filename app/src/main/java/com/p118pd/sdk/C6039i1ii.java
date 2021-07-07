package com.p118pd.sdk;

import com.umeng.message.proguard.C3848l;

/* renamed from: com.pd.sdk.i1ii丨  reason: invalid class name and case insensitive filesystem */
public class C6039i1ii extends AbstractC5738Lil {
    public C9445Ii1[] OooO00o;

    public C6039i1ii(I11li1 i11li1) {
        if (i11li1.size() >= 1) {
            this.OooO00o = new C9445Ii1[i11li1.size()];
            for (int i = 0; i != i11li1.size(); i++) {
                this.OooO00o[i] = C9445Ii1.OooO00o(i11li1.OooO00o(i));
            }
            return;
        }
        throw new IllegalArgumentException("sequence may not be empty");
    }

    public C6039i1ii(LlLI1 llLI1, ILI ili) {
        this(new C9445Ii1(llLI1, ili));
    }

    public C6039i1ii(C9445Ii1 r3) {
        this(new C9445Ii1[]{r3});
    }

    public C6039i1ii(C9445Ii1[] r4) {
        C9445Ii1[] r0 = new C9445Ii1[r4.length];
        this.OooO00o = r0;
        System.arraycopy(r4, 0, r0, 0, r4.length);
    }

    public static C6039i1ii OooO00o(iI11IL r1) {
        return OooO00o(r1.m17472OooO00o(C5237III.o00o00o));
    }

    public static C6039i1ii OooO00o(Object obj) {
        if (obj instanceof C6039i1ii) {
            return (C6039i1ii) obj;
        }
        if (obj != null) {
            return new C6039i1ii(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C9445Ii1[] OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        int i = 0;
        while (true) {
            C9445Ii1[] r2 = this.OooO00o;
            if (i == r2.length) {
                return new C5707LiL1(r0);
            }
            r0.OooO00o(r2[i]);
            i++;
        }
    }

    public String toString() {
        return "AuthorityInformationAccess: Oid(" + this.OooO00o[0].m21484OooO00o().m16387OooO0O0() + C3848l.f10402t;
    }
}
