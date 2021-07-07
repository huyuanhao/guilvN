package com.p118pd.sdk;

import com.drew.imaging.jpeg.JpegSegmentType;
import com.drew.lang.annotations.NotNull;
import java.util.Collections;

/* renamed from: com.pd.sdk.oOO0O0OO */
public class oOO0O0OO implements AbstractC8313oOo0o0oO {
    @Override // com.p118pd.sdk.AbstractC8313oOo0o0oO
    @NotNull
    public Iterable<JpegSegmentType> OooO00o() {
        return Collections.singletonList(JpegSegmentType.COM);
    }

    @Override // com.p118pd.sdk.AbstractC8313oOo0o0oO
    public void OooO00o(@NotNull Iterable<byte[]> iterable, @NotNull C7925oO0o0OO0 oo0o0oo0, @NotNull JpegSegmentType jpegSegmentType) {
        for (byte[] bArr : iterable) {
            C8033oOO0O0O ooo0o0o = new C8033oOO0O0O();
            oo0o0oo0.OooO00o(ooo0o0o);
            ooo0o0o.OooO00o(0, new C7927oO0o0OOo(bArr, null));
        }
    }
}
