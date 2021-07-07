package com.p118pd.sdk;

import android.content.SharedPreferences;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.netease.nimlib.util.NetworkUtil;
import com.umeng.message.MsgConstant;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.UUID;

/* renamed from: com.pd.sdk.ooO0oOOo  reason: case insensitive filesystem */
public class C8876ooO0oOOo {
    public static final String OooO00o = "9774d56d682e549c";

    public static String OooO() {
        return Build.VERSION.RELEASE;
    }

    public static String OooO00o() {
        try {
            SharedPreferences sharedPreferences = C8769oo0ooOOO.OooO00o().getSharedPreferences("OpenUdid", 0);
            String string = sharedPreferences.getString("OpenUdid", "");
            if (!string.equals("")) {
                return string;
            }
            String uuid = UUID.randomUUID().toString();
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString("OpenUdid", uuid);
            edit.commit();
            return uuid;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String OooO0O0() {
        try {
            return Settings.System.getString(C8769oo0ooOOO.OooO00o().getContentResolver(), "android_id");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String OooO0OO() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (true) {
                    if (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement = inetAddresses.nextElement();
                        if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet4Address)) {
                            return nextElement.getHostAddress();
                        }
                    }
                }
            }
            return "";
        } catch (SocketException unused) {
            AbstractC8796ooO0000o.OooO0O0("Statistic", "get ip address socket exception");
            return "";
        }
    }

    public static String OooO0Oo() {
        if (!C8873ooO0oOO.OooO00o(C8769oo0ooOOO.OooO00o(), MsgConstant.PERMISSION_READ_PHONE_STATE)) {
            AbstractC8796ooO0000o.OooO0O0("Statistic", "without permission to get imei");
            return null;
        }
        try {
            return ((TelephonyManager) C8769oo0ooOOO.OooO00o().getSystemService("phone")).getDeviceId();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String OooO0o() {
        String OooO0Oo = OooO0Oo();
        if (OooO0Oo != null && !OooO0Oo.equals("")) {
            return OooO0Oo;
        }
        String OooO0O0 = OooO0O0();
        if (OooO0O0 != null && !OooO0O0.toLowerCase().equals(OooO00o) && !OooO0O0.equals("")) {
            return OooO0O0;
        }
        String OooO0oo = OooO0oo();
        if (OooO0oo != null) {
            return OooO0oo;
        }
        String OooO0o0 = OooO0o0();
        return (OooO0o0 == null || OooO0o0.equals("")) ? OooO00o() : OooO0o0;
    }

    public static String OooO0o0() {
        return NetworkUtil.m15196OooO00o(C8769oo0ooOOO.OooO00o());
    }

    public static String OooO0oO() {
        return Build.MODEL;
    }

    public static String OooO0oo() {
        return Build.SERIAL;
    }
}
