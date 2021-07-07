package com.p118pd.sdk;

import com.drew.imaging.ImageProcessingException;
import com.drew.lang.annotations.NotNull;

/* renamed from: com.pd.sdk.oOOOO0O  reason: case insensitive filesystem */
public class C8117oOOOO0O {
    public void OooO00o(@NotNull AbstractC7917oO0o000O oo0o000o, @NotNull C7925oO0o0OO0 oo0o0oo0) {
        oo0o000o.OooO00o(false);
        oOOOO0O0 ooooo0o0 = new oOOOO0O0();
        oo0o0oo0.OooO00o(ooooo0o0);
        try {
            if (oo0o000o.OooO0O0() == 10) {
                ooooo0o0.OooO00o(1, (int) oo0o000o.OooO0O0());
                if (oo0o000o.OooO0O0() == 1) {
                    ooooo0o0.OooO00o(2, (int) oo0o000o.m19625OooO0O0());
                    ooooo0o0.OooO00o(3, oo0o000o.OooO0OO());
                    ooooo0o0.OooO00o(4, oo0o000o.OooO0OO());
                    ooooo0o0.OooO00o(5, oo0o000o.OooO0OO());
                    ooooo0o0.OooO00o(6, oo0o000o.OooO0OO());
                    ooooo0o0.OooO00o(7, oo0o000o.OooO0OO());
                    ooooo0o0.OooO00o(8, oo0o000o.OooO0OO());
                    ooooo0o0.OooO00o(9, oo0o000o.m19620OooO00o(48));
                    oo0o000o.OooO00o(1L);
                    ooooo0o0.OooO00o(10, (int) oo0o000o.m19625OooO0O0());
                    ooooo0o0.OooO00o(11, oo0o000o.OooO0OO());
                    int OooO0OO = oo0o000o.OooO0OO();
                    if (OooO0OO != 0) {
                        ooooo0o0.OooO00o(12, OooO0OO);
                    }
                    int OooO0OO2 = oo0o000o.OooO0OO();
                    if (OooO0OO2 != 0) {
                        ooooo0o0.OooO00o(13, OooO0OO2);
                    }
                    int OooO0OO3 = oo0o000o.OooO0OO();
                    if (OooO0OO3 != 0) {
                        ooooo0o0.OooO00o(14, OooO0OO3);
                        return;
                    }
                    return;
                }
                throw new ImageProcessingException("Invalid PCX encoding byte");
            }
            throw new ImageProcessingException("Invalid PCX identifier byte");
        } catch (Exception e) {
            ooooo0o0.OooO00o("Exception reading PCX file metadata: " + e.getMessage());
        }
    }
}
