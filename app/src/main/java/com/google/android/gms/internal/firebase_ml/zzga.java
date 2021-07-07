package com.google.android.gms.internal.firebase_ml;

import com.umeng.message.util.HttpRequest;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.Arrays;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

public final class zzga extends zzfo {
    public static final String[] zzvf;
    public final HostnameVerifier hostnameVerifier;
    public final zzfv zzwd;
    public final SSLSocketFactory zzwe;

    static {
        String[] strArr = {"DELETE", "GET", "HEAD", "OPTIONS", "POST", "PUT", HttpRequest.METHOD_TRACE};
        zzvf = strArr;
        Arrays.sort(strArr);
    }

    public zzga() {
        this(null, null, null);
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzfo
    public final boolean zzaj(String str) {
        return Arrays.binarySearch(zzvf, str) >= 0;
    }

    @Override // com.google.android.gms.internal.firebase_ml.zzfo
    public final /* synthetic */ zzfp zzc(String str, String str2) throws IOException {
        Object[] objArr = {str};
        if (zzaj(str)) {
            HttpURLConnection zza = this.zzwd.zza(new URL(str2));
            zza.setRequestMethod(str);
            boolean z = zza instanceof HttpsURLConnection;
            return new zzfx(zza);
        }
        throw new IllegalArgumentException(zzla.zzb("HTTP method %s not supported", objArr));
    }

    public zzga(zzfv zzfv, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier2) {
        zzfw zzfw;
        if (System.getProperty("com.google.api.client.should_use_proxy") != null) {
            zzfw = new zzfw(new Proxy(Proxy.Type.HTTP, new InetSocketAddress(System.getProperty("https.proxyHost"), Integer.parseInt(System.getProperty("https.proxyPort")))));
        } else {
            zzfw = new zzfw();
        }
        this.zzwd = zzfw;
        this.zzwe = null;
        this.hostnameVerifier = null;
    }
}
