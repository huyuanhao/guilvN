package com.xiaomi.push.service;

import android.os.SystemClock;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: com.xiaomi.push.service.g */
public class C4661g {

    /* renamed from: a */
    public static long f13324a;

    /* renamed from: b */
    public static long f13325b;

    /* renamed from: c */
    public static long f13326c;

    /* renamed from: a */
    public final C4662a f13327a;

    /* renamed from: a */
    public final C4664c f13328a;

    /* renamed from: com.xiaomi.push.service.g$a */
    public static final class C4662a {

        /* renamed from: a */
        public final C4664c f13329a;

        public C4662a(C4664c cVar) {
            this.f13329a = cVar;
        }

        public void finalize() {
            try {
                synchronized (this.f13329a) {
                    this.f13329a.f13336c = true;
                    this.f13329a.notify();
                }
            } finally {
                super.finalize();
            }
        }
    }

    /* renamed from: com.xiaomi.push.service.g$b */
    public static abstract class AbstractRunnableC4663b implements Runnable {

        /* renamed from: a */
        public int f13330a;

        public AbstractRunnableC4663b(int i) {
            this.f13330a = i;
        }
    }

    /* renamed from: com.xiaomi.push.service.g$c */
    public static final class C4664c extends Thread {

        /* renamed from: a */
        public volatile long f13331a = 0;

        /* renamed from: a */
        public C4665a f13332a = new C4665a();

        /* renamed from: a */
        public volatile boolean f13333a = false;

        /* renamed from: b */
        public long f13334b = 50;

        /* renamed from: b */
        public boolean f13335b;

        /* renamed from: c */
        public boolean f13336c;

        /* renamed from: com.xiaomi.push.service.g$c$a */
        public static final class C4665a {

            /* renamed from: a */
            public int f13337a;

            /* renamed from: a */
            public C4666d[] f13338a;

            /* renamed from: b */
            public int f13339b;

            /* renamed from: c */
            public int f13340c;

            public C4665a() {
                this.f13337a = 256;
                this.f13338a = new C4666d[256];
                this.f13339b = 0;
                this.f13340c = 0;
            }

            /* access modifiers changed from: private */
            /* access modifiers changed from: public */
            /* renamed from: a */
            private int mo42735a(C4666d dVar) {
                int i = 0;
                while (true) {
                    C4666d[] dVarArr = this.f13338a;
                    if (i >= dVarArr.length) {
                        return -1;
                    }
                    if (dVarArr[i] == dVar) {
                        return i;
                    }
                    i++;
                }
            }

            /* renamed from: c */
            private void m14117c() {
                int i = this.f13339b - 1;
                int i2 = (i - 1) / 2;
                while (true) {
                    C4666d[] dVarArr = this.f13338a;
                    if (dVarArr[i].f13342a < dVarArr[i2].f13342a) {
                        C4666d dVar = dVarArr[i];
                        dVarArr[i] = dVarArr[i2];
                        dVarArr[i2] = dVar;
                        i2 = (i2 - 1) / 2;
                        i = i2;
                    } else {
                        return;
                    }
                }
            }

