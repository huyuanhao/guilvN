package anet.channel.session;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.Config;
import anet.channel.DataFrameCb;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.IAuth;
import anet.channel.RequestCb;
import anet.channel.Session;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.bytes.ByteArray;
import anet.channel.bytes.C0116a;
import anet.channel.entity.C0131a;
import anet.channel.entity.C0132b;
import anet.channel.heartbeat.HeartbeatManager;
import anet.channel.heartbeat.IHeartbeat;
import anet.channel.heartbeat.RunnableC0144b;
import anet.channel.request.C0156c;
import anet.channel.request.Cancelable;
import anet.channel.request.Request;
import anet.channel.security.ISecurity;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.statist.RequestStatistic;
import anet.channel.statist.SessionStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.ConnEvent;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.utils.C0209c;
import anet.channel.util.ALog;
import anet.channel.util.C0223c;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpHelper;
import anet.channel.util.Utils;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.BaseMonitor;
import com.umeng.analytics.pro.C3416b;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.android.spdy.RequestPriority;
import org.android.spdy.SessionCb;
import org.android.spdy.SessionInfo;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdyByteArray;
import org.android.spdy.SpdyDataProvider;
import org.android.spdy.SpdyErrorException;
import org.android.spdy.SpdyRequest;
import org.android.spdy.SpdySession;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;
import org.android.spdy.SuperviseConnectInfo;
import org.android.spdy.SuperviseData;
import org.json.JSONException;
import org.json.JSONObject;

public class TnetSpdySession extends Session implements SessionCb {

    /* renamed from: A */
    public long f264A = 0;

    /* renamed from: B */
    public int f265B = -1;

    /* renamed from: C */
    public DataFrameCb f266C = null;

    /* renamed from: D */
    public IHeartbeat f267D = null;

    /* renamed from: E */
    public IAuth f268E = null;

    /* renamed from: F */
    public String f269F = null;

    /* renamed from: G */
    public ISecurity f270G = null;

    /* renamed from: H */
    public int f271H = 0;

    /* renamed from: w */
    public SpdyAgent f272w;

    /* renamed from: x */
    public SpdySession f273x;

    /* renamed from: y */
    public volatile boolean f274y = false;

    /* renamed from: z */
    public long f275z;

    /* renamed from: anet.channel.session.TnetSpdySession$a */
    public class C0161a extends C0162a {

        /* renamed from: b */
        public Request f277b;

        /* renamed from: c */
        public RequestCb f278c;

        /* renamed from: d */
        public int f279d = 0;

        /* renamed from: e */
        public long f280e = 0;

        public C0161a(Request request, RequestCb requestCb) {
            this.f277b = request;
            this.f278c = requestCb;
        }

        /* renamed from: a */
        private void m171a(SuperviseData superviseData, int i, String str) {
            try {
                this.f277b.f219a.rspEnd = System.currentTimeMillis();
                if (!this.f277b.f219a.isDone.get()) {
                    if (i > 0) {
                        this.f277b.f219a.ret = 1;
                    }
                    this.f277b.f219a.statusCode = i;
                    this.f277b.f219a.msg = str;
                    if (superviseData != null) {
                        this.f277b.f219a.rspEnd = superviseData.responseEnd;
                        this.f277b.f219a.sendBeforeTime = superviseData.sendStart - superviseData.requestStart;
                        this.f277b.f219a.sendDataTime = superviseData.sendEnd - this.f277b.f219a.sendStart;
                        this.f277b.f219a.firstDataTime = superviseData.responseStart - superviseData.sendEnd;
                        this.f277b.f219a.recDataTime = superviseData.responseEnd - superviseData.responseStart;
                        this.f277b.f219a.sendDataSize = (long) (superviseData.bodySize + superviseData.compressSize);
                        this.f277b.f219a.recDataSize = this.f280e + ((long) superviseData.recvUncompressSize);
                        this.f277b.f219a.reqHeadInflateSize = (long) superviseData.uncompressSize;
                        this.f277b.f219a.reqHeadDeflateSize = (long) superviseData.compressSize;
                        this.f277b.f219a.reqBodyInflateSize = (long) superviseData.bodySize;
                        this.f277b.f219a.reqBodyDeflateSize = (long) superviseData.bodySize;
                        this.f277b.f219a.rspHeadDeflateSize = (long) superviseData.recvCompressSize;
                        this.f277b.f219a.rspHeadInflateSize = (long) superviseData.recvUncompressSize;
                        this.f277b.f219a.rspBodyDeflateSize = (long) superviseData.recvBodySize;
                        this.f277b.f219a.rspBodyInflateSize = this.f280e;
                        if (this.f277b.f219a.contentLength == 0) {
                            this.f277b.f219a.contentLength = (long) superviseData.originContentLength;
                        }
                        TnetSpdySession.this.f54q.recvSizeCount += (long) (superviseData.recvBodySize + superviseData.recvCompressSize);
                        TnetSpdySession.this.f54q.sendSizeCount += (long) (superviseData.bodySize + superviseData.compressSize);
                    }
                }
            } catch (Exception unused) {
            }
        }

