package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import java.io.IOException;

/* renamed from: com.pd.sdk.oOOO000  reason: case insensitive filesystem */
public class C8088oOOO000 extends AbstractC7854oO0O0oOO<C8091oOOO00Oo> {
    public C8093oOOO00o0 OooO00o = new C8093oOOO00o0(this);

    public C8088oOOO000(C7925oO0o0OO0 oo0o0oo0) {
        super(oo0o0oo0);
    }

    private void OooO0OO(@NotNull AbstractC7917oO0o000O oo0o000o, @NotNull C8095oOOO00oo oooo00oo) throws IOException {
        new oOOO0OOO(oo0o000o, oooo00oo).OooO00o(((AbstractC7854oO0O0oOO) this).f20908OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC7854oO0O0oOO
    @NotNull
    public C8091oOOO00Oo OooO00o() {
        return new C8091oOOO00Oo();
    }

    @Override // com.p118pd.sdk.AbstractC7854oO0O0oOO
    public boolean OooO0O0(@NotNull C8095oOOO00oo oooo00oo) {
        return oooo00oo.f21103OooO00o.equals("trak") || oooo00oo.f21103OooO00o.equals("meta") || oooo00oo.f21103OooO00o.equals("moov") || oooo00oo.f21103OooO00o.equals("mdia");
    }

    private void OooO0O0(@NotNull AbstractC7917oO0o000O oo0o000o, @NotNull C8095oOOO00oo oooo00oo) throws IOException {
        new C8098oOOO0OO(oo0o000o, oooo00oo);
    }

    @Override // com.p118pd.sdk.AbstractC7854oO0O0oOO, com.p118pd.sdk.AbstractC7854oO0O0oOO
    public boolean OooO00o(@NotNull C8095oOOO00oo oooo00oo) {
        return oooo00oo.f21103OooO00o.equals("ftyp") || oooo00oo.f21103OooO00o.equals("mvhd") || oooo00oo.f21103OooO00o.equals("hdlr") || oooo00oo.f21103OooO00o.equals("mdhd");
    }

    @Override // com.p118pd.sdk.AbstractC7854oO0O0oOO
    public AbstractC7854oO0O0oOO OooO00o(@NotNull C8095oOOO00oo oooo00oo, @Nullable byte[] bArr) throws IOException {
        if (bArr != null) {
            C7916oO0o000 oo0o000 = new C7916oO0o000(bArr);
            if (oooo00oo.f21103OooO00o.equals("mvhd")) {
                OooO0OO(oo0o000, oooo00oo);
            } else if (oooo00oo.f21103OooO00o.equals("ftyp")) {
                OooO00o(oo0o000, oooo00oo);
            } else if (oooo00oo.f21103OooO00o.equals("hdlr")) {
                return this.OooO00o.OooO00o(new C8097oOOO0O0o(oo0o000, oooo00oo), ((AbstractC7854oO0O0oOO) this).OooO00o);
            } else if (oooo00oo.f21103OooO00o.equals("mdhd")) {
                OooO0O0(oo0o000, oooo00oo);
            }
        } else if (oooo00oo.f21103OooO00o.equals("cmov")) {
            ((AbstractC7854oO0O0oOO) this).f20908OooO00o.OooO00o("Compressed MP4 movies not supported");
        }
        return this;
    }

    private void OooO00o(@NotNull AbstractC7917oO0o000O oo0o000o, @NotNull C8095oOOO00oo oooo00oo) throws IOException {
        new C8086oOOO0(oo0o000o, oooo00oo).OooO00o(((AbstractC7854oO0O0oOO) this).f20908OooO00o);
    }
}
