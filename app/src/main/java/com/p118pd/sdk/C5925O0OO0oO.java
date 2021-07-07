package com.p118pd.sdk;

/* renamed from: com.pd.sdk.O0OO0oO  reason: case insensitive filesystem */
public class C5925O0OO0oO implements AbstractC8893ooOO00O0 {
    public static String TAG = o0OOOOO.OooO00o(new byte[]{95, 89, 18, 95, 68, 82, 110, 94, 20, 89, 95, 104, 91, 89, 16, 87}, "18f627");
    public static String file_sec = o0OOOOO.OooO00o(new byte[]{87, 84, 3, 3, 7, 80, 5, 81, 0, 2, 3}, "6e514b");
    public static C5925O0OO0oO instance;

    public static C5925O0OO0oO getInstance() {
        if (instance == null) {
            synchronized (C5925O0OO0oO.class) {
                if (instance == null) {
                    instance = new C5925O0OO0oO();
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
