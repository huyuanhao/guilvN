package com.p118pd.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.netease.nimlib.mixpush.MixPushException;
import com.vivo.push.PushClient;

/* renamed from: com.pd.sdk.ooO0O0oO  reason: case insensitive filesystem */
public class C8831ooO0O0oO extends AbstractC8821ooO0O0 {
    public C8831ooO0O0oO(int i) {
        super(i);
    }

    @Override // com.p118pd.sdk.AbstractC8821ooO0O0
    public boolean OooO00o(Context context) {
        return PushClient.getInstance(context).isSupport();
    }

    @Override // com.p118pd.sdk.AbstractC8821ooO0O0
    public boolean OooO0O0() {
        try {
            Class.forName("com.vivo.push.PushClient").getName();
            C8783oo0oooOO.OooOOOO("vivo push sdk find");
            return true;
        } catch (Throwable unused) {
            C8783oo0oooOO.OooOOOO("vivo push sdk not find");
            return false;
        }
    }

    @Override // com.p118pd.sdk.AbstractC8821ooO0O0
    public boolean OooO0OO(Context context) {
        try {
            String packageName = context.getPackageName();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("com.vivo.pushclient.action.RECEIVE");
            intent.setPackage(packageName);
            C8800ooO000Oo.OooO00o(packageManager, intent, "com.netease.nimlib.mixpush.vivo.VivoPushReceiver");
            return true;
        } catch (MixPushException e) {
            C8783oo0oooOO.OooOOOO("vivo android manifest miss push config " + e.getMessage());
            return false;
        }
    }
}
