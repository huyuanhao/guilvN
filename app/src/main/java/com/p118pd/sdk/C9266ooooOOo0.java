package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import java.io.IOException;

/* renamed from: com.pd.sdk.ooooOOo0  reason: case insensitive filesystem */
public class C9266ooooOOo0 {
    public void OooO00o(@NotNull AbstractC7917oO0o000O oo0o000o, @NotNull C7925oO0o0OO0 oo0o0oo0) {
        oo0o000o.OooO00o(false);
        try {
            if (oo0o000o.OooO0OO() != 0) {
                C8024oOO00oO0 ooo00oo0 = new C8024oOO00oO0();
                ooo00oo0.OooO00o("Invalid header bytes");
                oo0o0oo0.OooO00o(ooo00oo0);
                return;
            }
            int OooO0OO = oo0o000o.OooO0OO();
            if (OooO0OO == 1 || OooO0OO == 2) {
                int OooO0OO2 = oo0o000o.OooO0OO();
                if (OooO0OO2 == 0) {
                    C8024oOO00oO0 ooo00oo02 = new C8024oOO00oO0();
                    ooo00oo02.OooO00o("Image count cannot be zero");
                    oo0o0oo0.OooO00o(ooo00oo02);
                    return;
                }
                for (int i = 0; i < OooO0OO2; i++) {
                    C8024oOO00oO0 ooo00oo03 = new C8024oOO00oO0();
                    try {
                        ooo00oo03.OooO00o(1, OooO0OO);
                        ooo00oo03.OooO00o(2, (int) oo0o000o.m19625OooO0O0());
                        ooo00oo03.OooO00o(3, (int) oo0o000o.m19625OooO0O0());
                        ooo00oo03.OooO00o(4, (int) oo0o000o.m19625OooO0O0());
                        oo0o000o.m19625OooO0O0();
                        if (OooO0OO == 1) {
                            ooo00oo03.OooO00o(5, oo0o000o.OooO0OO());
                            ooo00oo03.OooO00o(7, oo0o000o.OooO0OO());
                        } else {
                            ooo00oo03.OooO00o(6, oo0o000o.OooO0OO());
                            ooo00oo03.OooO00o(8, oo0o000o.OooO0OO());
                        }
                        ooo00oo03.OooO00o(9, oo0o000o.m19626OooO0OO());
                        ooo00oo03.OooO00o(10, oo0o000o.m19626OooO0OO());
                    } catch (IOException e) {
                        ooo00oo03.OooO00o("Exception reading ICO file metadata: " + e.getMessage());
                    }
                    oo0o0oo0.OooO00o(ooo00oo03);
                }
                return;
            }
            C8024oOO00oO0 ooo00oo04 = new C8024oOO00oO0();
            ooo00oo04.OooO00o("Invalid type " + OooO0OO + " -- expecting 1 or 2");
            oo0o0oo0.OooO00o(ooo00oo04);
        } catch (IOException e2) {
            C8024oOO00oO0 ooo00oo05 = new C8024oOO00oO0();
            ooo00oo05.OooO00o("Exception reading ICO file metadata: " + e2.getMessage());
            oo0o0oo0.OooO00o(ooo00oo05);
        }
    }
}
