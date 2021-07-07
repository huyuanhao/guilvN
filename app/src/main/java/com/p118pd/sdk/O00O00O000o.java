package com.p118pd.sdk;

import com.umeng.commonsdk.proguard.C3587az;

/* renamed from: com.pd.sdk.O00O00O000o */
public class O00O00O000o implements AbstractC8893ooOO00O0 {
    public static String TAG = o0OOOOO.OooO00o(new byte[]{8, 83, 67, 8, 69, 81, 57, 84, 69, C3587az.f9268l, 94, 107, 12, 83, C8027oOO00oo.OooO00o, 0}, "f27a34");
    public static String file_sec = o0OOOOO.OooO00o(new byte[]{88, 8, 6, 2, 11, 83, 10, 13, 5, 3, 15}, "99008a");
    public static O00O00O000o instance;

    public static O00O00O000o getInstance() {
        if (instance == null) {
            synchronized (O00O00O000o.class) {
                if (instance == null) {
                    instance = new O00O00O000o();
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
