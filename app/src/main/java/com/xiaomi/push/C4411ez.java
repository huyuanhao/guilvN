package com.xiaomi.push;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.service.C4660f;

/* renamed from: com.xiaomi.push.ez */
public class C4411ez implements AbstractC4407ev {
    /* renamed from: a */
    private void m12493a(Service service, Intent intent) {
        if ("com.xiaomi.mipush.sdk.WAKEUP".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("waker_pkgname");
            String stringExtra2 = intent.getStringExtra("awake_info");
            if (TextUtils.isEmpty(stringExtra)) {
                C4400eo.m12445a(service.getApplicationContext(), "service", 1007, "old version message");
            } else if (!TextUtils.isEmpty(stringExtra2)) {
                String b = C4399en.m12443b(stringExtra2);
                boolean isEmpty = TextUtils.isEmpty(b);
                Context applicationContext = service.getApplicationContext();
                if (!isEmpty) {
                    C4400eo.m12445a(applicationContext, b, 1007, "old version message ");
                } else {
                    C4400eo.m12445a(applicationContext, "service", 1008, "B get a incorrect message");
                }
            } else {
                C4400eo.m12445a(service.getApplicationContext(), stringExtra, 1007, "play with service ");
            }
        }
    }

    /* renamed from: a */
    private void m12494a(Context context, String str, String str2, String str3) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            if (TextUtils.isEmpty(str3)) {
                C4400eo.m12445a(context, "service", 1008, "argument error");
            } else {
                C4400eo.m12445a(context, str3, 1008, "argument error");
            }
        } else if (!C4660f.m14093a(context, str)) {
            C4400eo.m12445a(context, str3, 1003, "B is not ready");
        } else {
            C4400eo.m12445a(context, str3, 1002, "B is ready");
            C4400eo.m12445a(context, str3, 1004, "A is ready");
            try {
                Intent intent = new Intent();
                intent.setClassName(str, str2);
                intent.setAction("com.xiaomi.mipush.sdk.WAKEUP");
                intent.putExtra("waker_pkgname", context.getPackageName());
                intent.putExtra("awake_info", C4399en.m12441a(str3));
                if (context.startService(intent) != null) {
                    C4400eo.m12445a(context, str3, 1005, "A is successful");
                    C4400eo.m12445a(context, str3, 1006, "The job is finished");
                    return;
                }
                C4400eo.m12445a(context, str3, 1008, "A is fail to help B's service");
            } catch (Exception e) {
                AbstractC4163b.m11303a(e);
                C4400eo.m12445a(context, str3, 1008, "A meet a exception when help B's service");
            }
        }
    }

    @Override // com.xiaomi.push.AbstractC4407ev
    /* renamed from: a */
    public void mo41787a(Context context, Intent intent, String str) {
        if (context != null && (context instanceof Service)) {
            m12493a((Service) context, intent);
        }
    }

    @Override // com.xiaomi.push.AbstractC4407ev
    /* renamed from: a */
    public void mo41788a(Context context, C4403er erVar) {
        if (erVar != null) {
            m12494a(context, erVar.m12456a(), erVar.mo41794c(), erVar.mo41796d());
        }
    }
}
