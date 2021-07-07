package com.p118pd.sdk;

import android.content.Context;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.mipush.sdk.MiPushMessage;

/* renamed from: com.pd.sdk.ooO00oO  reason: case insensitive filesystem */
public class C8813ooO00oO implements AbstractC8826ooO0O0O0 {
    @Override // com.p118pd.sdk.AbstractC8826ooO0O0O0
    public void OooO00o(Context context, String str, String str2, String str3) {
        C8783oo0oooOO.OooOOOO("register mi push");
        C8808ooO00o.m20444OooO00o().m20445OooO00o();
        MiPushClient.registerPush(context, str, str2);
    }

    @Override // com.p118pd.sdk.AbstractC8826ooO0O0O0
    public boolean OooO00o(Context context) {
        C8783oo0oooOO.OooOOOO("clear mi push notification");
        try {
            MiPushClient.clearNotification(context);
            return true;
        } catch (Throwable unused) {
            C8783oo0oooOO.OooOOOO("not found MiPushClient class");
            return false;
        }
    }

    @Override // com.p118pd.sdk.AbstractC8826ooO0O0O0
    public void OooO00o(String str) {
        C8783oo0oooOO.OooOOOO("mi push on token:" + str);
        C8808ooO00o.m20444OooO00o().OooO0O0();
        C8827ooO0O0OO.OooO00o(5, str);
    }

    @Override // com.p118pd.sdk.AbstractC8826ooO0O0O0
    public void OooO00o(Context context, Object obj) {
        C8783oo0oooOO.OooOOOO("mi push on notification click");
        C8827ooO0O0OO.OooO00o(context, ((MiPushMessage) obj).getExtra(), C8815ooO00oOO.OooO00o());
    }
}
