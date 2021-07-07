package com.p118pd.sdk;

import com.drew.lang.Rational;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import com.umeng.message.proguard.C3848l;

/* renamed from: com.pd.sdk.oOooo  reason: case insensitive filesystem */
public class C8459oOooo extends C7929oO0o0OoO<C7942oO0oO> {
    public C8459oOooo(@NotNull C7942oO0oO oo0oo) {
        super(oo0oo);
    }

    @Nullable
    public String OooO00o() {
        Integer OooO00o = ((C7942oO0oO) this.f20998OooO00o).m19639OooO00o(7);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue() & 15;
        if (intValue == 0) {
            return "Off";
        }
        if (intValue == 1) {
            return "On";
        }
        return "Unknown (" + OooO00o + C3848l.f10402t;
    }

    @Nullable
    public String OooO0O0() {
        Integer OooO00o = ((C7942oO0oO) this.f20998OooO00o).m19639OooO00o(2);
        if (OooO00o == null) {
            return null;
        }
        return new Rational((long) OooO00o.intValue(), 32678).toString();
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    @Nullable
    public String OooO0OO(int i) {
        if (i == 2) {
            return OooO0O0();
        }
        if (i == 11) {
            return OooO0o();
        }
        if (i == 4) {
            return OooO0OO();
        }
        if (i == 5) {
            return OooO0oO();
        }
        if (i == 7) {
            return OooO00o();
        }
        if (i == 8) {
            return OooO0Oo();
        }
        if (i != 9) {
            return super.OooO0OO(i);
        }
        return OooO0o0();
    }

    @Nullable
    public String OooO0Oo() {
        Integer OooO00o = ((C7942oO0oO) this.f20998OooO00o).m19639OooO00o(8);
        if (OooO00o == null) {
            return null;
        }
        return new Rational((long) OooO00o.intValue(), 32678).toString();
    }

    @Nullable
    public String OooO0o() {
        Integer OooO00o = ((C7942oO0oO) this.f20998OooO00o).m19639OooO00o(11);
        if (OooO00o == null) {
            return null;
        }
        return new Rational((long) OooO00o.intValue(), 32678).toString();
    }

    @Nullable
    public String OooO0o0() {
        Integer OooO00o = ((C7942oO0oO) this.f20998OooO00o).m19639OooO00o(9);
        if (OooO00o == null) {
            return null;
        }
        return new Rational((long) OooO00o.intValue(), 32678).toString();
    }

    @Nullable
    public String OooO0oO() {
        Integer OooO00o = ((C7942oO0oO) this.f20998OooO00o).m19639OooO00o(5);
        if (OooO00o == null) {
            return null;
        }
        return Integer.toString(1 / ((OooO00o.intValue() / 32768) + 1));
    }

    @Nullable
    public String OooOO0(int i) {
        Integer OooO00o = ((C7942oO0oO) this.f20998OooO00o).m19639OooO00o(i);
        if (OooO00o == null) {
            return null;
        }
        return super.OooO00o(OooO00o.shortValue());
    }

    @Nullable
    public String OooO0OO() {
        Integer OooO00o = ((C7942oO0oO) this.f20998OooO00o).m19639OooO00o(4);
        if (OooO00o == null) {
            return null;
        }
        return new Rational((long) OooO00o.intValue(), 32678).toString();
    }
}
