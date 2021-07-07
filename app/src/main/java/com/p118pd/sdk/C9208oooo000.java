package com.p118pd.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.coloros.mcssdk.PushManager;
import com.netease.nimlib.mixpush.MixPushException;

/* renamed from: com.pd.sdk.oooo000  reason: case insensitive filesystem */
public class C9208oooo000 extends AbstractC8821ooO0O0 {
    public C9208oooo000(int i) {
        super(i);
    }

    @Override // com.p118pd.sdk.AbstractC8821ooO0O0
    public boolean OooO00o(Context context) {
        return PushManager.isSupportPush(context);
    }

    @Override // com.p118pd.sdk.AbstractC8821ooO0O0
    public boolean OooO0O0() {
        try {
            Class.forName("com.coloros.mcssdk.PushManager").getName();
            C8783oo0oooOO.OooOOOO("oppo push sdk find");
            return true;
        } catch (Throwable unused) {
            C8783oo0oooOO.OooOOOO("oppo push sdk not find");
            return false;
        }
    }

    @Override // com.p118pd.sdk.AbstractC8821ooO0O0
    public boolean OooO0OO(Context context) {
        try {
            String packageName = context.getPackageName();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("com.coloros.mcs.action.RECEIVE_MCS_MESSAGE");
            intent.setPackage(packageName);
            C8800ooO000Oo.OooO0O0(packageManager, intent, "com.netease.nimlib.mixpush.oppo.OppoPushService");
            return true;
        } catch (MixPushException e) {
            C8783oo0oooOO.OooOOOO("oppo android manifest miss push config " + e.getMessage());
            return false;
        }
    }
}
