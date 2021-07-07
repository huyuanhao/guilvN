package anet.channel;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.entity.C0131a;
import anet.channel.entity.C0132b;
import anet.channel.entity.ConnType;
import anet.channel.entity.EventCb;
import anet.channel.request.Cancelable;
import anet.channel.request.Request;
import anet.channel.statist.SessionStatistic;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpHelper;
import anet.channel.util.StringUtils;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.android.spdy.SpdyAgent;
import org.android.spdy.SpdySessionKind;
import org.android.spdy.SpdyVersion;

public abstract class Session implements Comparable<Session> {

    /* renamed from: v */
    public static ExecutorService f37v = Executors.newSingleThreadExecutor();

    /* renamed from: a */
    public Context f38a;

    /* renamed from: b */
    public Map<EventCb, Integer> f39b = new LinkedHashMap();

    /* renamed from: c */
    public String f40c;

    /* renamed from: d */
    public String f41d;

    /* renamed from: e */
    public String f42e;

    /* renamed from: f */
    public String f43f;

    /* renamed from: g */
    public int f44g;

    /* renamed from: h */
    public String f45h;

    /* renamed from: i */
    public int f46i;

    /* renamed from: j */
    public ConnType f47j;

    /* renamed from: k */
    public IConnStrategy f48k;

    /* renamed from: l */
    public String f49l;

    /* renamed from: m */
    public boolean f50m;

    /* renamed from: n */
    public int f51n;

    /* renamed from: o */
    public Runnable f52o;

    /* renamed from: p */
    public final String f53p;

    /* renamed from: q */
    public final SessionStatistic f54q;

    /* renamed from: r */
    public int f55r;

    /* renamed from: s */
    public int f56s;

    /* renamed from: t */
    public boolean f57t;

    /* renamed from: u */
    public boolean f58u;

    /* renamed from: w */
    public boolean f59w;

    /* renamed from: x */
    public Future<?> f60x;

    /* renamed from: y */
    public List<Long> f61y;

    /* renamed from: z */
    public long f62z;

    /* renamed from: anet.channel.Session$a */
    public static class C0102a {
        public static final int AUTHING = 3;
        public static final int AUTH_FAIL = 5;
        public static final int AUTH_SUCC = 4;
        public static final int CONNECTED = 0;
        public static final int CONNECTING = 1;
        public static final int CONNETFAIL = 2;
        public static final int DISCONNECTED = 6;
        public static final int DISCONNECTING = 7;

        /* renamed from: a */
        public static final String[] f63a = {"CONNECTED", "CONNECTING", "CONNETFAIL", "AUTHING", "AUTH_SUCC", "AUTH_FAIL", "DISCONNECTED", "DISCONNECTING"};

        /* renamed from: a */
        public static String m13a(int i) {
            return f63a[i];
        }
    }

    public Session(Context context, C0131a aVar) {
        boolean z = false;
        this.f59w = false;
        this.f49l = null;
        this.f50m = false;
        this.f51n = 6;
        this.f57t = false;
        this.f58u = true;
        this.f61y = null;
        this.f62z = 0;
        this.f38a = context;
        String a = aVar.mo3484a();
        this.f42e = a;
        this.f43f = a;
        this.f44g = aVar.mo3485b();
        this.f47j = aVar.mo3486c();
        String f = aVar.mo3489f();
        this.f40c = f;
        this.f41d = f.substring(f.indexOf(HttpConstant.SCHEME_SPLIT) + 3);
        this.f56s = aVar.mo3488e();
        this.f55r = aVar.mo3487d();
        IConnStrategy iConnStrategy = aVar.f147a;
        this.f48k = iConnStrategy;
        if (iConnStrategy != null && iConnStrategy.getIpType() == -1) {
            z = true;
        }
        this.f50m = z;
        this.f53p = aVar.mo3491h();
        SessionStatistic sessionStatistic = new SessionStatistic(aVar);
        this.f54q = sessionStatistic;
        sessionStatistic.host = this.f41d;
    }

    public static void configTnetALog(Context context, String str, int i, int i2) {
        SpdyAgent instance = SpdyAgent.getInstance(context, SpdyVersion.SPDY3, SpdySessionKind.NONE_SESSION);
        if (instance == null || !SpdyAgent.checkLoadSucc()) {
            ALog.m289e("agent null or configTnetALog load so fail!!!", null, "loadso", Boolean.valueOf(SpdyAgent.checkLoadSucc()));
            return;
        }
        instance.configLogFile(str, i, i2);
    }

