package com.p118pd.sdk;

import com.drew.imaging.jpeg.JpegSegmentType;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import java.io.IOException;
import java.util.Collections;

/* renamed from: com.pd.sdk.oOO00o0o  reason: case insensitive filesystem */
public class C8023oOO00o0o implements AbstractC8313oOo0o0oO, AbstractC7924oO0o0OO {
    public static final String OooO00o = "ICC_PROFILE";

    private void OooO0O0(@NotNull AbstractC7922oO0o0O0O oo0o0o0o, int i, @NotNull AbstractC7911oO0Oooo oo0oooo) throws IOException {
        int OooO0O0 = oo0oooo.m19604OooO0O0(i);
        if (OooO0O0 != 0) {
            oo0o0o0o.OooO00o(i, OooO0O0);
        }
    }

    private void OooO0OO(@NotNull AbstractC7922oO0o0O0O oo0o0o0o, int i, @NotNull AbstractC7911oO0Oooo oo0oooo) throws IOException {
        long OooO00o2 = oo0oooo.m19596OooO00o(i);
        if (OooO00o2 != 0) {
            oo0o0o0o.OooO00o(i, OooO00o2);
        }
    }

    @Override // com.p118pd.sdk.AbstractC8313oOo0o0oO
    @NotNull
    public Iterable<JpegSegmentType> OooO00o() {
        return Collections.singletonList(JpegSegmentType.APP2);
    }

    @Override // com.p118pd.sdk.AbstractC8313oOo0o0oO
    public void OooO00o(@NotNull Iterable<byte[]> iterable, @NotNull C7925oO0o0OO0 oo0o0oo0, @NotNull JpegSegmentType jpegSegmentType) {
        byte[] bArr = null;
        for (byte[] bArr2 : iterable) {
            if (bArr2.length >= 11 && OooO00o.equalsIgnoreCase(new String(bArr2, 0, 11))) {
                if (bArr == null) {
                    bArr = new byte[(bArr2.length - 14)];
                    System.arraycopy(bArr2, 14, bArr, 0, bArr2.length - 14);
                } else {
                    byte[] bArr3 = new byte[((bArr.length + bArr2.length) - 14)];
                    System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
                    System.arraycopy(bArr2, 14, bArr3, bArr.length, bArr2.length - 14);
                    bArr = bArr3;
                }
            }
        }
        if (bArr != null) {
            OooO00o(new oO0Oo0(bArr), oo0o0oo0);
        }
    }

    @Override // com.p118pd.sdk.AbstractC7924oO0o0OO
    public void OooO00o(@NotNull AbstractC7911oO0Oooo oo0oooo, @NotNull C7925oO0o0OO0 oo0o0oo0) {
        OooO00o(oo0oooo, oo0o0oo0, (AbstractC7922oO0o0O0O) null);
    }

