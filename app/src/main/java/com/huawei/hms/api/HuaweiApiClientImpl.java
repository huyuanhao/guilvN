package com.huawei.hms.api;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import com.facebook.react.devsupport.WebsocketJavaScriptExecutor;
import com.huawei.hms.api.Api;
import com.huawei.hms.api.HuaweiApiClient;
import com.huawei.hms.core.aidl.AbstractC1149e;
import com.huawei.hms.core.aidl.C1142a;
import com.huawei.hms.core.aidl.C1144b;
import com.huawei.hms.core.aidl.C1152f;
import com.huawei.hms.core.aidl.RequestHeader;
import com.huawei.hms.p037c.AbstractC1132b;
import com.huawei.hms.p037c.C1137g;
import com.huawei.hms.p037c.C1141j;
import com.huawei.hms.support.api.ResolveResult;
import com.huawei.hms.support.api.client.BundleResult;
import com.huawei.hms.support.api.client.InnerApiClient;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.entity.auth.PermissionInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.api.entity.core.CheckConnectInfo;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.huawei.hms.support.api.entity.core.ConnectInfo;
import com.huawei.hms.support.api.entity.core.ConnectResp;
import com.huawei.hms.support.api.entity.core.DisconnectInfo;
import com.huawei.hms.support.api.entity.core.DisconnectResp;
import com.huawei.hms.support.api.entity.core.JosGetNoticeResp;
import com.huawei.hms.support.api.p040a.C1156a;
import com.huawei.hms.support.log.C1202a;
import com.huawei.hms.support.p050b.C1201a;
import com.huawei.hms.update.provider.UpdateProvider;
import com.huawei.updatesdk.service.otaupdate.CheckUpdateCallBack;
import com.p118pd.sdk.AbstractC7726o0ooOOoo;
import com.p118pd.sdk.C7265o0O000oo;
import com.umeng.message.common.C3777a;
import com.xiaomi.mipush.sdk.Constants;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import s.h.e.l.l.C;

public class HuaweiApiClientImpl extends HuaweiApiClient implements ServiceConnection, InnerApiClient {

    /* renamed from: a */
    public static final Object f1112a = new Object();

    /* renamed from: b */
    public final Context f1113b;

    /* renamed from: c */
    public final String f1114c;

    /* renamed from: d */
    public String f1115d;

    /* renamed from: e */
    public String f1116e;

    /* renamed from: f */
    public volatile AbstractC1149e f1117f;

    /* renamed from: g */
    public String f1118g;

    /* renamed from: h */
    public WeakReference<Activity> f1119h;

    /* renamed from: i */
    public WeakReference<Activity> f1120i;

    /* renamed from: j */
    public boolean f1121j = false;

    /* renamed from: k */
    public AtomicInteger f1122k = new AtomicInteger(1);

    /* renamed from: l */
    public List<Scope> f1123l;

    /* renamed from: m */
    public List<PermissionInfo> f1124m;

    /* renamed from: n */
    public Map<Api<?>, Api.ApiOptions> f1125n;

    /* renamed from: o */
    public SubAppInfo f1126o;

    /* renamed from: p */
    public long f1127p = 0;

    /* renamed from: q */
    public int f1128q = 0;

    /* renamed from: r */
    public HuaweiApiClient.ConnectionCallbacks f1129r;

    /* renamed from: s */
    public HuaweiApiClient.OnConnectionFailedListener f1130s;

    /* renamed from: t */
    public Handler f1131t = null;

    /* renamed from: u */
    public CheckUpdatelistener f1132u = null;

    /* renamed from: v */
    public CheckUpdateCallBack f1133v = new C1119f(this);

    /* renamed from: com.huawei.hms.api.HuaweiApiClientImpl$a */
    public class C1111a implements ResultCallback<ResolveResult<ConnectResp>> {
        public C1111a() {
        }

