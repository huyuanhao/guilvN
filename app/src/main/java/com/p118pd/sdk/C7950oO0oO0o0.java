package com.p118pd.sdk;

import androidx.exifinterface.media.ExifInterface;
import com.drew.imaging.jpeg.JpegProcessingException;
import com.drew.imaging.tiff.TiffProcessingException;
import com.drew.lang.BufferBoundsException;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Set;

/* renamed from: com.pd.sdk.oO0oO0o0  reason: case insensitive filesystem */
public class C7950oO0oO0o0 extends AbstractC8127oOOOOoO {
    public static final /* synthetic */ boolean OooO00o = false;

    public C7950oO0oO0o0(@NotNull C7925oO0o0OO0 oo0o0oo0, @Nullable AbstractC7922oO0o0O0O oo0o0o0o) {
        super(oo0o0oo0, oo0o0o0o);
    }

    @Override // com.p118pd.sdk.AbstractC7867oO0OOOo, com.p118pd.sdk.AbstractC7867oO0OOOo
    public void OooO00o(int i) throws TiffProcessingException {
        if (i != 42) {
            if (i == 85) {
                OooO00o(C7954oO0oOO00.class);
                return;
            } else if (!(i == 20306 || i == 21330)) {
                throw new TiffProcessingException(String.format("Unexpected TIFF marker: 0x%X", Integer.valueOf(i)));
            }
        }
        OooO00o(C8287oOo00O0O.class);
    }

