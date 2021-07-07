package com.huawei.hms.support.api.push.p041a.p044c;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.huawei.hms.support.api.push.p041a.p043b.C1174a;
import com.huawei.hms.support.api.push.p041a.p045d.C1184a;
import com.huawei.hms.support.api.push.p041a.p045d.C1185b;
import com.huawei.hms.support.log.C1202a;
import com.xiaomi.mipush.sdk.MiPushMessage;
import java.security.SecureRandom;
import java.util.Date;

/* renamed from: com.huawei.hms.support.api.push.a.c.c */
public class C1178c {
    /* renamed from: a */
    public static void m1221a(Context context, Bitmap bitmap, RemoteViews remoteViews) {
        if (context != null && remoteViews != null && C1184a.m1242a()) {
            if (bitmap == null) {
                int i = context.getApplicationInfo().icon;
                if (i == 0 && (i = context.getResources().getIdentifier("btn_star_big_on", "drawable", "android")) == 0) {
                    i = 17301651;
                }
                remoteViews.setImageViewResource(C1185b.m1254a(context, "id", "icon"), i);
                return;
            }
            remoteViews.setImageViewBitmap(C1185b.m1254a(context, "id", "icon"), bitmap);
        }
    }

    /* renamed from: a */
    public static void m1220a(Context context, int i, RemoteViews remoteViews, C1174a aVar) {
        if (context == null || remoteViews == null || aVar == null) {
            C1202a.m1319c("PushSelfShowLog", "showRightBtn error");
        } else if ((EnumC1176a.STYLE_2.ordinal() == aVar.mo15682u() || EnumC1176a.STYLE_3.ordinal() == aVar.mo15682u() || EnumC1176a.STYLE_4.ordinal() == aVar.mo15682u()) && !TextUtils.isEmpty(aVar.mo15683v()[0]) && !TextUtils.isEmpty(aVar.mo15684w()[0])) {
            int a = C1185b.m1254a(context, "id", "right_btn");
            remoteViews.setViewVisibility(a, 0);
            remoteViews.setTextViewText(a, aVar.mo15683v()[0]);
            remoteViews.setOnClickPendingIntent(a, m1218a(context, i, aVar.mo15684w()[0]));
        }
    }

    /* renamed from: a */
    public static PendingIntent m1218a(Context context, int i, String str) {
        Intent flags = new Intent("com.huawei.android.push.intent.CLICK").setPackage(context.getPackageName()).setFlags(32);
        flags.putExtra(MiPushMessage.KEY_NOTIFY_ID, i);
        flags.putExtra("clickBtn", str);
        int hashCode = (context.getPackageName() + str + new SecureRandom().nextInt() + new Date().toString()).hashCode();
        StringBuilder sb = new StringBuilder();
        sb.append("getPendingIntent,requestCode:");
        sb.append(hashCode);
        C1202a.m1316a("PushSelfShowLog", sb.toString());
        return PendingIntent.getBroadcast(context, hashCode, flags, 134217728);
    }

    /* renamed from: a */
    public static String m1219a(Context context, C1174a aVar) {
        if (context == null || aVar == null) {
            return "";
        }
        if (!TextUtils.isEmpty(aVar.mo15675n())) {
            return aVar.mo15675n();
        }
        return context.getResources().getString(context.getApplicationInfo().labelRes);
    }
}
