package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import com.drew.metadata.gif.GifControlDirectory;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: com.pd.sdk.oOO00o0  reason: case insensitive filesystem */
public class C8020oOO00o0 {
    public static final String OooO00o = "87a";
    public static final String OooO0O0 = "89a";

    public static void OooO0O0(AbstractC7917oO0o000O oo0o000o, C7925oO0o0OO0 oo0o0oo0) throws IOException {
        byte OooO0O02 = oo0o000o.OooO0O0();
        short OooO0O03 = oo0o000o.m19625OooO0O0();
        long OooO0O04 = oo0o000o.m19623OooO0O0();
        if (OooO0O02 == -7) {
            oo0o0oo0.OooO00o(OooO00o(oo0o000o, (int) OooO0O03));
        } else if (OooO0O02 == 1) {
            AbstractC7922oO0o0O0O OooO00o2 = m19717OooO00o(oo0o000o, (int) OooO0O03);
            if (OooO00o2 != null) {
                oo0o0oo0.OooO00o(OooO00o2);
            }
        } else if (OooO0O02 == -2) {
            oo0o0oo0.OooO00o(m19718OooO00o(oo0o000o, (int) OooO0O03));
        } else if (OooO0O02 != -1) {
            oo0o0oo0.OooO00o(new C7923oO0o0O0o(String.format("Unsupported GIF extension block with type 0x%02X.", Byte.valueOf(OooO0O02))));
        } else {
            OooO00o(oo0o000o, OooO0O03, oo0o0oo0);
        }
        long OooO0O05 = (OooO0O04 + ((long) OooO0O03)) - oo0o000o.m19623OooO0O0();
        if (OooO0O05 > 0) {
            oo0o000o.OooO00o(OooO0O05);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:11|12) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r6.OooO00o(new com.p118pd.sdk.C7923oO0o0O0o("GIF did not had hasGlobalColorTable bit."));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0063, code lost:
        r6.OooO00o(new com.p118pd.sdk.C7923oO0o0O0o("IOException processing GIF data"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006b, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0022 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void OooO00o(@com.drew.lang.annotations.NotNull com.p118pd.sdk.AbstractC7917oO0o000O r5, @com.drew.lang.annotations.NotNull com.p118pd.sdk.C7925oO0o0OO0 r6) {
        /*
        // Method dump skipped, instructions count: 117
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8020oOO00o0.OooO00o(com.pd.sdk.oO0o000O, com.pd.sdk.oO0o0OO0):void");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static C9273ooooOoOo m19719OooO00o(@NotNull AbstractC7917oO0o000O oo0o000o) throws IOException {
        C9273ooooOoOo oooooooo = new C9273ooooOoOo();
        if (!oo0o000o.OooO00o(3).equals("GIF")) {
            oooooooo.OooO00o("Invalid GIF file signature");
            return oooooooo;
        }
        String OooO00o2 = oo0o000o.OooO00o(3);
        if (OooO00o2.equals(OooO00o) || OooO00o2.equals(OooO0O0)) {
            boolean z = true;
            oooooooo.m19648OooO00o(1, OooO00o2);
            oooooooo.OooO00o(2, oo0o000o.OooO0OO());
            oooooooo.OooO00o(3, oo0o000o.OooO0OO());
            short OooO0O02 = oo0o000o.m19625OooO0O0();
            int i = 1 << ((OooO0O02 & 7) + 1);
            int i2 = ((OooO0O02 & C6728ll11.OooOoOO) >> 4) + 1;
            boolean z2 = (OooO0O02 >> 7) != 0;
            oooooooo.OooO00o(4, i);
            if (OooO00o2.equals(OooO0O0)) {
                if ((OooO0O02 & 8) == 0) {
                    z = false;
                }
                oooooooo.OooO00o(5, z);
            }
            oooooooo.OooO00o(6, i2);
            oooooooo.OooO00o(7, z2);
            oooooooo.OooO00o(8, (int) oo0o000o.m19625OooO0O0());
            short OooO0O03 = oo0o000o.m19625OooO0O0();
            if (OooO0O03 != 0) {
                double d = (double) OooO0O03;
                Double.isNaN(d);
                oooooooo.OooO00o(9, (float) ((d + 15.0d) / 64.0d));
            }
            return oooooooo;
        }
        oooooooo.OooO00o("Unexpected GIF version");
        return oooooooo;
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static AbstractC7922oO0o0O0O m19717OooO00o(AbstractC7917oO0o000O oo0o000o, int i) throws IOException {
        if (i != 12) {
            return new C7923oO0o0O0o(String.format("Invalid GIF plain text block size. Expected 12, got %d.", Integer.valueOf(i)));
        }
        oo0o000o.OooO00o(12L);
        m19720OooO00o(oo0o000o);
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static C8017oOO00Oo0 m19718OooO00o(AbstractC7917oO0o000O oo0o000o, int i) throws IOException {
        return new C8017oOO00Oo0(new C7927oO0o0OOo(m19722OooO00o(oo0o000o, i), C7895oO0OoO00.OooO0Oo));
    }

    public static void OooO00o(AbstractC7917oO0o000O oo0o000o, int i, C7925oO0o0OO0 oo0o0oo0) throws IOException {
        if (i != 11) {
            oo0o0oo0.OooO00o(new C7923oO0o0O0o(String.format("Invalid GIF application extension block size. Expected 11, got %d.", Integer.valueOf(i))));
            return;
        }
        String OooO0O02 = oo0o000o.m19624OooO0O0(i, C7895oO0OoO00.OooO00o);
        if (OooO0O02.equals("XMP DataXMP")) {
            byte[] OooO00o2 = m19721OooO00o(oo0o000o);
            new C8138oOOOo00o().OooO00o(OooO00o2, 0, OooO00o2.length - 257, oo0o0oo0, null);
        } else if (OooO0O02.equals("ICCRGBG1012")) {
            byte[] OooO00o3 = m19722OooO00o(oo0o000o, oo0o000o.OooO00o() & 255);
            if (OooO00o3.length != 0) {
                new C8023oOO00o0o().OooO00o(new oO0Oo0(OooO00o3), oo0o0oo0);
            }
        } else if (OooO0O02.equals("NETSCAPE2.0")) {
            oo0o000o.OooO00o(2L);
            int OooO0OO = oo0o000o.OooO0OO();
            oo0o000o.OooO00o(1L);
            oOO00OOO ooo00ooo = new oOO00OOO();
            ooo00ooo.OooO00o(1, OooO0OO);
            oo0o0oo0.OooO00o(ooo00ooo);
        } else {
            m19720OooO00o(oo0o000o);
        }
    }

    public static GifControlDirectory OooO00o(AbstractC7917oO0o000O oo0o000o, int i) throws IOException {
        GifControlDirectory gifControlDirectory = new GifControlDirectory();
        short OooO0O02 = oo0o000o.m19625OooO0O0();
        gifControlDirectory.OooO00o(2, GifControlDirectory.DisposalMethod.typeOf((OooO0O02 >> 2) & 7));
        boolean z = false;
        gifControlDirectory.OooO00o(3, ((OooO0O02 & 2) >> 1) == 1);
        if ((OooO0O02 & 1) == 1) {
            z = true;
        }
        gifControlDirectory.OooO00o(4, z);
        gifControlDirectory.OooO00o(1, oo0o000o.OooO0OO());
        gifControlDirectory.OooO00o(5, (int) oo0o000o.m19625OooO0O0());
        oo0o000o.OooO00o(1L);
        return gifControlDirectory;
    }

    public static C8021oOO00o00 OooO00o(AbstractC7917oO0o000O oo0o000o) throws IOException {
        C8021oOO00o00 ooo00o00 = new C8021oOO00o00();
        boolean z = true;
        ooo00o00.OooO00o(1, oo0o000o.OooO0OO());
        ooo00o00.OooO00o(2, oo0o000o.OooO0OO());
        ooo00o00.OooO00o(3, oo0o000o.OooO0OO());
        ooo00o00.OooO00o(4, oo0o000o.OooO0OO());
        byte OooO00o2 = oo0o000o.OooO00o();
        boolean z2 = (OooO00o2 >> 7) != 0;
        boolean z3 = (OooO00o2 & 64) != 0;
        ooo00o00.OooO00o(5, z2);
        ooo00o00.OooO00o(6, z3);
        if (z2) {
            if ((OooO00o2 & 32) == 0) {
                z = false;
            }
            ooo00o00.OooO00o(7, z);
            int i = OooO00o2 & 7;
            ooo00o00.OooO00o(8, i + 1);
            oo0o000o.OooO00o((long) ((2 << i) * 3));
        }
        oo0o000o.OooO00o();
        return ooo00o00;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m19721OooO00o(AbstractC7917oO0o000O oo0o000o) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[257];
        while (true) {
            byte OooO00o2 = oo0o000o.OooO00o();
            if (OooO00o2 == 0) {
                return byteArrayOutputStream.toByteArray();
            }
            int i = OooO00o2 & 255;
            bArr[0] = OooO00o2;
            oo0o000o.OooO00o(bArr, 1, i);
            byteArrayOutputStream.write(bArr, 0, i + 1);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m19722OooO00o(AbstractC7917oO0o000O oo0o000o, int i) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (i > 0) {
            byteArrayOutputStream.write(oo0o000o.m19620OooO00o(i), 0, i);
            i = oo0o000o.OooO00o() & 255;
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m19720OooO00o(AbstractC7917oO0o000O oo0o000o) throws IOException {
        while (true) {
            short OooO0O02 = oo0o000o.m19625OooO0O0();
            if (OooO0O02 != 0) {
                oo0o000o.OooO00o((long) OooO0O02);
            } else {
                return;
            }
        }
    }
}
