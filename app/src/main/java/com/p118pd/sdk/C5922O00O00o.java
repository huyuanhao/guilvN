package com.p118pd.sdk;

/* renamed from: com.pd.sdk.O00O00o  reason: case insensitive filesystem */
public class C5922O00O00o implements AbstractC8893ooOO00O0 {
    public static String TAG = o0OOOOO.OooO00o(new byte[]{12, 81, 17, 12, 18, 86, 61, 86, 23, 10, 9, 108, 8, 81, 19, 4}, "b0eed3");
    public static String file_sec = o0OOOOO.OooO00o(new byte[]{7, 82, 5, 6, 7, 6, 85, 87, 6, 7, 3}, "fc3444");
    public static C5922O00O00o instance;

    public static C5922O00O00o getInstance() {
        if (instance == null) {
            synchronized (C5922O00O00o.class) {
                if (instance == null) {
                    instance = new C5922O00O00o();
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
