package com.p118pd.sdk;

import android.content.Context;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.api.HuaweiApiClient;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.push.HuaweiPush;
import com.huawei.hms.support.api.push.TokenResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.pd.sdk.ooO00Ooo  reason: case insensitive filesystem */
public class C8807ooO00Ooo implements AbstractC8826ooO0O0O0 {
    public static OooO0O0 OooO00o;

    /* renamed from: com.pd.sdk.ooO00Ooo$OooO0O0 */
    public static final class OooO0O0 implements HuaweiApiClient.ConnectionCallbacks, HuaweiApiClient.OnConnectionFailedListener {
        public final HuaweiApiClient OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final List<C4974OooO0O0> f22012OooO00o;

        /* renamed from: com.pd.sdk.ooO00Ooo$OooO0O0$OooO00o */
        public class OooO00o implements ResultCallback<TokenResult> {
            public OooO00o() {
            }

            /* renamed from: OooO00o */
            public void onResult(TokenResult tokenResult) {
            }
        }

        /* renamed from: com.pd.sdk.ooO00Ooo$OooO0O0$OooO0O0  reason: collision with other inner class name */
        public static class C4974OooO0O0 {
            public static final int OooO0O0 = 1;
            public static final int OooO0OO = 2;
            public int OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public Object f22013OooO00o;

            public C4974OooO0O0() {
            }
        }

        private void OooO0O0() {
            HuaweiPush.HuaweiPushApi.getToken(this.OooO00o).setResultCallback(new OooO00o());
        }

        private void OooO0OO(String str) {
            C4974OooO0O0 oooO0O0 = new C4974OooO0O0();
            oooO0O0.OooO00o = 2;
            oooO0O0.f22013OooO00o = str;
            OooO00o(oooO0O0);
        }

        private void OooO0Oo() {
            C4974OooO0O0 oooO0O0 = new C4974OooO0O0();
            oooO0O0.OooO00o = 1;
            OooO00o(oooO0O0);
        }

        @Override // com.huawei.hms.api.HuaweiApiClient.ConnectionCallbacks
        public void onConnected() {
            C8783oo0oooOO.OooOOOO("HuaweiApiClient onConnected");
            OooO0OO();
        }

        @Override // com.huawei.hms.api.HuaweiApiClient.OnConnectionFailedListener
        public void onConnectionFailed(ConnectionResult connectionResult) {
            C8783oo0oooOO.OooOOOO("HuaweiApiClient onConnectionFailed, result=" + connectionResult.getErrorCode());
        }

        @Override // com.huawei.hms.api.HuaweiApiClient.ConnectionCallbacks
        public void onConnectionSuspended(int i) {
            C8783oo0oooOO.OooOOOO("HuaweiApiClient onConnectionSuspended, reason=" + i);
        }

        public OooO0O0(Context context) {
            this.f22012OooO00o = new ArrayList();
            this.OooO00o = new HuaweiApiClient.Builder(context).addApi(HuaweiPush.PUSH_API).addConnectionCallbacks(this).addOnConnectionFailedListener(this).build();
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private void OooO00o() {
            if (!this.OooO00o.isConnected()) {
                OooO0Oo();
                this.OooO00o.connect(C8810ooO00o00.OooO00o.OooO00o());
                return;
            }
            OooO0O0();
        }

        private void OooO0O0(String str) {
            HuaweiPush.HuaweiPushApi.deleteToken(this.OooO00o, str);
        }

        private void OooO0OO() {
            ArrayList<C4974OooO0O0> arrayList = new ArrayList();
            synchronized (this.f22012OooO00o) {
                arrayList.addAll(this.f22012OooO00o);
                this.f22012OooO00o.clear();
            }
            for (C4974OooO0O0 oooO0O0 : arrayList) {
                int i = oooO0O0.OooO00o;
                if (i == 1) {
                    OooO0O0();
                } else if (i == 2) {
                    OooO0O0((String) oooO0O0.f22013OooO00o);
                }
            }
        }

        private void OooO00o(String str) {
            if (!this.OooO00o.isConnected()) {
                OooO0OO(str);
                this.OooO00o.connect(C8810ooO00o00.OooO00o.OooO00o());
                return;
            }
            OooO0O0(str);
        }

        private void OooO00o(C4974OooO0O0 oooO0O0) {
            synchronized (this.f22012OooO00o) {
                this.f22012OooO00o.add(oooO0O0);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8826ooO0O0O0
    public void OooO00o(Context context, String str, String str2, String str3) {
        C8783oo0oooOO.OooOOOO("hw push start register");
        OooO00o(context).OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC8826ooO0O0O0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20443OooO00o(Context context) {
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC8826ooO0O0O0
    public void OooO00o(String str) {
        C8783oo0oooOO.OooOOOO("huawei push on token:" + str);
        C8827ooO0O0OO.OooO00o(6, str);
    }

    @Override // com.p118pd.sdk.AbstractC8826ooO0O0O0
    public void OooO00o(Context context, Object obj) {
        C8783oo0oooOO.OooOOOO("huawei push on notification click");
        try {
            C8827ooO0O0OO.OooO00o(context, (Map) obj, C8791ooO00.OooO00o());
        } catch (Throwable th) {
            C8783oo0oooOO.OooOOOO(th.getMessage());
        }
    }

    public static OooO0O0 OooO00o(Context context) {
        if (OooO00o == null) {
            OooO00o = new OooO0O0(context);
        }
        return OooO00o;
    }
}
