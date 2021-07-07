package com.p118pd.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.netease.nimlib.mixpush.MixPushException;

/* renamed from: com.pd.sdk.ooO00ooo  reason: case insensitive filesystem */
public class C8819ooO00ooo extends AbstractC8821ooO0O0 {
    public C8819ooO00ooo(int i) {
        super(i);
    }

    @Override // com.p118pd.sdk.AbstractC8821ooO0O0
    public boolean OooO00o(Context context) {
        String OooO00o = C8877ooO0oOo.OooO00o("ro.build.display.id", "");
        boolean z = !TextUtils.isEmpty(OooO00o) && OooO00o.toLowerCase().contains("flyme");
        if (z) {
            C8783oo0oooOO.OooOOOO("Mei Zu push frameWork support");
        }
        return z;
    }

    @Override // com.p118pd.sdk.AbstractC8821ooO0O0
    public boolean OooO0O0() {
        try {
            Class.forName("com.meizu.cloud.pushsdk.PushManager").getName();
            C8783oo0oooOO.OooOOOO("Mei Zu push sdk find");
            return true;
        } catch (Throwable unused) {
            C8783oo0oooOO.OooOOOO("Mei Zu push sdk not find");
            return false;
        }
    }

    @Override // com.p118pd.sdk.AbstractC8821ooO0O0
    public boolean OooO0OO(Context context) {
        try {
            String packageName = context.getPackageName();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("com.meizu.flyme.push.intent.REGISTER.FEEDBACK");
            intent.setPackage(packageName);
            C8800ooO000Oo.OooO00o(packageManager, intent, "com.netease.nimlib.mixpush.mz.MZPushReceiver");
            return true;
        } catch (MixPushException e) {
            C8783oo0oooOO.OooOOOO("android manifest miss push config " + e.getMessage());
            return false;
        }
    }
}
