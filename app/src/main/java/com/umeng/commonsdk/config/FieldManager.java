package com.umeng.commonsdk.config;

import android.content.Context;
import android.util.Pair;
import com.umeng.commonsdk.config.C3502d;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;

public class FieldManager {

    /* renamed from: a */
    public static final String f8869a = "cfgfield";

    /* renamed from: b */
    public static C3498b f8870b = C3498b.m8994a();

    /* renamed from: com.umeng.commonsdk.config.FieldManager$a */
    public static class C3496a {

        /* renamed from: a */
        public static final FieldManager f8871a = new FieldManager();
    }

    /* renamed from: a */
    public static FieldManager m8985a() {
        return C3496a.f8871a;
    }

    public static boolean allow(String str) {
        return C3498b.m8995a(str);
    }

    public FieldManager() {
    }

    /* renamed from: a */
    public void mo38837a(Context context) {
        String str;
        String[] strArr = {C3502d.EnumC3503a.class.getName(), C3502d.EnumC3504b.class.getName(), C3502d.EnumC3505c.class.getName(), C3502d.EnumC3506d.class.getName()};
        String str2 = "1001@1073741823,536870911,262143,2047";
        Pair<Long, String> a = m8984a(UMEnvelopeBuild.imprintProperty(context, f8869a, str2));
        if (((Long) a.first).longValue() > 1000 && (str = (String) a.second) != null && str.length() > 0) {
            str2 = str;
        }
        String[] split = str2.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        int length = split.length;
        if (length > 0) {
            ArrayList arrayList = new ArrayList();
            C3509g gVar = new C3509g();
            for (int i = 0; i < length; i++) {
                arrayList.add(gVar);
                ((AbstractC3507e) arrayList.get(i)).mo38839a(split[i], f8870b, C3502d.m9000b(strArr[i]));
            }
        }
    }

    /* renamed from: a */
    public static Pair<Long, String> m8984a(String str) {
        Pair<Long, String> pair = new Pair<>(-1L, null);
        if (str != null && str.length() >= 2) {
            String[] split = str.split("@");
            if (split.length < 2) {
                return pair;
            }
            try {
                long parseLong = Long.parseLong(split[0]);
                return new Pair<>(Long.valueOf(parseLong), split[1]);
            } catch (Throwable unused) {
            }
        }
        return pair;
    }
}