            /* renamed from: c */
            private void m14118c(int i) {
                int i2 = (i * 2) + 1;
                while (true) {
                    int i3 = this.f13339b;
                    if (i2 < i3 && i3 > 0) {
                        int i4 = i2 + 1;
                        if (i4 < i3) {
                            C4666d[] dVarArr = this.f13338a;
                            if (dVarArr[i4].f13342a < dVarArr[i2].f13342a) {
                                i2 = i4;
                            }
                        }
                        C4666d[] dVarArr2 = this.f13338a;
                        if (dVarArr2[i].f13342a >= dVarArr2[i2].f13342a) {
                            C4666d dVar = dVarArr2[i];
                            dVarArr2[i] = dVarArr2[i2];
                            dVarArr2[i2] = dVar;
                            i2 = (i2 * 2) + 1;
                            i = i2;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }

            /* renamed from: a */
            public C4666d mo42732a() {
                return this.f13338a[0];
            }

            /* renamed from: a */
            public void m14120a() {
                this.f13338a = new C4666d[this.f13337a];
                this.f13339b = 0;
            }

            /* renamed from: a */
            public void mo42733a(int i) {
                for (int i2 = 0; i2 < this.f13339b; i2++) {
                    C4666d[] dVarArr = this.f13338a;
                    if (dVarArr[i2].f13341a == i) {
                        dVarArr[i2].mo42739a();
                    }
                }
                mo42736b();
            }

            /* renamed from: a */
            public void mo42734a(int i, AbstractRunnableC4663b bVar) {
                for (int i2 = 0; i2 < this.f13339b; i2++) {
                    C4666d[] dVarArr = this.f13338a;
                    if (dVarArr[i2].f13343a == bVar) {
                        dVarArr[i2].mo42739a();
                    }
                }
                mo42736b();
            }

            /* renamed from: a */
            public void m14123a(C4666d dVar) {
                C4666d[] dVarArr = this.f13338a;
                int length = dVarArr.length;
                int i = this.f13339b;
                if (length == i) {
                    C4666d[] dVarArr2 = new C4666d[(i * 2)];
                    System.arraycopy(dVarArr, 0, dVarArr2, 0, i);
                    this.f13338a = dVarArr2;
                }
                C4666d[] dVarArr3 = this.f13338a;
                int i2 = this.f13339b;
                this.f13339b = i2 + 1;
                dVarArr3[i2] = dVar;
                m14117c();
            }

            /* renamed from: a */
            public boolean m14124a() {
                return this.f13339b == 0;
            }

            /* renamed from: a */
            public boolean m14125a(int i) {
                for (int i2 = 0; i2 < this.f13339b; i2++) {
                    if (this.f13338a[i2].f13341a == i) {
                        return true;
                    }
                }
                return false;
            }

            /* renamed from: b */
            public void mo42736b() {
                int i = 0;
                while (i < this.f13339b) {
                    if (this.f13338a[i].f13345a) {
                        this.f13340c++;
                        mo42737b(i);
                        i--;
                    }
                    i++;
                }
            }

            /* renamed from: b */
            public void mo42737b(int i) {
                int i2;
                if (i >= 0 && i < (i2 = this.f13339b)) {
                    C4666d[] dVarArr = this.f13338a;
                    int i3 = i2 - 1;
                    this.f13339b = i3;
                    dVarArr[i] = dVarArr[i3];
                    dVarArr[i3] = null;
                    m14118c(i);
                }
            }
        }

        public C4664c(String str, boolean z) {
            setName(str);
            setDaemon(z);
            start();
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        /* renamed from: a */
        private void m14110a(C4666d dVar) {
            this.f13332a.m14123a(dVar);
            notify();
        }

        /* renamed from: a */
        public synchronized void mo42730a() {
            this.f13335b = true;
            this.f13332a.m14120a();
            notify();
        }

        /* renamed from: a */
        public boolean m14114a() {
            return this.f13333a && SystemClock.uptimeMillis() - this.f13331a > 600000;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
            r10.f13331a = android.os.SystemClock.uptimeMillis();
            r10.f13333a = true;
            r2.f13343a.run();
            r10.f13333a = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00a4, code lost:
            r1 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00a5, code lost:
            monitor-enter(r10);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
            r10.f13335b = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x00a9, code lost:
            throw r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
            // Method dump skipped, instructions count: 184
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4661g.C4664c.run():void");
        }
    }

    /* renamed from: com.xiaomi.push.service.g$d */
    public static class C4666d {

        /* renamed from: a */
        public int f13341a;

        /* renamed from: a */
        public long f13342a;

        /* renamed from: a */
        public AbstractRunnableC4663b f13343a;

        /* renamed from: a */
        public final Object f13344a = new Object();

        /* renamed from: a */
        public boolean f13345a;

        /* renamed from: b */
        public long f13346b;

        /* renamed from: a */
        public void mo42738a(long j) {
            synchronized (this.f13344a) {
                this.f13346b = j;
            }
        }

        /* renamed from: a */
        public boolean mo42739a() {
            boolean z;
            synchronized (this.f13344a) {
                z = !this.f13345a && this.f13342a > 0;
                this.f13345a = true;
            }
            return z;
        }
    }

    static {
        long j = 0;
        if (SystemClock.elapsedRealtime() > 0) {
            j = SystemClock.elapsedRealtime();
        }
        f13324a = j;
        f13325b = j;
    }

    public C4661g() {
        this(false);
    }

    public C4661g(String str) {
        this(str, false);
    }

    public C4661g(String str, boolean z) {
        if (str != null) {
            C4664c cVar = new C4664c(str, z);
            this.f13328a = cVar;
            this.f13327a = new C4662a(cVar);
            return;
        }
        throw new NullPointerException("name == null");
    }

    public C4661g(boolean z) {
        this("Timer-" + mo42728b(), z);
    }

    /* renamed from: a */
    public static synchronized long mo42723a() {
        long j;
        synchronized (C4661g.class) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime > f13325b) {
                f13324a += elapsedRealtime - f13325b;
            }
            f13325b = elapsedRealtime;
            j = f13324a;
        }
        return j;
    }

