package com.p118pd.sdk;

import androidx.exifinterface.media.ExifInterface;
import com.drew.lang.Rational;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.p118pd.sdk.AbstractC7922oO0o0O0O;
import com.umeng.message.proguard.C3817f;
import com.umeng.message.proguard.C3848l;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.oO0o  reason: case insensitive filesystem */
public abstract class AbstractC7915oO0o<T extends AbstractC7922oO0o0O0O> extends C7929oO0o0OoO<T> {
    public final boolean OooO0O0 = true;

    public AbstractC7915oO0o(@NotNull T t) {
        super(t);
    }

    @Nullable
    private String OooOO0(int i) {
        byte[] OooO00o = this.f20998OooO00o.m19651OooO00o(i);
        if (OooO00o == null) {
            return null;
        }
        try {
            return new String(OooO00o, C3817f.f10343e).trim();
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    @Nullable
    public String OooO() {
        Integer OooO00o = this.f20998OooO00o.m19639OooO00o(259);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 32766) {
            return "Next";
        }
        if (intValue == 32767) {
            return "Sony ARW Compressed";
        }
        switch (intValue) {
            case 1:
                return "Uncompressed";
            case 2:
                return "CCITT 1D";
            case 3:
                return "T4/Group 3 Fax";
            case 4:
                return "T6/Group 4 Fax";
            case 5:
                return "LZW";
            case 6:
                return "JPEG (old-style)";
            case 7:
                return "JPEG";
            case 8:
                return "Adobe Deflate";
            case 9:
                return "JBIG B&W";
            case 10:
                return "JBIG Color";
            default:
                switch (intValue) {
                    case 99:
                        return "JPEG";
                    case 262:
                        return "Kodak 262";
                    case 32809:
                        return "Thunderscan";
                    case 32867:
                        return "Kodak KDC Compressed";
                    case 34661:
                        return "JBIG";
                    case 34715:
                        return "JBIG2 TIFF FX";
                    case ExifInterface.OooOooO:
                        return "Lossy JPEG";
                    case 65000:
                        return "Kodak DCR Compressed";
                    case 65535:
                        return "Pentax PEF Compressed";
                    default:
                        switch (intValue) {
                            case 32769:
                                return "Packed RAW";
                            case 32770:
                                return "Samsung SRW Compressed";
                            case 32771:
                                return "CCIRLEW";
                            case 32772:
                                return "Samsung SRW Compressed 2";
                            case 32773:
                                return "PackBits";
                            default:
                                switch (intValue) {
                                    case 32895:
                                        return "IT8CTPAD";
                                    case 32896:
                                        return "IT8LW";
                                    case 32897:
                                        return "IT8MP";
                                    case 32898:
                                        return "IT8BL";
                                    default:
                                        switch (intValue) {
                                            case 32908:
                                                return "PixarFilm";
                                            case 32909:
                                                return "PixarLog";
                                            default:
                                                switch (intValue) {
                                                    case 32946:
                                                        return "Deflate";
                                                    case 32947:
                                                        return "DCS";
                                                    default:
                                                        switch (intValue) {
                                                            case 34676:
                                                                return "SGILog";
                                                            case 34677:
                                                                return "SGILog24";
                                                            default:
                                                                switch (intValue) {
                                                                    case 34712:
                                                                        return "JPEG 2000";
                                                                    case 34713:
                                                                        return "Nikon NEF Compressed";
                                                                    default:
                                                                        switch (intValue) {
                                                                            case 34718:
                                                                                return "Microsoft Document Imaging (MDI) Binary Level Codec";
                                                                            case 34719:
                                                                                return "Microsoft Document Imaging (MDI) Progressive Transform Codec";
                                                                            case 34720:
                                                                                return "Microsoft Document Imaging (MDI) Vector";
                                                                            default:
                                                                                return "Unknown (" + OooO00o + C3848l.f10402t;
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
        }
    }

    @Nullable
    public String OooO00o() {
        Integer OooO00o = this.f20998OooO00o.m19639OooO00o(oO0oO000.o000OOO);
        if (OooO00o == null) {
            return null;
        }
        return OooO00o.intValue() == 0 ? "Unknown" : C7929oO0o0OoO.OooO0O0((double) OooO00o.intValue());
    }

    @Nullable
    public String OooO0O0() {
        Double OooO00o = this.f20998OooO00o.m19637OooO00o(oO0oO000.o00000O);
        if (OooO00o == null) {
            return null;
        }
        return C7929oO0o0OoO.OooO00o(oO0O0OO.OooO00o(OooO00o.doubleValue()));
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    @Nullable
    public String OooO0OO(int i) {
        switch (i) {
            case 1:
                return Oooo000();
            case 2:
                return Oooo00O();
            case 254:
                return Oooo0o();
            case 255:
                return Ooooo0o();
            case 256:
                return OooOooo();
            case 257:
                return OooOooO();
            case 258:
                return OooO0OO();
            case 259:
                return OooO();
            case 262:
                return Oooo0oo();
            case 263:
                return OooooOo();
            case 266:
                return OooOo0O();
            case 274:
                return Oooo0oO();
            case 277:
                return OoooO();
            case 278:
                return OoooO0O();
            case 279:
                return Ooooo00();
            case 282:
                return o00Ooo();
            case 283:
                return oo000o();
            case 284:
                return Oooo();
            case 296:
                return OoooO0();
            case 512:
                return Oooo0();
            case 530:
                return o00ooo();
            case 531:
                return o00o0O();
            case 532:
                return OoooO00();
            case oO0oO000.Ooooooo /*{ENCODED_INT: 33422}*/:
                return OooO0Oo();
            case oO0oO000.o00O0O /*{ENCODED_INT: 33434}*/:
                return OooOOoo();
            case oO0oO000.o00Oo0 /*{ENCODED_INT: 33437}*/:
                return OooOo00();
            case oO0oO000.o00ooo /*{ENCODED_INT: 34850}*/:
                return OooOOo();
            case oO0oO000.o00oO0o /*{ENCODED_INT: 34855}*/:
                return Oooo00o();
            case oO0oO000.o0OOO0o /*{ENCODED_INT: 34864}*/:
                return OoooOo0();
            case 36864:
                return OooOOOO();
            case oO0oO000.o000000o /*{ENCODED_INT: 37121}*/:
                return OooO0oO();
            case oO0oO000.o00000 /*{ENCODED_INT: 37122}*/:
                return OooO0oo();
            case oO0oO000.o00000O0 /*{ENCODED_INT: 37377}*/:
                return OoooOoo();
            case oO0oO000.o00000O /*{ENCODED_INT: 37378}*/:
                return OooO0O0();
            case oO0oO000.o00000Oo /*{ENCODED_INT: 37380}*/:
                return OooOOOo();
            case oO0oO000.o00000o0 /*{ENCODED_INT: 37381}*/:
                return Oooo0OO();
            case oO0oO000.o0000Ooo /*{ENCODED_INT: 37382}*/:
                return OooooO0();
            case oO0oO000.o00000oO /*{ENCODED_INT: 37383}*/:
                return Oooo0o0();
            case 37384:
                return Oooooo();
            case oO0oO000.o0000O00 /*{ENCODED_INT: 37385}*/:
                return OooOo0o();
            case oO0oO000.o0000oo /*{ENCODED_INT: 37386}*/:
                return OooOoO0();
            case oO0oO000.o0000o0 /*{ENCODED_INT: 37510}*/:
                return Oooooo0();
            case oO0oO000.o0000oO0 /*{ENCODED_INT: 40091}*/:
                return o00Oo0();
            case oO0oO000.o0000oOO /*{ENCODED_INT: 40092}*/:
                return o0OoOo0();
            case oO0oO000.o0000oOo /*{ENCODED_INT: 40093}*/:
                return Ooooooo();
            case oO0oO000.o0000oo0 /*{ENCODED_INT: 40094}*/:
                return ooOO();
            case oO0oO000.o0000ooO /*{ENCODED_INT: 40095}*/:
                return o00O0O();
            case oO0oO000.o000 /*{ENCODED_INT: 40960}*/:
                return OooOo();
            case 40961:
                return OooO0o();
            case oO0oO000.o000OoO /*{ENCODED_INT: 40962}*/:
                return OooOOO();
            case oO0oO000.o000O0o /*{ENCODED_INT: 40963}*/:
                return OooOOO0();
            case oO0oO000.o000O00 /*{ENCODED_INT: 41486}*/:
                return OooOoOO();
            case oO0oO000.o000O00O /*{ENCODED_INT: 41487}*/:
                return OooOoo0();
            case oO0oO000.o000O0 /*{ENCODED_INT: 41488}*/:
                return OooOoO();
            case oO0oO000.o000O0O0 /*{ENCODED_INT: 41495}*/:
                return OoooOOo();
            case oO0oO000.o000O0o0 /*{ENCODED_INT: 41728}*/:
                return OooOo0();
            case oO0oO000.o000O0oO /*{ENCODED_INT: 41729}*/:
                return OoooOOO();
            case oO0oO000.o000O0oo /*{ENCODED_INT: 41730}*/:
                return OooO0o0();
            case oO0oO000.o000O /*{ENCODED_INT: 41985}*/:
                return OooOO0O();
            case oO0oO000.o000OO00 /*{ENCODED_INT: 41986}*/:
                return OooOOo0();
            case oO0oO000.o0OoO0o /*{ENCODED_INT: 41987}*/:
                return OoooooO();
            case oO0oO000.o000OO0o /*{ENCODED_INT: 41988}*/:
                return OooOO0o();
            case oO0oO000.o000OOO /*{ENCODED_INT: 41989}*/:
                return OooO00o();
            case oO0oO000.o000OOo0 /*{ENCODED_INT: 41990}*/:
                return o000oOoO();
            case oO0oO000.o000OOoO /*{ENCODED_INT: 41991}*/:
                return OooOoo();
            case oO0oO000.o000Oo00 /*{ENCODED_INT: 41992}*/:
                return OooOO0();
            case oO0oO000.o000Oo0O /*{ENCODED_INT: 41993}*/:
                return OoooOO0();
            case oO0oO000.o000Oo0o /*{ENCODED_INT: 41994}*/:
                return OoooOoO();
            case oO0oO000.o000OoOO /*{ENCODED_INT: 41996}*/:
                return OooooOO();
            case oO0oO000.o000Oooo /*{ENCODED_INT: 42034}*/:
                return Oooo0O0();
            default:
                return super.OooO0OO(i);
        }
    }

    @Nullable
    public String OooO0Oo() {
        byte[] OooO00o = this.f20998OooO00o.m19651OooO00o(oO0oO000.Ooooooo);
        if (OooO00o == null) {
            return null;
        }
        int[] OooO00o2 = this.f20998OooO00o.m19652OooO00o(oO0oO000.OoooooO);
        if (OooO00o2 == null) {
            return String.format("Repeat Pattern not found for CFAPattern (%s)", super.OooO0OO(oO0oO000.Ooooooo));
        } else if (OooO00o2.length == 2 && OooO00o.length == OooO00o2[0] * OooO00o2[1]) {
            int[] iArr = new int[(OooO00o.length + 2)];
            iArr[0] = OooO00o2[0];
            iArr[1] = OooO00o2[1];
            for (int i = 0; i < OooO00o.length; i++) {
                iArr[i + 2] = OooO00o[i] & 255;
            }
            return OooO00o(iArr);
        } else {
            return String.format("Unknown Pattern (%s)", super.OooO0OO(oO0oO000.Ooooooo));
        }
    }

    @Nullable
    public String OooO0o() {
        Integer OooO00o = this.f20998OooO00o.m19639OooO00o(40961);
        if (OooO00o == null) {
            return null;
        }
        if (OooO00o.intValue() == 1) {
            return "sRGB";
        }
        if (OooO00o.intValue() == 65535) {
            return "Undefined";
        }
        return "Unknown (" + OooO00o + C3848l.f10402t;
    }

    @Nullable
    public String OooO0o0() {
        return OooO00o(OooO00o((int) oO0oO000.o000O0oo));
    }

    @Nullable
    public String OooO0oO() {
        int[] OooO00o = this.f20998OooO00o.m19652OooO00o(oO0oO000.o000000o);
        if (OooO00o == null) {
            return null;
        }
        String[] strArr = {"", "Y", "Cb", "Cr", "R", "G", "B"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Math.min(4, OooO00o.length); i++) {
            int i2 = OooO00o[i];
            if (i2 > 0 && i2 < 7) {
                sb.append(strArr[i2]);
            }
        }
        return sb.toString();
    }

    @Nullable
    public String OooO0oo() {
        String str;
        StringBuilder sb;
        Rational OooO00o = this.f20998OooO00o.m19633OooO00o(oO0oO000.o00000);
        if (OooO00o == null) {
            return null;
        }
        String simpleString = OooO00o.toSimpleString(true);
        if (!OooO00o.isInteger() || OooO00o.intValue() != 1) {
            sb = new StringBuilder();
            sb.append(simpleString);
            str = " bits/pixel";
        } else {
            sb = new StringBuilder();
            sb.append(simpleString);
            str = " bit/pixel";
        }
        sb.append(str);
        return sb.toString();
    }

    @Nullable
    public String OooOO0O() {
        return OooO00o((int) oO0oO000.o000O, "Normal process", "Custom process");
    }

    @Nullable
    public String OooOO0o() {
        Rational OooO00o = this.f20998OooO00o.m19633OooO00o(oO0oO000.o000OO0o);
        if (OooO00o == null) {
            return null;
        }
        return OooO00o.getNumerator() == 0 ? "Digital zoom not used" : new DecimalFormat("0.#").format(OooO00o.doubleValue());
    }

    @Nullable
    public String OooOOO() {
        Integer OooO00o = this.f20998OooO00o.m19639OooO00o(oO0oO000.o000OoO);
        if (OooO00o == null) {
            return null;
        }
        return OooO00o + " pixels";
    }

    @Nullable
    public String OooOOO0() {
        Integer OooO00o = this.f20998OooO00o.m19639OooO00o(oO0oO000.o000O0o);
        if (OooO00o == null) {
            return null;
        }
        return OooO00o + " pixels";
    }

    @Nullable
    public String OooOOOO() {
        return OooO0O0(36864, 2);
    }

    @Nullable
    public String OooOOOo() {
        Rational OooO00o = this.f20998OooO00o.m19633OooO00o(oO0oO000.o00000Oo);
        if (OooO00o == null) {
            return null;
        }
        return OooO00o.toSimpleString(true) + " EV";
    }

    @Nullable
    public String OooOOo() {
        return OooO00o(oO0oO000.o00ooo, 1, "Manual control", "Program normal", "Aperture priority", "Shutter priority", "Program creative (slow program)", "Program action (high-speed program)", "Portrait mode", "Landscape mode");
    }

    @Nullable
    public String OooOOo0() {
        return OooO00o((int) oO0oO000.o000OO00, "Auto exposure", "Manual exposure", "Auto bracket");
    }

    @Nullable
    public String OooOOoo() {
        String OooO0O02 = this.f20998OooO00o.OooO0O0(oO0oO000.o00O0O);
        if (OooO0O02 == null) {
            return null;
        }
        return OooO0O02 + " sec";
    }

    @Nullable
    public String OooOo() {
        return OooO0O0((int) oO0oO000.o000, 2);
    }

    @Nullable
    public String OooOo0() {
        return OooO00o(oO0oO000.o000O0o0, 1, "Film Scanner", "Reflection Print Scanner", "Digital Still Camera (DSC)");
    }

    @Nullable
    public String OooOo00() {
        Rational OooO00o = this.f20998OooO00o.m19633OooO00o(oO0oO000.o00Oo0);
        if (OooO00o == null) {
            return null;
        }
        return C7929oO0o0OoO.OooO00o(OooO00o.doubleValue());
    }

    @Nullable
    public String OooOo0O() {
        return OooO00o(266, 1, ReactProgressBarViewManager.DEFAULT_STYLE, "Reversed");
    }

    @Nullable
    public String OooOo0o() {
        Integer OooO00o = this.f20998OooO00o.m19639OooO00o(oO0oO000.o0000O00);
        if (OooO00o == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if ((OooO00o.intValue() & 1) != 0) {
            sb.append("Flash fired");
        } else {
            sb.append("Flash did not fire");
        }
        if ((OooO00o.intValue() & 4) != 0) {
            if ((OooO00o.intValue() & 2) != 0) {
                sb.append(", return detected");
            } else {
                sb.append(", return not detected");
            }
        }
        if ((OooO00o.intValue() & 16) != 0) {
            sb.append(", auto");
        }
        if ((OooO00o.intValue() & 64) != 0) {
            sb.append(", red-eye reduction");
        }
        return sb.toString();
    }

    @Nullable
    public String OooOoO() {
        return OooO00o(oO0oO000.o000O0, 1, "(No unit)", "Inches", SocializeProtocolConstants.PROTOCOL_KEY_COMMENT_COUNT);
    }

    @Nullable
    public String OooOoO0() {
        Rational OooO00o = this.f20998OooO00o.m19633OooO00o(oO0oO000.o0000oo);
        if (OooO00o == null) {
            return null;
        }
        return C7929oO0o0OoO.OooO0O0(OooO00o.doubleValue());
    }

    @Nullable
    public String OooOoOO() {
        String str;
        Rational OooO00o = this.f20998OooO00o.m19633OooO00o(oO0oO000.o000O00);
        if (OooO00o == null) {
            return null;
        }
        String OooOoO = OooOoO();
        StringBuilder sb = new StringBuilder();
        sb.append(OooO00o.getReciprocal().toSimpleString(true));
        if (OooOoO == null) {
            str = "";
        } else {
            str = " " + OooOoO.toLowerCase();
        }
        sb.append(str);
        return sb.toString();
    }

    @Nullable
    public String OooOoo() {
        return OooO00o((int) oO0oO000.o000OOoO, "None", "Low gain up", "Low gain down", "High gain up", "High gain down");
    }

    @Nullable
    public String OooOoo0() {
        String str;
        Rational OooO00o = this.f20998OooO00o.m19633OooO00o(oO0oO000.o000O00O);
        if (OooO00o == null) {
            return null;
        }
        String OooOoO = OooOoO();
        StringBuilder sb = new StringBuilder();
        sb.append(OooO00o.getReciprocal().toSimpleString(true));
        if (OooOoO == null) {
            str = "";
        } else {
            str = " " + OooOoO.toLowerCase();
        }
        sb.append(str);
        return sb.toString();
    }

    @Nullable
    public String OooOooO() {
        String OooO0O02 = this.f20998OooO00o.OooO0O0(257);
        if (OooO0O02 == null) {
            return null;
        }
        return OooO0O02 + " pixels";
    }

    @Nullable
    public String OooOooo() {
        String OooO0O02 = this.f20998OooO00o.OooO0O0(256);
        if (OooO0O02 == null) {
            return null;
        }
        return OooO0O02 + " pixels";
    }

    @Nullable
    public String Oooo() {
        return OooO00o(284, 1, "Chunky (contiguous for each subsampling pixel)", "Separate (Y-plane/Cb-plane/Cr-plane format)");
    }

    @Nullable
    public String Oooo0() {
        Integer OooO00o = this.f20998OooO00o.m19639OooO00o(512);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 1) {
            return "Baseline";
        }
        if (intValue == 14) {
            return "Lossless";
        }
        return "Unknown (" + OooO00o + C3848l.f10402t;
    }

    @Nullable
    public String Oooo000() {
        String OooO0O02 = this.f20998OooO00o.OooO0O0(1);
        if (OooO0O02 == null) {
            return null;
        }
        if ("R98".equalsIgnoreCase(OooO0O02.trim())) {
            return "Recommended Exif Interoperability Rules (ExifR98)";
        }
        return "Unknown (" + OooO0O02 + C3848l.f10402t;
    }

    @Nullable
    public String Oooo00O() {
        return OooO0O0(2, 2);
    }

    @Nullable
    public String Oooo00o() {
        Integer OooO00o = this.f20998OooO00o.m19639OooO00o(oO0oO000.o00oO0o);
        if (OooO00o != null) {
            return Integer.toString(OooO00o.intValue());
        }
        return null;
    }

    @Nullable
    public String Oooo0O0() {
        return OooO0o0(oO0oO000.o000Oooo);
    }

    @Nullable
    public String Oooo0OO() {
        Double OooO00o = this.f20998OooO00o.m19637OooO00o(oO0oO000.o00000o0);
        if (OooO00o == null) {
            return null;
        }
        return C7929oO0o0OoO.OooO00o(oO0O0OO.OooO00o(OooO00o.doubleValue()));
    }

    @Nullable
    public String Oooo0o() {
        return OooO00o(254, 0, "Full-resolution image", "Reduced-resolution image", "Single page of multi-page image", "Single page of multi-page reduced-resolution image", "Transparency mask", "Transparency mask of reduced-resolution image", "Transparency mask of multi-page image", "Transparency mask of reduced-resolution multi-page image");
    }

    @Nullable
    public String Oooo0o0() {
        Integer OooO00o = this.f20998OooO00o.m19639OooO00o(oO0oO000.o00000oO);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 255) {
            return "(Other)";
        }
        switch (intValue) {
            case 0:
                return "Unknown";
            case 1:
                return "Average";
            case 2:
                return "Center weighted average";
            case 3:
                return "Spot";
            case 4:
                return "Multi-spot";
            case 5:
                return "Multi-segment";
            case 6:
                return "Partial";
            default:
                return "Unknown (" + OooO00o + C3848l.f10402t;
        }
    }

    @Nullable
    public String Oooo0oO() {
        return super.OooO0o(274);
    }

    @Nullable
    public String Oooo0oo() {
        Integer OooO00o = this.f20998OooO00o.m19639OooO00o(262);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 32803) {
            return "Color Filter Array";
        }
        if (intValue == 32892) {
            return "Linear Raw";
        }
        switch (intValue) {
            case 0:
                return "WhiteIsZero";
            case 1:
                return "BlackIsZero";
            case 2:
                return "RGB";
            case 3:
                return "RGB Palette";
            case 4:
                return "Transparency Mask";
            case 5:
                return "CMYK";
            case 6:
                return "YCbCr";
            default:
                switch (intValue) {
                    case 8:
                        return "CIELab";
                    case 9:
                        return "ICCLab";
                    case 10:
                        return "ITULab";
                    default:
                        switch (intValue) {
                            case 32844:
                                return "Pixar LogL";
                            case 32845:
                                return "Pixar LogLuv";
                            default:
                                return "Unknown colour space";
                        }
                }
        }
    }

    @Nullable
    public String OoooO() {
        String OooO0O02 = this.f20998OooO00o.OooO0O0(277);
        if (OooO0O02 == null) {
            return null;
        }
        return OooO0O02 + " samples/pixel";
    }

    @Nullable
    public String OoooO0() {
        return OooO00o(296, 1, "(No unit)", "Inch", SocializeProtocolConstants.PROTOCOL_KEY_COMMENT_COUNT);
    }

    @Nullable
    public String OoooO00() {
        int[] OooO00o = this.f20998OooO00o.m19652OooO00o(532);
        if (OooO00o == null || OooO00o.length < 6) {
            Object OooO00o2 = this.f20998OooO00o.m19642OooO00o(532);
            if (OooO00o2 == null || !(OooO00o2 instanceof long[])) {
                return null;
            }
            long[] jArr = (long[]) OooO00o2;
            if (jArr.length < 6) {
                return null;
            }
            int[] iArr = new int[jArr.length];
            for (int i = 0; i < jArr.length; i++) {
                iArr[i] = (int) jArr[i];
            }
            OooO00o = iArr;
        }
        int i2 = OooO00o[0];
        int i3 = OooO00o[1];
        int i4 = OooO00o[2];
        int i5 = OooO00o[3];
        return String.format("[%d,%d,%d] [%d,%d,%d]", Integer.valueOf(i2), Integer.valueOf(i4), Integer.valueOf(OooO00o[4]), Integer.valueOf(i3), Integer.valueOf(i5), Integer.valueOf(OooO00o[5]));
    }

    @Nullable
    public String OoooO0O() {
        String OooO0O02 = this.f20998OooO00o.OooO0O0(278);
        if (OooO0O02 == null) {
            return null;
        }
        return OooO0O02 + " rows/strip";
    }

    @Nullable
    public String OoooOO0() {
        return OooO00o((int) oO0oO000.o000Oo0O, "None", "Low saturation", "High saturation");
    }

    @Nullable
    public String OoooOOO() {
        return OooO00o(oO0oO000.o000O0oO, 1, "Directly photographed image");
    }

    @Nullable
    public String OoooOOo() {
        return OooO00o(oO0oO000.o000O0O0, 1, "(Not defined)", "One-chip color area sensor", "Two-chip color area sensor", "Three-chip color area sensor", "Color sequential area sensor", null, "Trilinear sensor", "Color sequential linear sensor");
    }

    @Nullable
    public String OoooOo0() {
        return OooO00o((int) oO0oO000.o0OOO0o, "Unknown", "Standard Output Sensitivity", "Recommended Exposure Index", "ISO Speed", "Standard Output Sensitivity and Recommended Exposure Index", "Standard Output Sensitivity and ISO Speed", "Recommended Exposure Index and ISO Speed", "Standard Output Sensitivity, Recommended Exposure Index and ISO Speed");
    }

    @Nullable
    public String OoooOoO() {
        return OooO00o((int) oO0oO000.o000Oo0o, "None", "Low", "Hard");
    }

    @Nullable
    public String OoooOoo() {
        return super.OooO0oo(oO0oO000.o00000O0);
    }

    @Nullable
    public String Ooooo00() {
        String OooO0O02 = this.f20998OooO00o.OooO0O0(279);
        if (OooO0O02 == null) {
            return null;
        }
        return OooO0O02 + " bytes";
    }

    @Nullable
    public String Ooooo0o() {
        return OooO00o(255, 1, "Full-resolution image", "Reduced-resolution image", "Single page of multi-page image");
    }

    @Nullable
    public String OooooO0() {
        Rational OooO00o = this.f20998OooO00o.m19633OooO00o(oO0oO000.o0000Ooo);
        if (OooO00o == null) {
            return null;
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.0##");
        return decimalFormat.format(OooO00o.doubleValue()) + " metres";
    }

    @Nullable
    public String OooooOO() {
        return OooO00o((int) oO0oO000.o000OoOO, "Unknown", "Macro", "Close view", "Distant view");
    }

    @Nullable
    public String OooooOo() {
        return OooO00o(263, 1, "No dithering or halftoning", "Ordered dither or halftone", "Randomized dither");
    }

    @Nullable
    public String Oooooo() {
        Integer OooO00o = this.f20998OooO00o.m19639OooO00o(37384);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 0) {
            return "Unknown";
        }
        if (intValue == 1) {
            return "Daylight";
        }
        if (intValue == 2) {
            return "Florescent";
        }
        if (intValue == 3) {
            return "Tungsten";
        }
        if (intValue == 4) {
            return ExifInterface.f14327oo000o;
        }
        if (intValue == 255) {
            return "(Other)";
        }
        switch (intValue) {
            case 9:
                return "Fine Weather";
            case 10:
                return "Cloudy";
            case 11:
                return "Shade";
            case 12:
                return "Daylight Fluorescent";
            case 13:
                return "Day White Fluorescent";
            case 14:
                return "Cool White Fluorescent";
            case 15:
                return "White Fluorescent";
            case 16:
                return "Warm White Fluorescent";
            case 17:
                return "Standard light";
            case 18:
                return "Standard light (B)";
            case 19:
                return "Standard light (C)";
            case 20:
                return "D55";
            case 21:
                return "D65";
            case 22:
                return "D75";
            case 23:
                return "D50";
            case 24:
                return "Studio Tungsten";
            default:
                return "Unknown (" + OooO00o + C3848l.f10402t;
        }
    }

    @Nullable
    public String Oooooo0() {
        byte[] OooO00o = this.f20998OooO00o.m19651OooO00o(oO0oO000.o0000o0);
        if (OooO00o == null) {
            return null;
        }
        if (OooO00o.length == 0) {
            return "";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ASCII", System.getProperty("file.encoding"));
        hashMap.put("UNICODE", C3817f.f10343e);
        hashMap.put("JIS", "Shift-JIS");
        try {
            if (OooO00o.length >= 10) {
                String str = new String(OooO00o, 0, 10);
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    String str3 = (String) entry.getValue();
                    if (str.startsWith(str2)) {
                        for (int length = str2.length(); length < 10; length++) {
                            byte b = OooO00o[length];
                            if (!(b == 0 || b == 32)) {
                                return new String(OooO00o, length, OooO00o.length - length, str3).trim();
                            }
                        }
                        return new String(OooO00o, 10, OooO00o.length - 10, str3).trim();
                    }
                }
            }
            return new String(OooO00o, System.getProperty("file.encoding")).trim();
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    @Nullable
    public String OoooooO() {
        return OooO00o((int) oO0oO000.o0OoO0o, "Auto white balance", "Manual white balance");
    }

    @Nullable
    public String Ooooooo() {
        return OooOO0(oO0oO000.o0000oOo);
    }

    @Nullable
    public String o000oOoO() {
        return OooO00o((int) oO0oO000.o000OOo0, "Standard", "Landscape", "Portrait", "Night scene");
    }

    @Nullable
    public String o00O0O() {
        return OooOO0(oO0oO000.o0000ooO);
    }

    @Nullable
    public String o00Oo0() {
        return OooOO0(oO0oO000.o0000oO0);
    }

    @Nullable
    public String o00Ooo() {
        Rational OooO00o = this.f20998OooO00o.m19633OooO00o(282);
        if (OooO00o == null) {
            return null;
        }
        String OoooO0 = OoooO0();
        Object[] objArr = new Object[2];
        objArr[0] = OooO00o.toSimpleString(true);
        objArr[1] = OoooO0 == null ? "unit" : OoooO0.toLowerCase();
        return String.format("%s dots per %s", objArr);
    }

    @Nullable
    public String o00o0O() {
        return OooO00o(531, 1, "Center of pixel array", "Datum point");
    }

    @Nullable
    public String o00ooo() {
        int[] OooO00o = this.f20998OooO00o.m19652OooO00o(530);
        if (OooO00o == null || OooO00o.length < 2) {
            return null;
        }
        if (OooO00o[0] == 2 && OooO00o[1] == 1) {
            return "YCbCr4:2:2";
        }
        return (OooO00o[0] == 2 && OooO00o[1] == 2) ? "YCbCr4:2:0" : "(Unknown)";
    }

    @Nullable
    public String o0OoOo0() {
        return OooOO0(oO0oO000.o0000oOO);
    }

    @Nullable
    public String oo000o() {
        Rational OooO00o = this.f20998OooO00o.m19633OooO00o(283);
        if (OooO00o == null) {
            return null;
        }
        String OoooO0 = OoooO0();
        Object[] objArr = new Object[2];
        objArr[0] = OooO00o.toSimpleString(true);
        objArr[1] = OoooO0 == null ? "unit" : OoooO0.toLowerCase();
        return String.format("%s dots per %s", objArr);
    }

    @Nullable
    public String ooOO() {
        return OooOO0(oO0oO000.o0000oo0);
    }

    @Nullable
    public static String OooO00o(@Nullable int[] iArr) {
        if (iArr == null) {
            return null;
        }
        if (iArr.length < 2) {
            return "<truncated data>";
        }
        if (iArr[0] == 0 && iArr[1] == 0) {
            return "<zero pattern size>";
        }
        int i = (iArr[0] * iArr[1]) + 2;
        if (i > iArr.length) {
            return "<invalid pattern size>";
        }
        String[] strArr = {"Red", "Green", "Blue", "Cyan", "Magenta", "Yellow", "White"};
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i2 = 2; i2 < i; i2++) {
            if (iArr[i2] <= 6) {
                sb.append(strArr[iArr[i2]]);
            } else {
                sb.append("Unknown");
            }
            if ((i2 - 2) % iArr[1] == 0) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            } else if (i2 != i - 1) {
                sb.append("][");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Nullable
    public String OooOO0() {
        return OooO00o((int) oO0oO000.o000Oo00, "None", "Soft", "Hard");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v1, resolved type: byte[] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: int[] */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: byte */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p118pd.sdk.C7929oO0o0OoO
    @Nullable
    private int[] OooO00o(int i) {
        byte[] OooO00o = this.f20998OooO00o.m19651OooO00o(i);
        if (OooO00o == 0) {
            return null;
        }
        if (OooO00o.length < 4) {
            int[] iArr = new int[OooO00o.length];
            for (int i2 = 0; i2 < OooO00o.length; i2++) {
                iArr[i2] = OooO00o[i2];
            }
            return iArr;
        }
        int[] iArr2 = new int[(OooO00o.length - 2)];
        try {
            oO0Oo0 oo0oo0 = new oO0Oo0(OooO00o);
            int OooO00o2 = oo0oo0.m19598OooO00o(0);
            int OooO00o3 = oo0oo0.m19598OooO00o(2);
            Boolean bool = false;
            if ((OooO00o2 * OooO00o3) + 2 > OooO00o.length) {
                oo0oo0.OooO00o(!oo0oo0.m19599OooO00o());
                OooO00o2 = oo0oo0.m19598OooO00o(0);
                OooO00o3 = oo0oo0.m19598OooO00o(2);
                if (OooO00o.length >= (OooO00o2 * OooO00o3) + 2) {
                    bool = true;
                }
            } else {
                bool = true;
            }
            if (bool.booleanValue()) {
                iArr2[0] = OooO00o2;
                iArr2[1] = OooO00o3;
                for (int i3 = 4; i3 < OooO00o.length; i3++) {
                    iArr2[i3 - 2] = oo0oo0.OooO0O0(i3);
                }
            }
        } catch (IOException e) {
            T t = this.f20998OooO00o;
            t.OooO00o("IO exception processing data: " + e.getMessage());
        }
        return iArr2;
    }

    @Nullable
    public String OooO0OO() {
        String OooO0O02 = this.f20998OooO00o.OooO0O0(258);
        if (OooO0O02 == null) {
            return null;
        }
        return OooO0O02 + " bits/component/pixel";
    }
}
