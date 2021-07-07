package com.p118pd.sdk;

import com.drew.imaging.jpeg.JpegSegmentType;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import java.io.IOException;
import java.util.Collections;

/* renamed from: com.pd.sdk.oOO00oOo  reason: case insensitive filesystem */
public class C8026oOO00oOo implements AbstractC8313oOo0o0oO {
    public static final byte OooO00o = 28;

    @Override // com.p118pd.sdk.AbstractC8313oOo0o0oO
    @NotNull
    public Iterable<JpegSegmentType> OooO00o() {
        return Collections.singletonList(JpegSegmentType.APPD);
    }

    @Override // com.p118pd.sdk.AbstractC8313oOo0o0oO
    public void OooO00o(@NotNull Iterable<byte[]> iterable, @NotNull C7925oO0o0OO0 oo0o0oo0, @NotNull JpegSegmentType jpegSegmentType) {
        for (byte[] bArr : iterable) {
            if (bArr.length != 0 && bArr[0] == 28) {
                OooO00o(new C7916oO0o000(bArr), oo0o0oo0, (long) bArr.length);
            }
        }
    }

    public void OooO00o(@NotNull AbstractC7917oO0o000O oo0o000o, @NotNull C7925oO0o0OO0 oo0o0oo0, long j) {
        OooO00o(oo0o000o, oo0o0oo0, j, null);
    }

    public void OooO00o(@NotNull AbstractC7917oO0o000O oo0o000o, @NotNull C7925oO0o0OO0 oo0o0oo0, long j, @Nullable AbstractC7922oO0o0O0O oo0o0o0o) {
        C8025oOO00oOO ooo00ooo = new C8025oOO00oOO();
        oo0o0oo0.OooO00o(ooo00ooo);
        if (oo0o0o0o != null) {
            ooo00ooo.OooO00o(oo0o0o0o);
        }
        int i = 0;
        while (((long) i) < j) {
            try {
                short OooO0O0 = oo0o000o.m19625OooO0O0();
                int i2 = i + 1;
                if (OooO0O0 != 28) {
                    if (((long) i2) != j) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Invalid IPTC tag marker at offset ");
                        sb.append(i2 - 1);
                        sb.append(". Expected '0x");
                        sb.append(Integer.toHexString(28));
                        sb.append("' but got '0x");
                        sb.append(Integer.toHexString(OooO0O0));
                        sb.append("'.");
                        ooo00ooo.OooO00o(sb.toString());
                        return;
                    }
                    return;
                } else if (((long) (i2 + 4)) > j) {
                    ooo00ooo.OooO00o("Too few bytes remain for a valid IPTC tag");
                    return;
                } else {
                    try {
                        short OooO0O02 = oo0o000o.m19625OooO0O0();
                        short OooO0O03 = oo0o000o.m19625OooO0O0();
                        int OooO0OO = oo0o000o.OooO0OO();
                        if (OooO0OO > 32767) {
                            OooO0OO = ((OooO0OO & 32767) << 16) | oo0o000o.OooO0OO();
                            i2 += 2;
                        }
                        i = i2 + 4 + OooO0OO;
                        if (((long) i) > j) {
                            ooo00ooo.OooO00o("Data for tag extends beyond end of IPTC segment");
                            return;
                        }
                        try {
                            OooO00o(oo0o000o, ooo00ooo, OooO0O02, OooO0O03, OooO0OO);
                        } catch (IOException unused) {
                            ooo00ooo.OooO00o("Error processing IPTC tag");
                            return;
                        }
                    } catch (IOException unused2) {
                        ooo00ooo.OooO00o("IPTC data segment ended mid-way through tag descriptor");
                        return;
                    }
                }
            } catch (IOException unused3) {
                ooo00ooo.OooO00o("Unable to read starting byte of IPTC tag");
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
        if (r6 != 582) goto L_0x0059;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void OooO00o(@com.drew.lang.annotations.NotNull com.p118pd.sdk.AbstractC7917oO0o000O r4, @com.drew.lang.annotations.NotNull com.p118pd.sdk.AbstractC7922oO0o0O0O r5, int r6, int r7, int r8) throws java.io.IOException {
        /*
        // Method dump skipped, instructions count: 169
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8026oOO00oOo.OooO00o(com.pd.sdk.oO0o000O, com.pd.sdk.oO0o0O0O, int, int, int):void");
    }
}
