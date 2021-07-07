package com.p118pd.sdk;

import com.RNFetchBlob.C0242RNFetchBlob;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import okhttp3.OkHttpClient;

/* renamed from: com.pd.sdk.o0OOOo0O  reason: case insensitive filesystem */
public class C7406o0OOOo0O {

    /* renamed from: com.pd.sdk.o0OOOo0O$OooO00o */
    public static class OooO00o implements X509TrustManager {
        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) throws CertificateException {
        }

        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    /* renamed from: com.pd.sdk.o0OOOo0O$OooO0O0 */
    public static class OooO0O0 implements HostnameVerifier {
        public boolean verify(String str, SSLSession sSLSession) {
            return true;
        }
    }

    public static String OooO00o(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes());
            byte[] digest = instance.digest();
            StringBuffer stringBuffer = new StringBuffer();
            int length = digest.length;
            for (int i = 0; i < length; i++) {
                stringBuffer.append(String.format("%02x", Integer.valueOf(digest[i] & 255)));
            }
            return stringBuffer.toString();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable unused) {
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m18948OooO00o(String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("event", "warn");
        createMap.putString("detail", str);
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) C0242RNFetchBlob.RCTContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(C7402o0OOOOoo.OooO0Oo, createMap);
    }

    public static OkHttpClient.Builder OooO00o(OkHttpClient okHttpClient) {
        try {
            TrustManager[] trustManagerArr = {new OooO00o()};
            SSLContext instance = SSLContext.getInstance("SSL");
            instance.init(null, trustManagerArr, new SecureRandom());
            SSLSocketFactory socketFactory = instance.getSocketFactory();
            OkHttpClient.Builder newBuilder = okHttpClient.newBuilder();
            newBuilder.sslSocketFactory(socketFactory);
            newBuilder.hostnameVerifier(new OooO0O0());
            return newBuilder;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
