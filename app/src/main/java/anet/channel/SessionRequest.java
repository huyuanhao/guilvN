package anet.channel;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.entity.C0131a;
import anet.channel.entity.C0133c;
import anet.channel.entity.ConnType;
import anet.channel.entity.EventType;
import anet.channel.session.C0166d;
import anet.channel.session.TnetSpdySession;
import anet.channel.statist.AlarmObject;
import anet.channel.statist.SessionConnStat;
import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.StrategyCenter;
import anet.channel.strategy.utils.C0209c;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.C0223c;
import anet.channel.util.C0229i;
import anet.channel.util.HttpConstant;
import anet.channel.util.HttpUrl;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.C3178j;
import com.umeng.analytics.pro.C3416b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

public class SessionRequest {

    /* renamed from: a */
    public SessionCenter f76a;

    /* renamed from: b */
    public C0121d f77b;

    /* renamed from: c */
    public volatile boolean f78c = false;

    /* renamed from: d */
    public volatile Session f79d;

    /* renamed from: e */
    public volatile boolean f80e = false;

    /* renamed from: f */
    public HashMap<SessionGetCallback, RunnableC0106c> f81f = new HashMap<>();

    /* renamed from: g */
    public SessionConnStat f82g = null;

    /* renamed from: h */
    public String f83h;

    /* renamed from: i */
    public String f84i;

    /* renamed from: j */
    public SessionInfo f85j;

    /* renamed from: k */
    public volatile Future f86k;

    /* renamed from: l */
    public Object f87l = new Object();

    public interface IConnCb {
        void onDisConnect(Session session, long j, int i);

        void onFailed(Session session, long j, int i, int i2);

        void onSuccess(Session session, long j);
    }

    /* renamed from: anet.channel.SessionRequest$a */
    public class C0104a implements IConnCb {

        /* renamed from: a */
        public boolean f88a = false;

        /* renamed from: c */
        public Context f90c;

        /* renamed from: d */
        public List<C0131a> f91d;

        /* renamed from: e */
        public C0131a f92e;

        public C0104a(Context context, List<C0131a> list, C0131a aVar) {
            this.f90c = context;
            this.f91d = list;
            this.f92e = aVar;
        }

