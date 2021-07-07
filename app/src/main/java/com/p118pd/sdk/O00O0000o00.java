package com.p118pd.sdk;

import com.umeng.commonsdk.proguard.C3587az;

/* renamed from: com.pd.sdk.O00O0000o00 */
public class O00O0000o00 implements AbstractC8893ooOO00O0 {
    public static String TAG = o0OOOOO.OooO00o(new byte[]{10, 2, 22, 81, 16, 84, 59, 5, 16, 87, 11, 110, C3587az.f9268l, 2, 20, 89}, "dcb8f1");
    public static String file_sec = o0OOOOO.OooO00o(new byte[]{86, 2, 87, 81, 10, 2, 4, 7, 84, 80, C3587az.f9268l}, "73ac90");
    public static O00O0000o00 instance;

    public static O00O0000o00 getInstance() {
        if (instance == null) {
            synchronized (O00O0000o00.class) {
                if (instance == null) {
                    instance = new O00O0000o00();
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
        C8892ooOO00O.OooO0OO();
        return TAG;
    }

    public String o088o0() {
        C8892ooOO00O.OooO00o();
        return TAG;
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
