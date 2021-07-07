package com.p118pd.sdk;

import java.io.IOException;

/* renamed from: com.pd.sdk.i11LI  reason: case insensitive filesystem */
public class C6001i11LI {
    public C6513lIiI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9685lL f17327OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Object f17328OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f17329OooO00o;
    public boolean OooO0O0;

    public C6001i11LI(AbstractC9685lL r1) throws IOException {
        this.f17327OooO00o = r1;
        this.OooO00o = (C6513lIiI) r1.OooO00o();
    }

    public static C6001i11LI OooO00o(Object obj) throws IOException {
        if (obj instanceof I11li1) {
            return new C6001i11LI(((I11li1) obj).OooO00o());
        }
        if (obj instanceof AbstractC9685lL) {
            return new C6001i11LI((AbstractC9685lL) obj);
        }
        throw new IOException("unknown object encountered: " + obj.getClass().getName());
    }

    public I1Iili1 OooO00o() throws IOException {
        return new I1Iili1((AbstractC9685lL) this.f17327OooO00o.OooO00o());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6513lIiI m16844OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6796llliI m16845OooO00o() throws IOException {
        this.f17329OooO00o = true;
        AbstractC6854lLi1LL OooO00o2 = this.f17327OooO00o.OooO00o();
        this.f17328OooO00o = OooO00o2;
        if (!(OooO00o2 instanceof AbstractC6532lIII) || ((AbstractC6532lIII) OooO00o2).OooO00o() != 0) {
            return null;
        }
        AbstractC6796llliI lllii = (AbstractC6796llliI) ((AbstractC6532lIII) this.f17328OooO00o).OooO00o(17, false);
        this.f17328OooO00o = null;
        return lllii;
    }

    public AbstractC6796llliI OooO0O0() throws IOException {
        if (this.f17329OooO00o) {
            this.OooO0O0 = true;
            if (this.f17328OooO00o == null) {
                this.f17328OooO00o = this.f17327OooO00o.OooO00o();
            }
            Object obj = this.f17328OooO00o;
            if (!(obj instanceof AbstractC6532lIII) || ((AbstractC6532lIII) obj).OooO00o() != 1) {
                return null;
            }
            AbstractC6796llliI lllii = (AbstractC6796llliI) ((AbstractC6532lIII) this.f17328OooO00o).OooO00o(17, false);
            this.f17328OooO00o = null;
            return lllii;
        }
        throw new IOException("getCerts() has not been called.");
    }

    public AbstractC6796llliI OooO0OO() throws IOException {
        AbstractC6854lLi1LL OooO00o2 = this.f17327OooO00o.OooO00o();
        return OooO00o2 instanceof I11L ? ((I11L) OooO00o2).OooO00o() : (AbstractC6796llliI) OooO00o2;
    }

    public AbstractC6796llliI OooO0Oo() throws IOException {
        if (!this.f17329OooO00o || !this.OooO0O0) {
            throw new IOException("getCerts() and/or getCrls() has not been called.");
        }
        if (this.f17328OooO00o == null) {
            this.f17328OooO00o = this.f17327OooO00o.OooO00o();
        }
        return (AbstractC6796llliI) this.f17328OooO00o;
    }
}
