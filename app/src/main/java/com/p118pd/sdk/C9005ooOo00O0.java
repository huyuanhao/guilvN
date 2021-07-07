package com.p118pd.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pd.sdk.ooOo00O0  reason: case insensitive filesystem */
public class C9005ooOo00O0<T extends BroadcastReceiver> {
    public List<T> OooO00o;

    /* renamed from: OooO00o  reason: collision with other method in class */
    public List<T> m20672OooO00o(Context context, String str, Class cls) {
        if (this.OooO00o == null) {
            OooO00o(context, str, cls);
        }
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public T m20671OooO00o(Context context, String str, Class cls) {
        if (this.OooO00o == null) {
            OooO00o(context, str, cls);
        }
        if (this.OooO00o.size() > 0) {
            return this.OooO00o.get(0);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: java.util.List<T extends android.content.BroadcastReceiver> */
    /* JADX WARN: Multi-variable type inference failed */
    private void OooO00o(Context context, String str, Class cls) {
        this.OooO00o = new ArrayList();
        if (context != null) {
            Intent intent = new Intent(str);
            intent.setPackage(context.getPackageName());
            try {
                List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 64);
                if (queryBroadcastReceivers != null) {
                    for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
                        if (resolveInfo.activityInfo != null && resolveInfo.activityInfo.packageName.equals(context.getPackageName())) {
                            String str2 = resolveInfo.activityInfo.name;
                            if (cls.isAssignableFrom(Class.forName(str2))) {
                                this.OooO00o.add((BroadcastReceiver) Class.forName(str2).newInstance());
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
