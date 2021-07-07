package com.taobao.accs.internal;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import com.p118pd.sdk.C8932ooOOO0o;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.client.C3103a;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.common.ThreadPoolExecutorFactory;
import com.taobao.accs.data.C3116g;
import com.taobao.accs.data.Message;
import com.taobao.accs.net.AbstractC3137b;
import com.taobao.accs.net.C3156t;
import com.taobao.accs.p260b.C3089a;
import com.taobao.accs.p263ut.p264a.C3164c;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.C3179k;
import com.taobao.accs.utl.C3187q;
import com.taobao.accs.utl.C3190t;
import com.taobao.accs.utl.UTMini;
import com.taobao.accs.utl.UtilityImpl;
import com.umeng.message.UmengMessageBootReceiver;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.android.agoo.common.Config;
import org.android.agoo.service.IMessageService;

public class ServiceImpl extends AbstractC3134b {

    /* renamed from: e */
    public static C3089a f6992e;

    /* renamed from: b */
    public Service f6993b = null;

    /* renamed from: c */
    public Context f6994c;

    /* renamed from: d */
    public long f6995d;

    /* renamed from: f */
    public String f6996f = "unknown";

    /* renamed from: g */
    public final IMessageService.Stub f6997g = new IMessageService.Stub() {
        /* class com.taobao.accs.internal.ServiceImpl.BinderC31321 */

        @Override // org.android.agoo.service.IMessageService
        public boolean ping() throws RemoteException {
            return true;
        }

        @Override // org.android.agoo.service.IMessageService
        public void probe() throws RemoteException {
            ALog.m7597d("ServiceImpl", "ReceiverImpl probeTaoBao begin......messageServiceBinder [probe]", new Object[0]);
            ThreadPoolExecutorFactory.execute(new RunnableC3135c(this));
        }
    };

    public ServiceImpl(Service service) {
        super(service);
        this.f6993b = service;
        this.f6994c = service.getApplicationContext();
    }

