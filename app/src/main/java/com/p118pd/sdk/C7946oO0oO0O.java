package com.p118pd.sdk;

import com.drew.imaging.jpeg.JpegSegmentType;
import com.drew.imaging.tiff.TiffProcessingException;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import java.io.IOException;
import java.util.Collections;

/* renamed from: com.pd.sdk.oO0oO0O  reason: case insensitive filesystem */
public class C7946oO0oO0O implements AbstractC8313oOo0o0oO {
    public static final String OooO00o = "Exif\u0000\u0000";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final /* synthetic */ boolean f21010OooO00o = false;

    @Override // com.p118pd.sdk.AbstractC8313oOo0o0oO
    @NotNull
    public Iterable<JpegSegmentType> OooO00o() {
        return Collections.singletonList(JpegSegmentType.APP1);
    }

    @Override // com.p118pd.sdk.AbstractC8313oOo0o0oO
    public void OooO00o(@NotNull Iterable<byte[]> iterable, @NotNull C7925oO0o0OO0 oo0o0oo0, @NotNull JpegSegmentType jpegSegmentType) {
        for (byte[] bArr : iterable) {
            if (bArr.length >= 6 && new String(bArr, 0, 6).equals("Exif\u0000\u0000")) {
                OooO00o(new oO0Oo0(bArr), oo0o0oo0, 6);
            }
        }
    }

    public void OooO00o(@NotNull AbstractC7911oO0Oooo oo0oooo, @NotNull C7925oO0o0OO0 oo0o0oo0) {
        OooO00o(oo0oooo, oo0o0oo0, 0);
    }

    public void OooO00o(@NotNull AbstractC7911oO0Oooo oo0oooo, @NotNull C7925oO0o0OO0 oo0o0oo0, int i) {
        OooO00o(oo0oooo, oo0o0oo0, i, null);
    }

    public void OooO00o(@NotNull AbstractC7911oO0Oooo oo0oooo, @NotNull C7925oO0o0OO0 oo0o0oo0, int i, @Nullable AbstractC7922oO0o0O0O oo0o0o0o) {
        C7950oO0oO0o0 oo0oo0o0 = new C7950oO0oO0o0(oo0o0oo0, oo0o0o0o);
        try {
            new C7871oO0OOo().OooO00o(oo0oooo, oo0oo0o0, i);
        } catch (TiffProcessingException e) {
            oo0oo0o0.OooO0O0("Exception processing TIFF data: " + e.getMessage());
            e.printStackTrace(System.err);
        } catch (IOException e2) {
            oo0oo0o0.OooO0O0("Exception processing TIFF data: " + e2.getMessage());
            e2.printStackTrace(System.err);
        }
    }
}
