package com.p118pd.sdk;

import androidx.exifinterface.media.ExifInterface;
import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.umeng.message.proguard.C3848l;
import org.android.agoo.message.MessageService;

/* renamed from: com.pd.sdk.oO0oOo  reason: case insensitive filesystem */
public class C7965oO0oOo extends C7929oO0o0OoO<C7972oO0oOoO0> {
    public C7965oO0oOo(@NotNull C7972oO0oOoO0 oo0oooo0) {
        super(oo0oooo0);
    }

    @Nullable
    public String OooO() {
        return OooO00o(13, ReactProgressBarViewManager.DEFAULT_STYLE, "Macro");
    }

    @Nullable
    public String OooO00o() {
        byte[] OooO00o = ((C7972oO0oOoO0) this.f20998OooO00o).m19651OooO00o(8192);
        if (OooO00o == null) {
            return null;
        }
        return "<" + OooO00o.length + " bytes of image data>";
    }

    @Nullable
    public String OooO0O0() {
        return OooO00o(12308, "Off", "On");
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    @Nullable
    public String OooO0OO(int i) {
        if (i == 2) {
            return OooOo00();
        }
        if (i == 3) {
            return OooOo0O();
        }
        if (i == 4) {
            return OooOo0();
        }
        if (i == 8) {
            return OooOOOO();
        }
        if (i == 9) {
            return OooOO0O();
        }
        if (i == 13) {
            return OooO();
        }
        if (i == 20) {
            return OooOO0o();
        }
        if (i == 25) {
            return OooOo();
        }
        if (i == 29) {
            return OooO0oo();
        }
        if (i == 8192) {
            return OooO00o();
        }
        if (i == 8226) {
            return OooOOO0();
        }
        if (i == 8244) {
            return OooO0oO();
        }
        if (i == 12294) {
            return OooOo0o();
        }
        if (i == 8209) {
            return OooOoO();
        }
        if (i == 8210) {
            return OooOoO0();
        }
        switch (i) {
            case 31:
                return OooOOo0();
            case 32:
                return OooO0Oo();
            case 33:
                return OooOOoo();
            default:
                switch (i) {
                    case 12288:
                        return OooOOOo();
                    case 12289:
                        return OooOOo();
                    case 12290:
                        return OooOOO();
                    case 12291:
                        return OooOO0();
                    default:
                        switch (i) {
                            case 12308:
                                return OooO0O0();
                            case 12309:
                                return OooO0OO();
                            case 12310:
                                return OooO0o0();
                            case 12311:
                                return OooO0o();
                            default:
                                return super.OooO0OO(i);
                        }
                }
        }
    }

    @Nullable
    public String OooO0Oo() {
        return OooO00o(32, "-1", ReactProgressBarViewManager.DEFAULT_STYLE, "+1");
    }

    @Nullable
    public String OooO0o() {
        return OooO00o(12311, "Off");
    }

    @Nullable
    public String OooO0o0() {
        return OooO00o(12310, "Off");
    }

    @Nullable
    public String OooO0oO() {
        return OooO00o(C7972oO0oOoO0.OooOOo, "Off");
    }

    @Nullable
    public String OooO0oo() {
        Double OooO00o = ((C7972oO0oOoO0) this.f20998OooO00o).m19637OooO00o(29);
        if (OooO00o == null) {
            return null;
        }
        return C7929oO0o0OoO.OooO0O0(OooO00o.doubleValue() / 10.0d);
    }

    @Nullable
    public String OooOO0() {
        Integer OooO00o = ((C7972oO0oOoO0) this.f20998OooO00o).m19639OooO00o(12291);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 1) {
            return "Fixation";
        }
        if (intValue == 6) {
            return "Multi-Area Focus";
        }
        return "Unknown (" + OooO00o + C3848l.f10402t;
    }