        @Override // org.android.spdy.Spdycb, anet.channel.session.C0162a
        public void spdyDataChunkRecvCB(SpdySession spdySession, boolean z, long j, SpdyByteArray spdyByteArray, Object obj) {
            if (ALog.isPrintLog(1)) {
                ALog.m287d("awcn.TnetSpdySession", "spdyDataChunkRecvCB", this.f277b.getSeq(), "len", Integer.valueOf(spdyByteArray.getDataLength()), "fin", Boolean.valueOf(z));
            }
            this.f280e += (long) spdyByteArray.getDataLength();
            this.f277b.f219a.recDataSize += (long) spdyByteArray.getDataLength();
            IHeartbeat iHeartbeat = TnetSpdySession.this.f267D;
            if (iHeartbeat != null) {
                iHeartbeat.reSchedule();
            }
            if (this.f278c != null) {
                ByteArray a = C0116a.C0117a.f119a.mo3435a(spdyByteArray.getByteArray(), spdyByteArray.getDataLength());
                spdyByteArray.recycle();
                this.f278c.onDataReceive(a, z);
            }
            TnetSpdySession.this.handleCallbacks(32, null);
        }

        @Override // org.android.spdy.Spdycb, anet.channel.session.C0162a
        public void spdyOnStreamResponse(SpdySession spdySession, long j, Map<String, List<String>> map, Object obj) {
            this.f277b.f219a.firstDataTime = System.currentTimeMillis() - this.f277b.f219a.sendStart;
            this.f279d = HttpHelper.parseStatusCode(map);
            TnetSpdySession.this.f271H = 0;
            ALog.m290i("awcn.TnetSpdySession", "", this.f277b.getSeq(), "statusCode", Integer.valueOf(this.f279d));
            ALog.m290i("awcn.TnetSpdySession", "", this.f277b.getSeq(), "response headers", map);
            RequestCb requestCb = this.f278c;
            if (requestCb != null) {
                requestCb.onResponseCode(this.f279d, HttpHelper.cloneMap(map));
            }
            TnetSpdySession.this.handleCallbacks(16, null);
            this.f277b.f219a.contentEncoding = HttpHelper.getSingleHeaderFieldByKey(map, "Content-Encoding");
            this.f277b.f219a.contentType = HttpHelper.getSingleHeaderFieldByKey(map, "Content-Type");
            this.f277b.f219a.contentLength = (long) HttpHelper.parseContentLength(map);
            this.f277b.f219a.serverRT = HttpHelper.parseServerRT(map);
            TnetSpdySession.this.handleResponseCode(this.f277b, this.f279d);
            TnetSpdySession.this.handleResponseHeaders(this.f277b, map);
            IHeartbeat iHeartbeat = TnetSpdySession.this.f267D;
            if (iHeartbeat != null) {
                iHeartbeat.reSchedule();
            }
        }

