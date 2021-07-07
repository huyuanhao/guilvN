package com.huawei.hms.update.p055b;

import android.content.Context;
import com.huawei.hms.support.log.C1202a;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: com.huawei.hms.update.b.f */
public final class C1226f extends SSLSocketFactory {

    /* renamed from: a */
    public static final Object f1359a = new Object();

    /* renamed from: b */
    public static SocketFactory f1360b;

    /* renamed from: c */
    public final SSLContext f1361c = SSLContext.getInstance("TLSv1.2");

    /* renamed from: d */
    public Context f1362d;

    public C1226f(Context context) throws NoSuchAlgorithmException, KeyManagementException, CertificateException, KeyStoreException, IOException {
        this.f1362d = context;
        C1225e eVar = new C1225e(this.f1362d);
        this.f1361c.init(null, new X509TrustManager[]{eVar}, null);
    }

    /* renamed from: a */
    public static SocketFactory m1384a(Context context) {
        Exception e;
        synchronized (f1359a) {
            try {
                if (f1360b == null) {
                    f1360b = new C1226f(context);
                }
                return f1360b;
            } catch (KeyManagementException e2) {
                e = e2;
                C1202a.m1320d("TLSSocketFactory", "Failed to new TLSSocketFactory instance." + e.getMessage());
                return SSLSocketFactory.getDefault();
            } catch (NoSuchAlgorithmException e3) {
                e = e3;
                C1202a.m1320d("TLSSocketFactory", "Failed to new TLSSocketFactory instance." + e.getMessage());
                return SSLSocketFactory.getDefault();
            } catch (IOException e4) {
                e = e4;
                C1202a.m1320d("TLSSocketFactory", "Failed to new TLSSocketFactory instance." + e.getMessage());
                return SSLSocketFactory.getDefault();
            } catch (CertificateException e5) {
                e = e5;
                C1202a.m1320d("TLSSocketFactory", "Failed to new TLSSocketFactory instance." + e.getMessage());
                return SSLSocketFactory.getDefault();
            } catch (KeyStoreException e6) {
                e = e6;
                C1202a.m1320d("TLSSocketFactory", "Failed to new TLSSocketFactory instance." + e.getMessage());
                return SSLSocketFactory.getDefault();
            } catch (IllegalArgumentException e7) {
                e = e7;
                C1202a.m1320d("TLSSocketFactory", "Failed to new TLSSocketFactory instance." + e.getMessage());
                return SSLSocketFactory.getDefault();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    private void m1388b(SSLSocket sSLSocket) {
        sSLSocket.setEnabledProtocols(new String[]{"TLSv1.2"});
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        Socket createSocket = this.f1361c.getSocketFactory().createSocket(socket, str, i, z);
        m1385a(createSocket);
        return createSocket;
    }

    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    public String[] getSupportedCipherSuites() {
        return new String[0];
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException {
        Socket createSocket = this.f1361c.getSocketFactory().createSocket(str, i);
        m1385a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        Socket createSocket = this.f1361c.getSocketFactory().createSocket(str, i, inetAddress, i2);
        m1385a(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        Socket createSocket = this.f1361c.getSocketFactory().createSocket(inetAddress, i);
        m1385a(createSocket);
        return createSocket;
    }

    /* renamed from: a */
    public static void m1386a(SSLSocket sSLSocket) {
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        if (!(enabledCipherSuites == null || enabledCipherSuites.length == 0)) {
            ArrayList arrayList = new ArrayList();
            for (String str : enabledCipherSuites) {
                if (!m1387a(str)) {
                    arrayList.add(str);
                }
            }
            sSLSocket.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
        }
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        Socket createSocket = this.f1361c.getSocketFactory().createSocket(inetAddress, i, inetAddress2, i2);
        m1385a(createSocket);
        return createSocket;
    }

    /* renamed from: a */
    public static boolean m1387a(String str) {
        return str.contains("RC2") || str.contains("RC4") || str.contains("DES") || str.contains("MD2") || str.contains("MD4") || str.contains("MD5") || str.contains("ANON") || str.contains("NULL") || str.contains("SKIPJACK") || str.contains("SHA1") || str.contains("TEA") || str.contains("SHA0") || str.contains("RIPEMD") || str.contains("TLS_EMPTY_RENEGOTIATION_INFO_SCSV") || str.contains("aNULL") || str.contains("eNULL") || str.contains("TLS_DH_anon_WITH_AES_256_CBC_SHA") || str.contains("DES40") || str.contains("DESX") || str.contains("TLS_RSA") || str.contains("SSL_RSA");
    }

    /* renamed from: a */
    private void m1385a(Socket socket) {
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            m1388b(sSLSocket);
            m1386a(sSLSocket);
        }
    }
}
