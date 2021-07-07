package com.taobao.accs.net;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.strategy.IConnStrategy;
import com.facebook.react.devsupport.WebsocketJavaScriptExecutor;
import com.facebook.react.uimanager.ViewProps;
import com.jinhui365.util.webview.JHWebView;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import com.p118pd.sdk.C8932ooOOO0o;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.ErrorCode;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.data.C3113d;
import com.taobao.accs.data.Message;
import com.taobao.accs.p263ut.monitor.SessionMonitor;
import com.taobao.accs.p263ut.p264a.C3164c;
import com.taobao.accs.p263ut.p264a.C3165d;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.C3179k;
import com.taobao.accs.utl.C3187q;
import com.taobao.accs.utl.C3190t;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;
import java.net.URL;
import java.net.URLEncoder;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.android.spdy.RequestPriority;
import org.android.spdy.SessionCb;
import org.android.spdy.SessionInfo;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdyByteArray;
import org.android.spdy.SpdyDataProvider;
import org.android.spdy.SpdyRequest;
import org.android.spdy.SpdySession;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;
import org.android.spdy.Spdycb;
import org.android.spdy.SuperviseConnectInfo;
import org.android.spdy.SuperviseData;

/* renamed from: com.taobao.accs.net.t */
public class C3156t extends AbstractC3137b implements SessionCb, Spdycb {

    /* renamed from: A */
    public SpdySession f7077A = null;

    /* renamed from: B */
    public Object f7078B = new Object();

    /* renamed from: C */
    public long f7079C;

    /* renamed from: D */
    public long f7080D;

    /* renamed from: E */
    public long f7081E;

    /* renamed from: F */
    public long f7082F;

    /* renamed from: G */
    public int f7083G = -1;

    /* renamed from: H */
    public String f7084H = null;

    /* renamed from: I */
    public SessionMonitor f7085I;

    /* renamed from: J */
    public C3164c f7086J;

    /* renamed from: K */
    public boolean f7087K = false;

    /* renamed from: L */
    public String f7088L = "";

    /* renamed from: M */
    public boolean f7089M = false;

    /* renamed from: N */
    public C3142g f7090N = new C3142g(mo37700o());

    /* renamed from: O */
    public String f7091O;

    /* renamed from: o */
    public ScheduledFuture<?> f7092o;

    /* renamed from: p */
    public String f7093p;

    /* renamed from: q */
    public int f7094q;

    /* renamed from: r */
    public String f7095r;

    /* renamed from: s */
    public int f7096s;

    /* renamed from: t */
    public int f7097t = 3;

    /* renamed from: u */
    public LinkedList<Message> f7098u = new LinkedList<>();

    /* renamed from: v */
    public C3157a f7099v;

    /* renamed from: w */
    public boolean f7100w = true;

    /* renamed from: x */
    public String f7101x;

    /* renamed from: y */
    public String f7102y;

    /* renamed from: z */
    public SpdyAgent f7103z = null;

    /* renamed from: com.taobao.accs.net.t$a */
    public class C3157a extends Thread {

        /* renamed from: a */
        public int f7104a = 0;

        /* renamed from: b */
        public long f7105b;

        /* renamed from: d */
        public final String f7107d = getName();

        public C3157a(String str) {
            super(str);
        }

