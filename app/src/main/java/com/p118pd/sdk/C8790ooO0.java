package com.p118pd.sdk;

import android.content.Context;
import com.meizu.cloud.pushsdk.PushManager;
import java.util.Map;

/* renamed from: com.pd.sdk.ooO0  reason: case insensitive filesystem */
public class C8790ooO0 implements AbstractC8826ooO0O0O0 {
    @Override // com.p118pd.sdk.AbstractC8826ooO0O0O0
    public void OooO00o(Context context, String str, String str2, String str3) {
        C8783oo0oooOO.OooOOOO("mz push start register");
        PushManager.register(context, str, str2);
    }

    @Override // com.p118pd.sdk.AbstractC8826ooO0O0O0
    public boolean OooO00o(Context context) {
        PushManager.clearNotification(context);
        return true;
    }

    @Override // com.p118pd.sdk.AbstractC8826ooO0O0O0
    public void OooO00o(String str) {
        C8783oo0oooOO.OooOOOO("mz push on token:" + str);
        C8827ooO0O0OO.OooO00o(7, str);
    }

    @Override // com.p118pd.sdk.AbstractC8826ooO0O0O0
    public void OooO00o(Context context, Object obj) {
        C8783oo0oooOO.OooOOOO("mz push on onNotificationClick");
        C8827ooO0O0OO.OooO00o(context, (Map) obj, C8791ooO00.OooO00o());
    }
}
