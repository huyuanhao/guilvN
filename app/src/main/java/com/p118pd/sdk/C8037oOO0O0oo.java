package com.p118pd.sdk;

import com.drew.imaging.jpeg.JpegSegmentType;
import com.drew.lang.annotations.NotNull;
import java.io.IOException;
import java.util.Collections;

/* renamed from: com.pd.sdk.oOO0O0oo  reason: case insensitive filesystem */
public class C8037oOO0O0oo implements AbstractC8313oOo0o0oO {
    @Override // com.p118pd.sdk.AbstractC8313oOo0o0oO
    @NotNull
    public Iterable<JpegSegmentType> OooO00o() {
        return Collections.singletonList(JpegSegmentType.DNL);
    }

    @Override // com.p118pd.sdk.AbstractC8313oOo0o0oO
    public void OooO00o(@NotNull Iterable<byte[]> iterable, @NotNull C7925oO0o0OO0 oo0o0oo0, @NotNull JpegSegmentType jpegSegmentType) {
        for (byte[] bArr : iterable) {
            OooO00o(bArr, oo0o0oo0, jpegSegmentType);
        }
    }

    public void OooO00o(byte[] bArr, C7925oO0o0OO0 oo0o0oo0, JpegSegmentType jpegSegmentType) {
        C8035oOO0O0o ooo0o0o = (C8035oOO0O0o) oo0o0oo0.OooO00o(C8035oOO0O0o.class);
        if (ooo0o0o == null) {
            C7923oO0o0O0o oo0o0o0o = new C7923oO0o0O0o();
            oo0o0oo0.OooO00o(oo0o0o0o);
            oo0o0o0o.OooO00o("DNL segment found without SOFx - illegal JPEG format");
            return;
        }
        C7916oO0o000 oo0o000 = new C7916oO0o000(bArr);
        try {
            Integer OooO00o = ooo0o0o.m19639OooO00o(1);
            if (OooO00o == null || OooO00o.intValue() == 0) {
                ooo0o0o.OooO00o(1, oo0o000.OooO0OO());
            }
        } catch (IOException e) {
            ooo0o0o.OooO00o(e.getMessage());
        }
    }
}
