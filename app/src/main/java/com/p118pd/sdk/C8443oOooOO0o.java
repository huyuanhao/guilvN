package com.p118pd.sdk;

import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.api.HuaweiApiClient;
import com.huawei.hms.support.api.client.ResultCallback;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.api.push.HuaweiPush;
import com.huawei.hms.support.api.push.TokenResult;
import com.p118pd.sdk.C8417oOoo0o0O;

/* renamed from: com.pd.sdk.oOooOO0o  reason: case insensitive filesystem */
public class C8443oOooOO0o extends AbstractC8420oOoo0oO0 {
    public static final int OooO0O0 = 1;
    public int OooO00o = 1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8451oOooOo0 f21576OooO00o;

    /* renamed from: com.pd.sdk.oOooOO0o$OooO00o */
    public class OooO00o implements ResultCallback<TokenResult> {
        public OooO00o() {
        }

        /* renamed from: OooO00o */
        public void onResult(TokenResult tokenResult) {
            if (tokenResult == null) {
                C8425oOoo0ooo.OooO0O0("result is null");
                C8443oOooOO0o.this.OooO00o(C8417oOoo0o0O.OooO0O0.OooO0Oo, (TokenResult) null);
                return;
            }
            Status status = tokenResult.getStatus();
            if (status == null) {
                C8425oOoo0ooo.OooO0O0("status is null");
                C8443oOooOO0o.this.OooO00o(C8417oOoo0o0O.OooO0O0.OooO0o0, (TokenResult) null);
                return;
            }
            int statusCode = status.getStatusCode();
            C8425oOoo0ooo.OooO00o("status=" + status);
            if ((statusCode == 907135006 || statusCode == 907135003) && C8443oOooOO0o.this.OooO00o > 0) {
                C8443oOooOO0o.OooO0O0(C8443oOooOO0o.this);
                C8443oOooOO0o.this.OooO00o();
                return;
            }
            C8443oOooOO0o.this.OooO00o(statusCode, tokenResult);
        }
    }

    public static /* synthetic */ int OooO0O0(C8443oOooOO0o oooooo0o) {
        int i = oooooo0o.OooO00o;
        oooooo0o.OooO00o = i - 1;
        return i;
    }

    @Override // com.p118pd.sdk.AbstractC8430oOooO00O
    public void OooO00o(int i, HuaweiApiClient huaweiApiClient) {
        if (huaweiApiClient == null || !C8413oOoo0o.OooO00o.OooO00o(huaweiApiClient)) {
            C8425oOoo0ooo.OooO0O0("client not connted");
            OooO00o(i, (TokenResult) null);
            return;
        }
        HuaweiPush.HuaweiPushApi.getToken(huaweiApiClient).setResultCallback(new OooO00o());
    }

    public void OooO00o(int i, TokenResult tokenResult) {
        C8425oOoo0ooo.OooO0OO("getToken:callback=" + C8432oOooO0O0.OooO00o(this.f21576OooO00o) + " retCode=" + i);
        if (this.f21576OooO00o != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC8421oOoo0oOO(this.f21576OooO00o, i));
            this.f21576OooO00o = null;
        }
        this.OooO00o = 1;
    }

    public void OooO00o(AbstractC8451oOooOo0 oooooo0) {
        C8425oOoo0ooo.OooO0OO("getToken:handler=" + C8432oOooO0O0.OooO00o(oooooo0));
        this.f21576OooO00o = oooooo0;
        this.OooO00o = 1;
        OooO00o();
    }
}
