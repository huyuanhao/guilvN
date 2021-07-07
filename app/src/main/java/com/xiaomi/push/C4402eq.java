package com.xiaomi.push;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.p118pd.sdk.C5982OoooOoO;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.service.C4660f;

/* renamed from: com.xiaomi.push.eq */
public class C4402eq implements AbstractC4407ev {
    /* renamed from: a */
    private void m12451a(Activity activity, Intent intent) {
        String stringExtra = intent.getStringExtra("awake_info");
        if (!TextUtils.isEmpty(stringExtra)) {
            String b = C4399en.m12443b(stringExtra);
            if (!TextUtils.isEmpty(b)) {
                C4400eo.m12445a(activity.getApplicationContext(), b, 1007, "play with activity successfully");
                return;
            }
        }
        C4400eo.m12445a(activity.getApplicationContext(), C5982OoooOoO.OooO0o0, 1008, "B get incorrect message");
    }

    /* renamed from: b */
    private void m12452b(Context context, C4403er erVar) {
        String a = erVar.m12456a();
        String b = erVar.mo41792b();
        String d = erVar.mo41796d();
        int a2 = erVar.mo41789a();
        if (context == null || TextUtils.isEmpty(a) || TextUtils.isEmpty(b) || TextUtils.isEmpty(d)) {
            if (TextUtils.isEmpty(d)) {
                C4400eo.m12445a(context, C5982OoooOoO.OooO0o0, 1008, "argument error");
            } else {
                C4400eo.m12445a(context, d, 1008, "argument error");
            }
        } else if (!C4660f.m14096b(context, a, b)) {
            C4400eo.m12445a(context, d, 1003, "B is not ready");
        } else {
            C4400eo.m12445a(context, d, 1002, "B is ready");
            C4400eo.m12445a(context, d, 1004, "A is ready");
            Intent intent = new Intent(b);
            intent.setPackage(a);
            intent.putExtra("awake_info", C4399en.m12441a(d));
            intent.addFlags(276824064);
            intent.setAction(b);
            if (a2 == 1) {
                try {
                    if (!C4404es.m12468a(context)) {
                        C4400eo.m12445a(context, d, 1008, "A not in foreground");
                        return;
                    }
                } catch (Exception e) {
                    AbstractC4163b.m11303a(e);
                    C4400eo.m12445a(context, d, 1008, "A meet a exception when help B's activity");
                    return;
                }
            }
            context.startActivity(intent);
            C4400eo.m12445a(context, d, 1005, "A is successful");
            C4400eo.m12445a(context, d, 1006, "The job is finished");
        }
    }

    @Override // com.xiaomi.push.AbstractC4407ev
    /* renamed from: a */
    public void mo41787a(Context context, Intent intent, String str) {
        if (context == null || !(context instanceof Activity) || intent == null) {
            C4400eo.m12445a(context, C5982OoooOoO.OooO0o0, 1008, "B receive incorrect message");
        } else {
            m12451a((Activity) context, intent);
        }
    }

    @Override // com.xiaomi.push.AbstractC4407ev
    /* renamed from: a */
    public void mo41788a(Context context, C4403er erVar) {
        if (erVar != null) {
            m12452b(context, erVar);
        } else {
            C4400eo.m12445a(context, C5982OoooOoO.OooO0o0, 1008, "A receive incorrect message");
        }
    }
}
