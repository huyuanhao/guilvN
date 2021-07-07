package com.p118pd.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.huawei.android.hms.agent.common.BaseAgentActivity;
import com.huawei.android.hms.agent.common.HMSAgentActivity;
import com.huawei.hms.activity.BridgeActivity;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.api.HuaweiApiClient;
import com.huawei.hms.support.api.push.HuaweiPush;
import com.p118pd.sdk.C8417oOoo0o0O;
import com.taobao.accs.utl.BaseMonitor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pd.sdk.oOoo0o  reason: case insensitive filesystem */
public final class C8413oOoo0o implements HuaweiApiClient.ConnectionCallbacks, HuaweiApiClient.OnConnectionFailedListener, AbstractC8428oOooO00, AbstractC8429oOooO000, AbstractC8389oOoo {
    public static final C8413oOoo0o OooO00o = new C8413oOoo0o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Object f21543OooO00o = new Object();
    public static final int OooO0O0 = 30000;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final Object f21544OooO0O0 = new Object();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final String f21545OooO0O0 = "com.huawei.appmarket";
    public static final int OooO0OO = 3000;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public static final Object f21546OooO0OO = new Object();
    public static final int OooO0Oo = 3000;
    public static final int OooO0o = 4;
    public static final int OooO0o0 = 3;
    public static final int OooO0oO = 5;
    public static final int OooO0oo = 3;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int f21547OooO00o = 3;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f21548OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Handler f21549OooO00o = new Handler(new OooO00o());

    /* renamed from: OooO00o  reason: collision with other field name */
    public BridgeActivity f21550OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public HuaweiApiClient f21551OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f21552OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List<AbstractC8430oOooO00O> f21553OooO00o = new ArrayList();

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f21554OooO00o = false;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public List<AbstractC8430oOooO00O> f21555OooO0O0 = new ArrayList();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f21556OooO0O0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public boolean f21557OooO0OO = false;

    /* renamed from: com.pd.sdk.oOoo0o$OooO00o */
    public class OooO00o implements Handler.Callback {
        public OooO00o() {
        }

        public boolean handleMessage(Message message) {
            boolean z;
            synchronized (C8413oOoo0o.f21543OooO00o) {
                z = !C8413oOoo0o.this.f21553OooO00o.isEmpty();
            }
            if (message != null && message.what == 3 && z) {
                C8425oOoo0ooo.OooO00o("connect time out");
                C8413oOoo0o.this.OooO0O0();
                C8413oOoo0o.this.OooO0O0((C8413oOoo0o) C8417oOoo0o0O.OooO0O0.OooO);
                return true;
            } else if (message != null && message.what == 4 && z) {
                C8425oOoo0ooo.OooO00o("start activity time out");
                C8413oOoo0o.this.OooO0O0((C8413oOoo0o) C8417oOoo0o0O.OooO0O0.OooO);
                return true;
            } else if (message == null || message.what != 5 || !z) {
                return false;
            } else {
                C8425oOoo0ooo.OooO00o("Discarded update dispose:hasOverActivity=" + C8413oOoo0o.this.f21557OooO0OO + " resolveActivity=" + C8432oOooO0O0.OooO00o(C8413oOoo0o.this.f21550OooO00o));
                if (C8413oOoo0o.this.f21557OooO0OO && C8413oOoo0o.this.f21550OooO00o != null && !C8413oOoo0o.this.f21550OooO00o.isFinishing()) {
                    C8413oOoo0o.this.OooO00o(13);
                }
                return true;
            }
        }
    }

    /* renamed from: com.pd.sdk.oOoo0o$OooO0O0 */
    public class OooO0O0 implements Runnable {
        public OooO0O0() {
        }

