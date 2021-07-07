package com.p118pd.sdk;

import com.umeng.commonsdk.proguard.C3587az;

/* renamed from: com.pd.sdk.O0O0OOO0 */
public class O0O0OOO0 implements AbstractC8893ooOO00O0 {
    public static String TAG = o0OOOOO.OooO00o(new byte[]{86, 4, 17, 92, 78, 82, 103, 3, 23, 90, 85, 104, 82, 4, 19, 84}, "8ee587");
    public static String file_sec = o0OOOOO.OooO00o(new byte[]{89, 4, 7, 80, 4, 10, 11, 1, 4, 81, 0}, "851b78");
    public static O0O0OOO0 instance;

    public static O0O0OOO0 getInstance() {
        if (instance == null) {
            synchronized (O0O0OOO0.class) {
                if (instance == null) {
                    instance = new O0O0OOO0();
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
        O0O0O000o.getInstance().o00oo800(o0OOOOO.OooO00o(new byte[]{C3587az.f9268l, 85, 72}, "e013e2"), o0OOOOO.OooO00o(new byte[]{87, 67, 22}, "63f632"), o0OOOOO.OooO00o(new byte[]{64, 21, 69, 79, 15, 90, 89, 10, C8027oOO00oo.OooO0O0, 8, 75, 80, 88, 15}, "7b2ae3"), o0OOOOO.OooO00o(new byte[]{0}, "065633"));
        return TAG;
    }

    public String o088o0() {
        O0O0O000o.getInstance().o00oo8OO(o0OOOOO.OooO00o(new byte[]{C3587az.f9268l, 83, 8, 93, 9, 91}, "ac0e9c"));
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
