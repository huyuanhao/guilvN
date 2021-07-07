package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.umeng.message.UmengMessageHandler;
import com.umeng.message.proguard.C3848l;

/* renamed from: com.pd.sdk.oOOOO00  reason: case insensitive filesystem */
public class C8115oOOOO00 extends C7929oO0o0OoO<C8161oOOOoo00> {
    public C8115oOOOO00(@NotNull C8161oOOOoo00 oooooo00) {
        super(oooooo00);
    }

    private String OooO00o() {
        Integer OooO00o = ((C8161oOOOoo00) this.f20998OooO00o).m19639OooO00o(113);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == -1) {
            Integer OooO00o2 = ((C8161oOOOoo00) this.f20998OooO00o).m19639OooO00o(109);
            if (OooO00o2 != null && OooO00o2.intValue() < 16) {
                return UmengMessageHandler.DEFAULT_NOTIFICATION_CHANNEL_NAME;
            }
            return "None";
        } else if (intValue == 0) {
            return "Color table within file";
        } else {
            return "Unknown (" + OooO00o + C3848l.f10402t;
        }
    }

    private String OooO0O0() {
        Integer OooO00o = ((C8161oOOOoo00) this.f20998OooO00o).m19639OooO00o(109);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 34 || intValue == 36 || intValue == 40) {
            StringBuilder sb = new StringBuilder();
            sb.append(OooO00o.intValue() - 32);
            sb.append("-bit grayscale");
            return sb.toString();
        }
        return "Unknown (" + OooO00o + C3848l.f10402t;
    }

    private String OooOO0(int i) {
        String OooO0O0 = ((C8161oOOOoo00) this.f20998OooO00o).OooO0O0(i);
        if (OooO0O0 == null) {
            return null;
        }
        return OooO0O0 + " pixels";
    }

    @Override // com.p118pd.sdk.C7929oO0o0OoO
    public String OooO0OO(int i) {
        if (i == 104 || i == 105) {
            return OooOO0(i);
        }
        if (i == 109) {
            return OooO0O0();
        }
        if (i == 111) {
            return OooO0OO();
        }
        if (i != 113) {
            return super.OooO0OO(i);
        }
        return OooO00o();
    }

    private String OooO0OO() {
        Integer OooO00o = ((C8161oOOOoo00) this.f20998OooO00o).m19639OooO00o(111);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == 0) {
            return "Copy";
        }
        if (intValue == 32) {
            return "Blend";
        }
        if (intValue == 36) {
            return "Transparent";
        }
        if (intValue == 64) {
            return "Dither copy";
        }
        switch (intValue) {
            case 256:
                return "Straight alpha";
            case 257:
                return "Premul white alpha";
            case 258:
                return "Premul black alpha";
            case 259:
                return "Composition (dither copy)";
            case 260:
                return "Straight alpha blend";
            default:
                return "Unknown (" + OooO00o + C3848l.f10402t;
        }
    }
}
