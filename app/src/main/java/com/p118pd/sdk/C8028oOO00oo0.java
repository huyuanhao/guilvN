package com.p118pd.sdk;

import com.umeng.message.proguard.C3848l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.pd.sdk.oOO00oo0  reason: case insensitive filesystem */
public final class C8028oOO00oo0 {
    @NotNull
    public final IntRange OooO00o;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public final String f21058OooO00o;

    public C8028oOO00oo0(@NotNull String str, @NotNull IntRange oo000o0o) {
        o0O0OO00.OooO0o(str, "value");
        o0O0OO00.OooO0o(oo000o0o, "range");
        this.f21058OooO00o = str;
        this.OooO00o = oo000o0o;
    }

    @NotNull
    public static /* synthetic */ C8028oOO00oo0 OooO00o(C8028oOO00oo0 ooo00oo0, String str, IntRange oo000o0o, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ooo00oo0.f21058OooO00o;
        }
        if ((i & 2) != 0) {
            oo000o0o = ooo00oo0.OooO00o;
        }
        return ooo00oo0.OooO00o(str, oo000o0o);
    }

    @NotNull
    public final IntRange OooO00o() {
        return this.OooO00o;
    }

    @NotNull
    public final C8028oOO00oo0 OooO00o(@NotNull String str, @NotNull IntRange oo000o0o) {
        o0O0OO00.OooO0o(str, "value");
        o0O0OO00.OooO0o(oo000o0o, "range");
        return new C8028oOO00oo0(str, oo000o0o);
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public final String m19730OooO00o() {
        return this.f21058OooO00o;
    }

    @NotNull
    public final IntRange OooO0O0() {
        return this.OooO00o;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8028oOO00oo0)) {
            return false;
        }
        C8028oOO00oo0 ooo00oo0 = (C8028oOO00oo0) obj;
        return o0O0OO00.OooO00o(this.f21058OooO00o, ooo00oo0.f21058OooO00o) && o0O0OO00.OooO00o(this.OooO00o, ooo00oo0.OooO00o);
    }

    public int hashCode() {
        String str = this.f21058OooO00o;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        IntRange oo000o0o = this.OooO00o;
        if (oo000o0o != null) {
            i = oo000o0o.hashCode();
        }
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        return "MatchGroup(value=" + this.f21058OooO00o + ", range=" + this.OooO00o + C3848l.f10402t;
    }

    @NotNull
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public final String m19731OooO0O0() {
        return this.f21058OooO00o;
    }
}
