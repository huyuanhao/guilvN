package com.taobao.accs.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.text.TextUtils;
import anet.channel.SessionCenter;
import com.p118pd.sdk.C7227o00ooO0O;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AbstractC3099c;
import com.taobao.accs.AbstractC3107d;
import com.taobao.accs.AbstractC3123f;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.AccsException;
import com.taobao.accs.C3083a;
import com.taobao.accs.ErrorCode;
import com.taobao.accs.IAgooAppReceiver;
import com.taobao.accs.IAppReceiver;
import com.taobao.accs.ILoginInfo;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.AccsDataListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.data.C3116g;
import com.taobao.accs.data.Message;
import com.taobao.accs.p259a.C3084a;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.C3178j;
import com.taobao.accs.utl.C3179k;
import com.taobao.accs.utl.C3180l;
import com.taobao.accs.utl.C3190t;
import com.taobao.accs.utl.C3194w;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.aranger.ARanger;
import com.taobao.aranger.exception.IPCException;
import com.umeng.analytics.pro.C3416b;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class ACCSManagerImpl implements AbstractC3099c {

    /* renamed from: c */
    public static String f6984c = "ACCSMgrImpl_";

    /* renamed from: a */
    public int f6985a = 0;

    /* renamed from: b */
    public String f6986b;

    /* renamed from: d */
    public AbstractC3107d f6987d;

    /* renamed from: e */
    public BroadcastReceiver f6988e = new BroadcastReceiver() {
        /* class com.taobao.accs.internal.ACCSManagerImpl.C31301 */

        public void onReceive(Context context, Intent intent) {
            try {
                AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(ACCSManagerImpl.this.f6986b);
                if ("com.taobao.aranger.DISCONNECT".equals(intent.getAction())) {
                    ARanger.getInstance(C3083a.class.getName(), AbstractC3123f.class, new Object[]{context});
                    if (GlobalClientInfo.f6859b != null) {
                        IAgooAppReceiver iAgooAppReceiver = GlobalClientInfo.f6859b;
                    }
                    if (GlobalClientInfo.getInstance(context).getAppReceiver() != null) {
                        for (Map.Entry<String, IAppReceiver> entry : GlobalClientInfo.getInstance(context).getAppReceiver().entrySet()) {
                            entry.getKey();
                            entry.getValue();
                        }
                    }
                    if (GlobalClientInfo.getInstance(context).getListener() != null) {
                        for (Map.Entry<String, AccsDataListener> entry2 : GlobalClientInfo.getInstance(context).getListener().entrySet()) {
                            entry2.getKey();
                            entry2.getValue();
                        }
                    }
                    ACCSManagerImpl.this.f6987d = (AbstractC3107d) ARanger.getService(C3083a.class.getName(), AbstractC3107d.class, new Object[]{configByTag});
                    ACCSManagerImpl.this.f6987d.mo37536a();
                }
            } catch (Exception e) {
                ALog.m7598e(ACCSManagerImpl.f6984c, "on receive action error, Error:", e, new Object[0]);
                if (e instanceof IPCException) {
                    C3190t.m7706f();
                    ACCSManagerImpl.this.f6987d = new C3133a(ACCSManagerImpl.this.f6986b);
                }
            }
        }
    };

    /* renamed from: f */
    public BroadcastReceiver f6989f = new BroadcastReceiver() {
        /* class com.taobao.accs.internal.ACCSManagerImpl.C31312 */

        public void onReceive(Context context, Intent intent) {
            try {
                AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(ACCSManagerImpl.this.f6986b);
                String action = intent.getAction();
                char c = 65535;
                int hashCode = action.hashCode();
                if (hashCode != -1322929215) {
                    if (hashCode != -1034470443) {
                        if (hashCode == -1034337366) {
                            if (action.equals(C3180l.ACTION_STATE_FORE)) {
                                c = 0;
                            }
                        }
                    } else if (action.equals(C3180l.ACTION_STATE_BACK)) {
                        c = 1;
                    }
                } else if (action.equals(C3180l.ACTION_STATE_DEEPBACK)) {
                    c = 2;
                }
                if (c == 0) {
                    if (ACCSManagerImpl.this.f6987d == null) {
                        ACCSManagerImpl.this.f6987d = (AbstractC3107d) ARanger.getService(C3083a.class.getName(), AbstractC3107d.class, new Object[]{configByTag});
                    }
                    ACCSManagerImpl.this.f6987d.mo37537a(1);
                    if (intent.getBooleanExtra("state", true)) {
                        ACCSManagerImpl.this.f6987d.mo37539a(Message.buildForeground(ACCSManagerImpl.this.f6987d.mo37544b(null)));
                        ALog.m7600i(ACCSManagerImpl.f6984c, "send foreground state frame", new Object[0]);
                    }
                } else if (c == 1) {
                    if (ACCSManagerImpl.this.f6987d == null) {
                        ACCSManagerImpl.this.f6987d = (AbstractC3107d) ARanger.getService(C3083a.class.getName(), AbstractC3107d.class, new Object[]{configByTag});
                    }
                    ACCSManagerImpl.this.f6987d.mo37537a(0);
                } else if (c == 2) {
                    if (ACCSManagerImpl.this.f6987d == null) {
                        ACCSManagerImpl.this.f6987d = (AbstractC3107d) ARanger.getService(C3083a.class.getName(), AbstractC3107d.class, new Object[]{configByTag});
                    }
                    ACCSManagerImpl.this.f6987d.mo37537a(2);
                    ACCSManagerImpl.this.f6987d.mo37539a(Message.buildBackground(ACCSManagerImpl.this.f6987d.mo37544b(null)));
                    ALog.m7600i(ACCSManagerImpl.f6984c, "send background state frame", new Object[0]);
                }
            } catch (Exception e) {
                ALog.m7598e(ACCSManagerImpl.f6984c, "on receive action error, Error:", e, new Object[0]);
                if (e instanceof IPCException) {
                    ACCSManagerImpl.this.f6987d = new C3133a(ACCSManagerImpl.this.f6986b);
                    C3190t.m7706f();
                }
            }
        }
    };

    public ACCSManagerImpl(Context context, String str) {
        GlobalClientInfo.f6858a = context.getApplicationContext();
        this.f6986b = str;
        if (C3190t.m7707g()) {
            AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(this.f6986b);
            if (configByTag == null) {
                try {
                    configByTag = new AccsClientConfig.Builder().setAppKey(ACCSManager.getDefaultAppkey(context)).setTag(str).build();
                } catch (AccsException e) {
                    ALog.m7598e(f6984c, "ACCSManagerImpl build config", e, new Object[0]);
                }
            }
            try {
                this.f6987d = (AbstractC3107d) ARanger.getService(C3083a.class.getName(), AbstractC3107d.class, new Object[]{configByTag});
                if (C3194w.m7720e(context)) {
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("com.taobao.aranger.DISCONNECT");
                    context.registerReceiver(this.f6988e, intentFilter);
                    IntentFilter intentFilter2 = new IntentFilter();
                    intentFilter2.addAction(C3180l.ACTION_STATE_FORE);
                    intentFilter2.addAction(C3180l.ACTION_STATE_BACK);
                    intentFilter2.addAction(C3180l.ACTION_STATE_DEEPBACK);
                    this.f6987d.mo37537a(C3180l.m7670a().mo37771c());
                    C7227o00ooO0O.OooO00o(context).OooO00o(this.f6989f, intentFilter2);
                }
            } catch (Exception unused) {
                C3190t.m7706f();
                this.f6987d = new C3133a(str);
            }
        } else {
            this.f6987d = new C3133a(str);
        }
        f6984c += this.f6986b;
    }

    @Override // com.taobao.accs.AbstractC3099c
    /* renamed from: c */
    public void mo37488c(Context context, String str) {
        if (!UtilityImpl.m7634d(context)) {
            Intent b = m7403b(context, 6);
            if (b == null) {
                m7401a(context, 6, str, (String) null);
                return;
            }
            String c = this.f6987d.mo37546c();
            if (!TextUtils.isEmpty(c)) {
                b.putExtra("appKey", c);
                b.putExtra(Constants.KEY_SERVICE_ID, str);
                if (UtilityImpl.isMainProcess(context)) {
                    m7402a(context, Message.buildUnbindService(this.f6987d.mo37544b(null), this.f6986b, b), 6, false);
                }
            }
        }
    }

    @Override // com.taobao.accs.AbstractC3099c
    /* renamed from: e */
    public void mo37491e(Context context) {
        GlobalClientInfo.getInstance(context).clearLoginInfoImpl();
    }

    @Override // com.taobao.accs.AbstractC3099c
    /* renamed from: b */
    public void mo37484b(Context context, String str) {
        if (!UtilityImpl.m7634d(context) && !UtilityImpl.m7634d(context)) {
            Intent b = m7403b(context, 5);
            if (b == null) {
                m7401a(context, 5, str, (String) null);
                return;
            }
            String c = this.f6987d.mo37546c();
            if (!TextUtils.isEmpty(c)) {
                b.putExtra("appKey", c);
                b.putExtra(Constants.KEY_SERVICE_ID, str);
                if (UtilityImpl.isMainProcess(context)) {
                    Message buildBindService = Message.buildBindService(this.f6987d.mo37544b(null), this.f6986b, b);
                    if (!(buildBindService == null || buildBindService.getNetPermanceMonitor() == null)) {
                        buildBindService.getNetPermanceMonitor().setDataId(buildBindService.dataId);
                        buildBindService.getNetPermanceMonitor().setMsgType(3);
                        buildBindService.getNetPermanceMonitor().setHost(buildBindService.host.toString());
                    }
                    m7402a(context, buildBindService, 5, false);
                }
                this.f6987d.mo37545b();
            }
        }
    }

    @Override // com.taobao.accs.AbstractC3099c
    /* renamed from: d */
    public void mo37489d(Context context) {
        UtilityImpl.focusEnableService(context);
    }

    @Override // com.taobao.accs.AbstractC3099c
    /* renamed from: e */
    public void mo37492e(Context context, String str) {
        GlobalClientInfo.getInstance(context).unregisterListener(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0083 A[Catch:{ all -> 0x011e }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a8 A[Catch:{ all -> 0x011e }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b7 A[Catch:{ all -> 0x011e }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ed A[Catch:{ all -> 0x011e }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ff A[Catch:{ all -> 0x0114 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    @Override // com.taobao.accs.AbstractC3099c
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo37473a(android.content.Context r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, com.taobao.accs.IAppReceiver r14) {
        /*
        // Method dump skipped, instructions count: 297
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.internal.ACCSManagerImpl.mo37473a(android.content.Context, java.lang.String, java.lang.String, java.lang.String, com.taobao.accs.IAppReceiver):void");
    }

    @Override // com.taobao.accs.AbstractC3099c
    /* renamed from: d */
    public void mo37490d(Context context, String str) {
        GlobalClientInfo.getInstance(context).unRegisterService(str);
    }

    @Override // com.taobao.accs.AbstractC3099c
    /* renamed from: c */
    public void mo37487c(Context context) {
        UtilityImpl.focusDisableService(context);
    }

    @Override // com.taobao.accs.AbstractC3099c
    /* renamed from: c */
    public Map<String, Boolean> mo37486c() throws Exception {
        SessionCenter.getInstance(this.f6987d.mo37546c()).forceRecreateAccsSession();
        return mo37483b();
    }

    @Override // com.taobao.accs.AbstractC3099c
    /* renamed from: b */
    public String mo37481b(Context context, String str, String str2, byte[] bArr, String str3, String str4) {
        return mo37482b(context, str, str2, bArr, str3, str4, null);
    }

    @Override // com.taobao.accs.AbstractC3099c
    /* renamed from: b */
    public String mo37482b(Context context, String str, String str2, byte[] bArr, String str3, String str4, URL url) {
        return mo37480b(context, new ACCSManager.AccsRequest(str, str2, bArr, str3, str4, url, null));
    }

    @Override // com.taobao.accs.AbstractC3099c
    /* renamed from: b */
    public String mo37480b(Context context, ACCSManager.AccsRequest accsRequest) {
        return mo37461a(context, accsRequest, (String) null, true);
    }

    @Override // com.taobao.accs.AbstractC3099c
    /* renamed from: b */
    public boolean mo37485b(Context context) {
        return UtilityImpl.m7643k(context);
    }

    /* renamed from: b */
    private Intent m7403b(Context context, int i) {
        if (i == 1 || !UtilityImpl.m7634d(context)) {
            Intent intent = new Intent();
            intent.setAction(Constants.ACTION_COMMAND);
            intent.setClassName(context.getPackageName(), C3178j.channelService);
            intent.putExtra(Constants.KEY_PACKAGE_NAME, context.getPackageName());
            intent.putExtra("command", i);
            intent.putExtra("appKey", this.f6987d.mo37546c());
            intent.putExtra(Constants.KEY_CONFIG_TAG, this.f6986b);
            return intent;
        }
        ALog.m7599e(f6984c, "getIntent null command:" + i + " accs enabled:" + UtilityImpl.m7634d(context), new Object[0]);
        return null;
    }

    @Override // com.taobao.accs.AbstractC3099c
    /* renamed from: b */
    public Map<String, Boolean> mo37483b() throws Exception {
        String b = this.f6987d.mo37544b(null);
        HashMap hashMap = new HashMap();
        hashMap.put(b, false);
        if (SessionCenter.getInstance(this.f6987d.mo37546c()).getThrowsException(b, 60000) != null) {
            hashMap.put(b, true);
        }
        String str = f6984c;
        ALog.m7597d(str, "getChannelState " + hashMap.toString(), new Object[0]);
        return hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m7402a(android.content.Context r8, com.taobao.accs.data.Message r9, int r10, boolean r11) {
        /*
        // Method dump skipped, instructions count: 226
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.internal.ACCSManagerImpl.m7402a(android.content.Context, com.taobao.accs.data.Message, int, boolean):void");
    }

    @Override // com.taobao.accs.AbstractC3099c
    /* renamed from: a */
    public void mo37468a(Context context, String str) {
        mo37474a(context, str, false);
    }

    @Override // com.taobao.accs.AbstractC3099c
    /* renamed from: a */
    public void mo37474a(Context context, String str, boolean z) {
        try {
            ALog.m7600i(f6984c, "bindUser", "userId", str);
            if (UtilityImpl.m7634d(context)) {
                ALog.m7599e(f6984c, "accs disabled", new Object[0]);
                return;
            }
            Intent b = m7403b(context, 3);
            if (b == null) {
                ALog.m7599e(f6984c, "intent null", new Object[0]);
                m7401a(context, 3, (String) null, (String) null);
                return;
            }
            String c = this.f6987d.mo37546c();
            if (TextUtils.isEmpty(c)) {
                ALog.m7599e(f6984c, "appKey null", new Object[0]);
                return;
            }
            if (UtilityImpl.m7630c(context) || z) {
                ALog.m7600i(f6984c, "force bind User", new Object[0]);
                b.putExtra(Constants.KEY_FOUCE_BIND, true);
                z = true;
            }
            b.putExtra("appKey", c);
            b.putExtra("userInfo", str);
            if (UtilityImpl.isMainProcess(context)) {
                Message buildBindUser = Message.buildBindUser(this.f6987d.mo37544b(null), this.f6986b, b);
                if (!(buildBindUser == null || buildBindUser.getNetPermanceMonitor() == null)) {
                    buildBindUser.getNetPermanceMonitor().setDataId(buildBindUser.dataId);
                    buildBindUser.getNetPermanceMonitor().setMsgType(2);
                    buildBindUser.getNetPermanceMonitor().setHost(buildBindUser.host.toString());
                }
                m7402a(context, buildBindUser, 3, z);
            }
            this.f6987d.mo37545b();
        } catch (Throwable th) {
            ALog.m7598e(f6984c, "bindUser", th, new Object[0]);
        }
    }

    @Override // com.taobao.accs.AbstractC3099c
    /* renamed from: a */
    public void mo37465a(Context context) {
        if (!UtilityImpl.m7634d(context) && !UtilityImpl.m7634d(context)) {
            Intent b = m7403b(context, 4);
            if (b == null) {
                m7401a(context, 4, (String) null, (String) null);
                return;
            }
            String c = this.f6987d.mo37546c();
            if (!TextUtils.isEmpty(c)) {
                b.putExtra("appKey", c);
                if (UtilityImpl.isMainProcess(context)) {
                    m7402a(context, Message.buildUnbindUser(this.f6987d.mo37544b(null), this.f6986b, b), 4, false);
                }
            }
        }
    }

    @Override // com.taobao.accs.AbstractC3099c
    /* renamed from: a */
    public String mo37462a(Context context, String str, String str2, byte[] bArr, String str3) {
        return mo37463a(context, str, str2, bArr, str3, (String) null);
    }

    @Override // com.taobao.accs.AbstractC3099c
    /* renamed from: a */
    public String mo37463a(Context context, String str, String str2, byte[] bArr, String str3, String str4) {
        return mo37464a(context, str, str2, bArr, str3, str4, null);
    }

    @Override // com.taobao.accs.AbstractC3099c
    /* renamed from: a */
    public String mo37464a(Context context, String str, String str2, byte[] bArr, String str3, String str4, URL url) {
        return mo37459a(context, new ACCSManager.AccsRequest(str, str2, bArr, str3, str4, url, null));
    }

    @Override // com.taobao.accs.AbstractC3099c
    /* renamed from: a */
    public String mo37459a(Context context, ACCSManager.AccsRequest accsRequest) {
        try {
            boolean d = UtilityImpl.m7634d(context);
            if (!UtilityImpl.isMainProcess(context)) {
                ALog.m7599e(f6984c, "sendData not in mainprocess", new Object[0]);
                return null;
            }
            if (!d) {
                if (accsRequest != null) {
                    if (TextUtils.isEmpty(accsRequest.dataId)) {
                        synchronized (ACCSManagerImpl.class) {
                            this.f6985a++;
                            accsRequest.dataId = this.f6985a + "";
                        }
                    }
                    if (TextUtils.isEmpty(this.f6987d.mo37546c())) {
                        C3179k.m7668a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, accsRequest.serviceId, "1", "data appkey null");
                        ALog.m7599e(f6984c, "sendData appkey null", Constants.KEY_DATA_ID, accsRequest.dataId);
                        return null;
                    }
                    this.f6987d.mo37536a();
                    Message buildSendData = Message.buildSendData(this.f6987d.mo37544b(null), this.f6986b, this.f6987d.mo37550e(), context, context.getPackageName(), accsRequest);
                    if (!(buildSendData == null || buildSendData.getNetPermanceMonitor() == null)) {
                        buildSendData.getNetPermanceMonitor().onSend();
                    }
                    this.f6987d.mo37541a(buildSendData, true);
                    return accsRequest.dataId;
                }
            }
            if (d) {
                C3179k.m7668a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, accsRequest.serviceId, "1", "accs disable");
            } else {
                C3179k.m7668a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, "", "1", "data null");
            }
            ALog.m7599e(f6984c, "sendData dataInfo null or disable:" + d, new Object[0]);
            return null;
        } catch (Throwable th) {
            C3179k.m7668a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, accsRequest.serviceId, "1", "data " + th.toString());
            ALog.m7598e(f6984c, "sendData", th, "dataid", accsRequest.dataId);
        }
    }

    @Override // com.taobao.accs.AbstractC3099c
    /* renamed from: a */
    public String mo37461a(Context context, ACCSManager.AccsRequest accsRequest, String str, boolean z) {
        if (accsRequest == null) {
            try {
                ALog.m7599e(f6984c, "sendRequest request null", new Object[0]);
                C3179k.m7668a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, null, "1", "request null");
                return null;
            } catch (Throwable th) {
                if (accsRequest != null) {
                    C3179k.m7668a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, accsRequest.serviceId, "1", "request " + th.toString());
                    ALog.m7598e(f6984c, "sendRequest", th, Constants.KEY_DATA_ID, accsRequest.dataId);
                }
            }
        } else if (!UtilityImpl.isMainProcess(context)) {
            ALog.m7599e(f6984c, "sendRequest not in mainprocess", new Object[0]);
            return null;
        } else if (UtilityImpl.m7634d(context)) {
            ALog.m7599e(f6984c, "sendRequest disable", new Object[0]);
            C3179k.m7668a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, accsRequest.serviceId, "1", "accs disable");
            return null;
        } else {
            if (TextUtils.isEmpty(accsRequest.dataId)) {
                synchronized (ACCSManagerImpl.class) {
                    this.f6985a++;
                    accsRequest.dataId = this.f6985a + "";
                }
            }
            if (TextUtils.isEmpty(this.f6987d.mo37546c())) {
                C3179k.m7668a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, accsRequest.serviceId, "1", "request appkey null");
                ALog.m7599e(f6984c, "sendRequest appkey null", Constants.KEY_DATA_ID, accsRequest.dataId);
                return null;
            }
            this.f6987d.mo37536a();
            if (str == null) {
                str = context.getPackageName();
            }
            Message buildRequest = Message.buildRequest(context, this.f6987d.mo37544b(null), this.f6986b, "", str, Constants.TARGET_SERVICE_PRE, accsRequest, z);
            if (!(buildRequest == null || buildRequest.getNetPermanceMonitor() == null)) {
                buildRequest.getNetPermanceMonitor().onSend();
            }
            this.f6987d.mo37541a(buildRequest, true);
            return accsRequest.dataId;
        }
    }

    @Override // com.taobao.accs.AbstractC3099c
    /* renamed from: a */
    public String mo37460a(Context context, ACCSManager.AccsRequest accsRequest, TaoBaseService.ExtraInfo extraInfo) {
        boolean z;
        if (context == null || accsRequest == null) {
            ALog.m7599e(f6984c, "sendPushResponse input null", C3416b.f8433Q, context, "response", accsRequest, "extraInfo", extraInfo);
            C3179k.m7668a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, "", "1", "sendPushResponse null");
            return null;
        }
        try {
            C3179k.m7666a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, "push response total");
            if (UtilityImpl.m7634d(context)) {
                C3179k.m7668a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, accsRequest.serviceId, "1", "sendPushResponse accs disable");
                return null;
            }
            String c = this.f6987d.mo37546c();
            if (TextUtils.isEmpty(c)) {
                C3179k.m7668a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, accsRequest.serviceId, "1", "sendPushResponse appkey null");
                ALog.m7599e(f6984c, "sendPushResponse appkey null dataid:" + accsRequest.dataId, new Object[0]);
                return null;
            }
            if (TextUtils.isEmpty(accsRequest.dataId)) {
                synchronized (ACCSManagerImpl.class) {
                    this.f6985a++;
                    accsRequest.dataId = this.f6985a + "";
                }
            }
            TaoBaseService.ExtraInfo extraInfo2 = extraInfo == null ? new TaoBaseService.ExtraInfo() : extraInfo;
            accsRequest.host = null;
            extraInfo2.fromPackage = context.getPackageName();
            if (extraInfo2.connType == 0 || extraInfo2.fromHost == null) {
                extraInfo2.connType = 0;
                ALog.m7603w(f6984c, "pushresponse use channel", "host", extraInfo2.fromHost);
                z = false;
            } else {
                z = true;
            }
            ALog.m7600i(f6984c, "sendPushResponse", "sendbyInapp", Boolean.valueOf(z), "host", extraInfo2.fromHost, "pkg", extraInfo2.fromPackage, Constants.KEY_DATA_ID, accsRequest.dataId);
            if (z) {
                ALog.m7600i(f6984c, "sendPushResponse inapp by", "app", extraInfo2.fromPackage);
                accsRequest.host = new URL(extraInfo2.fromHost);
                if (!context.getPackageName().equals(extraInfo2.fromPackage) || !UtilityImpl.isMainProcess(context)) {
                    Intent intent = new Intent(Constants.ACTION_SEND);
                    intent.setClassName(extraInfo2.fromPackage, C3178j.msgService);
                    intent.putExtra(Constants.KEY_PACKAGE_NAME, context.getPackageName());
                    intent.putExtra(Constants.KEY_SEND_REQDATA, accsRequest);
                    intent.putExtra("appKey", c);
                    intent.putExtra(Constants.KEY_CONFIG_TAG, this.f6986b);
                    C3084a.m7226a(context, intent);
                    return null;
                }
                mo37461a(context, accsRequest, context.getPackageName(), false);
                return null;
            }
            Intent b = m7403b(context, 100);
            if (b == null) {
                C3179k.m7668a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, accsRequest.serviceId, "1", "push response intent null");
                m7401a(context, 100, accsRequest.serviceId, accsRequest.dataId);
                ALog.m7599e(f6984c, "sendPushResponse input null", C3416b.f8433Q, context, "response", accsRequest, "extraInfo", extraInfo2);
                return null;
            }
            ALog.m7600i(f6984c, "sendPushResponse channel by", "app", extraInfo2.fromPackage);
            b.setClassName(extraInfo2.fromPackage, C3178j.channelService);
            b.putExtra(Constants.KEY_SEND_TYPE, Message.ReqType.REQ);
            b.putExtra("appKey", c);
            b.putExtra("userInfo", accsRequest.userId);
            b.putExtra(Constants.KEY_SERVICE_ID, accsRequest.serviceId);
            b.putExtra("data", accsRequest.data);
            b.putExtra(Constants.KEY_DATA_ID, accsRequest.dataId);
            b.putExtra(Constants.KEY_CONFIG_TAG, this.f6986b);
            if (!TextUtils.isEmpty(accsRequest.businessId)) {
                b.putExtra(Constants.KEY_BUSINESSID, accsRequest.businessId);
            }
            if (!TextUtils.isEmpty(accsRequest.tag)) {
                b.putExtra(Constants.KEY_EXT_TAG, accsRequest.tag);
            }
            if (accsRequest.target != null) {
                b.putExtra("target", accsRequest.target);
            }
            C3084a.m7226a(context, b);
            return null;
        } catch (Throwable th) {
            C3179k.m7668a("accs", BaseMonitor.ALARM_POINT_REQ_ERROR, accsRequest.serviceId, "1", "push response " + th.toString());
            ALog.m7598e(f6984c, "sendPushResponse dataid:" + accsRequest.dataId, th, new Object[0]);
            return null;
        }
    }

    @Override // com.taobao.accs.AbstractC3099c
    /* renamed from: a */
    public boolean mo37477a() {
        AbstractC3107d dVar = this.f6987d;
        return dVar != null && dVar.mo37552f();
    }

    @Override // com.taobao.accs.AbstractC3099c
    @Deprecated
    /* renamed from: a */
    public void mo37466a(Context context, int i) {
        ACCSClient.setEnvironment(context, i);
    }

    /* renamed from: a */
    private void m7401a(Context context, int i, String str, String str2) {
        Intent intent = new Intent(Constants.ACTION_RECEIVE);
        intent.setPackage(context.getPackageName());
        intent.putExtra("command", i);
        intent.putExtra(Constants.KEY_SERVICE_ID, str);
        intent.putExtra(Constants.KEY_DATA_ID, str2);
        intent.putExtra("appKey", this.f6987d.mo37546c());
        intent.putExtra(Constants.KEY_CONFIG_TAG, this.f6986b);
        intent.putExtra(Constants.KEY_ERROR_CODE, i == 2 ? 200 : 300);
        C3116g.m7381a(context, intent);
    }

    @Override // com.taobao.accs.AbstractC3099c
    /* renamed from: a */
    public void mo37469a(Context context, String str, int i) {
        SharedPreferences.Editor edit = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).edit();
        if (!TextUtils.isEmpty(str)) {
            edit.putString(Constants.KEY_PROXY_HOST, str);
        }
        edit.putInt(Constants.KEY_PROXY_PORT, i);
        edit.apply();
    }

    @Override // com.taobao.accs.AbstractC3099c
    /* renamed from: a */
    public void mo37472a(Context context, String str, String str2, IAppReceiver iAppReceiver) {
        GlobalClientInfo.getInstance(context).setAppReceiver(this.f6986b, iAppReceiver);
        if (!UtilityImpl.isMainProcess(context)) {
            ALog.m7597d(f6984c, "inapp only init in main process!", new Object[0]);
            return;
        }
        String str3 = f6984c;
        ALog.m7597d(str3, "startInAppConnection APPKEY:" + str, new Object[0]);
        if (!TextUtils.isEmpty(str)) {
            if (!TextUtils.equals(this.f6987d.mo37546c(), str)) {
                this.f6987d.mo37547c(str2);
                this.f6987d.mo37549d(str);
                UtilityImpl.m7633d(context, str);
            }
            this.f6987d.mo37536a();
        }
    }

    @Override // com.taobao.accs.AbstractC3099c
    /* renamed from: a */
    public void mo37467a(Context context, ILoginInfo iLoginInfo) {
        GlobalClientInfo.getInstance(context).setLoginInfoImpl(this.f6986b, iLoginInfo);
    }

    @Override // com.taobao.accs.AbstractC3099c
    /* renamed from: a */
    public boolean mo37479a(String str) {
        return this.f6987d.mo37542a(str);
    }

    @Override // com.taobao.accs.AbstractC3099c
    /* renamed from: a */
    public boolean mo37478a(int i) {
        return ErrorCode.isChannelError(i);
    }

    @Override // com.taobao.accs.AbstractC3099c
    /* renamed from: a */
    public void mo37471a(Context context, String str, String str2) {
        GlobalClientInfo.getInstance(context).registerService(str, str2);
    }

    @Override // com.taobao.accs.AbstractC3099c
    /* renamed from: a */
    public void mo37470a(Context context, String str, AccsAbstractDataListener accsAbstractDataListener) {
        GlobalClientInfo.getInstance(context).registerListener(str, accsAbstractDataListener);
    }

    @Override // com.taobao.accs.AbstractC3099c
    /* renamed from: a */
    public void mo37476a(String str, String str2, String str3, short s, String str4, Map<Integer, String> map) {
        this.f6987d.mo37541a(Message.buildPushAck(this.f6987d.mo37544b(null), this.f6986b, str, str2, str3, true, s, str4, map), true);
    }

    @Override // com.taobao.accs.AbstractC3099c
    /* renamed from: a */
    public void mo37475a(AccsClientConfig accsClientConfig) {
        this.f6987d.mo37538a(accsClientConfig);
    }
}
