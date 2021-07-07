package com.taobao.accs.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import anet.channel.AwcnConfig;
import anet.channel.DataFrameCb;
import anet.channel.IAuth;
import anet.channel.Session;
import anet.channel.SessionCenter;
import anet.channel.SessionInfo;
import anet.channel.entity.ConnType;
import anet.channel.request.Request;
import anet.channel.session.TnetSpdySession;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.StrategyTemplate;
import com.facebook.react.uimanager.ViewProps;
import com.megvii.apo.PhoneFingerManager;
import com.p118pd.sdk.C1IlLiL1;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.ErrorCode;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.data.Message;
import com.taobao.accs.p263ut.monitor.NetPerformanceMonitor;
import com.taobao.accs.p263ut.p264a.C3164c;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3190t;
import com.taobao.accs.utl.UtilityImpl;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.taobao.accs.net.j */
public class C3145j extends AbstractC3137b implements DataFrameCb {

    /* renamed from: o */
    public boolean f7042o = true;

    /* renamed from: p */
    public long f7043p = PhoneFingerManager.PER_HOUR_MILLISECOND;

    /* renamed from: q */
    public ScheduledFuture f7044q;

    /* renamed from: r */
    public RunnableC3155s f7045r;

    /* renamed from: s */
    public AtomicBoolean f7046s = new AtomicBoolean(false);

    /* renamed from: t */
    public BroadcastReceiver f7047t = new InAppConnection$1(this);

    /* renamed from: u */
    public Runnable f7048u = new RunnableC3147k(this);

    /* renamed from: v */
    public Runnable f7049v = new RunnableC3152p(this);

    /* renamed from: w */
    public Set<String> f7050w = Collections.synchronizedSet(new HashSet());

    /* renamed from: com.taobao.accs.net.j$a */
    public static class C3146a implements IAuth {

        /* renamed from: a */
        public String f7051a;

        /* renamed from: b */
        public int f7052b;

        /* renamed from: c */
        public String f7053c;

        /* renamed from: d */
        public AbstractC3137b f7054d;

        public C3146a(AbstractC3137b bVar, String str) {
            this.f7053c = bVar.mo37662d();
            this.f7051a = bVar.mo37660c("https://" + str + "/accs/");
            this.f7052b = bVar.f7011c;
            this.f7054d = bVar;
        }

        @Override // anet.channel.IAuth
        public void auth(Session session, IAuth.AuthCallback authCallback) {
            if (C3190t.m7707g()) {
                StringBuilder sb = new StringBuilder();
                String str = this.f7051a;
                sb.append(str.substring(0, str.indexOf("&21=")));
                sb.append("&21=");
                sb.append(AbstractC3137b.f7008n);
                this.f7051a = sb.toString();
            }
            ALog.m7599e(this.f7053c, "auth", "URL", this.f7051a);
            session.request(new Request.Builder().setUrl(this.f7051a).build(), new C3153q(this, authCallback));
        }
    }

