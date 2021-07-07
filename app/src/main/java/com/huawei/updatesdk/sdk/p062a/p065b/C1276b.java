package com.huawei.updatesdk.sdk.p062a.p065b;

import android.content.Context;
import android.os.Build;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Locale;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: com.huawei.updatesdk.sdk.a.b.b */
public class C1276b extends SSLSocketFactory {

    /* renamed from: a */
    public static final String[] f1422a = {"TEA", "SHA0", "MD2", "MD4", "RIPEMD", "aNULL", "eNULL", "RC4", "DES", "DESX", "DES40", "RC2", "MD5", "ANON", "NULL", "TLS_EMPTY_RENEGOTIATION_INFO_SCSV", "TLS_RSA", "SSL_RSA", "TLS_DH_anon_WITH_AES_256_CBC_SHA"};

    /* renamed from: b */
    public static volatile C1276b f1423b;

    /* renamed from: c */
    public static String[] f1424c;

    /* renamed from: d */
    public SSLContext f1425d = null;

    /* renamed from: e */
    public Context f1426e;

    public C1276b(Context context) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, KeyManagementException, IllegalArgumentException {
        this.f1426e = context;
        this.f1425d = SSLContext.getInstance("TLS");
        C1277c cVar = new C1277c(this.f1426e);
        this.f1425d.init(null, new X509TrustManager[]{cVar}, null);
    }

    /* renamed from: a */
    public static C1276b m1576a(Context context) throws IOException, NoSuchAlgorithmException, CertificateException, KeyStoreException, IllegalAccessException, KeyManagementException, IllegalArgumentException {
        if (f1423b == null) {
            synchronized (C1276b.class) {
                if (f1423b == null) {
                    f1423b = new C1276b(context);
                }
            }
        }
        return f1423b;
    }

    /* renamed from: a */
    private void m1577a(Socket socket) {
        if (socket != null && (socket instanceof SSLSocket)) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            m1579b(sSLSocket);
            m1578a(sSLSocket);
        }
    }

    /* renamed from: a */
    public static void m1578a(SSLSocket sSLSocket) {
        boolean z;
        if (sSLSocket != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            ArrayList arrayList = new ArrayList();
            for (String str : enabledCipherSuites) {
                String upperCase = str.toUpperCase(Locale.US);
                String[] strArr = f1422a;
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        z = false;
                        break;
                    } else if (upperCase.contains(strArr[i].toUpperCase(Locale.US))) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
                if (!z) {
                    arrayList.add(str);
                }
            }
            String[] strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
            f1424c = strArr2;
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    /* renamed from: b */
    private void m1579b(SSLSocket sSLSocket) {
        if (sSLSocket != null && Build.VERSION.SDK_INT >= 16) {
            sSLSocket.setEnabledProtocols(new String[]{"TLSv1.1", "TLSv1.2"});
        }
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException, UnknownHostException {
        Socket createSocket = this.f1425d.getSocketFactory().createSocket(str, i);
        m1577a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
        return createSocket(str, i);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return createSocket(inetAddress.getHostAddress(), i);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket createSocket = this.f1425d.getSocketFactory().createSocket(socket, str, i, z);
        m1577a(createSocket);
        return createSocket;
    }

    public String[] getDefaultCipherSuites() {
        String[] strArr = f1424c;
        return strArr != null ? (String[]) strArr.clone() : new String[0];
    }

    public String[] getSupportedCipherSuites() {
        return new String[0];
    }
}
