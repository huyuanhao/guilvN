package com.p118pd.sdk;

/* renamed from: com.pd.sdk.l1ii  reason: case insensitive filesystem */
public final class C6454l1ii {
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9341I1iilI1 f18289OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC9486LL1iI1L f18290OooO00o;
    public final int OooO0O0;

    public C6454l1ii(int i, int i2, AbstractC6436l11LI r9) {
        this.OooO00o = i;
        this.OooO0O0 = i2;
        this.f18289OooO00o = new C9341I1iilI1(OooO00o(i, i2), r9);
        this.f18290OooO00o = lLL1IIi.OooO00o(m17579OooO00o().OooO00o(), OooO00o(), OooO0o0(), OooO0Oo(), OooO0O0(), i2);
    }

    public static int OooO00o(int i, int i2) throws IllegalArgumentException {
        if (i < 2) {
            throw new IllegalArgumentException("totalHeight must be > 1");
        } else if (i % i2 == 0) {
            int i3 = i / i2;
            if (i3 != 1) {
                return i3;
            }
            throw new IllegalArgumentException("height / layers must be greater than 1");
        } else {
            throw new IllegalArgumentException("layers must divide totalHeight without remainder");
        }
    }

    public int OooO00o() {
        return this.f18289OooO00o.OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5558Il1l m17578OooO00o() {
        return this.f18289OooO00o.m21385OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6436l11LI m17579OooO00o() {
        return this.f18289OooO00o.m21386OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9341I1iilI1 m17580OooO00o() {
        return this.f18289OooO00o;
    }

    public int OooO0O0() {
        return this.OooO00o;
    }

    public int OooO0OO() {
        return this.OooO0O0;
    }

    public int OooO0Oo() {
        return this.f18289OooO00o.m21385OooO00o().m15837OooO00o().OooO0O0();
    }

    public int OooO0o0() {
        return this.f18289OooO00o.OooO0Oo();
    }
}
