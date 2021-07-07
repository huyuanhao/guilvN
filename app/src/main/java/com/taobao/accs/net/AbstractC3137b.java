package com.taobao.accs.net;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import anet.channel.Config;
import anet.channel.SessionCenter;
import anet.channel.entity.ConnType;
import anet.channel.entity.ENV;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.StrategyTemplate;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.AccsException;
import com.taobao.accs.ErrorCode;
import com.taobao.accs.client.C3104b;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.data.C3113d;
import com.taobao.accs.data.Message;
import com.taobao.accs.p263ut.p264a.C3164c;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.C3179k;
import com.taobao.accs.utl.C3190t;
import com.taobao.accs.utl.UtilityImpl;
import com.tencent.bugly.beta.tinker.TinkerUncaughtExceptionHandler;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.taobao.accs.net.b */
public abstract class AbstractC3137b {
    public static final int ACCS_RECEIVE_TIMEOUT = 40000;
    public static final int INAPP = 1;
    public static final int SERVICE = 0;

    /* renamed from: n */
    public static int f7008n = 1;

    /* renamed from: a */
    public String f7009a;

    /* renamed from: b */
    public String f7010b = "";

    /* renamed from: c */
    public int f7011c;

    /* renamed from: d */
    public Context f7012d;

    /* renamed from: e */
    public C3113d f7013e;

    /* renamed from: f */
    public int f7014f = 0;

    /* renamed from: g */
    public volatile boolean f7015g = false;

    /* renamed from: h */
    public C3104b f7016h;

    /* renamed from: i */
    public AccsClientConfig f7017i;

    /* renamed from: j */
    public String f7018j;

    /* renamed from: k */
    public String f7019k = null;

    /* renamed from: l */
    public LinkedHashMap<Integer, Message> f7020l = new BaseConnection$1(this);

    /* renamed from: m */
    public String f7021m;

    /* renamed from: o */
    public long f7022o = 0;

    /* renamed from: p */
    public Runnable f7023p;

    /* renamed from: q */
    public ScheduledFuture<?> f7024q;

    public AbstractC3137b(Context context, int i, String str) {
        this.f7011c = i;
        this.f7012d = context.getApplicationContext();
        AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
        if (configByTag == null) {
            ALog.m7599e(mo37662d(), "BaseConnection config null!!", new Object[0]);
            try {
                configByTag = new AccsClientConfig.Builder().setAppKey(ACCSManager.getDefaultAppkey(context)).setTag(str).build();
            } catch (AccsException e) {
                ALog.m7598e(mo37662d(), "BaseConnection build config", e, new Object[0]);
            }
        }
        this.f7021m = configByTag.getTag();
        this.f7010b = configByTag.getAppKey();
        this.f7017i = configByTag;
        C3113d dVar = new C3113d(context, this);
        this.f7013e = dVar;
        dVar.f6944b = this.f7011c;
        ALog.m7597d(mo37662d(), "new connection", new Object[0]);
    }

    /* renamed from: a */
    public String mo37645a(int i) {
        return i != 1 ? i != 2 ? (i == 3 || i != 4) ? "DISCONNECTED" : "DISCONNECTING" : "CONNECTING" : "CONNECTED";
    }

    /* renamed from: a */
    public abstract void mo37646a();

    /* renamed from: a */
    public abstract void mo37648a(Message message, boolean z);

    /* renamed from: a */
    public void mo37649a(String str, boolean z, long j) {
        ThreadPoolExecutorFactory.getScheduledExecutor().schedule(new RunnableC3138c(this, str, z), j, TimeUnit.MILLISECONDS);
    }

    /* renamed from: a */
    public abstract void mo37650a(String str, boolean z, String str2);

    /* renamed from: a */
    public abstract void mo37651a(boolean z, boolean z2);

    /* renamed from: a */
    public abstract boolean mo37653a(String str);

    /* renamed from: b */
    public abstract void mo37655b();

