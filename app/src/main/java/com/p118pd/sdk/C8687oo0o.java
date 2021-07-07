package com.p118pd.sdk;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.umeng.message.common.C3777a;
import com.umeng.socialize.net.dplus.CommonNetImpl;

/* renamed from: com.pd.sdk.oo0o  reason: case insensitive filesystem */
public class C8687oo0o {
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20300OooO00o(Context context) {
        return C6996o000OOo0.OooO00o(context).m18216OooO00o();
    }

    public static void OooO00o(Context context) {
        Intent intent = new Intent();
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
        } else if (i < 21 || i >= 26) {
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts(C3777a.f10045u, context.getPackageName(), null));
        } else {
            intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
            intent.putExtra("app_package", context.getPackageName());
            intent.putExtra("app_uid", context.getApplicationInfo().uid);
        }
        intent.setFlags(CommonNetImpl.FLAG_AUTH);
        context.startActivity(intent);
    }
}
