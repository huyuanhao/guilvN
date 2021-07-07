package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import com.p118pd.sdk.C8091oOOO00Oo;
import java.io.IOException;

/* renamed from: com.pd.sdk.oO0O0oOO  reason: case insensitive filesystem */
public abstract class AbstractC7854oO0O0oOO<T extends C8091oOOO00Oo> {
    @NotNull
    public C7925oO0o0OO0 OooO00o;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public T f20908OooO00o;

    public AbstractC7854oO0O0oOO(@NotNull C7925oO0o0OO0 oo0o0oo0) {
        this.OooO00o = oo0o0oo0;
        T OooO00o2 = OooO00o();
        this.f20908OooO00o = OooO00o2;
        oo0o0oo0.OooO00o(OooO00o2);
    }

    public AbstractC7854oO0O0oOO OooO00o(@NotNull C8095oOOO00oo oooo00oo) throws IOException {
        return OooO00o(oooo00oo, null);
    }

    public abstract AbstractC7854oO0O0oOO OooO00o(@NotNull C8095oOOO00oo oooo00oo, @Nullable byte[] bArr) throws IOException;

    @NotNull
    public abstract T OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract boolean m19543OooO00o(@NotNull C8095oOOO00oo oooo00oo);

    public abstract boolean OooO0O0(@NotNull C8095oOOO00oo oooo00oo);

    public void OooO00o(@NotNull String str) {
        this.f20908OooO00o.OooO00o(str);
    }
}