    @Override // com.p118pd.sdk.AbstractC7867oO0OOOo, com.p118pd.sdk.AbstractC7867oO0OOOo
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19675OooO00o(int i) {
        if (i == 330) {
            OooO00o(C8294oOo00OoO.class);
            return true;
        }
        AbstractC7922oO0o0O0O oo0o0o0o = this.OooO0O0;
        if ((oo0o0o0o instanceof C8287oOo00O0O) || (oo0o0o0o instanceof C7954oO0oOO00)) {
            if (i == 34665) {
                OooO00o(C8294oOo00OoO.class);
                return true;
            } else if (i == 34853) {
                OooO00o(C7952oO0oO0oo.class);
                return true;
            }
        }
        if ((this.OooO0O0 instanceof C8294oOo00OoO) && i == 40965) {
            OooO00o(C7947oO0oO0O0.class);
            return true;
        } else if (!(this.OooO0O0 instanceof C7997oO0ooOO0)) {
            return false;
        } else {
            if (i == 8208) {
                OooO00o(C7979oO0oo.class);
                return true;
            } else if (i == 8224) {
                OooO00o(C7988oO0oo0o.class);
                return true;
            } else if (i == 8256) {
                OooO00o(C7995oO0ooO0o.class);
                return true;
            } else if (i == 8272) {
                OooO00o(C7992oO0ooO0.class);
                return true;
            } else if (i == 12288) {
                OooO00o(C8303oOo00oo0.class);
                return true;
            } else if (i == 16384) {
                OooO00o(C7997oO0ooOO0.class);
                return true;
            } else if (i == 8240) {
                OooO00o(C7998oO0oooO.class);
                return true;
            } else if (i != 8241) {
                return false;
            } else {
                OooO00o(C8298oOo00o0O.class);
                return true;
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8127oOOOOoO, com.p118pd.sdk.AbstractC7867oO0OOOo, com.p118pd.sdk.AbstractC7867oO0OOOo
    public boolean OooO00o() {
        AbstractC7922oO0o0O0O oo0o0o0o = this.OooO0O0;
        if ((oo0o0o0o instanceof C8287oOo00O0O) || (oo0o0o0o instanceof C7945oO0oO00o)) {
            if (this.OooO0O0.m19650OooO00o(oO0oO000.OooOoo0)) {
                OooO00o(C7945oO0oO00o.class);
            } else {
                OooO00o(C7949oO0oO0Oo.class);
            }
            return true;
        } else if (oo0o0o0o instanceof C7949oO0oO0Oo) {
            return true;
        } else {
            return false;
        }
    }

    @Override // com.p118pd.sdk.AbstractC7867oO0OOOo
    @Nullable
    public Long OooO00o(int i, int i2, long j) {
        if (i2 == 13) {
            return Long.valueOf(j * 4);
        }
        return i2 == 0 ? 0L : null;
    }

    @Override // com.p118pd.sdk.AbstractC7867oO0OOOo
    public boolean OooO00o(int i, @NotNull Set<Integer> set, int i2, @NotNull AbstractC7911oO0Oooo oo0oooo, int i3, int i4) throws IOException {
        if (i3 == 0) {
            if (this.OooO0O0.m19650OooO00o(i3)) {
                return false;
            }
            if (i4 == 0) {
                return true;
            }
        }
        if (i3 == 37500 && (this.OooO0O0 instanceof C8294oOo00OoO)) {
            return OooO00o(i, set, i2, oo0oooo);
        }
        if (i3 != 33723 || !(this.OooO0O0 instanceof C8287oOo00O0O)) {
            if (i3 == 700 && (this.OooO0O0 instanceof C8287oOo00O0O)) {
                new C8138oOOOo00o().OooO00o(oo0oooo.OooO0O0(i, i4), ((AbstractC8127oOOOOoO) this).f21130OooO00o, this.OooO0O0);
                return true;
            } else if (OooO00o(this.OooO0O0, i3)) {
                C7962oO0oOOo0 oo0oooo0 = new C7962oO0oOOo0();
                oo0oooo0.OooO00o(this.OooO0O0);
                ((AbstractC8127oOOOOoO) this).f21130OooO00o.OooO00o(oo0oooo0);
                OooO00o(oo0oooo0, i, oo0oooo, i4);
                return true;
            } else {
                if (this.OooO0O0 instanceof C7997oO0ooOO0) {
                    if (i3 == 8208) {
                        OooO00o(C7979oO0oo.class);
                        C7871oO0OOo.OooO00o(this, oo0oooo, set, i, i2);
                        return true;
                    } else if (i3 == 8224) {
                        OooO00o(C7988oO0oo0o.class);
                        C7871oO0OOo.OooO00o(this, oo0oooo, set, i, i2);
                        return true;
                    } else if (i3 == 8256) {
                        OooO00o(C7995oO0ooO0o.class);
                        C7871oO0OOo.OooO00o(this, oo0oooo, set, i, i2);
                        return true;
                    } else if (i3 == 8272) {
                        OooO00o(C7992oO0ooO0.class);
                        C7871oO0OOo.OooO00o(this, oo0oooo, set, i, i2);
                        return true;
                    } else if (i3 == 12288) {
                        OooO00o(C8303oOo00oo0.class);
                        C7871oO0OOo.OooO00o(this, oo0oooo, set, i, i2);
                        return true;
                    } else if (i3 == 16384) {
                        OooO00o(C7997oO0ooOO0.class);
                        C7871oO0OOo.OooO00o(this, oo0oooo, set, i, i2);
                        return true;
                    } else if (i3 == 8240) {
                        OooO00o(C7998oO0oooO.class);
                        C7871oO0OOo.OooO00o(this, oo0oooo, set, i, i2);
                        return true;
                    } else if (i3 == 8241) {
                        OooO00o(C8298oOo00o0O.class);
                        C7871oO0OOo.OooO00o(this, oo0oooo, set, i, i2);
                        return true;
                    }
                }
                if (this.OooO0O0 instanceof C7954oO0oOO00) {
                    if (i3 == 19) {
                        C7957oO0oOOO oo0oooo2 = new C7957oO0oOOO();
                        oo0oooo2.OooO00o(this.OooO0O0);
                        ((AbstractC8127oOOOOoO) this).f21130OooO00o.OooO00o(oo0oooo2);
                        OooO00o((AbstractC7922oO0o0O0O) oo0oooo2, i, oo0oooo, i4, (Boolean) false, 2);
                        return true;
                    } else if (i3 == 39) {
                        C7955oO0oOO0O oo0ooo0o = new C7955oO0oOO0O();
                        oo0ooo0o.OooO00o(this.OooO0O0);
                        ((AbstractC8127oOOOOoO) this).f21130OooO00o.OooO00o(oo0ooo0o);
                        OooO00o((AbstractC7922oO0o0O0O) oo0ooo0o, i, oo0oooo, i4, (Boolean) false, 3);
                        return true;
                    } else if (i3 == 281) {
                        C7942oO0oO oo0oo = new C7942oO0oO();
                        oo0oo.OooO00o(this.OooO0O0);
                        ((AbstractC8127oOOOOoO) this).f21130OooO00o.OooO00o(oo0oo);
                        OooO00o((AbstractC7922oO0o0O0O) oo0oo, i, oo0oooo, i4, (Boolean) true, 1);
                        return true;
                    }
                }
                if (i3 == 46 && (this.OooO0O0 instanceof C7954oO0oOO00)) {
                    try {
                        for (AbstractC7922oO0o0O0O oo0o0o0o : C7853oO0O0oO0.OooO00o(new ByteArrayInputStream(oo0oooo.m19602OooO00o(i, i4))).m19661OooO00o()) {
                            oo0o0o0o.OooO00o(this.OooO0O0);
                            ((AbstractC8127oOOOOoO) this).f21130OooO00o.OooO00o(oo0o0o0o);
                        }
                        return true;
                    } catch (JpegProcessingException e) {
                        AbstractC7922oO0o0O0O oo0o0o0o2 = this.OooO0O0;
                        oo0o0o0o2.OooO00o("Error processing JpgFromRaw: " + e.getMessage());
                    } catch (IOException e2) {
                        AbstractC7922oO0o0O0O oo0o0o0o3 = this.OooO0O0;
                        oo0o0o0o3.OooO00o("Error reading JpgFromRaw: " + e2.getMessage());
                    }
                }
                return false;
            }
        } else if (oo0oooo.OooO0O0(i) != 28) {
            return false;
        } else {
            byte[] OooO00o2 = oo0oooo.m19602OooO00o(i, i4);
            new C8026oOO00oOo().OooO00o(new C7916oO0o000(OooO00o2), ((AbstractC8127oOOOOoO) this).f21130OooO00o, (long) OooO00o2.length, this.OooO0O0);
            return true;
        }
    }

    public static void OooO00o(@NotNull AbstractC7922oO0o0O0O oo0o0o0o, int i, @NotNull AbstractC7911oO0Oooo oo0oooo, int i2, Boolean bool, int i3) throws IOException {
        int i4 = 0;
        while (i4 < i2) {
            if (oo0o0o0o.m19658OooO0OO(i4)) {
                if (i4 >= i2 - 1 || !oo0o0o0o.m19658OooO0OO(i4 + 1)) {
                    if (bool.booleanValue()) {
                        short[] sArr = new short[i3];
                        for (int i5 = 0; i5 < i3; i5++) {
                            sArr[i5] = oo0oooo.m19598OooO00o(((i4 + i5) * 2) + i);
                        }
                        oo0o0o0o.OooO0O0(i4, sArr);
                    } else {
                        int[] iArr = new int[i3];
                        for (int i6 = 0; i6 < i3; i6++) {
                            iArr[i6] = oo0oooo.OooO0OO(((i4 + i6) * 2) + i);
                        }
                        oo0o0o0o.OooO0O0(i4, iArr);
                    }
                    i4 += i3 - 1;
                } else if (bool.booleanValue()) {
                    oo0o0o0o.OooO00o(i4, Short.valueOf(oo0oooo.m19598OooO00o((i4 * 2) + i)));
                } else {
                    oo0o0o0o.OooO00o(i4, Integer.valueOf(oo0oooo.OooO0OO((i4 * 2) + i)));
                }
            }
            i4++;
        }
    }

    @NotNull
    public static String OooO00o(@NotNull AbstractC7911oO0Oooo oo0oooo, int i, int i2) throws IOException {
        try {
            return oo0oooo.m19606OooO0O0(i, i2, C7895oO0OoO00.OooO00o);
        } catch (BufferBoundsException unused) {
            return "";
        }
    }

    private boolean OooO00o(int i, @NotNull Set<Integer> set, int i2, @NotNull AbstractC7911oO0Oooo oo0oooo) throws IOException {
        String str;
        AbstractC7922oO0o0O0O OooO00o2 = ((AbstractC8127oOOOOoO) this).f21130OooO00o.OooO00o(C8287oOo00O0O.class);
        if (OooO00o2 == null) {
            str = null;
        } else {
            str = OooO00o2.OooO0O0(271);
        }
        String OooO00o3 = OooO00o(oo0oooo, i, 2);
        String OooO00o4 = OooO00o(oo0oooo, i, 3);
        String OooO00o5 = OooO00o(oo0oooo, i, 4);
        String OooO00o6 = OooO00o(oo0oooo, i, 5);
        String OooO00o7 = OooO00o(oo0oooo, i, 6);
        String OooO00o8 = OooO00o(oo0oooo, i, 7);
        String OooO00o9 = OooO00o(oo0oooo, i, 8);
        String OooO00o10 = OooO00o(oo0oooo, i, 9);
        String OooO00o11 = OooO00o(oo0oooo, i, 10);
        String OooO00o12 = OooO00o(oo0oooo, i, 12);
        boolean OooO00o13 = oo0oooo.m19599OooO00o();
        if ("OLYMP\u0000".equals(OooO00o7) || "EPSON".equals(OooO00o6) || "AGFA".equals(OooO00o5)) {
            OooO00o(C7997oO0ooOO0.class);
            C7871oO0OOo.OooO00o(this, oo0oooo, set, i + 8, i2);
        } else if ("OLYMPUS\u0000II".equals(OooO00o11)) {
            OooO00o(C7997oO0ooOO0.class);
            C7871oO0OOo.OooO00o(this, oo0oooo, set, i + 12, i);
        } else if (str != null && str.toUpperCase().startsWith("MINOLTA")) {
            OooO00o(C7997oO0ooOO0.class);
            C7871oO0OOo.OooO00o(this, oo0oooo, set, i, i2);
        } else if (str == null || !str.trim().toUpperCase().startsWith("NIKON")) {
            if ("SONY CAM".equals(OooO00o9) || "SONY DSC".equals(OooO00o9)) {
                OooO00o(C8010oOO000oO.class);
                C7871oO0OOo.OooO00o(this, oo0oooo, set, i + 12, i2);
            } else if (str != null && str.startsWith("SONY") && !Arrays.equals(oo0oooo.m19602OooO00o(i, 2), new byte[]{1, 0})) {
                OooO00o(C8010oOO000oO.class);
                C7871oO0OOo.OooO00o(this, oo0oooo, set, i, i2);
            } else if ("SEMC MS\u0000\u0000\u0000\u0000\u0000".equals(OooO00o12)) {
                oo0oooo.OooO00o(true);
                OooO00o(oOO00.class);
                C7871oO0OOo.OooO00o(this, oo0oooo, set, i + 20, i2);
            } else if ("SIGMA\u0000\u0000\u0000".equals(OooO00o9) || "FOVEON\u0000\u0000".equals(OooO00o9)) {
                OooO00o(C8009oOO000o0.class);
                C7871oO0OOo.OooO00o(this, oo0oooo, set, i + 10, i2);
            } else if ("KDK".equals(OooO00o4)) {
                oo0oooo.OooO00o(OooO00o8.equals("KDK INFO"));
                C7976oO0oOoo0 oo0oooo0 = new C7976oO0oOoo0();
                ((AbstractC8127oOOOOoO) this).f21130OooO00o.OooO00o(oo0oooo0);
                OooO00o(oo0oooo0, i, oo0oooo);
            } else if ("Canon".equalsIgnoreCase(str)) {
                OooO00o(C7967oO0oOo00.class);
                C7871oO0OOo.OooO00o(this, oo0oooo, set, i, i2);
            } else if (str == null || !str.toUpperCase().startsWith("CASIO")) {
                if ("FUJIFILM".equals(OooO00o9) || "Fujifilm".equalsIgnoreCase(str)) {
                    oo0oooo.OooO00o(false);
                    OooO00o(C7978oO0oOooo.class);
                    C7871oO0OOo.OooO00o(this, oo0oooo, set, oo0oooo.m19604OooO0O0(i + 8) + i, i);
                } else if ("KYOCERA".equals(OooO00o8)) {
                    OooO00o(C7977oO0oOooO.class);
                    C7871oO0OOo.OooO00o(this, oo0oooo, set, i + 22, i2);
                } else if ("LEICA".equals(OooO00o6)) {
                    oo0oooo.OooO00o(false);
                    if ("LEICA\u0000\u0001\u0000".equals(OooO00o9) || "LEICA\u0000\u0004\u0000".equals(OooO00o9) || "LEICA\u0000\u0005\u0000".equals(OooO00o9) || "LEICA\u0000\u0006\u0000".equals(OooO00o9) || "LEICA\u0000\u0007\u0000".equals(OooO00o9)) {
                        OooO00o(C7980oO0oo0.class);
                        C7871oO0OOo.OooO00o(this, oo0oooo, set, i + 8, i);
                    } else if ("Leica Camera AG".equals(str)) {
                        OooO00o(C7982oO0oo00O.class);
                        C7871oO0OOo.OooO00o(this, oo0oooo, set, i + 8, i2);
                    } else if (!"LEICA".equals(str)) {
                        return false;
                    } else {
                        OooO00o(C8278oOo000OO.class);
                        C7871oO0OOo.OooO00o(this, oo0oooo, set, i + 8, i2);
                    }
                } else if ("Panasonic\u0000\u0000\u0000".equals(OooO00o12)) {
                    OooO00o(C8278oOo000OO.class);
                    C7871oO0OOo.OooO00o(this, oo0oooo, set, i + 12, i2);
                } else if ("AOC\u0000".equals(OooO00o5)) {
                    OooO00o(C7972oO0oOoO0.class);
                    C7871oO0OOo.OooO00o(this, oo0oooo, set, i + 6, i);
                } else if (str != null && (str.toUpperCase().startsWith(ExifInterface.o00oOoo) || str.toUpperCase().startsWith("ASAHI"))) {
                    OooO00o(C8002oO0oooo.class);
                    C7871oO0OOo.OooO00o(this, oo0oooo, set, i, i);
                } else if ("SANYO\u0000\u0001\u0000".equals(OooO00o9)) {
                    OooO00o(oOO000OO.class);
                    C7871oO0OOo.OooO00o(this, oo0oooo, set, i + 8, i);
                } else if (str == null || !str.toLowerCase().startsWith("ricoh")) {
                    if (OooO00o11.equals("Apple iOS\u0000")) {
                        boolean OooO00o14 = oo0oooo.m19599OooO00o();
                        oo0oooo.OooO00o(true);
                        OooO00o(C7963oO0oOOoO.class);
                        C7871oO0OOo.OooO00o(this, oo0oooo, set, i + 14, i);
                        oo0oooo.OooO00o(OooO00o14);
                    } else if (oo0oooo.OooO0OO(i) == 61697) {
                        C8004oO0ooooo oo0ooooo = new C8004oO0ooooo();
                        ((AbstractC8127oOOOOoO) this).f21130OooO00o.OooO00o(oo0ooooo);
                        OooO00o(oo0ooooo, i, oo0oooo);
                    } else if (OooO00o10.equalsIgnoreCase("RECONYXUF")) {
                        oOO00000 ooo00000 = new oOO00000();
                        ((AbstractC8127oOOOOoO) this).f21130OooO00o.OooO00o(ooo00000);
                        OooO00o(ooo00000, i, oo0oooo);
                    } else if (!"SAMSUNG".equals(str)) {
                        return false;
                    } else {
                        OooO00o(oOO000.class);
                        C7871oO0OOo.OooO00o(this, oo0oooo, set, i, i2);
                    }
                } else if (OooO00o3.equals("Rv") || OooO00o4.equals("Rev")) {
                    return false;
                } else {
                    if (OooO00o6.equalsIgnoreCase("Ricoh")) {
                        oo0oooo.OooO00o(true);
                        OooO00o(oOO0000O.class);
                        C7871oO0OOo.OooO00o(this, oo0oooo, set, i + 8, i);
                    }
                }
            } else if ("QVC\u0000\u0000\u0000".equals(OooO00o7)) {
                OooO00o(C7972oO0oOoO0.class);
                C7871oO0OOo.OooO00o(this, oo0oooo, set, i + 6, i2);
            } else {
                OooO00o(C7970oO0oOo0O.class);
                C7871oO0OOo.OooO00o(this, oo0oooo, set, i, i2);
            }
        } else if ("Nikon".equals(OooO00o6)) {
            short OooO0O0 = oo0oooo.m19607OooO0O0(i + 6);
            if (OooO0O0 == 1) {
                OooO00o(C7984oO0oo0O.class);
                C7871oO0OOo.OooO00o(this, oo0oooo, set, i + 8, i2);
            } else if (OooO0O0 != 2) {
                this.OooO0O0.OooO00o("Unsupported Nikon makernote data ignored.");
            } else {
                OooO00o(C7987oO0oo0Oo.class);
                C7871oO0OOo.OooO00o(this, oo0oooo, set, i + 18, i + 10);
            }
        } else {
            OooO00o(C7987oO0oo0Oo.class);
            C7871oO0OOo.OooO00o(this, oo0oooo, set, i, i2);
        }
        oo0oooo.OooO00o(OooO00o13);
        return true;
    }

    public static boolean OooO00o(@NotNull AbstractC7922oO0o0O0O oo0o0o0o, int i) {
        if (i == 50341) {
            return true;
        }
        if (i == 3584) {
            return (oo0o0o0o instanceof C7972oO0oOoO0) || (oo0o0o0o instanceof C7977oO0oOooO) || (oo0o0o0o instanceof C7987oO0oo0Oo) || (oo0o0o0o instanceof C7997oO0ooOO0) || (oo0o0o0o instanceof C8278oOo000OO) || (oo0o0o0o instanceof C8002oO0oooo) || (oo0o0o0o instanceof oOO0000O) || (oo0o0o0o instanceof oOO000OO) || (oo0o0o0o instanceof C8010oOO000oO);
        }
        return false;
    }

    public static void OooO00o(@NotNull C7962oO0oOOo0 oo0oooo0, int i, @NotNull AbstractC7911oO0Oooo oo0oooo, int i2) throws IOException {
        Boolean bool;
        int i3;
        if (i2 == 0) {
            oo0oooo0.OooO00o("Empty PrintIM data");
        } else if (i2 <= 15) {
            oo0oooo0.OooO00o("Bad PrintIM data");
        } else {
            String OooO0O0 = oo0oooo.m19606OooO0O0(i, 12, C7895oO0OoO00.OooO00o);
            if (!OooO0O0.startsWith("PrintIM")) {
                oo0oooo0.OooO00o("Invalid PrintIM header");
                return;
            }
            int i4 = i + 14;
            int OooO0OO = oo0oooo.OooO0OO(i4);
            if (i2 < (OooO0OO * 6) + 16) {
                bool = Boolean.valueOf(oo0oooo.m19599OooO00o());
                oo0oooo.OooO00o(!oo0oooo.m19599OooO00o());
                i3 = oo0oooo.OooO0OO(i4);
                if (i2 < (i3 * 6) + 16) {
                    oo0oooo0.OooO00o("Bad PrintIM size");
                    return;
                }
            } else {
                i3 = OooO0OO;
                bool = null;
            }
            String substring = OooO0O0.substring(8, 12);
            oo0oooo0.OooO00o(0, (Object) substring);
            for (int i5 = 0; i5 < i3; i5++) {
                int i6 = i + 16 + (i5 * 6);
                oo0oooo0.OooO00o(oo0oooo.OooO0OO(i6), Long.valueOf(oo0oooo.m19605OooO0O0(i6 + 2)));
            }
            if (bool != null) {
                oo0oooo.OooO00o(bool.booleanValue());
            }
        }
    }

    public static void OooO00o(@NotNull C7976oO0oOoo0 oo0oooo0, int i, @NotNull AbstractC7911oO0Oooo oo0oooo) {
        int i2 = i + 8;
        try {
            oo0oooo0.OooO00o(0, oo0oooo.OooO0O0(i2, 8, C7895oO0OoO00.OooO00o));
            oo0oooo0.OooO00o(9, (int) oo0oooo.m19607OooO0O0(i2 + 9));
            oo0oooo0.OooO00o(10, (int) oo0oooo.m19607OooO0O0(i2 + 10));
            oo0oooo0.OooO00o(12, oo0oooo.OooO0OO(i2 + 12));
            oo0oooo0.OooO00o(14, oo0oooo.OooO0OO(i2 + 14));
            oo0oooo0.OooO00o(16, oo0oooo.OooO0OO(i2 + 16));
            oo0oooo0.OooO00o(18, oo0oooo.m19602OooO00o(i2 + 18, 2));
            oo0oooo0.OooO00o(20, oo0oooo.m19602OooO00o(i2 + 20, 4));
            oo0oooo0.OooO00o(24, oo0oooo.OooO0OO(i2 + 24));
            oo0oooo0.OooO00o(27, (int) oo0oooo.m19607OooO0O0(i2 + 27));
            oo0oooo0.OooO00o(28, (int) oo0oooo.m19607OooO0O0(i2 + 28));
            oo0oooo0.OooO00o(29, (int) oo0oooo.m19607OooO0O0(i2 + 29));
            oo0oooo0.OooO00o(30, oo0oooo.OooO0OO(i2 + 30));
            oo0oooo0.OooO00o(32, oo0oooo.m19605OooO0O0(i2 + 32));
            oo0oooo0.OooO00o(36, (int) oo0oooo.m19598OooO00o(i2 + 36));
            oo0oooo0.OooO00o(56, (int) oo0oooo.m19607OooO0O0(i2 + 56));
            oo0oooo0.OooO00o(64, (int) oo0oooo.m19607OooO0O0(i2 + 64));
            oo0oooo0.OooO00o(92, (int) oo0oooo.m19607OooO0O0(i2 + 92));
            oo0oooo0.OooO00o(93, (int) oo0oooo.m19607OooO0O0(i2 + 93));
            oo0oooo0.OooO00o(94, oo0oooo.OooO0OO(i2 + 94));
            oo0oooo0.OooO00o(96, oo0oooo.OooO0OO(i2 + 96));
            oo0oooo0.OooO00o(98, oo0oooo.OooO0OO(i2 + 98));
            oo0oooo0.OooO00o(100, oo0oooo.OooO0OO(i2 + 100));
            oo0oooo0.OooO00o(102, oo0oooo.OooO0OO(i2 + 102));
            oo0oooo0.OooO00o(104, oo0oooo.OooO0OO(i2 + 104));
            oo0oooo0.OooO00o(107, (int) oo0oooo.OooO0O0(i2 + 107));
        } catch (IOException e) {
            oo0oooo0.OooO00o("Error processing Kodak makernote data: " + e.getMessage());
        }
    }

    public static void OooO00o(@NotNull C8004oO0ooooo oo0ooooo, int i, @NotNull AbstractC7911oO0Oooo oo0oooo) throws IOException {
        Integer num;
        oo0ooooo.OooO00o(0, Integer.valueOf(oo0oooo.OooO0OO(i)));
        int i2 = i + 2;
        int OooO0OO = oo0oooo.OooO0OO(i2);
        int OooO0OO2 = oo0oooo.OooO0OO(i2 + 2);
        int OooO0OO3 = oo0oooo.OooO0OO(i2 + 4);
        String str = String.format("%04X", Integer.valueOf(oo0oooo.OooO0OO(i2 + 6))) + String.format("%04X", Integer.valueOf(oo0oooo.OooO0OO(i2 + 8)));
        try {
            num = Integer.valueOf(Integer.parseInt(str));
        } catch (NumberFormatException unused) {
            num = null;
        }
        if (num != null) {
            oo0ooooo.m19648OooO00o(2, String.format("%d.%d.%d.%s", Integer.valueOf(OooO0OO), Integer.valueOf(OooO0OO2), Integer.valueOf(OooO0OO3), num));
        } else {
            oo0ooooo.m19648OooO00o(2, String.format("%d.%d.%d", Integer.valueOf(OooO0OO), Integer.valueOf(OooO0OO2), Integer.valueOf(OooO0OO3)));
            oo0ooooo.OooO00o("Error processing Reconyx HyperFire makernote data: build '" + str + "' is not in the expected format and will be omitted from Firmware Version.");
        }
        oo0ooooo.m19648OooO00o(12, String.valueOf((char) oo0oooo.OooO0OO(i + 12)));
        int i3 = i + 14;
        oo0ooooo.OooO00o(14, new int[]{oo0oooo.OooO0OO(i3), oo0oooo.OooO0OO(i3 + 2)});
        int i4 = i + 18;
        oo0ooooo.OooO00o(18, (oo0oooo.OooO0OO(i4) << 16) + oo0oooo.OooO0OO(i4 + 2));
        int i5 = i + 22;
        int OooO0OO4 = oo0oooo.OooO0OO(i5);
        int OooO0OO5 = oo0oooo.OooO0OO(i5 + 2);
        int OooO0OO6 = oo0oooo.OooO0OO(i5 + 4);
        int OooO0OO7 = oo0oooo.OooO0OO(i5 + 6);
        int OooO0OO8 = oo0oooo.OooO0OO(i5 + 8);
        int OooO0OO9 = oo0oooo.OooO0OO(i5 + 10);
        if (OooO0OO4 < 0 || OooO0OO4 >= 60 || OooO0OO5 < 0 || OooO0OO5 >= 60 || OooO0OO6 < 0 || OooO0OO6 >= 24 || OooO0OO7 < 1 || OooO0OO7 >= 13 || OooO0OO8 < 1 || OooO0OO8 >= 32 || OooO0OO9 < 1 || OooO0OO9 > 9999) {
            oo0ooooo.OooO00o("Error processing Reconyx HyperFire makernote data: Date/Time Original " + OooO0OO9 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + OooO0OO7 + Constants.ACCEPT_TIME_SEPARATOR_SERVER + OooO0OO8 + " " + OooO0OO6 + Constants.COLON_SEPARATOR + OooO0OO5 + Constants.COLON_SEPARATOR + OooO0OO4 + " is not a valid date/time.");
        } else {
            oo0ooooo.m19648OooO00o(22, String.format("%4d:%2d:%2d %2d:%2d:%2d", Integer.valueOf(OooO0OO9), Integer.valueOf(OooO0OO7), Integer.valueOf(OooO0OO8), Integer.valueOf(OooO0OO6), Integer.valueOf(OooO0OO5), Integer.valueOf(OooO0OO4)));
        }
        oo0ooooo.OooO00o(36, oo0oooo.OooO0OO(i + 36));
        oo0ooooo.OooO00o(38, (int) oo0oooo.m19598OooO00o(i + 38));
        oo0ooooo.OooO00o(40, (int) oo0oooo.m19598OooO00o(i + 40));
        oo0ooooo.OooO00o(42, new C7927oO0o0OOo(oo0oooo.m19602OooO00o(i + 42, 28), C7895oO0OoO00.OooO0o));
        oo0ooooo.OooO00o(72, oo0oooo.OooO0OO(i + 72));
        oo0ooooo.OooO00o(74, oo0oooo.OooO0OO(i + 74));
        oo0ooooo.OooO00o(76, oo0oooo.OooO0OO(i + 76));
        oo0ooooo.OooO00o(78, oo0oooo.OooO0OO(i + 78));
        oo0ooooo.OooO00o(80, oo0oooo.OooO0OO(i + 80));
        oo0ooooo.OooO00o(82, oo0oooo.OooO0OO(i + 82));
        double OooO0OO10 = (double) oo0oooo.OooO0OO(i + 84);
        Double.isNaN(OooO0OO10);
        oo0ooooo.OooO00o(84, OooO0OO10 / 1000.0d);
        oo0ooooo.m19648OooO00o(86, oo0oooo.m19597OooO00o(i + 86, 44, C7895oO0OoO00.OooO00o));
    }

    public static void OooO00o(@NotNull oOO00000 ooo00000, int i, @NotNull AbstractC7911oO0Oooo oo0oooo) throws IOException {
        ooo00000.m19648OooO00o(0, oo0oooo.m19606OooO0O0(i, 9, C7895oO0OoO00.OooO00o));
        ooo00000.m19648OooO00o(52, oo0oooo.m19606OooO0O0(i + 52, 1, C7895oO0OoO00.OooO00o));
        int i2 = i + 53;
        ooo00000.OooO00o(53, new int[]{oo0oooo.OooO00o(i2), oo0oooo.OooO00o(i2 + 1)});
        int i3 = i + 59;
        oo0oooo.OooO00o(i3);
        oo0oooo.OooO00o(i3 + 1);
        oo0oooo.OooO00o(i3 + 2);
        oo0oooo.OooO00o(i3 + 3);
        oo0oooo.OooO00o(i3 + 4);
        ooo00000.OooO00o(67, (int) oo0oooo.OooO00o(i + 67));
        ooo00000.OooO00o(72, (int) oo0oooo.OooO00o(i + 72));
        ooo00000.OooO00o(75, new C7927oO0o0OOo(oo0oooo.m19602OooO00o(i + 75, 14), C7895oO0OoO00.OooO00o));
        ooo00000.m19648OooO00o(80, oo0oooo.m19597OooO00o(i + 80, 20, C7895oO0OoO00.OooO00o));
    }
}
