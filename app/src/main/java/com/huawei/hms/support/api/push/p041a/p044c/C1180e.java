package com.huawei.hms.support.api.push.p041a.p044c;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.huawei.hms.support.api.push.p041a.p043b.C1174a;
import com.huawei.hms.support.api.push.p041a.p045d.C1184a;
import com.huawei.hms.support.log.C1202a;

/* renamed from: com.huawei.hms.support.api.push.a.c.e */
public class C1180e {
    /* renamed from: a */
    public static void m1229a(Context context, Notification.Builder builder, int i, Bitmap bitmap, C1174a aVar) {
        if (aVar == null || aVar.mo15673l() == null) {
            C1202a.m1318b("PushSelfShowLog", "msg is null");
        } else if (!TextUtils.isEmpty(aVar.mo15673l()) && aVar.mo15673l().contains("##")) {
            builder.setTicker(aVar.mo15673l().replace("##", "，"));
            if (!C1184a.m1247b()) {
                builder.setContentText(aVar.mo15673l().replace("##", "，"));
                return;
            }
            builder.setLargeIcon(bitmap);
            builder.setContentTitle(C1178c.m1219a(context, aVar));
            Notification.InboxStyle inboxStyle = new Notification.InboxStyle();
            String[] split = aVar.mo15673l().split("##");
            int length = split.length;
            if (length > 4) {
                length = 4;
            }
            if (!TextUtils.isEmpty(aVar.mo15685x())) {
                inboxStyle.setBigContentTitle(aVar.mo15685x());
                builder.setContentText(aVar.mo15685x());
                if (4 == length) {
                    length--;
                }
            }
            for (int i2 = 0; i2 < length; i2++) {
                inboxStyle.addLine(split[i2]);
            }
            if (aVar.mo15683v() != null && aVar.mo15683v().length > 0) {
                int length2 = aVar.mo15683v().length;
                for (int i3 = 0; i3 < length2; i3++) {
                    if (!TextUtils.isEmpty(aVar.mo15683v()[i3]) && !TextUtils.isEmpty(aVar.mo15684w()[i3])) {
                        builder.addAction(0, aVar.mo15683v()[i3], C1178c.m1218a(context, i, aVar.mo15684w()[i3]));
                    }
                }
            }
            builder.setStyle(inboxStyle);
        }
    }
}