        /* renamed from: a */
        public void onResult(ResolveResult<ConnectResp> resolveResult) {
            new Handler(Looper.getMainLooper()).post(new RunnableC1122i(this, resolveResult));
        }

        public /* synthetic */ C1111a(HuaweiApiClientImpl huaweiApiClientImpl, C1119f fVar) {
            this();
        }
    }

    /* renamed from: com.huawei.hms.api.HuaweiApiClientImpl$b */
    public class C1112b implements ResultCallback<ResolveResult<DisconnectResp>> {
        public C1112b() {
        }

        /* renamed from: a */
        public void onResult(ResolveResult<DisconnectResp> resolveResult) {
            new Handler(Looper.getMainLooper()).post(new RunnableC1123j(this, resolveResult));
        }

        public /* synthetic */ C1112b(HuaweiApiClientImpl huaweiApiClientImpl, C1119f fVar) {
            this();
        }
    }

    /* renamed from: com.huawei.hms.api.HuaweiApiClientImpl$c */
    public class C1113c implements ResultCallback<ResolveResult<JosGetNoticeResp>> {
        public C1113c() {
        }

        /* renamed from: a */
        public void onResult(ResolveResult<JosGetNoticeResp> resolveResult) {
            JosGetNoticeResp value;
            Intent noticeIntent;
            if (resolveResult != null && resolveResult.getStatus().isSuccess() && (noticeIntent = (value = resolveResult.getValue()).getNoticeIntent()) != null && value.getStatusCode() == 0) {
                C1202a.m1318b("HuaweiApiClientImpl", "get notice has intent.");
                Activity a = C1141j.m1089a((Activity) HuaweiApiClientImpl.this.f1119h.get(), HuaweiApiClientImpl.this.getTopActivity());
                if (a == null) {
                    C1202a.m1320d("HuaweiApiClientImpl", "showNotice no valid activity!");
                    return;
                }
                HuaweiApiClientImpl.this.f1121j = true;
                a.startActivity(noticeIntent);
            }
        }

        public /* synthetic */ C1113c(HuaweiApiClientImpl huaweiApiClientImpl, C1119f fVar) {
            this();
        }
    }

    static {
        C.i(16777249);
    }

    public HuaweiApiClientImpl(Context context) {
        this.f1113b = context;
        String a = C1141j.m1090a(context);
        this.f1114c = a;
        this.f1115d = a;
        this.f1116e = C1141j.m1101c(context);
    }

    /* renamed from: e */
    private boolean m1025e() {
        Intent intent = new Intent(HuaweiApiAvailability.SERVICES_ACTION);
        intent.setPackage(HuaweiApiAvailability.SERVICES_PACKAGE);
        return this.f1113b.bindService(intent, this, 1);
    }

    /* renamed from: f */
    private void m1026f() {
        synchronized (f1112a) {
            if (this.f1131t != null) {
                this.f1131t.removeMessages(2);
            } else {
                this.f1131t = new Handler(Looper.getMainLooper(), new C1120g(this));
            }
            this.f1131t.sendEmptyMessageDelayed(2, WebsocketJavaScriptExecutor.CONNECT_TIMEOUT_MS);
        }
    }

    /* renamed from: g */
    private void m1027g() {
        synchronized (f1112a) {
            if (this.f1131t != null) {
                this.f1131t.removeMessages(2);
                this.f1131t = null;
            }
        }
    }

