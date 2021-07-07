package com.huawei.updatesdk.sdk.service.download;

import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Socket;
import javax.net.ssl.HttpsURLConnection;
import okhttp3.internal.http2.Http2Codec;

/* renamed from: com.huawei.updatesdk.sdk.service.download.i */
public class C1323i {
    /* renamed from: a */
    public static Object m1868a(Object obj, String str) throws IllegalAccessException, IllegalArgumentException, NoSuchFieldException {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                declaredField.setAccessible(true);
                return declaredField.get(obj);
            } catch (NoSuchFieldException unused) {
            }
        }
        throw new NoSuchFieldException();
    }

    /* renamed from: a */
    public static String m1869a(HttpURLConnection httpURLConnection) {
        String str;
        StringBuilder sb;
        if (httpURLConnection == null) {
            return "";
        }
        try {
            if (httpURLConnection instanceof HttpsURLConnection) {
                return m1869a((HttpURLConnection) m1868a(httpURLConnection, "delegate"));
            }
            Object a = m1868a(httpURLConnection, "httpEngine");
            if (a == null) {
                C1278a.m1584d("GetServerIpHelper", "HttpURLConnection not connected");
                return "";
            }
            Object a2 = m1868a(a, Http2Codec.CONNECTION);
            return a2 == null ? ((InetSocketAddress) m1868a(m1868a(a, "route"), "inetSocketAddress")).getAddress().getHostAddress() : ((Socket) m1868a(a2, "socket")).getInetAddress().getHostAddress();
        } catch (NoSuchFieldException e) {
            sb = new StringBuilder();
            sb.append("NoSuchFieldException:");
            str = e.getMessage();
            sb.append(str);
            C1278a.m1584d("GetServerIpHelper", sb.toString());
            return "";
        } catch (IllegalArgumentException e2) {
            sb = new StringBuilder();
            sb.append("IllegalArgumentException:");
            str = e2.getMessage();
            sb.append(str);
            C1278a.m1584d("GetServerIpHelper", sb.toString());
            return "";
        } catch (Throwable th) {
            sb = new StringBuilder();
            sb.append("Throwable:");
            str = th.getMessage();
            sb.append(str);
            C1278a.m1584d("GetServerIpHelper", sb.toString());
            return "";
        }
    }
}
