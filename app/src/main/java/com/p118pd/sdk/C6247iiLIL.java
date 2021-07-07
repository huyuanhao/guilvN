package com.p118pd.sdk;

import java.io.IOException;

/* renamed from: com.pd.sdk.iiLIL  reason: case insensitive filesystem */
public class C6247iiLIL {
    public C6513lIiI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6854lLi1LL f17867OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9685lL f17868OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f17869OooO00o;

    public C6247iiLIL(AbstractC9685lL r1) throws IOException {
        this.f17868OooO00o = r1;
        this.OooO00o = C6513lIiI.OooO00o(r1.OooO00o());
    }

    public Ii11i OooO00o() throws IOException {
        if (this.f17867OooO00o == null) {
            this.f17867OooO00o = this.f17868OooO00o.OooO00o();
        }
        AbstractC6854lLi1LL r0 = this.f17867OooO00o;
        if (r0 == null) {
            return null;
        }
        this.f17867OooO00o = null;
        return new Ii11i((AbstractC9685lL) r0);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI m17251OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6796llliI m17252OooO00o() throws IOException {
        if (!this.f17869OooO00o) {
            m17253OooO00o();
        }
        if (this.f17867OooO00o == null) {
            this.f17867OooO00o = this.f17868OooO00o.OooO00o();
        }
        AbstractC6796llliI lllii = (AbstractC6796llliI) this.f17867OooO00o;
        this.f17867OooO00o = null;
        return lllii;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C1ILLL1 m17253OooO00o() throws IOException {
        this.f17869OooO00o = true;
        if (this.f17867OooO00o == null) {
            this.f17867OooO00o = this.f17868OooO00o.OooO00o();
        }
        AbstractC6854lLi1LL r0 = this.f17867OooO00o;
        if (!(r0 instanceof AbstractC6532lIII) || ((AbstractC6532lIII) r0).OooO00o() != 0) {
            return null;
        }
        this.f17867OooO00o = null;
        return C1ILLL1.OooO00o(((AbstractC9685lL) ((AbstractC6532lIII) this.f17867OooO00o).OooO00o(16, false)).OooO0O0());
    }

    public AbstractC6796llliI OooO0O0() throws IOException {
        if (this.f17867OooO00o == null) {
            this.f17867OooO00o = this.f17868OooO00o.OooO00o();
        }
        AbstractC6854lLi1LL r0 = this.f17867OooO00o;
        if (r0 == null) {
            return null;
        }
        this.f17867OooO00o = null;
        return (AbstractC6796llliI) ((AbstractC6532lIII) r0).OooO00o(17, false);
    }
}
