package com.p118pd.sdk;

/* renamed from: com.pd.sdk.O0O00o0  reason: case insensitive filesystem */
public class C5924O0O00o0 implements AbstractC8893ooOO00O0 {
    public static String TAG = o0OOOOO.OooO00o(new byte[]{95, 83, 64, 80, 20, 81, 110, 84, 70, 86, 15, 107, 91, 83, 66, 88}, "1249b4");
    public static String file_sec = o0OOOOO.OooO00o(new byte[]{5, 3, 85, 11, 11, 1, 87, 6, 86, 10, 15}, "d2c983");
    public static C5924O0O00o0 instance;

    public static C5924O0O00o0 getInstance() {
        if (instance == null) {
            synchronized (C5924O0O00o0.class) {
                if (instance == null) {
                    instance = new C5924O0O00o0();
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
        String OooO0OO = C8892ooOO00O.OooO0OO();
        TAG = OooO0OO;
        return OooO0OO;
    }

    public String o088o0() {
        String OooO00o = C8892ooOO00O.OooO00o();
        TAG = OooO00o;
        return OooO00o;
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