        @Override // org.android.spdy.Spdycb, anet.channel.session.C0162a
        public void spdyStreamCloseCallback(SpdySession spdySession, long j, int i, Object obj, SuperviseData superviseData) {
            String str;
            if (ALog.isPrintLog(1)) {
                ALog.m287d("awcn.TnetSpdySession", "spdyStreamCloseCallback", this.f277b.getSeq(), "streamId", Long.valueOf(j), Constants.KEY_ERROR_CODE, Integer.valueOf(i));
            }
            if (i != 0) {
                this.f279d = ErrorConstant.ERROR_TNET_REQUEST_FAIL;
                str = ErrorConstant.formatMsg(ErrorConstant.ERROR_TNET_REQUEST_FAIL, String.valueOf(i));
                if (i != -2005) {
                    AppMonitor.getInstance().commitStat(new ExceptionStatistic(ErrorConstant.ERROR_TNET_EXCEPTION, str, this.f277b.f219a, null));
                }
                ALog.m289e("awcn.TnetSpdySession", "spdyStreamCloseCallback error", this.f277b.getSeq(), C3416b.f8468at, TnetSpdySession.this.f53p, "status code", Integer.valueOf(i), "URL", this.f277b.getHttpUrl().simpleUrlString());
            } else {
                str = "SUCCESS";
            }
            this.f277b.f219a.tnetErrorCode = i;
            m171a(superviseData, this.f279d, str);
            RequestCb requestCb = this.f278c;
            if (requestCb != null) {
                requestCb.onFinish(this.f279d, str, this.f277b.f219a);
            }
            if (i == -2004) {
                if (!TnetSpdySession.this.f274y) {
                    TnetSpdySession.this.ping(true);
                }
                if (TnetSpdySession.m165d(TnetSpdySession.this) >= 2) {
                    ConnEvent connEvent = new ConnEvent();
                    connEvent.isSuccess = false;
                    StrategyCenter.getInstance().notifyConnEvent(TnetSpdySession.this.f41d, TnetSpdySession.this.f48k, connEvent);
                    TnetSpdySession.this.close(true);
                }
            }
        }
    }

    public TnetSpdySession(Context context, C0131a aVar) {
        super(context, aVar);
    }

    /* renamed from: d */
    public static /* synthetic */ int m165d(TnetSpdySession tnetSpdySession) {
        int i = tnetSpdySession.f271H + 1;
        tnetSpdySession.f271H = i;
        return i;
    }

    @Override // org.android.spdy.SessionCb
    public void bioPingRecvCallback(SpdySession spdySession, int i) {
    }

    @Override // anet.channel.Session
    public void close() {
        ALog.m289e("awcn.TnetSpdySession", "force close!", this.f53p, C3416b.f8468at, this);
        notifyStatus(7, null);
        try {
            if (this.f267D != null) {
                this.f267D.stop();
                this.f267D = null;
            }
            if (this.f273x != null) {
                this.f273x.closeSession();
            }
        } catch (Exception unused) {
        }
    }

    @Override // anet.channel.Session
    public void connect() {
        int i = this.f51n;
        int i2 = 1;
        if (i != 1 && i != 0 && i != 4) {
            try {
                if (this.f272w == null) {
                    m163c();
                }
                if (C0223c.m314a() && C0209c.m281a(this.f42e)) {
                    try {
                        this.f43f = C0223c.m312a(this.f42e);
                    } catch (Exception unused) {
                    }
                }
                String valueOf = String.valueOf(System.currentTimeMillis());
                ALog.m289e("awcn.TnetSpdySession", BaseMonitor.ALARM_POINT_CONNECT, this.f53p, "host", this.f40c, "ip", this.f43f, "port", Integer.valueOf(this.f44g), "sessionId", valueOf, "SpdyProtocol,", this.f47j, "proxyIp,", this.f45h, "proxyPort,", Integer.valueOf(this.f46i));
                String str = this.f43f;
                int i3 = this.f44g;
                SessionInfo sessionInfo = new SessionInfo(str, i3, this.f40c + "_" + this.f269F, this.f45h, this.f46i, valueOf, this, this.f47j.getTnetConType());
                sessionInfo.setConnectionTimeoutMs((int) (((float) this.f55r) * Utils.getNetworkTimeFactor()));
                if (this.f47j.isPublicKeyAuto() || this.f47j.isQuic() || this.f47j.isH2S()) {
                    sessionInfo.setCertHost(this.f50m ? this.f42e : this.f41d);
                } else if (this.f265B >= 0) {
                    sessionInfo.setPubKeySeqNum(this.f265B);
                } else {
                    int tnetPublicKey = this.f47j.getTnetPublicKey(this.f270G != null ? this.f270G.isSecOff() : true);
                    this.f265B = tnetPublicKey;
                    sessionInfo.setPubKeySeqNum(tnetPublicKey);
                }
                SpdySession createSession = this.f272w.createSession(sessionInfo);
                this.f273x = createSession;
                if (createSession.getRefCount() > 1) {
                    ALog.m289e("awcn.TnetSpdySession", "get session ref count > 1!!!", this.f53p, new Object[0]);
                    notifyStatus(0, new C0132b(1));
                    mo3578b();
                    return;
                }
                notifyStatus(1, null);
                this.f275z = System.currentTimeMillis();
                SessionStatistic sessionStatistic = this.f54q;
                if (TextUtils.isEmpty(this.f45h)) {
                    i2 = 0;
                }
                sessionStatistic.isProxy = i2;
                this.f54q.isTunnel = "false";
                this.f54q.isBackground = GlobalAppRuntimeInfo.isAppBackground();
                this.f264A = 0;
            } catch (Throwable th) {
                notifyStatus(2, null);
                ALog.m288e("awcn.TnetSpdySession", "connect exception ", this.f53p, th, new Object[0]);
            }
        }
    }

