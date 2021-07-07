package com.p118pd.sdk;

import android.text.TextUtils;
import anet.channel.Config;
import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.NoAvailStrategyException;
import anet.channel.Session;
import anet.channel.SessionCenter;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.bytes.ByteArray;
import anet.channel.entity.C0131a;
import anet.channel.entity.C0133c;
import anet.channel.entity.ENV;
import anet.channel.request.Cancelable;
import anet.channel.request.Request;
import anet.channel.session.C0166d;
import anet.channel.statist.ExceptionStatistic;
import anet.channel.statist.RequestStatistic;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.AppLifecycle;
import anet.channel.util.ErrorConstant;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpUrl;
import anet.channel.util.StringUtils;
import anetwork.channel.aidl.DefaultFinishEvent;
import anetwork.channel.cache.Cache;
import anetwork.channel.http.NetworkSdkSetting;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.pd.sdk.o0OOoooO  reason: case insensitive filesystem */
public class C7446o0OOoooO implements AbstractRunnableC7374o0OO0o0O {
    public static final int o0ooOOo = 131072;
    public static final String o0ooOoO = "anet.NetworkTask";
    public volatile Cancelable OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Cache.Entry f20276OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Cache f20277OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C7360o0OO f20278OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO00o f20279OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ByteArrayOutputStream f20280OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public volatile AtomicBoolean f20281OooO00o = null;
    public volatile boolean OooO0O0 = false;
    public boolean OooO0OO = false;
    public boolean OooO0Oo = false;
    public int o00oO0O = 0;
    public int o0ooOO0 = 0;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public String f20282o0ooOOo = DispatchConstants.OTHER;

    public C7446o0OOoooO(C7360o0OO o0oo, Cache cache, Cache.Entry entry) {
        this.f20278OooO00o = o0oo;
        this.f20281OooO00o = o0oo.f20102OooO00o;
        this.f20277OooO00o = cache;
        this.f20276OooO00o = entry;
        this.f20282o0ooOOo = o0oo.f20099OooO00o.m19130OooO00o().get(HttpConstant.F_REFER);
    }

    @Override // anet.channel.request.Cancelable
    public void cancel() {
        this.OooO0O0 = true;
        if (this.OooO00o != null) {
            this.OooO00o.cancel();
        }
    }

    public void run() {
        if (!this.OooO0O0) {
            RequestStatistic requestStatistic = this.f20278OooO00o.f20099OooO00o.f20340OooO00o;
            requestStatistic.f_refer = this.f20282o0ooOOo;
            if (!NetworkStatusHelper.isConnected()) {
                if (!C7348o0O0oo.OooO0oO() || requestStatistic.statusCode == -200) {
                    if (ALog.isPrintLog(2)) {
                        ALog.m290i(o0ooOoO, "network unavailable", this.f20278OooO00o.f20100OooO00o, "NetworkStatus", NetworkStatusHelper.getStatus());
                    }
                    this.f20281OooO00o.set(true);
                    this.f20278OooO00o.OooO00o();
                    requestStatistic.isDone.set(true);
                    requestStatistic.statusCode = ErrorConstant.ERROR_NO_NETWORK;
                    requestStatistic.msg = ErrorConstant.getErrMsg(ErrorConstant.ERROR_NO_NETWORK);
                    requestStatistic.rspEnd = System.currentTimeMillis();
                    this.f20278OooO00o.OooO00o.OooO00o(new DefaultFinishEvent(ErrorConstant.ERROR_NO_NETWORK, null, requestStatistic));
                    return;
                }
                requestStatistic.statusCode = ErrorConstant.ERROR_NO_NETWORK;
                ThreadPoolExecutorFactory.submitScheduledTask(new RunnableC7378o0OO0oOo(this), 1000, TimeUnit.MILLISECONDS);
            } else if (!C7348o0O0oo.m18856OooO0O0() || !GlobalAppRuntimeInfo.isAppBackground() || AppLifecycle.lastEnterBackgroundTime <= 0 || System.currentTimeMillis() - AppLifecycle.lastEnterBackgroundTime <= ((long) C7348o0O0oo.OooO00o()) || C7348o0O0oo.OooO0O0(this.f20278OooO00o.f20099OooO00o.m19128OooO00o())) {
                if (ALog.isPrintLog(2)) {
                    C7360o0OO o0oo = this.f20278OooO00o;
                    ALog.m290i(o0ooOoO, "exec request", o0oo.f20100OooO00o, "retryTimes", Integer.valueOf(o0oo.f20099OooO00o.OooO0OO));
                }
                if (C7348o0O0oo.m18857OooO0OO()) {
                    m19066OooO00o();
                    return;
                }
                try {
                    Session OooO00o2 = OooO00o();
                    if (OooO00o2 != null) {
                        OooO00o(OooO00o2, this.f20278OooO00o.f20099OooO00o.m19127OooO00o());
                    }
                } catch (Exception e) {
                    ALog.m288e(o0ooOoO, "send request failed.", this.f20278OooO00o.f20100OooO00o, e, new Object[0]);
                }
            } else {
                this.f20281OooO00o.set(true);
                this.f20278OooO00o.OooO00o();
                if (ALog.isPrintLog(2)) {
                    C7360o0OO o0oo2 = this.f20278OooO00o;
                    ALog.m290i(o0ooOoO, "request forbidden in background", o0oo2.f20100OooO00o, "url", o0oo2.f20099OooO00o.m19128OooO00o());
                }
                requestStatistic.isDone.set(true);
                requestStatistic.statusCode = ErrorConstant.ERROR_REQUEST_FORBIDDEN_IN_BG;
                requestStatistic.msg = ErrorConstant.getErrMsg(ErrorConstant.ERROR_REQUEST_FORBIDDEN_IN_BG);
                requestStatistic.rspEnd = System.currentTimeMillis();
                this.f20278OooO00o.OooO00o.OooO00o(new DefaultFinishEvent(ErrorConstant.ERROR_REQUEST_FORBIDDEN_IN_BG, null, requestStatistic));
                ExceptionStatistic exceptionStatistic = new ExceptionStatistic(ErrorConstant.ERROR_REQUEST_FORBIDDEN_IN_BG, null, "rt");
                exceptionStatistic.host = this.f20278OooO00o.f20099OooO00o.m19128OooO00o().host();
                exceptionStatistic.url = this.f20278OooO00o.f20099OooO00o.m19129OooO00o();
                AppMonitor.getInstance().commitStat(exceptionStatistic);
            }
        }
    }

