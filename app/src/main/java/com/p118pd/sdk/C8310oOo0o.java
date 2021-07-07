package com.p118pd.sdk;

import com.drew.imaging.ImageProcessingException;
import com.drew.imaging.jpeg.JpegSegmentType;
import com.drew.lang.annotations.NotNull;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oOo0o  reason: case insensitive filesystem */
public class C8310oOo0o implements AbstractC8313oOo0o0oO {
    @NotNull
    public static final String OooO00o = "Photoshop 3.0";

    @Override // com.p118pd.sdk.AbstractC8313oOo0o0oO
    @NotNull
    public Iterable<JpegSegmentType> OooO00o() {
        return Collections.singletonList(JpegSegmentType.APPD);
    }

    @Override // com.p118pd.sdk.AbstractC8313oOo0o0oO
    public void OooO00o(@NotNull Iterable<byte[]> iterable, @NotNull C7925oO0o0OO0 oo0o0oo0, @NotNull JpegSegmentType jpegSegmentType) {
        for (byte[] bArr : iterable) {
            if (bArr.length >= 14 && OooO00o.equals(new String(bArr, 0, 13))) {
                OooO00o(new C7916oO0o000(bArr, 14), (bArr.length - 13) - 1, oo0o0oo0);
            }
        }
    }

    public void OooO00o(@NotNull AbstractC7917oO0o000O oo0o000o, int i, @NotNull C7925oO0o0OO0 oo0o0oo0) {
        int i2;
        int i3;
        C8122oOOOO0oo ooooo0oo = new C8122oOOOO0oo();
        oo0o0oo0.OooO00o(ooooo0oo);
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5 = i3) {
            try {
                String OooO00o2 = oo0o000o.OooO00o(4);
                int OooO0OO = oo0o000o.OooO0OO();
                short OooO0O0 = oo0o000o.m19625OooO0O0();
                int i6 = i5 + 4 + 2 + 1;
                if (OooO0O0 < 0 || (i2 = OooO0O0 + i6) > i) {
                    throw new ImageProcessingException("Invalid string length");
                }
                StringBuilder sb = new StringBuilder();
                short s = (short) i2;
                while (i6 < s) {
                    sb.append((char) oo0o000o.m19625OooO0O0());
                    i6++;
                }
                if (i6 % 2 != 0) {
                    oo0o000o.OooO00o(1L);
                    i6++;
                }
                int OooO0O02 = oo0o000o.m19622OooO0O0();
                byte[] OooO00o3 = oo0o000o.m19620OooO00o(OooO0O02);
                i3 = i6 + 4 + OooO0O02;
                if (i3 % 2 != 0) {
                    oo0o000o.OooO00o(1L);
                    i3++;
                }
                if (OooO00o2.equals("8BIM")) {
                    if (OooO0OO == 1028) {
                        new C8026oOO00oOo().OooO00o(new C7916oO0o000(OooO00o3), oo0o0oo0, (long) OooO00o3.length, ooooo0oo);
                    } else if (OooO0OO == 1039) {
                        new C8023oOO00o0o().OooO00o(new oO0Oo0(OooO00o3), oo0o0oo0, ooooo0oo);
                    } else {
                        if (OooO0OO != 1058) {
                            if (OooO0OO != 1059) {
                                if (OooO0OO == 1060) {
                                    new C8138oOOOo00o().OooO00o(OooO00o3, oo0o0oo0, ooooo0oo);
                                } else if (OooO0OO < 2000 || OooO0OO > 2998) {
                                    ooooo0oo.OooO00o(OooO0OO, OooO00o3);
                                } else {
                                    i4++;
                                    byte[] copyOf = Arrays.copyOf(OooO00o3, OooO00o3.length + sb.length() + 1);
                                    for (int length = (copyOf.length - sb.length()) - 1; length < copyOf.length; length++) {
                                        if (length % (((copyOf.length - sb.length()) - 1) + sb.length()) == 0) {
                                            copyOf[length] = (byte) sb.length();
                                        } else {
                                            copyOf[length] = (byte) sb.charAt(length - ((copyOf.length - sb.length()) - 1));
                                        }
                                    }
                                    HashMap<Integer, String> hashMap = C8122oOOOO0oo.f21126OooO00o;
                                    int i7 = i4 + 1999;
                                    Integer valueOf = Integer.valueOf(i7);
                                    hashMap.put(valueOf, "Path Info " + i4);
                                    ooooo0oo.OooO00o(i7, copyOf);
                                }
                            }
                        }
                        new C7946oO0oO0O().OooO00o(new oO0Oo0(OooO00o3), oo0o0oo0, 0, ooooo0oo);
                    }
                    if (OooO0OO >= 4000 && OooO0OO <= 4999) {
                        C8122oOOOO0oo.f21126OooO00o.put(Integer.valueOf(OooO0OO), String.format("Plug-in %d Data", Integer.valueOf((OooO0OO - 4000) + 1)));
                    }
                }
            } catch (Exception e) {
                ooooo0oo.OooO00o(e.getMessage());
                return;
            }
        }
    }
}