    @Override // anet.channel.Session
    public Runnable getRecvTimeOutRunnable() {
        return new RunnableC0170h(this);
    }

    @Override // org.android.spdy.SessionCb
    public byte[] getSSLMeta(SpdySession spdySession) {
        String domain = spdySession.getDomain();
        if (TextUtils.isEmpty(domain)) {
            ALog.m290i("awcn.TnetSpdySession", "get sslticket host is null", null, new Object[0]);
            return null;
        }
        try {
            if (this.f270G == null) {
                return null;
            }
            ISecurity iSecurity = this.f270G;
            Context context = this.f38a;
            return iSecurity.getBytes(context, "accs_ssl_key2_" + domain);
        } catch (Throwable th) {
            ALog.m288e("awcn.TnetSpdySession", "getSSLMeta", null, th, new Object[0]);
            return null;
        }
    }

    public void initConfig(Config config) {
        if (config != null) {
            this.f269F = config.getAppkey();
            this.f270G = config.getSecurity();
        }
    }

    public void initSessionInfo(anet.channel.SessionInfo sessionInfo) {
        if (sessionInfo != null) {
            this.f266C = sessionInfo.dataFrameCb;
            this.f268E = sessionInfo.auth;
            if (sessionInfo.isKeepAlive) {
                this.f54q.isKL = 1;
                this.f57t = true;
                IHeartbeat iHeartbeat = sessionInfo.heartbeat;
                this.f267D = iHeartbeat;
                if (iHeartbeat == null) {
                    this.f267D = HeartbeatManager.getDefaultHeartbeat();
                }
            }
        }
        if (AwcnConfig.isIdleSessionCloseEnable() && this.f267D == null) {
            this.f267D = new RunnableC0144b();
        }
    }

    @Override // anet.channel.Session
    public boolean isAvailable() {
        return this.f51n == 4;
    }

    @Override // anet.channel.Session
    public void onDisconnect() {
        this.f274y = false;
    }

    @Override // anet.channel.Session
    public void ping(boolean z) {
        if (ALog.isPrintLog(1)) {
            ALog.m287d("awcn.TnetSpdySession", "ping", this.f53p, "host", this.f40c, "thread", Thread.currentThread().getName());
        }
        if (z) {
            try {
                if (this.f273x == null) {
                    if (this.f54q != null) {
                        this.f54q.closeReason = "session null";
                    }
                    ALog.m289e("awcn.TnetSpdySession", this.f40c + " session null", this.f53p, new Object[0]);
                    close();
                } else if (this.f51n == 0 || this.f51n == 4) {
                    handleCallbacks(64, null);
                    this.f274y = true;
                    this.f54q.ppkgCount++;
                    this.f273x.submitPing();
                    if (ALog.isPrintLog(1)) {
                        ALog.m287d("awcn.TnetSpdySession", this.f40c + " submit ping ms:" + (System.currentTimeMillis() - this.f275z) + " force:" + z, this.f53p, new Object[0]);
                    }
                    setPingTimeout();
                    this.f275z = System.currentTimeMillis();
                    if (this.f267D != null) {
                        this.f267D.reSchedule();
                    }
                }
            } catch (SpdyErrorException e) {
                if (e.SpdyErrorGetCode() == -1104 || e.SpdyErrorGetCode() == -1103) {
                    ALog.m289e("awcn.TnetSpdySession", "Send request on closed session!!!", this.f53p, new Object[0]);
                    notifyStatus(6, new C0132b(2));
                }
                ALog.m288e("awcn.TnetSpdySession", "ping", this.f53p, e, new Object[0]);
            } catch (Exception e2) {
                ALog.m288e("awcn.TnetSpdySession", "ping", this.f53p, e2, new Object[0]);
            }
        }
    }

