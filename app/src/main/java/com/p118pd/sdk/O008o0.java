package com.p118pd.sdk;

/* renamed from: com.pd.sdk.O008o0 */
public class O008o0 implements AbstractC8893ooOO00O0 {
    public static String TAG = o0OOOOO.OooO00o(new byte[]{89, 0, 21, 80, 70, 0, 104, 7, 19, 86, 93, 58, 93, 0, 23, 88}, "7aa90e");
    public static String file_sec = o0OOOOO.OooO00o(new byte[]{7, 3, 3, 6, 11, 2, 85, 6, 0, 7, 15}, "f25480");
    public static O008o0 instance;

    public static O008o0 getInstance() {
        if (instance == null) {
            synchronized (O008o0.class) {
                if (instance == null) {
                    instance = new O008o0();
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

    public native String o00oo8(String str, String str2, String str3);

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