        @Override // anet.channel.SessionRequest.IConnCb
        public void onDisConnect(Session session, long j, int i) {
            boolean isAppBackground = GlobalAppRuntimeInfo.isAppBackground();
            ALog.m287d("awcn.SessionRequest", "Connect Disconnect", this.f92e.mo3491h(), C3416b.f8468at, session, "host", SessionRequest.this.mo3387a(), "appIsBg", Boolean.valueOf(isAppBackground), "isHandleFinish", Boolean.valueOf(this.f88a));
            SessionRequest sessionRequest = SessionRequest.this;
            sessionRequest.f77b.mo3449b(sessionRequest, session);
            if (!this.f88a) {
                this.f88a = true;
                if (session.f57t) {
                    if (isAppBackground) {
                        ALog.m289e("awcn.SessionRequest", "[onDisConnect]app background, don't Recreate", this.f92e.mo3491h(), C3416b.f8468at, session);
                    } else if (!NetworkStatusHelper.isConnected()) {
                        ALog.m289e("awcn.SessionRequest", "[onDisConnect]no network, don't Recreate", this.f92e.mo3491h(), C3416b.f8468at, session);
                    } else {
                        try {
                            ALog.m287d("awcn.SessionRequest", "session disconnected, try to recreate session", this.f92e.mo3491h(), new Object[0]);
                            ThreadPoolExecutorFactory.submitScheduledTask(new RunnableC0141g(this, session), (long) (Math.random() * 10.0d * 1000.0d), TimeUnit.MILLISECONDS);
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }

        @Override // anet.channel.SessionRequest.IConnCb
        public void onFailed(Session session, long j, int i, int i2) {
            if (ALog.isPrintLog(1)) {
                ALog.m287d("awcn.SessionRequest", "Connect failed", this.f92e.mo3491h(), C3416b.f8468at, session, "host", SessionRequest.this.mo3387a(), "isHandleFinish", Boolean.valueOf(this.f88a));
            }
            if (SessionRequest.this.f80e) {
                SessionRequest.this.f80e = false;
            } else if (!this.f88a) {
                this.f88a = true;
                SessionRequest sessionRequest = SessionRequest.this;
                sessionRequest.f77b.mo3449b(sessionRequest, session);
                if (!session.f58u || !NetworkStatusHelper.isConnected() || this.f91d.isEmpty()) {
                    SessionRequest.this.mo3397c();
                    SessionRequest.this.mo3391a(session, i, i2);
                    synchronized (SessionRequest.this.f81f) {
                        for (Map.Entry<SessionGetCallback, RunnableC0106c> entry : SessionRequest.this.f81f.entrySet()) {
                            RunnableC0106c value = entry.getValue();
                            if (value.f96b.compareAndSet(false, true)) {
                                ThreadPoolExecutorFactory.removeScheduleTask(value);
                                entry.getKey().onSessionGetFail();
                            }
                        }
                        SessionRequest.this.f81f.clear();
                    }
                    return;
                }
                if (ALog.isPrintLog(1)) {
                    ALog.m287d("awcn.SessionRequest", "use next connInfo to create session", this.f92e.mo3491h(), "host", SessionRequest.this.mo3387a());
                }
                C0131a aVar = this.f92e;
                if (aVar.f148b == aVar.f149c && (i2 == -2003 || i2 == -2410)) {
                    ListIterator<C0131a> listIterator = this.f91d.listIterator();
                    while (listIterator.hasNext()) {
                        if (session.getIp().equals(listIterator.next().f147a.getIp())) {
                            listIterator.remove();
                        }
                    }
                }
                if (C0209c.m282b(session.getIp())) {
                    ListIterator<C0131a> listIterator2 = this.f91d.listIterator();
                    while (listIterator2.hasNext()) {
                        if (C0209c.m282b(listIterator2.next().f147a.getIp())) {
                            listIterator2.remove();
                        }
                    }
                }
                if (this.f91d.isEmpty()) {
                    SessionRequest.this.mo3397c();
                    SessionRequest.this.mo3391a(session, i, i2);
                    return;
                }
                C0131a remove = this.f91d.remove(0);
                SessionRequest sessionRequest2 = SessionRequest.this;
                Context context = this.f90c;
                sessionRequest2.m26a(context, remove, new C0104a(context, this.f91d, remove), remove.mo3491h());
            }
        }

        @Override // anet.channel.SessionRequest.IConnCb
        public void onSuccess(Session session, long j) {
            ALog.m287d("awcn.SessionRequest", "Connect Success", this.f92e.mo3491h(), C3416b.f8468at, session, "host", SessionRequest.this.mo3387a());
            try {
                if (SessionRequest.this.f80e) {
                    SessionRequest.this.f80e = false;
                    session.close(false);
                    return;
                }
                SessionRequest.this.f77b.mo3448a(SessionRequest.this, session);
                SessionRequest.this.mo3390a(session);
                synchronized (SessionRequest.this.f81f) {
                    for (Map.Entry<SessionGetCallback, RunnableC0106c> entry : SessionRequest.this.f81f.entrySet()) {
                        RunnableC0106c value = entry.getValue();
                        if (value.f96b.compareAndSet(false, true)) {
                            ThreadPoolExecutorFactory.removeScheduleTask(value);
                            entry.getKey().onSessionGetSuccess(session);
                        }
                    }
                    SessionRequest.this.f81f.clear();
                }
                SessionRequest.this.mo3397c();
            } catch (Exception e) {
                ALog.m288e("awcn.SessionRequest", "[onSuccess]:", this.f92e.mo3491h(), e, new Object[0]);
            } finally {
                SessionRequest.this.mo3397c();
            }
        }
    }

    /* renamed from: anet.channel.SessionRequest$b */
    public class RunnableC0105b implements Runnable {

        /* renamed from: a */
        public String f93a = null;

        public RunnableC0105b(String str) {
            this.f93a = str;
        }

        public void run() {
            if (SessionRequest.this.f78c) {
                ALog.m289e("awcn.SessionRequest", "Connecting timeout!!! reset status!", this.f93a, new Object[0]);
                SessionConnStat sessionConnStat = SessionRequest.this.f82g;
                sessionConnStat.ret = 2;
                sessionConnStat.totalTime = System.currentTimeMillis() - SessionRequest.this.f82g.start;
                if (SessionRequest.this.f79d != null) {
                    SessionRequest.this.f79d.f58u = false;
                    SessionRequest.this.f79d.close();
                    SessionRequest sessionRequest = SessionRequest.this;
                    sessionRequest.f82g.syncValueFromSession(sessionRequest.f79d);
                }
                AppMonitor.getInstance().commitStat(SessionRequest.this.f82g);
                SessionRequest.this.mo3394a(false);
            }
        }
    }

    /* renamed from: anet.channel.SessionRequest$c */
    public class RunnableC0106c implements Runnable {

        /* renamed from: a */
        public SessionGetCallback f95a = null;

        /* renamed from: b */
        public AtomicBoolean f96b = new AtomicBoolean(false);

        public RunnableC0106c(SessionGetCallback sessionGetCallback) {
            this.f95a = sessionGetCallback;
        }

        public void run() {
            if (this.f96b.compareAndSet(false, true)) {
                ALog.m289e("awcn.SessionRequest", "get session timeout", null, new Object[0]);
                synchronized (SessionRequest.this.f81f) {
                    SessionRequest.this.f81f.remove(this.f95a);
                }
                this.f95a.onSessionGetFail();
            }
        }
    }

    public SessionRequest(String str, SessionCenter sessionCenter) {
        this.f83h = str;
        String substring = str.substring(str.indexOf(HttpConstant.SCHEME_SPLIT) + 3);
        this.f84i = substring;
        this.f76a = sessionCenter;
        this.f85j = sessionCenter.f71g.mo3415b(substring);
        this.f77b = sessionCenter.f69e;
    }

    /* renamed from: b */
    public void mo3396b(boolean z) {
        ALog.m287d("awcn.SessionRequest", "closeSessions", this.f76a.f67c, "host", this.f83h, "autoCreate", Boolean.valueOf(z));
        if (!z && this.f79d != null) {
            this.f79d.f58u = false;
            this.f79d.close(false);
        }
        List<Session> a = this.f77b.mo3447a(this);
        if (a != null) {
            for (Session session : a) {
                if (session != null) {
                    session.close(z);
                }
            }
        }
    }

    /* renamed from: c */
    public void mo3397c() {
        mo3394a(false);
        synchronized (this.f87l) {
            this.f87l.notifyAll();
        }
    }

    /* renamed from: a */
    public String mo3387a() {
        return this.f83h;
    }

    /* renamed from: a */
    public void mo3394a(boolean z) {
        this.f78c = z;
        if (!z) {
            if (this.f86k != null) {
                this.f86k.cancel(true);
                this.f86k = null;
            }
            this.f79d = null;
        }
    }

    /* renamed from: a */
    public synchronized void mo3389a(Context context, int i, String str, SessionGetCallback sessionGetCallback, long j) {
        Session a = this.f77b.mo3445a(this, i);
        if (a != null) {
            ALog.m287d("awcn.SessionRequest", "Available Session exist!!!", str, new Object[0]);
            if (sessionGetCallback != null) {
                sessionGetCallback.onSessionGetSuccess(a);
            }
            return;
        }
        if (TextUtils.isEmpty(str)) {
            str = C0229i.m330a(null);
        }
        ALog.m287d("awcn.SessionRequest", "SessionRequest start", str, "host", this.f83h, "type", Integer.valueOf(i));
        if (this.f78c) {
            ALog.m287d("awcn.SessionRequest", "session connecting", str, "host", mo3387a());
            if (sessionGetCallback != null) {
                if (mo3395b() == i) {
                    RunnableC0106c cVar = new RunnableC0106c(sessionGetCallback);
                    synchronized (this.f81f) {
                        this.f81f.put(sessionGetCallback, cVar);
                    }
                    ThreadPoolExecutorFactory.submitScheduledTask(cVar, j, TimeUnit.MILLISECONDS);
                } else {
                    sessionGetCallback.onSessionGetFail();
                }
            }
            return;
        }
        mo3394a(true);
        this.f86k = ThreadPoolExecutorFactory.submitScheduledTask(new RunnableC0105b(str), 45, TimeUnit.SECONDS);
        SessionConnStat sessionConnStat = new SessionConnStat();
        this.f82g = sessionConnStat;
        sessionConnStat.start = System.currentTimeMillis();
        if (!NetworkStatusHelper.isConnected()) {
            if (ALog.isPrintLog(1)) {
                ALog.m287d("awcn.SessionRequest", "network is not available, can't create session", str, "isConnected", Boolean.valueOf(NetworkStatusHelper.isConnected()));
            }
            mo3397c();
            throw new RuntimeException("no network");
        }
        List<IConnStrategy> a2 = m24a(i, str);
        if (!a2.isEmpty()) {
            List<C0131a> a3 = m25a(a2, str);
            try {
                C0131a remove = a3.remove(0);
                m26a(context, remove, new C0104a(context, a3, remove), remove.mo3491h());
                if (sessionGetCallback != null) {
                    RunnableC0106c cVar2 = new RunnableC0106c(sessionGetCallback);
                    synchronized (this.f81f) {
                        this.f81f.put(sessionGetCallback, cVar2);
                    }
                    ThreadPoolExecutorFactory.submitScheduledTask(cVar2, j, TimeUnit.MILLISECONDS);
                }
            } catch (Throwable unused) {
                mo3397c();
            }
            return;
        }
        ALog.m290i("awcn.SessionRequest", "no avalible strategy, can't create session", str, "host", this.f83h, "type", Integer.valueOf(i));
        mo3397c();
        throw new NoAvailStrategyException("no avalible strategy");
    }

    /* renamed from: b */
    public int mo3395b() {
        Session session = this.f79d;
        if (session != null) {
            return session.f47j.getType();
        }
        return -1;
    }

    /* renamed from: a */
    public void mo3390a(Session session) {
        AlarmObject alarmObject = new AlarmObject();
        alarmObject.module = "networkPrefer";
        alarmObject.modulePoint = "policy";
        alarmObject.arg = this.f83h;
        alarmObject.isSuccess = true;
        AppMonitor.getInstance().commitAlarm(alarmObject);
        this.f82g.syncValueFromSession(session);
        SessionConnStat sessionConnStat = this.f82g;
        sessionConnStat.ret = 1;
        sessionConnStat.totalTime = System.currentTimeMillis() - this.f82g.start;
        AppMonitor.getInstance().commitStat(this.f82g);
    }

    /* renamed from: a */
    public void mo3391a(Session session, int i, int i2) {
        if (256 == i && i2 != -2613 && i2 != -2601) {
            AlarmObject alarmObject = new AlarmObject();
            alarmObject.module = "networkPrefer";
            alarmObject.modulePoint = "policy";
            alarmObject.arg = this.f83h;
            alarmObject.errorCode = String.valueOf(i2);
            alarmObject.isSuccess = false;
            AppMonitor.getInstance().commitAlarm(alarmObject);
            SessionConnStat sessionConnStat = this.f82g;
            sessionConnStat.ret = 0;
            sessionConnStat.appendErrorTrace(i2);
            this.f82g.errorCode = String.valueOf(i2);
            this.f82g.totalTime = System.currentTimeMillis() - this.f82g.start;
            this.f82g.syncValueFromSession(session);
            AppMonitor.getInstance().commitStat(this.f82g);
        }
    }

    /* renamed from: a */
    private List<IConnStrategy> m24a(int i, String str) {
        List<IConnStrategy> list = Collections.EMPTY_LIST;
        try {
            HttpUrl parse = HttpUrl.parse(mo3387a());
            if (parse == null) {
                return Collections.EMPTY_LIST;
            }
            list = StrategyCenter.getInstance().getConnStrategyListByHost(parse.host());
            if (!list.isEmpty()) {
                boolean equalsIgnoreCase = "https".equalsIgnoreCase(parse.scheme());
                boolean b = C0223c.m317b();
                ListIterator<IConnStrategy> listIterator = list.listIterator();
                while (listIterator.hasNext()) {
                    IConnStrategy next = listIterator.next();
                    ConnType valueOf = ConnType.valueOf(next.getProtocol());
                    if (valueOf != null) {
                        if (!(valueOf.isSSL() == equalsIgnoreCase && (i == C0133c.f157c || valueOf.getType() == i))) {
                            listIterator.remove();
                        }
                        if (b && C0209c.m282b(next.getIp())) {
                            listIterator.remove();
                        }
                    }
                }
            }
            if (ALog.isPrintLog(1)) {
                ALog.m287d("awcn.SessionRequest", "[getAvailStrategy]", str, "strategies", list);
            }
            return list;
        } catch (Throwable th) {
            ALog.m288e("awcn.SessionRequest", "", str, th, new Object[0]);
        }
    }

    /* renamed from: a */
    private List<C0131a> m25a(List<IConnStrategy> list, String str) {
        if (list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            IConnStrategy iConnStrategy = list.get(i2);
            int retryTimes = iConnStrategy.getRetryTimes();
            for (int i3 = 0; i3 <= retryTimes; i3++) {
                i++;
                String a = mo3387a();
                C0131a aVar = new C0131a(a, str + "_" + i, iConnStrategy);
                aVar.f148b = i3;
                aVar.f149c = retryTimes;
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m26a(Context context, C0131a aVar, IConnCb iConnCb, String str) {
        ConnType c = aVar.mo3486c();
        if (context == null || c.isHttpType()) {
            this.f79d = new C0166d(context, aVar);
        } else {
            TnetSpdySession tnetSpdySession = new TnetSpdySession(context, aVar);
            tnetSpdySession.initConfig(this.f76a.f68d);
            tnetSpdySession.initSessionInfo(this.f85j);
            tnetSpdySession.setTnetPublicKey(this.f76a.f71g.mo3416c(this.f84i));
            this.f79d = tnetSpdySession;
        }
        ALog.m290i("awcn.SessionRequest", "create connection...", str, HttpConstant.HOST, mo3387a(), "Type", aVar.mo3486c(), "IP", aVar.mo3484a(), "Port", Integer.valueOf(aVar.mo3485b()), "heartbeat", Integer.valueOf(aVar.mo3490g()), C3416b.f8468at, this.f79d);
        m27a(this.f79d, iConnCb, System.currentTimeMillis());
        this.f79d.connect();
        SessionConnStat sessionConnStat = this.f82g;
        sessionConnStat.retryTimes++;
        sessionConnStat.startConnect = System.currentTimeMillis();
        SessionConnStat sessionConnStat2 = this.f82g;
        if (sessionConnStat2.retryTimes == 0) {
            sessionConnStat2.putExtra("firstIp", aVar.mo3484a());
        }
    }

    /* renamed from: a */
    private void m27a(Session session, IConnCb iConnCb, long j) {
        if (iConnCb != null) {
            session.registerEventcb(EventType.ALL, new C0129e(this, iConnCb, j));
            session.registerEventcb(1792, new C0134f(this, session));
        }
    }

    /* renamed from: a */
    public void mo3393a(String str) {
        ALog.m287d("awcn.SessionRequest", "reCreateSession", str, "host", this.f83h);
        mo3396b(true);
    }

    /* renamed from: a */
    public void mo3388a(long j) throws InterruptedException, TimeoutException {
        ALog.m287d("awcn.SessionRequest", "[await]", null, "timeoutMs", Long.valueOf(j));
        if (j > 0) {
            synchronized (this.f87l) {
                long currentTimeMillis = System.currentTimeMillis() + j;
                while (true) {
                    if (!this.f78c) {
                        break;
                    }
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (currentTimeMillis2 >= currentTimeMillis) {
                        break;
                    }
                    this.f87l.wait(currentTimeMillis - currentTimeMillis2);
                }
                if (this.f78c) {
                    throw new TimeoutException();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo3392a(Session session, int i, String str) {
        SessionInfo sessionInfo;
        Context context = GlobalAppRuntimeInfo.getContext();
        if (context != null && (sessionInfo = this.f85j) != null && sessionInfo.isAccs) {
            try {
                Intent intent = new Intent(Constants.ACTION_RECEIVE);
                intent.setPackage(context.getPackageName());
                intent.setClassName(context, C3178j.msgService);
                intent.putExtra("command", 103);
                intent.putExtra("host", session.getHost());
                intent.putExtra(Constants.KEY_CENTER_HOST, true);
                boolean isAvailable = session.isAvailable();
                if (!isAvailable) {
                    intent.putExtra(Constants.KEY_ERROR_CODE, i);
                    intent.putExtra(Constants.KEY_ERROR_DETAIL, str);
                }
                intent.putExtra(Constants.KEY_CONNECT_AVAILABLE, isAvailable);
                intent.putExtra(Constants.KEY_TYPE_INAPP, true);
                context.startService(intent);
            } catch (Throwable th) {
                ALog.m288e("awcn.SessionRequest", "sendConnectInfoBroadCastToAccs", null, th, new Object[0]);
            }
        }
    }
}
