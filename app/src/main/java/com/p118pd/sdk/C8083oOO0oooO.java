package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import java.io.IOException;

/* renamed from: com.pd.sdk.oOO0oooO  reason: case insensitive filesystem */
public class C8083oOO0oooO extends AbstractC8043oOO0OOoO {
    public String OooO00o;

    public C8083oOO0oooO(C7925oO0o0OO0 oo0o0oo0) {
        super(oo0o0oo0);
    }

    @Override // com.p118pd.sdk.AbstractC8043oOO0OOoO
    public void OooO00o(@NotNull C7916oO0o000 oo0o000) throws IOException {
    }

    @Override // com.p118pd.sdk.AbstractC8043oOO0OOoO, com.p118pd.sdk.oO0OO0O, com.p118pd.sdk.oO0OO0O
    public boolean OooO00o(@NotNull C8044oOO0OOoo ooo0oooo) {
        return ooo0oooo.f21070OooO00o.equals("data");
    }

    @Override // com.p118pd.sdk.AbstractC8043oOO0OOoO, com.p118pd.sdk.oO0OO0O
    public boolean OooO0O0(@NotNull C8044oOO0OOoo ooo0oooo) {
        return C8005oOO.OooO0OO.containsKey(ooo0oooo.f21070OooO00o) || ooo0oooo.f21070OooO00o.equals("ilst");
    }

    @Override // com.p118pd.sdk.AbstractC8043oOO0OOoO, com.p118pd.sdk.oO0OO0O
    public oO0OO0O OooO00o(@NotNull C8044oOO0OOoo ooo0oooo, @Nullable byte[] bArr) throws IOException {
        if (bArr != null) {
            C7916oO0o000 oo0o000 = new C7916oO0o000(bArr);
            if (!ooo0oooo.f21070OooO00o.equals("data") || this.OooO00o == null) {
                this.OooO00o = new String(oo0o000.OooO00o(4));
            } else {
                OooO00o(bArr, oo0o000);
            }
        } else if (C8005oOO.OooO0OO.containsKey(ooo0oooo.f21070OooO00o)) {
            this.OooO00o = ooo0oooo.f21070OooO00o;
        } else {
            this.OooO00o = null;
        }
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC8043oOO0OOoO
    public void OooO00o(@NotNull byte[] bArr, @NotNull C7916oO0o000 oo0o000) throws IOException {
        oo0o000.OooO00o(8L);
        ((oO0OO0O) this).f20924OooO00o.m19648OooO00o(C8005oOO.OooO0OO.get(this.OooO00o).intValue(), new String(oo0o000.OooO00o(bArr.length - 8)));
    }
}
