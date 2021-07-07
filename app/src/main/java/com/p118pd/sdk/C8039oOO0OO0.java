package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import java.io.IOException;

/* renamed from: com.pd.sdk.oOO0OO0  reason: case insensitive filesystem */
public class C8039oOO0OO0 extends oO0OO0O<oOO0OOOO> {
    public C8041oOO0OOOo OooO00o = new C8041oOO0OOOo(this);

    public C8039oOO0OO0(C7925oO0o0OO0 oo0o0oo0) {
        super(oo0o0oo0);
    }

    @Override // com.p118pd.sdk.oO0OO0O
    @NotNull
    public oOO0OOOO OooO00o() {
        return new oOO0OOOO();
    }

    @Override // com.p118pd.sdk.oO0OO0O
    public boolean OooO0O0(@NotNull C8044oOO0OOoo ooo0oooo) {
        return ooo0oooo.f21070OooO00o.equals("trak") || ooo0oooo.f21070OooO00o.equals("udta") || ooo0oooo.f21070OooO00o.equals("meta") || ooo0oooo.f21070OooO00o.equals("moov") || ooo0oooo.f21070OooO00o.equals("mdia");
    }

    @Override // com.p118pd.sdk.oO0OO0O, com.p118pd.sdk.oO0OO0O
    public boolean OooO00o(@NotNull C8044oOO0OOoo ooo0oooo) {
        return ooo0oooo.f21070OooO00o.equals("ftyp") || ooo0oooo.f21070OooO00o.equals("mvhd") || ooo0oooo.f21070OooO00o.equals("hdlr") || ooo0oooo.f21070OooO00o.equals("mdhd");
    }

    @Override // com.p118pd.sdk.oO0OO0O
    public oO0OO0O OooO00o(@NotNull C8044oOO0OOoo ooo0oooo, @Nullable byte[] bArr) throws IOException {
        if (bArr != null) {
            C7916oO0o000 oo0o000 = new C7916oO0o000(bArr);
            if (ooo0oooo.f21070OooO00o.equals("mvhd")) {
                new C8045oOO0Oo(oo0o000, ooo0oooo).OooO00o(((oO0OO0O) this).f20924OooO00o);
            } else if (ooo0oooo.f21070OooO00o.equals("ftyp")) {
                new C8047oOO0Oo00(oo0o000, ooo0oooo).OooO00o(((oO0OO0O) this).f20924OooO00o);
            } else if (ooo0oooo.f21070OooO00o.equals("hdlr")) {
                return this.OooO00o.OooO00o(new C8048oOO0Oo0O(oo0o000, ooo0oooo).OooO00o(), ((oO0OO0O) this).OooO00o);
            } else if (ooo0oooo.f21070OooO00o.equals("mdhd")) {
                new C8049oOO0Oo0o(oo0o000, ooo0oooo);
            }
        } else if (ooo0oooo.f21070OooO00o.equals("cmov")) {
            ((oO0OO0O) this).f20924OooO00o.OooO00o("Compressed QuickTime movies not supported");
        }
        return this;
    }
}
