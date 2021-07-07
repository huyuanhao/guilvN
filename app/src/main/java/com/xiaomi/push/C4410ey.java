package com.xiaomi.push;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.service.C4660f;

/* renamed from: com.xiaomi.push.ey */
public class C4410ey implements AbstractC4407ev {
    /* renamed from: a */
    private void m12489a(Service service, Intent intent) {
        String stringExtra = intent.getStringExtra("awake_info");
        if (!TextUtils.isEmpty(stringExtra)) {
            String b = C4399en.m12443b(stringExtra);
            if (!TextUtils.isEmpty(b)) {
                C4400eo.m12445a(service.getApplicationContext(), b, 1007, "play with service successfully");
                return;
            }
        }
        C4400eo.m12445a(service.getApplicationContext(), "service", 1008, "B get a incorrect message");
    }

    /* renamed from: b */
    private void m12490b(Context context, C4403er erVar) {
        String a = erVar.m12456a();
        String b = erVar.mo41792b();
        String d = erVar.mo41796d();
        int a2 = erVar.mo41789a();
        if (context == null || TextUtils.isEmpty(a) || TextUtils.isEmpty(b) || TextUtils.isEmpty(d)) {
            if (TextUtils.isEmpty(d)) {
                C4400eo.m12445a(context, "service", 1008, "argument error");
            } else {
                C4400eo.m12445a(context, d, 1008, "argument error");
            }
        } else if (!C4660f.m14094a(context, a, b)) {
            C4400eo.m12445a(context, d, 1003, "B is not ready");
        } else {
            C4400eo.m12445a(context, d, 1002, "B is ready");
            C4400eo.m12445a(context, d, 1004, "A is ready");
            try {
                Intent intent = new Intent();
                intent.setAction(b);
                intent.setPackage(a);
                intent.putExtra("awake_info", C4399en.m12441a(d));
                if (a2 == 1 && !C4404es.m12468a(context)) {
                    C4400eo.m12445a(context, d, 1008, "A not in foreground");
                } else if (context.startService(intent) != null) {
                    C4400eo.m12445a(context, d, 1005, "A is successful");
                    C4400eo.m12445a(context, d, 1006, "The job is finished");
                } else {
                    C4400eo.m12445a(context, d, 1008, "A is fail to help B's service");
                }
            } catch (Exception e) {
                AbstractC4163b.m11303a(e);
                C4400eo.m12445a(context, d, 1008, "A meet a exception when help B's service");
            }
        }
    }

    @Override // com.xiaomi.push.AbstractC4407ev
    /* renamed from: a */
    public void mo41787a(Context context, Intent intent, String str) {
        if (context == null || !(context instanceof Service)) {
            C4400eo.m12445a(context, "service", 1008, "A receive incorrect message");
        } else {
            m12489a((Service) context, intent);
        }
    }

    @Override // com.xiaomi.push.AbstractC4407ev
    /* renamed from: a */
    public void mo41788a(Context context, C4403er erVar) {
        if (erVar != null) {
            m12490b(context, erVar);
        } else {
            C4400eo.m12445a(context, "service", 1008, "A receive incorrect message");
        }
    }
}
