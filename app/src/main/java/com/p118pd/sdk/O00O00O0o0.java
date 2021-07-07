package com.p118pd.sdk;

/* renamed from: com.pd.sdk.O00O00O0o0 */
public class O00O00O0o0 implements AbstractC8893ooOO00O0 {
    public static String TAG = o0OOOOO.OooO00o(new byte[]{88, 88, 68, 81, 20, 1, 105, 95, 66, 87, 15, 59, 92, 88, 70, 89}, "6908bd");
    public static String file_sec = o0OOOOO.OooO00o(new byte[]{4, 3, 3, 10, 87, 4, 86, 6, 0, 11, 83}, "e258d6");
    public static O00O00O0o0 instance;

    public static O00O00O0o0 getInstance() {
        if (instance == null) {
            synchronized (O00O00O0o0.class) {
                if (instance == null) {
                    instance = new O00O00O0o0();
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
