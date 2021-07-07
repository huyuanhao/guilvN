package com.p118pd.sdk;

import com.drew.imaging.jpeg.JpegSegmentType;
import com.drew.lang.annotations.NotNull;
import java.io.IOException;
import java.util.Collections;

/* renamed from: com.pd.sdk.oO0o0o0  reason: case insensitive filesystem */
public class C7932oO0o0o0 implements AbstractC8313oOo0o0oO {
    public static final String OooO00o = "Adobe";

    @Override // com.p118pd.sdk.AbstractC8313oOo0o0oO
    @NotNull
    public Iterable<JpegSegmentType> OooO00o() {
        return Collections.singletonList(JpegSegmentType.APPE);
    }

    @Override // com.p118pd.sdk.AbstractC8313oOo0o0oO
    public void OooO00o(@NotNull Iterable<byte[]> iterable, @NotNull C7925oO0o0OO0 oo0o0oo0, @NotNull JpegSegmentType jpegSegmentType) {
        for (byte[] bArr : iterable) {
            if (bArr.length == 12 && OooO00o.equalsIgnoreCase(new String(bArr, 0, 5))) {
                OooO00o(new C7916oO0o000(bArr), oo0o0oo0);
            }
        }
    }

    public void OooO00o(@NotNull AbstractC7917oO0o000O oo0o000o, @NotNull C7925oO0o0OO0 oo0o0oo0) {
        C7933oO0o0o00 oo0o0o00 = new C7933oO0o0o00();
        oo0o0oo0.OooO00o(oo0o0o00);
        try {
            oo0o000o.OooO00o(false);
            if (!oo0o000o.OooO00o(5).equals(OooO00o)) {
                oo0o0o00.OooO00o("Invalid Adobe JPEG data header.");
                return;
            }
            oo0o0o00.OooO00o(0, oo0o000o.OooO0OO());
            oo0o0o00.OooO00o(1, oo0o000o.OooO0OO());
            oo0o0o00.OooO00o(2, oo0o000o.OooO0OO());
            oo0o0o00.OooO00o(3, (int) oo0o000o.OooO0O0());
        } catch (IOException e) {
            oo0o0o00.OooO00o("IO exception processing data: " + e.getMessage());
        }
    }
}
