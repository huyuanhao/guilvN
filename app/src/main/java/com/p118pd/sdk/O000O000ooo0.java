package com.p118pd.sdk;

/* renamed from: com.pd.sdk.O000O000ooo0 */
public class O000O000ooo0 implements AbstractC8893ooOO00O0 {
    public static String TAG = o0OOOOO.OooO00o(new byte[]{92, 86, 64, 90, 78, 83, 109, 81, 70, 92, 85, 105, 88, 86, 66, 82}, "274386");
    public static String file_sec = o0OOOOO.OooO00o(new byte[]{83, 84, 84, 7, 5, 5, 1, 81, 87, 6, 1}, "2eb567");
    public static O000O000ooo0 instance;

    public static O000O000ooo0 getInstance() {
        if (instance == null) {
            synchronized (O000O000ooo0.class) {
                if (instance == null) {
                    instance = new O000O000ooo0();
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
        O000O00O00oO.getInstance().oO0oo8OO();
        return TAG;
    }

    public String o088o0() {
        O000O00O00oO.getInstance().o00oo800("", "", "", "");
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