    @Override // org.android.spdy.SessionCb
    public int putSSLMeta(SpdySession spdySession, byte[] bArr) {
        String domain = spdySession.getDomain();
        if (TextUtils.isEmpty(domain)) {
            return -1;
        }
        try {
            if (this.f270G == null) {
                return -1;
            }
            ISecurity iSecurity = this.f270G;
            Context context = this.f38a;
            if (iSecurity.saveBytes(context, "accs_ssl_key2_" + domain, bArr)) {
                return 0;
            }
            return -1;
        } catch (Throwable th) {
            ALog.m288e("awcn.TnetSpdySession", "putSSLMeta", null, th, new Object[0]);
            return -1;
        }
    }

    @Override // anet.channel.Session
    public Cancelable request(Request request, RequestCb requestCb) {
        SpdyErrorException e;
        String str;
        SpdyRequest spdyRequest;
        C0156c cVar = C0156c.NULL;
        RequestStatistic requestStatistic = request != null ? request.f219a : new RequestStatistic(this.f41d, null);
        requestStatistic.setConnType(this.f47j);
        if (requestStatistic.start == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            requestStatistic.reqStart = currentTimeMillis;
            requestStatistic.start = currentTimeMillis;
        }
        requestStatistic.setIPAndPort(this.f43f, this.f44g);
        requestStatistic.ipRefer = this.f48k.getIpSource();
        requestStatistic.ipType = this.f48k.getIpType();
        requestStatistic.unit = this.f49l;
        if (request == null || requestCb == null) {
            if (requestCb != null) {
                requestCb.onFinish(-102, ErrorConstant.getErrMsg(-102), requestStatistic);
            }
            return cVar;
        }
        try {
            if (this.f273x == null || !(this.f51n == 0 || this.f51n == 4)) {
                requestCb.onFinish(ErrorConstant.ERROR_SESSION_INVALID, ErrorConstant.getErrMsg(ErrorConstant.ERROR_SESSION_INVALID), request.f219a);
                return cVar;
            }
            if (this.f50m) {
                request.setDnsOptimize(this.f42e, this.f44g);
            }
            request.setUrlScheme(this.f47j.isSSL());
            URL url = request.getUrl();
            if (ALog.isPrintLog(2)) {
                ALog.m290i("awcn.TnetSpdySession", "", request.getSeq(), "request URL", url.toString());
                ALog.m290i("awcn.TnetSpdySession", "", request.getSeq(), "request Method", request.getMethod());
                ALog.m290i("awcn.TnetSpdySession", "", request.getSeq(), "request headers", request.getHeaders());
            }
            if (TextUtils.isEmpty(this.f45h) || this.f46i <= 0) {
                str = "";
                spdyRequest = new SpdyRequest(url, request.getMethod(), RequestPriority.DEFAULT_PRIORITY, -1, request.getConnectTimeout());
            } else {
                str = "";
                spdyRequest = new SpdyRequest(url, url.getHost(), url.getPort(), this.f45h, this.f46i, request.getMethod(), RequestPriority.DEFAULT_PRIORITY, -1, request.getConnectTimeout(), 0);
            }
            spdyRequest.setRequestRdTimeoutMs(request.getReadTimeout());
            Map<String, String> headers = request.getHeaders();
            if (!headers.containsKey(HttpConstant.HOST)) {
                spdyRequest.addHeaders(headers);
                spdyRequest.addHeader(":host", this.f50m ? this.f42e : request.getHost());
            } else {
                HashMap hashMap = new HashMap(request.getHeaders());
                String remove = hashMap.remove(HttpConstant.HOST);
                if (this.f50m) {
                    remove = this.f42e;
                }
                hashMap.put(":host", remove);
                spdyRequest.addHeaders(hashMap);
            }
            SpdyDataProvider spdyDataProvider = new SpdyDataProvider(request.getBodyBytes());
            request.f219a.sendStart = System.currentTimeMillis();
            request.f219a.processTime = request.f219a.sendStart - request.f219a.start;
            int submitRequest = this.f273x.submitRequest(spdyRequest, spdyDataProvider, this, new C0161a(request, requestCb));
            if (ALog.isPrintLog(1)) {
                ALog.m287d("awcn.TnetSpdySession", str, request.getSeq(), "streamId", Integer.valueOf(submitRequest));
            }
            C0156c cVar2 = new C0156c(this.f273x, submitRequest, request.getSeq());
            try {
                this.f54q.requestCount++;
                this.f54q.stdRCount++;
                this.f275z = System.currentTimeMillis();
                if (this.f267D != null) {
                    this.f267D.reSchedule();
                }
                if (this.f47j.isQuic()) {
                    request.f219a.putExtra("QuicConnectionID", this.f273x.getQuicConnectionID());
                }
                return cVar2;
            } catch (SpdyErrorException e2) {
                e = e2;
                cVar = cVar2;
                ALog.m289e("awcn.TnetSpdySession", "Send request on closed session!!!", this.f53p, new Object[0]);
                notifyStatus(6, new C0132b(2));
                requestCb.onFinish(ErrorConstant.ERROR_TNET_EXCEPTION, ErrorConstant.formatMsg(ErrorConstant.ERROR_TNET_EXCEPTION, String.valueOf(e.SpdyErrorGetCode())), requestStatistic);
                return cVar;
            } catch (Exception unused) {
                cVar = cVar2;
                requestCb.onFinish(-101, ErrorConstant.getErrMsg(-101), requestStatistic);
                return cVar;
            }
        } catch (SpdyErrorException e3) {
            e = e3;
            if (e.SpdyErrorGetCode() == -1104 || e.SpdyErrorGetCode() == -1103) {
                ALog.m289e("awcn.TnetSpdySession", "Send request on closed session!!!", this.f53p, new Object[0]);
                notifyStatus(6, new C0132b(2));
            }
            requestCb.onFinish(ErrorConstant.ERROR_TNET_EXCEPTION, ErrorConstant.formatMsg(ErrorConstant.ERROR_TNET_EXCEPTION, String.valueOf(e.SpdyErrorGetCode())), requestStatistic);
            return cVar;
        } catch (Exception unused2) {
            requestCb.onFinish(-101, ErrorConstant.getErrMsg(-101), requestStatistic);
            return cVar;
        }
    }

