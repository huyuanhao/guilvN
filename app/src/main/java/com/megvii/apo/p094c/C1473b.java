package com.megvii.apo.p094c;

import android.os.Handler;
import android.os.HandlerThread;
import com.megvii.apo.util.C1495e;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.megvii.apo.c.b */
public final class C1473b {

    /* renamed from: a */
    public CopyOnWriteArrayList<C1476d> f1972a;

    /* renamed from: b */
    public CopyOnWriteArrayList<C1476d> f1973b;

    /* renamed from: c */
    public CopyOnWriteArrayList<C1476d> f1974c;

    /* renamed from: d */
    public long f1975d;

    /* renamed from: e */
    public Handler f1976e;

    /* renamed from: f */
    public Runnable f1977f;

    /* renamed from: g */
    public HandlerThread f1978g;

    /* renamed from: com.megvii.apo.c.b$OooO00o */
    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        public final void run() {
            C1473b bVar = C1473b.this;
            try {
                bVar.f1974c.clear();
                if (bVar.f1972a.size() > 0) {
                    Iterator<C1476d> it = bVar.f1972a.iterator();
                    while (it.hasNext()) {
                        C1476d next = it.next();
                        if (next.f1981b * 60000 <= System.currentTimeMillis() - next.f1980a) {
                            bVar.f1974c.add(next);
                            bVar.f1973b.add(next);
                        }
                    }
                }
                synchronized (bVar.f1972a) {
                    bVar.f1972a.removeAll(bVar.f1974c);
                }
                if (!bVar.f1973b.isEmpty()) {
                    bVar.f1974c.clear();
                    Iterator<C1476d> it2 = bVar.f1973b.iterator();
                    while (it2.hasNext()) {
                        C1476d next2 = it2.next();
                        next2.f1980a = System.currentTimeMillis();
                        next2.f1982c.mo16946a();
                        bVar.f1974c.add(next2);
                        next2.f1980a = System.currentTimeMillis();
                        bVar.f1972a.add(next2);
                    }
                    synchronized (bVar.f1973b) {
                        bVar.f1973b.removeAll(bVar.f1974c);
                    }
                }
            } catch (Throwable th) {
                C1495e.m2258a(th);
            }
            C1473b bVar2 = C1473b.this;
            long j = bVar2.f1975d;
            if (j > 0) {
                bVar2.f1976e.postDelayed(this, j * 60000);
            }
        }
    }

    /* renamed from: com.megvii.apo.c.b$a */
    public static final class C1474a {

        /* renamed from: a */
        public static final C1473b f1979a = new C1473b((byte) 0);
    }

    public /* synthetic */ C1473b(byte b) {
        this();
    }

    /* renamed from: a */
    public final C1473b mo16955a(C1476d dVar) {
        try {
            this.f1973b.add(dVar);
        } catch (Throwable th) {
            C1495e.m2258a(th);
        }
        return this;
    }

    public C1473b() {
        this.f1977f = new OooO00o();
        try {
            this.f1972a = new CopyOnWriteArrayList<>();
            this.f1973b = new CopyOnWriteArrayList<>();
            this.f1974c = new CopyOnWriteArrayList<>();
            HandlerThread handlerThread = new HandlerThread("di");
            this.f1978g = handlerThread;
            handlerThread.start();
            this.f1976e = new Handler(this.f1978g.getLooper());
        } catch (Throwable th) {
            C1495e.m2258a(th);
        }
    }
}
