package anet.channel.util;

import android.net.SSLCertificateSocketFactory;
import android.os.Build;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: anet.channel.util.j */
public class C0230j extends SSLSocketFactory {

    /* renamed from: a */
    public final String f490a = "awcn.TlsSniSocketFactory";

    /* renamed from: b */
    public Method f491b = null;

    /* renamed from: c */
    public String f492c;

    public C0230j(String str) {
        this.f492c = str;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() throws IOException {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i) throws IOException, UnknownHostException {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return null;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return null;
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        if (this.f492c == null) {
            this.f492c = str;
        }
        if (ALog.isPrintLog(1)) {
            ALog.m290i("awcn.TlsSniSocketFactory", "customized createSocket", null, "host", this.f492c);
        }
        InetAddress inetAddress = socket.getInetAddress();
        if (z) {
            socket.close();
        }
        SSLCertificateSocketFactory sSLCertificateSocketFactory = (SSLCertificateSocketFactory) SSLCertificateSocketFactory.getDefault(0);
        SSLSocket sSLSocket = (SSLSocket) sSLCertificateSocketFactory.createSocket(inetAddress, i);
        sSLSocket.setEnabledProtocols(sSLSocket.getSupportedProtocols());
        if (Build.VERSION.SDK_INT >= 17) {
            sSLCertificateSocketFactory.setHostname(sSLSocket, this.f492c);
        } else {
            try {
                if (this.f491b == null) {
                    Method method = sSLSocket.getClass().getMethod("setHostname", String.class);
                    this.f491b = method;
                    method.setAccessible(true);
                }
                this.f491b.invoke(sSLSocket, this.f492c);
            } catch (Exception e) {
                ALog.m291w("awcn.TlsSniSocketFactory", "SNI not useable", null, e, new Object[0]);
            }
        }
        SSLSession session = sSLSocket.getSession();
        if (ALog.isPrintLog(1)) {
            ALog.m287d("awcn.TlsSniSocketFactory", null, null, "SSLSession PeerHost", session.getPeerHost());
        }
        return sSLSocket;
    }

    public String[] getDefaultCipherSuites() {
        return new String[0];
    }

    public String[] getSupportedCipherSuites() {
        return new String[0];
    }
}
