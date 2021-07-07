package com.p118pd.sdk;

/* renamed from: com.pd.sdk.O00O0OO0O */
public class O00O0OO0O implements AbstractC8893ooOO00O0 {
    public static String TAG = o0OOOOO.OooO00o(new byte[]{95, 89, 66, 91, 79, 87, 110, 94, 68, 93, 84, 109, 91, 89, 64, 83}, "186292");
    public static String file_sec = o0OOOOO.OooO00o(new byte[]{89, 3, 5, 1, 3, 2, 11, 6, 6, 0, 7}, "823300");
    public static O00O0OO0O instance;

    public static O00O0OO0O getInstance() {
        if (instance == null) {
            synchronized (O00O0OO0O.class) {
                if (instance == null) {
                    instance = new O00O0OO0O();
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
