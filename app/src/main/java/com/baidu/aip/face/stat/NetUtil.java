package com.baidu.aip.face.stat;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.json.JSONException;

public class NetUtil {
    public static final HostnameVerifier DO_NOT_VERIFY = new HostnameVerifier() {
        /* class com.baidu.aip.face.stat.NetUtil.C04122 */

        public boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    };
    public static final String TAG = "NetUtil";

    public static abstract class RequestAdapter<T> {
        public static final int CONNECT_TIMEOUT = 5000;
        public static final int READ_TIMEOUT = 5000;
        public static final String REQUEST_METHOD = "POST";
        public static final int RESPONSE_STATUS_ERROR_IO = 2;
        public static final int RESPONSE_STATUS_ERROR_PARSE_JSON = 3;
        public static final int RESPONSE_STATUS_ERROR_RESPONSE_CODE = 4;
        public static final int RESPONSE_STATUS_ERROR_TIMEOUT = 1;
        public static final int RESPONSE_STATUS_ERROR_UNKNOWN = 5;
        public static final int RESPONSE_STATUS_NORMAL = 0;
        public static final int RETRY_COUNT = 2;

        public int getConnectTimeout() {
            return 5000;
        }

        public int getReadTimeout() {
            return 5000;
        }

        public String getRequestMethod() {
            return "POST";
        }

        public abstract String getRequestString();

        public int getRetryCount() {
            return 0;
        }

        public abstract String getURL();

        public abstract void parseResponse(InputStream inputStream) throws IOException, JSONException;
    }

    public NetUtil() {
        throw new RuntimeException("This class instance can not be created.");
    }

    @TargetApi(23)
    public static boolean isConnected(Context context) {
        if (context == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT <= 23) {
            return true;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork()).hasCapability(16);
    }

    public static void trustAllHosts() {
        TrustManager[] trustManagerArr = {new X509TrustManager() {
            /* class com.baidu.aip.face.stat.NetUtil.C04111 */

            @Override // javax.net.ssl.X509TrustManager
            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
            }

            public X509Certificate[] getAcceptedIssuers() {
                return new X509Certificate[0];
            }
        }};
        try {
            SSLContext instance = SSLContext.getInstance("TLS");
            instance.init(null, trustManagerArr, new SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(instance.getSocketFactory());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008c, code lost:
        if (r6 == null) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b0, code lost:
        if (r6 != null) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c7, code lost:
        if (r6 != null) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00de, code lost:
        if (r6 != null) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e0, code lost:
        r6.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00e3, code lost:
        r1 = r6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a4 A[SYNTHETIC, Splitter:B:28:0x00a4] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ab A[SYNTHETIC, Splitter:B:32:0x00ab] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00bb A[SYNTHETIC, Splitter:B:40:0x00bb] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c2 A[SYNTHETIC, Splitter:B:44:0x00c2] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d2 A[SYNTHETIC, Splitter:B:52:0x00d2] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d9 A[SYNTHETIC, Splitter:B:56:0x00d9] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00ed A[SYNTHETIC, Splitter:B:66:0x00ed] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00f4 A[SYNTHETIC, Splitter:B:70:0x00f4] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x010f A[SYNTHETIC, Splitter:B:83:0x010f] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0116 A[SYNTHETIC, Splitter:B:87:0x0116] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x010a A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> void uploadData(com.baidu.aip.face.stat.NetUtil.RequestAdapter<T> r9) {
        /*
        // Method dump skipped, instructions count: 291
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.aip.face.stat.NetUtil.uploadData(com.baidu.aip.face.stat.NetUtil$RequestAdapter):void");
    }
}
