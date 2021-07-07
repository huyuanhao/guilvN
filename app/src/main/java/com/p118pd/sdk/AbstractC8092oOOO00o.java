package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import com.p118pd.sdk.AbstractC8104oOOO0o;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

/* renamed from: com.pd.sdk.oOOO00o  reason: case insensitive filesystem */
public abstract class AbstractC8092oOOO00o<T extends AbstractC8104oOOO0o> extends AbstractC7854oO0O0oOO<T> {
    public AbstractC8092oOOO00o(C7925oO0o0OO0 oo0o0oo0) {
        super(oo0o0oo0);
        if (C8093oOOO00o0.OooO0O0 != null && C8093oOOO00o0.OooO0OO != null) {
            Calendar instance = Calendar.getInstance();
            instance.set(1904, 0, 1, 0, 0, 0);
            long time = instance.getTime().getTime();
            String date = new Date((C8093oOOO00o0.OooO0O0.longValue() * 1000) + time).toString();
            String date2 = new Date((C8093oOOO00o0.OooO0OO.longValue() * 1000) + time).toString();
            String str = C8093oOOO00o0.OooO0o;
            ((AbstractC8104oOOO0o) ((AbstractC7854oO0O0oOO) this).f20908OooO00o).m19648OooO00o(101, date);
            ((AbstractC8104oOOO0o) ((AbstractC7854oO0O0oOO) this).f20908OooO00o).m19648OooO00o(102, date2);
            ((AbstractC8104oOOO0o) ((AbstractC7854oO0O0oOO) this).f20908OooO00o).m19648OooO00o(104, str);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7854oO0O0oOO
    public abstract String OooO00o();

    public abstract void OooO00o(@NotNull AbstractC7917oO0o000O oo0o000o, @NotNull C8095oOOO00oo oooo00oo) throws IOException;

    @Override // com.p118pd.sdk.AbstractC7854oO0O0oOO, com.p118pd.sdk.AbstractC7854oO0O0oOO
    public boolean OooO00o(@NotNull C8095oOOO00oo oooo00oo) {
        return oooo00oo.f21103OooO00o.equals(OooO00o()) || oooo00oo.f21103OooO00o.equals("stsd") || oooo00oo.f21103OooO00o.equals("stts");
    }

    public abstract void OooO0O0(@NotNull AbstractC7917oO0o000O oo0o000o, @NotNull C8095oOOO00oo oooo00oo) throws IOException;

    @Override // com.p118pd.sdk.AbstractC7854oO0O0oOO
    public boolean OooO0O0(@NotNull C8095oOOO00oo oooo00oo) {
        return oooo00oo.f21103OooO00o.equals("stbl") || oooo00oo.f21103OooO00o.equals("minf");
    }

    public abstract void OooO0OO(@NotNull AbstractC7917oO0o000O oo0o000o, @NotNull C8095oOOO00oo oooo00oo) throws IOException;

    @Override // com.p118pd.sdk.AbstractC7854oO0O0oOO
    public AbstractC7854oO0O0oOO OooO00o(@NotNull C8095oOOO00oo oooo00oo, @Nullable byte[] bArr) throws IOException {
        if (bArr != null) {
            C7916oO0o000 oo0o000 = new C7916oO0o000(bArr);
            if (oooo00oo.f21103OooO00o.equals(OooO00o())) {
                OooO00o(oo0o000, oooo00oo);
            } else if (oooo00oo.f21103OooO00o.equals("stsd")) {
                OooO0O0(oo0o000, oooo00oo);
            } else if (oooo00oo.f21103OooO00o.equals("stts")) {
                OooO0OO(oo0o000, oooo00oo);
            }
        }
        return this;
    }
}
