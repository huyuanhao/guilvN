package com.p118pd.sdk;

import java.io.IOException;

/* renamed from: com.pd.sdk.ll1l  reason: case insensitive filesystem */
public class C6741ll1l {
    public C6513lIiI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6854lLi1LL f18711OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9685lL f18712OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f18713OooO00o;

    public C6741ll1l(AbstractC9685lL r1) throws IOException {
        this.f18712OooO00o = r1;
        this.OooO00o = C6513lIiI.OooO00o(r1.OooO00o());
    }

    public I1Iili1 OooO00o() throws IOException {
        return OooO0O0();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m17828OooO00o() throws IOException {
        if (this.f18711OooO00o == null) {
            this.f18711OooO00o = this.f18712OooO00o.OooO00o();
        }
        AbstractC6854lLi1LL r0 = this.f18711OooO00o;
        if (!(r0 instanceof AbstractC6532lIII)) {
            return null;
        }
        C6456l1ilL OooO00o2 = C6456l1ilL.OooO00o((AbstractC5903LlLLL) r0.OooO0O0(), false);
        this.f18711OooO00o = null;
        return OooO00o2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI m17829OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6796llliI m17830OooO00o() throws IOException {
        if (this.f18711OooO00o == null) {
            this.f18711OooO00o = this.f18712OooO00o.OooO00o();
        }
        AbstractC6854lLi1LL r0 = this.f18711OooO00o;
        if (!(r0 instanceof AbstractC6532lIII)) {
            return null;
        }
        this.f18711OooO00o = null;
        return (AbstractC6796llliI) ((AbstractC6532lIII) r0).OooO00o(17, false);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6804llL1ii m17831OooO00o() throws IOException {
        if (this.f18711OooO00o == null) {
            this.f18711OooO00o = this.f18712OooO00o.OooO00o();
        }
        AbstractC6854lLi1LL r0 = this.f18711OooO00o;
        this.f18711OooO00o = null;
        return AbstractC6804llL1ii.OooO00o((Object) r0.OooO0O0());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C1ILLL1 m17832OooO00o() throws IOException {
        this.f18713OooO00o = true;
        if (this.f18711OooO00o == null) {
            this.f18711OooO00o = this.f18712OooO00o.OooO00o();
        }
        AbstractC6854lLi1LL r0 = this.f18711OooO00o;
        if (!(r0 instanceof AbstractC6532lIII) || ((AbstractC6532lIII) r0).OooO00o() != 0) {
            return null;
        }
        this.f18711OooO00o = null;
        return C1ILLL1.OooO00o(((AbstractC9685lL) ((AbstractC6532lIII) this.f18711OooO00o).OooO00o(16, false)).OooO0O0());
    }

    public I1Iili1 OooO0O0() throws IOException {
        if (this.f18711OooO00o == null) {
            this.f18711OooO00o = this.f18712OooO00o.OooO00o();
        }
        AbstractC6854lLi1LL r0 = this.f18711OooO00o;
        if (r0 == null) {
            return null;
        }
        this.f18711OooO00o = null;
        return new I1Iili1((AbstractC9685lL) r0);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C6456l1ilL m17833OooO0O0() throws IOException {
        if (this.f18711OooO00o == null) {
            this.f18711OooO00o = this.f18712OooO00o.OooO00o();
        }
        AbstractC6854lLi1LL r0 = this.f18711OooO00o;
        if (r0 == null) {
            return null;
        }
        this.f18711OooO00o = null;
        return C6456l1ilL.OooO00o(((AbstractC9685lL) r0).OooO0O0());
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6796llliI m17834OooO0O0() throws IOException {
        if (!this.f18713OooO00o) {
            m17832OooO00o();
        }
        if (this.f18711OooO00o == null) {
            this.f18711OooO00o = this.f18712OooO00o.OooO00o();
        }
        AbstractC6796llliI lllii = (AbstractC6796llliI) this.f18711OooO00o;
        this.f18711OooO00o = null;
        return lllii;
    }

    public AbstractC6796llliI OooO0OO() throws IOException {
        if (this.f18711OooO00o == null) {
            this.f18711OooO00o = this.f18712OooO00o.OooO00o();
        }
        AbstractC6854lLi1LL r0 = this.f18711OooO00o;
        if (r0 == null) {
            return null;
        }
        this.f18711OooO00o = null;
        return (AbstractC6796llliI) ((AbstractC6532lIII) r0).OooO00o(17, false);
    }
}
