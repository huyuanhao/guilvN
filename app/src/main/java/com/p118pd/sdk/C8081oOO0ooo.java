package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.pd.sdk.oOO0ooo  reason: case insensitive filesystem */
public class C8081oOO0ooo extends AbstractC8043oOO0OOoO {
    public int OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ArrayList<String> f21094OooO00o = new ArrayList<>();

    public C8081oOO0ooo(C7925oO0o0OO0 oo0o0oo0) {
        super(oo0o0oo0);
    }

    @Override // com.p118pd.sdk.AbstractC8043oOO0OOoO, com.p118pd.sdk.oO0OO0O, com.p118pd.sdk.oO0OO0O
    public boolean OooO00o(@NotNull C8044oOO0OOoo ooo0oooo) {
        return ooo0oooo.f21070OooO00o.equals("hdlr") || ooo0oooo.f21070OooO00o.equals(oOO0OO0O.OooO0oo) || ooo0oooo.f21070OooO00o.equals("data");
    }

    @Override // com.p118pd.sdk.AbstractC8043oOO0OOoO, com.p118pd.sdk.oO0OO0O
    public boolean OooO0O0(@NotNull C8044oOO0OOoo ooo0oooo) {
        return ooo0oooo.f21070OooO00o.equals("ilst") || C7891oO0Oo0o.OooO0O0(ooo0oooo.f21070OooO00o.getBytes(), 0, true) <= this.f21094OooO00o.size();
    }

    @Override // com.p118pd.sdk.AbstractC8043oOO0OOoO, com.p118pd.sdk.oO0OO0O
    public oO0OO0O OooO00o(@NotNull C8044oOO0OOoo ooo0oooo, @Nullable byte[] bArr) throws IOException {
        if (bArr != null) {
            C7916oO0o000 oo0o000 = new C7916oO0o000(bArr);
            if (ooo0oooo.f21070OooO00o.equals(oOO0OO0O.OooO0oo)) {
                OooO00o(oo0o000);
            } else if (ooo0oooo.f21070OooO00o.equals("data")) {
                OooO00o(bArr, oo0o000);
            }
        } else {
            int OooO0O0 = C7891oO0Oo0o.OooO0O0(ooo0oooo.f21070OooO00o.getBytes(), 0, true);
            if (OooO0O0 > 0 && OooO0O0 < this.f21094OooO00o.size() + 1) {
                this.OooO00o = OooO0O0 - 1;
            }
        }
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC8043oOO0OOoO
    public void OooO00o(@NotNull C7916oO0o000 oo0o000) throws IOException {
        oo0o000.OooO00o(4L);
        int OooO0O0 = oo0o000.m19622OooO0O0();
        for (int i = 0; i < OooO0O0; i++) {
            int OooO0O02 = oo0o000.m19622OooO0O0();
            oo0o000.OooO00o(4L);
            this.f21094OooO00o.add(new String(oo0o000.OooO00o(OooO0O02 - 8)));
        }
    }

    @Override // com.p118pd.sdk.AbstractC8043oOO0OOoO
    public void OooO00o(@NotNull byte[] bArr, @NotNull C7916oO0o000 oo0o000) throws IOException {
        oo0o000.OooO00o(8L);
        ((oO0OO0O) this).f20924OooO00o.m19648OooO00o(C8005oOO.OooO0OO.get(this.f21094OooO00o.get(this.OooO00o)).intValue(), new String(oo0o000.OooO00o(bArr.length - 8)));
    }
}
