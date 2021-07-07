package com.xiaomi.push;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.netease.nimlib.util.NetworkUtil;
import com.p118pd.sdk.C8932ooOOO0o;
import com.umeng.analytics.pro.C3416b;
import com.umeng.commonsdk.framework.C3517b;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.xiaomi.push.az */
public class C4274az {

    /* renamed from: a */
    public static final Pattern f11398a = Pattern.compile("([^\\s;]+)(.*)");

    /* renamed from: b */
    public static final Pattern f11399b = Pattern.compile("(.*?charset\\s*=[^a-zA-Z0-9]*)([-a-zA-Z0-9]+)(.*)", 2);

    /* renamed from: c */
    public static final Pattern f11400c = Pattern.compile("(\\<\\?xml\\s+.*?encoding\\s*=[^a-zA-Z0-9]*)([-a-zA-Z0-9]+)(.*)", 2);

    /* renamed from: com.xiaomi.push.az$a */
    public static final class C4275a extends FilterInputStream {

        /* renamed from: a */
        public boolean f11401a;

        public C4275a(InputStream inputStream) {
            super(inputStream);
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            int read;
            if (!this.f11401a && (read = super.read(bArr, i, i2)) != -1) {
                return read;
            }
            this.f11401a = true;
            return -1;
        }
    }

    /* renamed from: com.xiaomi.push.az$b */
    public static class C4276b {

        /* renamed from: a */
        public int f11402a;

        /* renamed from: a */
        public Map<String, String> f11403a;

        public String toString() {
            return String.format("resCode = %1$d, headers = %2$s", Integer.valueOf(this.f11402a), this.f11403a.toString());
        }
    }

