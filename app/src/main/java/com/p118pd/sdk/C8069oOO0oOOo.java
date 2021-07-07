package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import java.io.IOException;

/* renamed from: com.pd.sdk.oOO0oOOo  reason: case insensitive filesystem */
public class C8069oOO0oOOo extends AbstractC8042oOO0OOo<C8068oOO0oOOO> {
    public C8069oOO0oOOo(C7925oO0o0OO0 oo0o0oo0) {
        super(oo0o0oo0);
    }

    @Override // com.p118pd.sdk.AbstractC8042oOO0OOo, com.p118pd.sdk.oO0OO0O
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m19742OooO00o() {
        return "smhd";
    }

    @Override // com.p118pd.sdk.AbstractC8042oOO0OOo
    public void OooO0O0(@NotNull AbstractC7917oO0o000O oo0o000o, @NotNull C8044oOO0OOoo ooo0oooo) throws IOException {
        new C8056oOO0o0Oo(oo0o000o, ooo0oooo).OooO00o((C8068oOO0oOOO) ((oO0OO0O) this).f20924OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC8042oOO0OOo
    public void OooO0OO(@NotNull AbstractC7917oO0o000O oo0o000o, @NotNull C8044oOO0OOoo ooo0oooo) throws IOException {
        ((C8068oOO0oOOO) ((oO0OO0O) this).f20924OooO00o).OooO00o(772, (double) C8041oOO0OOOo.OooO00o.longValue());
    }

    @Override // com.p118pd.sdk.AbstractC8042oOO0OOo, com.p118pd.sdk.oO0OO0O
    @NotNull
    public C8068oOO0oOOO OooO00o() {
        return new C8068oOO0oOOO();
    }

    @Override // com.p118pd.sdk.AbstractC8042oOO0OOo
    public void OooO00o(@NotNull AbstractC7917oO0o000O oo0o000o, @NotNull C8044oOO0OOoo ooo0oooo) throws IOException {
        new C8055oOO0o0OO(oo0o000o, ooo0oooo).OooO00o((C8068oOO0oOOO) ((oO0OO0O) this).f20924OooO00o);
    }
}
