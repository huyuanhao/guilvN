package com.p118pd.sdk;

import com.adobe.xmp.XMPException;
import com.drew.imaging.jpeg.JpegSegmentType;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import java.io.IOException;
import java.util.Collections;

/* renamed from: com.pd.sdk.oOOOo00o  reason: case insensitive filesystem */
public class C8138oOOOo00o implements AbstractC8313oOo0o0oO {
    public static final int OooO00o = 32;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f21151OooO00o = "http://ns.adobe.com/xap/1.0/\u0000";
    public static final int OooO0O0 = 4;
    @NotNull

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final String f21152OooO0O0 = "http://ns.adobe.com/xmp/extension/\u0000";
    @NotNull
    public static final String OooO0OO = "http://ns.adobe.com/xmp/note/";
    @NotNull
    public static final String OooO0Oo = "xmpNote:HasExtendedXMP";

    @Override // com.p118pd.sdk.AbstractC8313oOo0o0oO
    @NotNull
    public Iterable<JpegSegmentType> OooO00o() {
        return Collections.singletonList(JpegSegmentType.APP1);
    }

    @Override // com.p118pd.sdk.AbstractC8313oOo0o0oO
    public void OooO00o(@NotNull Iterable<byte[]> iterable, @NotNull C7925oO0o0OO0 oo0o0oo0, @NotNull JpegSegmentType jpegSegmentType) {
        byte[] bArr = null;
        String str = null;
        for (byte[] bArr2 : iterable) {
            if (bArr2.length >= 29 && (f21151OooO00o.equalsIgnoreCase(new String(bArr2, 0, 29)) || "XMP".equalsIgnoreCase(new String(bArr2, 0, 3)))) {
                int length = bArr2.length - 29;
                byte[] bArr3 = new byte[length];
                System.arraycopy(bArr2, 29, bArr3, 0, length);
                OooO00o(bArr3, oo0o0oo0);
                str = OooO00o(oo0o0oo0);
            } else if (str != null && bArr2.length >= 35 && f21152OooO0O0.equalsIgnoreCase(new String(bArr2, 0, 35))) {
                bArr = OooO00o(oo0o0oo0, bArr2, str, bArr);
            }
        }
        if (bArr != null) {
            OooO00o(bArr, oo0o0oo0);
        }
    }

    public void OooO00o(@NotNull byte[] bArr, @NotNull C7925oO0o0OO0 oo0o0oo0) {
        OooO00o(bArr, oo0o0oo0, (AbstractC7922oO0o0O0O) null);
    }

