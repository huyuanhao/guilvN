package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.pd.sdk.oOo00OOo  reason: case insensitive filesystem */
public class C8291oOo00OOo {
    public static void OooO00o(@NotNull InputStream inputStream, @NotNull AbstractC7854oO0O0oOO oo0o0ooo) {
        C8986ooOOoOoo oooooooo = new C8986ooOOoOoo(inputStream);
        oooooooo.OooO00o(true);
        OooO00o(oooooooo, -1, oo0o0ooo);
    }

    public static void OooO00o(C8986ooOOoOoo oooooooo, long j, AbstractC7854oO0O0oOO oo0o0ooo) {
        while (true) {
            if (j != -1) {
                try {
                    if (oooooooo.OooO0O0() >= j) {
                        return;
                    }
                } catch (IOException e) {
                    oo0o0ooo.OooO00o(e.getMessage());
                    return;
                }
            }
            C8095oOOO00oo oooo00oo = new C8095oOOO00oo(oooooooo);
            if (oo0o0ooo.OooO0O0(oooo00oo)) {
                OooO00o(oooooooo, (oooo00oo.OooO00o + oooooooo.OooO0O0()) - 8, oo0o0ooo.OooO00o(oooo00oo));
            } else if (oo0o0ooo.m19543OooO00o(oooo00oo)) {
                oo0o0ooo = oo0o0ooo.OooO00o(oooo00oo, oooooooo.OooO00o(((int) oooo00oo.OooO00o) - 8));
            } else if (oooo00oo.OooO0O0 != null) {
                oooooooo.m20653OooO00o(oooo00oo.OooO00o - 24);
            } else if (oooo00oo.OooO00o > 1) {
                oooooooo.m20653OooO00o(oooo00oo.OooO00o - 8);
            } else if (oooo00oo.OooO00o == -1) {
                return;
            }
        }
    }
}
