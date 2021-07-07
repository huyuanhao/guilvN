package anet.channel.strategy.dispatch;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/* renamed from: anet.channel.strategy.dispatch.d */
public final class C0189d implements HostnameVerifier {
    public boolean verify(String str, SSLSession sSLSession) {
        return HttpsURLConnection.getDefaultHostnameVerifier().verify(DispatchConstants.getAmdcServerDomain(), sSLSession);
    }
}