    /* renamed from: b */
    private void m7446b(Intent intent) {
        Message.ReqType reqType;
        URL url;
        Message buildRequest;
        URL url2;
        int intExtra = intent.getIntExtra("command", -1);
        ALog.m7600i("ServiceImpl", "handleCommand", "command", Integer.valueOf(intExtra));
        String stringExtra = intent.getStringExtra(Constants.KEY_PACKAGE_NAME);
        String stringExtra2 = intent.getStringExtra(Constants.KEY_SERVICE_ID);
        String stringExtra3 = intent.getStringExtra("userInfo");
        String stringExtra4 = intent.getStringExtra("appKey");
        String stringExtra5 = intent.getStringExtra(Constants.KEY_CONFIG_TAG);
        String stringExtra6 = intent.getStringExtra(Constants.KEY_TTID);
        intent.getStringExtra("sid");
        intent.getStringExtra(Constants.KEY_ANTI_BRUSH_COOKIE);
        if (intExtra == 201) {
            m7443a(Message.BuildPing(true, 0), true);
            m7448d();
        }
        if (intExtra > 0 && !TextUtils.isEmpty(stringExtra)) {
            AbstractC3137b a = AbstractC3134b.m7469a(this.f6994c, stringExtra5, true);
            if (a != null) {
                a.mo37646a();
                Message message = null;
                if (intExtra == 1) {
                    if (!stringExtra.equals(this.f6994c.getPackageName())) {
                        ALog.m7599e("ServiceImpl", "handleCommand bindapp pkg error", new Object[0]);
                        return;
                    }
                    Message buildBindApp = Message.buildBindApp(this.f6994c, stringExtra5, stringExtra4, intent.getStringExtra("app_sercet"), stringExtra, stringExtra6, intent.getStringExtra("appVersion"));
                    a.f7009a = stringExtra6;
                    UtilityImpl.m7633d(this.f6994c, stringExtra4);
                    if (!a.mo37668j().mo37531c(stringExtra) || intent.getBooleanExtra(Constants.KEY_FOUCE_BIND, false)) {
                        message = buildBindApp;
                    } else {
                        ALog.m7600i("ServiceImpl", stringExtra + " isAppBinded", new Object[0]);
                        a.mo37657b(buildBindApp, 200);
                        return;
                    }
                } else if (intExtra == 2) {
                    ALog.m7599e("ServiceImpl", "onHostStartCommand COMMAND_UNBIND_APP", new Object[0]);
                    if (a.mo37668j().mo37532d(stringExtra)) {
                        Message buildUnbindApp = Message.buildUnbindApp(a.mo37654b((String) null), stringExtra);
                        ALog.m7600i("ServiceImpl", stringExtra + " isAppUnbinded", new Object[0]);
                        a.mo37657b(buildUnbindApp, 200);
                        return;
                    }
                } else if (intExtra == 5) {
                    message = Message.buildBindService(a.mo37654b((String) null), stringExtra2);
                } else if (intExtra == 6) {
                    message = Message.buildUnbindService(stringExtra, stringExtra2);
                } else if (intExtra == 3) {
                    message = Message.buildBindUser(stringExtra, stringExtra3);
                    if (a.mo37668j().mo37530b(stringExtra, stringExtra3) && !intent.getBooleanExtra(Constants.KEY_FOUCE_BIND, false)) {
                        ALog.m7600i("ServiceImpl", stringExtra + C8932ooOOO0o.OooO0OO + stringExtra3 + " isUserBinded", new Object[0]);
                        if (message != null) {
                            a.mo37657b(message, 200);
                            return;
                        }
                        return;
                    }
                } else if (intExtra == 4) {
                    message = Message.buildUnbindUser(stringExtra);
                } else if (intExtra == 100) {
                    byte[] byteArrayExtra = intent.getByteArrayExtra("data");
                    String stringExtra7 = intent.getStringExtra(Constants.KEY_DATA_ID);
                    String stringExtra8 = intent.getStringExtra("target");
                    String stringExtra9 = intent.getStringExtra(Constants.KEY_BUSINESSID);
                    String stringExtra10 = intent.getStringExtra(Constants.KEY_EXT_TAG);
                    try {
                        reqType = (Message.ReqType) intent.getSerializableExtra(Constants.KEY_SEND_TYPE);
                    } catch (Exception unused) {
                        reqType = null;
                    }
                    if (byteArrayExtra != null) {
                        try {
                            if (!C3190t.m7707g()) {
                                url2 = new URL("https://" + ((C3156t) a).mo37700o());
                            } else {
                                url2 = new URL(a.mo37654b((String) null));
                            }
                            url = url2;
                        } catch (MalformedURLException e) {
                            e.printStackTrace();
                            url = null;
                        }
                        ACCSManager.AccsRequest accsRequest = new ACCSManager.AccsRequest(stringExtra3, stringExtra2, byteArrayExtra, stringExtra7, stringExtra8, url, stringExtra9);
                        accsRequest.setTag(stringExtra10);
                        if (reqType == null) {
                            buildRequest = Message.buildSendData(a.mo37654b((String) null), stringExtra5, a.f7017i.getStoreId(), this.f6994c, stringExtra, accsRequest, false);
                        } else if (reqType == Message.ReqType.REQ) {
                            buildRequest = Message.buildRequest(this.f6994c, a.mo37654b((String) null), stringExtra5, a.f7017i.getStoreId(), stringExtra, Constants.TARGET_SERVICE_PRE, accsRequest, false);
                        }
                        message = buildRequest;
                    }
                } else if (intExtra == 106) {
                    intent.setAction(Constants.ACTION_RECEIVE);
                    intent.putExtra("command", -1);
                    C3116g.m7381a(this.f6994c, intent);
                    return;
                }
                if (message != null) {
                    ALog.m7597d("ServiceImpl", "try send message", new Object[0]);
                    if (message.getNetPermanceMonitor() != null) {
                        message.getNetPermanceMonitor().onSend();
                    }
                    a.mo37658b(message, true);
                    return;
                }
                ALog.m7599e("ServiceImpl", "message is null", new Object[0]);
                a.mo37657b(Message.buildParameterError(stringExtra, intExtra), -2);
                return;
            }
            ALog.m7599e("ServiceImpl", "no connection", Constants.KEY_CONFIG_TAG, stringExtra5, "command", Integer.valueOf(intExtra));
        }
    }

