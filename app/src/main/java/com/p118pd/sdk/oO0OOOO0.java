package com.p118pd.sdk;

import com.drew.imaging.riff.RiffProcessingException;
import com.drew.lang.annotations.NotNull;
import java.io.IOException;

/* renamed from: com.pd.sdk.oO0OOOO0 */
public class oO0OOOO0 {
    public void OooO00o(@NotNull AbstractC7917oO0o000O oo0o000o, @NotNull AbstractC7908oO0OooO0 oo0oooo0) throws RiffProcessingException, IOException {
        oo0o000o.OooO00o(false);
        String OooO00o = oo0o000o.OooO00o(4);
        if (OooO00o.equals("RIFF")) {
            int OooO0O0 = oo0o000o.m19622OooO0O0() - 4;
            if (oo0oooo0.OooO0OO(oo0o000o.OooO00o(4))) {
                OooO00o(oo0o000o, OooO0O0, oo0oooo0);
                return;
            }
            return;
        }
        throw new RiffProcessingException("Invalid RIFF header: " + OooO00o);
    }

    public void OooO00o(AbstractC7917oO0o000O oo0o000o, int i, AbstractC7908oO0OooO0 oo0oooo0) throws IOException {
        while (oo0o000o.m19623OooO0O0() < ((long) i)) {
            String str = new String(oo0o000o.m19620OooO00o(4));
            int OooO0O0 = oo0o000o.m19622OooO0O0();
            if (!str.equals("LIST") && !str.equals("RIFF")) {
                if (oo0oooo0.OooO0O0(str)) {
                    oo0oooo0.OooO00o(str, oo0o000o.m19620OooO00o(OooO0O0));
                } else {
                    oo0o000o.OooO00o((long) OooO0O0);
                }
                if (OooO0O0 % 2 == 1) {
                    oo0o000o.OooO00o(1L);
                }
            } else if (oo0oooo0.OooO00o(new String(oo0o000o.m19620OooO00o(4)))) {
                OooO00o(oo0o000o, OooO0O0 - 4, oo0oooo0);
            } else {
                oo0o000o.OooO00o((long) (OooO0O0 - 4));
            }
        }
    }
}
