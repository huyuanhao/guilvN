package com.megvii.meglive_sdk.p097c;

import java.io.PrintStream;
import java.util.ArrayList;

/* renamed from: com.megvii.meglive_sdk.c.c */
public final class C1520c {

    /* renamed from: a */
    public int f2147a;

    /* renamed from: b */
    public final ArrayList<OooO00o> f2148b;

    /* renamed from: c */
    public final ArrayList<Runnable> f2149c;

    /* renamed from: d */
    public int f2150d;

    /* renamed from: e */
    public int f2151e;

    /* renamed from: f */
    public int f2152f;

    /* renamed from: g */
    public int f2153g;

    /* renamed from: h */
    public int f2154h;

    public C1520c() {
        this(2, 2);
    }

    /* renamed from: a */
    public static /* synthetic */ int m2300a(C1520c cVar) {
        int i = cVar.f2147a - 1;
        cVar.f2147a = i;
        return i;
    }

    /* renamed from: b */
    public final synchronized boolean mo16998b(OooO00o oooO00o) {
        this.f2148b.remove(oooO00o);
        if (this.f2148b.size() >= this.f2151e) {
            return true;
        }
        this.f2148b.add(oooO00o);
        m2301a();
        return false;
    }

    public C1520c(int i, int i2) {
        this.f2153g = 5;
        this.f2150d = 0;
        this.f2151e = i;
        this.f2152f = i2;
        this.f2153g = 5;
        this.f2148b = new ArrayList<>();
        this.f2149c = new ArrayList<>();
    }

    /* renamed from: a */
    public final synchronized void mo16996a(Runnable runnable) {
        OooO00o oooO00o = null;
        if (!this.f2148b.isEmpty()) {
            oooO00o = this.f2148b.get(0);
            this.f2148b.remove(oooO00o);
        } else if (this.f2147a < this.f2152f) {
            this.f2154h++;
            oooO00o = new OooO00o();
            oooO00o.setPriority(this.f2153g);
            oooO00o.start();
            this.f2147a++;
        } else if (!this.f2149c.contains(runnable)) {
            this.f2149c.add(runnable);
        }
        if (oooO00o != null) {
            oooO00o.OooO00o((OooO00o) runnable);
        }
    }

    /* renamed from: com.megvii.meglive_sdk.c.c$OooO00o */
    public class OooO00o extends Thread {

        /* renamed from: OooO00o  reason: collision with other field name */
        public Runnable f15079OooO00o;

        public OooO00o() {
        }

        public final void run() {
            while (true) {
                synchronized (this) {
                    if (this.f15079OooO00o == null) {
                        try {
                            wait(30000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                if (this.f15079OooO00o == null) {
                    if (C1520c.this.mo16997a(this)) {
                        C1520c.m2300a(C1520c.this);
                        PrintStream printStream = System.out;
                        printStream.println("Thread died timeout:" + C1520c.this.f2147a);
                        return;
                    } else if (this.f15079OooO00o == null) {
                        continue;
                    }
                }
                try {
                    this.f15079OooO00o.run();
                    this.f15079OooO00o = null;
                    if (C1520c.this.mo16998b(this)) {
                        C1520c.m2300a(C1520c.this);
                        PrintStream printStream2 = System.out;
                        printStream2.println("Thread died free: " + C1520c.this.f2147a);
                        return;
                    }
                } catch (Throwable th) {
                    this.f15079OooO00o = null;
                    if (C1520c.this.mo16998b(this)) {
                        C1520c.m2300a(C1520c.this);
                        PrintStream printStream3 = System.out;
                        printStream3.println("Thread died free: " + C1520c.this.f2147a);
                        return;
                    }
                    throw th;
                }
            }
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private synchronized void OooO00o(Runnable runnable) {
            this.f15079OooO00o = runnable;
            notify();
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo16997a(OooO00o oooO00o) {
        if (oooO00o.f15079OooO00o != null) {
            return false;
        }
        if (this.f2148b.size() > this.f2150d) {
            if (this.f2149c.size() == 0) {
                this.f2148b.remove(oooO00o);
                return true;
            }
            Runnable runnable = this.f2149c.get(0);
            this.f2149c.remove(runnable);
            oooO00o.f15079OooO00o = runnable;
        }
        return false;
    }

    /* renamed from: a */
    private synchronized void m2301a() {
        if (this.f2148b.size() > 0 && this.f2149c.size() > 0) {
            OooO00o oooO00o = this.f2148b.get(0);
            this.f2148b.remove(oooO00o);
            Runnable runnable = this.f2149c.get(0);
            this.f2149c.remove(runnable);
            oooO00o.OooO00o((OooO00o) runnable);
        }
    }
}
