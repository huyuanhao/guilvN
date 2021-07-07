package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import com.p118pd.sdk.oOO0OOOO;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

/* renamed from: com.pd.sdk.oOO0OOo  reason: case insensitive filesystem */
public abstract class AbstractC8042oOO0OOo<T extends oOO0OOOO> extends oO0OO0O<T> {
    public AbstractC8042oOO0OOo(C7925oO0o0OO0 oo0o0oo0) {
        super(oo0o0oo0);
        if (C8041oOO0OOOo.OooO0O0 != null && C8041oOO0OOOo.OooO0OO != null) {
            Calendar instance = Calendar.getInstance();
            instance.set(1904, 0, 1, 0, 0, 0);
            long time = instance.getTime().getTime();
            String date = new Date((C8041oOO0OOOo.OooO0O0.longValue() * 1000) + time).toString();
            String date2 = new Date((C8041oOO0OOOo.OooO0OO.longValue() * 1000) + time).toString();
            ((oO0OO0O) this).f20924OooO00o.m19648OooO00o(AbstractC8064oOO0oO0O.OooOOo, date);
            ((oO0OO0O) this).f20924OooO00o.m19648OooO00o(AbstractC8064oOO0oO0O.OooOOoo, date2);
        }
    }

    @Override // com.p118pd.sdk.oO0OO0O
    public abstract String OooO00o();

    public abstract void OooO00o(@NotNull AbstractC7917oO0o000O oo0o000o, @NotNull C8044oOO0OOoo ooo0oooo) throws IOException;

    public abstract void OooO0O0(@NotNull AbstractC7917oO0o000O oo0o000o, @NotNull C8044oOO0OOoo ooo0oooo) throws IOException;

    @Override // com.p118pd.sdk.oO0OO0O
    public boolean OooO0O0(@NotNull C8044oOO0OOoo ooo0oooo) {
        return ooo0oooo.f21070OooO00o.equals("stbl") || ooo0oooo.f21070OooO00o.equals("minf") || ooo0oooo.f21070OooO00o.equals("gmhd") || ooo0oooo.f21070OooO00o.equals(C8041oOO0OOOo.OooO0o0);
    }

    public abstract void OooO0OO(@NotNull AbstractC7917oO0o000O oo0o000o, @NotNull C8044oOO0OOoo ooo0oooo) throws IOException;

    @Override // com.p118pd.sdk.oO0OO0O, com.p118pd.sdk.oO0OO0O
    public boolean OooO00o(@NotNull C8044oOO0OOoo ooo0oooo) {
        return ooo0oooo.f21070OooO00o.equals(OooO00o()) || ooo0oooo.f21070OooO00o.equals("stsd") || ooo0oooo.f21070OooO00o.equals("stts");
    }

    @Override // com.p118pd.sdk.oO0OO0O
    public AbstractC8042oOO0OOo OooO00o(@NotNull C8044oOO0OOoo ooo0oooo, @Nullable byte[] bArr) throws IOException {
        if (bArr != null) {
            C7916oO0o000 oo0o000 = new C7916oO0o000(bArr);
            if (ooo0oooo.f21070OooO00o.equals(OooO00o())) {
                OooO00o(oo0o000, ooo0oooo);
            } else if (ooo0oooo.f21070OooO00o.equals("stsd")) {
                OooO0O0(oo0o000, ooo0oooo);
            } else if (ooo0oooo.f21070OooO00o.equals("stts")) {
                OooO0OO(oo0o000, ooo0oooo);
            }
        }
        return this;
    }
}