    /* renamed from: h */
    private void m1028h() {
        if (!C1201a.m1307a().mo15709b()) {
            HashMap hashMap = new HashMap();
            hashMap.put(C3777a.f10045u, getPackageName());
            hashMap.put("sdk_ver", String.valueOf((int) HuaweiApiAvailability.HMS_SDK_VERSION_CODE));
            String str = null;
            SubAppInfo subAppInfo = getSubAppInfo();
            if (subAppInfo != null) {
                str = subAppInfo.getSubAppID();
            }
            if (str == null) {
                str = getAppID();
            }
            hashMap.put(Constants.APP_ID, str);
            String[] split = "core.checkUpdate".split("\\.");
            if (split.length == 2) {
                hashMap.put("service", split[0]);
                hashMap.put(AbstractC7726o0ooOOoo.OooO, split[1]);
            }
            hashMap.put("result", "0");
            hashMap.put("cost_time", "0");
            C1201a.m1307a().mo15707a(getContext(), "HMS_SDK_API_CALL", hashMap);
            AbstractC1132b.m1064a(getContext(), UpdateProvider.getLocalFile(getContext(), "hms/config.txt"), UpdateProvider.getLocalFile(getContext(), "hms/HwMobileServiceReport.txt"), "core.checkUpdate", System.currentTimeMillis(), 0);
        }
    }

    /* renamed from: i */
    private void m1029i() {
        C1156a.m1136a(this, m1030j()).setResultCallback(new C1112b(this, null));
    }

    /* renamed from: j */
    private DisconnectInfo m1030j() {
        ArrayList arrayList = new ArrayList();
        Map<Api<?>, Api.ApiOptions> map = this.f1125n;
        if (map != null) {
            for (Api<?> api : map.keySet()) {
                arrayList.add(api.getApiName());
            }
        }
        return new DisconnectInfo(this.f1123l, arrayList);
    }

    /* renamed from: k */
    private void m1031k() {
        C1202a.m1318b("HuaweiApiClientImpl", "Enter sendConnectApiServceRequest.");
        C1156a.m1139a(this, m1032l()).setResultCallback(new C1111a(this, null));
    }

    /* renamed from: l */
    private ConnectInfo m1032l() {
        String c = new C1137g(this.f1113b).mo15419c(this.f1113b.getPackageName());
        if (c == null) {
            c = "";
        }
        SubAppInfo subAppInfo = this.f1126o;
        return new ConnectInfo(getApiNameList(), this.f1123l, c, subAppInfo == null ? null : subAppInfo.getSubAppID());
    }

    /* renamed from: m */
    private void m1033m() {
        C1141j.m1093a(this.f1113b, this);
    }

    /* renamed from: n */
    private void m1034n() {
        if (this.f1121j) {
            C1202a.m1318b("HuaweiApiClientImpl", "Connect notice has been shown.");
        } else if (HuaweiApiAvailability.getInstance().isHuaweiMobileNoticeAvailable(this.f1113b) == 0) {
            C1156a.m1138a(this, 0, HuaweiApiAvailability.HMS_SDK_VERSION_NAME).setResultCallback(new C1113c(this, null));
        }
    }

