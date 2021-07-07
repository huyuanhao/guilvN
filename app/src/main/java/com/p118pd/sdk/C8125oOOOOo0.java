package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import java.io.IOException;

/* renamed from: com.pd.sdk.oOOOOo0  reason: case insensitive filesystem */
public class C8125oOOOOo0 {
    public static final /* synthetic */ boolean OooO00o = false;

    public void OooO00o(@NotNull AbstractC7917oO0o000O oo0o000o, @NotNull C7925oO0o0OO0 oo0o0oo0) {
        oOOOOo00 oooooo00 = new oOOOOo00();
        oo0o0oo0.OooO00o(oooooo00);
        try {
            if (oo0o000o.m19622OooO0O0() != 943870035) {
                oooooo00.OooO00o("Invalid PSD file signature");
                return;
            }
            int OooO0OO = oo0o000o.OooO0OO();
            if (OooO0OO == 1 || OooO0OO == 2) {
                oo0o000o.OooO00o(6L);
                oooooo00.OooO00o(1, oo0o000o.OooO0OO());
                oooooo00.OooO00o(2, oo0o000o.m19622OooO0O0());
                oooooo00.OooO00o(3, oo0o000o.m19622OooO0O0());
                oooooo00.OooO00o(4, oo0o000o.OooO0OO());
                oooooo00.OooO00o(5, oo0o000o.OooO0OO());
                try {
                    oo0o000o.OooO00o(oo0o000o.m19626OooO0OO());
                    new C8310oOo0o().OooO00o(oo0o000o, (int) oo0o000o.m19626OooO0OO(), oo0o0oo0);
                } catch (IOException unused) {
                }
            } else {
                oooooo00.OooO00o("Invalid PSD file version (must be 1 or 2)");
            }
        } catch (IOException unused2) {
            oooooo00.OooO00o("Unable to read PSD header");
        }
    }
}
