package com.alibaba.sdk.android.httpdns;

import com.alibaba.sdk.android.httpdns.probe.IPProbeItem;
import java.util.List;

/* renamed from: com.alibaba.sdk.android.httpdns.f */
public class C0296f {
    public static String PROTOCOL = "http://";

    /* renamed from: a */
    public static int f641a = 15000;

    /* renamed from: a */
    public static String f642a = null;

    /* renamed from: a */
    public static List<IPProbeItem> f643a = null;

    /* renamed from: b */
    public static String f644b = "80";

    /* renamed from: b */
    public static String[] f645b = {"203.107.1.1"};

    /* renamed from: c */
    public static final String[] f646c = {"203.107.1.97", "203.107.1.100", "httpdns-sc.aliyuncs.com"};

    /* renamed from: d */
    public static final String[] f647d = new String[0];

    /* renamed from: a */
    public static synchronized void m528a(List<IPProbeItem> list) {
        synchronized (C0296f.class) {
            f643a = list;
        }
    }

    /* renamed from: a */
    public static synchronized boolean m529a(String[] strArr) {
        boolean z;
        synchronized (C0296f.class) {
            if (strArr != null) {
                if (strArr.length != 0) {
                    f645b = strArr;
                    z = true;
                }
            }
            z = false;
        }
        return z;
    }

    /* renamed from: c */
    public static synchronized void m530c(String str) {
        synchronized (C0296f.class) {
            f642a = str;
        }
    }

    public static synchronized void setHTTPSRequestEnabled(boolean z) {
        String str;
        synchronized (C0296f.class) {
            if (z) {
                PROTOCOL = "https://";
                str = "443";
            } else {
                PROTOCOL = "http://";
                str = "80";
            }
            f644b = str;
        }
    }

    public static synchronized void setTimeoutInterval(int i) {
        synchronized (C0296f.class) {
            if (i > 0) {
                f641a = i;
            }
        }
    }
}
