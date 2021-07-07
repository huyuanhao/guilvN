package com.p118pd.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.netease.nimlib.mixpush.MixPushException;
import java.util.ArrayList;
import org.android.agoo.xiaomi.MiPushRegistar;

/* renamed from: com.pd.sdk.ooO00oO0  reason: case insensitive filesystem */
public class C8814ooO00oO0 extends AbstractC8821ooO0O0 {
    public C8814ooO00oO0(int i) {
        super(i);
    }

    @Override // com.p118pd.sdk.AbstractC8821ooO0O0
    public boolean OooO00o(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(MiPushRegistar.PACKAGE_XIAOMI, 4);
            if (packageInfo == null || packageInfo.versionCode < 105) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // com.p118pd.sdk.AbstractC8821ooO0O0
    public boolean OooO0O0() {
        try {
            Class.forName("com.xiaomi.mipush.sdk.MiPushClient").getName();
            C8783oo0oooOO.OooOOOO("Xiao Mi push sdk find");
            return true;
        } catch (Throwable unused) {
            C8783oo0oooOO.OooOOOO("Xiao Mi push sdk not find");
            return false;
        }
    }

    @Override // com.p118pd.sdk.AbstractC8821ooO0O0
    public boolean OooO0OO(Context context) {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add("com.xiaomi.push.service.XMJobService");
            arrayList.add("com.xiaomi.mipush.sdk.PushMessageHandler");
            arrayList.add("com.xiaomi.mipush.sdk.MessageHandleService");
            C8800ooO000Oo.OooO00o(context, arrayList);
            String packageName = context.getPackageName();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
            intent.setPackage(packageName);
            C8800ooO000Oo.OooO00o(packageManager, intent, "com.netease.nimlib.mixpush.mi.MiPushReceiver");
            intent.setAction("android.net.conn.CONNECTIVITY_CHANGE");
            C8800ooO000Oo.OooO00o(packageManager, intent, "com.xiaomi.push.service.receivers.NetworkStatusReceiver");
            intent.setAction("com.xiaomi.push.PING_TIMER");
            C8800ooO000Oo.OooO00o(packageManager, intent, "com.xiaomi.push.service.receivers.PingReceiver");
            return true;
        } catch (MixPushException e) {
            C8783oo0oooOO.OooOOOO("android manifest miss push config " + e.getMessage());
            return false;
        }
    }
}
