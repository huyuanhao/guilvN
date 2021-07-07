package com.qiyukf.basesdk.p120b.p121a.p123b;

import android.text.TextUtils;
import com.qiyukf.basesdk.C1708a;
import com.qiyukf.basesdk.p120b.p121a.p123b.p126c.AbstractC1745b;
import com.qiyukf.basesdk.p120b.p121a.p123b.p126c.C1744a;
import com.qiyukf.basesdk.p120b.p121a.p123b.p126c.C1747d;
import com.qiyukf.basesdk.p120b.p121a.p123b.p126c.C1749f;
import com.qiyukf.basesdk.p120b.p121a.p123b.p127d.C1750a;
import com.qiyukf.basesdk.p120b.p121a.p123b.p128e.C1753b;
import com.qiyukf.basesdk.p120b.p121a.p123b.p129f.C1755a;
import com.qiyukf.basesdk.p120b.p121a.p123b.p129f.RunnableC1756b;
import com.qiyukf.basesdk.p138c.p142c.C1853d;
import java.io.File;
import java.net.URLDecoder;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.qiyukf.basesdk.b.a.b.a */
public final class C1735a {

    /* renamed from: e */
    public static C1750a f3157e;

    /* renamed from: a */
    public C1740b f3158a;

    /* renamed from: b */
    public List<C1747d> f3159b;

    /* renamed from: c */
    public AtomicBoolean f3160c;

    /* renamed from: d */
    public Set<RunnableC1738c> f3161d;

    /* renamed from: com.qiyukf.basesdk.b.a.b.a$a */
    public class C1736a implements AbstractC1745b {

        /* renamed from: b */
        public String f3163b;

        /* renamed from: c */
        public AbstractC1743c f3164c;

        /* renamed from: d */
        public C1747d f3165d;

        public C1736a(String str, C1747d dVar, AbstractC1743c cVar) {
            this.f3163b = str;
            this.f3165d = dVar;
            this.f3164c = cVar;
        }

        @Override // com.qiyukf.basesdk.p120b.p121a.p123b.p126c.AbstractC1745b
        /* renamed from: a */
        public final void mo33915a() {
            C1740b.m3151c(this.f3163b);
            C1740b.m3153e(this.f3163b);
            AbstractC1743c cVar = this.f3164c;
            if (cVar != null) {
                C1747d dVar = this.f3165d;
                String decode = URLDecoder.decode(dVar.mo33938c());
                String decode2 = URLDecoder.decode(dVar.mo33936b());
                cVar.mo33928a("https://" + decode2 + ".nosdn.127.net/" + decode);
            }
        }

        @Override // com.qiyukf.basesdk.p120b.p121a.p123b.p126c.AbstractC1745b
        /* renamed from: a */
        public final void mo33916a(long j, long j2) {
            AbstractC1743c cVar = this.f3164c;
            if (cVar != null) {
                cVar.mo33927a(j, j2);
            }
        }

        @Override // com.qiyukf.basesdk.p120b.p121a.p123b.p126c.AbstractC1745b
        /* renamed from: a */
        public final void mo33917a(C1744a aVar) {
            AbstractC1743c cVar = this.f3164c;
            if (cVar != null) {
                cVar.mo33926a(aVar.mo33929a());
            }
            if (aVar.mo33929a() == 403) {
                C1737b.f3166a.mo33914d();
                C1740b.m3151c(this.f3163b);
                C1740b.m3153e(this.f3163b);
                return;
            }
            C1753b.m3220c(C1708a.m3001a());
        }

        @Override // com.qiyukf.basesdk.p120b.p121a.p123b.p126c.AbstractC1745b
        /* renamed from: a */
        public final void mo33918a(String str) {
            C1740b.m3148a(this.f3163b, str);
            C1740b.m3147a(this.f3163b, this.f3165d);
        }

        @Override // com.qiyukf.basesdk.p120b.p121a.p123b.p126c.AbstractC1745b
        /* renamed from: b */
        public final void mo33919b() {
            AbstractC1743c cVar = this.f3164c;
            if (cVar != null) {
                cVar.mo33925a();
            }
        }
    }

    /* renamed from: com.qiyukf.basesdk.b.a.b.a$b */
    public static class C1737b {

        /* renamed from: a */
        public static C1735a f3166a = new C1735a((byte) 0);
    }

    /* renamed from: com.qiyukf.basesdk.b.a.b.a$c */
    public class RunnableC1738c implements Runnable {

        /* renamed from: b */
        public String f3168b;

        /* renamed from: c */
        public String f3169c;

        /* renamed from: d */
        public Object f3170d;

        /* renamed from: e */
        public AbstractC1743c f3171e;

        /* renamed from: f */
        public RunnableC1756b f3172f;

        /* renamed from: g */
        public C1747d f3173g;

        public RunnableC1738c(String str, String str2, Object obj, AbstractC1743c cVar) {
            this.f3168b = str;
            this.f3169c = str2;
            this.f3170d = obj;
            this.f3171e = cVar;
        }

        /* renamed from: a */
        public final void mo33920a() {
            RunnableC1756b bVar = this.f3172f;
            if (bVar != null) {
                bVar.mo33969a();
            }
        }

