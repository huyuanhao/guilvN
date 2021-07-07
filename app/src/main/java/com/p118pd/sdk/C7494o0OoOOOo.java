package com.p118pd.sdk;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieManager;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.Map;

/* renamed from: com.pd.sdk.o0OoOOOo  reason: case insensitive filesystem */
public final class C7494o0OoOOOo {
    public static final String OooO00o = "msp";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final CookieManager f20331OooO00o = new CookieManager();
    public static final String OooO0O0 = "application/octet-stream;binary/octet-stream";

    /* renamed from: com.pd.sdk.o0OoOOOo$OooO00o */
    public static final class OooO00o {
        public final String OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Map<String, String> f20332OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final byte[] f20333OooO00o;

        public OooO00o(String str, Map<String, String> map, byte[] bArr) {
            this.OooO00o = str;
            this.f20333OooO00o = bArr;
            this.f20332OooO00o = map;
        }

        public String toString() {
            return String.format("<UrlConnectionConfigure url=%s requestBody=%s headers=%s>", this.OooO00o, this.f20333OooO00o, this.f20332OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.o0OoOOOo$OooO0O0 */
    public static final class OooO0O0 {
        public final String OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Map<String, List<String>> f20334OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final byte[] f20335OooO00o;

        public OooO0O0(Map<String, List<String>> map, String str, byte[] bArr) {
            this.f20334OooO00o = map;
            this.OooO00o = str;
            this.f20335OooO00o = bArr;
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0187 */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01d0 A[SYNTHETIC, Splitter:B:105:0x01d0] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x018e A[SYNTHETIC, Splitter:B:67:0x018e] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01ad A[SYNTHETIC, Splitter:B:83:0x01ad] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01b4 A[SYNTHETIC, Splitter:B:87:0x01b4] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01bb A[SYNTHETIC, Splitter:B:91:0x01bb] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p118pd.sdk.C7494o0OoOOOo.OooO0O0 OooO00o(android.content.Context r12, com.p118pd.sdk.C7494o0OoOOOo.OooO00o r13) {
        /*
        // Method dump skipped, instructions count: 470
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7494o0OoOOOo.OooO00o(android.content.Context, com.pd.sdk.o0OoOOOo$OooO00o):com.pd.sdk.o0OoOOOo$OooO0O0");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Proxy m19119OooO00o(Context context) {
        String OooO00o2 = m19118OooO00o(context);
        if (OooO00o2 != null && !OooO00o2.contains(C9040ooOoOO.OooO0Oo)) {
            return null;
        }
        try {
            String property = System.getProperty("https.proxyHost");
            String property2 = System.getProperty("https.proxyPort");
            if (!TextUtils.isEmpty(property)) {
                return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(property, Integer.parseInt(property2)));
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static NetworkInfo OooO00o(Context context) {
        if (context == null) {
            return null;
        }
        try {
            return ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m19118OooO00o(Context context) {
        try {
            NetworkInfo OooO00o2 = OooO00o(context);
            if (OooO00o2 != null && OooO00o2.isAvailable()) {
                if (OooO00o2.getType() == 1) {
                    return "wifi";
                }
                return OooO00o2.getExtraInfo().toLowerCase();
            }
        } catch (Exception unused) {
        }
        return "none";
    }

    public static byte[] OooO00o(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr, 0, 1024);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                byteArrayOutputStream.flush();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }
}