        /* renamed from: a */
        private void m7580a(boolean z) {
            if (C3156t.this.f7097t != 1) {
                ALog.m7597d(C3156t.this.mo37662d(), "tryConnect", "force", Boolean.valueOf(z));
                if (!UtilityImpl.m7643k(C3156t.this.f7012d)) {
                    ALog.m7599e(this.f7107d, "Network not available", new Object[0]);
                    return;
                }
                if (z) {
                    this.f7104a = 0;
                }
                ALog.m7600i(this.f7107d, "tryConnect", "force", Boolean.valueOf(z), "failTimes", Integer.valueOf(this.f7104a));
                if (C3156t.this.f7097t != 1 && this.f7104a >= 4) {
                    C3156t.this.f7087K = true;
                    ALog.m7599e(this.f7107d, "tryConnect fail", "maxTimes", 4);
                } else if (C3156t.this.f7097t != 1) {
                    if (C3156t.this.f7011c == 1 && this.f7104a == 0) {
                        ALog.m7600i(this.f7107d, "tryConnect in app, no sleep", new Object[0]);
                    } else {
                        ALog.m7600i(this.f7107d, "tryConnect, need sleep", new Object[0]);
                        try {
                            Thread.sleep(WebsocketJavaScriptExecutor.CONNECT_TIMEOUT_MS);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    C3156t.this.f7088L = "";
                    if (this.f7104a == 3) {
                        C3156t.this.f7090N.mo37685b(C3156t.this.mo37700o());
                    }
                    C3156t.this.m7554d((C3156t) null);
                    C3156t.this.f7085I.setRetryTimes(this.f7104a);
                    if (C3156t.this.f7097t != 1) {
                        this.f7104a++;
                        ALog.m7599e(this.f7107d, "try connect fail, ready for reconnect", new Object[0]);
                        m7580a(false);
                        return;
                    }
                    this.f7105b = System.currentTimeMillis();
                }
            } else if (C3156t.this.f7097t == 1 && System.currentTimeMillis() - this.f7105b > WebsocketJavaScriptExecutor.CONNECT_TIMEOUT_MS) {
                this.f7104a = 0;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:114:0x035c  */
        /* JADX WARNING: Removed duplicated region for block: B:132:0x03bb A[SYNTHETIC, Splitter:B:132:0x03bb] */
        /* JADX WARNING: Removed duplicated region for block: B:157:0x0434  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x02e3 A[SYNTHETIC, Splitter:B:89:0x02e3] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
            // Method dump skipped, instructions count: 1296
            */
            throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.net.C3156t.C3157a.run():void");
        }
    }

    public C3156t(Context context, int i, String str) {
        super(context, i, str);
        m7564t();
    }

    /* renamed from: q */
    private int m7561q() {
        boolean l = mo37670l();
        if (AccsClientConfig.mEnv == 2) {
            return 0;
        }
        int channelPubKey = this.f7017i.getChannelPubKey();
        if (channelPubKey <= 0) {
            return l ? 4 : 3;
        }
        ALog.m7600i(mo37662d(), "getPublicKeyType use custom pub key", "pubKey", Integer.valueOf(channelPubKey));
        return channelPubKey;
    }

    /* renamed from: r */
    private void m7562r() {
        if (this.f7077A == null) {
            m7553d(3);
            return;
        }
        try {
            String encode = URLEncoder.encode(UtilityImpl.m7644l(this.f7012d));
            String a = UtilityImpl.m7610a(this.f7012d, mo37667i(), this.f7017i.getAppSecret(), UtilityImpl.m7644l(this.f7012d), this.f7021m);
            String c = mo37660c(this.f7101x);
            ALog.m7599e(mo37662d(), "auth", "url", c);
            this.f7102y = c;
            if (!m7546a(encode, mo37667i(), a)) {
                ALog.m7599e(mo37662d(), "auth param error!", new Object[0]);
                m7556e(-6);
                return;
            }
            new URL(c);
            SpdyRequest spdyRequest = new SpdyRequest(new URL(c), "GET", RequestPriority.DEFAULT_PRIORITY, (int) JHWebView.o00oO0O, (int) AbstractC3137b.ACCS_RECEIVE_TIMEOUT);
            spdyRequest.setDomain(mo37700o());
            this.f7077A.submitRequest(spdyRequest, new SpdyDataProvider((byte[]) null), mo37700o(), this);
        } catch (Throwable th) {
            ALog.m7598e(mo37662d(), "auth exception ", th, new Object[0]);
            m7556e(-7);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: s */
    private synchronized void m7563s() {
        if (this.f7011c != 1) {
            this.f7079C = System.currentTimeMillis();
            this.f7080D = System.nanoTime();
            AbstractC3141f.m7500a(this.f7012d).mo37675a();
        }
    }

    /* renamed from: t */
    private void m7564t() {
        try {
            SpdyAgent.enableDebug = true;
            this.f7103z = SpdyAgent.getInstance(this.f7012d, SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
            if (SpdyAgent.checkLoadSucc()) {
                C3187q.m7682a();
                if (!mo37670l()) {
                    this.f7103z.setAccsSslCallback(new C3161x(this));
                }
                if (!C3190t.m7700a(false)) {
                    String str = this.f7011c == 0 ? "service" : "inapp";
                    ALog.m7597d(mo37662d(), "into--[setTnetLogPath]", new Object[0]);
                    String c = UtilityImpl.m7627c(this.f7012d, str);
                    String d = mo37662d();
                    ALog.m7597d(d, "config tnet log path:" + c, new Object[0]);
                    if (!TextUtils.isEmpty(c)) {
                        this.f7103z.configLogFile(c, 5242880, 5);
                        return;
                    }
                    return;
                }
                return;
            }
            ALog.m7599e(mo37662d(), "initClient", new Object[0]);
            this.f7103z = null;
            C3187q.m7683b();
        } catch (Throwable th) {
            ALog.m7598e(mo37662d(), "initClient", th, new Object[0]);
        }
    }

    @Override // org.android.spdy.SessionCb
    public void bioPingRecvCallback(SpdySession spdySession, int i) {
        String d = mo37662d();
        ALog.m7603w(d, "bioPingRecvCallback uniId:" + i, new Object[0]);
    }

    @Override // org.android.spdy.SessionCb
    public byte[] getSSLMeta(SpdySession spdySession) {
        return UtilityImpl.m7619a(this.f7012d, this.f7021m, this.f7010b, spdySession.getDomain());
    }

    @Override // com.taobao.accs.net.AbstractC3137b
    /* renamed from: h */
    public boolean mo37666h() {
        return false;
    }

    /* renamed from: n */
    public void mo37699n() {
        ALog.m7599e(mo37662d(), " force close!", new Object[0]);
        try {
            this.f7077A.closeSession();
            this.f7085I.setCloseType(1);
        } catch (Exception unused) {
        }
        m7553d(3);
    }

    /* renamed from: o */
    public String mo37700o() {
        String channelHost = this.f7017i.getChannelHost();
        ALog.m7600i(mo37662d(), "getChannelHost", "host", channelHost);
        return channelHost == null ? "" : channelHost;
    }

    /* renamed from: p */
    public boolean mo37701p() {
        return this.f7100w;
    }

    @Override // org.android.spdy.SessionCb
    public int putSSLMeta(SpdySession spdySession, byte[] bArr) {
        return UtilityImpl.m7604a(this.f7012d, this.f7021m, this.f7010b, spdySession.getDomain(), bArr);
    }

    @Override // org.android.spdy.SessionCb
    public void spdyCustomControlFrameFailCallback(SpdySession spdySession, Object obj, int i, int i2) {
        mo37656b(i);
    }

    @Override // org.android.spdy.SessionCb
    public void spdyCustomControlFrameRecvCallback(SpdySession spdySession, Object obj, int i, int i2, int i3, int i4, byte[] bArr) {
        m7563s();
        ALog.m7599e(mo37662d(), "onFrame", "type", Integer.valueOf(i2), "len", Integer.valueOf(bArr.length));
        StringBuilder sb = new StringBuilder();
        if (ALog.isPrintLog(ALog.Level.D) && bArr.length < 512) {
            long currentTimeMillis = System.currentTimeMillis();
            for (byte b : bArr) {
                sb.append(Integer.toHexString(b & 255));
                sb.append(" ");
            }
            ALog.m7597d(mo37662d(), ((Object) sb) + " log time:" + (System.currentTimeMillis() - currentTimeMillis), new Object[0]);
        }
        if (i2 == 200) {
            try {
                long currentTimeMillis2 = System.currentTimeMillis();
                this.f7013e.mo37592a(bArr);
                C3165d g = this.f7013e.mo37601g();
                if (g != null) {
                    g.f7141c = String.valueOf(currentTimeMillis2);
                    g.f7145g = this.f7011c == 0 ? "service" : "inapp";
                    g.mo37713a();
                }
            } catch (Throwable th) {
                ALog.m7598e(mo37662d(), "onDataReceive ", th, new Object[0]);
                UTMini.getInstance().commitEvent(66001, "SERVICE_DATA_RECEIVE", UtilityImpl.m7611a(th));
            }
            ALog.m7597d(mo37662d(), "try handle msg", new Object[0]);
            mo37665g();
        } else {
            ALog.m7599e(mo37662d(), "drop frame", "len", Integer.valueOf(bArr.length));
        }
        ALog.m7597d(mo37662d(), "spdyCustomControlFrameRecvCallback", new Object[0]);
    }

    @Override // org.android.spdy.Spdycb
    public void spdyDataChunkRecvCB(SpdySession spdySession, boolean z, long j, SpdyByteArray spdyByteArray, Object obj) {
        ALog.m7597d(mo37662d(), "spdyDataChunkRecvCB", new Object[0]);
    }

    @Override // org.android.spdy.Spdycb
    public void spdyDataRecvCallback(SpdySession spdySession, boolean z, long j, int i, Object obj) {
        ALog.m7597d(mo37662d(), "spdyDataRecvCallback", new Object[0]);
    }

    @Override // org.android.spdy.Spdycb
    public void spdyDataSendCallback(SpdySession spdySession, boolean z, long j, int i, Object obj) {
        ALog.m7597d(mo37662d(), "spdyDataSendCallback", new Object[0]);
    }

    @Override // org.android.spdy.Spdycb
    public void spdyOnStreamResponse(SpdySession spdySession, long j, Map<String, List<String>> map, Object obj) {
        this.f7079C = System.currentTimeMillis();
        this.f7080D = System.nanoTime();
        try {
            Map<String, String> a = UtilityImpl.m7613a(map);
            ALog.m7597d("SilenceConn_", "spdyOnStreamResponse", "header", map);
            int parseInt = Integer.parseInt(a.get(":status"));
            ALog.m7599e(mo37662d(), "spdyOnStreamResponse", "httpStatusCode", Integer.valueOf(parseInt));
            if (parseInt == 200) {
                m7553d(1);
                String str = a.get("x-at");
                if (!TextUtils.isEmpty(str)) {
                    this.f7019k = str;
                }
                SessionMonitor sessionMonitor = this.f7085I;
                long j2 = 0;
                if (this.f7085I.connection_stop_date > 0) {
                    j2 = System.currentTimeMillis() - this.f7085I.connection_stop_date;
                }
                sessionMonitor.auth_time = j2;
                String str2 = this.f7011c == 0 ? "service" : "inapp";
                UTMini instance = UTMini.getInstance();
                instance.commitEvent(66001, "CONNECTED 200 " + str2, this.f7102y, this.f7088L, Integer.valueOf(Constants.SDK_VERSION_CODE), "0");
                C3179k.m7666a("accs", "auth", "");
            } else {
                m7556e(parseInt);
            }
        } catch (Exception e) {
            ALog.m7599e(mo37662d(), e.toString(), new Object[0]);
            mo37699n();
            this.f7085I.setCloseReason("exception");
        }
        ALog.m7597d(mo37662d(), "spdyOnStreamResponse", new Object[0]);
    }

    @Override // org.android.spdy.SessionCb
    public void spdyPingRecvCallback(SpdySession spdySession, long j, Object obj) {
        String d = mo37662d();
        ALog.m7597d(d, "spdyPingRecvCallback uniId:" + j, new Object[0]);
        if (j >= 0) {
            this.f7013e.mo37595b();
            AbstractC3141f.m7500a(this.f7012d).mo37679e();
            AbstractC3141f.m7500a(this.f7012d).mo37675a();
            this.f7085I.onPingCBReceive();
            if (this.f7085I.ping_rec_times % 2 == 0) {
                UtilityImpl.m7614a(this.f7012d, Constants.SP_KEY_SERVICE_END, System.currentTimeMillis());
            }
        }
    }

    @Override // org.android.spdy.Spdycb
    public void spdyRequestRecvCallback(SpdySession spdySession, long j, Object obj) {
        ALog.m7597d(mo37662d(), "spdyRequestRecvCallback", new Object[0]);
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionCloseCallback(SpdySession spdySession, Object obj, SuperviseConnectInfo superviseConnectInfo, int i) {
        ALog.m7599e(mo37662d(), "spdySessionCloseCallback", Constants.KEY_ERROR_CODE, Integer.valueOf(i));
        if (spdySession != null) {
            try {
                spdySession.cleanUp();
            } catch (Exception e) {
                String d = mo37662d();
                ALog.m7599e(d, "session cleanUp has exception: " + e, new Object[0]);
            }
        }
        m7553d(3);
        this.f7085I.onCloseConnect();
        if (this.f7085I.getConCloseDate() > 0 && this.f7085I.getConStopDate() > 0) {
            this.f7085I.getConCloseDate();
            this.f7085I.getConStopDate();
        }
        this.f7085I.setCloseReason(this.f7085I.getCloseReason() + "tnet error:" + i);
        if (superviseConnectInfo != null) {
            this.f7085I.live_time = (long) superviseConnectInfo.keepalive_period_second;
        }
        AppMonitor.getInstance().commitStat(this.f7085I);
        for (Message message : this.f7013e.mo37599e()) {
            if (message.getNetPermanceMonitor() != null) {
                message.getNetPermanceMonitor().setFailReason("session close");
                AppMonitor.getInstance().commitStat(message.getNetPermanceMonitor());
            }
        }
        String str = this.f7011c == 0 ? "service" : "inapp";
        String d2 = mo37662d();
        ALog.m7597d(d2, "spdySessionCloseCallback, conKeepTime:" + this.f7085I.live_time + " connectType:" + str, new Object[0]);
        UTMini instance = UTMini.getInstance();
        StringBuilder sb = new StringBuilder();
        sb.append("DISCONNECT CLOSE ");
        sb.append(str);
        instance.commitEvent(66001, sb.toString(), Integer.valueOf(i), Long.valueOf(this.f7085I.live_time), Integer.valueOf(Constants.SDK_VERSION_CODE), this.f7102y, this.f7088L);
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionConnectCB(SpdySession spdySession, SuperviseConnectInfo superviseConnectInfo) {
        this.f7083G = superviseConnectInfo.connectTime;
        int i = superviseConnectInfo.handshakeTime;
        ALog.m7599e(mo37662d(), "spdySessionConnectCB", "sessionConnectInterval", Integer.valueOf(this.f7083G), "sslTime", Integer.valueOf(i), "reuse", Integer.valueOf(superviseConnectInfo.sessionTicketReused));
        m7562r();
        this.f7085I.setRet(true);
        this.f7085I.onConnectStop();
        SessionMonitor sessionMonitor = this.f7085I;
        sessionMonitor.tcp_time = (long) this.f7083G;
        sessionMonitor.ssl_time = (long) i;
        String str = this.f7011c == 0 ? "service" : "inapp";
        UTMini instance = UTMini.getInstance();
        instance.commitEvent(66001, "CONNECTED " + str + " " + superviseConnectInfo.sessionTicketReused, String.valueOf(this.f7083G), String.valueOf(i), Integer.valueOf(Constants.SDK_VERSION_CODE), String.valueOf(superviseConnectInfo.sessionTicketReused), this.f7102y, this.f7088L);
        C3179k.m7666a("accs", BaseMonitor.ALARM_POINT_CONNECT, "");
    }

    @Override // org.android.spdy.SessionCb
    public void spdySessionFailedError(SpdySession spdySession, int i, Object obj) {
        if (spdySession != null) {
            try {
                spdySession.cleanUp();
            } catch (Exception e) {
                ALog.m7599e(mo37662d(), "session cleanUp has exception: " + e, new Object[0]);
            }
        }
        C3157a aVar = this.f7099v;
        int i2 = aVar != null ? aVar.f7104a : 0;
        ALog.m7599e(mo37662d(), "spdySessionFailedError", "retryTimes", Integer.valueOf(i2), "errorId", Integer.valueOf(i));
        this.f7087K = false;
        this.f7089M = true;
        m7553d(3);
        this.f7085I.setFailReason(i);
        this.f7085I.onConnectStop();
        String str = this.f7011c == 0 ? "service" : "inapp";
        UTMini.getInstance().commitEvent(66001, "DISCONNECT " + str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(Constants.SDK_VERSION_CODE), this.f7102y, this.f7088L);
        C3179k.m7668a("accs", BaseMonitor.ALARM_POINT_CONNECT, "retrytimes:" + i2, i + "", "");
    }

    @Override // org.android.spdy.Spdycb
    public void spdyStreamCloseCallback(SpdySession spdySession, long j, int i, Object obj, SuperviseData superviseData) {
        ALog.m7597d(mo37662d(), "spdyStreamCloseCallback", new Object[0]);
        if (i != 0) {
            ALog.m7599e(mo37662d(), "spdyStreamCloseCallback", "statusCode", Integer.valueOf(i));
            m7556e(i);
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: d */
    private void m7554d(String str) {
        SessionInfo sessionInfo;
        int i = this.f7097t;
        if (i != 2 && i != 1) {
            if (this.f7090N == null) {
                this.f7090N = new C3142g(mo37700o());
            }
            List<IConnStrategy> a = this.f7090N.mo37683a(mo37700o());
            int i2 = Constants.PORT;
            if (a == null || a.size() <= 0) {
                if (str != null) {
                    this.f7093p = str;
                } else {
                    this.f7093p = mo37700o();
                }
                if (System.currentTimeMillis() % 2 == 0) {
                    i2 = 80;
                }
                this.f7094q = i2;
                C3179k.m7667a("accs", BaseMonitor.COUNT_POINT_DNS, "localdns", AbstractC8352oOoOOoO0.OooO0O0);
                ALog.m7600i(mo37662d(), "connect get ip from amdc fail!!", new Object[0]);
            } else {
                for (IConnStrategy iConnStrategy : a) {
                    if (iConnStrategy != null) {
                        ALog.m7599e(mo37662d(), BaseMonitor.ALARM_POINT_CONNECT, "ip", iConnStrategy.getIp(), "port", Integer.valueOf(iConnStrategy.getPort()));
                    }
                }
                if (this.f7089M) {
                    this.f7090N.mo37684b();
                    this.f7089M = false;
                }
                IConnStrategy a2 = this.f7090N.mo37681a();
                this.f7093p = a2 == null ? mo37700o() : a2.getIp();
                if (a2 != null) {
                    i2 = a2.getPort();
                }
                this.f7094q = i2;
                C3179k.m7667a("accs", BaseMonitor.COUNT_POINT_DNS, "httpdns", AbstractC8352oOoOOoO0.OooO0O0);
                ALog.m7599e(mo37662d(), "connect from amdc succ", "ip", this.f7093p, "port", Integer.valueOf(this.f7094q), "originPos", Integer.valueOf(this.f7090N.mo37686c()));
            }
            this.f7101x = "https://" + this.f7093p + com.xiaomi.mipush.sdk.Constants.COLON_SEPARATOR + this.f7094q + "/accs/";
            ALog.m7599e(mo37662d(), BaseMonitor.ALARM_POINT_CONNECT, "URL", this.f7101x);
            this.f7091O = String.valueOf(System.currentTimeMillis());
            if (this.f7085I != null) {
                AppMonitor.getInstance().commitStat(this.f7085I);
            }
            SessionMonitor sessionMonitor = new SessionMonitor();
            this.f7085I = sessionMonitor;
            sessionMonitor.setConnectType(this.f7011c == 0 ? "service" : "inapp");
            if (this.f7103z != null) {
                try {
                    this.f7081E = System.currentTimeMillis();
                    this.f7082F = System.nanoTime();
                    this.f7095r = UtilityImpl.m7609a(this.f7012d);
                    this.f7096s = UtilityImpl.m7621b(this.f7012d);
                    this.f7079C = System.currentTimeMillis();
                    this.f7085I.onStartConnect();
                    m7553d(2);
                    synchronized (this.f7078B) {
                        try {
                            if (TextUtils.isEmpty(this.f7095r) || this.f7096s < 0 || !this.f7087K) {
                                ALog.m7599e(mo37662d(), "connect normal", new Object[0]);
                                String str2 = this.f7093p;
                                int i3 = this.f7094q;
                                sessionInfo = new SessionInfo(str2, i3, mo37700o() + "_" + this.f7010b, null, 0, this.f7091O, this, 4226);
                                this.f7088L = "";
                            } else {
                                ALog.m7599e(mo37662d(), BaseMonitor.ALARM_POINT_CONNECT, "proxy", this.f7095r, "port", Integer.valueOf(this.f7096s));
                                String str3 = this.f7093p;
                                int i4 = this.f7094q;
                                sessionInfo = new SessionInfo(str3, i4, mo37700o() + "_" + this.f7010b, this.f7095r, this.f7096s, this.f7091O, this, 4226);
                                this.f7088L = this.f7095r + com.xiaomi.mipush.sdk.Constants.COLON_SEPARATOR + this.f7096s;
                            }
                            sessionInfo.setPubKeySeqNum(m7561q());
                            sessionInfo.setConnectionTimeoutMs(AbstractC3137b.ACCS_RECEIVE_TIMEOUT);
                            this.f7077A = this.f7103z.createSession(sessionInfo);
                            this.f7085I.connection_stop_date = 0;
                            this.f7078B.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        } catch (Exception e2) {
                            e2.printStackTrace();
                            this.f7087K = false;
                        }
                    }
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
        }
    }

    @Override // com.taobao.accs.net.AbstractC3137b
    /* renamed from: c */
    public C3164c mo37659c() {
        if (this.f7086J == null) {
            this.f7086J = new C3164c();
        }
        C3164c cVar = this.f7086J;
        cVar.f7129b = this.f7011c;
        cVar.f7131d = this.f7098u.size();
        this.f7086J.f7136i = UtilityImpl.m7643k(this.f7012d);
        C3164c cVar2 = this.f7086J;
        cVar2.f7133f = this.f7088L;
        cVar2.f7128a = this.f7097t;
        SessionMonitor sessionMonitor = this.f7085I;
        int i = 0;
        cVar2.f7130c = sessionMonitor != null && sessionMonitor.getRet();
        this.f7086J.f7137j = mo37701p();
        C3164c cVar3 = this.f7086J;
        C3113d dVar = this.f7013e;
        if (dVar != null) {
            i = dVar.mo37598d();
        }
        cVar3.f7132e = i;
        C3164c cVar4 = this.f7086J;
        cVar4.f7134g = this.f7102y;
        return cVar4;
    }

    @Override // com.taobao.accs.net.AbstractC3137b
    /* renamed from: e */
    public void mo37663e() {
        super.mo37663e();
        this.f7100w = false;
        ThreadPoolExecutorFactory.getScheduledExecutor().execute(new RunnableC3159v(this));
        ALog.m7599e(mo37662d(), "shut down", new Object[0]);
    }

    @Override // com.taobao.accs.net.AbstractC3137b
    /* renamed from: b */
    public void mo37655b() {
        this.f7087K = false;
        this.f7014f = 0;
    }

    /* renamed from: e */
    private void m7556e(int i) {
        this.f7019k = null;
        mo37699n();
        C3157a aVar = this.f7099v;
        int i2 = aVar != null ? aVar.f7104a : 0;
        SessionMonitor sessionMonitor = this.f7085I;
        sessionMonitor.setCloseReason("code not 200 is" + i);
        this.f7089M = true;
        String str = this.f7011c == 0 ? "service" : "inapp";
        UTMini instance = UTMini.getInstance();
        instance.commitEvent(66001, "CONNECTED NO 200 " + str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(Constants.SDK_VERSION_CODE), this.f7102y, this.f7088L);
        C3179k.m7668a("accs", "auth", "", i + "", "");
    }

    @Override // com.taobao.accs.net.AbstractC3137b
    /* renamed from: a */
    public void mo37646a() {
        this.f7100w = true;
        ALog.m7597d(mo37662d(), ViewProps.START, new Object[0]);
        mo37647a(this.f7012d);
        if (this.f7099v == null) {
            ALog.m7600i(mo37662d(), "start thread", new Object[0]);
            C3157a aVar = new C3157a("NetworkThread_" + this.f7021m);
            this.f7099v = aVar;
            aVar.setPriority(2);
            this.f7099v.start();
        }
        mo37651a(false, false);
    }

    @Override // com.taobao.accs.net.AbstractC3137b
    /* renamed from: b */
    public String mo37654b(String str) {
        return "https://" + this.f7017i.getChannelHost();
    }

    @Override // com.taobao.accs.net.AbstractC3137b
    /* renamed from: a */
    public void mo37648a(Message message, boolean z) {
        if (!this.f7100w || message == null) {
            String d = mo37662d();
            ALog.m7599e(d, "not running or msg null! " + this.f7100w, new Object[0]);
            return;
        }
        try {
            if (ThreadPoolExecutorFactory.getScheduledExecutor().getQueue().size() <= 1000) {
                ScheduledFuture<?> schedule = ThreadPoolExecutorFactory.getScheduledExecutor().schedule(new RunnableC3158u(this, message, z), message.delyTime, TimeUnit.MILLISECONDS);
                if (message.getType() == 1 && message.cunstomDataId != null) {
                    if (message.isControlFrame()) {
                        mo37653a(message.cunstomDataId);
                    }
                    this.f7013e.f6943a.put(message.cunstomDataId, schedule);
                }
                if (message.getNetPermanceMonitor() != null) {
                    message.getNetPermanceMonitor().setDeviceId(UtilityImpl.m7644l(this.f7012d));
                    message.getNetPermanceMonitor().setConnType(this.f7011c);
                    message.getNetPermanceMonitor().onEnterQueueData();
                    return;
                }
                return;
            }
            throw new RejectedExecutionException("accs");
        } catch (RejectedExecutionException unused) {
            this.f7013e.mo37588a(message, ErrorCode.MESSAGE_QUEUE_FULL);
            String d2 = mo37662d();
            ALog.m7599e(d2, "send queue full count:" + ThreadPoolExecutorFactory.getScheduledExecutor().getQueue().size(), new Object[0]);
        } catch (Throwable th) {
            this.f7013e.mo37588a(message, -8);
            ALog.m7598e(mo37662d(), "send error", th, new Object[0]);
        }
    }

    @Override // com.taobao.accs.net.AbstractC3137b
    /* renamed from: a */
    public void mo37651a(boolean z, boolean z2) {
        String d = mo37662d();
        ALog.m7597d(d, "try ping, force:" + z, new Object[0]);
        if (this.f7011c == 1) {
            ALog.m7597d(mo37662d(), "INAPP, skip", new Object[0]);
        } else {
            mo37658b(Message.BuildPing(z, (int) (z2 ? Math.random() * 10.0d * 1000.0d : AbstractC8352oOoOOoO0.OooO0O0)), z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m7543a(Message message) {
        if (!(message.command == null || this.f7098u.size() == 0)) {
            for (int size = this.f7098u.size() - 1; size >= 0; size--) {
                Message message2 = this.f7098u.get(size);
                if (!(message2 == null || message2.command == null || !message2.getPackageName().equals(message.getPackageName()))) {
                    switch (message.command.intValue()) {
                        case 1:
                        case 2:
                            if (message2.command.intValue() == 1 || message2.command.intValue() == 2) {
                                this.f7098u.remove(size);
                                break;
                            }
                        case 3:
                        case 4:
                            if (message2.command.intValue() == 3 || message2.command.intValue() == 4) {
                                this.f7098u.remove(size);
                                break;
                            }
                        case 5:
                        case 6:
                            if (message2.command.intValue() == 5 || message2.command.intValue() == 6) {
                                this.f7098u.remove(size);
                                break;
                            }
                    }
                    ALog.m7597d(mo37662d(), "clearRepeatControlCommand message:" + message2.command + C8932ooOOO0o.OooO0OO + message2.getPackageName(), new Object[0]);
                }
            }
            C3113d dVar = this.f7013e;
            if (dVar != null) {
                dVar.mo37596b(message);
            }
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x0097 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00a3 */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009b A[SYNTHETIC, Splitter:B:38:0x009b] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m7553d(int r10) {
        /*
        // Method dump skipped, instructions count: 194
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.net.C3156t.m7553d(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
        if (android.text.TextUtils.isEmpty(r14) != false) goto L_0x0038;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0052  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m7546a(java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /*
        // Method dump skipped, instructions count: 177
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.net.C3156t.m7546a(java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    @Override // com.taobao.accs.net.AbstractC3137b
    /* renamed from: a */
    public void mo37650a(String str, boolean z, String str2) {
        try {
            m7553d(4);
            mo37699n();
            this.f7085I.setCloseReason(str2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.taobao.accs.net.AbstractC3137b
    /* renamed from: a */
    public boolean mo37653a(String str) {
        boolean z;
        synchronized (this.f7098u) {
            z = true;
            int size = this.f7098u.size() - 1;
            while (true) {
                if (size >= 0) {
                    Message message = this.f7098u.get(size);
                    if (message != null && message.getType() == 1 && message.cunstomDataId != null && message.cunstomDataId.equals(str)) {
                        this.f7098u.remove(size);
                        break;
                    }
                    size--;
                } else {
                    z = false;
                    break;
                }
            }
        }
        return z;
    }

    @Override // com.taobao.accs.net.AbstractC3137b
    /* renamed from: a */
    public void mo37647a(Context context) {
        if (!this.f7015g) {
            super.mo37647a(context);
            GlobalAppRuntimeInfo.setBackground(false);
            this.f7015g = true;
            ALog.m7600i(mo37662d(), "init awcn success!", new Object[0]);
        }
    }

    @Override // com.taobao.accs.net.AbstractC3137b
    /* renamed from: d */
    public String mo37662d() {
        return "SilenceConn_" + this.f7021m;
    }
}
