package com.xiaomi.push;

import android.content.Context;
import com.umeng.message.proguard.C3848l;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.service.XMJobService;
import org.android.agoo.xiaomi.MiPushRegistar;

/* renamed from: com.xiaomi.push.fe */
public final class C4418fe {

    /* renamed from: a */
    public static int f11819a = 0;

    /* renamed from: a */
    public static AbstractC4419a f11820a;

    /* renamed from: a */
    public static final String f11821a = XMJobService.class.getCanonicalName();

    /* renamed from: com.xiaomi.push.fe$a */
    public interface AbstractC4419a {
        /* renamed from: a */
        void mo41818a();

        /* renamed from: a */
        void mo41819a(boolean z);

        /* renamed from: a */
        boolean m12538a();
    }

    /* renamed from: a */
    public static synchronized void m12531a() {
        synchronized (C4418fe.class) {
            if (f11820a != null) {
                AbstractC4163b.m11305c("stop alarm.");
                f11820a.mo41818a();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (com.xiaomi.push.C4418fe.f11821a.equals(com.xiaomi.push.C4688t.m14219a(r9, r6.name).getSuperclass().getCanonicalName()) != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007f, code lost:
        r2 = r5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m12532a(android.content.Context r9) {
        /*
        // Method dump skipped, instructions count: 213
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.C4418fe.m12532a(android.content.Context):void");
    }

    /* renamed from: a */
    public static synchronized void m12533a(Context context, int i) {
        synchronized (C4418fe.class) {
            int i2 = f11819a;
            if (!MiPushRegistar.PACKAGE_XIAOMI.equals(context.getPackageName())) {
                if (i == 2) {
                    f11819a = 2;
                } else {
                    f11819a = 0;
                }
            }
            if (i2 != f11819a && f11819a == 2) {
                m12531a();
                f11820a = new C4422fh(context);
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m12534a(boolean z) {
        synchronized (C4418fe.class) {
            if (f11820a == null) {
                AbstractC4163b.m11301a("timer is not initialized");
                return;
            }
            AbstractC4163b.m11305c("register alarm. (" + z + C3848l.f10402t);
            f11820a.mo41819a(z);
        }
    }

    /* renamed from: a */
    public static synchronized boolean m12535a() {
        synchronized (C4418fe.class) {
            if (f11820a == null) {
                return false;
            }
            return f11820a.m12538a();
        }
    }
}
