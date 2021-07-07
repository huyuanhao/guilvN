package com.p118pd.sdk;

/* renamed from: com.pd.sdk.丨I1iilI1  reason: invalid class name and case insensitive filesystem */
public final class C9341I1iilI1 {
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C5558Il1l f22867OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC9486LL1iI1L f22868OooO00o;
    public final int OooO0O0;

    public C9341I1iilI1(int i, AbstractC6436l11LI r5) {
        if (i < 2) {
            throw new IllegalArgumentException("height must be >= 2");
        } else if (r5 != null) {
            this.f22867OooO00o = new C5558Il1l(new C6578lLILi(r5));
            this.OooO00o = i;
            this.OooO0O0 = OooO0o0();
            this.f22868OooO00o = C6138iILi.OooO00o(m21386OooO00o().OooO00o(), OooO00o(), OooO0Oo(), this.f22867OooO00o.m15837OooO00o().OooO0O0(), i);
        } else {
            throw new NullPointerException("digest == null");
        }
    }

    private int OooO0o0() {
        int i = 2;
        while (true) {
            int i2 = this.OooO00o;
            if (i > i2) {
                throw new IllegalStateException("should never happen...");
            } else if ((i2 - i) % 2 == 0) {
                return i;
            } else {
                i++;
            }
        }
    }

    public int OooO00o() {
        return this.f22867OooO00o.m15837OooO00o().OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5558Il1l m21385OooO00o() {
        return this.f22867OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6436l11LI m21386OooO00o() {
        return this.f22867OooO00o.m15837OooO00o().m17679OooO00o();
    }

    public int OooO0O0() {
        return this.OooO00o;
    }

    public int OooO0OO() {
        return this.OooO0O0;
    }

    public int OooO0Oo() {
        return this.f22867OooO00o.m15837OooO00o().OooO0o0();
    }
}
