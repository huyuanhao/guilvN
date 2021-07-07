package com.p118pd.sdk;

import com.drew.imaging.jpeg.JpegSegmentType;
import com.drew.lang.annotations.NotNull;
import java.io.IOException;
import java.util.Collections;

/* renamed from: com.pd.sdk.ooooOoOO  reason: case insensitive filesystem */
public class C9272ooooOoOO implements AbstractC8313oOo0o0oO, AbstractC7924oO0o0OO {
    public static final String OooO00o = "JFIF";

    @Override // com.p118pd.sdk.AbstractC8313oOo0o0oO
    @NotNull
    public Iterable<JpegSegmentType> OooO00o() {
        return Collections.singletonList(JpegSegmentType.APP0);
    }

    @Override // com.p118pd.sdk.AbstractC8313oOo0o0oO
    public void OooO00o(@NotNull Iterable<byte[]> iterable, @NotNull C7925oO0o0OO0 oo0o0oo0, @NotNull JpegSegmentType jpegSegmentType) {
        for (byte[] bArr : iterable) {
            if (bArr.length >= 4 && OooO00o.equals(new String(bArr, 0, 4))) {
                OooO00o(new oO0Oo0(bArr), oo0o0oo0);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC7924oO0o0OO
    public void OooO00o(@NotNull AbstractC7911oO0Oooo oo0oooo, @NotNull C7925oO0o0OO0 oo0o0oo0) {
        oOO0 ooo0 = new oOO0();
        oo0o0oo0.OooO00o(ooo0);
        try {
            ooo0.OooO00o(5, oo0oooo.OooO0OO(5));
            ooo0.OooO00o(7, (int) oo0oooo.m19607OooO0O0(7));
            ooo0.OooO00o(8, oo0oooo.OooO0OO(8));
            ooo0.OooO00o(10, oo0oooo.OooO0OO(10));
            ooo0.OooO00o(12, (int) oo0oooo.m19607OooO0O0(12));
            ooo0.OooO00o(13, (int) oo0oooo.m19607OooO0O0(13));
        } catch (IOException e) {
            ooo0.OooO00o(e.getMessage());
        }
    }
}
