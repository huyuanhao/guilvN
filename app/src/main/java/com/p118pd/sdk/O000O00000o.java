package com.p118pd.sdk;

import com.umeng.commonsdk.proguard.C3587az;

/* renamed from: com.pd.sdk.O000O00000o */
public class O000O00000o implements AbstractC8893ooOO00O0 {
    public static String TAG = o0OOOOO.OooO00o(new byte[]{94, 81, 77, 11, 64, 7, 111, 86, 75, 13, 91, 61, 90, 81, 79, 3}, "009b6b");
    public static String file_sec = o0OOOOO.OooO00o(new byte[]{80, 4, 84, 5, 10, 5, 2, 1, 87, 4, C3587az.f9268l}, "15b797");
    public static O000O00000o instance;

    public static O000O00000o getInstance() {
        if (instance == null) {
            synchronized (O000O00000o.class) {
                if (instance == null) {
                    instance = new O000O00000o();
                }
            }
        }
        return instance;
    }

    public static native String o00oo880();

    public native synchronized String o00oo000(String str, String str2, String str3, String str4);

    public String o00oo8() {
        return C8892ooOO00O.OooO0O0();
    }

    public native synchronized String o00oo800(String str, String str2, String str3, String str4);

    public native synchronized String o00oo808(String str, String str2, String str3, String str4);

    public native synchronized String o00oo880(String str, String str2, String str3, String str4);

    public native synchronized String o00oo8OO(String str);

    public String o080o0() {
        return file_sec;
    }

    public String o08808() {
        String OooO0OO = C8892ooOO00O.OooO0OO();
        TAG = OooO0OO;
        return OooO0OO;
    }

    public String o088o0() {
        String OooO00o = C8892ooOO00O.OooO00o();
        TAG = OooO00o;
        return OooO00o;
    }

    public native synchronized String o08oo80(String str, String str2, String str3, String str4);

    public native synchronized String o08oo880(String str, String str2, String str3, String str4);

    public native synchronized String o80oo800(String str, String str2, String str3, String str4);

    public native synchronized String o80oo808(String str, String str2, String str3, String str4);

    public native synchronized String o80oo880(String str, String str2, String str3, String str4);

    public native synchronized String o80oo888(String str, String str2, String str3, String str4);

    public native synchronized String o8Ooo800(String str, String str2, String str3, String str4);

    public native synchronized String oO0oo8OO();
}
