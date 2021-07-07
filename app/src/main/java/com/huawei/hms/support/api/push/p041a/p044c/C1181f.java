package com.huawei.hms.support.api.push.p041a.p044c;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;
import com.huawei.hms.support.api.push.p041a.p043b.C1174a;
import com.huawei.hms.support.api.push.p041a.p045d.C1185b;
import com.huawei.hms.support.log.C1202a;

/* renamed from: com.huawei.hms.support.api.push.a.c.f */
public class C1181f {
    /* renamed from: a */
    public static Notification.Builder m1230a(Context context, Notification.Builder builder, int i, C1174a aVar, Bitmap bitmap) {
        C1202a.m1316a("PushSelfShowLog", "Notification addStyle");
        if (!(context == null || builder == null || aVar == null)) {
            EnumC1176a aVar2 = EnumC1176a.STYLE_1;
            if (aVar.mo15682u() >= 0 && aVar.mo15682u() < EnumC1176a.values().length) {
                aVar2 = EnumC1176a.values()[aVar.mo15682u()];
            }
            int i2 = C1182g.f1291a[aVar2.ordinal()];
            if (i2 == 1) {
                builder.setContent(m1231a(context, i, bitmap, aVar));
            } else if (i2 == 2) {
                C1180e.m1229a(context, builder, i, bitmap, aVar);
            }
        }
        return builder;
    }

    /* renamed from: a */
    public static RemoteViews m1231a(Context context, int i, Bitmap bitmap, C1174a aVar) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), C1185b.m1253a(context, "hwpush_layout2"));
        C1178c.m1221a(context, bitmap, remoteViews);
        C1178c.m1220a(context, i, remoteViews, aVar);
        remoteViews.setTextViewText(C1185b.m1255b(context, "title"), C1178c.m1219a(context, aVar));
        remoteViews.setTextViewText(C1185b.m1255b(context, "text"), aVar.mo15673l());
        return remoteViews;
    }
}
