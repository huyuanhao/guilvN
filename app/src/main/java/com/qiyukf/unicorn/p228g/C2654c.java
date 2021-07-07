package com.qiyukf.unicorn.p228g;

import android.content.Context;
import android.os.Handler;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.nimlib.p180e.C2238d;
import com.qiyukf.nimlib.p183g.C2307f;
import com.qiyukf.unicorn.api.SavePowerConfig;

/* renamed from: com.qiyukf.unicorn.g.c */
public final class C2654c {

    /* renamed from: a */
    public Context f5473a;

    /* renamed from: b */
    public Handler f5474b;

    /* renamed from: c */
    public Runnable f5475c;

    /* renamed from: com.qiyukf.unicorn.g.c$a */
    public static class C2656a {

        /* renamed from: a */
        public static final C2654c f5477a = new C2654c((byte) 0);
    }

    public C2654c() {
        this.f5475c = new Runnable() {
            /* class com.qiyukf.unicorn.p228g.C2654c.RunnableC26551 */

            public final void run() {
                C2649a.m6065a(C2654c.this.f5473a, false);
            }
        };
    }

    public /* synthetic */ C2654c(byte b) {
        this();
    }

    /* renamed from: a */
    public static C2654c m6072a(Context context) {
        C2654c cVar = C2656a.f5477a;
        if (cVar.f5473a == null && context != null) {
            cVar.f5473a = context;
            cVar.f5474b = new Handler(context.getMainLooper());
        }
        return C2656a.f5477a;
    }

    /* renamed from: a */
    private void m6073a(long j) {
        SavePowerConfig f = C2657d.m6078a().mo36306f();
        long j2 = f == null ? -1 : f.activeDelay * 1000;
        if (j2 >= 0) {
            long max = Math.max(Math.min(j2 - j, j2), 15000L);
            this.f5474b.removeCallbacks(this.f5475c);
            C1709a.m3011a("PowerSaver", "switch to saver mode in " + max);
            this.f5474b.postDelayed(this.f5475c, max);
        }
    }

    /* renamed from: c */
    public static boolean m6074c() {
        SavePowerConfig f = C2657d.m6078a().mo36306f();
        return f != null && f.customPush && C2657d.m6078a().mo36309i();
    }

    /* renamed from: a */
    public final void mo36290a(int i) {
        if (C2657d.m6078a().mo36307g()) {
            if (i == 1) {
                C1709a.m3011a("PowerSaver", "quit saver mode");
                this.f5474b.removeCallbacks(this.f5475c);
                C2657d a = C2657d.m6078a();
                if (a.mo36304e() != 0) {
                    a.mo36294a(0);
                    a.mo36295a(System.currentTimeMillis());
                    C2307f.m4934a().mo34998b(this.f5473a);
                    C2649a.m6066b(this.f5473a);
                    if (C2657d.m6078a().mo36309i()) {
                        C2238d.m4684a(false);
                    }
                }
            } else if (i == 0) {
                C2657d a2 = C2657d.m6078a();
                if (a2.mo36304e() == 0) {
                    C1709a.m3011a("PowerSaver", "persistent connection goes dying");
                    a2.mo36295a(System.currentTimeMillis());
                    m6073a(0L);
                }
            } else if (i == 2) {
                C2657d a3 = C2657d.m6078a();
                if (a3.mo36304e() != 1) {
                    a3.mo36294a(1);
                    C2307f.m4934a().mo34999c();
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo36291a() {
        if (!C2657d.m6078a().mo36307g()) {
            C1709a.m3011a("PowerSaver", "not need Save Mode");
            C2307f.m4934a().mo34992a(this.f5473a);
            return false;
        }
        C2657d a = C2657d.m6078a();
        int e = a.mo36304e();
        C1709a.m3011a("PowerSaver", "check when start, mode is " + e);
        if (e == 0) {
            C2307f.m4934a().mo34992a(this.f5473a);
            m6073a(System.currentTimeMillis() - a.mo36300c());
            return false;
        } else if (m6074c()) {
            return true;
        } else {
            C2649a.m6064a(this.f5473a);
            return true;
        }
    }

    /* renamed from: b */
    public final void mo36292b() {
        C2657d a = C2657d.m6078a();
        int e = a.mo36304e();
        C1709a.m3011a("PowerSaver", "switch to saver mode from: " + e);
        if (!m6074c()) {
            if (e != 1) {
                a.mo36294a(1);
                C2307f.m4934a().mo34999c();
            }
            C2657d.m6078a().mo36299b(System.currentTimeMillis());
            C2649a.m6064a(this.f5473a);
        } else if (e != 1) {
            C2238d.m4684a(true);
        }
    }
}
