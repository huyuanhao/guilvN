package com.p118pd.sdk;

/* renamed from: com.pd.sdk.O00O00o0000 */
public class O00O00o0000 implements AbstractC8893ooOO00O0 {
    public static String TAG = o0OOOOO.OooO00o(new byte[]{8, 7, 69, 15, 70, 6, 57, 0, 67, 9, 93, 60, 12, 7, C8027oOO00oo.OooO0O0, 7}, "ff1f0c");
    public static String file_sec = o0OOOOO.OooO00o(new byte[]{7, 87, 83, 3, 4, 2, 85, 82, 80, 2, 0}, "ffe170");
    public static O00O00o0000 instance;

    public static O00O00o0000 getInstance() {
        if (instance == null) {
            synchronized (O00O00o0000.class) {
                if (instance == null) {
                    instance = new O00O00o0000();
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
