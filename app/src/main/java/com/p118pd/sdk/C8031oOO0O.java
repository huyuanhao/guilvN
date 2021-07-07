package com.p118pd.sdk;

import com.drew.imaging.jpeg.JpegSegmentType;
import com.drew.lang.annotations.NotNull;
import com.drew.metadata.jpeg.JpegComponent;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.pd.sdk.oOO0O  reason: case insensitive filesystem */
public class C8031oOO0O implements AbstractC8313oOo0o0oO {
    @Override // com.p118pd.sdk.AbstractC8313oOo0o0oO
    @NotNull
    public Iterable<JpegSegmentType> OooO00o() {
        return Arrays.asList(JpegSegmentType.SOF0, JpegSegmentType.SOF1, JpegSegmentType.SOF2, JpegSegmentType.SOF3, JpegSegmentType.SOF5, JpegSegmentType.SOF6, JpegSegmentType.SOF7, JpegSegmentType.SOF9, JpegSegmentType.SOF10, JpegSegmentType.SOF11, JpegSegmentType.SOF13, JpegSegmentType.SOF14, JpegSegmentType.SOF15);
    }

    @Override // com.p118pd.sdk.AbstractC8313oOo0o0oO
    public void OooO00o(@NotNull Iterable<byte[]> iterable, @NotNull C7925oO0o0OO0 oo0o0oo0, @NotNull JpegSegmentType jpegSegmentType) {
        for (byte[] bArr : iterable) {
            OooO00o(bArr, oo0o0oo0, jpegSegmentType);
        }
    }

    public void OooO00o(byte[] bArr, C7925oO0o0OO0 oo0o0oo0, JpegSegmentType jpegSegmentType) {
        C8035oOO0O0o ooo0o0o = new C8035oOO0O0o();
        oo0o0oo0.OooO00o(ooo0o0o);
        ooo0o0o.OooO00o(-3, jpegSegmentType.byteValue - JpegSegmentType.SOF0.byteValue);
        C7916oO0o000 oo0o000 = new C7916oO0o000(bArr);
        try {
            ooo0o0o.OooO00o(0, (int) oo0o000.m19625OooO0O0());
            ooo0o0o.OooO00o(1, oo0o000.OooO0OO());
            ooo0o0o.OooO00o(3, oo0o000.OooO0OO());
            short OooO0O0 = oo0o000.m19625OooO0O0();
            ooo0o0o.OooO00o(5, (int) OooO0O0);
            for (int i = 0; i < OooO0O0; i++) {
                ooo0o0o.OooO00o(i + 6, new JpegComponent(oo0o000.m19625OooO0O0(), oo0o000.m19625OooO0O0(), oo0o000.m19625OooO0O0()));
            }
        } catch (IOException e) {
            ooo0o0o.OooO00o(e.getMessage());
        }
    }
}
