package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.umeng.message.UmengMessageHandler;
import com.umeng.message.proguard.C3848l;

/* renamed from: com.pd.sdk.oOO0ooOO  reason: case insensitive filesystem */
public class C8079oOO0ooOO extends C8038oOO0OO {
    public C8079oOO0ooOO(@NotNull C8080oOO0ooOo ooo0oooo) {
        super(ooo0oooo);
    }

    private String OooO0Oo() {
        Integer OooO00o = ((oOO0OOOO) this.f20998OooO00o).m19639OooO00o(11);
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

    private String OooOO0(int i) {
        Integer OooO00o = ((oOO0OOOO) this.f20998OooO00o).m19639OooO00o(i);
        if (OooO00o == null) {
            return null;
        }
        int intValue = OooO00o.intValue();
        if (intValue == -1) {
            return ((oOO0OOOO) this.f20998OooO00o).m19639OooO00o(9).intValue() < 16 ? UmengMessageHandler.DEFAULT_NOTIFICATION_CHANNEL_NAME : "None";
        }
        if (intValue == 0) {
            return "Color table within file";
        }
        return "Unknown (" + OooO00o + C3848l.f10402t;
    }

    private String OooOO0O(int i) {
        Integer OooO00o = ((oOO0OOOO) this.f20998OooO00o).m19639OooO00o(i);
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

    private String OooOO0o(int i) {
        String OooO0O0 = ((oOO0OOOO) this.f20998OooO00o).OooO0O0(i);
        if (OooO0O0 == null) {
            return null;
        }
        return OooO0O0 + " pixels";
    }

    @Override // com.p118pd.sdk.C8038oOO0OO, com.p118pd.sdk.C7929oO0o0OoO
    public String OooO0OO(int i) {
        if (i == 4 || i == 5) {
            return OooOO0o(i);
        }
        if (i == 9) {
            return OooOO0O(i);
        }
        if (i == 11) {
            return OooO0Oo();
        }
        if (i != 13) {
            return super.OooO0OO(i);
        }
        return OooOO0(i);
    }
}
