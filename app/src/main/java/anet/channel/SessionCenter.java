package anet.channel;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.LruCache;
import anet.channel.Config;
import anet.channel.entity.C0133c;
import anet.channel.entity.ConnType;
import anet.channel.entity.ENV;
import anet.channel.p008d.C0122a;
import anet.channel.p010f.C0135a;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.C0198l;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.IStrategyListener;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.dispatch.C0185a;
import anet.channel.util.ALog;
import anet.channel.util.AppLifecycle;
import anet.channel.util.C0229i;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpUrl;
import anet.channel.util.StringUtils;
import anet.channel.util.Utils;
import com.learnium.RNDeviceInfo.Util;
import com.p118pd.sdk.C7383o0OOO0O;
import com.p118pd.sdk.C7486o0OoO0oO;
import com.umeng.analytics.pro.C3416b;
import java.net.ConnectException;
import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;

public class SessionCenter {
    public static final String TAG = "awcn.SessionCenter";

    /* renamed from: a */
    public static Map<Config, SessionCenter> f64a = new HashMap();

    /* renamed from: j */
    public static boolean f65j = false;

    /* renamed from: b */
    public Context f66b = GlobalAppRuntimeInfo.getContext();

    /* renamed from: c */
    public String f67c;

    /* renamed from: d */
    public Config f68d;

    /* renamed from: e */
    public final C0121d f69e = new C0121d();

    /* renamed from: f */
    public final LruCache<String, SessionRequest> f70f = new LruCache<>(32);

    /* renamed from: g */
    public final C0111b f71g = new C0111b();

    /* renamed from: h */
    public final AccsSessionManager f72h;

    /* renamed from: i */
    public final C0103a f73i = new C0103a(this, null);

    public SessionCenter(Config config) {
        this.f68d = config;
        this.f67c = config.getAppkey();
        this.f73i.mo3379a();
        this.f72h = new AccsSessionManager(this);
        if (!config.getAppkey().equals("[default]")) {
            C0185a.m242a(new C0118c(this, config.getAppkey(), config.getSecurity()));
        }
    }

