package anet.channel.util;

import anet.channel.strategy.utils.C0209c;
import com.xiaomi.mipush.sdk.Constants;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpUrl {
    public String host;
    public volatile boolean isSchemeLocked = false;
    public String path;
    public int port;
    public String scheme;
    public String simpleUrl;
    public String url;

    public HttpUrl() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00af, code lost:
        if (r2 <= 65535) goto L_0x00b2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x010d  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static anet.channel.util.HttpUrl parse(java.lang.String r15) {
        /*
        // Method dump skipped, instructions count: 315
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.util.HttpUrl.parse(java.lang.String):anet.channel.util.HttpUrl");
    }

    public boolean containsNonDefaultPort() {
        return this.port != 0 && (("http".equals(this.scheme) && this.port != 80) || ("https".equals(this.scheme) && this.port != 443));
    }

    public void downgradeSchemeAndLock() {
        this.isSchemeLocked = true;
        if (!"http".equals(this.scheme)) {
            this.scheme = "http";
            String str = this.url;
            this.url = StringUtils.concatString("http", Constants.COLON_SEPARATOR, str.substring(str.indexOf("//")));
        }
    }

    public int getPort() {
        return this.port;
    }

    public String host() {
        return this.host;
    }

    public boolean isSchemeLocked() {
        return this.isSchemeLocked;
    }

    public void lockScheme() {
        this.isSchemeLocked = true;
    }

    public String path() {
        return this.path;
    }

    public void replaceIpAndPort(String str, int i) {
        if (str != null) {
            int indexOf = this.url.indexOf("//") + 2;
            while (indexOf < this.url.length() && this.url.charAt(indexOf) != '/') {
                indexOf++;
            }
            boolean b = C0209c.m282b(str);
            StringBuilder sb = new StringBuilder(this.url.length() + str.length());
            sb.append(this.scheme);
            sb.append(HttpConstant.SCHEME_SPLIT);
            if (b) {
                sb.append('[');
            }
            sb.append(str);
            if (b) {
                sb.append(']');
            }
            if (i != 0) {
                sb.append(':');
                sb.append(i);
            } else if (this.port != 0) {
                sb.append(':');
                sb.append(this.port);
            }
            sb.append(this.url.substring(indexOf));
            this.url = sb.toString();
        }
    }

    public String scheme() {
        return this.scheme;
    }

    public void setScheme(String str) {
        if (!this.isSchemeLocked && !str.equalsIgnoreCase(this.scheme)) {
            this.scheme = str;
            String str2 = this.url;
            String concatString = StringUtils.concatString(str, Constants.COLON_SEPARATOR, str2.substring(str2.indexOf("//")));
            this.url = concatString;
            this.simpleUrl = StringUtils.concatString(str, Constants.COLON_SEPARATOR, this.simpleUrl.substring(concatString.indexOf("//")));
        }
    }

    public String simpleUrlString() {
        return this.simpleUrl;
    }

    public String toString() {
        return this.url;
    }

    public URL toURL() {
        try {
            return new URL(this.url);
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    public String urlString() {
        return this.url;
    }

    public HttpUrl(HttpUrl httpUrl) {
        this.scheme = httpUrl.scheme;
        this.host = httpUrl.host;
        this.path = httpUrl.path;
        this.url = httpUrl.url;
        this.simpleUrl = httpUrl.simpleUrl;
        this.isSchemeLocked = httpUrl.isSchemeLocked;
    }
}
