package com.p118pd.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.huawei.hianalytics.global.AutoCollectEventType;
import java.util.List;

/* renamed from: com.pd.sdk.oo0  reason: case insensitive filesystem */
public class C8485oo0 extends C8588oo0O0000 implements AbstractC8578oo00ooO {
    public Context OooO00o;

    public C8485oo0(Context context) {
        super("_instance_ex_tag");
        this.OooO00o = context;
    }

    @Override // com.p118pd.sdk.AbstractC8579oo00ooO0, com.p118pd.sdk.C8588oo0O0000
    private boolean OooO00o() {
        SharedPreferences OooO00o2 = C8592oo0O00O0.OooO00o(this.OooO00o, "global_v2");
        boolean booleanValue = ((Boolean) C8592oo0O00O0.OooO00o(OooO00o2, "isFirstRun", (Object) false)).booleanValue();
        if (!booleanValue) {
            C8592oo0O00O0.m20238OooO00o(OooO00o2, "isFirstRun", (Object) true);
        }
        return !booleanValue;
    }

    @Override // com.p118pd.sdk.AbstractC8578oo00ooO
    private boolean OooO00o(String str, String str2) {
        return !TextUtils.isEmpty(str2) && !str.equals(str2);
    }

    @Override // com.p118pd.sdk.AbstractC8578oo00ooO
    public void OooO00o(Context context, C8580oo00ooOo oo00oooo) {
        AbstractC8536oo00OO0O.OooO0O0("HianalyticsSDK", "enableLogCollection() is executed.");
        if (context != null) {
            C8582oo00oooO.OooO00o().OooO00o(context.getApplicationContext(), oo00oooo);
        }
    }

    @Override // com.p118pd.sdk.AbstractC8578oo00ooO
    public void OooO00o(C8580oo00ooOo oo00oooo, boolean z) {
        AbstractC8536oo00OO0O.OooO0O0("HianalyticsSDK", "refreshLogCollection() is executed.");
        C8582oo00oooO.OooO00o().OooO00o(oo00oooo, z);
    }

    @Override // com.p118pd.sdk.AbstractC8578oo00ooO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20167OooO00o(String str, String str2) {
        AbstractC8536oo00OO0O.OooO0O0("HianalyticsSDK", "onStartApp() is executed.");
        if (!C8591oo0O00O.OooO00o("startType", str, 4096) || !C8591oo0O00O.OooO00o("startCMD", str2, 4096)) {
            AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", "onStartApp() Parameter error, please enter the correct parameter");
        } else {
            C8583oo00oooo.OooO00o().OooO00o(str, str2);
        }
    }

    public void OooO00o(List<AutoCollectEventType> list) {
        C8583oo00oooo oo00oooo;
        boolean z;
        AbstractC8536oo00OO0O.OooO0O0("HianalyticsSDK", "autoCollect() is executed.");
        if (list == null) {
            AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", "autoCollect() eventTypes is null,End this method!");
            return;
        }
        AbstractC8536oo00OO0O.OooO0O0("HianalyticsSDK", "autoCollect() executed.");
        if (list.contains(AutoCollectEventType.APP_FIRST_RUN) && OooO00o()) {
            AbstractC8536oo00OO0O.OooO0O0("HianalyticsSDK", "autoCollect: APP_FIRST_RUN");
            C8583oo00oooo.OooO00o().m20234OooO00o();
        }
        String OooO0o = AbstractC8453oOooOoOO.OooO0o();
        String OooO00o2 = AbstractC8453oOooOoOO.m20094OooO00o();
        if (list.contains(AutoCollectEventType.APP_UPGRADE) && OooO00o(OooO0o, OooO00o2)) {
            AbstractC8536oo00OO0O.OooO0O0("HianalyticsSDK", "autoCollect: APP_UPGRADE");
            C8583oo00oooo.OooO00o().OooO0O0(OooO0o, OooO00o2);
        }
        if (list.contains(AutoCollectEventType.APP_CRASH)) {
            AbstractC8536oo00OO0O.OooO0O0("HianalyticsSDK", "autoCollect: APP_CRUSH : true");
            oo00oooo = C8583oo00oooo.OooO00o();
            z = true;
        } else {
            AbstractC8536oo00OO0O.OooO0O0("HianalyticsSDK", "autoCollect: APP_CRUSH : false");
            oo00oooo = C8583oo00oooo.OooO00o();
            z = false;
        }
        oo00oooo.OooO00o(z);
    }

    @Override // com.p118pd.sdk.AbstractC8578oo00ooO
    @Deprecated
    public void OooO0O0() {
        AbstractC8536oo00OO0O.OooO0O0("HianalyticsSDK", "handleV1Cache() is executed.");
        C8583oo00oooo.OooO00o().OooO00o("_instance_ex_tag");
    }
}
