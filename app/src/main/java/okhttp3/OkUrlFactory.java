package okhttp3;

import com.taobao.accs.common.Constants;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import java.net.URLStreamHandlerFactory;
import okhttp3.internal.URLFilter;
import okhttp3.internal.annotations.EverythingIsNonNull;
import okhttp3.internal.huc.OkHttpURLConnection;
import okhttp3.internal.huc.OkHttpsURLConnection;

@EverythingIsNonNull
public final class OkUrlFactory implements URLStreamHandlerFactory, Cloneable {
    public OkHttpClient client;
    public URLFilter urlFilter;

    public OkUrlFactory(OkHttpClient okHttpClient) {
        this.client = okHttpClient;
    }

    public OkHttpClient client() {
        return this.client;
    }

    public URLStreamHandler createURLStreamHandler(final String str) {
        if (str.equals("http") || str.equals("https")) {
            return new URLStreamHandler() {
                /* class okhttp3.OkUrlFactory.C47571 */

                public int getDefaultPort() {
                    if (str.equals("http")) {
                        return 80;
                    }
                    if (str.equals("https")) {
                        return Constants.PORT;
                    }
                    throw new AssertionError();
                }

                @Override // java.net.URLStreamHandler
                public URLConnection openConnection(URL url) {
                    return OkUrlFactory.this.open(url);
                }

                @Override // java.net.URLStreamHandler
                public URLConnection openConnection(URL url, Proxy proxy) {
                    return OkUrlFactory.this.open(url, proxy);
                }
            };
        }
        return null;
    }

    public HttpURLConnection open(URL url) {
        return open(url, this.client.proxy());
    }

    public OkUrlFactory setClient(OkHttpClient okHttpClient) {
        this.client = okHttpClient;
        return this;
    }

    public void setUrlFilter(URLFilter uRLFilter) {
        this.urlFilter = uRLFilter;
    }

    @Override // java.lang.Object
    public OkUrlFactory clone() {
        return new OkUrlFactory(this.client);
    }

    public HttpURLConnection open(URL url, Proxy proxy) {
        String protocol = url.getProtocol();
        OkHttpClient build = this.client.newBuilder().proxy(proxy).build();
        if (protocol.equals("http")) {
            return new OkHttpURLConnection(url, build, this.urlFilter);
        }
        if (protocol.equals("https")) {
            return new OkHttpsURLConnection(url, build, this.urlFilter);
        }
        throw new IllegalArgumentException("Unexpected protocol: " + protocol);
    }
}
