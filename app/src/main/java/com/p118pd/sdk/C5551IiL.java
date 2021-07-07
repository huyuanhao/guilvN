package com.p118pd.sdk;

import java.io.IOException;

/* renamed from: com.pd.sdk.I丨i丨L  reason: invalid class name and case insensitive filesystem */
public class C5551IiL {
    public static final LlLI1 OooO = new LlLI1("2.5.29.21");
    public static final LlLI1 OooO00o = new LlLI1("2.5.29.9");
    public static final LlLI1 OooO0O0 = new LlLI1("2.5.29.14");
    public static final LlLI1 OooO0OO = new LlLI1("2.5.29.15");
    public static final LlLI1 OooO0Oo = new LlLI1("2.5.29.16");
    public static final LlLI1 OooO0o = new LlLI1("2.5.29.18");
    public static final LlLI1 OooO0o0 = new LlLI1("2.5.29.17");
    public static final LlLI1 OooO0oO = new LlLI1("2.5.29.19");
    public static final LlLI1 OooO0oo = new LlLI1("2.5.29.20");
    public static final LlLI1 OooOO0 = new LlLI1("2.5.29.23");
    public static final LlLI1 OooOO0O = new LlLI1("2.5.29.24");
    public static final LlLI1 OooOO0o = new LlLI1("2.5.29.27");
    public static final LlLI1 OooOOO = new LlLI1("2.5.29.29");
    public static final LlLI1 OooOOO0 = new LlLI1("2.5.29.28");
    public static final LlLI1 OooOOOO = new LlLI1("2.5.29.30");
    public static final LlLI1 OooOOOo = new LlLI1("2.5.29.31");
    public static final LlLI1 OooOOo = new LlLI1("2.5.29.33");
    public static final LlLI1 OooOOo0 = new LlLI1("2.5.29.32");
    public static final LlLI1 OooOOoo = new LlLI1("2.5.29.35");
    public static final LlLI1 OooOo = new LlLI1("1.3.6.1.5.5.7.1.1");
    public static final LlLI1 OooOo0 = new LlLI1("2.5.29.37");
    public static final LlLI1 OooOo00 = new LlLI1("2.5.29.36");
    public static final LlLI1 OooOo0O = new LlLI1("2.5.29.46");
    public static final LlLI1 OooOo0o = new LlLI1("2.5.29.54");
    public static final LlLI1 OooOoO = new LlLI1("1.3.6.1.5.5.7.1.12");
    public static final LlLI1 OooOoO0 = new LlLI1("1.3.6.1.5.5.7.1.11");
    public static final LlLI1 OooOoOO = new LlLI1("1.3.6.1.5.5.7.1.2");
    public static final LlLI1 OooOoo = new LlLI1("1.3.6.1.5.5.7.1.4");
    public static final LlLI1 OooOoo0 = new LlLI1("1.3.6.1.5.5.7.1.3");
    public static final LlLI1 OooOooO = new LlLI1("2.5.29.56");
    public static final LlLI1 OooOooo = new LlLI1("2.5.29.55");

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6804llL1ii f16064OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f16065OooO00o;

    public C5551IiL(C5514IL r1, AbstractC6804llL1ii r2) {
        this.f16065OooO00o = r1.m15792OooO0O0();
        this.f16064OooO00o = r2;
    }

    public C5551IiL(boolean z, AbstractC6804llL1ii r2) {
        this.f16065OooO00o = z;
        this.f16064OooO00o = r2;
    }

    public static AbstractC6122iIlLiL OooO00o(C5551IiL r3) throws IllegalArgumentException {
        try {
            return AbstractC6122iIlLiL.OooO00o(r3.OooO00o().m17938OooO00o());
        } catch (IOException e) {
            throw new IllegalArgumentException("can't convert extension: " + e);
        }
    }

    public AbstractC6804llL1ii OooO00o() {
        return this.f16064OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6854lLi1LL m15828OooO00o() {
        return OooO00o(this);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m15829OooO00o() {
        return this.f16065OooO00o;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5551IiL)) {
            return false;
        }
        C5551IiL r4 = (C5551IiL) obj;
        return r4.OooO00o().equals(OooO00o()) && r4.m15829OooO00o() == m15829OooO00o();
    }

    public int hashCode() {
        return m15829OooO00o() ? OooO00o().hashCode() : OooO00o().hashCode() ^ -1;
    }
}
