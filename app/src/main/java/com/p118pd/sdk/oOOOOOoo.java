package com.p118pd.sdk;

import com.bumptech.glide.Registry;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import com.umeng.commonsdk.proguard.C3617o;

/* renamed from: com.pd.sdk.oOOOOOoo */
public class oOOOOOoo extends C7929oO0o0OoO<oOOOOo00> {
    public oOOOOOoo(@NotNull oOOOOo00 oooooo00) {
        super(oooooo00);
    }

    @Nullable
    public String OooO00o() {
        Integer OooO00o = ((oOOOOo00) this.f20998OooO00o).m19639OooO00o(4);
        if (OooO00o == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(OooO00o);
        sb.append(" bit");
        sb.append(OooO00o.intValue() == 1 ? "" : C3617o.f9366at);
        sb.append(" per channel");
        return sb.toString();
    }

    @Nullable
    public String OooO0O0() {
        Integer OooO00o = ((oOOOOo00) this.f20998OooO00o).m19639OooO00o(1);
        if (OooO00o == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(OooO00o);
        sb.append(" channel");
        sb.append(OooO00o.intValue() == 1 ? "" : C3617o.f9366at);
        return sb.toString();
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    public String OooO0OO(int i) {
        if (i == 1) {
            return OooO0O0();
        }
        if (i == 2) {
            return OooO0Oo();
        }
        if (i == 3) {
            return OooO0o0();
        }
        if (i == 4) {
            return OooO00o();
        }
        if (i != 5) {
            return super.OooO0OO(i);
        }
        return OooO0OO();
    }

    @Nullable
    public String OooO0Oo() {
        Integer OooO00o = ((oOOOOo00) this.f20998OooO00o).m19639OooO00o(2);
        if (OooO00o == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(OooO00o);
        sb.append(" pixel");
        sb.append(OooO00o.intValue() == 1 ? "" : C3617o.f9366at);
        return sb.toString();
    }

    @Nullable
    public String OooO0o0() {
        try {
            Integer OooO00o = ((oOOOOo00) this.f20998OooO00o).m19639OooO00o(3);
            if (OooO00o == null) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(OooO00o);
            sb.append(" pixel");
            sb.append(OooO00o.intValue() == 1 ? "" : C3617o.f9366at);
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    public String OooO0OO() {
        return OooO00o(5, Registry.OooO0O0, "Grayscale", "Indexed", "RGB", "CMYK", null, null, "Multichannel", "Duotone", "Lab");
    }
}
