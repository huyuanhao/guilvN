package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.pd.sdk.oO0OOO0 */
public class oO0OOO0 {
    public static void OooO00o(@NotNull InputStream inputStream, @NotNull oO0OO0O oo0oo0o) {
        C8986ooOOoOoo oooooooo = new C8986ooOOoOoo(inputStream);
        oooooooo.OooO00o(true);
        OooO00o(oooooooo, -1, oo0oo0o);
    }

    public static void OooO00o(C8986ooOOoOoo oooooooo, long j, oO0OO0O oo0oo0o) {
        while (true) {
            if (j != -1) {
                try {
                    if (oooooooo.OooO0O0() >= j) {
                        return;
                    }
                } catch (IOException e) {
                    oo0oo0o.OooO00o(e.getMessage());
                    return;
                }
            }
            C8044oOO0OOoo ooo0oooo = new C8044oOO0OOoo(oooooooo);
            if (oo0oo0o.OooO0O0(ooo0oooo)) {
                OooO00o(oooooooo, (ooo0oooo.OooO00o + oooooooo.OooO0O0()) - 8, oo0oo0o.OooO00o(ooo0oooo));
            } else if (oo0oo0o.m19552OooO00o(ooo0oooo)) {
                oo0oo0o = oo0oo0o.OooO00o(ooo0oooo, oooooooo.OooO00o(((int) ooo0oooo.OooO00o) - 8));
            } else if (ooo0oooo.OooO00o > 1) {
                oooooooo.m20653OooO00o(ooo0oooo.OooO00o - 8);
            } else if (ooo0oooo.OooO00o == -1) {
                return;
            }
        }
    }
}
