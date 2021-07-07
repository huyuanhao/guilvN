package com.p118pd.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;

@SuppressLint({"DefaultLocale"})
/* renamed from: com.pd.sdk.oOoo0Oo  reason: case insensitive filesystem */
public class C8410oOoo0Oo {
    public static final int OooO = 8;
    public static final int OooO00o = 0;
    public static final int OooO0O0 = 1;
    public static final int OooO0OO = 2;
    public static final int OooO0Oo = 3;
    public static final int OooO0o = 5;
    public static final int OooO0o0 = 4;
    public static final int OooO0oO = 6;
    public static final int OooO0oo = 7;
    public static final int OooOO0 = 9;
    public static final int OooOO0O = 10;
    public static final int OooOO0o = 11;
    public static final int OooOOO = 13;
    public static final int OooOOO0 = 12;
    public static final int OooOOOO = 14;
    public static final int OooOOOo = 15;
    public static final int OooOOo = -101;
    public static final int OooOOo0 = -1;
    public static final int OooOOoo = -101;
    public static final int OooOo = 3;
    public static final int OooOo0 = 0;
    public static final int OooOo00 = -1;
    public static final int OooOo0O = 1;
    public static final int OooOo0o = 2;

    public static int OooO00o(int i) {
        int i2 = -101;
        if (i != -101) {
            i2 = -1;
            if (i != -1) {
                switch (i) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        return 1;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        return 2;
                    case 13:
                        return 3;
                    default:
                        return 0;
                }
            }
        }
        return i2;
    }

    @SuppressLint({"DefaultLocale"})
    public static String OooO00o(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo == null) {
                return "0";
            }
            String upperCase = activeNetworkInfo.getTypeName().toUpperCase();
            if (!upperCase.equals("MOBILE")) {
                return upperCase;
            }
            String extraInfo = activeNetworkInfo.getExtraInfo();
            return !TextUtils.isEmpty(extraInfo) ? extraInfo.toUpperCase() : upperCase;
        } catch (Exception e) {
            C8409oOoo0OOo.OooO00o(e);
            return "0";
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20075OooO00o(Context context) {
        try {
            String OooO00o2 = OooO00o(context);
            return OooO00o2.equals("UNINET") || OooO00o2.equals("UNIWAP") || OooO00o2.equals("CMNET") || OooO00o2.equals("CMWAP") || OooO00o2.equals("CTNET") || OooO00o2.equals("CTWAP");
        } catch (Exception e) {
            C8409oOoo0OOo.OooO00o(e);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0062 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String OooO0O0(android.content.Context r6) {
        /*
        // Method dump skipped, instructions count: 101
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8410oOoo0Oo.OooO0O0(android.content.Context):java.lang.String");
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static boolean m20076OooO0O0(Context context) {
        try {
            String OooO00o2 = OooO00o(context);
            return OooO00o2.equals("3GNET") || OooO00o2.equals("3GWAP");
        } catch (Exception e) {
            C8409oOoo0OOo.OooO00o(e);
            return false;
        }
    }

    public static boolean OooO0OO(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected();
            }
            return false;
        } catch (Exception e) {
            C8409oOoo0OOo.OooO00o(e);
            return false;
        }
    }

    public static boolean OooO0Oo(Context context) {
        String OooO00o2 = OooO00o(context);
        return OooO00o2.equals("CMWAP") || OooO00o2.equals("3GWAP") || OooO00o2.equals("UNIWAP");
    }

    public static boolean OooO0o0(Context context) {
        try {
            return OooO00o(context).equals("WIFI");
        } catch (Exception e) {
            C8409oOoo0OOo.OooO00o(e);
            return false;
        }
    }
}
