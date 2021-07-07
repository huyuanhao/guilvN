package com.vivo.push.util;

import com.vivo.push.p281b.C4037c;

/* renamed from: com.vivo.push.util.r */
public final class C4148r {
    /* renamed from: a */
    public static int m11221a(C4037c cVar) {
        C4153w b = C4153w.m11245b();
        int b2 = cVar.mo41216b();
        long currentTimeMillis = System.currentTimeMillis();
        int b3 = b.mo41184b("com.vivo.push_preferences.operate." + b2 + "OPERATE_COUNT");
        long b4 = currentTimeMillis - b.mo41185b("com.vivo.push_preferences.operate." + b2 + "START_TIME", 0);
        if (b4 > 86400000 || b4 < 0) {
            b.mo41182a("com.vivo.push_preferences.operate." + b2 + "START_TIME", System.currentTimeMillis());
            b.mo41181a("com.vivo.push_preferences.operate." + b2 + "OPERATE_COUNT", 1);
            return 0;
        } else if (b3 >= cVar.mo40907f()) {
            return 1001;
        } else {
            b.mo41181a("com.vivo.push_preferences.operate." + b2 + "OPERATE_COUNT", b3 + 1);
            return 0;
        }
    }
}