        public void run() {
            HuaweiApiClient OooO00o2 = C8413oOoo0o.this.OooO00o();
            if (OooO00o2 != null) {
                C8425oOoo0ooo.OooO00o(BaseMonitor.ALARM_POINT_CONNECT);
                Activity OooO00o3 = C8418oOoo0o0o.OooO00o.OooO00o();
                C8413oOoo0o.this.f21549OooO00o.sendEmptyMessageDelayed(3, 30000);
                OooO00o2.connect(OooO00o3);
                return;
            }
            C8425oOoo0ooo.OooO00o("client is generate error");
            C8413oOoo0o.this.OooO0O0((C8413oOoo0o) C8417oOoo0o0O.OooO0O0.OooO0Oo);
        }
    }

    /* renamed from: com.pd.sdk.oOoo0o$OooO0OO */
    public class OooO0OO implements Runnable {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC8430oOooO00O f21558OooO00o;
        public final /* synthetic */ int o00oO0O;

        public OooO0OO(int i, AbstractC8430oOooO00O ooooo00o) {
            this.o00oO0O = i;
            this.f21558OooO00o = ooooo00o;
        }

        public void run() {
            HuaweiApiClient OooO00o2 = C8413oOoo0o.this.OooO00o();
            C8425oOoo0ooo.OooO00o("callback connect: rst=" + this.o00oO0O + " apiClient=" + OooO00o2);
            this.f21558OooO00o.OooO00o(this.o00oO0O, OooO00o2);
        }
    }

    /* renamed from: com.pd.sdk.oOoo0o$OooO0Oo  reason: case insensitive filesystem */
    public static class RunnableC8414OooO0Oo implements Runnable {
        public final /* synthetic */ HuaweiApiClient OooO00o;

        public RunnableC8414OooO0Oo(HuaweiApiClient huaweiApiClient) {
            this.OooO00o = huaweiApiClient;
        }

        public void run() {
            this.OooO00o.disconnect();
        }
    }

