package com.p118pd.sdk;

import com.drew.imaging.jpeg.JpegSegmentType;
import com.drew.lang.annotations.NotNull;
import java.io.IOException;
import java.util.Collections;

/* renamed from: com.pd.sdk.oOOOO0o0  reason: case insensitive filesystem */
public class C8120oOOOO0o0 implements AbstractC8313oOo0o0oO {
    @NotNull
    public static final String OooO00o = "Ducky";

    @Override // com.p118pd.sdk.AbstractC8313oOo0o0oO
    @NotNull
    public Iterable<JpegSegmentType> OooO00o() {
        return Collections.singletonList(JpegSegmentType.APPC);
    }

    @Override // com.p118pd.sdk.AbstractC8313oOo0o0oO
    public void OooO00o(@NotNull Iterable<byte[]> iterable, @NotNull C7925oO0o0OO0 oo0o0oo0, @NotNull JpegSegmentType jpegSegmentType) {
        for (byte[] bArr : iterable) {
            if (bArr.length >= 5 && OooO00o.equals(new String(bArr, 0, 5))) {
                OooO00o(new C7916oO0o000(bArr, 5), oo0o0oo0);
            }
        }
    }

    public void OooO00o(@NotNull AbstractC7917oO0o000O oo0o000o, @NotNull C7925oO0o0OO0 oo0o0oo0) {
        C8118oOOOO0Oo ooooo0oo = new C8118oOOOO0Oo();
        oo0o0oo0.OooO00o(ooooo0oo);
        while (true) {
            try {
                int OooO0OO = oo0o000o.OooO0OO();
                if (OooO0OO != 0) {
                    int OooO0OO2 = oo0o000o.OooO0OO();
                    if (OooO0OO != 1) {
                        if (OooO0OO == 2 || OooO0OO == 3) {
                            oo0o000o.OooO00o(4L);
                            ooooo0oo.OooO00o(OooO0OO, oo0o000o.OooO0O0(OooO0OO2 - 4, C7895oO0OoO00.OooO0o0));
                        } else {
                            ooooo0oo.OooO00o(OooO0OO, oo0o000o.m19620OooO00o(OooO0OO2));
                        }
                    } else if (OooO0OO2 != 4) {
                        ooooo0oo.OooO00o("Unexpected length for the quality tag");
                        return;
                    } else {
                        ooooo0oo.OooO00o(OooO0OO, oo0o000o.m19622OooO0O0());
                    }
                } else {
                    return;
                }
            } catch (IOException e) {
                ooooo0oo.OooO00o(e.getMessage());
                return;
            }
        }
    }
}