    @Nullable
    public String OooOO0O() {
        Integer OooO00o = ((C7972oO0oOoO0) this.f20998OooO00o).m19639OooO00o(9);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 0) {
            return "640 x 480 pixels";
        }
        if (intValue == 36) {
            return "3008 x 2008 pixels";
        }
        if (intValue == 4) {
            return "1600 x 1200 pixels";
        }
        if (intValue == 5) {
            return "2048 x 1536 pixels";
        }
        switch (intValue) {
            case 20:
                return "2288 x 1712 pixels";
            case 21:
                return "2592 x 1944 pixels";
            case 22:
                return "2304 x 1728 pixels";
            default:
                return "Unknown (" + OooO00o + C3848l.f10402t;
        }
    }

    @Nullable
    public String OooOO0o() {
        Integer OooO00o = ((C7972oO0oOoO0) this.f20998OooO00o).m19639OooO00o(20);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 3) {
            return "50";
        }
        if (intValue == 4) {
            return "64";
        }
        if (intValue == 6) {
            return MessageService.MSG_DB_COMPLETE;
        }
        if (intValue == 9) {
            return "200";
        }
        return "Unknown (" + OooO00o + C3848l.f10402t;
    }

    @Nullable
    public String OooOOO() {
        return OooO00o(12290, 3, "Fine");
    }

    @Nullable
    public String OooOOO0() {
        Integer OooO00o = ((C7972oO0oOoO0) this.f20998OooO00o).m19639OooO00o(8226);
        if (OooO00o == null) {
            return null;
        }
        return Integer.toString(OooO00o.intValue()) + " mm";
    }

    @Nullable
    public String OooOOOO() {
        return OooO00o(8, 1, "Fine", "Super Fine");
    }

    @Nullable
    public String OooOOOo() {
        return OooO00o(12288, 2, ReactProgressBarViewManager.DEFAULT_STYLE);
    }

    @Nullable
    public String OooOOo() {
        return OooO00o(12289, 1, "Off");
    }

    @Nullable
    public String OooOOo0() {
        return OooO00o(31, "-1", ReactProgressBarViewManager.DEFAULT_STYLE, "+1");
    }

    @Nullable
    public String OooOOoo() {
        return OooO00o(33, "-1", ReactProgressBarViewManager.DEFAULT_STYLE, "+1");
    }

    @Nullable
    public String OooOo() {
        return OooO00o(25, "Auto", "Daylight", "Shade", "Tungsten", "Florescent", "Manual");
    }

    @Nullable
    public String OooOo0() {
        return ((C7972oO0oOoO0) this.f20998OooO00o).OooO0O0(4);
    }

    @Nullable
    public String OooOo00() {
        int[] OooO00o = ((C7972oO0oOoO0) this.f20998OooO00o).m19652OooO00o(2);
        if (OooO00o == null || OooO00o.length != 2) {
            return ((C7972oO0oOoO0) this.f20998OooO00o).OooO0O0(2);
        }
        return OooO00o[0] + " x " + OooO00o[1] + " pixels";
    }

    @Nullable
    public String OooOo0O() {
        Integer OooO00o = ((C7972oO0oOoO0) this.f20998OooO00o).m19639OooO00o(3);
        if (OooO00o == null) {
            return null;
        }
        return Integer.toString(OooO00o.intValue()) + " bytes";
    }

    @Nullable
    public String OooOo0o() {
        return ((C7972oO0oOoO0) this.f20998OooO00o).OooO0O0(12294);
    }

    @Nullable
    public String OooOoO() {
        return ((C7972oO0oOoO0) this.f20998OooO00o).OooO0O0(8209);
    }

    @Nullable
    public String OooOoO0() {
        Integer OooO00o = ((C7972oO0oOoO0) this.f20998OooO00o).m19639OooO00o(8210);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 0) {
            return "Manual";
        }
        if (intValue == 1) {
            return "Auto";
        }
        if (intValue == 4 || intValue == 12) {
            return ExifInterface.f14327oo000o;
        }
        return "Unknown (" + OooO00o + C3848l.f10402t;
    }

    @Nullable
    public String OooO0OO() {
        return OooO00o(12309, "Off");
    }
}