    private void OooO0OO() {
        this.f21547OooO00o--;
        C8425oOoo0ooo.OooO00o("start thread to connect");
        C8433oOooO0OO.OooO00o.OooO00o(new OooO0O0());
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m20080OooO0O0() {
        C8425oOoo0ooo.OooO00o("release");
        this.f21556OooO0O0 = false;
        this.f21550OooO00o = null;
        this.f21557OooO0OO = false;
        HuaweiApiClient OooO00o2 = OooO00o();
        if (OooO00o2 != null) {
            OooO00o2.disconnect();
        }
        synchronized (f21546OooO0OO) {
            this.f21551OooO00o = null;
        }
        synchronized (f21544OooO0O0) {
            this.f21555OooO0O0.clear();
        }
        synchronized (f21543OooO00o) {
            this.f21553OooO00o.clear();
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient.ConnectionCallbacks
    public void onConnected() {
        C8425oOoo0ooo.OooO00o("connect success");
        this.f21549OooO00o.removeMessages(3);
        OooO0O0(0);
    }

    @Override // com.huawei.hms.api.HuaweiApiClient.OnConnectionFailedListener
    public void onConnectionFailed(ConnectionResult connectionResult) {
        this.f21549OooO00o.removeMessages(3);
        if (connectionResult == null) {
            C8425oOoo0ooo.OooO0O0("result is null");
            OooO0O0(C8417oOoo0o0O.OooO0O0.OooO0Oo);
            return;
        }
        int errorCode = connectionResult.getErrorCode();
        C8425oOoo0ooo.OooO00o("errCode=" + errorCode + " allowResolve=" + this.f21554OooO00o);
        if (!HuaweiApiAvailability.getInstance().isUserResolvableError(errorCode) || !this.f21554OooO00o) {
            OooO0O0(errorCode);
            return;
        }
        Activity OooO00o2 = C8418oOoo0o0o.OooO00o.OooO00o();
        if (OooO00o2 != null) {
            try {
                this.f21549OooO00o.sendEmptyMessageDelayed(4, 3000);
                Intent intent = new Intent(OooO00o2, HMSAgentActivity.class);
                intent.putExtra(HMSAgentActivity.o0ooOoO, errorCode);
                intent.putExtra(BaseAgentActivity.o0ooOOo, C8434oOooO0Oo.OooO00o(OooO00o2));
                OooO00o2.startActivity(intent);
            } catch (Exception e) {
                C8425oOoo0ooo.OooO0O0("start HMSAgentActivity exception:" + e.getMessage());
                this.f21549OooO00o.removeMessages(4);
                OooO0O0(C8417oOoo0o0O.OooO0O0.OooO0o);
            }
        } else {
            C8425oOoo0ooo.OooO00o("no activity");
            OooO0O0(C8417oOoo0o0O.OooO0O0.OooO0OO);
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient.ConnectionCallbacks
    public void onConnectionSuspended(int i) {
        C8425oOoo0ooo.OooO00o("connect suspended");
        OooO00o((AbstractC8430oOooO00O) new C8424oOoo0ooO("onConnectionSuspended try end:"), true);
    }

    public void OooO00o(Application application) {
        C8425oOoo0ooo.OooO00o("init");
        this.f21548OooO00o = application.getApplicationContext();
        this.f21552OooO00o = application.getPackageName();
        C8418oOoo0o0o.OooO00o.OooO0O0((AbstractC8428oOooO00) this);
        C8418oOoo0o0o.OooO00o.OooO00o((AbstractC8428oOooO00) this);
        C8418oOoo0o0o.OooO00o.OooO0O0((AbstractC8429oOooO000) this);
        C8418oOoo0o0o.OooO00o.OooO00o((AbstractC8429oOooO000) this);
        C8418oOoo0o0o.OooO00o.OooO0O0((AbstractC8389oOoo) this);
        C8418oOoo0o0o.OooO00o.OooO00o((AbstractC8389oOoo) this);
    }

    public HuaweiApiClient OooO00o() {
        HuaweiApiClient OooO0O02;
        synchronized (f21546OooO0OO) {
            OooO0O02 = this.f21551OooO00o != null ? this.f21551OooO00o : OooO0O0();
        }
        return OooO0O02;
    }

    public void OooO0O0(AbstractC8430oOooO00O ooooo00o) {
        synchronized (f21544OooO0O0) {
            this.f21555OooO0O0.remove(ooooo00o);
        }
    }

    public boolean OooO00o(HuaweiApiClient huaweiApiClient) {
        return huaweiApiClient != null && huaweiApiClient.isConnected();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private HuaweiApiClient OooO0O0() {
        HuaweiApiClient build;
        if (this.f21548OooO00o == null) {
            C8425oOoo0ooo.OooO0O0("HMSAgent not init");
            return null;
        }
        synchronized (f21546OooO0OO) {
            if (this.f21551OooO00o != null) {
                OooO00o(this.f21551OooO00o, 60000);
            }
            C8425oOoo0ooo.OooO00o("reset client");
            build = new HuaweiApiClient.Builder(this.f21548OooO00o).addApi(HuaweiPush.PUSH_API).addConnectionCallbacks(OooO00o).addOnConnectionFailedListener(OooO00o).build();
            this.f21551OooO00o = build;
        }
        return build;
    }

    public void OooO00o(AbstractC8430oOooO00O ooooo00o) {
        synchronized (f21544OooO0O0) {
            this.f21555OooO0O0.add(ooooo00o);
        }
    }

    public void OooO00o(AbstractC8430oOooO00O ooooo00o, boolean z) {
        if (this.f21548OooO00o == null) {
            OooO00o(-1000, ooooo00o);
            return;
        }
        HuaweiApiClient OooO00o2 = OooO00o();
        boolean z2 = false;
        if (OooO00o2 == null || !OooO00o2.isConnected()) {
            synchronized (f21543OooO00o) {
                C8425oOoo0ooo.OooO00o("client is invalid：size=" + this.f21553OooO00o.size());
                if (this.f21554OooO00o || z) {
                    z2 = true;
                }
                this.f21554OooO00o = z2;
                if (this.f21553OooO00o.isEmpty()) {
                    this.f21553OooO00o.add(ooooo00o);
                    this.f21547OooO00o = 3;
                    OooO0OO();
                } else {
                    this.f21553OooO00o.add(ooooo00o);
                }
            }
            return;
        }
        C8425oOoo0ooo.OooO00o("client is valid");
        OooO00o(0, ooooo00o);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void OooO0O0(int i) {
        C8425oOoo0ooo.OooO00o("connect end:" + i);
        synchronized (f21543OooO00o) {
            for (AbstractC8430oOooO00O ooooo00o : this.f21553OooO00o) {
                OooO00o(i, ooooo00o);
            }
            this.f21553OooO00o.clear();
            this.f21554OooO00o = false;
        }
        synchronized (f21544OooO0O0) {
            for (AbstractC8430oOooO00O ooooo00o2 : this.f21555OooO0O0) {
                OooO00o(i, ooooo00o2);
            }
            this.f21555OooO0O0.clear();
        }
    }

    private void OooO00o(int i, AbstractC8430oOooO00O ooooo00o) {
        C8433oOooO0OO.OooO00o.OooO00o(new OooO0OO(i, ooooo00o));
    }

    @Override // com.p118pd.sdk.AbstractC8429oOooO000
    public void OooO00o(Activity activity) {
        HuaweiApiClient OooO00o2 = OooO00o();
        if (OooO00o2 != null) {
            OooO00o2.onPause(activity);
        }
    }

    @Override // com.p118pd.sdk.AbstractC8389oOoo
    public void OooO00o(Activity activity, Activity activity2) {
        if (activity2 == null) {
            OooO0O0();
        }
    }

    public void OooO00o(int i) {
        HuaweiApiClient OooO00o2;
        C8425oOoo0ooo.OooO00o("result=" + i);
        this.f21556OooO0O0 = false;
        this.f21550OooO00o = null;
        this.f21557OooO0OO = false;
        if (i != 0 || (OooO00o2 = OooO00o()) == null || OooO00o2.isConnecting() || OooO00o2.isConnected() || this.f21547OooO00o <= 0) {
            OooO0O0(i);
        } else {
            OooO0OO();
        }
    }

    @Override // com.p118pd.sdk.AbstractC8428oOooO00
    public void OooO0O0(Activity activity) {
        HuaweiApiClient OooO00o2 = OooO00o();
        if (OooO00o2 != null) {
            C8425oOoo0ooo.OooO00o("tell hmssdk: onResume");
            OooO00o2.onResume(activity);
        }
        C8425oOoo0ooo.OooO00o("is resolving:" + this.f21556OooO0O0);
        if (this.f21556OooO0O0 && !f21545OooO0O0.equals(this.f21552OooO00o)) {
            if (activity instanceof BridgeActivity) {
                this.f21550OooO00o = (BridgeActivity) activity;
                this.f21557OooO0OO = false;
                C8425oOoo0ooo.OooO00o("received bridgeActivity:" + C8432oOooO0O0.OooO00o(this.f21550OooO00o));
            } else {
                BridgeActivity bridgeActivity = this.f21550OooO00o;
                if (bridgeActivity != null && !bridgeActivity.isFinishing()) {
                    this.f21557OooO0OO = true;
                    C8425oOoo0ooo.OooO00o("received other Activity:" + C8432oOooO0O0.OooO00o(this.f21550OooO00o));
                }
            }
            this.f21549OooO00o.removeMessages(5);
            this.f21549OooO00o.sendEmptyMessageDelayed(5, 3000);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20079OooO00o() {
        C8425oOoo0ooo.OooO00o("resolve onActivityLunched");
        this.f21549OooO00o.removeMessages(4);
        this.f21556OooO0O0 = true;
    }

    public static void OooO00o(HuaweiApiClient huaweiApiClient, int i) {
        new Handler().postDelayed(new RunnableC8414OooO0Oo(huaweiApiClient), (long) i);
    }
}