    /* renamed from: b */
    private void m19b(C0198l.C0200b bVar) {
        boolean z;
        boolean z2;
        ALog.m290i(TAG, "find effectNow", this.f67c, "host", bVar.f422a);
        C0198l.C0199a[] aVarArr = bVar.f429h;
        String[] strArr = bVar.f427f;
        for (Session session : this.f69e.mo3447a(mo3362a(StringUtils.buildKey(bVar.f424c, bVar.f422a)))) {
            if (!session.getConnType().isHttpType()) {
                int i = 0;
                while (true) {
                    if (i >= strArr.length) {
                        z = false;
                        break;
                    } else if (session.getIp().equals(strArr[i])) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
                if (!z) {
                    if (ALog.isPrintLog(2)) {
                        ALog.m290i(TAG, "ip not match", session.f53p, "session ip", session.getIp(), "ips", Arrays.toString(strArr));
                    }
                    session.close(true);
                } else {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= aVarArr.length) {
                            z2 = false;
                            break;
                        }
                        if (session.getPort() == aVarArr[i2].f414a && session.getConnType().equals(ConnType.valueOf(ConnProtocol.valueOf(aVarArr[i2])))) {
                            z2 = true;
                            break;
                        }
                        i2++;
                    }
                    if (!z2) {
                        if (ALog.isPrintLog(2)) {
                            ALog.m290i(TAG, "aisle not match", session.f53p, "port", Integer.valueOf(session.getPort()), "connType", session.getConnType(), "aisle", Arrays.toString(aVarArr));
                        }
                        session.close(true);
                    }
                }
            }
        }
    }

    public static void checkAndStartAccsSession() {
        for (SessionCenter sessionCenter : f64a.values()) {
            sessionCenter.f72h.checkAndStartSession();
        }
    }

    public static synchronized SessionCenter getInstance(String str) {
        SessionCenter instance;
        synchronized (SessionCenter.class) {
            Config configByTag = Config.getConfigByTag(str);
            if (configByTag != null) {
                instance = getInstance(configByTag);
            } else {
                throw new RuntimeException("tag not exist!");
            }
        }
        return instance;
    }

    public static synchronized void init(Context context) {
        synchronized (SessionCenter.class) {
            if (context != null) {
                GlobalAppRuntimeInfo.setContext(context.getApplicationContext());
                if (!f65j) {
                    f64a.put(Config.DEFAULT_CONFIG, new SessionCenter(Config.DEFAULT_CONFIG));
                    AppLifecycle.initialize();
                    NetworkStatusHelper.startListener(context);
                    StrategyCenter.getInstance().initialize(GlobalAppRuntimeInfo.getContext());
                    if (GlobalAppRuntimeInfo.isTargetProcess()) {
                        C0122a.m62a();
                        C0135a.m90a();
                    }
                    f65j = true;
                }
            } else {
                ALog.m289e(TAG, "context is null!", null, new Object[0]);
                throw new NullPointerException("init failed. context is null");
            }
        }
    }

    public static synchronized void switchEnvironment(ENV env) {
        synchronized (SessionCenter.class) {
            try {
                if (GlobalAppRuntimeInfo.getEnv() != env) {
                    ALog.m290i(TAG, "switch env", null, "old", GlobalAppRuntimeInfo.getEnv(), "new", env);
                    GlobalAppRuntimeInfo.setEnv(env);
                    StrategyCenter.getInstance().switchEnv();
                    SpdyAgent.getInstance(GlobalAppRuntimeInfo.getContext(), SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION).switchAccsServer(env == ENV.TEST ? 0 : 1);
                }
                Iterator<Map.Entry<Config, SessionCenter>> it = f64a.entrySet().iterator();
                while (it.hasNext()) {
                    SessionCenter value = it.next().getValue();
                    if (value.f68d.getEnv() != env) {
                        ALog.m290i(TAG, "remove instance", value.f67c, C7383o0OOO0O.OooO0O0, value.f68d.getEnv());
                        value.f72h.forceCloseSession(false);
                        value.f73i.mo3380b();
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                ALog.m288e(TAG, "switch env error.", null, th, new Object[0]);
            }
        }
        return;
    }

    public void asyncGet(HttpUrl httpUrl, int i, long j, SessionGetCallback sessionGetCallback) {
        if (sessionGetCallback == null) {
            throw new NullPointerException("cb is null");
        } else if (j > 0) {
            try {
                Session a = mo3361a(httpUrl, i, j, sessionGetCallback);
                if (a != null) {
                    sessionGetCallback.onSessionGetSuccess(a);
                }
            } catch (Exception unused) {
                sessionGetCallback.onSessionGetFail();
            }
        } else {
            throw new InvalidParameterException("timeout must > 0");
        }
    }

    @Deprecated
    public void enterBackground() {
        AppLifecycle.onBackground();
    }

    @Deprecated
    public void enterForeground() {
        AppLifecycle.onForeground();
    }

    public void forceRecreateAccsSession() {
        this.f72h.forceCloseSession(true);
    }

    public Session get(String str, long j) {
        return get(HttpUrl.parse(str), C0133c.f157c, j);
    }

    public Session getThrowsException(String str, long j) throws Exception {
        return mo3361a(HttpUrl.parse(str), C0133c.f157c, j, null);
    }

    public void registerPublicKey(String str, int i) {
        this.f71g.mo3414a(str, i);
    }

    public void registerSessionInfo(SessionInfo sessionInfo) {
        this.f71g.mo3413a(sessionInfo);
        if (sessionInfo.isKeepAlive) {
            this.f72h.checkAndStartSession();
        }
    }

    @Deprecated
    public synchronized void switchEnv(ENV env) {
        switchEnvironment(env);
    }

    public void unregisterSessionInfo(String str) {
        SessionInfo a = this.f71g.mo3411a(str);
        if (a != null && a.isKeepAlive) {
            this.f72h.checkAndStartSession();
        }
    }

    /* renamed from: anet.channel.SessionCenter$a */
    public class C0103a implements NetworkStatusHelper.INetworkStatusChangeListener, IStrategyListener, AppLifecycle.AppLifecycleListener {

        /* renamed from: a */
        public boolean f74a;

        public C0103a() {
            this.f74a = false;
        }

        /* renamed from: a */
        public void mo3379a() {
            AppLifecycle.registerLifecycleListener(this);
            NetworkStatusHelper.addStatusChangeListener(this);
            StrategyCenter.getInstance().registerListener(this);
        }

        /* renamed from: b */
        public void mo3380b() {
            StrategyCenter.getInstance().unregisterListener(this);
            AppLifecycle.unregisterLifecycleListener(this);
            NetworkStatusHelper.removeStatusChangeListener(this);
        }

        @Override // anet.channel.util.AppLifecycle.AppLifecycleListener
        public void background() {
            ALog.m290i(SessionCenter.TAG, "[background]", SessionCenter.this.f67c, new Object[0]);
            if (!SessionCenter.f65j) {
                ALog.m289e(SessionCenter.TAG, "background not inited!", SessionCenter.this.f67c, new Object[0]);
                return;
            }
            try {
                StrategyCenter.getInstance().saveData();
                if (Util.ROM_OPPO.equalsIgnoreCase(Build.BRAND)) {
                    ALog.m290i(SessionCenter.TAG, "close session for OPPO", SessionCenter.this.f67c, new Object[0]);
                    SessionCenter.this.f72h.forceCloseSession(false);
                }
            } catch (Exception unused) {
            }
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0054 */
        @Override // anet.channel.util.AppLifecycle.AppLifecycleListener
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void forground() {
            /*
                r7 = this;
                anet.channel.SessionCenter r0 = anet.channel.SessionCenter.this
                java.lang.String r0 = r0.f67c
                r1 = 0
                java.lang.Object[] r2 = new java.lang.Object[r1]
                java.lang.String r3 = "awcn.SessionCenter"
                java.lang.String r4 = "[forground]"
                anet.channel.util.ALog.m290i(r3, r4, r0, r2)
                anet.channel.SessionCenter r0 = anet.channel.SessionCenter.this
                android.content.Context r0 = r0.f66b
                if (r0 != 0) goto L_0x0015
                return
            L_0x0015:
                boolean r0 = r7.f74a
                if (r0 == 0) goto L_0x001a
                return
            L_0x001a:
                r0 = 1
                r7.f74a = r0
                boolean r2 = anet.channel.SessionCenter.m18a()
                if (r2 != 0) goto L_0x002f
                anet.channel.SessionCenter r0 = anet.channel.SessionCenter.this
                java.lang.String r0 = r0.f67c
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.String r2 = "forground not inited!"
                anet.channel.util.ALog.m289e(r3, r2, r0, r1)
                return
            L_0x002f:
                long r2 = anet.channel.util.AppLifecycle.lastEnterBackgroundTime     // Catch:{ Exception -> 0x0054, all -> 0x0057 }
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 == 0) goto L_0x004d
                long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0054, all -> 0x0057 }
                long r4 = anet.channel.util.AppLifecycle.lastEnterBackgroundTime     // Catch:{ Exception -> 0x0054, all -> 0x0057 }
                long r2 = r2 - r4
                r4 = 60000(0xea60, double:2.9644E-319)
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 <= 0) goto L_0x004d
                anet.channel.SessionCenter r2 = anet.channel.SessionCenter.this     // Catch:{ Exception -> 0x0054, all -> 0x0057 }
                anet.channel.AccsSessionManager r2 = r2.f72h     // Catch:{ Exception -> 0x0054, all -> 0x0057 }
                r2.forceCloseSession(r0)     // Catch:{ Exception -> 0x0054, all -> 0x0057 }
                goto L_0x0054
            L_0x004d:
                anet.channel.SessionCenter r0 = anet.channel.SessionCenter.this     // Catch:{ Exception -> 0x0054, all -> 0x0057 }
                anet.channel.AccsSessionManager r0 = r0.f72h     // Catch:{ Exception -> 0x0054, all -> 0x0057 }
                r0.checkAndStartSession()     // Catch:{ Exception -> 0x0054, all -> 0x0057 }
            L_0x0054:
                r7.f74a = r1     // Catch:{ Exception -> 0x005b }
                goto L_0x005b
            L_0x0057:
                r0 = move-exception
                r7.f74a = r1     // Catch:{ Exception -> 0x005b }
                throw r0     // Catch:{ Exception -> 0x005b }
            L_0x005b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: anet.channel.SessionCenter.C0103a.forground():void");
        }

        @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
        public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
            ALog.m289e(SessionCenter.TAG, "onNetworkStatusChanged.", SessionCenter.this.f67c, "networkStatus", networkStatus);
            List<SessionRequest> a = SessionCenter.this.f69e.mo3446a();
            if (!a.isEmpty()) {
                for (SessionRequest sessionRequest : a) {
                    ALog.m287d(SessionCenter.TAG, "network change, try recreate session", SessionCenter.this.f67c, new Object[0]);
                    sessionRequest.mo3393a((String) null);
                }
            }
            SessionCenter.this.f72h.checkAndStartSession();
        }

        @Override // anet.channel.strategy.IStrategyListener
        public void onStrategyUpdated(C0198l.C0202d dVar) {
            SessionCenter.this.m17a((SessionCenter) dVar);
            SessionCenter.this.f72h.checkAndStartSession();
        }

        public /* synthetic */ C0103a(SessionCenter sessionCenter, C0118c cVar) {
            this();
        }
    }

    @Deprecated
    public Session get(String str, ConnType.TypeLevel typeLevel, long j) {
        return get(HttpUrl.parse(str), typeLevel == ConnType.TypeLevel.SPDY ? C0133c.f155a : C0133c.f156b, j);
    }

    @Deprecated
    public Session getThrowsException(String str, ConnType.TypeLevel typeLevel, long j) throws Exception {
        return mo3361a(HttpUrl.parse(str), typeLevel == ConnType.TypeLevel.SPDY ? C0133c.f155a : C0133c.f156b, j, null);
    }

    /* renamed from: a */
    private SessionRequest m14a(HttpUrl httpUrl) {
        String cNameByHost = StrategyCenter.getInstance().getCNameByHost(httpUrl.host());
        if (cNameByHost == null) {
            cNameByHost = httpUrl.host();
        }
        String scheme = httpUrl.scheme();
        if (!httpUrl.isSchemeLocked()) {
            scheme = StrategyCenter.getInstance().getSchemeByHost(cNameByHost, scheme);
        }
        return mo3362a(StringUtils.concatString(scheme, HttpConstant.SCHEME_SPLIT, cNameByHost));
    }

    @Deprecated
    public Session get(HttpUrl httpUrl, ConnType.TypeLevel typeLevel, long j) {
        return get(httpUrl, typeLevel == ConnType.TypeLevel.SPDY ? C0133c.f155a : C0133c.f156b, j);
    }

    public Session getThrowsException(HttpUrl httpUrl, int i, long j) throws Exception {
        return mo3361a(httpUrl, i, j, null);
    }

    public static synchronized SessionCenter getInstance(Config config) {
        SessionCenter sessionCenter;
        Context appContext;
        synchronized (SessionCenter.class) {
            if (config != null) {
                if (!f65j && (appContext = Utils.getAppContext()) != null) {
                    init(appContext);
                }
                sessionCenter = f64a.get(config);
                if (sessionCenter == null) {
                    sessionCenter = new SessionCenter(config);
                    f64a.put(config, sessionCenter);
                }
            } else {
                throw new NullPointerException("config is null!");
            }
        }
        return sessionCenter;
    }

    public Session get(HttpUrl httpUrl, int i, long j) {
        try {
            return mo3361a(httpUrl, i, j, null);
        } catch (InvalidParameterException e) {
            ALog.m288e(TAG, "[Get]param url is invalid", this.f67c, e, "url", httpUrl);
            return null;
        } catch (TimeoutException e2) {
            ALog.m288e(TAG, "[Get]timeout exception", this.f67c, e2, "url", httpUrl.urlString());
            return null;
        } catch (ConnectException e3) {
            ALog.m289e(TAG, "[Get]connect exception", this.f67c, "errMsg", e3.getMessage(), "url", httpUrl.urlString());
            return null;
        } catch (NoAvailStrategyException e4) {
            ALog.m290i(TAG, "[Get]" + e4.getMessage(), this.f67c, null, "url", httpUrl.urlString());
            return null;
        } catch (Exception e5) {
            ALog.m288e(TAG, "[Get]" + e5.getMessage(), this.f67c, null, "url", httpUrl.urlString());
            return null;
        }
    }

    @Deprecated
    public Session getThrowsException(HttpUrl httpUrl, ConnType.TypeLevel typeLevel, long j) throws Exception {
        return mo3361a(httpUrl, typeLevel == ConnType.TypeLevel.SPDY ? C0133c.f155a : C0133c.f156b, j, null);
    }

    /* renamed from: a */
    public Session mo3361a(HttpUrl httpUrl, int i, long j, SessionGetCallback sessionGetCallback) throws Exception {
        SessionInfo b;
        if (!f65j) {
            ALog.m289e(TAG, "getInternal not inited!", this.f67c, new Object[0]);
            throw new IllegalStateException("getInternal not inited");
        } else if (httpUrl != null) {
            String str = this.f67c;
            Object[] objArr = new Object[6];
            objArr[0] = "u";
            objArr[1] = httpUrl.urlString();
            objArr[2] = "sessionType";
            objArr[3] = i == C0133c.f155a ? "LongLink" : "ShortLink";
            objArr[4] = C7486o0OoO0oO.f20312OooO0Oo;
            objArr[5] = Long.valueOf(j);
            ALog.m287d(TAG, "getInternal", str, objArr);
            SessionRequest a = m14a(httpUrl);
            Session a2 = this.f69e.mo3445a(a, i);
            if (a2 != null) {
                ALog.m287d(TAG, "get internal hit cache session", this.f67c, C3416b.f8468at, a2);
            } else if (this.f68d != Config.DEFAULT_CONFIG || i == C0133c.f156b) {
                if (!GlobalAppRuntimeInfo.isAppBackground() || i != C0133c.f155a || !AwcnConfig.isAccsSessionCreateForbiddenInBg() || (b = this.f71g.mo3415b(httpUrl.host())) == null || !b.isAccs) {
                    a.mo3389a(this.f66b, i, C0229i.m330a(this.f67c), sessionGetCallback, j);
                    if (sessionGetCallback == null && j > 0 && (i == C0133c.f157c || a.mo3395b() == i)) {
                        a.mo3388a(j);
                        a2 = this.f69e.mo3445a(a, i);
                        if (a2 == null) {
                            throw new ConnectException("session connecting failed or timeout");
                        }
                    }
                } else {
                    ALog.m292w(TAG, "app background, forbid to create accs session", this.f67c, new Object[0]);
                    throw new ConnectException("accs session connecting forbidden in background");
                }
            } else if (sessionGetCallback == null) {
                return null;
            } else {
                sessionGetCallback.onSessionGetFail();
                return null;
            }
            return a2;
        } else {
            throw new InvalidParameterException("httpUrl is null");
        }
    }

    @Deprecated
    public static synchronized SessionCenter getInstance() {
        Context appContext;
        synchronized (SessionCenter.class) {
            if (!f65j && (appContext = Utils.getAppContext()) != null) {
                init(appContext);
            }
            SessionCenter sessionCenter = null;
            for (Map.Entry<Config, SessionCenter> entry : f64a.entrySet()) {
                SessionCenter value = entry.getValue();
                if (entry.getKey() != Config.DEFAULT_CONFIG) {
                    return value;
                }
                sessionCenter = value;
            }
            return sessionCenter;
        }
    }

    @Deprecated
    public static synchronized void init(Context context, String str) {
        synchronized (SessionCenter.class) {
            init(context, str, GlobalAppRuntimeInfo.getEnv());
        }
    }

    public static synchronized void init(Context context, String str, ENV env) {
        synchronized (SessionCenter.class) {
            if (context != null) {
                Config config = Config.getConfig(str, env);
                if (config == null) {
                    config = new Config.Builder().setAppkey(str).setEnv(env).build();
                }
                init(context, config);
            } else {
                ALog.m289e(TAG, "context is null!", null, new Object[0]);
                throw new NullPointerException("init failed. context is null");
            }
        }
    }

    public static synchronized void init(Context context, Config config) {
        synchronized (SessionCenter.class) {
            if (context == null) {
                ALog.m289e(TAG, "context is null!", null, new Object[0]);
                throw new NullPointerException("init failed. context is null");
            } else if (config != null) {
                init(context);
                if (!f64a.containsKey(config)) {
                    f64a.put(config, new SessionCenter(config));
                }
            } else {
                ALog.m289e(TAG, "paramter config is null!", null, new Object[0]);
                throw new NullPointerException("init failed. config is null");
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m17a(C0198l.C0202d dVar) {
        try {
            C0198l.C0200b[] bVarArr = dVar.f436b;
            for (C0198l.C0200b bVar : bVarArr) {
                if (bVar.f432k) {
                    m19b(bVar);
                }
                if (bVar.f426e != null) {
                    m16a(bVar);
                }
            }
        } catch (Exception e) {
            ALog.m288e(TAG, "checkStrategy failed", this.f67c, e, new Object[0]);
        }
    }

    /* renamed from: a */
    private void m16a(C0198l.C0200b bVar) {
        for (Session session : this.f69e.mo3447a(mo3362a(StringUtils.buildKey(bVar.f424c, bVar.f422a)))) {
            if (!StringUtils.isStringEqual(session.f49l, bVar.f426e)) {
                ALog.m290i(TAG, "unit change", session.f53p, "session unit", session.f49l, "unit", bVar.f426e);
                session.close(true);
            }
        }
    }

    /* renamed from: a */
    public SessionRequest mo3362a(String str) {
        SessionRequest sessionRequest;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f70f) {
            sessionRequest = this.f70f.get(str);
            if (sessionRequest == null) {
                sessionRequest = new SessionRequest(str, this);
                this.f70f.put(str, sessionRequest);
            }
        }
        return sessionRequest;
    }
}