    /* renamed from: c */
    private void m7447c() {
        ConcurrentHashMap<String, AbstractC3137b> concurrentHashMap = AbstractC3134b.f7000a;
        if (!(concurrentHashMap == null || concurrentHashMap.size() == 0)) {
            for (Map.Entry<String, AbstractC3137b> entry : AbstractC3134b.f7000a.entrySet()) {
                entry.getValue().mo37655b();
            }
        }
    }

    /* renamed from: d */
    private void m7448d() {
        ConcurrentHashMap<String, AbstractC3137b> concurrentHashMap = AbstractC3134b.f7000a;
        if (!(concurrentHashMap == null || concurrentHashMap.size() == 0)) {
            for (Map.Entry<String, AbstractC3137b> entry : AbstractC3134b.f7000a.entrySet()) {
                C3164c c = entry.getValue().mo37659c();
                if (c != null) {
                    c.f7135h = this.f6995d;
                    c.mo37712a();
                }
            }
        }
    }

    /* renamed from: e */
    private void m7449e() {
        ConcurrentHashMap<String, AbstractC3137b> concurrentHashMap = AbstractC3134b.f7000a;
        if (!(concurrentHashMap == null || concurrentHashMap.size() == 0)) {
            for (Map.Entry<String, AbstractC3137b> entry : AbstractC3134b.f7000a.entrySet()) {
                entry.getValue().mo37663e();
            }
        }
    }

    @Override // com.taobao.accs.internal.AbstractC3134b, com.taobao.accs.base.IBaseService
    public IBinder onBind(Intent intent) {
        String action = intent.getAction();
        ALog.m7597d("ServiceImpl", "accs probeTaoBao begin......action=" + action, new Object[0]);
        if (TextUtils.isEmpty(action) || !TextUtils.equals(action, "org.agoo.android.intent.action.PING_V4")) {
            return null;
        }
        UTMini.getInstance().commitEvent(66001, "probeChannelService", UtilityImpl.m7644l(this.f6994c), intent.getStringExtra("source"));
        return this.f6997g;
    }

    @Override // com.taobao.accs.internal.AbstractC3134b, com.taobao.accs.base.IBaseService
    public void onCreate() {
        super.onCreate();
        m7441a();
    }

    @Override // com.taobao.accs.internal.AbstractC3134b, com.taobao.accs.base.IBaseService
    public void onDestroy() {
        super.onDestroy();
        ALog.m7599e("ServiceImpl", "Service onDestroy", new Object[0]);
        UtilityImpl.m7614a(this.f6994c, Constants.SP_KEY_SERVICE_END, System.currentTimeMillis());
        this.f6993b = null;
        this.f6994c = null;
        m7449e();
        Process.killProcess(Process.myPid());
    }

    @Override // com.taobao.accs.internal.AbstractC3134b, com.taobao.accs.base.IBaseService
    public boolean onUnbind(Intent intent) {
        return false;
    }

