package com.p118pd.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.SystemProperties;
import android.telephony.TelephonyManager;
import android.text.TextUtils;

@SuppressLint({"DefaultLocale"})
/* renamed from: com.pd.sdk.oOoo0o00  reason: case insensitive filesystem */
public class C8416oOoo0o00 {
    public static final int OooO00o = 21;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f21559OooO00o = "0";

    public static String OooO00o() {
        return Build.VERSION.RELEASE;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public static String OooO00o(Context context) {
        char c;
        String lowerCase = OooO0O0(context).toLowerCase();
        switch (lowerCase.hashCode()) {
            case -42227884:
                if (lowerCase.equals("china net")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 278980793:
                if (lowerCase.equals("chinamobile")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 394699659:
                if (lowerCase.equals("china mobile")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 507293352:
                if (lowerCase.equals("chinaunicom")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 618558396:
                if (lowerCase.equals("中国电信")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 618596989:
                if (lowerCase.equals("中国移动")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 618663094:
                if (lowerCase.equals("中国联通")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 623012218:
                if (lowerCase.equals("china unicom")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1661280486:
                if (lowerCase.equals("chinanet")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
                return "China Mobile";
            case 3:
            case 4:
            case 5:
                return "China Unicom";
            case 6:
            case 7:
            case '\b':
                return "China Net";
            default:
                return "none";
        }
    }

    public static boolean OooO00o(String str) {
        return TextUtils.isEmpty(str) || "null".equals(str);
    }

    public static String OooO0O0() {
        if (!OooO00o(Build.MODEL)) {
            return Build.MODEL.toUpperCase();
        }
        C8409oOoo0OOo.OooO0oO("No MODEL.");
        return "0";
    }

    public static String OooO0O0(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            return telephonyManager != null ? telephonyManager.getNetworkOperatorName() : "";
        } catch (Exception e) {
            C8409oOoo0OOo.OooO00o(e);
            return "";
        }
    }

    public static String OooO0OO() {
        return SystemProperties.get("ro.build.display.id", "");
    }
}
