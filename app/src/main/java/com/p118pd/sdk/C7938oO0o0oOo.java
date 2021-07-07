package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.metadata.MetadataException;
import com.drew.metadata.bmp.BmpHeaderDirectory;
import java.io.IOException;

/* renamed from: com.pd.sdk.oO0o0oOo  reason: case insensitive filesystem */
public class C7938oO0o0oOo {
    public static final int OooO00o = 19778;
    public static final int OooO0O0 = 16706;
    public static final int OooO0OO = 17225;
    public static final int OooO0Oo = 18755;
    public static final int OooO0o = 21584;
    public static final int OooO0o0 = 20547;

    public void OooO00o(@NotNull AbstractC7917oO0o000O oo0o000o, @NotNull C7925oO0o0OO0 oo0o0oo0) {
        oo0o000o.OooO00o(false);
        OooO00o(oo0o000o, oo0o0oo0, true);
    }

    public void OooO00o(@NotNull AbstractC7917oO0o000O oo0o000o, @NotNull C7925oO0o0OO0 oo0o0oo0, boolean z) {
        try {
            int OooO0OO2 = oo0o000o.OooO0OO();
            BmpHeaderDirectory bmpHeaderDirectory = null;
            if (OooO0OO2 != 16706) {
                if (OooO0OO2 == 17225 || OooO0OO2 == 18755 || OooO0OO2 == 19778 || OooO0OO2 == 20547 || OooO0OO2 == 21584) {
                    BmpHeaderDirectory bmpHeaderDirectory2 = new BmpHeaderDirectory();
                    try {
                        oo0o0oo0.OooO00o(bmpHeaderDirectory2);
                        bmpHeaderDirectory2.OooO00o(-2, OooO0OO2);
                        oo0o000o.OooO00o(12L);
                        OooO00o(oo0o000o, bmpHeaderDirectory2, oo0o0oo0);
                    } catch (IOException unused) {
                        bmpHeaderDirectory = bmpHeaderDirectory2;
                    }
                } else {
                    try {
                        oo0o0oo0.OooO00o(new C7923oO0o0O0o("Invalid BMP magic number 0x" + Integer.toHexString(OooO0OO2)));
                    } catch (IOException unused2) {
                        if (bmpHeaderDirectory == null) {
                            OooO00o("Unable to read BMP file header", oo0o0oo0);
                        } else {
                            bmpHeaderDirectory.OooO00o("Unable to read BMP file header");
                        }
                    }
                }
            } else if (!z) {
                OooO00o("Invalid bitmap file - nested arrays not allowed", oo0o0oo0);
            } else {
                oo0o000o.OooO00o(4L);
                long OooO0OO3 = oo0o000o.m19626OooO0OO();
                oo0o000o.OooO00o(4L);
                OooO00o(oo0o000o, oo0o0oo0, false);
                if (OooO0OO3 != 0) {
                    if (oo0o000o.m19623OooO0O0() > OooO0OO3) {
                        OooO00o("Invalid next header offset", oo0o0oo0);
                        return;
                    }
                    oo0o000o.OooO00o(OooO0OO3 - oo0o000o.m19623OooO0O0());
                    OooO00o(oo0o000o, oo0o0oo0, true);
                }
            }
        } catch (IOException e) {
            oo0o0oo0.OooO00o(new C7923oO0o0O0o("Couldn't determine bitmap type: " + e.getMessage()));
        }
    }