    /* renamed from: a */
    public static int m11720a(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return -1;
            }
            return activeNetworkInfo.getType();
        } catch (Exception unused) {
            return -1;
        }
    }

    /* renamed from: a */
    public static NetworkInfo m11721a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return null;
            }
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:1:0x0006 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00eb, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ec, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f7, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0120, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0121, code lost:
        com.xiaomi.push.C4693y.m14236a(r1);
        com.xiaomi.push.C4693y.m14236a((java.io.Closeable) r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0128, code lost:
        throw r4;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00eb A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x0006] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.xiaomi.push.C4272ax m11722a(android.content.Context r4, java.lang.String r5, java.lang.String r6, java.util.Map<java.lang.String, java.lang.String> r7, java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 298
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4274az.m11722a(android.content.Context, java.lang.String, java.lang.String, java.util.Map, java.lang.String):com.xiaomi.push.ax");
    }

    /* renamed from: a */
    public static C4272ax m11723a(Context context, String str, Map<String, String> map) {
        return m11722a(context, str, "POST", (Map<String, String>) null, m11731a(map));
    }

    /* renamed from: a */
    public static InputStream m11724a(Context context, URL url, boolean z, String str, String str2) {
        return m11725a(context, url, z, str, str2, null, null);
    }

    /* renamed from: a */
    public static InputStream m11725a(Context context, URL url, boolean z, String str, String str2, Map<String, String> map, C4276b bVar) {
        if (context == null) {
            throw new IllegalArgumentException(C3416b.f8433Q);
        } else if (url != null) {
            URL url2 = !z ? new URL(m11729a(url.toString())) : url;
            try {
                HttpURLConnection.setFollowRedirects(true);
                HttpURLConnection a = m11732a(context, url2);
                a.setConnectTimeout(10000);
                a.setReadTimeout(C3517b.f9006s);
                if (!TextUtils.isEmpty(str)) {
                    a.setRequestProperty("User-Agent", str);
                }
                if (str2 != null) {
                    a.setRequestProperty("Cookie", str2);
                }
                if (map != null) {
                    for (String str3 : map.keySet()) {
                        a.setRequestProperty(str3, map.get(str3));
                    }
                }
                if (bVar != null && (url.getProtocol().equals("http") || url.getProtocol().equals("https"))) {
                    bVar.f11402a = a.getResponseCode();
                    if (bVar.f11403a == null) {
                        bVar.f11403a = new HashMap();
                    }
                    int i = 0;
                    while (true) {
                        String headerFieldKey = a.getHeaderFieldKey(i);
                        String headerField = a.getHeaderField(i);
                        if (headerFieldKey == null && headerField == null) {
                            break;
                        }
                        if (!TextUtils.isEmpty(headerFieldKey)) {
                            if (!TextUtils.isEmpty(headerField)) {
                                bVar.f11403a.put(headerFieldKey, headerField);
                            }
                        }
                        i++;
                    }
                }
                return new C4275a(a.getInputStream());
            } catch (IOException e) {
                throw new IOException("IOException:" + e.getClass().getSimpleName());
            } catch (Throwable th) {
                throw new IOException(th.getMessage());
            }
        } else {
            throw new IllegalArgumentException("url");
        }
    }

    /* renamed from: a */
    public static String m11726a(Context context) {
        NetworkInfo activeNetworkInfo;
        if (m11737d(context)) {
            return "wifi";
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return "";
            }
            return (activeNetworkInfo.getTypeName() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + activeNetworkInfo.getSubtypeName() + Constants.ACCEPT_TIME_SEPARATOR_SERVER + activeNetworkInfo.getExtraInfo()).toLowerCase();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static String m11727a(Context context, URL url) {
        return m11728a(context, url, false, null, "UTF-8", null);
    }

    /* renamed from: a */
    public static String m11728a(Context context, URL url, boolean z, String str, String str2, String str3) {
        Throwable th;
        InputStream inputStream;
        try {
            inputStream = m11724a(context, url, z, str, str3);
            try {
                StringBuilder sb = new StringBuilder(1024);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, str2));
                char[] cArr = new char[4096];
                while (true) {
                    int read = bufferedReader.read(cArr);
                    if (-1 != read) {
                        sb.append(cArr, 0, read);
                    } else {
                        C4693y.m14236a(inputStream);
                        return sb.toString();
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                C4693y.m14236a(inputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            inputStream = null;
            C4693y.m14236a(inputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public static String m11729a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        new String();
        return String.format("%s&key=%s", str, C4284be.m11797a(String.format("%sbe988a6134bc8254465424e5a70ef037", str)));
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:4:0x0010 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* renamed from: a */
    public static String m11730a(String str, Map<String, String> map, File file, String str2) {
        IOException e;
        Throwable th;
        BufferedReader bufferedReader;
        FileInputStream fileInputStream = null;
        if (!file.exists()) {
            return null;
        }
        String name = file.getName();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setReadTimeout(C3517b.f9006s);
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Connection", "Keep-Alive");
            httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data;boundary=*****");
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
                }
            }
            httpURLConnection.setFixedLengthStreamingMode(name.length() + 77 + ((int) file.length()) + str2.length());
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.writeBytes("--*****\r\n");
            dataOutputStream.writeBytes("Content-Disposition: form-data; name=\"" + str2 + "\";filename=\"" + file.getName() + "\"" + "\r\n");
            dataOutputStream.writeBytes("\r\n");
            FileInputStream fileInputStream2 = new FileInputStream((File) file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = fileInputStream2.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    dataOutputStream.write(bArr, 0, read);
                    dataOutputStream.flush();
                }
                dataOutputStream.writeBytes("\r\n");
                dataOutputStream.writeBytes("--");
                dataOutputStream.writeBytes("*****");
                dataOutputStream.writeBytes("--");
                dataOutputStream.writeBytes("\r\n");
                dataOutputStream.flush();
                StringBuffer stringBuffer = new StringBuffer();
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new C4275a(httpURLConnection.getInputStream())));
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine != null) {
                            stringBuffer.append(readLine);
                        } else {
                            String stringBuffer2 = stringBuffer.toString();
                            C4693y.m14236a(fileInputStream2);
                            C4693y.m14236a(bufferedReader2);
                            return stringBuffer2;
                        }
                    } catch (IOException e2) {
                        e = e2;
                        throw new IOException("IOException:" + e.getClass().getSimpleName());
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader2;
                        fileInputStream = fileInputStream2;
                        file = bufferedReader;
                        throw new IOException(th.getMessage());
                    }
                }
            } catch (IOException e3) {
                e = e3;
                throw new IOException("IOException:" + e.getClass().getSimpleName());
            } catch (Throwable th3) {
                th = th3;
                bufferedReader = null;
                fileInputStream = fileInputStream2;
                file = bufferedReader;
                throw new IOException(th.getMessage());
            }
        } catch (IOException e4) {
            e = e4;
            throw new IOException("IOException:" + e.getClass().getSimpleName());
        } catch (Throwable th4) {
            C4693y.m14236a(fileInputStream);
            C4693y.m14236a((Closeable) file);
            throw th4;
        }
    }

    /* renamed from: a */
    public static String m11731a(Map<String, String> map) {
        if (map == null || map.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!(entry.getKey() == null || entry.getValue() == null)) {
                try {
                    stringBuffer.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
                    stringBuffer.append(C8932ooOOO0o.OooO0Oo);
                    stringBuffer.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
                    stringBuffer.append("&");
                } catch (UnsupportedEncodingException e) {
                    String str = "Failed to convert from params map to string: " + e.toString();
                    String str2 = "map: " + map.toString();
                    return null;
                }
            }
        }
        if (stringBuffer.length() > 0) {
            stringBuffer = stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static HttpURLConnection m11732a(Context context, URL url) {
        return (HttpURLConnection) (("http".equals(url.getProtocol()) && m11734a(context)) ? url.openConnection(new Proxy(Proxy.Type.HTTP, new InetSocketAddress("10.0.0.200", 80))) : url.openConnection());
    }

    /* renamed from: a */
    public static URL m11733a(String str) {
        return new URL(str);
    }

    /* renamed from: a */
    public static boolean m11734a(Context context) {
        NetworkInfo activeNetworkInfo;
        if (!"CN".equalsIgnoreCase(((TelephonyManager) context.getSystemService("phone")).getSimCountryIso())) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return false;
            }
            String extraInfo = activeNetworkInfo.getExtraInfo();
            return !TextUtils.isEmpty(extraInfo) && extraInfo.length() >= 3 && extraInfo.contains(NetworkUtil.f15256OooO0Oo);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public static boolean m11735b(Context context) {
        return m11720a(context) >= 0;
    }

    /* renamed from: c */
    public static boolean m11736c(Context context) {
        NetworkInfo networkInfo;
        try {
            networkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (Exception unused) {
            networkInfo = null;
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    /* renamed from: d */
    public static boolean m11737d(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || 1 != activeNetworkInfo.getType()) ? false : true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: e */
    public static boolean m11738e(Context context) {
        return m11739f(context) || m11740g(context) || m11741h(context);
    }

    /* renamed from: f */
    public static boolean m11739f(Context context) {
        NetworkInfo a = m11721a(context);
        return a != null && a.getType() == 0 && 13 == a.getSubtype();
    }

    /* renamed from: g */
    public static boolean m11740g(Context context) {
        NetworkInfo a = m11721a(context);
        if (a == null || a.getType() != 0) {
            return false;
        }
        String subtypeName = a.getSubtypeName();
        if (!"TD-SCDMA".equalsIgnoreCase(subtypeName) && !"CDMA2000".equalsIgnoreCase(subtypeName) && !"WCDMA".equalsIgnoreCase(subtypeName)) {
            switch (a.getSubtype()) {
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                    break;
                case 4:
                case 7:
                case 11:
                case 13:
                default:
                    return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m11741h(Context context) {
        NetworkInfo a = m11721a(context);
        if (a == null || a.getType() != 0) {
            return false;
        }
        int subtype = a.getSubtype();
        return subtype == 1 || subtype == 2 || subtype == 4 || subtype == 7 || subtype == 11;
    }
}
