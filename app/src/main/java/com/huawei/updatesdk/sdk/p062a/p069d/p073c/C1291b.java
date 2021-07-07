package com.huawei.updatesdk.sdk.p062a.p069d.p073c;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* renamed from: com.huawei.updatesdk.sdk.a.d.c.b */
public class C1291b {

    /* renamed from: a */
    public static String f1451a = "NetworkUtil";

    /* renamed from: b */
    public static int f1452b = -1;

    /* renamed from: c */
    public static int f1453c = -1;

    /* renamed from: d */
    public static Proxy f1454d;

    /* renamed from: a */
    public static int m1632a(NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isConnected()) {
            int type = networkInfo.getType();
            if (1 == type || 13 == type) {
                return 1;
            }
            if (type == 0) {
                switch (networkInfo.getSubtype()) {
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
                    case 12:
                    case 14:
                    case 15:
                        return 3;
                    case 13:
                        return 4;
                }
            }
        }
        return 0;
    }

    /* renamed from: a */
    public static Proxy m1633a() {
        return f1454d;
    }

    /* renamed from: a */
    public static void m1634a(int i) {
        f1453c = i;
    }

    /* renamed from: a */
    public static void m1635a(Proxy proxy) {
        f1454d = proxy;
    }

    /* renamed from: a */
    public static boolean m1636a(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        return (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    /* renamed from: a */
    public static boolean m1637a(NetworkInfo networkInfo, Context context) {
        int type = networkInfo.getType();
        boolean b = C1289a.m1622b(context);
        if (type != 0 || !b) {
            return false;
        }
        String host = android.net.Proxy.getHost(context);
        int port = android.net.Proxy.getPort(context);
        Proxy proxy = null;
        if (!(host == null || host.length() <= 0 || port == -1)) {
            proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(host, port));
        }
        m1635a(proxy);
        return true;
    }

    /* renamed from: b */
    public static boolean m1638b(Context context) {
        if (-1 == f1453c) {
            m1639c(context);
        }
        return f1453c == -3;
    }

    /* renamed from: c */
    public static int m1639c(Context context) {
        if (-1 == f1452b) {
            C1278a.m1580a(f1451a, "getPsType() need init");
            if (context != null) {
                m1640d(context);
            }
        }
        return f1452b;
    }

    /* renamed from: d */
    public static void m1640d(Context context) {
        m1634a(0);
        NetworkInfo f = m1642f(context);
        if (f == null) {
            C1278a.m1580a(f1451a, "setPsType() info = null");
            return;
        }
        int a = m1632a(f);
        f1452b = a;
        if (1 != a) {
            m1634a(m1637a(f, context) ? -3 : -2);
        }
    }

    /* renamed from: e */
    public static Proxy m1641e(Context context) {
        if (m1638b(context)) {
            return m1633a();
        }
        return null;
    }

    /* renamed from: f */
    public static NetworkInfo m1642f(Context context) {
        return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
    }
}
