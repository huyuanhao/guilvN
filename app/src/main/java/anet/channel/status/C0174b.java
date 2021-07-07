package anet.channel.status;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.util.ALog;
import anet.channel.util.C0223c;
import com.netease.nimlib.util.NetworkUtil;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: anet.channel.status.b */
public class C0174b {

    /* renamed from: a */
    public static volatile Context f308a;

    /* renamed from: b */
    public static volatile boolean f309b;

    /* renamed from: c */
    public static volatile NetworkStatusHelper.NetworkStatus f310c = NetworkStatusHelper.NetworkStatus.NONE;

    /* renamed from: d */
    public static volatile String f311d = "unknown";

    /* renamed from: e */
    public static volatile String f312e = "";

    /* renamed from: f */
    public static volatile String f313f = "";

    /* renamed from: g */
    public static volatile String f314g = "";

    /* renamed from: h */
    public static volatile String f315h = "unknown";

    /* renamed from: i */
    public static volatile String f316i = "";

    /* renamed from: j */
    public static volatile Pair<String, Integer> f317j = null;

    /* renamed from: k */
    public static volatile boolean f318k = false;

    /* renamed from: l */
    public static volatile List<InetAddress> f319l = Collections.EMPTY_LIST;

    /* renamed from: m */
    public static String[] f320m = {"net.dns1", "net.dns2", "net.dns3", "net.dns4"};

    /* renamed from: n */
    public static volatile boolean f321n = false;

    /* renamed from: o */
    public static ConnectivityManager f322o = null;

    /* renamed from: p */
    public static TelephonyManager f323p = null;

    /* renamed from: q */
    public static WifiManager f324q = null;

    /* renamed from: r */
    public static SubscriptionManager f325r = null;

    /* renamed from: s */
    public static Method f326s;

    /* renamed from: t */
    public static BroadcastReceiver f327t = new NetworkStatusMonitor$2();

