package com.p118pd.sdk;

import java.util.Enumeration;

/* renamed from: com.pd.sdk.丨1IlI丨丨  reason: invalid class name and case insensitive filesystem */
public class C93001IlI extends AbstractC5738Lil {
    public I11li1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LL111l f22761OooO00o;
    public I11li1 OooO0O0;

    public C93001IlI(I11li1 i11li1) {
        if (i11li1.size() <= 3) {
            Enumeration OooO00o2 = i11li1.m15236OooO00o();
            while (OooO00o2.hasMoreElements()) {
                AbstractC5903LlLLL r0 = (AbstractC5903LlLLL) OooO00o2.nextElement();
                int OooO00o3 = r0.OooO00o();
                if (OooO00o3 == 0) {
                    I11li1 i11li12 = (I11li1) r0.OooO0o();
                    Enumeration OooO00o4 = i11li12.m15236OooO00o();
                    while (OooO00o4.hasMoreElements()) {
                        C5190I1lIiL.OooO00o(OooO00o4.nextElement());
                    }
                    this.OooO00o = i11li12;
                } else if (OooO00o3 == 1) {
                    I11li1 i11li13 = (I11li1) r0.OooO0o();
                    Enumeration OooO00o5 = i11li13.m15236OooO00o();
                    while (OooO00o5.hasMoreElements()) {
                        I1IL.OooO00o(OooO00o5.nextElement());
                    }
                    this.OooO0O0 = i11li13;
                } else if (OooO00o3 == 2) {
                    this.f22761OooO00o = LL111l.OooO00o(r0.OooO0o());
                } else {
                    throw new IllegalArgumentException("invalid tag: " + r0.OooO00o());
                }
            }
            return;
        }
        throw new IllegalArgumentException("Bad sequence size: " + i11li1.size());
    }

    public C93001IlI(C5190I1lIiL[] r2, I1IL[] i1ilArr, LL111l r4) {
        if (r2 != null) {
            this.OooO00o = new C5707LiL1(r2);
        }
        if (i1ilArr != null) {
            this.OooO0O0 = new C5707LiL1(i1ilArr);
        }
        this.f22761OooO00o = r4;
    }

    public static C93001IlI OooO00o(Object obj) {
        if (obj instanceof C93001IlI) {
            return (C93001IlI) obj;
        }
        if (obj != null) {
            return new C93001IlI(I11li1.OooO00o(obj));
        }
        return null;
    }

    public LL111l OooO00o() {
        return this.f22761OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public I1IL[] m21294OooO00o() {
        I11li1 i11li1 = this.OooO0O0;
        if (i11li1 == null) {
            return new I1IL[0];
        }
        int size = i11li1.size();
        I1IL[] i1ilArr = new I1IL[size];
        for (int i = 0; i < size; i++) {
            i1ilArr[i] = I1IL.OooO00o(this.OooO0O0.OooO00o(i));
        }
        return i1ilArr;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5190I1lIiL[] m21295OooO00o() {
        I11li1 i11li1 = this.OooO00o;
        if (i11li1 == null) {
            return new C5190I1lIiL[0];
        }
        int size = i11li1.size();
        C5190I1lIiL[] r2 = new C5190I1lIiL[size];
        for (int i = 0; i < size; i++) {
            r2[i] = C5190I1lIiL.OooO00o(this.OooO00o.OooO00o(i));
        }
        return r2;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        iILLL1 r0 = new iILLL1();
        if (this.OooO00o != null) {
            r0.OooO00o(new ILI1Ll(true, 0, this.OooO00o));
        }
        if (this.OooO0O0 != null) {
            r0.OooO00o(new ILI1Ll(true, 1, this.OooO0O0));
        }
        if (this.f22761OooO00o != null) {
            r0.OooO00o(new ILI1Ll(true, 2, this.f22761OooO00o.OooO0O0()));
        }
        return new C5707LiL1(r0);
    }
}
