package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;

/* renamed from: com.pd.sdk.oO0o0Oo  reason: case insensitive filesystem */
public class C7928oO0o0Oo {
    public final int OooO00o;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC7922oO0o0O0O f20997OooO00o;

    public C7928oO0o0Oo(int i, @NotNull AbstractC7922oO0o0O0O oo0o0o0o) {
        this.OooO00o = i;
        this.f20997OooO00o = oo0o0o0o;
    }

    public int OooO00o() {
        return this.OooO00o;
    }

    @NotNull
    public String OooO0O0() {
        return this.f20997OooO00o.m19643OooO00o();
    }

    @NotNull
    public String OooO0OO() {
        return this.f20997OooO00o.OooO0OO(this.OooO00o);
    }

    @NotNull
    public String OooO0Oo() {
        return String.format("0x%04x", Integer.valueOf(this.OooO00o));
    }

    @NotNull
    public String toString() {
        String OooO00o2 = m19666OooO00o();
        if (OooO00o2 == null) {
            OooO00o2 = this.f20997OooO00o.OooO0O0(OooO00o()) + " (unable to formulate description)";
        }
        return "[" + this.f20997OooO00o.m19643OooO00o() + "] " + OooO0OO() + " - " + OooO00o2;
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m19666OooO00o() {
        return this.f20997OooO00o.m19644OooO00o(this.OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19667OooO00o() {
        return this.f20997OooO00o.m19658OooO0OO(this.OooO00o);
    }
}