    /* renamed from: a */
    public static void m185a() {
        if (!f321n && f308a != null) {
            synchronized (f308a) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                try {
                    f308a.registerReceiver(f327t, intentFilter);
                } catch (Exception unused) {
                    ALog.m289e("awcn.NetworkStatusMonitor", "registerReceiver failed", null, new Object[0]);
                }
            }
            m189d();
            f321n = true;
        }
    }

    /* renamed from: b */
    public static void m187b() {
        if (f308a != null) {
            f308a.unregisterReceiver(f327t);
        }
    }

    /* renamed from: c */
    public static void m188c() {
        if (Build.VERSION.SDK_INT >= 24) {
            NetworkInfo e = m190e();
            f309b = e != null && e.isConnected();
            f322o.registerDefaultNetworkCallback(new C0175c());
        }
    }

    /* renamed from: d */
    public static void m189d() {
        boolean z;
        NetworkInfo networkInfo;
        ALog.m287d("awcn.NetworkStatusMonitor", "[checkNetworkStatus]", null, new Object[0]);
        NetworkStatusHelper.NetworkStatus networkStatus = f310c;
        String str = f312e;
        String str2 = f313f;
        try {
            networkInfo = m190e();
            z = false;
        } catch (Exception e) {
            try {
                ALog.m288e("awcn.NetworkStatusMonitor", "getNetworkInfo exception", null, e, new Object[0]);
                m186a(NetworkStatusHelper.NetworkStatus.NONE, "unknown");
                networkInfo = null;
                z = true;
            } catch (Exception e2) {
                ALog.m288e("awcn.NetworkStatusMonitor", "checkNetworkStatus", null, e2, new Object[0]);
                return;
            }
        }
        if (!z) {
            if (networkInfo != null) {
                if (networkInfo.isConnected()) {
                    ALog.m290i("awcn.NetworkStatusMonitor", "checkNetworkStatus", null, "info.isConnected", Boolean.valueOf(networkInfo.isConnected()), "info.isAvailable", Boolean.valueOf(networkInfo.isAvailable()));
                    if (networkInfo.getType() == 0) {
                        String subtypeName = networkInfo.getSubtypeName();
                        String str3 = "";
                        if (!TextUtils.isEmpty(subtypeName)) {
                            str3 = subtypeName.replace(" ", str3);
                        }
                        m186a(m183a(networkInfo.getSubtype(), str3), str3);
                        f312e = m184a(networkInfo.getExtraInfo());
                        m192g();
                    } else if (networkInfo.getType() == 1) {
                        m186a(NetworkStatusHelper.NetworkStatus.WIFI, "wifi");
                        WifiInfo h = m193h();
                        if (h != null) {
                            f314g = h.getBSSID();
                            f313f = h.getSSID();
                        }
                        f315h = "wifi";
                        f316i = "wifi";
                        f317j = m194i();
                    } else {
                        m186a(NetworkStatusHelper.NetworkStatus.NONE, "unknown");
                    }
                    f318k = networkInfo.isRoaming();
                    C0223c.m320e();
                }
            }
            m186a(NetworkStatusHelper.NetworkStatus.NO, "no network");
            ALog.m290i("awcn.NetworkStatusMonitor", "checkNetworkStatus", null, "no network");
        }
        if (f310c != networkStatus || !f312e.equalsIgnoreCase(str) || !f313f.equalsIgnoreCase(str2)) {
            if (ALog.isPrintLog(2)) {
                NetworkStatusHelper.printNetworkDetail();
            }
            NetworkStatusHelper.notifyStatusChanged(f310c);
        }
    }

    /* renamed from: e */
    public static NetworkInfo m190e() {
        if (f322o == null) {
            f322o = (ConnectivityManager) f308a.getSystemService("connectivity");
        }
        return f322o.getActiveNetworkInfo();
    }

    /* renamed from: f */
    public static String m191f() {
        try {
            Method method = Class.forName("android.os.SystemProperties").getMethod("get", String.class);
            String[] strArr = f320m;
            int length = strArr.length;
            for (int i = 0; i < length; i++) {
                String str = (String) method.invoke(null, strArr[i]);
                if (!TextUtils.isEmpty(str)) {
                    return str;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: g */
    public static void m192g() {
        try {
            if (f323p == null) {
                f323p = (TelephonyManager) f308a.getSystemService("phone");
            }
            f316i = f323p.getSimOperator();
            if (Build.VERSION.SDK_INT >= 22) {
                if (f325r == null) {
                    SubscriptionManager from = SubscriptionManager.from(f308a);
                    f325r = from;
                    f326s = from.getClass().getDeclaredMethod("getDefaultDataSubscriptionInfo", new Class[0]);
                }
                if (f326s != null) {
                    f315h = ((SubscriptionInfo) f326s.invoke(f325r, new Object[0])).getCarrierName().toString();
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: h */
    public static WifiInfo m193h() {
        try {
            if (f324q == null) {
                f324q = (WifiManager) f308a.getSystemService("wifi");
            }
            return f324q.getConnectionInfo();
        } catch (Throwable th) {
            ALog.m288e("awcn.NetworkStatusMonitor", "getWifiInfo", null, th, new Object[0]);
            return null;
        }
    }

    /* renamed from: i */
    public static Pair<String, Integer> m194i() {
        try {
            String property = System.getProperty("http.proxyHost");
            if (!TextUtils.isEmpty(property)) {
                return Pair.create(property, Integer.valueOf(Integer.parseInt(System.getProperty("http.proxyPort"))));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m186a(NetworkStatusHelper.NetworkStatus networkStatus, String str) {
        f310c = networkStatus;
        f311d = str;
        f312e = "";
        f313f = "";
        f314g = "";
        f317j = null;
        f315h = "";
        f316i = "";
    }

    /* renamed from: a */
    public static NetworkStatusHelper.NetworkStatus m183a(int i, String str) {
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                return NetworkStatusHelper.NetworkStatus.G2;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return NetworkStatusHelper.NetworkStatus.G3;
            case 13:
            case 18:
            case 19:
                return NetworkStatusHelper.NetworkStatus.G4;
            default:
                if (str.equalsIgnoreCase("TD-SCDMA") || str.equalsIgnoreCase("WCDMA") || str.equalsIgnoreCase("CDMA2000")) {
                    return NetworkStatusHelper.NetworkStatus.G3;
                }
                return NetworkStatusHelper.NetworkStatus.NONE;
        }
    }

    /* renamed from: a */
    public static String m184a(String str) {
        if (!TextUtils.isEmpty(str)) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (lowerCase.contains(NetworkUtil.f15258OooO0o)) {
                return NetworkUtil.f15258OooO0o;
            }
            if (lowerCase.contains(NetworkUtil.f15262OooO0oO)) {
                return NetworkUtil.f15262OooO0oO;
            }
            if (lowerCase.contains(NetworkUtil.f15247OooO)) {
                return NetworkUtil.f15247OooO;
            }
            if (lowerCase.contains(NetworkUtil.f15256OooO0Oo)) {
                return NetworkUtil.f15256OooO0Oo;
            }
            if (lowerCase.contains(NetworkUtil.f15260OooO0o0)) {
                return NetworkUtil.f15260OooO0o0;
            }
            if (lowerCase.contains(NetworkUtil.f15264OooO0oo)) {
                return NetworkUtil.f15264OooO0oo;
            }
            if (lowerCase.contains(NetworkUtil.f15266OooOO0)) {
                return NetworkUtil.f15266OooOO0;
            }
            if (lowerCase.contains(NetworkUtil.f15254OooO0OO)) {
                return NetworkUtil.f15254OooO0OO;
            }
        }
        return "unknown";
    }
}
