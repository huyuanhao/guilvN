package com.p118pd.sdk;

/* renamed from: com.pd.sdk.O00O00O0o00 */
public class O00O00O0o00 implements AbstractC8893ooOO00O0 {
    public static String TAG = o0OOOOO.OooO00o(new byte[]{91, 89, 64, 81, C8027oOO00oo.OooO0O0, 3, 106, 94, 70, 87, 92, 57, 95, 89, 66, 89}, "58481f");
    public static String file_sec = o0OOOOO.OooO00o(new byte[]{2, 3, 83, 7, 3, 7, 80, 6, 80, 6, 7}, "c2e505");
    public static O00O00O0o00 instance;

    public static O00O00O0o00 getInstance() {
        if (instance == null) {
            synchronized (O00O00O0o00.class) {
                if (instance == null) {
                    instance = new O00O00O0o00();
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
