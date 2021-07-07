package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import java.io.IOException;

/* renamed from: com.pd.sdk.oOO0ooO0  reason: case insensitive filesystem */
public class C8078oOO0ooO0 extends AbstractC8042oOO0OOo<C8073oOO0oo> {
    public C8078oOO0ooO0(C7925oO0o0OO0 oo0o0oo0) {
        super(oo0o0oo0);
    }

    @Override // com.p118pd.sdk.AbstractC8042oOO0OOo, com.p118pd.sdk.oO0OO0O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m19748OooO00o() {
        return oOO0OO0O.OooO0o;
    }

    @Override // com.p118pd.sdk.AbstractC8042oOO0OOo
    public void OooO0O0(@NotNull AbstractC7917oO0o000O oo0o000o, @NotNull C8044oOO0OOoo ooo0oooo) throws IOException {
        new C8060oOO0o0oo(oo0o000o, ooo0oooo).OooO00o((C8073oOO0oo) ((oO0OO0O) this).f20924OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC8042oOO0OOo
    public void OooO0OO(@NotNull AbstractC7917oO0o000O oo0o000o, @NotNull C8044oOO0OOoo ooo0oooo) throws IOException {
    }

    @Override // com.p118pd.sdk.AbstractC8042oOO0OOo, com.p118pd.sdk.oO0OO0O
    @NotNull
    public C8073oOO0oo OooO00o() {
        return new C8073oOO0oo();
    }

    @Override // com.p118pd.sdk.AbstractC8042oOO0OOo
    public void OooO00o(@NotNull AbstractC7917oO0o000O oo0o000o, @NotNull C8044oOO0OOoo ooo0oooo) throws IOException {
        new C8059oOO0o0oO(oo0o000o, ooo0oooo).OooO00o((C8073oOO0oo) ((oO0OO0O) this).f20924OooO00o);
    }
}
