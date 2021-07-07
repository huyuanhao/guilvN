package com.p118pd.sdk;

import com.drew.lang.Rational;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.umeng.message.proguard.C3848l;
import java.text.DecimalFormat;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oO0oo0o0  reason: case insensitive filesystem */
public class C7989oO0oo0o0 extends C7929oO0o0OoO<C7988oO0oo0o> {
    public static final HashMap<Integer, String> OooO00o = new HashMap<>();
    public static final HashMap<Integer, String> OooO0O0;

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        OooO0O0 = hashMap;
        hashMap.put(0, "Off");
        OooO0O0.put(1, "Soft Focus");
        OooO0O0.put(2, "Pop Art");
        OooO0O0.put(3, "Pale & Light Color");
        OooO0O0.put(4, "Light Tone");
        OooO0O0.put(5, "Pin Hole");
        OooO0O0.put(6, "Grainy Film");
        OooO0O0.put(9, "Diorama");
        OooO0O0.put(10, "Cross Process");
        OooO0O0.put(12, "Fish Eye");
        OooO0O0.put(13, "Drawing");
        OooO0O0.put(14, "Gentle Sepia");
        OooO0O0.put(15, "Pale & Light Color II");
        OooO0O0.put(16, "Pop Art II");
        OooO0O0.put(17, "Pin Hole II");
        OooO0O0.put(18, "Pin Hole III");
        OooO0O0.put(19, "Grainy Film II");
        OooO0O0.put(20, "Dramatic Tone");
        OooO0O0.put(21, "Punk");
        OooO0O0.put(22, "Soft Focus 2");
        OooO0O0.put(23, "Sparkle");
        OooO0O0.put(24, "Watercolor");
        OooO0O0.put(25, "Key Line");
        OooO0O0.put(26, "Key Line II");
        OooO0O0.put(27, "Miniature");
        OooO0O0.put(28, "Reflection");
        OooO0O0.put(29, "Fragmented");
        OooO0O0.put(31, "Cross Process II");
        OooO0O0.put(32, "Dramatic Tone II");
        OooO0O0.put(33, "Watercolor I");
        OooO0O0.put(34, "Watercolor II");
        OooO0O0.put(35, "Diorama II");
        OooO0O0.put(36, "Vintage");
        OooO0O0.put(37, "Vintage II");
        OooO0O0.put(38, "Vintage III");
        OooO0O0.put(39, "Partial Color");
        OooO0O0.put(40, "Partial Color II");
        OooO0O0.put(41, "Partial Color III");
        OooO00o.put(0, "0");
        OooO00o.put(-31999, "Highlights ");
        OooO00o.put(-31998, "Shadows ");
        OooO00o.put(-31997, "Midtones ");
    }

    public C7989oO0oo0o0(@NotNull C7988oO0oo0o oo0oo0o) {
        super(oo0oo0o);
    }

    @Nullable
    public String OooO() {
        int[] OooO00o2 = ((C7988oO0oo0o) this.f20998OooO00o).m19652OooO00o(C7988oO0oo0o.OoooOo0);
        if (OooO00o2 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < OooO00o2.length; i++) {
            if (i == 0) {
                sb.append("Color ");
                sb.append(OooO00o2[i]);
                sb.append("; ");
            } else if (i == 3) {
                sb.append("Strength ");
                sb.append(OooO00o2[i]);
                sb.append("; ");
            } else {
                sb.append(OooO00o2[i]);
                sb.append("; ");
            }
        }
        return sb.substring(0, sb.length() - 2);
    }

    @Nullable
    public String OooO00o() {
        return OooO00o(513, "Off", "On");
    }

    @Nullable
    public String OooO0O0() {
        Object OooO00o2 = ((C7988oO0oo0o) this.f20998OooO00o).m19642OooO00o(772);
        if (OooO00o2 == null || !(OooO00o2 instanceof long[])) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        long[] jArr = (long[]) OooO00o2;
        for (long j : jArr) {
            if (j != 0) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                if (j == 913916549) {
                    sb.append("Left ");
                } else if (j == 2038007173) {
                    sb.append("Center ");
                } else if (j == 3178875269L) {
                    sb.append("Right ");
                }
                sb.append(String.format("(%d/255,%d/255)-(%d/255,%d/255)", Long.valueOf((j >> 24) & 255), Long.valueOf((j >> 16) & 255), Long.valueOf((j >> 8) & 255), Long.valueOf(j & 255)));
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    @Nullable
    public String OooO0OO(int i) {
        if (i != 0) {
            if (i == 1280) {
                return Ooooo00();
            }
            if (i == 1281) {
                return Ooooo0o();
            }
            if (i == 1312) {
                return Oooo0oo();
            }
            if (i == 1313) {
                return OoooO00();
            }
            if (i == 1536) {
                return OooOOOO();
            }
            if (i == 1537) {
                return Oooo0o0();
            }
            switch (i) {
                case 0:
                    break;
                case 256:
                    return OoooOO0();
                case 768:
                    return OooOoo0();
                case 769:
                    return OooOo0o();
                case 770:
                    return OooOo();
                case 771:
                    return OooO0o0();
                case 772:
                    return OooO0O0();
                case 773:
                    return OooO0Oo();
                case 774:
                    return OooO0OO();
                case 1024:
                    return OooOo0();
                case C7988oO0oo0o.Oooo0OO:
                    return OooOoO0();
                case C7988oO0oo0o.OoooO:
                    return OooO0o();
                case C7988oO0oo0o.OoooOo0:
                    return OooO();
                case C7988oO0oo0o.Ooooo00:
                    return OooOoO();
                case C7988oO0oo0o.Ooooo0o:
                    return OooOoOO();
                case C7988oO0oo0o.OooooO0:
                    return OoooOoO();
                case 2304:
                    return OooOooO();
                case C7988oO0oo0o.OooooOo:
                    return OooOooo();
                case C7988oO0oo0o.Oooooo0:
                    return OooOOo();
                case C7988oO0oo0o.Oooooo:
                    return o000oOoO();
                case C7988oO0oo0o.OoooooO:
                    return OoooO();
                case C7988oO0oo0o.Ooooooo:
                    return OooOOO0();
                default:
                    switch (i) {
                        case 512:
                            return OooOOOo();
                        case 513:
                            return OooO00o();
                        case 514:
                            return Oooo00O();
                        case 515:
                            return OooOOo0();
                        case 516:
                            return Oooo0();
                        default:
                            switch (i) {
                                case 1027:
                                    return OooOo0O();
                                case 1028:
                                    return OooOOoo();
                                case 1029:
                                    return OooOo00();
                                case 1030:
                                    return Oooo000();
                                default:
                                    switch (i) {
                                        case C7988oO0oo0o.OooOoOO:
                                            return OooOO0o();
                                        case C7988oO0oo0o.OooOoo0:
                                            return Oooo00o();
                                        case C7988oO0oo0o.OooOoo:
                                            return OooOO0O();
                                        case C7988oO0oo0o.OooOooO:
                                            return OoooOo0();
                                        case C7988oO0oo0o.OooOooo:
                                            return OooOO0();
                                        default:
                                            switch (i) {
                                                case C7988oO0oo0o.Oooo000:
                                                    return OoooOOO();
                                                case C7988oO0oo0o.Oooo00O:
                                                    return Oooo0OO();
                                                case C7988oO0oo0o.Oooo00o:
                                                    return OooOOO();
                                                case C7988oO0oo0o.Oooo0:
                                                    return OoooOOo();
                                                default:
                                                    switch (i) {
                                                        case C7988oO0oo0o.Oooo0oo:
                                                            return Oooo0oO();
                                                        case C7988oO0oo0o.Oooo:
                                                            return OoooO0();
                                                        case C7988oO0oo0o.OoooO00:
                                                            return Oooo0o();
                                                        case C7988oO0oo0o.OoooO0:
                                                            return OoooO0O();
                                                        case C7988oO0oo0o.OoooO0O:
                                                            return Oooo0O0();
                                                        default:
                                                            switch (i) {
                                                                case C7988oO0oo0o.OoooOO0:
                                                                    return OooOoo();
                                                                case C7988oO0oo0o.o000oOoO:
                                                                    return Oooo();
                                                                case C7988oO0oo0o.OoooOOO:
                                                                    return OoooOoo();
                                                                case C7988oO0oo0o.OoooOOo:
                                                                    return OooO0oO();
                                                                default:
                                                                    return super.OooO0OO(i);
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
            }
        }
        return OooO0oo();
    }

    @Nullable
    public String OooO0Oo() {
        Rational[] OooO00o2 = ((C7988oO0oo0o) this.f20998OooO00o).m19653OooO00o(773);
        if (OooO00o2 == null) {
            return "n/a";
        }
        if (OooO00o2.length < 4) {
            return null;
        }
        int i = (OooO00o2.length == 5 && OooO00o2[0].longValue() == 0) ? 1 : 0;
        int doubleValue = (int) (OooO00o2[i].doubleValue() * 100.0d);
        int doubleValue2 = (int) (OooO00o2[i + 1].doubleValue() * 100.0d);
        int doubleValue3 = (int) (OooO00o2[i + 2].doubleValue() * 100.0d);
        int doubleValue4 = (int) (OooO00o2[i + 3].doubleValue() * 100.0d);
        if (doubleValue + doubleValue2 + doubleValue3 + doubleValue4 == 0) {
            return "n/a";
        }
        return String.format("(%d%%,%d%%) (%d%%,%d%%)", Integer.valueOf(doubleValue), Integer.valueOf(doubleValue2), Integer.valueOf(doubleValue3), Integer.valueOf(doubleValue4));
    }

    @Nullable
    public String OooO0o() {
        return OooOO0(C7988oO0oo0o.OoooO);
    }

    @Nullable
    public String OooO0o0() {
        return OooO00o(771, "Not Ready", "Ready");
    }

    @Nullable
    public String OooO0oO() {
        int[] OooO00o2 = ((C7988oO0oo0o) this.f20998OooO00o).m19652OooO00o(C7988oO0oo0o.OoooOOo);
        if (OooO00o2 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < OooO00o2.length; i++) {
            if (i == 0) {
                sb.append(OooO0O0.containsKey(Integer.valueOf(OooO00o2[i])) ? OooO0O0.get(Integer.valueOf(OooO00o2[i])) : "[unknown]");
                sb.append("; ");
            } else if (i == 3) {
                sb.append("Partial Color ");
                sb.append(OooO00o2[i]);
                sb.append("; ");
            } else if (i == 4) {
                switch (OooO00o2[i]) {
                    case 0:
                        sb.append("No Effect");
                        break;
                    case C8278oOo000OO.o0000oO /*{ENCODED_INT: 32784}*/:
                        sb.append("Star Light");
                        break;
                    case 32800:
                        sb.append("Pin Hole");
                        break;
                    case 32816:
                        sb.append("Frame");
                        break;
                    case 32832:
                        sb.append("Soft Focus");
                        break;
                    case 32848:
                        sb.append("White Edge");
                        break;
                    case 32864:
                        sb.append("B&W");
                        break;
                    default:
                        sb.append("Unknown (");
                        sb.append(OooO00o2[i]);
                        sb.append(C3848l.f10402t);
                        break;
                }
                sb.append("; ");
            } else if (i == 6) {
                int i2 = OooO00o2[i];
                if (i2 == 0) {
                    sb.append("No Color Filter");
                } else if (i2 == 1) {
                    sb.append("Yellow Color Filter");
                } else if (i2 == 2) {
                    sb.append("Orange Color Filter");
                } else if (i2 == 3) {
                    sb.append("Red Color Filter");
                } else if (i2 != 4) {
                    sb.append("Unknown (");
                    sb.append(OooO00o2[i]);
                    sb.append(C3848l.f10402t);
                } else {
                    sb.append("Green Color Filter");
                }
                sb.append("; ");
            } else {
                sb.append(OooO00o2[i]);
                sb.append("; ");
            }
        }
        return sb.substring(0, sb.length() - 2);
    }

    @Nullable
    public String OooO0oo() {
        return OooO0O0(0, 4);
    }

    @Nullable
    public String OooOO0() {
        return OooO00o(C7988oO0oo0o.OooOooo, "sRGB", "Adobe RGB", "Pro Photo RGB");
    }

    @Nullable
    public String OooOO0O() {
        return OooOO0O(C7988oO0oo0o.OooOoo);
    }

    @Nullable
    public String OooOO0o() {
        return OooOO0O(C7988oO0oo0o.OooOoOO);
    }

    @Nullable
    public String OooOOO() {
        return OooO00o(C7988oO0oo0o.Oooo00o, "Off", "On");
    }

    @Nullable
    public String OooOOO0() {
        Object OooO00o2 = ((C7988oO0oo0o) this.f20998OooO00o).m19642OooO00o(C7988oO0oo0o.Ooooooo);
        if (OooO00o2 == null) {
            return null;
        }
        return OooO00o2.toString();
    }

    @Nullable
    public String OooOOOO() {
        int[] OooO00o2 = ((C7988oO0oo0o) this.f20998OooO00o).m19652OooO00o(1536);
        if (OooO00o2 == null) {
            return null;
        }
        if (OooO00o2.length == 0 || OooO00o2[0] == 0) {
            return "Single Shot";
        }
        StringBuilder sb = new StringBuilder();
        if (OooO00o2[0] != 5 || OooO00o2.length < 3) {
            int i = OooO00o2[0];
            if (i == 1) {
                sb.append("Continuous Shooting");
            } else if (i == 2) {
                sb.append("Exposure Bracketing");
            } else if (i == 3) {
                sb.append("White Balance Bracketing");
            } else if (i != 4) {
                sb.append("Unknown (");
                sb.append(OooO00o2[0]);
                sb.append(C3848l.f10402t);
            } else {
                sb.append("Exposure+WB Bracketing");
            }
        } else {
            int i2 = OooO00o2[2];
            if ((i2 & 1) > 0) {
                sb.append("AE");
            }
            if (((i2 >> 1) & 1) > 0) {
                sb.append("WB");
            }
            if (((i2 >> 2) & 1) > 0) {
                sb.append("FL");
            }
            if (((i2 >> 3) & 1) > 0) {
                sb.append("MF");
            }
            if (((i2 >> 6) & 1) > 0) {
                sb.append("Focus");
            }
            sb.append(" Bracketing");
        }
        sb.append(", Shot ");
        sb.append(OooO00o2[1]);
        return sb.toString();
    }

    @Nullable
    public String OooOOOo() {
        return OooO00o(512, 1, "Manual", "Program", "Aperture-priority AE", "Shutter speed priority", "Program-shift");
    }

    @Nullable
    public String OooOOo() {
        return OooO00o(C7988oO0oo0o.Oooooo0, "Off", "On");
    }

    @Nullable
    public String OooOOo0() {
        return OooO0oO(515);
    }

    @Nullable
    public String OooOOoo() {
        int[] OooO00o2 = ((C7988oO0oo0o) this.f20998OooO00o).m19652OooO00o(1028);
        if (OooO00o2 == null || OooO00o2.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i = OooO00o2[0];
        if (i == 0) {
            sb.append("Off");
        } else if (i == 3) {
            sb.append("TTL");
        } else if (i == 4) {
            sb.append("Auto");
        } else if (i != 5) {
            sb.append("Unknown (");
            sb.append(OooO00o2[0]);
            sb.append(C3848l.f10402t);
        } else {
            sb.append("Manual");
        }
        for (int i2 = 1; i2 < OooO00o2.length; i2++) {
            sb.append("; ");
            sb.append(OooO00o2[i2]);
        }
        return sb.toString();
    }

    @Nullable
    public String OooOo() {
        int[] OooO00o2 = ((C7988oO0oo0o) this.f20998OooO00o).m19652OooO00o(770);
        if (OooO00o2 == null) {
            Integer OooO00o3 = ((C7988oO0oo0o) this.f20998OooO00o).m19639OooO00o(770);
            if (OooO00o3 == null) {
                return null;
            }
            OooO00o2 = new int[]{OooO00o3.intValue()};
        }
        if (OooO00o2.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i = OooO00o2[0];
        if (i == 0) {
            sb.append("AF not used");
        } else if (i != 1) {
            sb.append("Unknown (" + OooO00o2[0] + C3848l.f10402t);
        } else {
            sb.append("AF used");
        }
        if (OooO00o2.length > 1) {
            sb.append("; " + OooO00o2[1]);
        }
        return sb.toString();
    }

    @Nullable
    public String OooOo0() {
        Integer OooO00o2 = ((C7988oO0oo0o) this.f20998OooO00o).m19639OooO00o(1024);
        if (OooO00o2 == null) {
            return null;
        }
        if (OooO00o2.intValue() == 0) {
            return "Off";
        }
        StringBuilder sb = new StringBuilder();
        int intValue = OooO00o2.intValue();
        if ((intValue & 1) != 0) {
            sb.append("On, ");
        }
        if (((intValue >> 1) & 1) != 0) {
            sb.append("Fill-in, ");
        }
        if (((intValue >> 2) & 1) != 0) {
            sb.append("Red-eye, ");
        }
        if (((intValue >> 3) & 1) != 0) {
            sb.append("Slow-sync, ");
        }
        if (((intValue >> 4) & 1) != 0) {
            sb.append("Forced On, ");
        }
        if (((intValue >> 5) & 1) != 0) {
            sb.append("2nd Curtain, ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    @Nullable
    public String OooOo00() {
        Rational[] OooO00o2 = ((C7988oO0oo0o) this.f20998OooO00o).m19653OooO00o(1029);
        if (OooO00o2 == null || OooO00o2.length == 0) {
            return null;
        }
        if (OooO00o2.length == 3) {
            if (OooO00o2[0].getDenominator() == 0 && OooO00o2[1].getDenominator() == 0 && OooO00o2[2].getDenominator() == 0) {
                return "n/a";
            }
        } else if (OooO00o2.length == 4 && OooO00o2[0].getDenominator() == 0 && OooO00o2[1].getDenominator() == 0 && OooO00o2[2].getDenominator() == 0 && OooO00o2[3].getDenominator() == 0) {
            return "n/a (x4)";
        }
        StringBuilder sb = new StringBuilder();
        for (Rational rational : OooO00o2) {
            sb.append(rational);
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    @Nullable
    public String OooOo0O() {
        Integer OooO00o2 = ((C7988oO0oo0o) this.f20998OooO00o).m19639OooO00o(1027);
        if (OooO00o2 == null) {
            return null;
        }
        int intValue = OooO00o2.intValue();
        if (intValue == 0) {
            return "Off";
        }
        if (intValue == 1) {
            return "Channel 1, Low";
        }
        if (intValue == 2) {
            return "Channel 2, Low";
        }
        if (intValue == 3) {
            return "Channel 3, Low";
        }
        if (intValue == 4) {
            return "Channel 4, Low";
        }
        switch (intValue) {
            case 9:
                return "Channel 1, Mid";
            case 10:
                return "Channel 2, Mid";
            case 11:
                return "Channel 3, Mid";
            case 12:
                return "Channel 4, Mid";
            default:
                switch (intValue) {
                    case 17:
                        return "Channel 1, High";
                    case 18:
                        return "Channel 2, High";
                    case 19:
                        return "Channel 3, High";
                    case 20:
                        return "Channel 4, High";
                    default:
                        return "Unknown (" + OooO00o2 + C3848l.f10402t;
                }
        }
    }

    @Nullable
    public String OooOo0o() {
        int[] OooO00o2 = ((C7988oO0oo0o) this.f20998OooO00o).m19652OooO00o(769);
        if (OooO00o2 == null) {
            Integer OooO00o3 = ((C7988oO0oo0o) this.f20998OooO00o).m19639OooO00o(769);
            if (OooO00o3 == null) {
                return null;
            }
            OooO00o2 = new int[]{OooO00o3.intValue()};
        }
        if (OooO00o2.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i = OooO00o2[0];
        if (i == 0) {
            sb.append("Single AF");
        } else if (i == 1) {
            sb.append("Sequential shooting AF");
        } else if (i == 2) {
            sb.append("Continuous AF");
        } else if (i == 3) {
            sb.append("Multi AF");
        } else if (i == 4) {
            sb.append("Face detect");
        } else if (i != 10) {
            sb.append("Unknown (" + OooO00o2[0] + C3848l.f10402t);
        } else {
            sb.append("MF");
        }
        if (OooO00o2.length > 1) {
            sb.append("; ");
            int i2 = OooO00o2[1];
            if (i2 == 0) {
                sb.append("(none)");
            } else {
                if ((i2 & 1) > 0) {
                    sb.append("S-AF, ");
                }
                if (((i2 >> 2) & 1) > 0) {
                    sb.append("C-AF, ");
                }
                if (((i2 >> 4) & 1) > 0) {
                    sb.append("MF, ");
                }
                if (((i2 >> 5) & 1) > 0) {
                    sb.append("Face detect, ");
                }
                if (((i2 >> 6) & 1) > 0) {
                    sb.append("Imager AF, ");
                }
                if (((i2 >> 7) & 1) > 0) {
                    sb.append("Live View Magnification Frame, ");
                }
                if (((i2 >> 8) & 1) > 0) {
                    sb.append("AF sensor, ");
                }
                sb.setLength(sb.length() - 2);
            }
        }
        return sb.toString();
    }

    @Nullable
    public String OooOoO() {
        return OooO00o(C7988oO0oo0o.Ooooo00, 1, "SQ", "HQ", "SHQ", "RAW", "SQ (5)");
    }

    @Nullable
    public String OooOoO0() {
        String str;
        int[] OooO00o2 = ((C7988oO0oo0o) this.f20998OooO00o).m19652OooO00o(C7988oO0oo0o.Oooo0OO);
        if (OooO00o2 == null || OooO00o2.length < 3) {
            return null;
        }
        String format = String.format("%d %d %d", Integer.valueOf(OooO00o2[0]), Integer.valueOf(OooO00o2[1]), Integer.valueOf(OooO00o2[2]));
        if (format.equals("0 0 0")) {
            str = "n/a";
        } else if (format.equals("-1 -1 1")) {
            str = "Low Key";
        } else if (format.equals("0 -1 1")) {
            str = ReactProgressBarViewManager.DEFAULT_STYLE;
        } else if (format.equals("1 -1 1")) {
            str = "High Key";
        } else {
            str = "Unknown (" + format + C3848l.f10402t;
        }
        if (OooO00o2.length <= 3) {
            return str;
        }
        if (OooO00o2[3] == 0) {
            return str + "; User-Selected";
        } else if (OooO00o2[3] != 1) {
            return str;
        } else {
            return str + "; Auto-Override";
        }
    }

    @Nullable
    public String OooOoOO() {
        return OooO00o(C7988oO0oo0o.Ooooo0o, "Off", "On, Mode 1", "On, Mode 2", "On, Mode 3", "On, Mode 4");
    }

    @Nullable
    public String OooOoo() {
        return OooOO0(C7988oO0oo0o.OoooOO0);
    }

    @Nullable
    public String OooOoo0() {
        return OooO00o(768, "Off", "On", "Super Macro");
    }

    @Nullable
    public String OooOooO() {
        Integer OooO00o2 = ((C7988oO0oo0o) this.f20998OooO00o).m19639OooO00o(2304);
        if (OooO00o2 == null) {
            return null;
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double intValue = (double) OooO00o2.intValue();
        Double.isNaN(intValue);
        return String.format("%s kPa", decimalFormat.format(intValue / 10.0d));
    }

    @Nullable
    public String OooOooo() {
        int[] OooO00o2 = ((C7988oO0oo0o) this.f20998OooO00o).m19652OooO00o(C7988oO0oo0o.OooooOo);
        if (OooO00o2 == null || OooO00o2.length < 2) {
            return null;
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double d = (double) OooO00o2[0];
        Double.isNaN(d);
        double d2 = (double) OooO00o2[1];
        Double.isNaN(d2);
        return String.format("%s m, %s ft", decimalFormat.format(d / 10.0d), decimalFormat.format(d2 / 10.0d));
    }

    @Nullable
    public String Oooo() {
        int[] OooO00o2 = ((C7988oO0oo0o) this.f20998OooO00o).m19652OooO00o(C7988oO0oo0o.o000oOoO);
        if (OooO00o2 == null) {
            return null;
        }
        String format = String.format("%d %d %d", Integer.valueOf(OooO00o2[0]), Integer.valueOf(OooO00o2[1]), Integer.valueOf(OooO00o2[2]));
        if (format.equals("0 0 0")) {
            return "n/a";
        }
        if (format.equals("-1 -1 1")) {
            return "Low";
        }
        if (format.equals("0 -1 1")) {
            return "Standard";
        }
        if (format.equals("1 -1 1")) {
            return "High";
        }
        return "Unknown (" + format + C3848l.f10402t;
    }

    @Nullable
    public String Oooo0() {
        return OooO00o(516, "Off", "On");
    }

    @Nullable
    public String Oooo000() {
        Rational[] OooO00o2 = ((C7988oO0oo0o) this.f20998OooO00o).m19653OooO00o(1030);
        if (OooO00o2 == null || OooO00o2.length == 0) {
            return "n/a";
        }
        if (OooO00o2.length == 3) {
            if (OooO00o2[0].getDenominator() == 0 && OooO00o2[1].getDenominator() == 0 && OooO00o2[2].getDenominator() == 0) {
                return "n/a";
            }
        } else if (OooO00o2.length == 4 && OooO00o2[0].getDenominator() == 0 && OooO00o2[1].getDenominator() == 0 && OooO00o2[2].getDenominator() == 0 && OooO00o2[3].getDenominator() == 0) {
            return "n/a (x4)";
        }
        StringBuilder sb = new StringBuilder();
        for (Rational rational : OooO00o2) {
            sb.append(rational);
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    @Nullable
    public String Oooo00O() {
        Integer OooO00o2 = ((C7988oO0oo0o) this.f20998OooO00o).m19639OooO00o(514);
        if (OooO00o2 == null) {
            return null;
        }
        int intValue = OooO00o2.intValue();
        if (intValue == 2) {
            return "Center-weighted average";
        }
        if (intValue == 3) {
            return "Spot";
        }
        if (intValue == 5) {
            return "ESP";
        }
        if (intValue == 261) {
            return "Pattern+AF";
        }
        if (intValue == 515) {
            return "Spot+Highlight control";
        }
        if (intValue == 1027) {
            return "Spot+Shadow control";
        }
        return "Unknown (" + OooO00o2 + C3848l.f10402t;
    }

    @Nullable
    public String Oooo00o() {
        return OooO00o(C7988oO0oo0o.OooOoo0, "Off", "CM1 (Red Enhance)", "CM2 (Green Enhance)", "CM3 (Blue Enhance)", "CM4 (Skin Tones)");
    }

    @Nullable
    public String Oooo0O0() {
        int[] OooO00o2 = ((C7988oO0oo0o) this.f20998OooO00o).m19652OooO00o(C7988oO0oo0o.OoooO0O);
        if (OooO00o2 == null) {
            return null;
        }
        String format = String.format("%d %d %d", Integer.valueOf(OooO00o2[0]), Integer.valueOf(OooO00o2[1]), Integer.valueOf(OooO00o2[2]));
        if (format.equals("0 0 0")) {
            return "n/a";
        }
        if (format.equals("-2 -2 1")) {
            return "Off";
        }
        if (format.equals("-1 -2 1")) {
            return "Low";
        }
        if (format.equals("0 -2 1")) {
            return "Standard";
        }
        if (format.equals("1 -2 1")) {
            return "High";
        }
        return "Unknown (" + format + C3848l.f10402t;
    }

    @Nullable
    public String Oooo0OO() {
        Integer OooO00o2 = ((C7988oO0oo0o) this.f20998OooO00o).m19639OooO00o(C7988oO0oo0o.Oooo00O);
        if (OooO00o2 == null) {
            return null;
        }
        if (OooO00o2.intValue() == 0) {
            return "(none)";
        }
        StringBuilder sb = new StringBuilder();
        int intValue = OooO00o2.intValue();
        if ((intValue & 1) != 0) {
            sb.append("Noise Reduction, ");
        }
        if (((intValue >> 1) & 1) != 0) {
            sb.append("Noise Filter, ");
        }
        if (((intValue >> 2) & 1) != 0) {
            sb.append("Noise Filter (ISO Boost), ");
        }
        if (((intValue >> 3) & 1) != 0) {
            sb.append("Auto, ");
        }
        if (sb.length() != 0) {
            return sb.substring(0, sb.length() - 2);
        }
        return "(none)";
    }

    @Nullable
    public String Oooo0o() {
        return OooO00o(C7988oO0oo0o.OoooO00, "n/a", "Neutral", "Yellow", "Orange", "Red", "Green");
    }

    @Nullable
    public String Oooo0o0() {
        String str;
        int[] OooO00o2 = ((C7988oO0oo0o) this.f20998OooO00o).m19652OooO00o(1537);
        if (OooO00o2 == null) {
            return null;
        }
        if (OooO00o2.length == 0 || OooO00o2[0] == 0) {
            return "Off";
        }
        int i = OooO00o2[0];
        if (i == 1) {
            str = "Left to Right";
        } else if (i == 2) {
            str = "Right to Left";
        } else if (i == 3) {
            str = "Bottom to Top";
        } else if (i != 4) {
            str = "Unknown (" + OooO00o2[0] + C3848l.f10402t;
        } else {
            str = "Top to Bottom";
        }
        return String.format("%s, Shot %d", str, Integer.valueOf(OooO00o2[1]));
    }

    @Nullable
    public String Oooo0oO() {
        return OooOO0O(C7988oO0oo0o.Oooo0oo);
    }

    @Nullable
    public String Oooo0oo() {
        int[] OooO00o2 = ((C7988oO0oo0o) this.f20998OooO00o).m19652OooO00o(C7988oO0oo0o.Oooo0o0);
        if (OooO00o2 == null) {
            Integer OooO00o3 = ((C7988oO0oo0o) this.f20998OooO00o).m19639OooO00o(C7988oO0oo0o.Oooo00O);
            if (OooO00o3 == null) {
                return null;
            }
            OooO00o2 = new int[]{OooO00o3.intValue()};
        }
        if (OooO00o2.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i = OooO00o2[0];
        if (i == 1) {
            sb.append("Vivid");
        } else if (i == 2) {
            sb.append("Natural");
        } else if (i == 3) {
            sb.append("Muted");
        } else if (i == 4) {
            sb.append("Portrait");
        } else if (i == 5) {
            sb.append("i-Enhance");
        } else if (i == 256) {
            sb.append("Monotone");
        } else if (i != 512) {
            sb.append("Unknown (");
            sb.append(OooO00o2[0]);
            sb.append(C3848l.f10402t);
        } else {
            sb.append("Sepia");
        }
        if (OooO00o2.length > 1) {
            sb.append("; ");
            sb.append(OooO00o2[1]);
        }
        return sb.toString();
    }

    @Nullable
    public String OoooO() {
        String str;
        int[] OooO00o2 = ((C7988oO0oo0o) this.f20998OooO00o).m19652OooO00o(C7988oO0oo0o.OoooooO);
        if (OooO00o2 == null || OooO00o2.length < 2) {
            return null;
        }
        if (OooO00o2[0] != 0) {
            double d = (double) OooO00o2[0];
            Double.isNaN(d);
            str = Double.toString(d / 10.0d);
        } else {
            str = "n/a";
        }
        return String.format("%s %d", str, Integer.valueOf(OooO00o2[1]));
    }

    @Nullable
    public String OoooO0() {
        return OooOO0O(C7988oO0oo0o.Oooo);
    }

    @Nullable
    public String OoooO00() {
        return OooOO0O(C7988oO0oo0o.Oooo0o);
    }

    @Nullable
    public String OoooO0O() {
        return OooO00o(C7988oO0oo0o.OoooO0, "n/a", "Neutral", "Sepia", "Blue", "Purple", "Green");
    }

    @Nullable
    public String OoooOO0() {
        return OooO00o(256, "No", "Yes");
    }

    @Nullable
    public String OoooOOO() {
        Integer OooO00o2 = ((C7988oO0oo0o) this.f20998OooO00o).m19639OooO00o(C7988oO0oo0o.Oooo000);
        if (OooO00o2 == null) {
            return null;
        }
        int intValue = OooO00o2.intValue();
        if (intValue == 0) {
            return "Standard";
        }
        if (intValue == 54) {
            return "Face Portrait";
        }
        if (intValue == 57) {
            return "Bulb";
        }
        if (intValue == 142) {
            return "Hand-held Starlight";
        }
        if (intValue == 154) {
            return "HDR";
        }
        if (intValue == 59) {
            return "Smile Shot";
        }
        if (intValue == 60) {
            return "Quick Shutter";
        }
        switch (intValue) {
            case 6:
                return "Auto";
            case 7:
                return "Sport";
            case 8:
                return "Portrait";
            case 9:
                return "Landscape+Portrait";
            case 10:
                return "Landscape";
            case 11:
                return "Night Scene";
            case 12:
                return "Self Portrait";
            case 13:
                return "Panorama";
            case 14:
                return "2 in 1";
            case 15:
                return "Movie";
            case 16:
                return "Landscape+Portrait";
            case 17:
                return "Night+Portrait";
            case 18:
                return "Indoor";
            case 19:
                return "Fireworks";
            case 20:
                return "Sunset";
            case 21:
                return "Beauty Skin";
            case 22:
                return "Macro";
            case 23:
                return "Super Macro";
            case 24:
                return "Food";
            case 25:
                return "Documents";
            case 26:
                return "Museum";
            case 27:
                return "Shoot & Select";
            case 28:
                return "Beach & Snow";
            case 29:
                return "Self Portrait+Timer";
            case 30:
                return "Candle";
            case 31:
                return "Available Light";
            case 32:
                return "Behind Glass";
            case 33:
                return "My Mode";
            case 34:
                return "Pet";
            case 35:
                return "Underwater Wide1";
            case 36:
                return "Underwater Macro";
            case 37:
                return "Shoot & Select1";
            case 38:
                return "Shoot & Select2";
            case 39:
                return "High Key";
            case 40:
                return "Digital Image Stabilization";
            case 41:
                return "Auction";
            case 42:
                return "Beach";
            case 43:
                return "Snow";
            case 44:
                return "Underwater Wide2";
            case 45:
                return "Low Key";
            case 46:
                return "Children";
            case 47:
                return "Vivid";
            case 48:
                return "Nature Macro";
            case 49:
                return "Underwater Snapshot";
            case 50:
                return "Shooting Guide";
            default:
                switch (intValue) {
                    case 63:
                        return "Slow Shutter";
                    case 64:
                        return "Bird Watching";
                    case 65:
                        return "Multiple Exposure";
                    case 66:
                        return "e-Portrait";
                    case 67:
                        return "Soft Background Shot";
                    default:
                        return "Unknown (" + OooO00o2 + C3848l.f10402t;
                }
        }
    }

    @Nullable
    public String OoooOOo() {
        return OooO00o(C7988oO0oo0o.Oooo0, "Off", "On");
    }

    @Nullable
    public String OoooOo0() {
        return OooOO0O(C7988oO0oo0o.OooOooO);
    }

    @Nullable
    public String OoooOoO() {
        int[] OooO00o2 = ((C7988oO0oo0o) this.f20998OooO00o).m19652OooO00o(C7988oO0oo0o.OooooO0);
        if (OooO00o2 == null || OooO00o2.length < 2) {
            return null;
        }
        int i = OooO00o2[0];
        int i2 = OooO00o2[1];
        if (i == 0 && i2 == 0) {
            return "No";
        }
        if (i == 9 && i2 == 8) {
            return "Focus-stacked (8 images)";
        }
        return String.format("Unknown (%d %d)", Integer.valueOf(i), Integer.valueOf(i2));
    }

    @Nullable
    public String OoooOoo() {
        int[] OooO00o2 = ((C7988oO0oo0o) this.f20998OooO00o).m19652OooO00o(C7988oO0oo0o.OoooOOO);
        if (OooO00o2 == null || OooO00o2.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < OooO00o2.length; i++) {
            if (i == 0 || i == 4 || i == 8 || i == 12 || i == 16 || i == 20 || i == 24) {
                sb.append(OooO00o.get(Integer.valueOf(OooO00o2[i])));
                sb.append("; ");
            } else {
                sb.append(OooO00o2[i]);
                sb.append("; ");
            }
        }
        return sb.substring(0, sb.length() - 2);
    }

    @Nullable
    public String Ooooo00() {
        Integer OooO00o2 = ((C7988oO0oo0o) this.f20998OooO00o).m19639OooO00o(1280);
        if (OooO00o2 == null) {
            return null;
        }
        int intValue = OooO00o2.intValue();
        if (intValue == 0) {
            return "Auto";
        }
        if (intValue == 1) {
            return "Auto (Keep Warm Color Off)";
        }
        if (intValue == 48) {
            return "3600K (Tungsten light-like)";
        }
        if (intValue == 67) {
            return "Underwater";
        }
        switch (intValue) {
            case 16:
                return "7500K (Fine Weather with Shade)";
            case 17:
                return "6000K (Cloudy)";
            case 18:
                return "5300K (Fine Weather)";
            default:
                switch (intValue) {
                    case 20:
                        return "3000K (Tungsten light)";
                    case 21:
                        return "3600K (Tungsten light-like)";
                    case 22:
                        return "Auto Setup";
                    case 23:
                        return "5500K (Flash)";
                    default:
                        switch (intValue) {
                            case 33:
                                return "6600K (Daylight fluorescent)";
                            case 34:
                                return "4500K (Neutral white fluorescent)";
                            case 35:
                                return "4000K (Cool white fluorescent)";
                            case 36:
                                return "White Fluorescent";
                            default:
                                switch (intValue) {
                                    case 256:
                                        return "One Touch WB 1";
                                    case 257:
                                        return "One Touch WB 2";
                                    case 258:
                                        return "One Touch WB 3";
                                    case 259:
                                        return "One Touch WB 4";
                                    default:
                                        switch (intValue) {
                                            case 512:
                                                return "Custom WB 1";
                                            case 513:
                                                return "Custom WB 2";
                                            case 514:
                                                return "Custom WB 3";
                                            case 515:
                                                return "Custom WB 4";
                                            default:
                                                return "Unknown (" + OooO00o2 + C3848l.f10402t;
                                        }
                                }
                        }
                }
        }
    }

    @Nullable
    public String Ooooo0o() {
        Integer OooO00o2 = ((C7988oO0oo0o) this.f20998OooO00o).m19639OooO00o(C7988oO0oo0o.OooOoO0);
        if (OooO00o2 == null) {
            return null;
        }
        if (OooO00o2.intValue() == 0) {
            return "Auto";
        }
        return OooO00o2.toString();
    }

    @Nullable
    public String o000oOoO() {
        String str;
        int[] OooO00o2 = ((C7988oO0oo0o) this.f20998OooO00o).m19652OooO00o(C7988oO0oo0o.Oooooo);
        if (OooO00o2 == null || OooO00o2.length < 2) {
            return null;
        }
        if (OooO00o2[0] != 0) {
            double d = (double) (-OooO00o2[0]);
            Double.isNaN(d);
            str = Double.toString(d / 10.0d);
        } else {
            str = "n/a";
        }
        return String.format("%s %d", str, Integer.valueOf(OooO00o2[1]));
    }

    @Nullable
    private String OooOO0(int i) {
        int[] OooO00o2 = ((C7988oO0oo0o) this.f20998OooO00o).m19652OooO00o(i);
        if (OooO00o2 == null || OooO00o2.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < OooO00o2.length; i2++) {
            if (i2 == 0) {
                sb.append(OooO0O0.containsKey(Integer.valueOf(OooO00o2[i2])) ? OooO0O0.get(Integer.valueOf(OooO00o2[i2])) : "[unknown]");
            } else {
                sb.append(OooO00o2[i2]);
            }
            sb.append("; ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    @Nullable
    private String OooOO0O(int i) {
        int[] OooO00o2 = ((C7988oO0oo0o) this.f20998OooO00o).m19652OooO00o(i);
        if (OooO00o2 == null || OooO00o2.length < 3) {
            return null;
        }
        return String.format("%d (min %d, max %d)", Integer.valueOf(OooO00o2[0]), Integer.valueOf(OooO00o2[1]), Integer.valueOf(OooO00o2[2]));
    }

    @Nullable
    public String OooO0OO() {
        return OooO00o(774, "Off", "On");
    }
}
