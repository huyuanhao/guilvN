package com.p118pd.sdk;

/* renamed from: com.pd.sdk.O000O00000o0 */
public class O000O00000o0 implements AbstractC8893ooOO00O0 {
    public static String TAG = o0OOOOO.OooO00o(new byte[]{89, 86, 66, 92, 19, 3, 104, 81, 68, 90, 8, 57, 93, 86, 64, 84}, "7765ef");
    public static String file_sec = o0OOOOO.OooO00o(new byte[]{88, 3, 6, 86, 82, 80, 10, 6, 5, 87, 86}, "920dab");
    public static O000O00000o0 instance;

    public static O000O00000o0 getInstance() {
        if (instance == null) {
            synchronized (O000O00000o0.class) {
                if (instance == null) {
                    instance = new O000O00000o0();
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
        O000O0000Oo0.getInstance().oO0oo8OO();
        return TAG;
    }

    public String o088o0() {
        O000O0000Oo0.getInstance().o00oo800("", "", "", "");
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
