package com.p118pd.sdk;

/* renamed from: com.pd.sdk.O0O0OOO00 */
public class O0O0OOO00 implements AbstractC8893ooOO00O0 {
    public static String TAG = o0OOOOO.OooO00o(new byte[]{92, 83, 70, 89, 19, 0, 109, 84, 64, 95, 8, 58, 88, 83, 68, 81}, "2220ee");
    public static String file_sec = o0OOOOO.OooO00o(new byte[]{85, 7, 84, 3, 81, 7, 7, 2, 87, 2, 85}, "46b1b5");
    public static O0O0OOO00 instance;

    public static O0O0OOO00 getInstance() {
        if (instance == null) {
            synchronized (O0O0OOO00.class) {
                if (instance == null) {
                    instance = new O0O0OOO00();
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