    public void OooO00o(@NotNull AbstractC7911oO0Oooo oo0oooo, @NotNull C7925oO0o0OO0 oo0o0oo0, @Nullable AbstractC7922oO0o0O0O oo0o0o0o) {
        C8022oOO00o0O ooo00o0o = new C8022oOO00o0O();
        if (oo0o0o0o != null) {
            ooo00o0o.OooO00o(oo0o0o0o);
        }
        try {
            ooo00o0o.OooO00o(0, oo0oooo.m19604OooO0O0(0));
            OooO00o((AbstractC7922oO0o0O0O) ooo00o0o, 4, oo0oooo);
            OooO0O0(ooo00o0o, 8, oo0oooo);
            OooO00o((AbstractC7922oO0o0O0O) ooo00o0o, 12, oo0oooo);
            OooO00o((AbstractC7922oO0o0O0O) ooo00o0o, 16, oo0oooo);
            OooO00o((AbstractC7922oO0o0O0O) ooo00o0o, 20, oo0oooo);
            OooO00o(ooo00o0o, 24, oo0oooo);
            OooO00o((AbstractC7922oO0o0O0O) ooo00o0o, 36, oo0oooo);
            OooO00o((AbstractC7922oO0o0O0O) ooo00o0o, 40, oo0oooo);
            OooO0O0(ooo00o0o, 44, oo0oooo);
            OooO00o((AbstractC7922oO0o0O0O) ooo00o0o, 48, oo0oooo);
            int OooO0O0 = oo0oooo.m19604OooO0O0(52);
            if (OooO0O0 != 0) {
                if (OooO0O0 <= 538976288) {
                    ooo00o0o.OooO00o(52, OooO0O0);
                } else {
                    ooo00o0o.m19648OooO00o(52, OooO00o(OooO0O0));
                }
            }
            OooO0O0(ooo00o0o, 64, oo0oooo);
            OooO0OO(ooo00o0o, 56, oo0oooo);
            ooo00o0o.OooO00o(68, (Object) new float[]{oo0oooo.m19603OooO0O0(68), oo0oooo.m19603OooO0O0(72), oo0oooo.m19603OooO0O0(76)});
            int OooO0O02 = oo0oooo.m19604OooO0O0(128);
            ooo00o0o.OooO00o(128, OooO0O02);
            for (int i = 0; i < OooO0O02; i++) {
                int i2 = (i * 12) + 132;
                ooo00o0o.OooO00o(oo0oooo.m19604OooO0O0(i2), oo0oooo.m19602OooO00o(oo0oooo.m19604OooO0O0(i2 + 4), oo0oooo.m19604OooO0O0(i2 + 8)));
            }
        } catch (IOException e) {
            ooo00o0o.OooO00o("Exception reading ICC profile: " + e.getMessage());
        }
        oo0o0oo0.OooO00o(ooo00o0o);
    }

    private void OooO00o(@NotNull AbstractC7922oO0o0O0O oo0o0o0o, int i, @NotNull AbstractC7911oO0Oooo oo0oooo) throws IOException {
        int OooO0O0 = oo0oooo.m19604OooO0O0(i);
        if (OooO0O0 != 0) {
            oo0o0o0o.m19648OooO00o(i, OooO00o(OooO0O0));
        }
    }

    private void OooO00o(@NotNull C8022oOO00o0O ooo00o0o, int i, @NotNull AbstractC7911oO0Oooo oo0oooo) throws IOException {
        int OooO0OO = oo0oooo.OooO0OO(i);
        int OooO0OO2 = oo0oooo.OooO0OO(i + 2);
        int OooO0OO3 = oo0oooo.OooO0OO(i + 4);
        int OooO0OO4 = oo0oooo.OooO0OO(i + 6);
        int OooO0OO5 = oo0oooo.OooO0OO(i + 8);
        int OooO0OO6 = oo0oooo.OooO0OO(i + 10);
        if (!C7894oO0OoO0.OooO00o(OooO0OO, OooO0OO2 - 1, OooO0OO3) || !C7894oO0OoO0.OooO0O0(OooO0OO4, OooO0OO5, OooO0OO6)) {
            ooo00o0o.OooO00o(String.format("ICC data describes an invalid date/time: year=%d month=%d day=%d hour=%d minute=%d second=%d", Integer.valueOf(OooO0OO), Integer.valueOf(OooO0OO2), Integer.valueOf(OooO0OO3), Integer.valueOf(OooO0OO4), Integer.valueOf(OooO0OO5), Integer.valueOf(OooO0OO6)));
            return;
        }
        ooo00o0o.m19648OooO00o(i, String.format("%04d:%02d:%02d %02d:%02d:%02d", Integer.valueOf(OooO0OO), Integer.valueOf(OooO0OO2), Integer.valueOf(OooO0OO3), Integer.valueOf(OooO0OO4), Integer.valueOf(OooO0OO5), Integer.valueOf(OooO0OO6)));
    }

    @NotNull
    public static String OooO00o(int i) {
        return new String(new byte[]{(byte) ((-16777216 & i) >> 24), (byte) ((16711680 & i) >> 16), (byte) ((65280 & i) >> 8), (byte) (i & 255)});
    }
}
