package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import java.util.HashMap;

/* renamed from: com.xiaomi.push.eo */
public class C4400eo {
    /* renamed from: a */
    public static void m12445a(Context context, String str, int i, String str2) {
        C4251ai.m11641a(context).mo41474a(new RunnableC4401ep(context, str, i, str2));
    }

    /* renamed from: a */
    public static void m12446a(Context context, HashMap<String, String> hashMap) {
        AbstractC4408ew a = C4404es.m12465a(context).m12470a();
        if (a != null) {
            a.mo41444a(context, hashMap);
        }
    }

    /* renamed from: b */
    public static void m12448b(Context context, HashMap<String, String> hashMap) {
        AbstractC4408ew a = C4404es.m12465a(context).m12470a();
        if (a != null) {
            a.mo41446c(context, hashMap);
        }
    }

    /* renamed from: c */
    public static void m12449c(Context context, String str, int i, String str2) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("awake_info", str);
                hashMap.put("event_type", String.valueOf(i));
                hashMap.put("description", str2);
                int a = C4404es.m12465a(context).mo41798a();
                if (a != 1) {
                    if (a != 2) {
                        if (a == 3) {
                            m12446a(context, hashMap);
                        }
                    }
                    m12450c(context, hashMap);
                } else {
                    m12446a(context, hashMap);
                }
                m12448b(context, hashMap);
            } catch (Exception e) {
                AbstractC4163b.m11303a(e);
            }
        }
    }

    /* renamed from: c */
    public static void m12450c(Context context, HashMap<String, String> hashMap) {
        AbstractC4408ew a = C4404es.m12465a(context).m12470a();
        if (a != null) {
            a.mo41445b(context, hashMap);
        }
    }
}
