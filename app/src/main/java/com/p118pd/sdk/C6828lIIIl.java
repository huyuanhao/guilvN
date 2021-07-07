package com.p118pd.sdk;

import java.util.Enumeration;
import java.util.Vector;

/* renamed from: com.pd.sdk.l丨II丨Il  reason: invalid class name and case insensitive filesystem */
public class C6828lIIIl extends AbstractC5738Lil {
    public static final int o0ooOO0 = 1;
    public static final int o0ooOOo = 2;
    public static final int o0ooOoO = 3;
    public C5845LIillll OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Vector f18877OooO00o = new Vector();
    public int o00oO0O = -1;

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0040  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C6828lIIIl(com.p118pd.sdk.I11li1 r6) {
        /*
        // Method dump skipped, instructions count: 146
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C6828lIIIl.<init>(com.pd.sdk.I11li1):void");
    }

    public static C6828lIIIl OooO00o(Object obj) {
        if (obj instanceof C6828lIIIl) {
            return (C6828lIIIl) obj;
        }
        if (obj != null) {
            return new C6828lIIIl(I11li1.OooO00o(obj));
        }
        return null;
    }

    public C5845LIillll OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Object[] m17957OooO00o() {
        int i = 0;
        if (OooO0O0() == 1) {
            int size = this.f18877OooO00o.size();
            AbstractC6804llL1ii[] r2 = new AbstractC6804llL1ii[size];
            while (i != size) {
                r2[i] = (AbstractC6804llL1ii) this.f18877OooO00o.elementAt(i);
                i++;
            }
            return r2;
        } else if (OooO0O0() == 2) {
            int size2 = this.f18877OooO00o.size();
            LlLI1[] llLI1Arr = new LlLI1[size2];
            while (i != size2) {
                llLI1Arr[i] = (LlLI1) this.f18877OooO00o.elementAt(i);
                i++;
            }
            return llLI1Arr;
        } else {
            int size3 = this.f18877OooO00o.size();
            LII[] liiArr = new LII[size3];
            while (i != size3) {
                liiArr[i] = (LII) this.f18877OooO00o.elementAt(i);
                i++;
            }
            return liiArr;
        }
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        return this.o00oO0O;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m17958OooO0O0() {
        iILLL1 r0 = new iILLL1();
        if (this.OooO00o != null) {
            r0.OooO00o(new ILI1Ll(0, this.OooO00o));
        }
        iILLL1 r1 = new iILLL1();
        Enumeration elements = this.f18877OooO00o.elements();
        while (elements.hasMoreElements()) {
            r1.OooO00o((AbstractC6854lLi1LL) elements.nextElement());
        }
        r0.OooO00o(new C5707LiL1(r1));
        return new C5707LiL1(r0);
    }
}