    public void OooO00o(@NotNull AbstractC7917oO0o000O oo0o000o, @NotNull BmpHeaderDirectory bmpHeaderDirectory, @NotNull C7925oO0o0OO0 oo0o0oo0) {
        try {
            int OooO00o2 = bmpHeaderDirectory.m19631OooO00o(-2);
            long OooO0O02 = oo0o000o.m19623OooO0O0();
            int OooO0O03 = oo0o000o.m19622OooO0O0();
            bmpHeaderDirectory.OooO00o(-1, OooO0O03);
            if (OooO0O03 == 12 && OooO00o2 == 19778) {
                bmpHeaderDirectory.OooO00o(2, (int) oo0o000o.m19617OooO00o());
                bmpHeaderDirectory.OooO00o(1, (int) oo0o000o.m19617OooO00o());
                bmpHeaderDirectory.OooO00o(3, oo0o000o.OooO0OO());
                bmpHeaderDirectory.OooO00o(4, oo0o000o.OooO0OO());
            } else if (OooO0O03 == 12) {
                bmpHeaderDirectory.OooO00o(2, oo0o000o.OooO0OO());
                bmpHeaderDirectory.OooO00o(1, oo0o000o.OooO0OO());
                bmpHeaderDirectory.OooO00o(3, oo0o000o.OooO0OO());
                bmpHeaderDirectory.OooO00o(4, oo0o000o.OooO0OO());
            } else {
                if (OooO0O03 != 16) {
                    if (OooO0O03 != 64) {
                        if (!(OooO0O03 == 40 || OooO0O03 == 52 || OooO0O03 == 56 || OooO0O03 == 108)) {
                            if (OooO0O03 != 124) {
                                bmpHeaderDirectory.OooO00o("Unexpected DIB header size: " + OooO0O03);
                                return;
                            }
                        }
                        bmpHeaderDirectory.OooO00o(2, oo0o000o.m19622OooO0O0());
                        bmpHeaderDirectory.OooO00o(1, oo0o000o.m19622OooO0O0());
                        bmpHeaderDirectory.OooO00o(3, oo0o000o.OooO0OO());
                        bmpHeaderDirectory.OooO00o(4, oo0o000o.OooO0OO());
                        bmpHeaderDirectory.OooO00o(5, oo0o000o.m19622OooO0O0());
                        oo0o000o.OooO00o(4L);
                        bmpHeaderDirectory.OooO00o(6, oo0o000o.m19622OooO0O0());
                        bmpHeaderDirectory.OooO00o(7, oo0o000o.m19622OooO0O0());
                        bmpHeaderDirectory.OooO00o(8, oo0o000o.m19622OooO0O0());
                        bmpHeaderDirectory.OooO00o(9, oo0o000o.m19622OooO0O0());
                        if (OooO0O03 != 40) {
                            bmpHeaderDirectory.OooO00o(12, oo0o000o.m19626OooO0OO());
                            bmpHeaderDirectory.OooO00o(13, oo0o000o.m19626OooO0OO());
                            bmpHeaderDirectory.OooO00o(14, oo0o000o.m19626OooO0OO());
                            if (OooO0O03 != 52) {
                                bmpHeaderDirectory.OooO00o(15, oo0o000o.m19626OooO0OO());
                                if (OooO0O03 != 56) {
                                    long OooO0OO2 = oo0o000o.m19626OooO0OO();
                                    bmpHeaderDirectory.OooO00o(16, OooO0OO2);
                                    oo0o000o.OooO00o(36L);
                                    bmpHeaderDirectory.OooO00o(17, oo0o000o.m19626OooO0OO());
                                    bmpHeaderDirectory.OooO00o(18, oo0o000o.m19626OooO0OO());
                                    bmpHeaderDirectory.OooO00o(19, oo0o000o.m19626OooO0OO());
                                    if (OooO0O03 != 108) {
                                        bmpHeaderDirectory.OooO00o(20, oo0o000o.m19622OooO0O0());
                                        if (OooO0OO2 != BmpHeaderDirectory.ColorSpaceType.PROFILE_EMBEDDED.getValue()) {
                                            if (OooO0OO2 != BmpHeaderDirectory.ColorSpaceType.PROFILE_LINKED.getValue()) {
                                                oo0o000o.OooO00o(12L);
                                                return;
                                            }
                                        }
                                        long OooO0OO3 = oo0o000o.m19626OooO0OO();
                                        int OooO0O04 = oo0o000o.m19622OooO0O0();
                                        long j = OooO0OO3 + OooO0O02;
                                        if (oo0o000o.m19623OooO0O0() > j) {
                                            bmpHeaderDirectory.OooO00o("Invalid profile data offset 0x" + Long.toHexString(j));
                                            return;
                                        }
                                        oo0o000o.OooO00o(j - oo0o000o.m19623OooO0O0());
                                        if (OooO0OO2 == BmpHeaderDirectory.ColorSpaceType.PROFILE_LINKED.getValue()) {
                                            bmpHeaderDirectory.m19648OooO00o(21, oo0o000o.m19616OooO00o(OooO0O04, C7895oO0OoO00.OooO0oO));
                                            return;
                                        }
                                        new C8023oOO00o0o().OooO00o(new oO0Oo0(oo0o000o.m19620OooO00o(OooO0O04)), oo0o0oo0, bmpHeaderDirectory);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                bmpHeaderDirectory.OooO00o(2, oo0o000o.m19622OooO0O0());
                bmpHeaderDirectory.OooO00o(1, oo0o000o.m19622OooO0O0());
                bmpHeaderDirectory.OooO00o(3, oo0o000o.OooO0OO());
                bmpHeaderDirectory.OooO00o(4, oo0o000o.OooO0OO());
                if (OooO0O03 > 16) {
                    bmpHeaderDirectory.OooO00o(5, oo0o000o.m19622OooO0O0());
                    oo0o000o.OooO00o(4L);
                    bmpHeaderDirectory.OooO00o(6, oo0o000o.m19622OooO0O0());
                    bmpHeaderDirectory.OooO00o(7, oo0o000o.m19622OooO0O0());
                    bmpHeaderDirectory.OooO00o(8, oo0o000o.m19622OooO0O0());
                    bmpHeaderDirectory.OooO00o(9, oo0o000o.m19622OooO0O0());
                    oo0o000o.OooO00o(6L);
                    bmpHeaderDirectory.OooO00o(10, oo0o000o.OooO0OO());
                    oo0o000o.OooO00o(8L);
                    bmpHeaderDirectory.OooO00o(11, oo0o000o.m19622OooO0O0());
                    oo0o000o.OooO00o(4L);
                }
            }
        } catch (IOException unused) {
            bmpHeaderDirectory.OooO00o("Unable to read BMP header");
        } catch (MetadataException unused2) {
            bmpHeaderDirectory.OooO00o("Internal error");
        }
    }

    public void OooO00o(@NotNull String str, @NotNull C7925oO0o0OO0 oo0o0oo0) {
        C7923oO0o0O0o oo0o0o0o = (C7923oO0o0O0o) oo0o0oo0.OooO00o(C7923oO0o0O0o.class);
        if (oo0o0o0o == null) {
            oo0o0oo0.OooO00o(new C7923oO0o0O0o(str));
        } else {
            oo0o0o0o.OooO00o(str);
        }
    }
}
