package com.p118pd.sdk;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.api.CheckUpdatelistener;
import com.huawei.hms.api.HuaweiApiClient;
import com.p118pd.sdk.C8417oOoo0o0O;

/* renamed from: com.pd.sdk.oOoo0oo0  reason: case insensitive filesystem */
public class C8423oOoo0oo0 extends AbstractC8420oOoo0oO0 implements CheckUpdatelistener {
    public Activity OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8436oOooO0o0 f21565OooO00o;

    @Override // com.p118pd.sdk.AbstractC8430oOooO00O
    public void OooO00o(int i, HuaweiApiClient huaweiApiClient) {
        C8425oOoo0ooo.OooO00o("onConnect:" + i);
        Activity OooO00o2 = C8418oOoo0o0o.OooO00o.OooO00o();
        if (OooO00o2 == null || huaweiApiClient == null) {
            Activity activity = this.OooO00o;
            if (activity == null || huaweiApiClient == null) {
                C8425oOoo0ooo.OooO0O0("no activity to checkUpdate");
                OooO00o(C8417oOoo0o0O.OooO0O0.OooO0OO);
                return;
            }
            huaweiApiClient.checkUpdate(activity, this);
            return;
        }
        huaweiApiClient.checkUpdate(OooO00o2, this);
    }

    @Override // com.huawei.hms.api.CheckUpdatelistener
    public void onResult(int i) {
        OooO00o(i);
    }

    private void OooO00o(int i) {
        C8425oOoo0ooo.OooO0OO("checkUpdate:callback=" + C8432oOooO0O0.OooO00o(this.f21565OooO00o) + " retCode=" + i);
        if (this.f21565OooO00o != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC8421oOoo0oOO(this.f21565OooO00o, i));
            this.f21565OooO00o = null;
        }
        this.OooO00o = null;
    }

    public void OooO00o(Activity activity, AbstractC8436oOooO0o0 ooooo0o0) {
        C8425oOoo0ooo.OooO0OO("checkUpdate:handler=" + C8432oOooO0O0.OooO00o(ooooo0o0));
        this.f21565OooO00o = ooooo0o0;
        this.OooO00o = activity;
        OooO00o();
    }
}
