package com.huawei.hms.update.p055b;

import android.content.Context;
import javax.net.SocketFactory;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.huawei.hms.update.b.c */
public final class C1223c {
    /* renamed from: a */
    public static void m1380a(HttpsURLConnection httpsURLConnection, Context context) {
        SocketFactory a = C1226f.m1384a(context);
        if (a instanceof SSLSocketFactory) {
            httpsURLConnection.setSSLSocketFactory((SSLSocketFactory) a);
        }
    }
}
