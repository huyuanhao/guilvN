package com.p118pd.sdk;

import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.api.HuaweiApiClient;
import com.huawei.hms.support.api.push.HuaweiPush;

/* renamed from: com.pd.sdk.oOooOO0  reason: case insensitive filesystem */
public class C8440oOooOO0 extends AbstractC8420oOoo0oO0 {
    public AbstractC8447oOooOOOo OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f21571OooO00o;

    /* renamed from: com.pd.sdk.oOooOO0$OooO00o */
    public class OooO00o implements Runnable {
        public final /* synthetic */ HuaweiApiClient OooO00o;
        public final /* synthetic */ int o00oO0O;

        public OooO00o(HuaweiApiClient huaweiApiClient, int i) {
            this.OooO00o = huaweiApiClient;
            this.o00oO0O = i;
        }

        public void run() {
            HuaweiApiClient huaweiApiClient = this.OooO00o;
            if (huaweiApiClient == null || !C8413oOoo0o.OooO00o.OooO00o(huaweiApiClient)) {
                C8425oOoo0ooo.OooO0O0("client not connted");
                C8440oOooOO0.this.OooO00o(this.o00oO0O);
                return;
            }
            HuaweiPush.HuaweiPushApi.enableReceiveNotifyMsg(this.OooO00o, C8440oOooOO0.this.f21571OooO00o);
            C8440oOooOO0.this.OooO00o(0);
        }
    }

    @Override // com.p118pd.sdk.AbstractC8430oOooO00O
    public void OooO00o(int i, HuaweiApiClient huaweiApiClient) {
        C8433oOooO0OO.OooO00o.OooO00o(new OooO00o(huaweiApiClient, i));
    }

    public void OooO00o(int i) {
        C8425oOoo0ooo.OooO0OO("enableReceiveNotifyMsg:callback=" + C8432oOooO0O0.OooO00o(this.OooO00o) + " retCode=" + i);
        if (this.OooO00o != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC8421oOoo0oOO(this.OooO00o, i));
            this.OooO00o = null;
        }
    }

    public void OooO00o(boolean z, AbstractC8447oOooOOOo oooooooo) {
        C8425oOoo0ooo.OooO0OO("enableReceiveNotifyMsg:enable=" + z + " handler=" + C8432oOooO0O0.OooO00o(oooooooo));
        this.f21571OooO00o = z;
        this.OooO00o = oooooooo;
        OooO00o();
    }
}
