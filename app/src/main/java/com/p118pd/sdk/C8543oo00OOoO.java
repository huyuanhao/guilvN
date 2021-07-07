package com.p118pd.sdk;

import android.os.Build;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import javax.net.SocketFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import org.apache.http.conn.ssl.StrictHostnameVerifier;
import org.apache.http.conn.ssl.X509HostnameVerifier;

/* renamed from: com.pd.sdk.oo00OOoO  reason: case insensitive filesystem */
public final class C8543oo00OOoO extends SSLSocketFactory {
    public static SocketFactory OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final X509HostnameVerifier f21663OooO00o = new StrictHostnameVerifier();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String[] f21664OooO00o = {"3DES", "DES", "MD5", "RC4", "aNULL", "eNULL", "TEA", "SHA0", "MD2", "MD4", "RIPEMD", "DESX", "DES40", "RC2", "ANON", "NULL", "TLS_EMPTY_RENEGOTIATION_INFO_SCSV"};

    /* renamed from: OooO00o  reason: collision with other field name */
    public final SSLContext f21665OooO00o = SSLContext.getInstance("TLSv1.2");

    public C8543oo00OOoO() {
        C8547oo00Oo00 oo00oo00 = new C8547oo00Oo00();
        this.f21665OooO00o.init(null, new X509TrustManager[]{oo00oo00}, null);
    }

    public static SocketFactory OooO00o() {
        return OooO0O0();
    }

    private void OooO00o(Socket socket) {
        if (socket instanceof SSLSocket) {
            SSLSocket sSLSocket = (SSLSocket) socket;
            OooO00o(sSLSocket);
            OooO0O0(sSLSocket);
        }
    }

    private void OooO00o(SSLSocket sSLSocket) {
        if (sSLSocket != null && Build.VERSION.SDK_INT >= 16) {
            sSLSocket.setEnabledProtocols(new String[]{"TLSv1.2"});
        }
    }

    public static boolean OooO00o(String str) {
        for (String str2 : f21664OooO00o) {
            if (str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public static synchronized SocketFactory OooO0O0() {
        String str;
        String str2;
        synchronized (C8543oo00OOoO.class) {
            try {
                if (OooO00o == null) {
                    OooO00o = new C8543oo00OOoO();
                }
                return OooO00o;
            } catch (KeyManagementException unused) {
                str = "Factory";
                str2 = "getLocalInstanceLock(): Failed to new SSLSocketFactory instance,Key Manage!";
                AbstractC8536oo00OO0O.OooO0OO(str, str2);
                return null;
            } catch (NoSuchAlgorithmException unused2) {
                str = "Factory";
                str2 = "getLocalInstanceLock(): Failed to new SSLSocketFactory instance,Algorithm Exception!";
                AbstractC8536oo00OO0O.OooO0OO(str, str2);
                return null;
            } catch (KeyStoreException unused3) {
                str = "Factory";
                str2 = "getLocalInstanceLock(): Failed to new SSLSocketFactory instance,Key Store!";
                AbstractC8536oo00OO0O.OooO0OO(str, str2);
                return null;
            } catch (GeneralSecurityException unused4) {
                str = "Factory";
                str2 = "getLocalInstanceLock(): GeneralSecurityException: Failed to new SSLSocketFactory instance";
                AbstractC8536oo00OO0O.OooO0OO(str, str2);
                return null;
            } catch (IOException unused5) {
                str = "Factory";
                str2 = "getLocalInstanceLock(): Failed to new SSLSocketFactory instance,IO!";
                AbstractC8536oo00OO0O.OooO0OO(str, str2);
                return null;
            }
        }
    }

    public static void OooO0O0(SSLSocket sSLSocket) {
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        if (!(enabledCipherSuites == null || enabledCipherSuites.length == 0)) {
            ArrayList arrayList = new ArrayList();
            for (String str : enabledCipherSuites) {
                if (!OooO00o(str)) {
                    arrayList.add(str);
                }
            }
            sSLSocket.setEnabledCipherSuites((String[]) arrayList.toArray(new String[arrayList.size()]));
        }
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) {
        Socket createSocket = this.f21665OooO00o.getSocketFactory().createSocket(str, i);
        OooO00o(createSocket);
        return createSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) {
        return createSocket(str, i);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) {
        return createSocket(inetAddress.getHostAddress(), i);
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) {
        return createSocket(inetAddress.getHostAddress(), i);
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) {
        Socket createSocket = this.f21665OooO00o.getSocketFactory().createSocket(socket, str, i, z);
        OooO00o(createSocket);
        return createSocket;
    }

    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    public String[] getSupportedCipherSuites() {
        return new String[0];
    }
}
