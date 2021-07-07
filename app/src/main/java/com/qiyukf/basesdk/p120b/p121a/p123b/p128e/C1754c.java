package com.qiyukf.basesdk.p120b.p121a.p123b.p128e;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p120b.p121a.p123b.p125b.C1742b;
import com.qiyukf.basesdk.p120b.p121a.p123b.p126c.AbstractC1745b;
import com.qiyukf.basesdk.p120b.p121a.p123b.p126c.C1746c;
import com.qiyukf.basesdk.p120b.p121a.p123b.p126c.C1749f;
import java.io.File;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import org.json.JSONException;

/* renamed from: com.qiyukf.basesdk.b.a.b.e.c */
public class C1754c {

    /* renamed from: a */
    public static final String f3239a = m3225a(C1754c.class);

    /* renamed from: a */
    public static C1752a m3221a(File file, String str) {
        if (file == null) {
            return null;
        }
        try {
            return new C1752a(file, str);
        } catch (IOException e) {
            if (file != null) {
                file.delete();
            }
            throw e;
        }
    }

    /* renamed from: a */
    public static String m3222a() {
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
            C1709a.m3016c(f3239a, "get ip address socket exception");
            return "";
        }
    }

    /* renamed from: a */
    public static String m3223a(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return "";
        }
        String typeName = activeNetworkInfo.getTypeName();
        if (typeName.equalsIgnoreCase("WIFI")) {
            return "wifi";
        }
        if (!typeName.equalsIgnoreCase("MOBILE")) {
            return "";
        }
        boolean z = false;
        switch (((TelephonyManager) context.getSystemService("phone")).getNetworkType()) {
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
                z = true;
                break;
        }
        return z ? "3g/4g" : "2g";
    }

    /* renamed from: a */
    public static String m3224a(C1746c cVar, String str) {
        if (!(cVar == null || cVar.mo33932b() == null || !cVar.mo33932b().has(str))) {
            try {
                return cVar.mo33932b().getString(str);
            } catch (JSONException e) {
                C1709a.m3015b(f3239a, "get result string parse json failed", e);
            }
        }
        return "";
    }

    /* renamed from: a */
    public static String m3225a(Class cls) {
        return "NOS_" + cls.getSimpleName();
    }

    /* renamed from: a */
    public static void m3226a(Context context, File file, Object obj, C1749f fVar, AbstractC1745b bVar) {
        String d = fVar.mo33961d();
        String e = fVar.mo33962e();
        String f = fVar.mo33963f();
        if (context == null || file == null || obj == null || fVar == null || bVar == null || d == null || e == null || f == null) {
            throw new C1742b("parameters could not be null");
        }
    }
}