    public int asyncRequest(Bundle bundle, String str, int i, ResultCallback<BundleResult> resultCallback) {
        C1202a.m1318b("HuaweiApiClientImpl", "Enter asyncRequest.");
        if (resultCallback == null || str == null || bundle == null) {
            C1202a.m1320d("HuaweiApiClientImpl", "arguments is invalid.");
            return CommonCode.ErrorCode.ARGUMENTS_INVALID;
        } else if (!innerIsConnected()) {
            C1202a.m1320d("HuaweiApiClientImpl", "client is unConnect.");
            return CommonCode.ErrorCode.CLIENT_API_INVALID;
        } else {
            C1144b bVar = new C1144b(str, i);
            C1152f a = C1142a.m1106a(bVar.mo15436c());
            bVar.mo15434a(bundle);
            RequestHeader requestHeader = new RequestHeader(getAppID(), getPackageName(), HuaweiApiAvailability.HMS_SDK_VERSION_CODE, getSessionId());
            requestHeader.setApiNameList(getApiNameList());
            bVar.f1180b = a.mo15450a(requestHeader, new Bundle());
            try {
                getService().mo15447a(bVar, new BinderC1121h(this, resultCallback));
                return 0;
            } catch (RemoteException e) {
                C1202a.m1320d("HuaweiApiClientImpl", "remote exception:" + e.getMessage());
                return CommonCode.ErrorCode.INTERNAL_ERROR;
            }
        }
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public native void checkUpdate(Activity activity, CheckUpdatelistener checkUpdatelistener);

    @Override // com.huawei.hms.api.HuaweiApiClient
    public native void connect(Activity activity);

    @Override // com.huawei.hms.api.HuaweiApiClient
    public native void disconnect();

    public Map<Api<?>, Api.ApiOptions> getApiMap() {
        return this.f1125n;
    }

    public List<String> getApiNameList() {
        ArrayList arrayList = new ArrayList();
        Map<Api<?>, Api.ApiOptions> map = this.f1125n;
        if (map != null) {
            for (Api<?> api : map.keySet()) {
                arrayList.add(api.getApiName());
            }
        }
        return arrayList;
    }

    @Override // com.huawei.hms.support.api.client.ApiClient
    public native String getAppID();

    @Override // com.huawei.hms.support.api.client.ApiClient
    public native Context getContext();

    @Override // com.huawei.hms.support.api.client.ApiClient
    public native String getCpID();

    @Override // com.huawei.hms.support.api.client.ApiClient
    public native String getPackageName();

    public List<PermissionInfo> getPermissionInfos() {
        return this.f1124m;
    }

    public List<Scope> getScopes() {
        return this.f1123l;
    }

    public native AbstractC1149e getService();

    @Override // com.huawei.hms.support.api.client.ApiClient
    public native String getSessionId();

    @Override // com.huawei.hms.support.api.client.ApiClient
    public final native SubAppInfo getSubAppInfo();

    @Override // com.huawei.hms.api.HuaweiApiClient
    public native Activity getTopActivity();

    @Override // com.huawei.hms.support.api.client.ApiClient
    public native String getTransportName();

    @Override // com.huawei.hms.support.api.client.InnerApiClient
    public native boolean innerIsConnected();

    @Override // com.huawei.hms.api.HuaweiApiClient, com.huawei.hms.support.api.client.ApiClient
    public boolean isConnected() {
        if (this.f1128q == 0) {
            this.f1128q = new C1137g(this.f1113b).mo15418b(HuaweiApiAvailability.SERVICES_PACKAGE);
        }
        if (this.f1128q >= 20504000) {
            return innerIsConnected();
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f1127p;
        if (currentTimeMillis > 0 && currentTimeMillis < Constants.ASSEMBLE_PUSH_NETWORK_INTERVAL) {
            return innerIsConnected();
        }
        if (!innerIsConnected()) {
            return false;
        }
        Status status = C1156a.m1137a(this, new CheckConnectInfo()).awaitOnAnyThread(C7265o0O000oo.OooO0o.OooO00o, TimeUnit.MILLISECONDS).getStatus();
        if (status.isSuccess()) {
            this.f1127p = System.currentTimeMillis();
            return true;
        }
        int statusCode = status.getStatusCode();
        C1202a.m1320d("HuaweiApiClientImpl", "isConnected is false, statuscode:" + statusCode);
        if (statusCode == 907135004) {
            return false;
        }
        m1033m();
        m1012a(1);
        this.f1127p = System.currentTimeMillis();
        return false;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public native boolean isConnecting();

    @Override // com.huawei.hms.api.HuaweiApiClient
    public native void onPause(Activity activity);

    @Override // com.huawei.hms.api.HuaweiApiClient
    public native void onResume(Activity activity);

    public native void onServiceConnected(ComponentName componentName, IBinder iBinder);

    public native void onServiceDisconnected(ComponentName componentName);

    public void setApiMap(Map<Api<?>, Api.ApiOptions> map) {
        this.f1125n = map;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void setConnectionCallbacks(HuaweiApiClient.ConnectionCallbacks connectionCallbacks) {
        this.f1129r = connectionCallbacks;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public void setConnectionFailedListener(HuaweiApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        this.f1130s = onConnectionFailedListener;
    }

    public native void setHasShowNotice(boolean z);

    public void setPermissionInfos(List<PermissionInfo> list) {
        this.f1124m = list;
    }

    public void setScopes(List<Scope> list) {
        this.f1123l = list;
    }

    @Override // com.huawei.hms.api.HuaweiApiClient
    public native boolean setSubAppInfo(SubAppInfo subAppInfo);

    /* renamed from: c */
    private int m1021c() {
        Integer num;
        int intValue;
        Map<Api<?>, Api.ApiOptions> apiMap = getApiMap();
        int i = 0;
        if (apiMap == null) {
            return 0;
        }
        for (Api<?> api : apiMap.keySet()) {
            String apiName = api.getApiName();
            if (!TextUtils.isEmpty(apiName) && (num = HuaweiApiAvailability.getApiMap().get(apiName)) != null && (intValue = num.intValue()) > i) {
                i = intValue;
            }
        }
        return i;
    }

    /* renamed from: d */
    private boolean m1024d() {
        Map<Api<?>, Api.ApiOptions> map = this.f1125n;
        if (map == null) {
            return false;
        }
        for (Api<?> api : map.keySet()) {
            if (HuaweiApiAvailability.HMS_API_NAME_GAME.equals(api.getApiName())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private int m1017b() {
        int b = C1141j.m1097b(this.f1113b);
        if (b != 0 && b >= 20503000) {
            return b;
        }
        int c = m1021c();
        if (m1024d()) {
            if (c < 20503000) {
                return 20503000;
            }
            return c;
        } else if (c < 20600000) {
            return 20600000;
        } else {
            return c;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1011a() {
        if (this.f1130s != null) {
            this.f1130s.onConnectionFailed(new ConnectionResult(C1141j.m1105e(this.f1113b) ? 7 : 6));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m1020b(ResolveResult<ConnectResp> resolveResult) {
        ConnectResp value = resolveResult.getValue();
        if (value != null) {
            this.f1118g = value.sessionId;
        }
        SubAppInfo subAppInfo = this.f1126o;
        String subAppID = subAppInfo == null ? null : subAppInfo.getSubAppID();
        if (!TextUtils.isEmpty(subAppID)) {
            this.f1115d = subAppID;
        }
        int statusCode = resolveResult.getStatus().getStatusCode();
        C1202a.m1318b("HuaweiApiClientImpl", "Enter onConnectionResult, connect to server result: " + statusCode);
        if (Status.SUCCESS.equals(resolveResult.getStatus())) {
            if (resolveResult.getValue() != null) {
                ProtocolNegotiate.getInstance().negotiate(resolveResult.getValue().protocolVersion);
            }
            m1012a(3);
            HuaweiApiClient.ConnectionCallbacks connectionCallbacks = this.f1129r;
            if (connectionCallbacks != null) {
                connectionCallbacks.onConnected();
            }
            m1034n();
        } else if (resolveResult.getStatus() == null || resolveResult.getStatus().getStatusCode() != 1001) {
            m1033m();
            m1012a(1);
            HuaweiApiClient.OnConnectionFailedListener onConnectionFailedListener = this.f1130s;
            if (onConnectionFailedListener != null) {
                onConnectionFailedListener.onConnectionFailed(new ConnectionResult(statusCode));
            }
        } else {
            m1033m();
            m1012a(1);
            HuaweiApiClient.ConnectionCallbacks connectionCallbacks2 = this.f1129r;
            if (connectionCallbacks2 != null) {
                connectionCallbacks2.onConnectionSuspended(3);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1012a(int i) {
        this.f1122k.set(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m1015a(ResolveResult<DisconnectResp> resolveResult) {
        C1202a.m1318b("HuaweiApiClientImpl", "Enter onDisconnectionResult, disconnect from server result: " + resolveResult.getStatus().getStatusCode());
        m1033m();
        m1012a(1);
    }
}
