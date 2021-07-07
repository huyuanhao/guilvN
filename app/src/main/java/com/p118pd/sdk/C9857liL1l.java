package com.p118pd.sdk;

import java.util.Enumeration;
import java.util.Vector;

/* renamed from: com.pd.sdk.丨丨liL1l  reason: invalid class name and case insensitive filesystem */
public class C9857liL1l {
    public static LlLI1 OooO00o(String str) {
        LlLI1 OooO00o = C6602lLl1I.OooO00o(str);
        if (OooO00o == null) {
            OooO00o = C6659liLi.OooO00o(str);
        }
        if (OooO00o == null) {
            OooO00o = C93191LI.OooO00o(str);
        }
        if (OooO00o == null) {
            OooO00o = C5321ILl.OooO00o(str);
        }
        if (OooO00o == null) {
            OooO00o = IL11L.OooO00o(str);
        }
        if (OooO00o == null) {
            OooO00o = C6723lilIL.m17819OooO00o(str);
        }
        return OooO00o == null ? IllIli1.OooO00o(str) : OooO00o;
    }

    public static C9387Iill OooO00o(C5600L1iLL r7) {
        if (r7 == null) {
            return null;
        }
        return new C9387Iill(r7.OooO00o(), r7.m16003OooO00o(), r7.OooO0OO(), r7.m16004OooO00o(), r7.m16005OooO00o());
    }

    public static C9387Iill OooO00o(LlLI1 llLI1) {
        C9387Iill OooO00o = C6602lLl1I.OooO00o(llLI1);
        if (OooO00o == null) {
            OooO00o = C6659liLi.OooO00o(llLI1);
        }
        if (OooO00o == null) {
            OooO00o = C5321ILl.OooO00o(llLI1);
        }
        if (OooO00o == null) {
            OooO00o = IL11L.OooO00o(llLI1);
        }
        if (OooO00o == null) {
            OooO00o = OooO00o(C6723lilIL.OooO00o(llLI1));
        }
        return OooO00o == null ? IllIli1.OooO00o(llLI1) : OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static C9387Iill m21940OooO00o(String str) {
        C9387Iill OooO00o = C6602lLl1I.m17701OooO00o(str);
        if (OooO00o == null) {
            OooO00o = C6659liLi.m17753OooO00o(str);
        }
        if (OooO00o == null) {
            OooO00o = C93191LI.m21352OooO00o(str);
        }
        if (OooO00o == null) {
            OooO00o = C5321ILl.m15526OooO00o(str);
        }
        if (OooO00o == null) {
            OooO00o = IL11L.m15467OooO00o(str);
        }
        if (OooO00o == null) {
            OooO00o = OooO00o(C6723lilIL.OooO00o(str));
        }
        return OooO00o == null ? IllIli1.m15709OooO00o(str) : OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m21941OooO00o(LlLI1 llLI1) {
        String OooO00o = C6602lLl1I.m17702OooO00o(llLI1);
        if (OooO00o == null) {
            OooO00o = C6659liLi.m17754OooO00o(llLI1);
        }
        if (OooO00o == null) {
            OooO00o = C93191LI.m21353OooO00o(llLI1);
        }
        if (OooO00o == null) {
            OooO00o = C5321ILl.m15527OooO00o(llLI1);
        }
        if (OooO00o == null) {
            OooO00o = IL11L.m15468OooO00o(llLI1);
        }
        if (OooO00o == null) {
            OooO00o = C6723lilIL.m17820OooO00o(llLI1);
        }
        return OooO00o == null ? IllIli1.m15710OooO00o(llLI1) : OooO00o;
    }

    public static Enumeration OooO00o() {
        Vector vector = new Vector();
        OooO00o(vector, C6602lLl1I.OooO00o());
        OooO00o(vector, C6659liLi.OooO00o());
        OooO00o(vector, C93191LI.OooO00o());
        OooO00o(vector, C5321ILl.OooO00o());
        OooO00o(vector, IL11L.OooO00o());
        OooO00o(vector, C6723lilIL.OooO00o());
        OooO00o(vector, IllIli1.OooO00o());
        return vector.elements();
    }

    public static void OooO00o(Vector vector, Enumeration enumeration) {
        while (enumeration.hasMoreElements()) {
            vector.addElement(enumeration.nextElement());
        }
    }
}
