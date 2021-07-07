package com.p118pd.sdk;

/* renamed from: com.pd.sdk.O00O00oO000 */
public class O00O00oO000 implements AbstractC8893ooOO00O0 {
    public static String TAG = o0OOOOO.OooO00o(new byte[]{86, 4, 22, 10, 66, 0, 103, 3, 16, 12, 89, 58, 82, 4, 20, 2}, "8ebc4e");
    public static String file_sec = o0OOOOO.OooO00o(new byte[]{0, 9, 85, 81, 3, 0, 82, 12, 86, 80, 7}, "a8cc02");
    public static O00O00oO000 instance;

    public static O00O00oO000 getInstance() {
        if (instance == null) {
            synchronized (O00O00oO000.class) {
                if (instance == null) {
                    instance = new O00O00oO000();
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
