package com.p118pd.sdk;

import android.text.TextUtils;

/* renamed from: com.pd.sdk.ooO000O  reason: case insensitive filesystem */
public class C8797ooO000O {
    public static C8799ooO000OO OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static C8818ooO00ooO f22007OooO00o;
    public static C8818ooO00ooO OooO0O0;
    public static C8818ooO00ooO OooO0OO;
    public static C8818ooO00ooO OooO0Oo;
    public static C8818ooO00ooO OooO0o;
    public static C8818ooO00ooO OooO0o0;

    public static void OooO00o(C8799ooO000OO ooo000oo) {
        OooO00o = ooo000oo;
        if (ooo000oo == null) {
            C8783oo0oooOO.OooOOOO("mix push init config = null");
            return;
        }
        if (!OooO00o(ooo000oo.OooO00o, ooo000oo.OooO0O0, ooo000oo.OooO0OO)) {
            C8783oo0oooOO.OooOOOO("mixpush init xm register");
            C8799ooO000OO ooo000oo2 = OooO00o;
            f22007OooO00o = new C8818ooO00ooO(5, ooo000oo2.OooO00o, ooo000oo2.OooO0O0, ooo000oo2.OooO0OO);
        }
        C8799ooO000OO ooo000oo3 = OooO00o;
        if (!OooO00o(ooo000oo3.OooO0o0, ooo000oo3.OooO0o, ooo000oo3.OooO0oO)) {
            C8783oo0oooOO.OooOOOO("mixpush init mz register");
            C8799ooO000OO ooo000oo4 = OooO00o;
            OooO0OO = new C8818ooO00ooO(7, ooo000oo4.OooO0o0, ooo000oo4.OooO0o, ooo000oo4.OooO0oO);
        }
        if (!TextUtils.isEmpty(OooO00o.OooO0Oo)) {
            C8783oo0oooOO.OooOOOO("mixpush init hw register");
            OooO0O0 = new C8818ooO00ooO(6, OooO00o.OooO0Oo);
        }
        if (!TextUtils.isEmpty(OooO00o.OooO0oo)) {
            C8783oo0oooOO.OooOOOO("mixpush init fcm register");
            OooO0Oo = new C8818ooO00ooO(8, OooO00o.OooO0oo);
        }
        if (!TextUtils.isEmpty(OooO00o.OooO)) {
            C8783oo0oooOO.OooOOOO("mixpush init vivo register");
            OooO0o0 = new C8818ooO00ooO(9, OooO00o.OooO);
        }
        C8799ooO000OO ooo000oo5 = OooO00o;
        if (!OooO00o(ooo000oo5.OooOO0, ooo000oo5.OooOO0O, ooo000oo5.OooOO0o, ooo000oo5.OooOOO0)) {
            C8783oo0oooOO.OooOOOO("mixpush init oppo register");
            C8799ooO000OO ooo000oo6 = OooO00o;
            OooO0o = new C8818ooO00ooO(10, ooo000oo6.OooOO0, ooo000oo6.OooOO0O, ooo000oo6.OooOO0o, ooo000oo6.OooOOO0);
        }
    }

    public static boolean OooO00o(String... strArr) {
        if (strArr == null) {
            return true;
        }
        for (String str : strArr) {
            if (TextUtils.isEmpty(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean OooO00o() {
        return OooO0Oo != null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20439OooO00o(int i) {
        return OooO00o(i) != null;
    }

    public static C8818ooO00ooO OooO00o(int i) {
        switch (i) {
            case 5:
                return f22007OooO00o;
            case 6:
                return OooO0O0;
            case 7:
                return OooO0OO;
            case 8:
                return OooO0Oo;
            case 9:
                return OooO0o0;
            case 10:
                return OooO0o;
            default:
                return null;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m20438OooO00o(int i) {
        C8818ooO00ooO ooo00ooo;
        switch (i) {
            case 5:
                ooo00ooo = f22007OooO00o;
                break;
            case 6:
                ooo00ooo = OooO0O0;
                break;
            case 7:
                ooo00ooo = OooO0OO;
                break;
            case 8:
                ooo00ooo = OooO0Oo;
                break;
            case 9:
                ooo00ooo = OooO0o0;
                break;
            case 10:
                ooo00ooo = OooO0o;
                break;
            default:
                return null;
        }
        if (ooo00ooo == null) {
            return null;
        }
        return ooo00ooo.OooO0Oo;
    }
}