    public C3145j(Context context, int i, String str) {
        super(context, i, str);
        if (!C3190t.m7700a(true)) {
            String c = UtilityImpl.m7627c(this.f7012d, "inapp");
            String d = mo37662d();
            ALog.m7597d(d, "config tnet log path:" + c, new Object[0]);
            if (!TextUtils.isEmpty(c)) {
                Session.configTnetALog(context, c, 5242880, 5);
            }
        }
        ThreadPoolExecutorFactory.getScheduledExecutor().schedule(this.f7049v, C1IlLiL1.f22762OooO0O0, TimeUnit.MILLISECONDS);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(Constants.ACTION_CONNECT_INFO);
        context.registerReceiver(this.f7047t, intentFilter);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public void m7518n() {
        if (this.f7017i.isAccsHeartbeatEnable()) {
            ALog.m7599e(mo37662d(), "startAccsHeartBeat", new Object[0]);
            ScheduledFuture scheduledFuture = this.f7044q;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
            ScheduledThreadPoolExecutor scheduledExecutor = ThreadPoolExecutorFactory.getScheduledExecutor();
            Runnable runnable = this.f7048u;
            long j = this.f7043p;
            this.f7044q = scheduledExecutor.scheduleAtFixedRate(runnable, j, j, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.taobao.accs.net.AbstractC3137b
    /* renamed from: a */
    public void mo37651a(boolean z, boolean z2) {
    }

    @Override // com.taobao.accs.net.AbstractC3137b
    /* renamed from: c */
    public C3164c mo37659c() {
        return null;
    }

    @Override // com.taobao.accs.net.AbstractC3137b
    /* renamed from: d */
    public String mo37662d() {
        return "InAppConn_" + this.f7021m;
    }

    @Override // com.taobao.accs.net.AbstractC3137b
    /* renamed from: e */
    public void mo37663e() {
        ALog.m7599e(mo37662d(), "shut down", new Object[0]);
        this.f7042o = false;
    }

    @Override // com.taobao.accs.net.AbstractC3137b
    /* renamed from: m */
    public boolean mo37671m() {
        return this.f7046s.get();
    }

    @Override // anet.channel.DataFrameCb
    public void onDataReceive(TnetSpdySession tnetSpdySession, byte[] bArr, int i, int i2) {
        ThreadPoolExecutorFactory.getScheduledExecutor().execute(new RunnableC3150n(this, i2, bArr, tnetSpdySession));
    }

    @Override // anet.channel.DataFrameCb
    public void onException(int i, int i2, boolean z, String str) {
        String d = mo37662d();
        ALog.m7599e(d, "errorId:" + i2 + "detail:" + str + " dataId:" + i + " needRetry:" + z, new Object[0]);
        ThreadPoolExecutorFactory.getScheduledExecutor().execute(new RunnableC3151o(this, i, z, i2));
    }

    @Override // com.taobao.accs.net.AbstractC3137b
    /* renamed from: a */
    public synchronized void mo37646a() {
        ALog.m7597d(mo37662d(), ViewProps.START, new Object[0]);
        this.f7042o = true;
        mo37647a(this.f7012d);
    }

    @Override // com.taobao.accs.net.AbstractC3137b
    /* renamed from: b */
    public void mo37655b() {
        this.f7014f = 0;
    }

    @Override // com.taobao.accs.net.AbstractC3137b
    /* renamed from: c */
    public void mo37661c(int i) {
        super.mo37661c(i);
        RunnableC3155s sVar = this.f7045r;
        if (sVar != null) {
            sVar.mo37697a(i);
        }
    }

    @Override // com.taobao.accs.net.AbstractC3137b
    /* renamed from: a */
    public void mo37648a(Message message, boolean z) {
        if (!this.f7042o || message == null) {
            String d = mo37662d();
            ALog.m7599e(d, "not running or msg null! " + this.f7042o, new Object[0]);
            return;
        }
        try {
            if (ThreadPoolExecutorFactory.getSendScheduledExecutor().getQueue().size() <= 1000) {
                ScheduledFuture<?> schedule = ThreadPoolExecutorFactory.getSendScheduledExecutor().schedule(new RunnableC3148l(this, message), message.delyTime, TimeUnit.MILLISECONDS);
                if (message.getType() == 1 && message.cunstomDataId != null) {
                    if (message.isControlFrame() && mo37653a(message.cunstomDataId)) {
                        this.f7013e.mo37596b(message);
                    }
                    this.f7013e.f6943a.put(message.cunstomDataId, schedule);
                }
                NetPerformanceMonitor netPermanceMonitor = message.getNetPermanceMonitor();
                if (netPermanceMonitor != null) {
                    netPermanceMonitor.setDeviceId(UtilityImpl.m7644l(this.f7012d));
                    netPermanceMonitor.setConnType(this.f7011c);
                    netPermanceMonitor.onEnterQueueData();
                    return;
                }
                return;
            }
            throw new RejectedExecutionException("accs");
        } catch (RejectedExecutionException unused) {
            this.f7013e.mo37588a(message, ErrorCode.MESSAGE_QUEUE_FULL);
            String d2 = mo37662d();
            ALog.m7599e(d2, "send queue full count:" + ThreadPoolExecutorFactory.getSendScheduledExecutor().getQueue().size(), new Object[0]);
        } catch (Throwable th) {
            this.f7013e.mo37588a(message, -8);
            ALog.m7598e(mo37662d(), "send error", th, new Object[0]);
        }
    }

    @Override // com.taobao.accs.net.AbstractC3137b
    /* renamed from: a */
    public void mo37649a(String str, boolean z, long j) {
        ThreadPoolExecutorFactory.getScheduledExecutor().schedule(new RunnableC3149m(this, str, z), j, TimeUnit.MILLISECONDS);
    }

    @Override // com.taobao.accs.net.AbstractC3137b
    /* renamed from: a */
    public void mo37650a(String str, boolean z, String str2) {
        Session session;
        try {
            Message b = this.f7013e.mo37594b(str);
            if (b != null && b.host != null && (session = SessionCenter.getInstance(this.f7017i.getAppKey()).get(b.host.toString(), 0)) != null) {
                if (z) {
                    session.close(true);
                } else {
                    session.ping(true);
                }
            }
        } catch (Exception e) {
            ALog.m7598e(mo37662d(), "onTimeOut", e, new Object[0]);
        }
    }

    @Override // com.taobao.accs.net.AbstractC3137b
    /* renamed from: a */
    public boolean mo37653a(String str) {
        if (str == null) {
            return false;
        }
        ScheduledFuture<?> scheduledFuture = this.f7013e.f6943a.get(str);
        boolean cancel = scheduledFuture != null ? scheduledFuture.cancel(false) : false;
        if (cancel) {
            ALog.m7599e(mo37662d(), "cancel", "customDataId", str);
        }
        return cancel;
    }

    /* renamed from: a */
    public void mo37690a(JSONObject jSONObject) {
        if (jSONObject == null) {
            ALog.m7599e(mo37662d(), "onReceiveAccsHeartbeatResp response data is null", new Object[0]);
            return;
        }
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.m7600i(mo37662d(), "onReceiveAccsHeartbeatResp", "data", jSONObject);
        }
        try {
            int i = jSONObject.getInt("timeInterval");
            if (i != -1) {
                long j = (long) (i * 1000);
                if (this.f7043p != j) {
                    if (i == 0) {
                        j = PhoneFingerManager.PER_HOUR_MILLISECOND;
                    }
                    this.f7043p = j;
                    if (this.f7044q != null) {
                        this.f7044q.cancel(true);
                    }
                    this.f7044q = ThreadPoolExecutorFactory.getScheduledExecutor().scheduleAtFixedRate(this.f7048u, this.f7043p, this.f7043p, TimeUnit.MILLISECONDS);
                }
            } else if (this.f7044q != null) {
                this.f7044q.cancel(true);
            }
        } catch (JSONException e) {
            ALog.m7599e(mo37662d(), "onReceiveAccsHeartbeatResp", "e", e.getMessage());
        }
    }

    @Override // com.taobao.accs.net.AbstractC3137b
    /* renamed from: a */
    public void mo37647a(Context context) {
        boolean z;
        try {
            if (!this.f7015g) {
                super.mo37647a(context);
                String inappHost = this.f7017i.getInappHost();
                if (!mo37666h() || !this.f7017i.isKeepalive()) {
                    ALog.m7597d(mo37662d(), "initAwcn close keepalive", new Object[0]);
                    z = false;
                } else {
                    z = true;
                }
                if (C3190t.m7707g()) {
                    AwcnConfig.setAccsSessionCreateForbiddenInBg(false);
                }
                mo37688a(SessionCenter.getInstance(this.f7017i.getAppKey()), inappHost, z);
                this.f7015g = true;
                ALog.m7600i(mo37662d(), "initAwcn success!", new Object[0]);
            }
        } catch (Throwable th) {
            ALog.m7598e(mo37662d(), "initAwcn", th, new Object[0]);
        }
    }

    /* renamed from: a */
    public void mo37688a(SessionCenter sessionCenter, String str, boolean z) {
        if (!this.f7050w.contains(str)) {
            if (!C3190t.m7707g()) {
                this.f7045r = null;
            } else if (this.f7045r == null) {
                this.f7045r = new RunnableC3155s();
            }
            sessionCenter.registerSessionInfo(SessionInfo.create(str, z, true, new C3146a(this, str), this.f7045r, this));
            sessionCenter.registerPublicKey(str, this.f7017i.getInappPubKey());
            this.f7050w.add(str);
            ALog.m7600i(mo37662d(), "registerSessionInfo", "host", str);
        }
    }

    /* renamed from: a */
    public void mo37689a(AccsClientConfig accsClientConfig) {
        if (accsClientConfig == null) {
            ALog.m7600i(mo37662d(), "updateConfig null", new Object[0]);
        } else if (accsClientConfig.equals(this.f7017i)) {
            ALog.m7603w(mo37662d(), "updateConfig not any changed", new Object[0]);
        } else if (this.f7015g) {
            try {
                boolean z = true;
                ALog.m7603w(mo37662d(), "updateConfig", "old", this.f7017i, "new", accsClientConfig);
                String inappHost = this.f7017i.getInappHost();
                String inappHost2 = accsClientConfig.getInappHost();
                SessionCenter instance = SessionCenter.getInstance(this.f7017i.getAppKey());
                if (instance == null) {
                    ALog.m7603w(mo37662d(), "updateConfig not need update", new Object[0]);
                    return;
                }
                instance.unregisterSessionInfo(inappHost);
                ALog.m7603w(mo37662d(), "updateConfig unregisterSessionInfo", "host", inappHost);
                if (this.f7050w.contains(inappHost)) {
                    this.f7050w.remove(inappHost);
                    ALog.m7603w(mo37662d(), "updateConfig removeSessionRegistered", "oldHost", inappHost);
                }
                this.f7017i = accsClientConfig;
                this.f7010b = accsClientConfig.getAppKey();
                this.f7021m = this.f7017i.getTag();
                String str = ConnType.PK_ACS;
                if (this.f7017i.getInappPubKey() == 10 || this.f7017i.getInappPubKey() == 11) {
                    str = ConnType.PK_OPEN;
                }
                ALog.m7600i(mo37662d(), "update config register new conn protocol host:", this.f7017i.getInappHost());
                StrategyTemplate.getInstance().registerConnProtocol(this.f7017i.getInappHost(), ConnProtocol.valueOf(ConnType.HTTP2, ConnType.RTT_0, str, false));
                if (!mo37666h() || !this.f7017i.isKeepalive()) {
                    ALog.m7600i(mo37662d(), "updateConfig close keepalive", new Object[0]);
                    z = false;
                }
                mo37688a(instance, inappHost2, z);
            } catch (Throwable th) {
                ALog.m7598e(mo37662d(), "updateConfig", th, new Object[0]);
            }
        } else if (C3190t.m7707g() || UtilityImpl.isMainProcess(this.f7012d)) {
            this.f7017i = accsClientConfig;
            mo37647a(this.f7012d);
        }
    }
}