    @Override // com.taobao.accs.internal.AbstractC3134b
    /* renamed from: a */
    public int mo37638a(Intent intent) {
        Throwable th;
        String str;
        Bundle extras;
        int i = 2;
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.m7600i("ServiceImpl", "onHostStartCommand", "intent", intent);
        }
        try {
            if (!(!ALog.isPrintLog(ALog.Level.D) || intent == null || (extras = intent.getExtras()) == null)) {
                for (String str2 : extras.keySet()) {
                    ALog.m7597d("ServiceImpl", "onHostStartCommand", "key", str2, " value", extras.get(str2));
                }
            }
            int c = C3187q.m7684c();
            if (c > 3) {
                try {
                    ALog.m7599e("ServiceImpl", "onHostStartCommand load SO fail 4 times, don't auto restart", new Object[0]);
                    C3179k.m7667a("accs", BaseMonitor.COUNT_POINT_SOFAIL, UtilityImpl.m7607a(c), AbstractC8352oOoOOoO0.OooO0O0);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        ALog.m7598e("ServiceImpl", "onHostStartCommand", th, new Object[0]);
                        C3103a.f6877g.incrementAndGet();
                        return i;
                    } catch (Throwable th3) {
                        C3103a.f6877g.incrementAndGet();
                        throw th3;
                    }
                }
            } else {
                i = 1;
            }
            if (intent == null) {
                str = null;
            } else {
                str = intent.getAction();
            }
            if (TextUtils.isEmpty(str)) {
                m7445b();
                m7444a(false, false);
                C3103a.f6877g.incrementAndGet();
                return i;
            }
            m7442a(intent, str);
            C3103a.f6877g.incrementAndGet();
            return i;
        } catch (Throwable th4) {
            th = th4;
            i = 1;
            ALog.m7598e("ServiceImpl", "onHostStartCommand", th, new Object[0]);
            C3103a.f6877g.incrementAndGet();
            return i;
        }
    }

    /* renamed from: a */
    private void m7441a() {
        ALog.m7597d("ServiceImpl", "init start", new Object[0]);
        GlobalClientInfo.getInstance(this.f6994c);
        C3103a.f6877g.incrementAndGet();
        this.f6995d = System.currentTimeMillis();
        this.f6996f = UtilityImpl.m7640h(this.f6994c);
        if (Config.m14277f(this.f6994c)) {
            C3089a.m7244c(this.f6994c);
            C3089a a = C3089a.m7233a(this.f6994c, 600, false);
            f6992e = a;
            if (a != null) {
                a.mo37426a();
            }
        }
        if (ALog.isPrintLog(ALog.Level.I)) {
            ALog.m7600i("ServiceImpl", "init", "sdkVersion", Integer.valueOf(Constants.SDK_VERSION_CODE), "procStart", Integer.valueOf(C3103a.f6877g.intValue()));
        }
        UTMini.getInstance().commitEvent(66001, "START", UtilityImpl.m7631d(), "PROXY");
        long n = UtilityImpl.m7646n(this.f6994c);
        ALog.m7597d("ServiceImpl", "getServiceAliveTime", "aliveTime", Long.valueOf(n));
        if (n > 20000) {
            C3179k.m7667a("accs", BaseMonitor.COUNT_SERVICE_ALIVE, "", (double) (n / 1000));
        }
        UtilityImpl.m7614a(this.f6994c, Constants.SP_KEY_SERVICE_START, System.currentTimeMillis());
        UTMini.getInstance().commitEvent(66001, "NOTIFY", UtilityImpl.m7650r(this.f6994c));
    }

    /* renamed from: a */
    private void m7442a(Intent intent, String str) {
        ALog.m7597d("ServiceImpl", "handleAction", "action", str);
        try {
            if (!TextUtils.isEmpty(str) && "org.agoo.android.intent.action.PING_V4".equals(str)) {
                String stringExtra = intent.getStringExtra("source");
                ALog.m7600i("ServiceImpl", "org.agoo.android.intent.action.PING_V4,start channel by brothers", "serviceStart", Integer.valueOf(C3103a.f6877g.intValue()), "source" + stringExtra);
                C3179k.m7667a("accs", "startChannel", stringExtra, AbstractC8352oOoOOoO0.OooO0O0);
                if (C3103a.m7297c()) {
                    C3179k.m7667a("accs", "createChannel", stringExtra, AbstractC8352oOoOOoO0.OooO0O0);
                }
            }
            m7445b();
            if (!TextUtils.equals(str, "android.intent.action.PACKAGE_REMOVED")) {
                if (TextUtils.equals(str, "android.net.conn.CONNECTIVITY_CHANGE")) {
                    String h = UtilityImpl.m7640h(this.f6994c);
                    boolean k = UtilityImpl.m7643k(this.f6994c);
                    ALog.m7600i("ServiceImpl", "network change:" + this.f6996f + " to " + h, new Object[0]);
                    if (k) {
                        this.f6996f = h;
                        m7447c();
                        m7444a(true, false);
                        UTMini.getInstance().commitEvent(66001, "CONNECTIVITY_CHANGE", h, UtilityImpl.m7631d(), "0");
                    }
                    if (h.equals("unknown")) {
                        m7447c();
                        this.f6996f = h;
                    }
                } else if (TextUtils.equals(str, UmengMessageBootReceiver.f9982c)) {
                    m7444a(true, false);
                } else if (TextUtils.equals(str, "android.intent.action.USER_PRESENT")) {
                    ALog.m7597d("ServiceImpl", "action android.intent.action.USER_PRESENT", new Object[0]);
                    m7444a(true, false);
                } else if (str.equals(Constants.ACTION_COMMAND)) {
                    m7446b(intent);
                } else if (str.equals(Constants.ACTION_START_FROM_AGOO)) {
                    ALog.m7600i("ServiceImpl", "ACTION_START_FROM_AGOO", new Object[0]);
                }
            }
        } catch (Throwable th) {
            ALog.m7598e("ServiceImpl", "handleAction", th, new Object[0]);
        }
    }

    /* renamed from: b */
    private synchronized void m7445b() {
        if (AbstractC3134b.f7000a != null) {
            if (AbstractC3134b.f7000a.size() != 0) {
                for (Map.Entry<String, AbstractC3137b> entry : AbstractC3134b.f7000a.entrySet()) {
                    AbstractC3137b value = entry.getValue();
                    if (value == null) {
                        ALog.m7599e("ServiceImpl", "tryConnect connection null", "appkey", value.mo37667i());
                        return;
                    }
                    ALog.m7600i("ServiceImpl", "tryConnect", "appkey", value.mo37667i(), Constants.KEY_CONFIG_TAG, entry.getKey());
                    if (!value.mo37670l() || !TextUtils.isEmpty(value.f7017i.getAppSecret())) {
                        value.mo37646a();
                    } else {
                        ALog.m7599e("ServiceImpl", "tryConnect secret is null", new Object[0]);
                    }
                }
                return;
            }
        }
        ALog.m7603w("ServiceImpl", "tryConnect no connections", new Object[0]);
    }

    /* renamed from: a */
    private void m7443a(Message message, boolean z) {
        ConcurrentHashMap<String, AbstractC3137b> concurrentHashMap = AbstractC3134b.f7000a;
        if (!(concurrentHashMap == null || concurrentHashMap.size() == 0)) {
            for (Map.Entry<String, AbstractC3137b> entry : AbstractC3134b.f7000a.entrySet()) {
                entry.getValue().mo37658b(message, z);
            }
        }
    }

    /* renamed from: a */
    private void m7444a(boolean z, boolean z2) {
        ConcurrentHashMap<String, AbstractC3137b> concurrentHashMap = AbstractC3134b.f7000a;
        if (!(concurrentHashMap == null || concurrentHashMap.size() == 0)) {
            for (Map.Entry<String, AbstractC3137b> entry : AbstractC3134b.f7000a.entrySet()) {
                AbstractC3137b value = entry.getValue();
                value.mo37651a(z, z2);
                ALog.m7600i("ServiceImpl", "ping connection", "appkey", value.mo37667i());
            }
        }
    }
}
