package com.umeng.commonsdk.internal.utils;

import android.os.Build;
import com.p118pd.sdk.C9053ooOoOo;
import com.umeng.commonsdk.internal.utils.C3540e;
import java.io.File;

/* renamed from: com.umeng.commonsdk.internal.utils.h */
public class C3544h {
    /* renamed from: a */
    public static boolean m9169a() {
        if (!m9170b() && !m9171c() && !m9172d() && !m9173e()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m9170b() {
        String str = Build.TAGS;
        return str != null && str.contains("test-keys");
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000f */
    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001c A[RETURN] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m9171c() {
        /*
            r0 = 1
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x000f }
            java.lang.String r2 = "/system/app/Superuser.apk"
            r1.<init>(r2)     // Catch:{ Exception -> 0x000f }
            boolean r1 = r1.exists()     // Catch:{ Exception -> 0x000f }
            if (r1 == 0) goto L_0x000f
            return r0
        L_0x000f:
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x001d }
            java.lang.String r2 = "/system/app/Kinguser.apk"
            r1.<init>(r2)     // Catch:{ Exception -> 0x001d }
            boolean r1 = r1.exists()     // Catch:{ Exception -> 0x001d }
            if (r1 == 0) goto L_0x001d
            return r0
        L_0x001d:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.utils.C3544h.m9171c():boolean");
    }

    /* renamed from: d */
    public static boolean m9172d() {
        return new C3540e().mo38859a(C3540e.EnumC3541a.check_su_binary) != null;
    }

    /* renamed from: e */
    public static boolean m9173e() {
        String[] strArr = {"/bin", "/system/bin/", "/system/xbin/", "/system/sbin/", "/sbin/", "/vendor/bin/", "/su/bin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};
        for (int i = 0; i < 12; i++) {
            String str = strArr[i];
            if (new File(str + C9053ooOoOo.OooO00o).exists()) {
                return true;
            }
        }
        return false;
    }
}
