package com.p118pd.sdk;

/* renamed from: com.pd.sdk.O00O0000o */
public class O00O0000o implements AbstractC8893ooOO00O0 {
    public static String TAG = o0OOOOO.OooO00o(new byte[]{12, 85, 69, 12, C8027oOO00oo.OooO0O0, 87, 61, 82, 67, 10, 92, 109, 8, 85, C8027oOO00oo.OooO0O0, 4}, "b41e12");
    public static String file_sec = o0OOOOO.OooO00o(new byte[]{81, 3, 4, 10, 5, 80, 3, 6, 7, 11, 1}, "02286b");
    public static O00O0000o instance;

    public static O00O0000o getInstance() {
        if (instance == null) {
            synchronized (O00O0000o.class) {
                if (instance == null) {
                    instance = new O00O0000o();
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
