package com.p118pd.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.netease.nimlib.mixpush.MixPushException;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.pd.sdk.ooO000Oo  reason: case insensitive filesystem */
public class C8800ooO000Oo {
    public static void OooO00o(Context context, ArrayList arrayList) throws MixPushException {
        ServiceInfo[] serviceInfoArr;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4);
            if (packageInfo != null && (serviceInfoArr = packageInfo.services) != null) {
                for (ServiceInfo serviceInfo : serviceInfoArr) {
                    if (!TextUtils.isEmpty(serviceInfo.name) && arrayList.contains(serviceInfo.name)) {
                        arrayList.remove(serviceInfo.name);
                        if (arrayList.isEmpty()) {
                            break;
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                throw new MixPushException(String.format("<service android:name=\"%1$s\" /> is missing, please check it in AndroidManifest", arrayList.iterator().next()));
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new MixPushException("can't find packageName.", e);
        }
    }

    public static void OooO0O0(PackageManager packageManager, Intent intent, String str) throws MixPushException {
        boolean z;
        Iterator<ResolveInfo> it = packageManager.queryIntentServices(intent, 64).iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            ServiceInfo serviceInfo = it.next().serviceInfo;
            if (serviceInfo != null && str.equals(serviceInfo.name)) {
                z = true;
                break;
            }
        }
        if (!z) {
            throw new MixPushException(String.format("<receiver android:name=\"%1$s\" /> is missing, please check it in AndroidManifest", str));
        }
    }

    public static void OooO00o(PackageManager packageManager, Intent intent, String str) throws MixPushException {
        boolean z;
        Iterator<ResolveInfo> it = packageManager.queryBroadcastReceivers(intent, 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            ActivityInfo activityInfo = it.next().activityInfo;
            if (activityInfo != null && str.equals(activityInfo.name)) {
                z = true;
                break;
            }
        }
        if (!z) {
            throw new MixPushException(String.format("<receiver android:name=\"%1$s\" /> is missing, please check it in AndroidManifest", str));
        }
    }
}