    /* renamed from: a */
    public void mo3334a() {
        Future<?> future;
        if (this.f52o != null && (future = this.f60x) != null) {
            future.cancel(true);
        }
    }

    public void checkAvailable() {
        ping(true);
    }

    public abstract void close();

    public void close(boolean z) {
        this.f57t = z;
        close();
    }

    public void connect() {
    }

    public IConnStrategy getConnStrategy() {
        return this.f48k;
    }

    public ConnType getConnType() {
        return this.f47j;
    }

    public String getHost() {
        return this.f40c;
    }

    public String getIp() {
        return this.f42e;
    }

    public int getPort() {
        return this.f44g;
    }

    public String getRealHost() {
        return this.f41d;
    }

    public abstract Runnable getRecvTimeOutRunnable();

    public String getUnit() {
        return this.f49l;
    }

    public void handleCallbacks(int i, C0132b bVar) {
        f37v.submit(new RunnableC0107a(this, i, bVar));
    }

    public void handleResponseCode(Request request, int i) {
        if (request.getHeaders().containsKey(HttpConstant.X_PV) && i >= 500 && i < 600) {
            synchronized (this) {
                if (this.f61y == null) {
                    this.f61y = new LinkedList();
                }
                if (this.f61y.size() < 5) {
                    this.f61y.add(Long.valueOf(System.currentTimeMillis()));
                } else {
                    long longValue = this.f61y.remove(0).longValue();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - longValue <= 60000) {
                        StrategyCenter.getInstance().forceRefreshStrategy(request.getHost());
                        this.f61y.clear();
                    } else {
                        this.f61y.add(Long.valueOf(currentTimeMillis));
                    }
                }
            }
        }
    }

    public void handleResponseHeaders(Request request, Map<String, List<String>> map) {
        try {
            if (map.containsKey(HttpConstant.X_SWITCH_UNIT)) {
                String singleHeaderFieldByKey = HttpHelper.getSingleHeaderFieldByKey(map, HttpConstant.X_SWITCH_UNIT);
                if (TextUtils.isEmpty(singleHeaderFieldByKey)) {
                    singleHeaderFieldByKey = null;
                }
                if (!StringUtils.isStringEqual(this.f49l, singleHeaderFieldByKey)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (currentTimeMillis - this.f62z > 60000) {
                        StrategyCenter.getInstance().forceRefreshStrategy(request.getHost());
                        this.f62z = currentTimeMillis;
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public abstract boolean isAvailable();

    public synchronized void notifyStatus(int i, C0132b bVar) {
        ALog.m289e("awcn.Session", "notifyStatus", this.f53p, "status", C0102a.m13a(i));
        if (i == this.f51n) {
            ALog.m290i("awcn.Session", "ignore notifyStatus", this.f53p, new Object[0]);
            return;
        }
        this.f51n = i;
        if (i == 0) {
            handleCallbacks(1, bVar);
        } else if (i == 2) {
            handleCallbacks(256, bVar);
        } else if (i == 4) {
            this.f49l = StrategyCenter.getInstance().getUnitByHost(this.f41d);
            handleCallbacks(512, bVar);
        } else if (i == 5) {
            handleCallbacks(1024, bVar);
        } else if (i == 6) {
            onDisconnect();
            if (!this.f59w) {
                handleCallbacks(2, bVar);
            }
        }
    }

    public void onDisconnect() {
    }

    public void ping(boolean z) {
    }

    public void registerEventcb(int i, EventCb eventCb) {
        Map<EventCb, Integer> map = this.f39b;
        if (map != null) {
            map.put(eventCb, Integer.valueOf(i));
        }
    }

    public abstract Cancelable request(Request request, RequestCb requestCb);

    public void sendCustomFrame(int i, byte[] bArr, int i2) {
    }

    public void setPingTimeout() {
        if (this.f52o == null) {
            this.f52o = getRecvTimeOutRunnable();
        }
        mo3334a();
        Runnable runnable = this.f52o;
        if (runnable != null) {
            this.f60x = ThreadPoolExecutorFactory.submitScheduledTask(runnable, (long) this.f56s, TimeUnit.MILLISECONDS);
        }
    }

    public String toString() {
        return "Session@[" + this.f53p + '|' + this.f47j + ']';
    }

    public int compareTo(Session session) {
        return ConnType.compare(this.f47j, session.f47j);
    }
}