        public final void run() {
            C1747d d;
            String b = C1740b.m3150b(this.f3168b);
            if (!TextUtils.isEmpty(b) && (d = C1740b.m3152d(this.f3168b)) != null) {
                this.f3173g = d;
            }
            C1749f fVar = new C1749f(this.f3173g.mo33933a(), this.f3173g.mo33936b(), this.f3173g.mo33938c(), this.f3169c);
            fVar.mo33959b(C1853d.m3520c(this.f3168b));
            try {
                this.f3172f = C1755a.m3227a(C1708a.m3001a(), new File(this.f3168b), this.f3170d, b, fVar, new C1736a(this.f3168b, this.f3173g, this.f3171e));
            } catch (Exception e) {
                AbstractC1743c cVar = this.f3171e;
                if (cVar != null) {
                    new StringBuilder("exception: ").append(e.getMessage());
                    cVar.mo33926a(1000);
                }
            }
        }
    }

    public C1735a() {
        this.f3160c = new AtomicBoolean(false);
        this.f3158a = new C1740b();
        this.f3159b = C1747d.m3171d(C1740b.m3145a());
        m3116f();
        this.f3161d = new HashSet();
    }

    public /* synthetic */ C1735a(byte b) {
        this();
    }

    /* renamed from: a */
    public static final C1735a m3113a() {
        return C1737b.f3166a;
    }

    /* renamed from: c */
    public static C1750a m3114c() {
        if (f3157e == null) {
            f3157e = new C1750a();
        }
        return f3157e;
    }

    /* renamed from: e */
    private void m3115e() {
        C1740b.m3146a(C1747d.m3169a(this.f3159b));
    }

    /* renamed from: f */
    private void m3116f() {
        if (this.f3159b.size() <= 10) {
            m3118h();
        }
    }

    /* renamed from: g */
    private C1747d m3117g() {
        m3116f();
        synchronized (this.f3159b) {
            if (this.f3159b.size() <= 0) {
                return null;
            }
            C1747d remove = this.f3159b.remove(this.f3159b.size() - 1);
            m3115e();
            return remove;
        }
    }

    /* renamed from: h */
    private void m3118h() {
        if (this.f3160c.compareAndSet(false, true)) {
            C1708a.m3008g();
        }
    }

    /* renamed from: a */
    public final RunnableC1738c mo33910a(String str, String str2, Object obj, AbstractC1743c cVar) {
        RunnableC1738c cVar2 = new RunnableC1738c(str, str2, obj, cVar);
        C1747d g = m3117g();
        if (g == null) {
            synchronized (this.f3161d) {
                this.f3161d.add(cVar2);
            }
        } else {
            cVar2.f3173g = g;
            cVar2.run();
        }
        return cVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        if ((r3 instanceof com.qiyukf.basesdk.p120b.p121a.p123b.C1735a.RunnableC1738c) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0017, code lost:
        ((com.qiyukf.basesdk.p120b.p121a.p123b.C1735a.RunnableC1738c) r3).mo33920a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo33911a(java.lang.Runnable r3) {
        /*
            r2 = this;
            java.util.Set<com.qiyukf.basesdk.b.a.b.a$c> r0 = r2.f3161d
            monitor-enter(r0)
            java.util.Set<com.qiyukf.basesdk.b.a.b.a$c> r1 = r2.f3161d     // Catch:{ all -> 0x001d }
            boolean r1 = r1.contains(r3)     // Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x0012
            java.util.Set<com.qiyukf.basesdk.b.a.b.a$c> r1 = r2.f3161d     // Catch:{ all -> 0x001d }
            r1.remove(r3)     // Catch:{ all -> 0x001d }
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            return
        L_0x0012:
            monitor-exit(r0)     // Catch:{ all -> 0x001d }
            boolean r0 = r3 instanceof com.qiyukf.basesdk.p120b.p121a.p123b.C1735a.RunnableC1738c
            if (r0 == 0) goto L_0x001c
            com.qiyukf.basesdk.b.a.b.a$c r3 = (com.qiyukf.basesdk.p120b.p121a.p123b.C1735a.RunnableC1738c) r3
            r3.mo33920a()
        L_0x001c:
            return
        L_0x001d:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.basesdk.p120b.p121a.p123b.C1735a.mo33911a(java.lang.Runnable):void");
    }

    /* renamed from: a */
    public final void mo33912a(List<C1747d> list) {
        this.f3160c.set(false);
        if (list.size() != 0) {
            synchronized (this.f3159b) {
                this.f3159b.addAll(list);
                m3115e();
            }
            synchronized (this.f3161d) {
                while (true) {
                    if (this.f3161d.size() <= 0) {
                        break;
                    }
                    Iterator<RunnableC1738c> it = this.f3161d.iterator();
                    RunnableC1738c next = it.next();
                    next.f3173g = m3117g();
                    if (next.f3173g == null) {
                        m3118h();
                        break;
                    } else {
                        next.run();
                        it.remove();
                    }
                }
            }
        } else if (this.f3159b.size() == 0 && this.f3161d.size() > 0) {
            synchronized (this.f3161d) {
                for (RunnableC1738c cVar : this.f3161d) {
                    if (cVar.f3171e != null) {
                        cVar.f3171e.mo33926a(408);
                    }
                }
                this.f3161d.clear();
            }
        }
    }

    /* renamed from: b */
    public final void mo33913b() {
        synchronized (this.f3161d) {
            this.f3161d.clear();
        }
        this.f3160c.set(false);
        C1755a.m3228a();
    }

    /* renamed from: d */
    public final void mo33914d() {
        synchronized (this.f3159b) {
            this.f3159b.clear();
        }
        m3118h();
    }
}
