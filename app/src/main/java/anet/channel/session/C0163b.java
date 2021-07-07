package anet.channel.session;

import android.os.Build;
import android.util.Pair;
import anet.channel.RequestCb;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.request.Request;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.util.ALog;
import anet.channel.util.C0218b;
import anet.channel.util.C0227g;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpConstant;
import anet.channel.util.StringUtils;
import com.netease.nimlib.util.NetworkUtil;
import com.taobao.accs.common.Constants;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* renamed from: anet.channel.session.b */
public class C0163b {

    /* renamed from: anet.channel.session.b$a */
    public static class C0164a {

        /* renamed from: a */
        public int f281a;

        /* renamed from: b */
        public byte[] f282b;

        /* renamed from: c */
        public Map<String, List<String>> f283c;

        /* renamed from: d */
        public int f284d;

        /* renamed from: e */
        public boolean f285e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x018e, code lost:
        r8.f219a.contentEncoding = anet.channel.util.HttpHelper.getSingleHeaderFieldByKey(r7.f283c, "Content-Encoding");
        r8.f219a.contentType = anet.channel.util.HttpHelper.getSingleHeaderFieldByKey(r7.f283c, "Content-Type");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01ae, code lost:
        if ("HEAD".equals(r8.getMethod()) != false) goto L_0x0205;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01b4, code lost:
        if (r7.f281a == 304) goto L_0x0205;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01ba, code lost:
        if (r7.f281a == 204) goto L_0x0205;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x01c0, code lost:
        if (r7.f281a < 100) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01c6, code lost:
        if (r7.f281a >= 200) goto L_0x01c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01c9, code lost:
        r9 = anet.channel.util.HttpHelper.parseContentLength(r7.f283c);
        r7.f284d = r9;
        r8.f219a.contentLength = (long) r9;
        r9 = "gzip".equalsIgnoreCase(r8.f219a.contentEncoding);
        r7.f285e = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x01e2, code lost:
        if (r9 == false) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01e4, code lost:
        r7.f283c.remove("Content-Encoding");
        r7.f283c.remove("Content-Length");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01f0, code lost:
        if (r21 == null) goto L_0x01f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01f2, code lost:
        r21.onResponseCode(r7.f281a, r7.f283c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01f9, code lost:
        r8.f219a.rspStart = java.lang.System.currentTimeMillis();
        m176a(r10, r8, r7, r21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0205, code lost:
        if (r21 == null) goto L_0x020e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0207, code lost:
        r21.onResponseCode(r7.f281a, r7.f283c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x020e, code lost:
        r8.f219a.rspStart = java.lang.System.currentTimeMillis();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0216, code lost:
        r8.f219a.firstDataTime = r8.f219a.rspStart - r8.f219a.sendEnd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x022d, code lost:
        if (r8.f219a.isDone.get() != false) goto L_0x0246;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x022f, code lost:
        r8.f219a.ret = 1;
        r8.f219a.statusCode = r7.f281a;
        r8.f219a.msg = "SUCCESS";
        r8.f219a.rspEnd = java.lang.System.currentTimeMillis();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0246, code lost:
        if (r21 == null) goto L_0x024f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0248, code lost:
        r21.onFinish(r7.f281a, "SUCCESS", r8.f219a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x024f, code lost:
        if (r10 == null) goto L_0x0478;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        r10.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0256, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0257, code lost:
        anet.channel.util.ALog.m288e("awcn.HttpConnector", "http disconnect", null, r0, new java.lang.Object[0]);
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02be A[Catch:{ all -> 0x02b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x02ca A[Catch:{ all -> 0x02b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02d9 A[Catch:{ all -> 0x02b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02ec A[SYNTHETIC, Splitter:B:123:0x02ec] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0321 A[SYNTHETIC, Splitter:B:132:0x0321] */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0347 A[SYNTHETIC, Splitter:B:141:0x0347] */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0382 A[SYNTHETIC, Splitter:B:150:0x0382] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x03be A[SYNTHETIC, Splitter:B:159:0x03be] */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x03e7 A[SYNTHETIC, Splitter:B:168:0x03e7] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0410 A[SYNTHETIC, Splitter:B:177:0x0410] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0437 A[SYNTHETIC, Splitter:B:186:0x0437] */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x046b A[SYNTHETIC, Splitter:B:195:0x046b] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static anet.channel.session.C0163b.C0164a m173a(anet.channel.request.Request r20, anet.channel.RequestCb r21) {
        /*
        // Method dump skipped, instructions count: 1179
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.session.C0163b.m173a(anet.channel.request.Request, anet.channel.RequestCb):anet.channel.session.b$a");
    }

    /* renamed from: a */
    public static void m175a(Request request, C0164a aVar, RequestCb requestCb, int i, Throwable th) {
        String errMsg = ErrorConstant.getErrMsg(i);
        ALog.m289e("awcn.HttpConnector", "onException", request.getSeq(), Constants.KEY_ERROR_CODE, Integer.valueOf(i), "errMsg", errMsg, "url", request.getUrlString(), "host", request.getHost());
        if (aVar != null) {
            aVar.f281a = i;
        }
        if (!request.f219a.isDone.get()) {
            request.f219a.statusCode = i;
            request.f219a.msg = errMsg;
            request.f219a.rspEnd = System.currentTimeMillis();
            if (i != -204) {
                AppMonitor.getInstance().commitStat(new ExceptionStatistic(i, errMsg, request.f219a, th));
            }
        }
        if (requestCb != null) {
            requestCb.onFinish(i, errMsg, request.f219a);
        }
    }

    /* renamed from: a */
    public static HttpURLConnection m174a(Request request) throws IOException {
        HttpURLConnection httpURLConnection;
        Pair<String, Integer> wifiProxy = NetworkStatusHelper.getWifiProxy();
        Proxy proxy = wifiProxy != null ? new Proxy(Proxy.Type.HTTP, new InetSocketAddress((String) wifiProxy.first, ((Integer) wifiProxy.second).intValue())) : null;
        C0227g a = C0227g.m326a();
        if (NetworkStatusHelper.getStatus().isMobile() && a != null) {
            proxy = a.mo3775b();
        }
        URL url = request.getUrl();
        if (proxy != null) {
            httpURLConnection = (HttpURLConnection) url.openConnection(proxy);
        } else {
            httpURLConnection = (HttpURLConnection) url.openConnection();
        }
        httpURLConnection.setConnectTimeout(request.getConnectTimeout());
        httpURLConnection.setReadTimeout(request.getReadTimeout());
        httpURLConnection.setRequestMethod(request.getMethod());
        if (request.containsBody()) {
            httpURLConnection.setDoOutput(true);
        }
        Map<String, String> headers = request.getHeaders();
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
        }
        String str = headers.get(HttpConstant.HOST);
        if (str == null) {
            str = request.getHost();
        }
        String concatString = request.getHttpUrl().containsNonDefaultPort() ? StringUtils.concatString(str, com.xiaomi.mipush.sdk.Constants.COLON_SEPARATOR, String.valueOf(request.getHttpUrl().getPort())) : str;
        httpURLConnection.setRequestProperty(HttpConstant.HOST, concatString);
        if (NetworkStatusHelper.getApn().equals(NetworkUtil.f15258OooO0o)) {
            httpURLConnection.setRequestProperty(HttpConstant.X_ONLINE_HOST, concatString);
        }
        if (!headers.containsKey("Accept-Encoding")) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        }
        if (a != null) {
            httpURLConnection.setRequestProperty("Authorization", a.mo3776c());
        }
        if (url.getProtocol().equalsIgnoreCase("https")) {
            m177a(httpURLConnection, request, str);
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        return httpURLConnection;
    }

    /* renamed from: a */
    public static void m177a(HttpURLConnection httpURLConnection, Request request, String str) {
        if (Integer.parseInt(Build.VERSION.SDK) < 8) {
            ALog.m289e("awcn.HttpConnector", "supportHttps", "[supportHttps]Froyo 以下版本不支持https", new Object[0]);
            return;
        }
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
        if (request.getSslSocketFactory() != null) {
            httpsURLConnection.setSSLSocketFactory(request.getSslSocketFactory());
        } else if (C0218b.m306a() != null) {
            httpsURLConnection.setSSLSocketFactory(C0218b.m306a());
        }
        if (request.getHostnameVerifier() != null) {
            httpsURLConnection.setHostnameVerifier(request.getHostnameVerifier());
        } else if (C0218b.m309b() != null) {
            httpsURLConnection.setHostnameVerifier(C0218b.m309b());
        } else {
            httpsURLConnection.setHostnameVerifier(new C0165c(str));
        }
    }

    /* renamed from: a */
    public static int m172a(HttpURLConnection httpURLConnection, Request request) {
        int i = 0;
        if (request.containsBody()) {
            OutputStream outputStream = null;
            try {
                outputStream = httpURLConnection.getOutputStream();
                int postBody = request.postBody(outputStream);
                if (outputStream != null) {
                    try {
                        outputStream.flush();
                        outputStream.close();
                    } catch (IOException e) {
                        ALog.m288e("awcn.HttpConnector", "postData", request.getSeq(), e, new Object[0]);
                    }
                }
                i = postBody;
            } catch (Exception e2) {
                ALog.m288e("awcn.HttpConnector", "postData error", request.getSeq(), e2, new Object[0]);
                if (outputStream != null) {
                    try {
                        outputStream.flush();
                        outputStream.close();
                    } catch (IOException e3) {
                        ALog.m288e("awcn.HttpConnector", "postData", request.getSeq(), e3, new Object[0]);
                    }
                }
            } catch (Throwable th) {
                if (outputStream != null) {
                    try {
                        outputStream.flush();
                        outputStream.close();
                    } catch (IOException e4) {
                        ALog.m288e("awcn.HttpConnector", "postData", request.getSeq(), e4, new Object[0]);
                    }
                }
                throw th;
            }
            long j = (long) i;
            request.f219a.reqBodyInflateSize = j;
            request.f219a.reqBodyDeflateSize = j;
            request.f219a.sendDataSize = j;
        }
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f0 A[SYNTHETIC, Splitter:B:57:0x00f0] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m176a(java.net.HttpURLConnection r12, anet.channel.request.Request r13, anet.channel.session.C0163b.C0164a r14, anet.channel.RequestCb r15) throws java.io.IOException, java.util.concurrent.CancellationException {
        /*
        // Method dump skipped, instructions count: 246
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.session.C0163b.m176a(java.net.HttpURLConnection, anet.channel.request.Request, anet.channel.session.b$a, anet.channel.RequestCb):void");
    }
}
