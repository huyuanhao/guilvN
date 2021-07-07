package com.p118pd.sdk;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.pd.sdk.ILIL */
public class ILIL {
    public I11li1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f15565OooO00o;
    public I11li1 OooO0O0;

    public ILIL(String str, Set<LlLI1> set) {
        this(str, set, null);
    }

    public ILIL(String str, Set<LlLI1> set, Set<LlLI1> set2) {
        this.f15565OooO00o = str;
        this.OooO00o = OooO00o(set);
        this.OooO0O0 = OooO00o(set2);
    }

    public ILIL(Set<LlLI1> set) {
        this(null, set, null);
    }

    public ILIL(byte[] bArr) {
        Enumeration OooO00o2 = I11li1.OooO00o((Object) bArr).m15236OooO00o();
        while (OooO00o2.hasMoreElements()) {
            AbstractC6854lLi1LL r0 = (AbstractC6854lLi1LL) OooO00o2.nextElement();
            if (r0 instanceof I11li1) {
                this.OooO00o = I11li1.OooO00o(r0);
            } else if (r0 instanceof AbstractC5903LlLLL) {
                this.OooO0O0 = I11li1.OooO00o((AbstractC5903LlLLL) r0, false);
            } else if (r0 instanceof LII) {
                this.f15565OooO00o = LII.OooO00o(r0).OooO00o();
            }
        }
    }

    private I11li1 OooO00o(Set<LlLI1> set) {
        if (set == null || set.isEmpty()) {
            return null;
        }
        iILLL1 r0 = new iILLL1();
        for (LlLI1 llLI1 : set) {
            r0.OooO00o(llLI1);
        }
        return new C5707LiL1(r0);
    }

    private Set<LlLI1> OooO00o(I11li1 i11li1) {
        if (i11li1 == null) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(i11li1.size());
        Enumeration OooO00o2 = i11li1.m15236OooO00o();
        while (OooO00o2.hasMoreElements()) {
            hashSet.add(LlLI1.OooO00o(OooO00o2.nextElement()));
        }
        return hashSet;
    }

    public I11li1 OooO00o() {
        iILLL1 r0 = new iILLL1();
        I11li1 i11li1 = this.OooO00o;
        if (i11li1 != null) {
            r0.OooO00o(i11li1);
        }
        if (this.OooO0O0 != null) {
            r0.OooO00o(new ILI1Ll(false, 0, this.OooO0O0));
        }
        String str = this.f15565OooO00o;
        if (str != null) {
            r0.OooO00o(new LII(str));
        }
        return new C5707LiL1(r0);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m15487OooO00o() {
        return this.f15565OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Set<LlLI1> m15488OooO00o() {
        return OooO00o(this.OooO0O0);
    }

    public Set<LlLI1> OooO0O0() {
        return OooO00o(this.OooO00o);
    }
}
