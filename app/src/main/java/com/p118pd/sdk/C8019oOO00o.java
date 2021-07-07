package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import com.umeng.commonsdk.proguard.C3617o;

/* renamed from: com.pd.sdk.oOO00o  reason: case insensitive filesystem */
public class C8019oOO00o extends C7929oO0o0OoO<C8024oOO00oO0> {
    public C8019oOO00o(@NotNull C8024oOO00oO0 ooo00oo0) {
        super(ooo00oo0);
    }

    @Nullable
    public String OooO00o() {
        Integer OooO00o = ((C8024oOO00oO0) this.f20998OooO00o).m19639OooO00o(4);
        if (OooO00o == null) {
            return null;
        }
        if (OooO00o.intValue() == 0) {
            return "No palette";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(OooO00o);
        sb.append(" colour");
        sb.append(OooO00o.intValue() == 1 ? "" : C3617o.f9366at);
        return sb.toString();
    }

    @Nullable
    public String OooO0O0() {
        Integer OooO00o = ((C8024oOO00oO0) this.f20998OooO00o).m19639OooO00o(3);
        if (OooO00o == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(OooO00o.intValue() == 0 ? 256 : OooO00o.intValue());
        sb.append(" pixels");
        return sb.toString();
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    public String OooO0OO(int i) {
        if (i == 1) {
            return OooO0OO();
        }
        if (i == 2) {
            return OooO0Oo();
        }
        if (i == 3) {
            return OooO0O0();
        }
        if (i != 4) {
            return super.OooO0OO(i);
        }
        return OooO00o();
    }

    @Nullable
    public String OooO0Oo() {
        Integer OooO00o = ((C8024oOO00oO0) this.f20998OooO00o).m19639OooO00o(2);
        if (OooO00o == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(OooO00o.intValue() == 0 ? 256 : OooO00o.intValue());
        sb.append(" pixels");
        return sb.toString();
    }

    @Nullable
    public String OooO0OO() {
        return OooO00o(1, 1, "Icon", "Cursor");
    }
}
