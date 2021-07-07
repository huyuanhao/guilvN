package com.qiyukf.nimlib.p183g;

import android.content.Context;
import com.p118pd.sdk.C8653oo0Oo0;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.C1805a;
import com.qiyukf.basesdk.p138c.ExecutorC1854d;
import com.qiyukf.nimlib.p155a.C2110b;
import com.qiyukf.nimlib.p155a.p157b.C2117b;
import com.qiyukf.nimlib.p155a.p162c.AbstractC2131a;
import com.qiyukf.nimlib.p155a.p168d.AbstractC2148a;
import com.qiyukf.nimlib.p180e.p181a.C2227a;
import com.qiyukf.nimlib.p183g.p188b.C2268b;
import com.qiyukf.nimlib.sdk.auth.LoginInfo;
import com.qiyukf.unicorn.p228g.C2657d;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.qiyukf.nimlib.g.f */
public final class C2307f {

    /* renamed from: g */
    public static C2307f f4603g = new C2307f();

    /* renamed from: a */
    public AtomicInteger f4604a = new AtomicInteger(1);

    /* renamed from: b */
    public Context f4605b;

    /* renamed from: c */
    public C2263b f4606c = new C2263b();

    /* renamed from: d */
    public C2268b f4607d = new C2268b(new C2268b.AbstractC2274a() {
        /* class com.qiyukf.nimlib.p183g.C2307f.C23081 */

        @Override // com.qiyukf.nimlib.p183g.p188b.C2268b.AbstractC2274a
        /* renamed from: a */
        public final void mo34910a(int i) {
            C2307f.m4935a(C2307f.this, i);
        }

        @Override // com.qiyukf.nimlib.p183g.p188b.C2268b.AbstractC2274a
        /* renamed from: a */
        public final void mo34911a(AbstractC2148a.C2149a aVar) {
            C2307f.this.f4609f.mo34640a(aVar);
        }
    });

    /* renamed from: e */
    public ExecutorC1854d f4608e;

    /* renamed from: f */
    public C2117b f4609f;

    public C2307f() {
        ExecutorC1854d dVar = new ExecutorC1854d("Response", ExecutorC1854d.f3415c, false);
        this.f4608e = dVar;
        this.f4609f = new C2117b(true, dVar, null);
    }

    /* renamed from: a */
    public static C2307f m4934a() {
        return f4603g;
    }

    /* renamed from: a */
    public static /* synthetic */ void m4935a(C2307f fVar, final int i) {
        fVar.f4608e.execute(new Runnable() {
            /* class com.qiyukf.nimlib.p183g.C2307f.RunnableC23114 */

            public final void run() {
                try {
                    C2307f.this.f4606c.mo34893a(i);
                } catch (Throwable unused) {
                    C1709a.m3011a("core", "handle connection change error");
                }
            }
        });
    }

    /* renamed from: a */
    public static /* synthetic */ void m4936a(C2307f fVar, boolean z) {
        try {
            if (fVar.f4604a.compareAndSet(3, 4)) {
                C1709a.m3011a("core", "shutdown");
                fVar.f4607d.mo34903a();
                fVar.f4606c.mo34892a();
                fVar.f4608e.mo34122b();
                fVar.f4604a.compareAndSet(4, 1);
            }
            if (z) {
                fVar.mo34992a(fVar.f4605b);
            }
        } catch (Throwable th) {
            C1709a.m3015b("core", "restart error", th);
        }
    }

    /* renamed from: a */
    private void m4937a(final boolean z) {
        this.f4606c.mo34897a(z);
        C1805a.m3404b().postDelayed(new Runnable() {
            /* class com.qiyukf.nimlib.p183g.C2307f.RunnableC23092 */

            public final void run() {
                C2307f.m4936a(C2307f.this, z);
            }
        }, 100);
    }

    /* renamed from: e */
    private boolean m4939e() {
        return this.f4604a.get() == 3;
    }

    /* renamed from: a */
    public final void mo34990a(int i) {
        this.f4606c.mo34899b(i);
    }

    /* renamed from: a */
    public final void mo34991a(int i, int i2) {
        this.f4606c.mo34894a(i, i2);
        C2657d.m6078a().mo36298b();
        C1805a.m3404b().post(new Runnable() {
            /* class com.qiyukf.nimlib.p183g.C2307f.RunnableC23103 */

            public final void run() {
                C2307f.m4936a(C2307f.this, true);
            }
        });
    }

    /* renamed from: a */
    public final void mo34992a(Context context) {
        if (this.f4604a.compareAndSet(1, 2)) {
            C1709a.m3011a("core", C8653oo0Oo0.OooO0Oo);
            this.f4605b = context;
            this.f4608e.mo34120a();
            this.f4606c.mo34895a(context, this.f4607d);
            this.f4604a.compareAndSet(2, 3);
        }
    }

    /* renamed from: a */
    public final void mo34993a(AbstractC2131a aVar) {
        if (m4939e()) {
            aVar.mo34667a().mo34939a(C2110b.m4281a(true));
            this.f4607d.mo34904a(aVar);
        }
    }

    /* renamed from: a */
    public final void mo34994a(AbstractC2148a.C2149a aVar) {
        this.f4609f.mo34640a(aVar);
    }

    /* renamed from: a */
    public final void mo34995a(C2227a aVar) {
        if (m4939e()) {
            this.f4607d.mo34905a(aVar);
        }
    }

    /* renamed from: a */
    public final void mo34996a(LoginInfo loginInfo) {
        if (m4939e()) {
            this.f4606c.mo34896a(loginInfo);
        }
    }

    /* renamed from: b */
    public final void mo34997b() {
        m4937a(true);
        C2657d.m6078a().mo36298b();
    }

    /* renamed from: b */
    public final void mo34998b(Context context) {
        mo34992a(context);
        this.f4606c.mo34901d();
    }

    /* renamed from: c */
    public final void mo34999c() {
        C1709a.m3011a("connection Tag", "enterSaverMode");
        m4937a(false);
    }

    /* renamed from: d */
    public final void mo35000d() {
        if (this.f4604a.get() == 3) {
            this.f4607d.mo34907b();
        }
    }
}
