package com.p118pd.sdk;

/* renamed from: com.pd.sdk.O0000O000000o */
public class O0000O000000o implements AbstractC8893ooOO00O0 {
    public static String TAG = o0OOOOO.OooO00o(new byte[]{91, 88, 76, 88, C8027oOO00oo.OooO0O0, 6, 106, 95, 74, 94, 92, 60, 95, 88, 78, 80}, "59811c");
    public static String file_sec = o0OOOOO.OooO00o(new byte[]{7, 87, 84, 10, 85, 86, 85, 82, 87, 11, 81}, "ffb8fd");
    public static O0000O000000o instance;

    public static O0000O000000o getInstance() {
        if (instance == null) {
            synchronized (O0000O000000o.class) {
                if (instance == null) {
                    instance = new O0000O000000o();
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
        O000O00o0ooo.getInstance().o088o0();
        return TAG;
    }

    public String o088o0() {
        O000O00o0ooo.getInstance().o08808();
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
