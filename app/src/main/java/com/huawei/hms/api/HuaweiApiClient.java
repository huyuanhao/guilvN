package com.huawei.hms.api;

import android.app.Activity;
import android.content.Context;
import com.huawei.hms.api.Api;
import com.huawei.hms.p037c.AbstractC1139h;
import com.huawei.hms.p037c.C1131a;
import com.huawei.hms.p037c.C1141j;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.entity.auth.PermissionInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import com.huawei.hms.support.log.C1202a;
import com.huawei.hms.support.p050b.C1201a;
import com.p118pd.sdk.AbstractC8593oo0O00OO;
import com.p118pd.sdk.C8594oo0O00Oo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class HuaweiApiClient implements ApiClient {

    public interface ConnectionCallbacks {
        public static final int CAUSE_API_CLIENT_EXPIRED = 3;
        public static final int CAUSE_NETWORK_LOST = 2;
        public static final int CAUSE_SERVICE_DISCONNECTED = 1;

        void onConnected();

        void onConnectionSuspended(int i);
    }

    public interface OnConnectionFailedListener {
        void onConnectionFailed(ConnectionResult connectionResult);
    }

    public abstract void checkUpdate(Activity activity, CheckUpdatelistener checkUpdatelistener);

    public abstract void connect(Activity activity);

    public abstract void disconnect();

    public abstract Activity getTopActivity();

    @Override // com.huawei.hms.support.api.client.ApiClient
    public abstract boolean isConnected();

    public abstract boolean isConnecting();

    public abstract void onPause(Activity activity);

    public abstract void onResume(Activity activity);

    public abstract void setConnectionCallbacks(ConnectionCallbacks connectionCallbacks);

    public abstract void setConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener);

    public abstract boolean setSubAppInfo(SubAppInfo subAppInfo);

    public static final class Builder {

        /* renamed from: a */
        public final Context f1106a;

        /* renamed from: b */
        public final List<Scope> f1107b = new ArrayList();

        /* renamed from: c */
        public final List<PermissionInfo> f1108c = new ArrayList();

        /* renamed from: d */
        public final Map<Api<?>, Api.ApiOptions> f1109d = new HashMap();

        /* renamed from: e */
        public OnConnectionFailedListener f1110e;

        /* renamed from: f */
        public ConnectionCallbacks f1111f;

        public Builder(Context context) throws NullPointerException {
            C1131a.m1062a(context, "context must not be null.");
            Context applicationContext = context.getApplicationContext();
            this.f1106a = applicationContext;
            AbstractC1139h.m1083a(applicationContext);
            boolean OooO00o = AbstractC8593oo0O00OO.m20240OooO00o();
            C1202a.m1318b("HMS BI", "Builder->biInitFlag :" + OooO00o);
            boolean d = C1141j.m1103d(context);
            C1202a.m1318b("HMS BI", "Builder->biSetting :" + d);
            if (!OooO00o && !d) {
                new C8594oo0O00Oo.OooO00o(context).OooO0O0(true).OooO0o(true).OooO0Oo(true).OooO00o(0, "https://metrics1.data.hicloud.com:6447").OooO00o();
            }
        }

        public Builder addApi(Api<? extends Api.ApiOptions.NotRequiredOptions> api) {
            this.f1109d.put(api, null);
            if (HuaweiApiAvailability.HMS_API_NAME_GAME.equals(api.getApiName())) {
                C1201a a = C1201a.m1307a();
                Context applicationContext = this.f1106a.getApplicationContext();
                a.mo15706a(applicationContext, "15060106", "|" + System.currentTimeMillis());
            }
            return this;
        }

        public Builder addConnectionCallbacks(ConnectionCallbacks connectionCallbacks) {
            C1131a.m1062a(connectionCallbacks, "listener must not be null.");
            this.f1111f = connectionCallbacks;
            return this;
        }

        public Builder addOnConnectionFailedListener(OnConnectionFailedListener onConnectionFailedListener) {
            C1131a.m1062a(onConnectionFailedListener, "listener must not be null.");
            this.f1110e = onConnectionFailedListener;
            return this;
        }

        public Builder addScope(Scope scope) {
            C1131a.m1062a(scope, "scope must not be null.");
            this.f1107b.add(scope);
            return this;
        }

        public HuaweiApiClient build() {
            addApi(new Api<>("Core.API"));
            HuaweiApiClientImpl huaweiApiClientImpl = new HuaweiApiClientImpl(this.f1106a);
            huaweiApiClientImpl.setScopes(this.f1107b);
            huaweiApiClientImpl.setPermissionInfos(this.f1108c);
            huaweiApiClientImpl.setApiMap(this.f1109d);
            huaweiApiClientImpl.setConnectionCallbacks(this.f1111f);
            huaweiApiClientImpl.setConnectionFailedListener(this.f1110e);
            return huaweiApiClientImpl;
        }

        public <O extends Api.ApiOptions.HasOptions> Builder addApi(Api<O> api, O o) {
            C1131a.m1062a(api, "Api must not be null");
            C1131a.m1062a(o, "Null options are not permitted for this Api");
            this.f1109d.put(api, o);
            if (api.getOptions() != null) {
                this.f1107b.addAll(api.getOptions().getScopeList(o));
                this.f1108c.addAll(api.getOptions().getPermissionInfoList(o));
            }
            return this;
        }
    }
}