    @Override // anet.channel.Session
    public void sendCustomFrame(int i, byte[] bArr, int i2) {
        try {
            if (this.f266C != null) {
                ALog.m289e("awcn.TnetSpdySession", "sendCustomFrame", this.f53p, Constants.KEY_DATA_ID, Integer.valueOf(i), "type", Integer.valueOf(i2));
                if (this.f51n != 4 || this.f273x == null) {
                    ALog.m289e("awcn.TnetSpdySession", "sendCustomFrame", this.f53p, "sendCustomFrame con invalid mStatus:" + this.f51n);
                    m156a(i, ErrorConstant.ERROR_SESSION_INVALID, true, "session invalid");
                } else if (bArr == null || bArr.length <= 16384) {
                    this.f273x.sendCustomControlFrame(i, i2, 0, bArr == null ? 0 : bArr.length, bArr);
                    this.f54q.requestCount++;
                    this.f54q.cfRCount++;
                    this.f275z = System.currentTimeMillis();
                    if (this.f267D != null) {
                        this.f267D.reSchedule();
                    }
                } else {
                    m156a(i, ErrorConstant.ERROR_DATA_TOO_LARGE, false, null);
                }
            }
        } catch (SpdyErrorException e) {
            ALog.m288e("awcn.TnetSpdySession", "sendCustomFrame error", this.f53p, e, new Object[0]);
            m156a(i, ErrorConstant.ERROR_TNET_EXCEPTION, true, "SpdyErrorException: " + e.toString());
        } catch (Exception e2) {
            ALog.m288e("awcn.TnetSpdySession", "sendCustomFrame error", this.f53p, e2, new Object[0]);
            m156a(i, -101, true, e2.toString());
        }
    }

