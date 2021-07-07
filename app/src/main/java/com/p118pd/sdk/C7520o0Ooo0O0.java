package com.p118pd.sdk;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.alipay.sdk.util.EnumC0408d;

/* renamed from: com.pd.sdk.o0Ooo0O0  reason: case insensitive filesystem */
public class C7520o0Ooo0O0 {
    public static C7520o0Ooo0O0 OooO00o = null;
    public static final String OooO0Oo = "00:00:00:00:00:00";

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f20367OooO00o;
    public String OooO0O0;
    public String OooO0OO;

    public C7520o0Ooo0O0(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getApplicationContext().getSystemService("phone");
            OooO0O0(telephonyManager.getDeviceId());
            OooO00o(telephonyManager.getSubscriberId());
            String macAddress = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo().getMacAddress();
            this.OooO0OO = macAddress;
            if (!TextUtils.isEmpty(macAddress)) {
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (!TextUtils.isEmpty(this.OooO0OO)) {
                return;
            }
        } catch (Throwable th) {
            if (TextUtils.isEmpty(this.OooO0OO)) {
                this.OooO0OO = OooO0Oo;
            }
            throw th;
        }
        this.OooO0OO = OooO0Oo;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static C7520o0Ooo0O0 m19173OooO00o(Context context) {
        if (OooO00o == null) {
            OooO00o = new C7520o0Ooo0O0(context);
        }
        return OooO00o;
    }

    public String OooO0O0() {
        if (TextUtils.isEmpty(this.OooO0O0)) {
            this.OooO0O0 = "000000000000000";
        }
        return this.OooO0O0;
    }

    public String OooO0OO() {
        String str = OooO0O0() + "|";
        String OooO00o2 = OooO00o();
        if (TextUtils.isEmpty(OooO00o2)) {
            return str + "000000000000000";
        }
        return str + OooO00o2;
    }

    public String OooO0Oo() {
        return this.OooO0OO;
    }

    public String OooO00o() {
        if (TextUtils.isEmpty(this.f20367OooO00o)) {
            this.f20367OooO00o = "000000000000000";
        }
        return this.f20367OooO00o;
    }

    public void OooO0O0(String str) {
        if (str != null) {
            byte[] bytes = str.getBytes();
            for (int i = 0; i < bytes.length; i++) {
                if (bytes[i] < 48 || bytes[i] > 57) {
                    bytes[i] = 48;
                }
            }
            String str2 = new String(bytes);
            str = (str2 + "000000000000000").substring(0, 15);
        }
        this.OooO0O0 = str;
    }

    public void OooO00o(String str) {
        if (str != null) {
            str = (str + "000000000000000").substring(0, 15);
        }
        this.f20367OooO00o = str;
    }

    public static EnumC0408d OooO00o(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.getType() == 0) {
                return EnumC0408d.m838a(activeNetworkInfo.getSubtype());
            }
            if (activeNetworkInfo == null || activeNetworkInfo.getType() != 1) {
                return EnumC0408d.NONE;
            }
            return EnumC0408d.WIFI;
        } catch (Exception unused) {
            return EnumC0408d.NONE;
        }
    }

    public static String OooO0O0(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return context.getResources().getConfiguration().locale.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m19174OooO00o(Context context) {
        return m19173OooO00o(context).OooO0OO().substring(0, 8);
    }
}