    /* renamed from: b */
    public void mo37658b(Message message, boolean z) {
        if (message.isAck || UtilityImpl.m7643k(this.f7012d)) {
            long a = message.getType() != 2 ? this.f7013e.f6946d.mo37618a(message.serviceId, message.bizId) : 0;
            if (a == -1) {
                ALog.m7599e(mo37662d(), "sendMessage ready server limit high", Constants.KEY_DATA_ID, message.dataId);
                this.f7013e.mo37588a(message, ErrorCode.SERVIER_HIGH_LIMIT);
            } else if (a == -1000) {
                ALog.m7599e(mo37662d(), "sendMessage ready server limit high for brush", Constants.KEY_DATA_ID, message.dataId);
                this.f7013e.mo37588a(message, ErrorCode.SERVIER_HIGH_LIMIT_BRUSH);
            } else {
                if (a > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = this.f7022o;
                    if (currentTimeMillis > j) {
                        message.delyTime = a;
                    } else {
                        message.delyTime = (j + a) - System.currentTimeMillis();
                    }
                    this.f7022o = System.currentTimeMillis() + message.delyTime;
                    ALog.m7599e(mo37662d(), "sendMessage ready", Constants.KEY_DATA_ID, message.dataId, "type", Message.MsgType.name(message.getType()), "delay", Long.valueOf(message.delyTime));
                } else if ("accs".equals(message.serviceId)) {
                    ALog.m7599e(mo37662d(), "sendMessage ready", Constants.KEY_DATA_ID, message.dataId, "type", Message.MsgType.name(message.getType()), "delay", Long.valueOf(message.delyTime));
                } else if (ALog.isPrintLog(ALog.Level.D)) {
                    ALog.m7597d(mo37662d(), "sendMessage ready", Constants.KEY_DATA_ID, message.dataId, "type", Message.MsgType.name(message.getType()), "delay", Long.valueOf(message.delyTime));
                }
                try {
                    if (TextUtils.isEmpty(this.f7018j)) {
                        this.f7018j = UtilityImpl.m7644l(this.f7012d);
                    }
                    if (!message.isTimeOut()) {
                        mo37648a(message, z);
                    } else {
                        this.f7013e.mo37588a(message, -9);
                    }
                } catch (RejectedExecutionException unused) {
                    this.f7013e.mo37588a(message, ErrorCode.MESSAGE_QUEUE_FULL);
                    ALog.m7599e(mo37662d(), "sendMessage ready queue full", FileAttachment.KEY_SIZE, Integer.valueOf(ThreadPoolExecutorFactory.getSendScheduledExecutor().getQueue().size()));
                }
            }
        } else {
            ALog.m7599e(mo37662d(), "sendMessage ready no network", Constants.KEY_DATA_ID, message.dataId);
            this.f7013e.mo37588a(message, -13);
        }
    }

    /* renamed from: c */
    public abstract C3164c mo37659c();

    /* renamed from: c */
    public String mo37660c(String str) {
        String str2;
        String l = UtilityImpl.m7644l(this.f7012d);
        try {
            str2 = URLEncoder.encode(l);
        } catch (Throwable th) {
            ALog.m7598e(mo37662d(), "buildAuthUrl", th, new Object[0]);
            str2 = l;
        }
        String a = UtilityImpl.m7610a(this.f7012d, mo37667i(), this.f7017i.getAppSecret(), l, this.f7021m);
        StringBuilder sb = new StringBuilder(256);
        sb.append(str);
        sb.append("auth?1=");
        sb.append(str2);
        sb.append("&2=");
        sb.append(a);
        sb.append("&3=");
        sb.append(mo37667i());
        if (this.f7019k != null) {
            sb.append("&4=");
            sb.append(this.f7019k);
        }
        sb.append("&5=");
        sb.append(this.f7011c);
        sb.append("&6=");
        sb.append(UtilityImpl.m7639g(this.f7012d));
        sb.append("&7=");
        sb.append(UtilityImpl.m7645m(this.f7012d));
        sb.append("&8=");
        sb.append(this.f7011c == 1 ? "1.1.2" : Integer.valueOf(Constants.SDK_VERSION_CODE));
        sb.append("&9=");
        sb.append(System.currentTimeMillis());
        sb.append("&10=");
        sb.append(1);
        sb.append("&11=");
        sb.append(Build.VERSION.SDK_INT);
        sb.append("&12=");
        sb.append(this.f7012d.getPackageName());
        sb.append("&13=");
        sb.append(UtilityImpl.m7647o(this.f7012d));
        sb.append("&14=");
        sb.append(this.f7009a);
        sb.append("&15=");
        sb.append(UtilityImpl.m7628c(Build.MODEL));
        sb.append("&16=");
        sb.append(UtilityImpl.m7628c(Build.BRAND));
        sb.append("&17=");
        sb.append(Constants.SDK_VERSION_CODE);
        sb.append("&19=");
        sb.append(!mo37670l());
        sb.append("&20=");
        sb.append(this.f7017i.getStoreId());
        if (C3190t.m7707g()) {
            sb.append("&21=");
            sb.append(f7008n);
        }
        return sb.toString();
    }

    /* renamed from: d */
    public abstract String mo37662d();

    /* renamed from: e */
    public void mo37663e() {
    }

    /* renamed from: f */
    public void mo37664f() {
        if (this.f7023p == null) {
            this.f7023p = new RunnableC3139d(this);
        }
        mo37665g();
        this.f7024q = ThreadPoolExecutorFactory.getScheduledExecutor().schedule(this.f7023p, 40000, TimeUnit.MILLISECONDS);
    }