    public void setTnetPublicKey(int i) {
        this.f265B = i;
    }

    @Override // org.android.spdy.SessionCb
    public void spdyCustomControlFrameFailCallback(SpdySession spdySession, Object obj, int i, int i2) {
        ALog.m289e("awcn.TnetSpdySession", "spdyCustomControlFrameFailCallback", this.f53p, Constants.KEY_DATA_ID, Integer.valueOf(i));
        m156a(i, i2, true, "tnet error");
    }

    @Override // org.android.spdy.SessionCb
    public void spdyCustomControlFrameRecvCallback(SpdySession spdySession, Object obj, int i, int i2, int i3, int i4, byte[] bArr) {
        ALog.m289e("awcn.TnetSpdySession", "[spdyCustomControlFrameRecvCallback]", this.f53p, "len", Integer.valueOf(i4), "frameCb", this.f266C);
        if (ALog.isPrintLog(1) && i4 < 512) {
            String str = "";
            for (int i5 = 0; i5 < bArr.length; i5++) {
                str = str + Integer.toHexString(bArr[i5] & 255) + " ";
            }
            ALog.m289e("awcn.TnetSpdySession", null, this.f53p, "str", str);
        }
        DataFrameCb dataFrameCb = this.f266C;
        if (dataFrameCb != null) {
            dataFrameCb.onDataReceive(this, bArr, i, i2);
        } else {
            ALog.m289e("awcn.TnetSpdySession", "AccsFrameCb is null", this.f53p, new Object[0]);
            AppMonitor.getInstance().commitStat(new ExceptionStatistic(-105, null, "rt"));
        }
        this.f54q.inceptCount++;
        IHeartbeat iHeartbeat = this.f267D;
        if (iHeartbeat != null) {
            iHeartbeat.reSchedule();
        }
    }

