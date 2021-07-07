package com.p118pd.sdk;

import android.text.TextUtils;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.pd.sdk.oo0O00O  reason: case insensitive filesystem */
public class C8591oo0O00O {
    public static int OooO00o(int i, int i2, int i3) {
        if (i > i2) {
            AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", "checkIntRange(): parameter overlarge.");
            return i2;
        } else if (i >= i3) {
            return i;
        } else {
            AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", "checkIntRange(): parameter under size.");
            return i3;
        }
    }

    public static String OooO00o(String str, int i, int i2) {
        String str2;
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt <= i && parseInt >= i2) {
                return String.valueOf(str);
            }
            str2 = "checkMcc(): MCC out of range!";
            AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", str2);
            return "";
        } catch (NumberFormatException unused) {
            str2 = "checkMcc(): mcc is not a number!please set up correctly";
        }
    }

    public static String OooO00o(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str2)) {
            return OooO00o(str, str2, str3) ? str2 : str4;
        }
        AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", "checkStrParameter() Parameter verification failure! Parameter:" + str);
        return str4;
    }

    public static boolean OooO00o(String str) {
        return !OooO00o("eventId", str, 256);
    }

    public static boolean OooO00o(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (Pattern.compile(str2).matcher(str).matches()) {
            return true;
        }
        AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", "isURLMatch(): URL check failed.");
        return false;
    }

    public static boolean OooO00o(String str, String str2, int i) {
        StringBuilder sb;
        String str3;
        if (TextUtils.isEmpty(str2)) {
            sb = new StringBuilder();
            str3 = "checkString() Parameter is empty : ";
        } else if (str2.length() <= i) {
            return true;
        } else {
            sb = new StringBuilder();
            str3 = "checkString() Failure of parameter length check! Parameter:";
        }
        sb.append(str3);
        sb.append(str);
        AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", sb.toString());
        return false;
    }

    public static boolean OooO00o(String str, String str2, String str3) {
        StringBuilder sb;
        String str4;
        if (TextUtils.isEmpty(str2)) {
            sb = new StringBuilder();
            str4 = "checkString() Parameter is null! Parameter:";
        } else if (Pattern.compile(str3).matcher(str2).matches()) {
            return true;
        } else {
            sb = new StringBuilder();
            str4 = "checkString() Parameter verification failure! Parameter:";
        }
        sb.append(str4);
        sb.append(str);
        AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", sb.toString());
        return false;
    }

    public static boolean OooO00o(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", "onEvent() mapValue has not data.so,The data will be empty");
            return false;
        } else if (map.size() == 1 && (map.get("constants") != null || map.get("_constants") != null)) {
            AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", "checkMap() the key can't be constants or _constants");
            return false;
        } else if (map.size() <= 2048 && map.toString().length() <= 204800) {
            return true;
        } else {
            AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", "checkMap Map data is too big! size: %d , length: %d", Integer.valueOf(map.size()), Integer.valueOf(map.toString().length()));
            return false;
        }
    }
}
