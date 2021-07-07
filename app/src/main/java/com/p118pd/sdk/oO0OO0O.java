package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import com.p118pd.sdk.oOO0OOOO;
import java.io.IOException;

/* renamed from: com.pd.sdk.oO0OO0O */
public abstract class oO0OO0O<T extends oOO0OOOO> {
    @NotNull
    public C7925oO0o0OO0 OooO00o;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public T f20924OooO00o;

    public oO0OO0O(@NotNull C7925oO0o0OO0 oo0o0oo0) {
        this.OooO00o = oo0o0oo0;
        T OooO00o2 = OooO00o();
        this.f20924OooO00o = OooO00o2;
        oo0o0oo0.OooO00o(OooO00o2);
    }

    public oO0OO0O OooO00o(@NotNull C8044oOO0OOoo ooo0oooo) throws IOException {
        return OooO00o(ooo0oooo, null);
    }

    public abstract oO0OO0O OooO00o(@NotNull C8044oOO0OOoo ooo0oooo, @Nullable byte[] bArr) throws IOException;

    @NotNull
    public abstract T OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract boolean m19552OooO00o(@NotNull C8044oOO0OOoo ooo0oooo);

    public abstract boolean OooO0O0(@NotNull C8044oOO0OOoo ooo0oooo);

    public void OooO00o(@NotNull String str) {
        this.f20924OooO00o.OooO00o(str);
    }
}
