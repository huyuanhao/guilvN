package com.qiyukf.nimlib.p183g;

import android.content.Context;
import android.os.SystemClock;
import com.p118pd.sdk.C7383o0OOO0O;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.p143d.C1861b;
import com.qiyukf.nimlib.C2180b;
import com.qiyukf.nimlib.C2205d;
import com.qiyukf.nimlib.p183g.C2286c;
import com.qiyukf.nimlib.p183g.p188b.p190b.C2275a;
import com.qiyukf.nimlib.sdk.StatusCode;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.qiyukf.nimlib.g.d */
public final class C2301d {

    /* renamed from: a */
    public final int f4591a = 0;

    /* renamed from: b */
    public final int f4592b = 1;

    /* renamed from: c */
    public Timer f4593c;

    /* renamed from: d */
    public AtomicInteger f4594d = new AtomicInteger();

    /* renamed from: e */
    public C2286c f4595e;

    /* renamed from: f */
    public AbstractC2305a f4596f;

    /* renamed from: g */
    public boolean f4597g = false;

    /* renamed from: h */
    public AtomicInteger f4598h = new AtomicInteger(0);

    /* renamed from: i */
    public long f4599i = SystemClock.elapsedRealtime();

    /* renamed from: com.qiyukf.nimlib.g.d$3 */
    public static /* synthetic */ class C23043 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4602a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0017 */
        static {
            /*
                int[] r0 = com.qiyukf.nimlib.p183g.p188b.AbstractC2279c.EnumC2280a.m4822a()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.qiyukf.nimlib.p183g.C2301d.C23043.f4602a = r0
                r1 = 1
                int r2 = com.qiyukf.nimlib.p183g.p188b.AbstractC2279c.EnumC2280a.f4548e     // Catch:{ NoSuchFieldError -> 0x000f }
                int r2 = r2 - r1
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                int[] r0 = com.qiyukf.nimlib.p183g.C2301d.C23043.f4602a     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r2 = com.qiyukf.nimlib.p183g.p188b.AbstractC2279c.EnumC2280a.f4549f     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r2 = r2 - r1
                r3 = 2
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r0 = com.qiyukf.nimlib.p183g.C2301d.C23043.f4602a     // Catch:{ NoSuchFieldError -> 0x001f }
                int r2 = com.qiyukf.nimlib.p183g.p188b.AbstractC2279c.EnumC2280a.f4547d     // Catch:{ NoSuchFieldError -> 0x001f }
                int r2 = r2 - r1
                r1 = 3
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.nimlib.p183g.C2301d.C23043.<clinit>():void");
        }
    }

    /* renamed from: com.qiyukf.nimlib.g.d$a */
    public interface AbstractC2305a {
        /* renamed from: b */
        void mo34898b();

        /* renamed from: c */
        void mo34900c();
    }

    public C2301d(AbstractC2305a aVar) {
        this.f4596f = aVar;
    }

    /* renamed from: a */
    public static /* synthetic */ void m4909a(C2301d dVar) {
        boolean z = SystemClock.elapsedRealtime() - dVar.f4599i > 900;
        boolean z2 = dVar.f4597g;
        boolean f = C1861b.m3533f(C2180b.m4471a());
        dVar.f4597g = f;
        if (f || z2 != f) {
            C2275a.m4806a().mo34914d();
        }
        if (dVar.f4593c == null || C2205d.m4578b() || z) {
            C1709a.m3011a("core", "network available, login");
            dVar.m4915e();
            return;
        }
        C1709a.m3011a("core", "background mode, wait for timer");
    }

    /* renamed from: c */
    private void m4912c() {
        if (this.f4598h.get() != 0 && this.f4593c == null) {
            int abs = Math.abs(new Random().nextInt() % 10);
            this.f4594d.set(0);
            this.f4593c = new Timer();
            this.f4593c.schedule(new TimerTask() {
                /* class com.qiyukf.nimlib.p183g.C2301d.C23032 */

                /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
                    if ((r1 & (r1 - 1)) == 0) goto L_0x0024;
                 */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r6 = this;
                        java.lang.String r0 = "core"
                        com.qiyukf.nimlib.g.d r1 = com.qiyukf.nimlib.p183g.C2301d.this     // Catch:{ all -> 0x003b }
                        java.util.concurrent.atomic.AtomicInteger r1 = com.qiyukf.nimlib.p183g.C2301d.m4911c(r1)     // Catch:{ all -> 0x003b }
                        int r1 = r1.incrementAndGet()     // Catch:{ all -> 0x003b }
                        boolean r2 = com.qiyukf.nimlib.C2205d.m4578b()     // Catch:{ all -> 0x003b }
                        if (r2 == 0) goto L_0x0015
                        r2 = 16
                        goto L_0x0017
                    L_0x0015:
                        r2 = 64
                    L_0x0017:
                        r3 = 0
                        r4 = 1
                        if (r1 <= 0) goto L_0x002b
                        int r5 = r2 << 1
                        if (r1 >= r5) goto L_0x0026
                        int r2 = r1 + -1
                        r1 = r1 & r2
                        if (r1 != 0) goto L_0x002b
                    L_0x0024:
                        r3 = 1
                        goto L_0x002b
                    L_0x0026:
                        int r1 = r1 % r2
                        int r2 = r2 - r4
                        if (r1 != r2) goto L_0x002b
                        goto L_0x0024
                    L_0x002b:
                        if (r3 == 0) goto L_0x003a
                        com.qiyukf.nimlib.g.d r1 = com.qiyukf.nimlib.p183g.C2301d.this     // Catch:{ all -> 0x003b }
                        boolean r1 = com.qiyukf.nimlib.p183g.C2301d.m4914d(r1)     // Catch:{ all -> 0x003b }
                        if (r1 == 0) goto L_0x003a
                        java.lang.String r1 = "relogin because of reconnect timer"
                        com.qiyukf.basesdk.p119a.C1709a.m3018d(r0, r1)     // Catch:{ all -> 0x003b }
                    L_0x003a:
                        return
                    L_0x003b:
                        r1 = move-exception
                        java.lang.String r2 = "reconnect error"
                        com.qiyukf.basesdk.p119a.C1709a.m3015b(r0, r2, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.nimlib.p183g.C2301d.C23032.run():void");
                }
            }, (long) (((abs / 2) + 5) * 1000), (long) ((abs + 10) * 1000));
        }
    }

    /* renamed from: d */
    private void m4913d() {
        Timer timer = this.f4593c;
        if (timer != null) {
            timer.cancel();
            this.f4593c = null;
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: e */
    private boolean m4915e() {
        C2286c cVar = this.f4595e;
        if (!(cVar != null && cVar.mo34930a())) {
            C1709a.m3014b("core", "network is not available");
            return false;
        }
        this.f4596f.mo34898b();
        this.f4599i = SystemClock.elapsedRealtime();
        return true;
    }

    /* renamed from: a */
    public final void mo34985a() {
        C1709a.m3014b(C7383o0OOO0O.OooOOO0, "networkKeeper shutdown");
        if (this.f4598h.compareAndSet(1, 0)) {
            C2286c cVar = this.f4595e;
            if (cVar != null) {
                cVar.mo34932c();
                this.f4595e = null;
            }
            m4913d();
        }
    }

    /* renamed from: a */
    public final void mo34986a(Context context) {
        if (this.f4598h.compareAndSet(0, 1)) {
            C1709a.m3014b(C7383o0OOO0O.OooOOO0, "networkKeeper startup");
            if (this.f4595e == null) {
                C2286c cVar = new C2286c(context, new C2286c.AbstractC2288a() {
                    /* class com.qiyukf.nimlib.p183g.C2301d.C23021 */

                    @Override // com.qiyukf.nimlib.p183g.C2286c.AbstractC2288a
                    /* renamed from: a */
                    public final void mo34934a(int i) {
                        int i2 = C23043.f4602a[i - 1];
                        if (i2 != 1) {
                            if (i2 == 2) {
                                C2301d.this.f4596f.mo34900c();
                            } else if (i2 == 3) {
                                C2301d.this.f4596f.mo34900c();
                                return;
                            } else {
                                return;
                            }
                        }
                        C2301d.m4909a(C2301d.this);
                    }
                });
                this.f4595e = cVar;
                cVar.mo34931b();
            }
        }
    }

    /* renamed from: a */
    public final void mo34987a(StatusCode statusCode) {
        if (this.f4598h.get() == 1) {
            if (statusCode == StatusCode.LOGINED) {
                m4913d();
            } else if (statusCode.shouldReLogin()) {
                m4912c();
            }
        }
    }

    /* renamed from: b */
    public final void mo34988b() {
        if (C2205d.m4582e().shouldReLogin()) {
            m4913d();
            m4912c();
        }
    }
}