    public void OooO00o(@NotNull byte[] bArr, @NotNull C7925oO0o0OO0 oo0o0oo0, @Nullable AbstractC7922oO0o0O0O oo0o0o0o) {
        OooO00o(bArr, 0, bArr.length, oo0o0oo0, oo0o0o0o);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void OooO00o(@com.drew.lang.annotations.NotNull byte[] r2, int r3, int r4, @com.drew.lang.annotations.NotNull com.p118pd.sdk.C7925oO0o0OO0 r5, @com.drew.lang.annotations.Nullable com.p118pd.sdk.AbstractC7922oO0o0O0O r6) {
        /*
            r1 = this;
            com.pd.sdk.oOOOo00O r0 = new com.pd.sdk.oOOOo00O
            r0.<init>()
            if (r6 == 0) goto L_0x000a
            r0.OooO00o(r6)
        L_0x000a:
            if (r3 != 0) goto L_0x0014
            int r6 = r2.length     // Catch:{ XMPException -> 0x0025 }
            if (r4 != r6) goto L_0x0014
            com.pd.sdk.o0OOo000 r2 = com.p118pd.sdk.C7415o0OOo00.OooO00o(r2)     // Catch:{ XMPException -> 0x0025 }
            goto L_0x0021
        L_0x0014:
            com.pd.sdk.o0OOo0OO r6 = new com.pd.sdk.o0OOo0OO     // Catch:{ XMPException -> 0x0025 }
            r6.<init>(r2, r3, r4)     // Catch:{ XMPException -> 0x0025 }
            java.io.InputStream r2 = r6.m18988OooO00o()     // Catch:{ XMPException -> 0x0025 }
            com.pd.sdk.o0OOo000 r2 = com.p118pd.sdk.C7415o0OOo00.OooO00o(r2)     // Catch:{ XMPException -> 0x0025 }
        L_0x0021:
            r0.OooO00o(r2)     // Catch:{ XMPException -> 0x0025 }
            goto L_0x003e
        L_0x0025:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Error processing XMP data: "
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r0.OooO00o(r2)
        L_0x003e:
            boolean r2 = r0.m19656OooO0O0()
            if (r2 != 0) goto L_0x0047
            r5.OooO00o(r0)
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8138oOOOo00o.OooO00o(byte[], int, int, com.pd.sdk.oO0o0OO0, com.pd.sdk.oO0o0O0O):void");
    }

    public void OooO00o(@NotNull String str, @NotNull C7925oO0o0OO0 oo0o0oo0) {
        OooO00o(str, oo0o0oo0, (AbstractC7922oO0o0O0O) null);
    }

    public void OooO00o(@NotNull C7927oO0o0OOo oo0o0ooo, @NotNull C7925oO0o0OO0 oo0o0oo0) {
        OooO00o(oo0o0ooo.m19665OooO00o(), oo0o0oo0, (AbstractC7922oO0o0O0O) null);
    }

    public void OooO00o(@NotNull String str, @NotNull C7925oO0o0OO0 oo0o0oo0, @Nullable AbstractC7922oO0o0O0O oo0o0o0o) {
        C8137oOOOo00O ooooo00o = new C8137oOOOo00O();
        if (oo0o0o0o != null) {
            ooooo00o.OooO00o(oo0o0o0o);
        }
        try {
            ooooo00o.OooO00o(C7415o0OOo00.OooO00o(str));
        } catch (XMPException e) {
            ooooo00o.OooO00o("Error processing XMP data: " + e.getMessage());
        }
        if (!ooooo00o.m19656OooO0O0()) {
            oo0o0oo0.OooO00o(ooooo00o);
        }
    }

    @Nullable
    public static String OooO00o(@NotNull C7925oO0o0OO0 oo0o0oo0) {
        for (C8137oOOOo00O ooooo00o : oo0o0oo0.m19662OooO00o(C8137oOOOo00O.class)) {
            try {
                AbstractC7414o0OOOooo OooO00o2 = ooooo00o.OooO00o().OooO00o("http://ns.adobe.com/xmp/note/", (String) null, (C7452o0Oo00oO) null);
                if (OooO00o2 != null) {
                    while (OooO00o2.hasNext()) {
                        AbstractC7454o0Oo0O o0oo0o = (AbstractC7454o0Oo0O) OooO00o2.next();
                        if (OooO0Oo.equals(o0oo0o.m19081OooO00o())) {
                            return o0oo0o.getValue();
                        }
                    }
                    continue;
                }
            } catch (XMPException unused) {
            }
        }
        return null;
    }

    @Nullable
    public static byte[] OooO00o(@NotNull C7925oO0o0OO0 oo0o0oo0, @NotNull byte[] bArr, @NotNull String str, @Nullable byte[] bArr2) {
        int length = bArr.length;
        if (length >= 75) {
            try {
                C7916oO0o000 oo0o000 = new C7916oO0o000(bArr);
                oo0o000.OooO00o((long) 35);
                if (str.equals(oo0o000.OooO00o(32))) {
                    int OooO0OO2 = (int) oo0o000.m19626OooO0OO();
                    int OooO0OO3 = (int) oo0o000.m19626OooO0OO();
                    if (bArr2 == null) {
                        bArr2 = new byte[OooO0OO2];
                    }
                    if (bArr2.length == OooO0OO2) {
                        System.arraycopy(bArr, 75, bArr2, OooO0OO3, length - 75);
                    } else {
                        C8137oOOOo00O ooooo00o = new C8137oOOOo00O();
                        ooooo00o.OooO00o(String.format("Inconsistent length for the Extended XMP buffer: %d instead of %d", Integer.valueOf(OooO0OO2), Integer.valueOf(bArr2.length)));
                        oo0o0oo0.OooO00o(ooooo00o);
                    }
                }
            } catch (IOException e) {
                C8137oOOOo00O ooooo00o2 = new C8137oOOOo00O();
                ooooo00o2.OooO00o(e.getMessage());
                oo0o0oo0.OooO00o(ooooo00o2);
            }
        }
        return bArr2;
    }
}