    /* renamed from: b */
    public static synchronized long mo42728b() {
        long j;
        synchronized (C4661g.class) {
            j = f13326c;
            f13326c = 1 + j;
        }
        return j;
    }

    /* renamed from: b */
    private void m14099b(AbstractRunnableC4663b bVar, long j) {
        synchronized (this.f13328a) {
            if (!this.f13328a.f13335b) {
                long a = j + mo42723a();
                if (a >= 0) {
                    C4666d dVar = new C4666d();
                    dVar.f13341a = bVar.f13330a;
                    dVar.f13343a = bVar;
                    dVar.f13342a = a;
                    this.f13328a.m14110a((C4664c) dVar);
                } else {
                    throw new IllegalArgumentException("Illegal delay to start the TimerTask: " + a);
                }
            } else {
                throw new IllegalStateException("Timer was canceled");
            }
        }
    }

    /* renamed from: a */
    public void m14100a() {
        this.f13328a.mo42730a();
    }

    /* renamed from: a */
    public void mo42724a(int i) {
        synchronized (this.f13328a) {
            this.f13328a.f13332a.mo42733a(i);
        }
    }

    /* renamed from: a */
    public void mo42725a(int i, AbstractRunnableC4663b bVar) {
        synchronized (this.f13328a) {
            this.f13328a.f13332a.mo42734a(i, bVar);
        }
    }

    /* renamed from: a */
    public void mo42726a(AbstractRunnableC4663b bVar) {
        if (AbstractC4163b.m11293a() >= 1 || Thread.currentThread() == this.f13328a) {
            bVar.run();
        } else {
            AbstractC4163b.m11306d("run job outside job job thread");
            throw new RejectedExecutionException("Run job outside job thread");
        }
    }

    /* renamed from: a */
    public void mo42727a(AbstractRunnableC4663b bVar, long j) {
        if (j >= 0) {
            m14099b(bVar, j);
            return;
        }
        throw new IllegalArgumentException("delay < 0: " + j);
    }

    /* renamed from: a */
    public boolean m14105a() {
        return this.f13328a.m14114a();
    }

    /* renamed from: a */
    public boolean m14106a(int i) {
        boolean a;
        synchronized (this.f13328a) {
            a = this.f13328a.f13332a.m14125a(i);
        }
        return a;
    }

    /* renamed from: b */
    public void m14107b() {
        synchronized (this.f13328a) {
            this.f13328a.f13332a.m14120a();
        }
    }
}
