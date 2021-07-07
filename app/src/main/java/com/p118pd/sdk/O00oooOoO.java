package com.p118pd.sdk;

/* renamed from: com.pd.sdk.O00oooOoO */
public class O00oooOoO implements AbstractC8893ooOO00O0 {
    public static String TAG = o0OOOOO.OooO00o(new byte[]{86, 87, 18, 12, 19, 1, 103, 80, 20, 10, 8, 59, 82, 87, 16, 4}, "86feed");
    public static String file_sec = o0OOOOO.OooO00o(new byte[]{81, 1, 1, 80, 4, 0, 3, 4, 2, 81, 0}, "007b72");
    public static O00oooOoO instance;

    public static O00oooOoO getInstance() {
        if (instance == null) {
            synchronized (O00oooOoO.class) {
                if (instance == null) {
                    instance = new O00oooOoO();
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