    /* renamed from: com.pd.sdk.o0OOoooO$OooO00o */
    public static class OooO00o {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public List<ByteArray> f20283OooO00o = new ArrayList();

        /* renamed from: OooO00o  reason: collision with other field name */
        public Map<String, List<String>> f20284OooO00o;

        public OooO00o(int i, Map<String, List<String>> map) {
            this.OooO00o = i;
            this.f20284OooO00o = map;
        }

        public void OooO00o() {
            for (ByteArray byteArray : this.f20283OooO00o) {
                byteArray.recycle();
            }
        }

        public int OooO00o(AbstractC7369o0OO0O0 o0oo0o0, int i) {
            o0oo0o0.onResponseCode(this.OooO00o, this.f20284OooO00o);
            int i2 = 1;
            for (ByteArray byteArray : this.f20283OooO00o) {
                o0oo0o0.OooO00o(i2, i, byteArray);
                i2++;
            }
            return i2;
        }
    }

    private HttpUrl OooO00o(HttpUrl httpUrl) {
        HttpUrl parse;
        String str = this.f20278OooO00o.f20099OooO00o.m19130OooO00o().get(HttpConstant.X_HOST_CNAME);
        return (TextUtils.isEmpty(str) || (parse = HttpUrl.parse(httpUrl.urlString().replaceFirst(httpUrl.host(), str))) == null) ? httpUrl : parse;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private SessionCenter m19065OooO00o() {
        String OooO00o2 = this.f20278OooO00o.f20099OooO00o.OooO00o("APPKEY");
        if (TextUtils.isEmpty(OooO00o2)) {
            return SessionCenter.getInstance();
        }
        ENV env = ENV.ONLINE;
        String OooO00o3 = this.f20278OooO00o.f20099OooO00o.OooO00o(C7383o0OOO0O.OooO0O0);
        if (C7383o0OOO0O.OooOO0o.equalsIgnoreCase(OooO00o3)) {
            env = ENV.PREPARE;
        } else if (C7383o0OOO0O.OooOOO0.equalsIgnoreCase(OooO00o3)) {
            env = ENV.TEST;
        }
        if (env != NetworkSdkSetting.CURRENT_ENV) {
            NetworkSdkSetting.CURRENT_ENV = env;
            SessionCenter.switchEnvironment(env);
        }
        Config config = Config.getConfig(OooO00o2, env);
        if (config == null) {
            config = new Config.Builder().setAppkey(OooO00o2).setEnv(env).setAuthCode(this.f20278OooO00o.f20099OooO00o.OooO00o(C7383o0OOO0O.OooO0OO)).build();
        }
        return SessionCenter.getInstance(config);
    }

    private Session OooO00o() {
        Session session;
        SessionCenter OooO00o2 = m19065OooO00o();
        HttpUrl OooO00o3 = this.f20278OooO00o.f20099OooO00o.m19128OooO00o();
        boolean containsNonDefaultPort = OooO00o3.containsNonDefaultPort();
        C7503o0OoOoO o0ooooo = this.f20278OooO00o.f20099OooO00o;
        RequestStatistic requestStatistic = o0ooooo.f20340OooO00o;
        if (o0ooooo.OooO0o != 1 || !C7348o0O0oo.OooOO0() || this.f20278OooO00o.f20099OooO00o.OooO0OO != 0 || containsNonDefaultPort) {
            return OooO00o(null, OooO00o2, OooO00o3, containsNonDefaultPort);
        }
        HttpUrl OooO00o4 = OooO00o(OooO00o3);
        try {
            session = OooO00o2.getThrowsException(OooO00o4, C0133c.f155a, 0);
        } catch (NoAvailStrategyException unused) {
            return OooO00o(null, OooO00o2, OooO00o3, containsNonDefaultPort);
        } catch (Exception unused2) {
            session = null;
        }
        if (session == null) {
            ThreadPoolExecutorFactory.submitPriorityTask(new RunnableC7379o0OO0oo0(this, OooO00o2, OooO00o4, requestStatistic, OooO00o3, containsNonDefaultPort), ThreadPoolExecutorFactory.Priority.NORMAL);
            return null;
        }
        ALog.m290i(o0ooOoO, "tryGetSession", this.f20278OooO00o.f20100OooO00o, "Session", session);
        requestStatistic.spdyRequestSend = true;
        return session;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m19066OooO00o() {
        SessionCenter OooO00o2 = m19065OooO00o();
        HttpUrl OooO00o3 = this.f20278OooO00o.f20099OooO00o.m19128OooO00o();
        boolean containsNonDefaultPort = OooO00o3.containsNonDefaultPort();
        C7503o0OoOoO o0ooooo = this.f20278OooO00o.f20099OooO00o;
        RequestStatistic requestStatistic = o0ooooo.f20340OooO00o;
        Request OooO00o4 = o0ooooo.m19127OooO00o();
        if (this.f20278OooO00o.f20099OooO00o.OooO0o != 1 || !C7348o0O0oo.OooOO0() || this.f20278OooO00o.f20099OooO00o.OooO0OO != 0 || containsNonDefaultPort) {
            OooO00o(OooO00o(null, OooO00o2, OooO00o3, containsNonDefaultPort), OooO00o4);
            return;
        }
        OooO00o2.asyncGet(OooO00o(OooO00o3), C0133c.f155a, 3000, new C7380o0OO0ooO(this, requestStatistic, System.currentTimeMillis(), OooO00o4, OooO00o2, OooO00o3, containsNonDefaultPort));
    }

    /* access modifiers changed from: private */
    public Session OooO00o(Session session, SessionCenter sessionCenter, HttpUrl httpUrl, boolean z) {
        C7503o0OoOoO o0ooooo = this.f20278OooO00o.f20099OooO00o;
        RequestStatistic requestStatistic = o0ooooo.f20340OooO00o;
        if (session == null && o0ooooo.OooO0OO() && !z && !NetworkStatusHelper.isProxy()) {
            session = sessionCenter.get(httpUrl, C0133c.f156b, 0);
        }
        if (session == null) {
            ALog.m290i(o0ooOoO, "create HttpSession with local DNS", this.f20278OooO00o.f20100OooO00o, new Object[0]);
            session = new C0166d(GlobalAppRuntimeInfo.getContext(), new C0131a(StringUtils.concatString(httpUrl.scheme(), HttpConstant.SCHEME_SPLIT, httpUrl.host()), this.f20278OooO00o.f20100OooO00o, null));
        }
        if (requestStatistic.spdyRequestSend) {
            requestStatistic.degraded = 1;
        }
        ALog.m290i(o0ooOoO, "tryGetHttpSession", this.f20278OooO00o.f20100OooO00o, "Session", session);
        return session;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private anet.channel.request.Request OooO00o(anet.channel.request.Request r7) {
        /*
        // Method dump skipped, instructions count: 139
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C7446o0OOoooO.OooO00o(anet.channel.request.Request):anet.channel.request.Request");
    }

    /* access modifiers changed from: private */
    public void OooO00o(Session session, Request request) {
        if (session != null && !this.OooO0O0) {
            Request OooO00o2 = OooO00o(request);
            RequestStatistic requestStatistic = this.f20278OooO00o.f20099OooO00o.f20340OooO00o;
            requestStatistic.reqStart = System.currentTimeMillis();
            this.OooO00o = session.request(OooO00o2, new C7381o0OO0ooo(this, OooO00o2, requestStatistic));
        }
    }
}
