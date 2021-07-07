package com.p118pd.sdk;

import androidx.exifinterface.media.ExifInterface;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.umeng.message.UmengMessageHandler;
import com.umeng.message.proguard.C3848l;

/* renamed from: com.pd.sdk.oOO000o  reason: case insensitive filesystem */
public class C8008oOO000o extends C7929oO0o0OoO<C8010oOO000oO> {
    public C8008oOO000o(@NotNull C8010oOO000oO ooo000oo) {
        super(ooo000oo);
    }

    @Nullable
    public String OooO() {
        Integer OooO00o = ((C8010oOO000oO) this.f20998OooO00o).m19639OooO00o(C8010oOO000oO.Oooo);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 0) {
            return "Off";
        }
        if (intValue == 1) {
            return "Standard";
        }
        if (intValue == 2) {
            return "Advanced Auto";
        }
        if (intValue == 3) {
            return "Auto";
        }
        switch (intValue) {
            case 8:
                return "Advanced LV1";
            case 9:
                return "Advanced LV2";
            case 10:
                return "Advanced LV3";
            case 11:
                return "Advanced LV4";
            case 12:
                return "Advanced LV5";
            default:
                switch (intValue) {
                    case 16:
                        return "LV1";
                    case 17:
                        return "LV2";
                    case 18:
                        return "LV3";
                    case 19:
                        return "LV4";
                    case 20:
                        return "LV5";
                    default:
                        return String.format("Unknown (%d)", OooO00o);
                }
        }
    }

    @Nullable
    public String OooO00o() {
        Integer OooO00o = ((C8010oOO000oO) this.f20998OooO00o).m19639OooO00o(C8010oOO000oO.Ooooo00);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 0) {
            return "Off";
        }
        if (intValue == 1) {
            return "Auto";
        }
        if (intValue == 65535) {
            return "n/a";
        }
        return "Unknown (" + OooO00o + C3848l.f10402t;
    }

    @Nullable
    public String OooO0O0() {
        Integer OooO00o = ((C8010oOO000oO) this.f20998OooO00o).m19639OooO00o(C8010oOO000oO.OoooOoo);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 0) {
            return UmengMessageHandler.DEFAULT_NOTIFICATION_CHANNEL_NAME;
        }
        if (intValue == 1) {
            return "Multi";
        }
        if (intValue == 2) {
            return "Center";
        }
        if (intValue == 3) {
            return "Spot";
        }
        if (intValue == 4) {
            return "Flexible Spot";
        }
        if (intValue == 6) {
            return "Touch";
        }
        if (intValue == 65535) {
            return "n/a";
        }
        if (intValue == 14) {
            return "Manual Focus";
        }
        if (intValue == 15) {
            return "Face Detected";
        }
        return "Unknown (" + OooO00o + C3848l.f10402t;
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    @Nullable
    public String OooO0OO(int i) {
        switch (i) {
            case 258:
                return OooOOOO();
            case 260:
                return OooOO0O();
            case 261:
                return OooOoOO();
            case 277:
                return OooOoo();
            case 8201:
                return OooOOO();
            case C8010oOO000oO.OooOoO0 /*{ENCODED_INT: 8206}*/:
                return OooOo0();
            case C8010oOO000oO.OooOoO /*{ENCODED_INT: 8207}*/:
                return OooOoO0();
            case 8209:
                return OooOoo0();
            case 8210:
                return OooOOo();
            case C8010oOO000oO.OooOoo /*{ENCODED_INT: 8211}*/:
                return OooO0oo();
            case C8010oOO000oO.OooOooo /*{ENCODED_INT: 8214}*/:
                return OooO0o0();
            case C8010oOO000oO.Oooo000 /*{ENCODED_INT: 8219}*/:
                return OooOOO0();
            case C8010oOO000oO.Oooo00O /*{ENCODED_INT: 8222}*/:
                return OooO0OO();
            case C8010oOO000oO.Oooo0O0 /*{ENCODED_INT: 45057}*/:
                return OooOoO();
            case C8010oOO000oO.Oooo0o0 /*{ENCODED_INT: 45089}*/:
                return OooO0oO();
            case C8010oOO000oO.Oooo0oO /*{ENCODED_INT: 45091}*/:
                return OooOo0o();
            case C8010oOO000oO.Oooo0oo /*{ENCODED_INT: 45092}*/:
                return OooOooO();
            case C8010oOO000oO.Oooo /*{ENCODED_INT: 45093}*/:
                return OooO();
            case C8010oOO000oO.OoooO00 /*{ENCODED_INT: 45094}*/:
                return OooOOOo();
            case C8010oOO000oO.OoooO /*{ENCODED_INT: 45097}*/:
                return OooO0o();
            case C8010oOO000oO.OoooOOo /*{ENCODED_INT: 45120}*/:
                return OooOo00();
            case C8010oOO000oO.OoooOo0 /*{ENCODED_INT: 45121}*/:
                return OooOO0();
            case C8010oOO000oO.OoooOoo /*{ENCODED_INT: 45123}*/:
                return OooO0O0();
            case C8010oOO000oO.Ooooo00 /*{ENCODED_INT: 45124}*/:
                return OooO00o();
            case C8010oOO000oO.Ooooo0o /*{ENCODED_INT: 45127}*/:
                return OooOOo0();
            case C8010oOO000oO.OooooO0 /*{ENCODED_INT: 45128}*/:
                return OooOO0o();
            case C8010oOO000oO.OooooOO /*{ENCODED_INT: 45129}*/:
                return OooOo0O();
            case C8010oOO000oO.OooooOo /*{ENCODED_INT: 45130}*/:
                return OooOo();
            case C8010oOO000oO.Oooooo0 /*{ENCODED_INT: 45131}*/:
                return OooO0Oo();
            case C8010oOO000oO.Oooooo /*{ENCODED_INT: 45134}*/:
                return OooOOoo();
            default:
                return super.OooO0OO(i);
        }
    }

    @Nullable
    public String OooO0Oo() {
        Integer OooO00o = ((C8010oOO000oO) this.f20998OooO00o).m19639OooO00o(C8010oOO000oO.Oooooo0);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 0) {
            return "Off";
        }
        if (intValue == 1) {
            return "On (Continuous)";
        }
        if (intValue == 2) {
            return "On (Shooting)";
        }
        if (intValue == 65535) {
            return "N/A";
        }
        return String.format("Unknown (%d)", OooO00o);
    }

    @Nullable
    public String OooO0o() {
        Integer OooO00o = ((C8010oOO000oO) this.f20998OooO00o).m19639OooO00o(C8010oOO000oO.OoooO);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        switch (intValue) {
            case 0:
                return "Standard";
            case 1:
                return "Vivid";
            case 2:
                return "Portrait";
            case 3:
                return "Landscape";
            case 4:
                return "Sunset";
            case 5:
                return "Night Portrait";
            case 6:
                return "Black & White";
            case 7:
                return "Adobe RGB";
            default:
                switch (intValue) {
                    case 12:
                        return "Neutral";
                    case 13:
                        return "Clear";
                    case 14:
                        return "Deep";
                    case 15:
                        return "Light";
                    case 16:
                        return "Autumn";
                    case 17:
                        return "Sepia";
                    default:
                        switch (intValue) {
                            case 100:
                                return "Neutral";
                            case 101:
                                return "Clear";
                            case 102:
                                return "Deep";
                            case 103:
                                return "Light";
                            case 104:
                                return "Night View";
                            case 105:
                                return "Autumn Leaves";
                            default:
                                return String.format("Unknown (%d)", OooO00o);
                        }
                }
        }
    }

    @Nullable
    public String OooO0o0() {
        return OooO00o(C8010oOO000oO.OooOooo, "No", "Yes");
    }

    @Nullable
    public String OooO0oO() {
        Integer OooO00o = ((C8010oOO000oO) this.f20998OooO00o).m19639OooO00o(C8010oOO000oO.Oooo0o0);
        if (OooO00o == null) {
            return null;
        }
        if (OooO00o.intValue() == 0) {
            return "Auto";
        }
        return String.format("%d K", Integer.valueOf(((OooO00o.intValue() & -16777216) >> 24) | ((OooO00o.intValue() & C7265o0O000oo.OooOo0O) >> 8)));
    }

    @Nullable
    public String OooO0oo() {
        Integer OooO00o = ((C8010oOO000oO) this.f20998OooO00o).m19639OooO00o(C8010oOO000oO.OooOoo);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == -1) {
            return "N/A";
        }
        if (intValue == 0) {
            return "Off";
        }
        if (intValue == 2) {
            return "Auto";
        }
        return String.format("Unknown (%d)", OooO00o);
    }

    @Nullable
    public String OooOO0() {
        Integer OooO00o = ((C8010oOO000oO) this.f20998OooO00o).m19639OooO00o(C8010oOO000oO.OoooOo0);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 29) {
            return "Underwater";
        }
        if (intValue == 65535) {
            return "N/A";
        }
        switch (intValue) {
            case 0:
                return "Program";
            case 1:
                return "Portrait";
            case 2:
                return "Beach";
            case 3:
                return "Sports";
            case 4:
                return "Snow";
            case 5:
                return "Landscape";
            case 6:
                return "Auto";
            case 7:
                return "Aperture Priority";
            case 8:
                return "Shutter Priority";
            case 9:
                return "Night Scene / Twilight";
            case 10:
                return "Hi-Speed Shutter";
            case 11:
                return "Twilight Portrait";
            case 12:
                return "Soft Snap/Portrait";
            case 13:
                return "Fireworks";
            case 14:
                return "Smile Shutter";
            case 15:
                return "Manual";
            default:
                switch (intValue) {
                    case 18:
                        return "High Sensitivity";
                    case 19:
                        return "Macro";
                    case 20:
                        return "Advanced Sports Shooting";
                    default:
                        switch (intValue) {
                            case 33:
                                return "Food";
                            case 34:
                                return "Panorama";
                            case 35:
                                return "Handheld Night Shot";
                            case 36:
                                return "Anti Motion Blur";
                            case 37:
                                return "Pet";
                            case 38:
                                return "Backlight Correction HDR";
                            case 39:
                                return "Superior Auto";
                            case 40:
                                return "Background Defocus";
                            case 41:
                                return "Soft Skin";
                            case 42:
                                return "3D Image";
                            default:
                                return String.format("Unknown (%d)", OooO00o);
                        }
                }
        }
    }

    @Nullable
    public String OooOO0O() {
        return OooO0O0(260, "%d EV");
    }

    @Nullable
    public String OooOO0o() {
        Integer OooO00o = ((C8010oOO000oO) this.f20998OooO00o).m19639OooO00o(C8010oOO000oO.OooooO0);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == -32768) {
            return "Low";
        }
        if (intValue == 128) {
            return "n/a";
        }
        if (intValue == 32767) {
            return "High";
        }
        switch (intValue) {
            case -3:
                return "-3/3";
            case -2:
                return "-2/3";
            case -1:
                return "-1/3";
            case 0:
                return ReactProgressBarViewManager.DEFAULT_STYLE;
            case 1:
                return "+1/3";
            case 2:
                return "+2/3";
            case 3:
                return "+3/3";
            default:
                return "Unknown (" + OooO00o + C3848l.f10402t;
        }
    }

    @Nullable
    public String OooOOO() {
        Integer OooO00o = ((C8010oOO000oO) this.f20998OooO00o).m19639OooO00o(8201);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 0) {
            return "Off";
        }
        if (intValue == 1) {
            return "On";
        }
        if (intValue == 2) {
            return ReactProgressBarViewManager.DEFAULT_STYLE;
        }
        if (intValue == 3) {
            return "High";
        }
        if (intValue == 256) {
            return "Auto";
        }
        if (intValue == 65535) {
            return "N/A";
        }
        return String.format("Unknown (%d)", OooO00o);
    }

    @Nullable
    public String OooOOO0() {
        return OooO00o(C8010oOO000oO.Oooo000, "Manual", null, "AF-A", "AF-C", "AF-S", null, "DMF", "AF-D");
    }

    @Nullable
    public String OooOOOO() {
        return OooO00o(258, "RAW", "Super Fine", "Fine", "Standard", "Economy", "Extra Fine", "RAW + JPEG", "Compressed RAW", "Compressed RAW + JPEG");
    }

    @Nullable
    public String OooOOOo() {
        Integer OooO00o = ((C8010oOO000oO) this.f20998OooO00o).m19639OooO00o(C8010oOO000oO.OoooO00);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue != 0) {
            return intValue != 1 ? "N/A" : "On";
        }
        return "Off";
    }

    @Nullable
    public String OooOOo() {
        Integer OooO00o = ((C8010oOO000oO) this.f20998OooO00o).m19639OooO00o(8210);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == -1) {
            return "N/A";
        }
        if (intValue == 0) {
            return "Off";
        }
        if (intValue == 2) {
            return "Auto";
        }
        return String.format("Unknown (%d)", OooO00o);
    }

    @Nullable
    public String OooOOo0() {
        Integer OooO00o = ((C8010oOO000oO) this.f20998OooO00o).m19639OooO00o(C8010oOO000oO.Ooooo0o);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 0) {
            return ReactProgressBarViewManager.DEFAULT_STYLE;
        }
        if (intValue == 1) {
            return "Fine";
        }
        if (intValue == 2) {
            return "Extra Fine";
        }
        if (intValue == 65535) {
            return "N/A";
        }
        return String.format("Unknown (%d)", OooO00o);
    }

    @Nullable
    public String OooOOoo() {
        Integer OooO00o = ((C8010oOO000oO) this.f20998OooO00o).m19639OooO00o(C8010oOO000oO.Oooooo);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 0) {
            return "Off";
        }
        if (intValue == 1) {
            return "On";
        }
        if (intValue == 65535) {
            return "N/A";
        }
        return String.format("Unknown (%d)", OooO00o);
    }

    @Nullable
    public String OooOo() {
        Integer OooO00o = ((C8010oOO000oO) this.f20998OooO00o).m19639OooO00o(C8010oOO000oO.OooooOO);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue != 0) {
            return intValue != 65535 ? OooO00o.toString() : "n/a";
        }
        return "Single";
    }

    @Nullable
    public String OooOo0() {
        Integer OooO00o = ((C8010oOO000oO) this.f20998OooO00o).m19639OooO00o(C8010oOO000oO.OooOoO0);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 13) {
            return "High Contrast Monochrome";
        }
        if (intValue == 80) {
            return "Rich-tone Monochrome";
        }
        if (intValue == 97) {
            return "Water Color";
        }
        if (intValue == 98) {
            return "Water Color 2";
        }
        switch (intValue) {
            case 0:
                return "Off";
            case 1:
                return "Toy Camera";
            case 2:
                return "Pop Color";
            case 3:
                return "Posterization";
            case 4:
                return "Posterization B/W";
            case 5:
                return "Retro Photo";
            case 6:
                return "Soft High Key";
            case 7:
                return "Partial Color (red)";
            case 8:
                return "Partial Color (green)";
            case 9:
                return "Partial Color (blue)";
            case 10:
                return "Partial Color (yellow)";
            default:
                switch (intValue) {
                    case 16:
                        return "Toy Camera (normal)";
                    case 17:
                        return "Toy Camera (cool)";
                    case 18:
                        return "Toy Camera (warm)";
                    case 19:
                        return "Toy Camera (green)";
                    case 20:
                        return "Toy Camera (magenta)";
                    default:
                        switch (intValue) {
                            case 32:
                                return "Soft Focus (low)";
                            case 33:
                                return "Soft Focus";
                            case 34:
                                return "Soft Focus (high)";
                            default:
                                switch (intValue) {
                                    case 48:
                                        return "Miniature (auto)";
                                    case 49:
                                        return "Miniature (top)";
                                    case 50:
                                        return "Miniature (middle horizontal)";
                                    case 51:
                                        return "Miniature (bottom)";
                                    case 52:
                                        return "Miniature (left)";
                                    case 53:
                                        return "Miniature (middle vertical)";
                                    case 54:
                                        return "Miniature (right)";
                                    default:
                                        switch (intValue) {
                                            case 64:
                                                return "HDR Painting (low)";
                                            case 65:
                                                return "HDR Painting";
                                            case 66:
                                                return "HDR Painting (high)";
                                            default:
                                                switch (intValue) {
                                                    case 112:
                                                        return "Illustration (low)";
                                                    case 113:
                                                        return "Illustration";
                                                    case 114:
                                                        return "Illustration (high)";
                                                    default:
                                                        return String.format("Unknown (%d)", OooO00o);
                                                }
                                        }
                                }
                        }
                }
        }
    }

    @Nullable
    public String OooOo00() {
        Integer OooO00o = ((C8010oOO000oO) this.f20998OooO00o).m19639OooO00o(C8010oOO000oO.OoooOOo);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 0) {
            return "Off";
        }
        if (intValue == 1) {
            return "On";
        }
        if (intValue == 2) {
            return "Magnifying Glass/Super Macro";
        }
        if (intValue == 65535) {
            return "N/A";
        }
        return String.format("Unknown (%d)", OooO00o);
    }

    @Nullable
    public String OooOo0O() {
        Integer OooO00o = ((C8010oOO000oO) this.f20998OooO00o).m19639OooO00o(C8010oOO000oO.OooooOO);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 0) {
            return ReactProgressBarViewManager.DEFAULT_STYLE;
        }
        if (intValue == 2) {
            return "Continuous";
        }
        if (intValue == 65535) {
            return "n/a";
        }
        if (intValue == 5) {
            return "Exposure Bracketing";
        }
        if (intValue == 6) {
            return "White Balance Bracketing";
        }
        return "Unknown (" + OooO00o + C3848l.f10402t;
    }

    @Nullable
    public String OooOo0o() {
        Integer OooO00o = ((C8010oOO000oO) this.f20998OooO00o).m19639OooO00o(C8010oOO000oO.Oooo0oO);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        switch (intValue) {
            case 0:
                return "Standard";
            case 1:
                return "Portrait";
            case 2:
                return "Text";
            case 3:
                return "Night Scene";
            case 4:
                return "Sunset";
            case 5:
                return "Sports";
            case 6:
                return "Landscape";
            case 7:
                return "Night Portrait";
            case 8:
                return "Macro";
            case 9:
                return "Super Macro";
            default:
                switch (intValue) {
                    case 16:
                        return "Auto";
                    case 17:
                        return "Night View/Portrait";
                    case 18:
                        return "Sweep Panorama";
                    case 19:
                        return "Handheld Night Shot";
                    case 20:
                        return "Anti Motion Blur";
                    case 21:
                        return "Cont. Priority AE";
                    case 22:
                        return "Auto+";
                    case 23:
                        return "3D Sweep Panorama";
                    case 24:
                        return "Superior Auto";
                    case 25:
                        return "High Sensitivity";
                    case 26:
                        return "Fireworks";
                    case 27:
                        return "Food";
                    case 28:
                        return "Pet";
                    default:
                        return "Unknown (" + OooO00o + C3848l.f10402t;
                }
        }
    }

    @Nullable
    public String OooOoO() {
        Integer OooO00o = ((C8010oOO000oO) this.f20998OooO00o).m19639OooO00o(C8010oOO000oO.Oooo0O0);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 2) {
            return "DSC-R1";
        }
        if (intValue == 269) {
            return "DSLR-A850";
        }
        if (intValue == 270) {
            return "DSLR-A850 (APS-C mode)";
        }
        switch (intValue) {
            case 256:
                return "DSLR-A100";
            case 257:
                return "DSLR-A900";
            case 258:
                return "DSLR-A700";
            case 259:
                return "DSLR-A200";
            case 260:
                return "DSLR-A350";
            case 261:
                return "DSLR-A300";
            case 262:
                return "DSLR-A900 (APS-C mode)";
            case 263:
                return "DSLR-A380/A390";
            case 264:
                return "DSLR-A330";
            case 265:
                return "DSLR-A230";
            case 266:
                return "DSLR-A290";
            default:
                switch (intValue) {
                    case 273:
                        return "DSLR-A550";
                    case 274:
                        return "DSLR-A500";
                    case 275:
                        return "DSLR-A450";
                    default:
                        switch (intValue) {
                            case 278:
                                return "NEX-5";
                            case 279:
                                return "NEX-3";
                            case 280:
                                return "SLT-A33";
                            case 281:
                                return "SLT-A55V";
                            case 282:
                                return "DSLR-A560";
                            case 283:
                                return "DSLR-A580";
                            case 284:
                                return "NEX-C3";
                            case 285:
                                return "SLT-A35";
                            case 286:
                                return "SLT-A65V";
                            case C7995oO0ooO0o.OooOooo:
                                return "SLT-A77V";
                            case 288:
                                return "NEX-5N";
                            case 289:
                                return "NEX-7";
                            case C8303oOo00oo0.OooO0o /*{ENCODED_INT: 290}*/:
                                return "NEX-VG20E";
                            case 291:
                                return "SLT-A37";
                            case C8303oOo00oo0.OooO0oo /*{ENCODED_INT: 292}*/:
                                return "SLT-A57";
                            case 293:
                                return "NEX-F3";
                            case 294:
                                return "SLT-A99V";
                            case 295:
                                return "NEX-6";
                            case 296:
                                return "NEX-5R";
                            case oO0oO000.OooOoo0:
                                return "DSC-RX100";
                            case 298:
                                return "DSC-RX1";
                            default:
                                return "Unknown (" + OooO00o + C3848l.f10402t;
                        }
                }
        }
    }

    @Nullable
    public String OooOoO0() {
        return OooO00o(C8010oOO000oO.OooOoO, "Off", "Low", "Mid", "High");
    }

    @Nullable
    public String OooOoOO() {
        Integer OooO00o = ((C8010oOO000oO) this.f20998OooO00o).m19639OooO00o(261);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 0) {
            return "None";
        }
        if (intValue == 72) {
            return "Minolta/Sony AF 2x APO (D)";
        }
        if (intValue == 80) {
            return "Minolta AF 2x APO II";
        }
        if (intValue == 96) {
            return "Minolta AF 2x APO";
        }
        if (intValue == 136) {
            return "Minolta/Sony AF 1.4x APO (D)";
        }
        if (intValue == 144) {
            return "Minolta AF 1.4x APO II";
        }
        if (intValue == 160) {
            return "Minolta AF 1.4x APO";
        }
        return "Unknown (" + OooO00o + C3848l.f10402t;
    }

    @Nullable
    public String OooOoo() {
        Integer OooO00o = ((C8010oOO000oO) this.f20998OooO00o).m19639OooO00o(277);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 0) {
            return "Auto";
        }
        if (intValue == 1) {
            return "Color Temperature/Color Filter";
        }
        if (intValue == 16) {
            return "Daylight";
        }
        if (intValue == 32) {
            return "Cloudy";
        }
        if (intValue == 48) {
            return "Shade";
        }
        if (intValue == 64) {
            return "Tungsten";
        }
        if (intValue == 80) {
            return ExifInterface.f14327oo000o;
        }
        if (intValue == 96) {
            return "Fluorescent";
        }
        if (intValue == 112) {
            return "Custom";
        }
        return "Unknown (" + OooO00o + C3848l.f10402t;
    }

    @Nullable
    public String OooOoo0() {
        Integer OooO00o = ((C8010oOO000oO) this.f20998OooO00o).m19639OooO00o(8209);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == -1) {
            return "N/A";
        }
        if (intValue == 0) {
            return "Off";
        }
        if (intValue == 2) {
            return "Auto";
        }
        return String.format("Unknown (%d)", OooO00o);
    }

    @Nullable
    public String OooOooO() {
        return OooO00o(C8010oOO000oO.Oooo0oo, "ISO Setting Used", "High Key", "Low Key");
    }

    @Nullable
    public String OooO0OO() {
        return OooO00o(C8010oOO000oO.Oooo00O, "Auto", "Center", "Top", "Upper-right", "Right", "Lower-right", "Bottom", "Lower-left", "Left", "Upper-left\t  \t", "Far Right", "Far Left", "Upper-middle", "Near Right", "Lower-middle", "Near Left", "Upper Far Right", "Lower Far Right", "Lower Far Left", "Upper Far Left");
    }
}
