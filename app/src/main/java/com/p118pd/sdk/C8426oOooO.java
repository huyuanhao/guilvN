package com.p118pd.sdk;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.huawei.hms.api.HuaweiApiClient;
import com.huawei.hms.support.api.push.HuaweiPush;
import com.p118pd.sdk.C8417oOoo0o0O;

/* renamed from: com.pd.sdk.oOooO  reason: case insensitive filesystem */
public class C8426oOooO extends AbstractC8420oOoo0oO0 {
    public AbstractC8445oOooOOO0 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f21567OooO00o;

    /* renamed from: com.pd.sdk.oOooO$OooO00o */
    public class OooO00o implements Runnable {
        public final /* synthetic */ HuaweiApiClient OooO00o;
        public final /* synthetic */ int o00oO0O;

        public OooO00o(HuaweiApiClient huaweiApiClient, int i) {
            this.OooO00o = huaweiApiClient;
            this.o00oO0O = i;
        }

        public void run() {
            if (!TextUtils.isEmpty(C8426oOooO.this.f21567OooO00o)) {
                HuaweiApiClient huaweiApiClient = this.OooO00o;
                if (huaweiApiClient == null || !C8413oOoo0o.OooO00o.OooO00o(huaweiApiClient)) {
                    C8425oOoo0ooo.OooO0O0("client not connted");
                    C8426oOooO.this.OooO00o(this.o00oO0O);
                    return;
                }
                try {
                    HuaweiPush.HuaweiPushApi.deleteToken(this.OooO00o, C8426oOooO.this.f21567OooO00o);
                    C8426oOooO.this.OooO00o(0);
                } catch (Exception e) {
                    C8425oOoo0ooo.OooO0O0("删除TOKEN失败:" + e.getMessage());
                    C8426oOooO.this.OooO00o(C8417oOoo0o0O.OooO0O0.OooOO0);
                }
            } else {
                C8425oOoo0ooo.OooO0O0("删除TOKEN失败: 要删除的token为空");
                C8426oOooO.this.OooO00o(C8417oOoo0o0O.OooO0O0.OooOO0O);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8430oOooO00O
    public void OooO00o(int i, HuaweiApiClient huaweiApiClient) {
        C8433oOooO0OO.OooO00o.OooO00o(new OooO00o(huaweiApiClient, i));
    }

    public void OooO00o(int i) {
        C8425oOoo0ooo.OooO0OO("deleteToken:callback=" + C8432oOooO0O0.OooO00o(this.OooO00o) + " retCode=" + i);
        if (this.OooO00o != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC8421oOoo0oOO(this.OooO00o, i));
            this.OooO00o = null;
        }
    }

    public void OooO00o(String str, AbstractC8445oOooOOO0 ooooooo0) {
        C8425oOoo0ooo.OooO0OO("deleteToken:token:" + C8432oOooO0O0.OooO00o(str) + " handler=" + C8432oOooO0O0.OooO00o(ooooooo0));
        this.f21567OooO00o = str;
        this.OooO00o = ooooooo0;
        OooO00o();
    }
}
