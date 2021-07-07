package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.p118pd.sdk.C8932ooOOO0o;
import com.umeng.analytics.pro.C3416b;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.service.C4660f;

/* renamed from: com.xiaomi.push.ex */
public class C4409ex implements AbstractC4407ev {
    /* renamed from: a */
    private void m12485a(Context context, String str) {
        try {
            if (!TextUtils.isEmpty(str) && context != null) {
                String[] split = str.split(C8932ooOOO0o.OooO0OO);
                if (split.length > 0 && !TextUtils.isEmpty(split[split.length - 1])) {
                    String str2 = split[split.length - 1];
                    if (TextUtils.isEmpty(str2)) {
                        C4400eo.m12445a(context, C3416b.f8428L, 1008, "B get a incorrect message");
                        return;
                    }
                    String decode = Uri.decode(str2);
                    if (TextUtils.isEmpty(decode)) {
                        C4400eo.m12445a(context, C3416b.f8428L, 1008, "B get a incorrect message");
                        return;
                    }
                    String b = C4399en.m12443b(decode);
                    if (!TextUtils.isEmpty(b)) {
                        C4400eo.m12445a(context, b, 1007, "play with provider successfully");
                        return;
                    }
                }
            }
            C4400eo.m12445a(context, C3416b.f8428L, 1008, "B get a incorrect message");
        } catch (Exception e) {
            C4400eo.m12445a(context, C3416b.f8428L, 1008, "B meet a exception" + e.getMessage());
        }
    }

    /* renamed from: b */
    private void m12486b(Context context, C4403er erVar) {
        String b = erVar.mo41792b();
        String d = erVar.mo41796d();
        int a = erVar.mo41789a();
        if (context == null || TextUtils.isEmpty(b) || TextUtils.isEmpty(d)) {
            if (TextUtils.isEmpty(d)) {
                C4400eo.m12445a(context, C3416b.f8428L, 1008, "argument error");
            } else {
                C4400eo.m12445a(context, d, 1008, "argument error");
            }
        } else if (!C4660f.m14095b(context, b)) {
            C4400eo.m12445a(context, d, 1003, "B is not ready");
        } else {
            C4400eo.m12445a(context, d, 1002, "B is ready");
            C4400eo.m12445a(context, d, 1004, "A is ready");
            String a2 = C4399en.m12441a(d);
            try {
                if (TextUtils.isEmpty(a2)) {
                    C4400eo.m12445a(context, d, 1008, "info is empty");
                } else if (a != 1 || C4404es.m12468a(context)) {
                    String type = context.getContentResolver().getType(C4399en.m12440a(b, a2));
                    if (TextUtils.isEmpty(type) || !"success".equals(type)) {
                        C4400eo.m12445a(context, d, 1008, "A is fail to help B's provider");
                        return;
                    }
                    C4400eo.m12445a(context, d, 1005, "A is successful");
                    C4400eo.m12445a(context, d, 1006, "The job is finished");
                } else {
                    C4400eo.m12445a(context, d, 1008, "A not in foreground");
                }
            } catch (Exception e) {
                AbstractC4163b.m11303a(e);
                C4400eo.m12445a(context, d, 1008, "A meet a exception when help B's provider");
            }
        }
    }

    @Override // com.xiaomi.push.AbstractC4407ev
    /* renamed from: a */
    public void mo41787a(Context context, Intent intent, String str) {
        m12485a(context, str);
    }

    @Override // com.xiaomi.push.AbstractC4407ev
    /* renamed from: a */
    public void mo41788a(Context context, C4403er erVar) {
        if (erVar != null) {
            m12486b(context, erVar);
        } else {
            C4400eo.m12445a(context, C3416b.f8428L, 1008, "A receive incorrect message");
        }
    }
}
