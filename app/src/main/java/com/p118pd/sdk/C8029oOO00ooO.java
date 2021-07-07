package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import com.umeng.commonsdk.proguard.C3617o;

/* renamed from: com.pd.sdk.oOO00ooO  reason: case insensitive filesystem */
public class C8029oOO00ooO extends C7929oO0o0OoO<oOO0> {
    public C8029oOO00ooO(@NotNull oOO0 ooo0) {
        super(ooo0);
    }

    @Nullable
    public String OooO00o() {
        Integer OooO00o = ((oOO0) this.f20998OooO00o).m19639OooO00o(7);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 0) {
            return "none";
        }
        if (intValue != 1) {
            return intValue != 2 ? "unit" : "centimetre";
        }
        return "inch";
    }

    @Nullable
    public String OooO0O0() {
        Integer OooO00o = ((oOO0) this.f20998OooO00o).m19639OooO00o(8);
        if (OooO00o == null) {
            return null;
        }
        Object[] objArr = new Object[2];
        objArr[0] = OooO00o;
        objArr[1] = OooO00o.intValue() == 1 ? "" : C3617o.f9366at;
        return String.format("%d dot%s", objArr);
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    @Nullable
    public String OooO0OO(int i) {
        if (i == 5) {
            return OooO0Oo();
        }
        if (i == 10) {
            return OooO0OO();
        }
        if (i == 7) {
            return OooO00o();
        }
        if (i != 8) {
            return super.OooO0OO(i);
        }
        return OooO0O0();
    }

    @Nullable
    public String OooO0Oo() {
        Integer OooO00o = ((oOO0) this.f20998OooO00o).m19639OooO00o(5);
        if (OooO00o == null) {
            return null;
        }
        return String.format("%d.%d", Integer.valueOf((OooO00o.intValue() & 65280) >> 8), Integer.valueOf(OooO00o.intValue() & 255));
    }

    @Nullable
    public String OooO0OO() {
        Integer OooO00o = ((oOO0) this.f20998OooO00o).m19639OooO00o(10);
        if (OooO00o == null) {
            return null;
        }
        Object[] objArr = new Object[2];
        objArr[0] = OooO00o;
        objArr[1] = OooO00o.intValue() == 1 ? "" : C3617o.f9366at;
        return String.format("%d dot%s", objArr);
    }
}
