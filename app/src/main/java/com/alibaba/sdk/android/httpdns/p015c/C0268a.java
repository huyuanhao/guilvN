package com.alibaba.sdk.android.httpdns.p015c;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.facebook.react.modules.netinfo.NetInfoModule;

/* renamed from: com.alibaba.sdk.android.httpdns.c.a */
public class C0268a {

    /* renamed from: h */
    public int f592h;

    /* renamed from: m */
    public String f593m;

    /* renamed from: n */
    public String f594n;

    /* renamed from: com.alibaba.sdk.android.httpdns.c.a$a */
    public static final class C0270a {

        /* renamed from: b */
        public static final C0268a f595b = new C0268a();
    }

    public C0268a() {
        this.f592h = 0;
        this.f593m = NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED;
        this.f594n = NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED;
    }

    /* renamed from: a */
    private int m468a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return 0;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                if (activeNetworkInfo.isConnected()) {
                    if (activeNetworkInfo.getType() == 1) {
                        return 1;
                    }
                    if (activeNetworkInfo.getType() != 0) {
                        return 0;
                    }
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                        case 2:
                        case 4:
                        case 7:
                        case 11:
                            return 2;
                        case 3:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                        case 10:
                        case 15:
                            return 3;
                        case 12:
                        case 14:
                        default:
                            return 0;
                        case 13:
                            return 4;
                    }
                }
            }
            return 255;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static C0268a m469a() {
        return C0270a.f595b;
    }

    /* renamed from: a */
    private String m470a(Context context) {
        try {
            String simOperator = ((TelephonyManager) context.getSystemService("phone")).getSimOperator();
            if (!TextUtils.isEmpty(simOperator)) {
                return simOperator;
            }
        } catch (Throwable unused) {
        }
        return String.valueOf(0);
    }

    /* renamed from: b */
    private String m471b(Context context) {
        try {
            WifiInfo connectionInfo = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo();
            if (connectionInfo != null) {
                return connectionInfo.getSSID();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private String mo3969c(Context context) {
        try {
            WifiInfo connectionInfo = ((WifiManager) context.getApplicationContext().getSystemService("wifi")).getConnectionInfo();
            if (connectionInfo != null) {
                return connectionInfo.getBSSID();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: d */
    private void m473d(Context context) {
        int a = m468a(context);
        this.f592h = a;
        if (a == 1) {
            this.f593m = m471b(context);
            this.f594n = mo3969c(context);
        } else if (a == 2 || a == 3 || a == 4) {
            this.f593m = m470a(context);
        }
        if (TextUtils.isEmpty(this.f593m)) {
            this.f593m = NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED;
        }
    }

    /* renamed from: c */
    public void m474c(Context context) {
        m473d(context);
    }

    /* renamed from: g */
    public String mo3970g() {
        return this.f593m;
    }

    /* renamed from: g */
    public boolean m476g() {
        return this.f592h == 1;
    }

    public int getNetworkType() {
        return this.f592h;
    }

    /* renamed from: h */
    public String mo3972h() {
        return this.f594n;
    }
}
