package com.p118pd.sdk;

import androidx.exifinterface.media.ExifInterface;
import com.drew.lang.Rational;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.p118pd.sdk.C7997oO0ooOO0;
import com.umeng.message.proguard.C3848l;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import org.android.agoo.message.MessageService;

/* renamed from: com.pd.sdk.oO0ooO  reason: case insensitive filesystem */
public class C7991oO0ooO extends C7929oO0o0OoO<C7997oO0ooOO0> {
    public C7991oO0ooO(@NotNull C7997oO0ooOO0 oo0oooo0) {
        super(oo0oooo0);
    }

    @Nullable
    public String OooO() {
        return OooO00o(C7997oO0ooOO0.OooO00o.OooOOOO, "1/3 EV", "2/3 EV", "1 EV");
    }

    @Nullable
    public String OooO00o() {
        Double OooO00o = ((C7997oO0ooOO0) this.f20998OooO00o).m19637OooO00o(4098);
        if (OooO00o == null) {
            return null;
        }
        return C7929oO0o0OoO.OooO00o(oO0O0OO.OooO00o(OooO00o.doubleValue()));
    }

    @Nullable
    public String OooO0O0() {
        Long OooO00o = ((C7997oO0ooOO0) this.f20998OooO00o).m19641OooO00o(C7997oO0ooOO0.OooO00o.OooOO0O);
        if (OooO00o == null) {
            return null;
        }
        double longValue = (double) OooO00o.longValue();
        Double.isNaN(longValue);
        return C7929oO0o0OoO.OooO00o(Math.pow((longValue / 16.0d) - 0.5d, 2.0d));
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    @Nullable
    public String OooO0OO(int i) {
        if (i == 0) {
            return OoooOoO();
        }
        if (i == 519) {
            return OooOO0o();
        }
        if (i == 521) {
            return OooOO0();
        }
        if (i == 770) {
            return Ooooo0o();
        }
        if (i == 4100) {
            return OooOoo();
        }
        if (i == 4111) {
            return Oooooo();
        }
        if (i == 4113) {
            return OooOOO();
        }
        if (i == 4117) {
            return o00o0O();
        }
        if (i == 4137) {
            return OooOOo();
        }
        if (i == 4149) {
            return OooooO0();
        }
        if (i == 4106) {
            return Oooo0O0();
        }
        if (i == 4107) {
            return Oooo0();
        }
        if (i == 4119) {
            return OooooOO();
        }
        if (i == 4120) {
            return OooO0oo();
        }
        switch (i) {
            case 257:
                return OooOOOo();
            case 258:
                return Oooo0o0();
            case 259:
                return Oooo0o();
            default:
                switch (i) {
                    case 512:
                        return o0OoOo0();
                    case 513:
                        return o000oOoO();
                    case 514:
                        return OoooOo0();
                    case 515:
                        return OooO0o();
                    case 516:
                        return OooOo0O();
                    case 517:
                        return OooOooo();
                    default:
                        switch (i) {
                            case 4096:
                                return Ooooooo();
                            case 4097:
                                return OoooOO0();
                            case 4098:
                                return OooO00o();
                            default:
                                switch (i) {
                                    case C7997oO0ooOO0.OooO00o.OooO0O0 /*{ENCODED_INT: 61442}*/:
                                        return OooOo();
                                    case C7997oO0ooOO0.OooO00o.OooO0OO /*{ENCODED_INT: 61443}*/:
                                        return OooOoo0();
                                    case C7997oO0ooOO0.OooO00o.OooO0Oo /*{ENCODED_INT: 61444}*/:
                                        return oo000o();
                                    case C7997oO0ooOO0.OooO00o.OooO0o0 /*{ENCODED_INT: 61445}*/:
                                        return Oooo0oo();
                                    case C7997oO0ooOO0.OooO00o.OooO0o /*{ENCODED_INT: 61446}*/:
                                        return Oooo0oO();
                                    case C7997oO0ooOO0.OooO00o.OooO0oO /*{ENCODED_INT: 61447}*/:
                                        return OoooooO();
                                    case C7997oO0ooOO0.OooO00o.OooO0oo /*{ENCODED_INT: 61448}*/:
                                        return Ooooo00();
                                    case C7997oO0ooOO0.OooO00o.OooO /*{ENCODED_INT: 61449}*/:
                                        return OooO0Oo();
                                    case C7997oO0ooOO0.OooO00o.OooOO0 /*{ENCODED_INT: 61450}*/:
                                        return OooO0o0();
                                    case C7997oO0ooOO0.OooO00o.OooOO0O /*{ENCODED_INT: 61451}*/:
                                        return OooO0O0();
                                    case C7997oO0ooOO0.OooO00o.OooOO0o /*{ENCODED_INT: 61452}*/:
                                        return OoooOOo();
                                    case C7997oO0ooOO0.OooO00o.OooOOO0 /*{ENCODED_INT: 61453}*/:
                                        return OooOo0();
                                    case C7997oO0ooOO0.OooO00o.OooOOO /*{ENCODED_INT: 61454}*/:
                                        return OooOo0o();
                                    case C7997oO0ooOO0.OooO00o.OooOOOO /*{ENCODED_INT: 61455}*/:
                                        return OooO();
                                    default:
                                        switch (i) {
                                            case C7997oO0ooOO0.OooO00o.OooOOOo /*{ENCODED_INT: 61457}*/:
                                                return OoooO00();
                                            case C7997oO0ooOO0.OooO00o.OooOOo0 /*{ENCODED_INT: 61458}*/:
                                                return OoooO0O();
                                            case C7997oO0ooOO0.OooO00o.OooOOo /*{ENCODED_INT: 61459}*/:
                                                return OooOooO();
                                            case C7997oO0ooOO0.OooO00o.OooOOoo /*{ENCODED_INT: 61460}*/:
                                                return Oooo00O();
                                            case C7997oO0ooOO0.OooO00o.OooOo00 /*{ENCODED_INT: 61461}*/:
                                                return OooOoOO();
                                            case C7997oO0ooOO0.OooO00o.OooOo0 /*{ENCODED_INT: 61462}*/:
                                                return OooOOoo();
                                            case C7997oO0ooOO0.OooO00o.OooOo0O /*{ENCODED_INT: 61463}*/:
                                                return o00Ooo();
                                            case C7997oO0ooOO0.OooO00o.OooOo0o /*{ENCODED_INT: 61464}*/:
                                                return OoooOoo();
                                            default:
                                                switch (i) {
                                                    case C7997oO0ooOO0.OooO00o.OooOo /*{ENCODED_INT: 61467}*/:
                                                        return OooOoO0();
                                                    case C7997oO0ooOO0.OooO00o.OooOoO0 /*{ENCODED_INT: 61468}*/:
                                                        return OoooOOO();
                                                    case C7997oO0ooOO0.OooO00o.OooOoO /*{ENCODED_INT: 61469}*/:
                                                        return o00oO0O();
                                                    case C7997oO0ooOO0.OooO00o.OooOoOO /*{ENCODED_INT: 61470}*/:
                                                        return o00oO0o();
                                                    case C7997oO0ooOO0.OooO00o.OooOoo0 /*{ENCODED_INT: 61471}*/:
                                                        return o00ooo();
                                                    case C7997oO0ooOO0.OooO00o.OooOoo /*{ENCODED_INT: 61472}*/:
                                                        return OooooOo();
                                                    case C7997oO0ooOO0.OooO00o.OooOooO /*{ENCODED_INT: 61473}*/:
                                                        return OooOOo0();
                                                    case C7997oO0ooOO0.OooO00o.OooOooo /*{ENCODED_INT: 61474}*/:
                                                        return Oooooo0();
                                                    case C7997oO0ooOO0.OooO00o.Oooo000 /*{ENCODED_INT: 61475}*/:
                                                        return o00Oo0();
                                                    case C7997oO0ooOO0.OooO00o.Oooo00O /*{ENCODED_INT: 61476}*/:
                                                        return OooOoO();
                                                    case C7997oO0ooOO0.OooO00o.Oooo00o /*{ENCODED_INT: 61477}*/:
                                                        return OoooO();
                                                    case C7997oO0ooOO0.OooO00o.Oooo0 /*{ENCODED_INT: 61478}*/:
                                                        return OooOO0O();
                                                    case C7997oO0ooOO0.OooO00o.Oooo0O0 /*{ENCODED_INT: 61479}*/:
                                                        return OoooO0();
                                                    case C7997oO0ooOO0.OooO00o.Oooo0OO /*{ENCODED_INT: 61480}*/:
                                                        return Oooo0OO();
                                                    case C7997oO0ooOO0.OooO00o.Oooo0o0 /*{ENCODED_INT: 61481}*/:
                                                        return OooOOOO();
                                                    case C7997oO0ooOO0.OooO00o.Oooo0o /*{ENCODED_INT: 61482}*/:
                                                        return OooOOO0();
                                                    case C7997oO0ooOO0.OooO00o.Oooo0oO /*{ENCODED_INT: 61483}*/:
                                                        return OooO0oO();
                                                    case C7997oO0ooOO0.OooO00o.Oooo0oo /*{ENCODED_INT: 61484}*/:
                                                        return Oooo();
                                                    case C7997oO0ooOO0.OooO00o.Oooo /*{ENCODED_INT: 61485}*/:
                                                        return OooO0OO();
                                                    case C7997oO0ooOO0.OooO00o.OoooO00 /*{ENCODED_INT: 61486}*/:
                                                        return ooOO();
                                                    case C7997oO0ooOO0.OooO00o.OoooO0 /*{ENCODED_INT: 61487}*/:
                                                        return o00O0O();
                                                    case C7997oO0ooOO0.OooO00o.OoooO0O /*{ENCODED_INT: 61488}*/:
                                                        return o0ooOO0();
                                                    case C7997oO0ooOO0.OooO00o.OoooO /*{ENCODED_INT: 61489}*/:
                                                        return Oooo00o();
                                                    case C7997oO0ooOO0.OooO00o.OoooOO0 /*{ENCODED_INT: 61490}*/:
                                                        return Oooo000();
                                                    case C7997oO0ooOO0.OooO00o.o000oOoO /*{ENCODED_INT: 61491}*/:
                                                        return OooOo00();
                                                    default:
                                                        return super.OooO0OO(i);
                                                }
                                        }
                                }
                        }
                }
        }
    }

    @Nullable
    public String OooO0Oo() {
        Long OooO00o = ((C7997oO0ooOO0) this.f20998OooO00o).m19641OooO00o(C7997oO0ooOO0.OooO00o.OooO);
        if (OooO00o == null) {
            return null;
        }
        double longValue = (double) OooO00o.longValue();
        Double.isNaN(longValue);
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat.format(Math.pow((longValue / 8.0d) - 1.0d, 2.0d) * 3.125d);
    }

    @Nullable
    public String OooO0o() {
        return OooO00o(515, "Off", "On");
    }

    @Nullable
    public String OooO0o0() {
        Long OooO00o = ((C7997oO0ooOO0) this.f20998OooO00o).m19641OooO00o(C7997oO0ooOO0.OooO00o.OooOO0);
        if (OooO00o == null) {
            return null;
        }
        double longValue = (double) (49 - OooO00o.longValue());
        Double.isNaN(longValue);
        double pow = Math.pow(longValue / 8.0d, 2.0d);
        DecimalFormat decimalFormat = new DecimalFormat(AbstractC7922oO0o0O0O.OooO00o);
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        return decimalFormat.format(pow) + " sec";
    }

    @Nullable
    public String OooO0oO() {
        return super.OooO0OO(C7997oO0ooOO0.OooO00o.Oooo0oO);
    }

    @Nullable
    public String OooO0oo() {
        int[] OooO00o = ((C7997oO0ooOO0) this.f20998OooO00o).m19652OooO00o(C7997oO0ooOO0.OoooooO);
        if (OooO00o == null) {
            return null;
        }
        double d = (double) ((short) OooO00o[0]);
        Double.isNaN(d);
        return String.valueOf(d / 256.0d);
    }

    @Nullable
    public String OooOO0() {
        byte[] OooO00o = ((C7997oO0ooOO0) this.f20998OooO00o).m19651OooO00o(521);
        if (OooO00o == null) {
            return null;
        }
        return new String(OooO00o);
    }

    @Nullable
    public String OooOO0O() {
        return OooO00o(C7997oO0ooOO0.OooO00o.Oooo0, "DiMAGE 7", "DiMAGE 5", "DiMAGE S304", "DiMAGE S404", "DiMAGE 7i", "DiMAGE 7Hi", "DiMAGE A1", "DiMAGE S414");
    }

    @Nullable
    public String OooOO0o() {
        String OooO0O0 = ((C7997oO0ooOO0) this.f20998OooO00o).OooO0O0(519);
        if (OooO0O0 == null) {
            return null;
        }
        return C7997oO0ooOO0.f21035OooO0O0.containsKey(OooO0O0) ? C7997oO0ooOO0.f21035OooO0O0.get(OooO0O0) : OooO0O0;
    }

    @Nullable
    public String OooOOO() {
        int[] OooO00o = ((C7997oO0ooOO0) this.f20998OooO00o).m19652OooO00o(4113);
        if (OooO00o == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < OooO00o.length; i++) {
            sb.append((int) ((short) OooO00o[i]));
            if (i < OooO00o.length - 1) {
                sb.append(" ");
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }

    @Nullable
    public String OooOOO0() {
        Long OooO00o = ((C7997oO0ooOO0) this.f20998OooO00o).m19641OooO00o(C7997oO0ooOO0.OooO00o.Oooo0o);
        if (OooO00o == null) {
            return null;
        }
        return Long.toString(OooO00o.longValue() - 3);
    }

    @Nullable
    public String OooOOOO() {
        return OooO00o(C7997oO0ooOO0.OooO00o.Oooo0o0, "Natural Color", "Black & White", "Vivid Color", "Solarization", "AdobeRGB");
    }

    @Nullable
    public String OooOOOo() {
        return OooO00o(257, "Natural Colour", "Black & White", "Vivid Colour", "Solarization", "AdobeRGB");
    }

    @Nullable
    public String OooOOo() {
        return OooO00o(C7997oO0ooOO0.o0OO00O, "High", ReactProgressBarViewManager.DEFAULT_STYLE, "Low");
    }

    @Nullable
    public String OooOOo0() {
        Long OooO00o = ((C7997oO0ooOO0) this.f20998OooO00o).m19641OooO00o(C7997oO0ooOO0.OooO00o.OooOooO);
        if (OooO00o == null) {
            return null;
        }
        return Long.toString(OooO00o.longValue() - 3);
    }

    @Nullable
    public String OooOOoo() {
        Long OooO00o = ((C7997oO0ooOO0) this.f20998OooO00o).m19641OooO00o(C7997oO0ooOO0.OooO00o.OooOo0);
        if (OooO00o == null) {
            return null;
        }
        int longValue = (int) (OooO00o.longValue() & 255);
        int longValue2 = (int) ((OooO00o.longValue() >> 16) & 255);
        int longValue3 = ((int) (255 & (OooO00o.longValue() >> 8))) + 1970;
        if (!C7894oO0OoO0.OooO00o(longValue3, longValue2, longValue)) {
            return "Invalid date";
        }
        return String.format("%04d-%02d-%02d", Integer.valueOf(longValue3), Integer.valueOf(longValue2 + 1), Integer.valueOf(longValue));
    }

    @Nullable
    public String OooOo() {
        return OooO00o(C7997oO0ooOO0.OooO00o.OooO0O0, "P", ExifInterface.o000oo0O, ExifInterface.o000oOoo, "M");
    }

    @Nullable
    public String OooOo0() {
        return OooO00o(C7997oO0ooOO0.OooO00o.OooOOO0, "Off", "Electronic magnification", "Digital zoom 2x");
    }

    @Nullable
    public String OooOo00() {
        return OooO00o(C7997oO0ooOO0.OooO00o.o000oOoO, "Exposure", ExifInterface.o0000Ooo, ExifInterface.o00000oO, "Filter");
    }

    @Nullable
    public String OooOo0O() {
        Rational OooO00o = ((C7997oO0ooOO0) this.f20998OooO00o).m19633OooO00o(516);
        if (OooO00o == null) {
            return null;
        }
        return OooO00o.toSimpleString(false);
    }

    @Nullable
    public String OooOo0o() {
        Long OooO00o = ((C7997oO0ooOO0) this.f20998OooO00o).m19641OooO00o(C7997oO0ooOO0.OooO00o.OooOOO);
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        if (OooO00o == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        double longValue = (double) OooO00o.longValue();
        Double.isNaN(longValue);
        sb.append(decimalFormat.format((longValue / 3.0d) - 2.0d));
        sb.append(" EV");
        return sb.toString();
    }

    @Nullable
    public String OooOoO() {
        Long OooO00o = ((C7997oO0ooOO0) this.f20998OooO00o).m19641OooO00o(C7997oO0ooOO0.OooO00o.Oooo00O);
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        if (OooO00o == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        double longValue = (double) (OooO00o.longValue() - 6);
        Double.isNaN(longValue);
        sb.append(decimalFormat.format(longValue / 3.0d));
        sb.append(" EV");
        return sb.toString();
    }

    @Nullable
    public String OooOoO0() {
        return OooO00o(C7997oO0ooOO0.OooO00o.OooOo, "Off", "On");
    }

    @Nullable
    public String OooOoOO() {
        return OooO00o(C7997oO0ooOO0.OooO00o.OooOo00, "No", "Yes");
    }

    @Nullable
    public String OooOoo() {
        return OooO00o(4100, null, null, "On", "Off");
    }

    @Nullable
    public String OooOoo0() {
        return OooO00o(C7997oO0ooOO0.OooO00o.OooO0OO, ReactProgressBarViewManager.DEFAULT_STYLE, "Red-eye reduction", "Rear flash sync", "Wireless");
    }

    @Nullable
    public String OooOooO() {
        Long OooO00o = ((C7997oO0ooOO0) this.f20998OooO00o).m19641OooO00o(C7997oO0ooOO0.OooO00o.OooOOo);
        if (OooO00o == null) {
            return null;
        }
        double longValue = (double) OooO00o.longValue();
        Double.isNaN(longValue);
        return C7929oO0o0OoO.OooO0O0(longValue / 256.0d);
    }

    @Nullable
    public String OooOooo() {
        Rational OooO00o = ((C7997oO0ooOO0) this.f20998OooO00o).m19633OooO00o(517);
        if (OooO00o == null) {
            return null;
        }
        DecimalFormat decimalFormat = new DecimalFormat(AbstractC7922oO0o0O0O.OooO00o);
        return decimalFormat.format(OooO00o.doubleValue()) + " mm";
    }

    @Nullable
    public String Oooo() {
        return OooO00o(C7997oO0ooOO0.OooO00o.Oooo0oo, "Did Not Fire", "Fired");
    }

    @Nullable
    public String Oooo0() {
        return OooO00o(4107, "Auto", "Manual");
    }

    @Nullable
    public String Oooo000() {
        return OooO00o(C7997oO0ooOO0.OooO00o.OoooOO0, "Wide Focus (Normal)", "Spot Focus");
    }

    @Nullable
    public String Oooo00O() {
        Long OooO00o = ((C7997oO0ooOO0) this.f20998OooO00o).m19641OooO00o(C7997oO0ooOO0.OooO00o.OooOOoo);
        if (OooO00o == null) {
            return null;
        }
        if (OooO00o.longValue() == 0) {
            return "Infinity";
        }
        return OooO00o + " mm";
    }

    @Nullable
    public String Oooo00o() {
        return OooO00o(C7997oO0ooOO0.OooO00o.OoooO, "Auto Focus", "Manual Focus");
    }

    @Nullable
    public String Oooo0O0() {
        return OooO00o(4106, ReactProgressBarViewManager.DEFAULT_STYLE, "Macro");
    }

    @Nullable
    public String Oooo0OO() {
        return OooO00o(C7997oO0ooOO0.OooO00o.Oooo0OO, "Standard Form", "Data Form");
    }

    @Nullable
    public String Oooo0o() {
        return OooO00o(259, "Raw", "Super Fine", "Fine", "Standard", "Extra Fine");
    }

    @Nullable
    public String Oooo0o0() {
        return OooO00o(258, "Raw", "Super Fine", "Fine", "Standard", "Extra Fine");
    }

    @Nullable
    public String Oooo0oO() {
        return OooO00o(C7997oO0ooOO0.OooO00o.OooO0o, "Raw", "Super Fine", "Fine", "Standard", "Economy", "Extra Fine");
    }

    @Nullable
    public String Oooo0oo() {
        return OooO00o(C7997oO0ooOO0.OooO00o.OooO0o0, "2560 x 1920", "1600 x 1200", "1280 x 960", "640 x 480");
    }

    @Nullable
    public String OoooO() {
        return OooO00o(C7997oO0ooOO0.OooO00o.Oooo00o, MessageService.MSG_DB_COMPLETE, "200", "400", "800", "Auto", "64");
    }

    @Nullable
    public String OoooO0() {
        return OooO00o(C7997oO0ooOO0.OooO00o.Oooo0O0, "Still Image", "Time Lapse Movie");
    }

    @Nullable
    public String OoooO00() {
        if (!((C7997oO0ooOO0) this.f20998OooO00o).OooO0OO()) {
            return "N/A";
        }
        Long OooO00o = ((C7997oO0ooOO0) this.f20998OooO00o).m19641OooO00o(C7997oO0ooOO0.OooO00o.OooOOOo);
        if (OooO00o == null) {
            return null;
        }
        return OooO00o + " min";
    }

    @Nullable
    public String OoooO0O() {
        if (!((C7997oO0ooOO0) this.f20998OooO00o).OooO0OO()) {
            return "N/A";
        }
        Long OooO00o = ((C7997oO0ooOO0) this.f20998OooO00o).m19641OooO00o(C7997oO0ooOO0.OooO00o.OooOOo0);
        if (OooO00o == null) {
            return null;
        }
        return Long.toString(OooO00o.longValue());
    }

    @Nullable
    public String OoooOO0() {
        Rational OooO00o = ((C7997oO0ooOO0) this.f20998OooO00o).m19633OooO00o(4097);
        if (OooO00o == null) {
            return null;
        }
        return String.valueOf(Math.round(Math.pow(2.0d, OooO00o.doubleValue() - 5.0d) * 100.0d));
    }

    @Nullable
    public String OoooOOO() {
        Long OooO00o = ((C7997oO0ooOO0) this.f20998OooO00o).m19641OooO00o(C7997oO0ooOO0.OooO00o.OooOoO0);
        if (OooO00o == null) {
            return null;
        }
        return OooO00o.longValue() == 0 ? "File Number Memory Off" : Long.toString(OooO00o.longValue());
    }

    @Nullable
    public String OoooOOo() {
        return OooO00o(C7997oO0ooOO0.OooO00o.OooOO0o, "Off", "On");
    }

    @Nullable
    public String OoooOo0() {
        return OooO00o(514, "Normal (no macro)", "Macro");
    }

    @Nullable
    public String OoooOoO() {
        return OooO0O0(0, 2);
    }

    @Nullable
    public String OoooOoo() {
        Long OooO00o = ((C7997oO0ooOO0) this.f20998OooO00o).m19641OooO00o(C7997oO0ooOO0.OooO00o.OooOo0O);
        if (OooO00o == null) {
            return null;
        }
        double longValue = (double) OooO00o.longValue();
        Double.isNaN(longValue);
        return C7929oO0o0OoO.OooO00o(Math.pow((longValue / 16.0d) - 0.5d, 2.0d));
    }

    @Nullable
    public String Ooooo00() {
        return OooO00o(C7997oO0ooOO0.OooO00o.OooO0oo, "Multi-Segment", "Centre Weighted", "Spot");
    }

    @Nullable
    public String Ooooo0o() {
        return OooO00o(770, "Off", "On", "On (Preset)");
    }

    @Nullable
    public String OooooO0() {
        return OooO00o(C7997oO0ooOO0.o00000Oo, "No", "Yes");
    }

    @Nullable
    public String OooooOO() {
        int[] OooO00o = ((C7997oO0ooOO0) this.f20998OooO00o).m19652OooO00o(C7997oO0ooOO0.Oooooo);
        if (OooO00o == null) {
            return null;
        }
        double d = (double) ((short) OooO00o[0]);
        Double.isNaN(d);
        return String.valueOf(d / 256.0d);
    }

    @Nullable
    public String OooooOo() {
        Long OooO00o = ((C7997oO0ooOO0) this.f20998OooO00o).m19641OooO00o(C7997oO0ooOO0.OooO00o.OooOoo);
        if (OooO00o == null) {
            return null;
        }
        return Long.toString(OooO00o.longValue() - 3);
    }

    @Nullable
    public String Oooooo() {
        return OooO00o(C7997oO0ooOO0.OoooOoo, ReactProgressBarViewManager.DEFAULT_STYLE, "Hard", "Soft");
    }

    @Nullable
    public String Oooooo0() {
        return OooO00o(C7997oO0ooOO0.OooO00o.OooOooo, "Hard", ReactProgressBarViewManager.DEFAULT_STYLE, "Soft");
    }

    @Nullable
    public String OoooooO() {
        return OooO00o(C7997oO0ooOO0.OooO00o.OooO0oO, "Single", "Continuous", "Self Timer", null, "Bracketing", "Interval", "UHS Continuous", "HS Continuous");
    }

    @Nullable
    public String Ooooooo() {
        return super.OooO0oo(4096);
    }

    @Nullable
    public String o000oOoO() {
        String OooO0O0 = ((C7997oO0ooOO0) this.f20998OooO00o).OooO0O0(519);
        if (OooO0O0 != null) {
            Integer OooO00o = ((C7997oO0ooOO0) this.f20998OooO00o).m19639OooO00o(513);
            if (OooO00o == null) {
                return null;
            }
            if ((!OooO0O0.startsWith("SX") || OooO0O0.startsWith("SX151")) && !OooO0O0.startsWith("D4322")) {
                int intValue = OooO00o.intValue();
                if (intValue == 0) {
                    return "Standard Quality (Low)";
                }
                if (intValue == 1) {
                    return "High Quality (Normal)";
                }
                if (intValue == 2) {
                    return "Super High Quality (Fine)";
                }
                if (intValue == 4) {
                    return "RAW";
                }
                if (intValue == 5) {
                    return "Medium-Fine";
                }
                if (intValue == 6) {
                    return "Small-Fine";
                }
                if (intValue == 33) {
                    return "Uncompressed";
                }
                return "Unknown (" + OooO00o.toString() + C3848l.f10402t;
            }
            int intValue2 = OooO00o.intValue();
            if (intValue2 == 0) {
                return "Standard Quality (Low)";
            }
            if (intValue2 == 1) {
                return "High Quality (Normal)";
            }
            if (intValue2 == 2) {
                return "Super High Quality (Fine)";
            }
            if (intValue2 == 6) {
                return "RAW";
            }
            return "Unknown (" + OooO00o.toString() + C3848l.f10402t;
        }
        return OooO00o(513, 1, "Standard Quality", "High Quality", "Super High Quality");
    }

    @Nullable
    public String o00O0O() {
        return super.OooO0OO(C7997oO0ooOO0.OooO00o.OoooO0);
    }

    @Nullable
    public String o00Oo0() {
        return OooO00o(C7997oO0ooOO0.OooO00o.Oooo000, "None", "Portrait", "Text", "Night Portrait", "Sunset", "Sports Action");
    }

    @Nullable
    public String o00Ooo() {
        Long OooO00o = ((C7997oO0ooOO0) this.f20998OooO00o).m19641OooO00o(C7997oO0ooOO0.OooO00o.OooOo0O);
        if (OooO00o == null) {
            return null;
        }
        int longValue = (int) ((OooO00o.longValue() >> 8) & 255);
        int longValue2 = (int) ((OooO00o.longValue() >> 16) & 255);
        int longValue3 = (int) (255 & OooO00o.longValue());
        if (!C7894oO0OoO0.OooO0O0(longValue, longValue2, longValue3)) {
            return "Invalid time";
        }
        return String.format("%02d:%02d:%02d", Integer.valueOf(longValue), Integer.valueOf(longValue2), Integer.valueOf(longValue3));
    }

    @Nullable
    public String o00o0O() {
        int[] OooO00o = ((C7997oO0ooOO0) this.f20998OooO00o).m19652OooO00o(C7997oO0ooOO0.Oooooo0);
        if (OooO00o == null) {
            return null;
        }
        String format = String.format("%d %d", Integer.valueOf(OooO00o[0]), Integer.valueOf(OooO00o[1]));
        if (format.equals("1 0")) {
            return "Auto";
        }
        if (format.equals("1 2")) {
            return "Auto (2)";
        }
        if (format.equals("1 4")) {
            return "Auto (4)";
        }
        if (format.equals("2 2")) {
            return "3000 Kelvin";
        }
        if (format.equals("2 3")) {
            return "3700 Kelvin";
        }
        if (format.equals("2 4")) {
            return "4000 Kelvin";
        }
        if (format.equals("2 5")) {
            return "4500 Kelvin";
        }
        if (format.equals("2 6")) {
            return "5500 Kelvin";
        }
        if (format.equals("2 7")) {
            return "6500 Kelvin";
        }
        if (format.equals("2 8")) {
            return "7500 Kelvin";
        }
        if (format.equals("3 0")) {
            return "One-touch";
        }
        return "Unknown " + format;
    }

    @Nullable
    public String o00oO0O() {
        Long OooO00o = ((C7997oO0ooOO0) this.f20998OooO00o).m19641OooO00o(C7997oO0ooOO0.OooO00o.OooOoO);
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        if (OooO00o == null) {
            return null;
        }
        double longValue = (double) OooO00o.longValue();
        Double.isNaN(longValue);
        return decimalFormat.format(longValue / 256.0d);
    }

    @Nullable
    public String o00oO0o() {
        Long OooO00o = ((C7997oO0ooOO0) this.f20998OooO00o).m19641OooO00o(C7997oO0ooOO0.OooO00o.OooOoOO);
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        if (OooO00o == null) {
            return null;
        }
        double longValue = (double) OooO00o.longValue();
        Double.isNaN(longValue);
        return decimalFormat.format(longValue / 256.0d);
    }

    @Nullable
    public String o00ooo() {
        Long OooO00o = ((C7997oO0ooOO0) this.f20998OooO00o).m19641OooO00o(C7997oO0ooOO0.OooO00o.OooOoo0);
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        if (OooO00o == null) {
            return null;
        }
        double longValue = (double) OooO00o.longValue();
        Double.isNaN(longValue);
        return decimalFormat.format(longValue / 256.0d);
    }

    @Nullable
    public String o0OoOo0() {
        int i;
        long[] jArr = (long[]) ((C7997oO0ooOO0) this.f20998OooO00o).m19642OooO00o(512);
        if (jArr == null) {
            return null;
        }
        if (jArr.length < 1) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i2 = (int) jArr[0];
        if (i2 == 0) {
            sb.append("Normal picture taking mode");
        } else if (i2 == 1) {
            sb.append("Unknown picture taking mode");
        } else if (i2 == 2) {
            sb.append("Fast picture taking mode");
        } else if (i2 != 3) {
            sb.append("Unknown picture taking mode");
        } else {
            sb.append("Panorama picture taking mode");
        }
        if (jArr.length >= 2 && (i = (int) jArr[1]) != 0) {
            if (i == 1) {
                sb.append(" / 1st in a sequence");
            } else if (i == 2) {
                sb.append(" / 2nd in a sequence");
            } else if (i != 3) {
                sb.append(" / ");
                sb.append(jArr[1]);
                sb.append("th in a sequence");
            } else {
                sb.append(" / 3rd in a sequence");
            }
        }
        if (jArr.length >= 3) {
            int i3 = (int) jArr[2];
            if (i3 == 1) {
                sb.append(" / Left to right panorama direction");
            } else if (i3 == 2) {
                sb.append(" / Right to left panorama direction");
            } else if (i3 == 3) {
                sb.append(" / Bottom to top panorama direction");
            } else if (i3 == 4) {
                sb.append(" / Top to bottom panorama direction");
            }
        }
        return sb.toString();
    }

    @Nullable
    public String o0ooOO0() {
        return OooO00o(C7997oO0ooOO0.OooO00o.OoooO0O, "No Zone or AF Failed", "Center Zone (Horizontal Orientation)", "Center Zone (Vertical Orientation)", "Left Zone", "Right Zone");
    }

    @Nullable
    public String oo000o() {
        return OooO00o(C7997oO0ooOO0.OooO00o.OooO0Oo, "Auto", "Daylight", "Cloudy", "Tungsten", null, "Custom", null, "Fluorescent", "Fluorescent 2", null, null, "Custom 2", "Custom 3");
    }

    @Nullable
    public String ooOO() {
        return super.OooO0OO(C7997oO0ooOO0.OooO00o.OoooO00);
    }

    @Nullable
    public String OooO0OO() {
        Long OooO00o = ((C7997oO0ooOO0) this.f20998OooO00o).m19641OooO00o(C7997oO0ooOO0.OooO00o.Oooo);
        DecimalFormat decimalFormat = new DecimalFormat("0.##");
        if (OooO00o == null) {
            return null;
        }
        double longValue = (double) OooO00o.longValue();
        Double.isNaN(longValue);
        return decimalFormat.format((longValue / 8.0d) - 6.0d);
    }
}
