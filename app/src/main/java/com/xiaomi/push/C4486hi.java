package com.xiaomi.push;

import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.C4480he;
import com.xiaomi.push.service.C4611am;
import com.xiaomi.push.service.XMPushService;
import java.util.Hashtable;

/* renamed from: com.xiaomi.push.hi */
public class C4486hi {

    /* renamed from: a */
    public static final int f12165a = EnumC4424fj.PING_RTT.mo41822a();

    /* renamed from: com.xiaomi.push.hi$a */
    public static class C4487a {

        /* renamed from: a */
        public static Hashtable<Integer, Long> f12166a = new Hashtable<>();
    }

    /* renamed from: a */
    public static void m12892a() {
        m12894a(0, f12165a);
    }

    /* renamed from: a */
    public static void m12893a(int i) {
        C4425fk a = C4483hg.m12882a().m12884a();
        a.mo41825a(EnumC4424fj.CHANNEL_STATS_COUNTER.mo41822a());
        a.mo41835c(i);
        C4483hg.m12882a().mo41994a(a);
    }

    /* renamed from: a */
    public static synchronized void m12894a(int i, int i2) {
        synchronized (C4486hi.class) {
            if (i2 < 16777215) {
                C4487a.f12166a.put(Integer.valueOf((i << 24) | i2), Long.valueOf(System.currentTimeMillis()));
            } else {
                AbstractC4163b.m11306d("stats key should less than 16777215");
            }
        }
    }

    /* renamed from: a */
    public static void m12895a(int i, int i2, int i3, String str, int i4) {
        C4425fk a = C4483hg.m12882a().m12884a();
        a.mo41824a((byte) i);
        a.mo41825a(i2);
        a.mo41830b(i3);
        a.mo41831b(str);
        a.mo41835c(i4);
        C4483hg.m12882a().mo41994a(a);
    }

    /* renamed from: a */
    public static synchronized void m12896a(int i, int i2, String str, int i3) {
        synchronized (C4486hi.class) {
            long currentTimeMillis = System.currentTimeMillis();
            int i4 = (i << 24) | i2;
            if (C4487a.f12166a.containsKey(Integer.valueOf(i4))) {
                C4425fk a = C4483hg.m12882a().m12884a();
                a.mo41825a(i2);
                a.mo41830b((int) (currentTimeMillis - C4487a.f12166a.get(Integer.valueOf(i4)).longValue()));
                a.mo41831b(str);
                if (i3 > -1) {
                    a.mo41835c(i3);
                }
                C4483hg.m12882a().mo41994a(a);
                C4487a.f12166a.remove(Integer.valueOf(i2));
            } else {
                AbstractC4163b.m11306d("stats key not found");
            }
        }
    }

    /* renamed from: a */
    public static void m12897a(XMPushService xMPushService, C4611am.C4613b bVar) {
        new C4477hb(xMPushService, bVar).mo41989a();
    }

    /* renamed from: a */
    public static void m12898a(String str, int i, Exception exc) {
        C4425fk a = C4483hg.m12882a().m12884a();
        if (i > 0) {
            a.mo41825a(EnumC4424fj.GSLB_REQUEST_SUCCESS.mo41822a());
            a.mo41831b(str);
            a.mo41830b(i);
            C4483hg.m12882a().mo41994a(a);
            return;
        }
        try {
            C4480he.C4481a a2 = C4480he.m12866a(exc);
            a.mo41825a(a2.f12144a.mo41822a());
            a.mo41836c(a2.f12145a);
            a.mo41831b(str);
            C4483hg.m12882a().mo41994a(a);
        } catch (NullPointerException unused) {
        }
    }

    /* renamed from: a */
    public static void m12899a(String str, Exception exc) {
        try {
            C4480he.C4481a b = C4480he.m12868b(exc);
            C4425fk a = C4483hg.m12882a().m12884a();
            a.mo41825a(b.f12144a.mo41822a());
            a.mo41836c(b.f12145a);
            a.mo41831b(str);
            C4483hg.m12882a().mo41994a(a);
        } catch (NullPointerException unused) {
        }
    }

    /* renamed from: a */
    public static byte[] m12900a() {
        C4426fl a = C4483hg.m12882a().m12885a();
        if (a != null) {
            return C4531iy.m13590a(a);
        }
        return null;
    }

    /* renamed from: b */
    public static void m12901b() {
        m12896a(0, f12165a, null, -1);
    }

    /* renamed from: b */
    public static void m12902b(String str, Exception exc) {
        try {
            C4480he.C4481a d = C4480he.m12870d(exc);
            C4425fk a = C4483hg.m12882a().m12884a();
            a.mo41825a(d.f12144a.mo41822a());
            a.mo41836c(d.f12145a);
            a.mo41831b(str);
            C4483hg.m12882a().mo41994a(a);
        } catch (NullPointerException unused) {
        }
    }
}
