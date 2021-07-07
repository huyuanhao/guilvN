package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import java.io.IOException;

/* renamed from: com.pd.sdk.oOO0OOoO  reason: case insensitive filesystem */
public abstract class AbstractC8043oOO0OOoO extends oO0OO0O {
    public AbstractC8043oOO0OOoO(C7925oO0o0OO0 oo0o0oo0) {
        super(oo0o0oo0);
    }

    @Override // com.p118pd.sdk.oO0OO0O
    @NotNull
    public oOO0OOOO OooO00o() {
        return new C8005oOO();
    }

    public abstract void OooO00o(@NotNull C7916oO0o000 oo0o000) throws IOException;

    public abstract void OooO00o(@NotNull byte[] bArr, @NotNull C7916oO0o000 oo0o000) throws IOException;

    @Override // com.p118pd.sdk.oO0OO0O
    public boolean OooO0O0(@NotNull C8044oOO0OOoo ooo0oooo) {
        return ooo0oooo.f21070OooO00o.equals("ilst");
    }

    @Override // com.p118pd.sdk.oO0OO0O, com.p118pd.sdk.oO0OO0O
    public boolean OooO00o(@NotNull C8044oOO0OOoo ooo0oooo) {
        return ooo0oooo.f21070OooO00o.equals("hdlr") || ooo0oooo.f21070OooO00o.equals(oOO0OO0O.OooO0oo) || ooo0oooo.f21070OooO00o.equals("data");
    }

    @Override // com.p118pd.sdk.oO0OO0O
    public oO0OO0O OooO00o(@NotNull C8044oOO0OOoo ooo0oooo, @Nullable byte[] bArr) throws IOException {
        if (bArr != null) {
            C7916oO0o000 oo0o000 = new C7916oO0o000(bArr);
            if (ooo0oooo.f21070OooO00o.equals(oOO0OO0O.OooO0oo)) {
                OooO00o(oo0o000);
            } else if (ooo0oooo.f21070OooO00o.equals("data")) {
                OooO00o(bArr, oo0o000);
            }
        }
        return this;
    }
}
