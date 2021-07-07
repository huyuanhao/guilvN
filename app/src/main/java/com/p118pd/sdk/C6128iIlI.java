package com.p118pd.sdk;

import java.io.IOException;

/* renamed from: com.pd.sdk.iIl丨I  reason: invalid class name and case insensitive filesystem */
public class C6128iIlI {
    public C1674II OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5507IILLI f17605OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public L1iI1 f17606OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6513lIiI f17607OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6541lIlii f17608OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9685lL f17609OooO00o;

    public C6128iIlI(AbstractC9685lL r3) throws IOException {
        this.f17609OooO00o = r3;
        this.f17607OooO00o = C6513lIiI.OooO00o(r3.OooO00o());
        AbstractC6854lLi1LL OooO00o2 = r3.OooO00o();
        if (OooO00o2 instanceof L1iI1) {
            this.f17606OooO00o = L1iI1.OooO00o(OooO00o2);
            OooO00o2 = r3.OooO00o();
        }
        if ((OooO00o2 instanceof C1674II) || (OooO00o2 instanceof AbstractC9685lL)) {
            this.OooO00o = C1674II.OooO00o(OooO00o2.OooO0O0());
            OooO00o2 = r3.OooO00o();
        }
        if (OooO00o2 instanceof AbstractC6541lIlii) {
            this.f17608OooO00o = (AbstractC6541lIlii) OooO00o2;
        }
    }

    public static C6128iIlI OooO00o(Object obj) throws IOException {
        if (obj instanceof I11li1) {
            return new C6128iIlI(((I11li1) obj).OooO00o());
        }
        if (obj instanceof AbstractC9685lL) {
            return new C6128iIlI((AbstractC9685lL) obj);
        }
        return null;
    }

    public C1674II OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5507IILLI m17028OooO00o() throws IOException {
        if (this.f17605OooO00o == null) {
            this.f17605OooO00o = C5507IILLI.OooO00o(this.f17609OooO00o.OooO00o().OooO0O0());
        }
        return this.f17605OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public L1iI1 m17029OooO00o() {
        return this.f17606OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6541lIlii m17030OooO00o() {
        return this.f17608OooO00o;
    }
}
