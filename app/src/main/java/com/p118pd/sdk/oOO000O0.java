package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.umeng.message.proguard.C3848l;

/* renamed from: com.pd.sdk.oOO000O0 */
public class oOO000O0 extends C7929oO0o0OoO<oOO000OO> {
    public oOO000O0(@NotNull oOO000OO ooo000oo) {
        super(ooo000oo);
    }

    @Nullable
    private String OooO() {
        return OooO00o(537, "Off", "On");
    }

    @Nullable
    private String OooO0O0() {
        return OooO00o(528, "Off", "On");
    }

    @Nullable
    private String OooO0Oo() {
        return OooO00o(539, "Off", "On");
    }

    @Nullable
    private String OooO0o() {
        return OooO00o(oOO000OO.OooOOo0, "Off", "On");
    }

    @Nullable
    private String OooO0o0() {
        return OooO00o(549, "Auto", "Force", "Disabled", "Red eye");
    }

    @Nullable
    private String OooO0oO() {
        return OooO00o(oOO000OO.OooOo00, "Off", "On");
    }

    @Nullable
    private String OooO0oo() {
        return OooO00o(514, ReactProgressBarViewManager.DEFAULT_STYLE, "Macro", "View", "Manual");
    }

    @Nullable
    private String OooOO0() {
        return OooO00o(531, "Off", "On");
    }

    @Nullable
    private String OooOO0O() {
        return OooO00o(oOO000OO.OooOOOo, "Record while down", "Press start, press stop");
    }

    @Nullable
    private String OooOO0o() {
        return OooO00o(542, "No", "Yes");
    }

    @Nullable
    private String OooOOO() {
        return OooO00o(532, "Off", "On");
    }

    @Nullable
    private String OooOOO0() {
        return OooO00o(oOO000OO.OooOo0O, "Off", "Sport", "TV", "Night", "User 1", "User 2", "Lamp");
    }

    @Nullable
    private String OooOOOO() {
        return OooO00o(oOO000OO.OooOo, "5 frames/sec", "10 frames/sec", "15 frames/sec", "20 frames/sec");
    }

    @Nullable
    private String OooOOOo() {
        return OooO00o(oOO000OO.OooOO0, "None", "Standard", "Best", "Adjust Exposure");
    }

    @Nullable
    private String OooOOo() {
        return OooO00o(527, "Off", "On");
    }

    @Nullable
    private String OooOOo0() {
        return OooO00o(534, "Off", "On");
    }

    @Nullable
    public String OooO00o() {
        Integer OooO00o = ((oOO000OO) this.f20998OooO00o).m19639OooO00o(513);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        switch (intValue) {
            case 0:
                return "Normal/Very Low";
            case 1:
                return "Normal/Low";
            case 2:
                return "Normal/Medium Low";
            case 3:
                return "Normal/Medium";
            case 4:
                return "Normal/Medium High";
            case 5:
                return "Normal/High";
            case 6:
                return "Normal/Very High";
            case 7:
                return "Normal/Super High";
            default:
                switch (intValue) {
                    case 256:
                        return "Fine/Very Low";
                    case 257:
                        return "Fine/Low";
                    case 258:
                        return "Fine/Medium Low";
                    case 259:
                        return "Fine/Medium";
                    case 260:
                        return "Fine/Medium High";
                    case 261:
                        return "Fine/High";
                    case 262:
                        return "Fine/Very High";
                    case 263:
                        return "Fine/Super High";
                    default:
                        switch (intValue) {
                            case 512:
                                return "Super Fine/Very Low";
                            case 513:
                                return "Super Fine/Low";
                            case 514:
                                return "Super Fine/Medium Low";
                            case 515:
                                return "Super Fine/Medium";
                            case 516:
                                return "Super Fine/Medium High";
                            case 517:
                                return "Super Fine/High";
                            case 518:
                                return "Super Fine/Very High";
                            case 519:
                                return "Super Fine/Super High";
                            default:
                                return "Unknown (" + OooO00o + C3848l.f10402t;
                        }
                }
        }
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    @Nullable
    public String OooO0OO(int i) {
        if (i == 513) {
            return OooO00o();
        }
        if (i == 514) {
            return OooO0oo();
        }
        if (i == 516) {
            return OooO0OO();
        }
        if (i == 539) {
            return OooO0Oo();
        }
        if (i == 531) {
            return OooOO0();
        }
        if (i == 532) {
            return OooOOO();
        }
        if (i == 548) {
            return OooOOOO();
        }
        if (i == 549) {
            return OooO0o0();
        }
        switch (i) {
            case oOO000OO.OooOO0 /*{ENCODED_INT: 526}*/:
                return OooOOOo();
            case 527:
                return OooOOo();
            case 528:
                return OooO0O0();
            default:
                switch (i) {
                    case 534:
                        return OooOOo0();
                    case oOO000OO.OooOOOo /*{ENCODED_INT: 535}*/:
                        return OooOO0O();
                    case oOO000OO.OooOOo0 /*{ENCODED_INT: 536}*/:
                        return OooO0o();
                    case 537:
                        return OooO();
                    default:
                        switch (i) {
                            case oOO000OO.OooOo00 /*{ENCODED_INT: 541}*/:
                                return OooO0oO();
                            case 542:
                                return OooOO0o();
                            case oOO000OO.OooOo0O /*{ENCODED_INT: 543}*/:
                                return OooOOO0();
                            default:
                                return super.OooO0OO(i);
                        }
                }
        }
    }

    @Nullable
    private String OooO0OO() {
        return OooO00o(516, 3);
    }
}