    /* renamed from: g */
    public void mo37665g() {
        ScheduledFuture<?> scheduledFuture = this.f7024q;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    /* renamed from: h */
    public boolean mo37666h() {
        return true;
    }

    /* renamed from: i */
    public String mo37667i() {
        return this.f7010b;
    }

    /* renamed from: j */
    public C3104b mo37668j() {
        if (this.f7016h == null) {
            ALog.m7597d(mo37662d(), "new ClientManager", Constants.KEY_CONFIG_TAG, this.f7021m);
            this.f7016h = new C3104b(this.f7012d, this.f7021m);
        }
        return this.f7016h;
    }

    /* renamed from: k */
    public void mo37669k() {
        try {
            ThreadPoolExecutorFactory.schedule(new RunnableC3140e(this), TinkerUncaughtExceptionHandler.QUICK_CRASH_ELAPSE, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            ALog.m7602w(mo37662d(), "startChannelService", th, new Object[0]);
        }
    }

    /* renamed from: l */
    public boolean mo37670l() {
        return 2 == this.f7017i.getSecurity();
    }

    /* renamed from: m */
    public boolean mo37671m() {
        return false;
    }

    /* renamed from: a */
    public boolean mo37652a(Message message, int i) {
        Throwable th;
        boolean z = true;
        try {
            if (message.retryTimes > 3) {
                return false;
            }
            message.retryTimes++;
            message.delyTime = (long) i;
            ALog.m7599e(mo37662d(), "reSend dataid:" + message.dataId + " retryTimes:" + message.retryTimes, new Object[0]);
            mo37658b(message, true);
            try {
                if (message.getNetPermanceMonitor() != null) {
                    message.getNetPermanceMonitor().take_date = 0;
                    message.getNetPermanceMonitor().to_tnet_date = 0;
                    message.getNetPermanceMonitor().retry_times = message.retryTimes;
                    if (message.retryTimes == 1) {
                        C3179k.m7667a("accs", BaseMonitor.COUNT_POINT_RESEND, "total", AbstractC8352oOoOOoO0.OooO0O0);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                this.f7013e.mo37588a(message, -8);
                ALog.m7598e(mo37662d(), "reSend error", th, new Object[0]);
                return z;
            }
            return z;
        } catch (Throwable th3) {
            th = th3;
            z = false;
            this.f7013e.mo37588a(message, -8);
            ALog.m7598e(mo37662d(), "reSend error", th, new Object[0]);
            return z;
        }
    }

    /* renamed from: a */
    public void mo37647a(Context context) {
        try {
            ENV env = ENV.ONLINE;
            if (AccsClientConfig.mEnv == 2) {
                env = ENV.TEST;
                SessionCenter.switchEnvironment(env);
            } else if (AccsClientConfig.mEnv == 1) {
                env = ENV.PREPARE;
                SessionCenter.switchEnvironment(env);
            }
            SessionCenter.init(context, new Config.Builder().setAppkey(this.f7010b).setAppSecret(this.f7017i.getAppSecret()).setAuthCode(this.f7017i.getAuthCode()).setEnv(env).setTag(this.f7017i.getAppKey()).build());
            String str = ConnType.PK_ACS;
            if (this.f7017i.getInappPubKey() == 10 || this.f7017i.getInappPubKey() == 11) {
                str = ConnType.PK_OPEN;
            }
            ALog.m7600i(mo37662d(), "init awcn register new conn protocol host:", this.f7017i.getInappHost());
            StrategyTemplate.getInstance().registerConnProtocol(this.f7017i.getInappHost(), ConnProtocol.valueOf(ConnType.HTTP2, ConnType.RTT_0, str, false));
        } catch (Throwable th) {
            ALog.m7598e(mo37662d(), "initAwcn", th, new Object[0]);
        }
    }

    /* renamed from: b */
    public void mo37656b(int i) {
        if (i < 0) {
            ALog.m7599e(mo37662d(), "reSendAck", Constants.KEY_DATA_ID, Integer.valueOf(i));
            Message message = this.f7020l.get(Integer.valueOf(i));
            if (message != null) {
                mo37652a(message, 5000);
                C3179k.m7667a("accs", BaseMonitor.COUNT_POINT_RESEND, BaseMonitor.COUNT_ACK, AbstractC8352oOoOOoO0.OooO0O0);
            }
        }
    }

    /* renamed from: b */
    public String mo37654b(String str) {
        String inappHost = this.f7017i.getInappHost();
        StringBuilder sb = new StringBuilder();
        sb.append("https://");
        sb.append(TextUtils.isEmpty(str) ? "" : str);
        sb.append(inappHost);
        String sb2 = sb.toString();
        try {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("https://");
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            sb3.append(str);
            sb3.append(inappHost);
            return sb3.toString();
        } catch (Throwable th) {
            ALog.m7598e("InAppConnection", "getHost", th, new Object[0]);
            return sb2;
        }
    }

    /* renamed from: c */
    public void mo37661c(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 0;
        }
        f7008n = i2;
    }

    /* renamed from: b */
    public void mo37657b(Message message, int i) {
        this.f7013e.mo37588a(message, i);
    }
}
