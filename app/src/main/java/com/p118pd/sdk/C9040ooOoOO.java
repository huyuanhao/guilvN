package com.p118pd.sdk;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/* renamed from: com.pd.sdk.ooOoOO  reason: case insensitive filesystem */
public class C9040ooOoOO {
    public static final int OooO00o = -1231545315;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f22352OooO00o = "wifi";
    public static final String OooO0O0 = "eg";
    public static final String OooO0OO = "2g";
    public static final String OooO0Oo = "wap";
    public static final String OooO0o = "disconnect";
    public static final String OooO0o0 = "unknown";

    public static boolean OooO(Context context) {
        return m20694OooO00o(context) == NetworkInfo.State.CONNECTED;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m20695OooO00o(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) {
            return OooO0o;
        }
        String typeName = activeNetworkInfo.getTypeName();
        if ("WIFI".equalsIgnoreCase(typeName)) {
            return "wifi";
        }
        if (!"MOBILE".equalsIgnoreCase(typeName)) {
            return "unknown";
        }
        return TextUtils.isEmpty(Proxy.getDefaultHost()) ? OooOo00(context) ? OooO0O0 : "2g" : OooO0Oo;
    }

    public static int OooO0O0(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null ? activeNetworkInfo.getType() : OooO00o;
    }

    public static int OooO0OO(Context context) {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            networkInfo = null;
        } else {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        }
        if (networkInfo == null) {
            return -1;
        }
        return networkInfo.getType();
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public static boolean m20699OooO0Oo(Context context) {
        return OooOOO(context);
    }

    public static boolean OooO0o(Context context) {
        return OooOOOo(context) || OooOOo0(context) || OooOOo(context);
    }

    public static boolean OooO0o0(Context context) {
        return m20698OooO0OO(context);
    }

    public static boolean OooO0oO(Context context) {
        return OooOo0(context);
    }

    public static boolean OooO0oo(Context context) {
        return OooOo0O(context) || Oooo0O0(context);
    }

    public static boolean OooOO0(Context context) {
        return m20694OooO00o(context) == NetworkInfo.State.CONNECTING;
    }

    public static boolean OooOO0O(Context context) {
        return m20694OooO00o(context) == NetworkInfo.State.DISCONNECTED;
    }

    public static boolean OooOO0o(Context context) {
        return m20694OooO00o(context) == NetworkInfo.State.DISCONNECTING;
    }

    public static boolean OooOOO(Context context) {
        return OooO00o(context) == 2;
    }

    @TargetApi(14)
    public static boolean OooOOO0(Context context) {
        if (Build.VERSION.SDK_INT >= 13 && OooO0O0(context) == 8) {
            return true;
        }
        return false;
    }

    @TargetApi(11)
    public static boolean OooOOOO(Context context) {
        if (Build.VERSION.SDK_INT >= 11 && OooO00o(context) == 14) {
            return true;
        }
        return false;
    }

    public static boolean OooOOOo(Context context) {
        return OooO00o(context) == 5;
    }

    @TargetApi(9)
    public static boolean OooOOo(Context context) {
        if (Build.VERSION.SDK_INT >= 9 && OooO00o(context) == 12) {
            return true;
        }
        return false;
    }

    public static boolean OooOOo0(Context context) {
        return OooO00o(context) == 6;
    }

    @TargetApi(13)
    public static boolean OooOOoo(Context context) {
        if (Build.VERSION.SDK_INT >= 13 && OooO0O0(context) == 9) {
            return true;
        }
        return false;
    }

    @TargetApi(13)
    public static boolean OooOo(Context context) {
        if (Build.VERSION.SDK_INT >= 13 && OooO00o(context) == 15) {
            return true;
        }
        return false;
    }

    public static boolean OooOo0(Context context) {
        return OooO00o(context) == 1;
    }

    public static boolean OooOo00(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            return false;
        }
        switch (telephonyManager.getNetworkType()) {
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
            case 14:
            case 15:
                return true;
            case 4:
            case 7:
            case 11:
            default:
                return false;
        }
    }

    public static boolean OooOo0O(Context context) {
        return OooO00o(context) == 8;
    }

    public static boolean OooOo0o(Context context) {
        return OooO00o(context) == 10;
    }

    public static boolean OooOoO(Context context) {
        return OooO00o(context) == 11;
    }

    public static boolean OooOoO0(Context context) {
        return OooO00o(context) == 9;
    }

    @TargetApi(11)
    public static boolean OooOoOO(Context context) {
        if (Build.VERSION.SDK_INT >= 11 && OooO00o(context) == 13) {
            return true;
        }
        return false;
    }

    public static boolean OooOoo(Context context) {
        return OooO0O0(context) == 4;
    }

    public static boolean OooOoo0(Context context) {
        return OooO0O0(context) == 0;
    }

    public static boolean OooOooO(Context context) {
        return OooO0O0(context) == 5;
    }

    public static boolean OooOooo(Context context) {
        return OooO0O0(context) == 2;
    }

    public static boolean Oooo0(Context context) {
        return m20694OooO00o(context) == NetworkInfo.State.SUSPENDED;
    }

    public static boolean Oooo000(Context context) {
        return ((ConnectivityManager) context.getSystemService("connectivity")).getNetworkInfo(0).isConnected();
    }

    public static boolean Oooo00O(Context context) {
        return OooO0O0(context) == 3;
    }

    public static boolean Oooo00o(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return false;
        }
        return activeNetworkInfo.isAvailable();
    }

    public static boolean Oooo0O0(Context context) {
        return OooO00o(context) == 3;
    }

    public static boolean Oooo0OO(Context context) {
        return OooO00o(context) == 0;
    }

    public static boolean Oooo0o(Context context) {
        return OooO0O0(context) == 1;
    }

    public static boolean Oooo0o0(Context context) {
        return m20694OooO00o(context) == NetworkInfo.State.UNKNOWN;
    }

    public static boolean Oooo0oO(Context context) throws Exception {
        int OooO0Oo2 = OooO0Oo(context);
        return OooO0Oo2 == 3 || OooO0Oo2 == 2;
    }

    public static boolean Oooo0oo(Context context) {
        return OooO0O0(context) == 6;
    }

    public static int OooO0Oo(Context context) throws Exception {
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        if (wifiManager != null) {
            return wifiManager.getWifiState();
        }
        throw new Exception("wifi device not found!");
    }

    @TargetApi(13)
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static boolean m20697OooO0O0(Context context) {
        if (Build.VERSION.SDK_INT >= 13 && OooO0O0(context) == 7) {
            return true;
        }
        return false;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static boolean m20698OooO0OO(Context context) {
        return OooO00o(context) == 4;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static NetworkInfo.State m20694OooO00o(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return activeNetworkInfo.getState();
        }
        return null;
    }

    public static int OooO00o(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null ? activeNetworkInfo.getSubtype() : OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20696OooO00o(Context context) {
        return OooO00o(context) == 7;
    }

    public static boolean OooO00o(Context context, boolean z) throws Exception {
        if (Oooo0oO(context) == z) {
            return true;
        }
        ((WifiManager) context.getSystemService("wifi")).setWifiEnabled(z);
        return true;
    }

    public static String OooO00o() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (true) {
                    if (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement = inetAddresses.nextElement();
                        if (!nextElement.isLoopbackAddress()) {
                            return nextElement.getHostAddress().toString();
                        }
                    }
                }
            }
            return null;
        } catch (SocketException e) {
            e.printStackTrace();
            return null;
        }
    }
}
