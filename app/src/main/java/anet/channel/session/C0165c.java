package anet.channel.session;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/* renamed from: anet.channel.session.c */
public final class C0165c implements HostnameVerifier {

    /* renamed from: a */
    public final /* synthetic */ String f286a;

    public C0165c(String str) {
        this.f286a = str;
    }

    public boolean verify(String str, SSLSession sSLSession) {
        return HttpsURLConnection.getDefaultHostnameVerifier().verify(this.f286a, sSLSession);
    }
}