    @Override // org.android.spdy.SessionCb
    public void spdyPingRecvCallback(SpdySession spdySession, long j, Object obj) {
        if (ALog.isPrintLog(2)) {
            ALog.m290i("awcn.TnetSpdySession", "ping receive", this.f53p, HttpConstant.HOST, this.f40c, "id", Long.valueOf(j));
        }
        if (j >= 0) {
            this.f274y = false;
            this.f271H = 0;
            IHeartbeat iHeartbeat = this.f267D;
            if (iHeartbeat != null) {
                iHeartbeat.reSchedule();
            }
            handleCallbacks(128, null);
        }
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionCloseCallback(SpdySession spdySession, Object obj, SuperviseConnectInfo superviseConnectInfo, int i) {
        ALog.m289e("awcn.TnetSpdySession", "spdySessionCloseCallback", this.f53p, " errorCode:", Integer.valueOf(i));
        IHeartbeat iHeartbeat = this.f267D;
        if (iHeartbeat != null) {
            iHeartbeat.stop();
            this.f267D = null;
        }
        if (spdySession != null) {
            try {
                spdySession.cleanUp();
            } catch (Exception e) {
                ALog.m288e("awcn.TnetSpdySession", "session clean up failed!", null, e, new Object[0]);
            }
        }
        notifyStatus(6, new C0132b(2));
        if (superviseConnectInfo != null) {
            SessionStatistic sessionStatistic = this.f54q;
            sessionStatistic.requestCount = (long) superviseConnectInfo.reused_counter;
            sessionStatistic.liveTime = (long) superviseConnectInfo.keepalive_period_second;
            try {
                if (this.f47j.isQuic()) {
                    this.f54q.extra = new JSONObject();
                    this.f54q.extra.put("QuicConnectionID", this.f273x.getQuicConnectionID());
                    this.f54q.extra.put("retransmissionRate", superviseConnectInfo.retransmissionRate);
                    this.f54q.extra.put("lossRate", superviseConnectInfo.lossRate);
                    this.f54q.extra.put("tlpCount", superviseConnectInfo.tlpCount);
                    this.f54q.extra.put("rtoCount", superviseConnectInfo.rtoCount);
                }
            } catch (JSONException unused) {
            }
        }
        SessionStatistic sessionStatistic2 = this.f54q;
        if (sessionStatistic2.errorCode == 0) {
            sessionStatistic2.errorCode = (long) i;
        }
        this.f54q.lastPingInterval = (int) (System.currentTimeMillis() - this.f275z);
        AppMonitor.getInstance().commitStat(this.f54q);
        AppMonitor.getInstance().commitAlarm(this.f54q.getAlarmObject());
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionConnectCB(SpdySession spdySession, SuperviseConnectInfo superviseConnectInfo) {
        SessionStatistic sessionStatistic = this.f54q;
        sessionStatistic.connectionTime = (long) superviseConnectInfo.connectTime;
        sessionStatistic.sslTime = (long) superviseConnectInfo.handshakeTime;
        sessionStatistic.sslCalTime = (long) superviseConnectInfo.doHandshakeTime;
        sessionStatistic.netType = NetworkStatusHelper.getNetworkSubType();
        this.f264A = System.currentTimeMillis();
        notifyStatus(0, new C0132b(1));
        mo3578b();
        ALog.m289e("awcn.TnetSpdySession", "spdySessionConnectCB connect", this.f53p, "connectTime", Integer.valueOf(superviseConnectInfo.connectTime), "sslTime:", Integer.valueOf(superviseConnectInfo.handshakeTime));
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionFailedError(SpdySession spdySession, int i, Object obj) {
        if (spdySession != null) {
            try {
                spdySession.cleanUp();
            } catch (Exception e) {
                ALog.m288e("awcn.TnetSpdySession", "[spdySessionFailedError]session clean up failed!", null, e, new Object[0]);
            }
        }
        notifyStatus(2, new C0132b(256, i, "tnet connect fail"));
        ALog.m289e("awcn.TnetSpdySession", null, this.f53p, " errorId:", Integer.valueOf(i));
        SessionStatistic sessionStatistic = this.f54q;
        sessionStatistic.errorCode = (long) i;
        sessionStatistic.ret = 0;
        sessionStatistic.netType = NetworkStatusHelper.getNetworkSubType();
        AppMonitor.getInstance().commitStat(this.f54q);
        AppMonitor.getInstance().commitAlarm(this.f54q.getAlarmObject());
    }

    /* renamed from: c */
    private void m163c() {
        SpdyAgent.enableDebug = false;
        this.f272w = SpdyAgent.getInstance(this.f38a, SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
        ISecurity iSecurity = this.f270G;
        if (iSecurity != null && !iSecurity.isSecOff()) {
            this.f272w.setAccsSslCallback(new C0172j(this));
        }
        if (!AwcnConfig.isTnetHeaderCacheEnable()) {
            try {
                this.f272w.getClass().getDeclaredMethod("disableHeaderCache", new Class[0]).invoke(this.f272w, new Object[0]);
                ALog.m290i("awcn.TnetSpdySession", "tnet disableHeaderCache", null, new Object[0]);
            } catch (Exception e) {
                ALog.m288e("awcn.TnetSpdySession", "tnet disableHeaderCache", null, e, new Object[0]);
            }
        }
    }

    /* renamed from: b */
    public void mo3578b() {
        IAuth iAuth = this.f268E;
        if (iAuth != null) {
            iAuth.auth(this, new C0171i(this));
            return;
        }
        notifyStatus(4, null);
        this.f54q.ret = 1;
        IHeartbeat iHeartbeat = this.f267D;
        if (iHeartbeat != null) {
            iHeartbeat.start(this);
        }
    }

    /* renamed from: a */
    private void m156a(int i, int i2, boolean z, String str) {
        DataFrameCb dataFrameCb = this.f266C;
        if (dataFrameCb != null) {
            dataFrameCb.onException(i, i2, z, str);
        }
    }
}
