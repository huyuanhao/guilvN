package com.qiyukf.basesdk.p120b.p121a.p122a;

import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.ExecutorC1854d;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.qiyukf.basesdk.b.a.a.f */
public class C1732f {

    /* renamed from: e */
    public static C1732f f3145e;

    /* renamed from: a */
    public final Object f3146a = new Object();

    /* renamed from: b */
    public Map<String, List<C1730d>> f3147b = new HashMap();

    /* renamed from: c */
    public Map<String, C1734g> f3148c = new HashMap();

    /* renamed from: d */
    public ExecutorC1854d f3149d = new ExecutorC1854d("HttpDownloadManager", ExecutorC1854d.f3414b, true);

    /* renamed from: com.qiyukf.basesdk.b.a.a.f$a */
    public class RunnableC1733a implements Runnable {

        /* renamed from: b */
        public String f3151b;

        /* renamed from: c */
        public String f3152c;

        /* renamed from: d */
        public long f3153d;

        /* renamed from: e */
        public AbstractC1718a f3154e;

        public RunnableC1733a(String str, String str2, long j, AbstractC1718a aVar) {
            this.f3151b = str;
            this.f3152c = str2;
            this.f3153d = j;
            this.f3154e = aVar;
        }

        public final void run() {
            try {
                C1732f.m3105a(C1732f.this, this.f3151b, this.f3152c, this.f3153d, this.f3154e);
            } catch (Throwable th) {
                C1709a.m3011a("RES", "Download exception: " + th);
            }
        }
    }

    /* renamed from: a */
    public static C1732f m3104a() {
        if (f3145e == null) {
            synchronized (C1732f.class) {
                if (f3145e == null) {
                    f3145e = new C1732f();
                }
            }
        }
        return f3145e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        r1.f3155a.mo33887a(new com.qiyukf.basesdk.p120b.p121a.p122a.C1726c.C1727a.C1728a(r4, r5).mo33890a(r8).mo33889a(r6).mo33891a());
        r5 = r3.f3146a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003b, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r3.f3148c.get(r4) != r1) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        r3.f3148c.remove(r4);
        r3.f3147b.remove(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004e, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        m3106a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void m3105a(com.qiyukf.basesdk.p120b.p121a.p122a.C1732f r3, java.lang.String r4, java.lang.String r5, long r6, com.qiyukf.basesdk.p120b.p121a.p122a.AbstractC1718a r8) {
        /*
            java.lang.Object r0 = r3.f3146a
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.util.List<com.qiyukf.basesdk.b.a.a.d>> r1 = r3.f3147b     // Catch:{ all -> 0x0058 }
            boolean r1 = r1.containsKey(r4)     // Catch:{ all -> 0x0058 }
            if (r1 == 0) goto L_0x0056
            java.util.Map<java.lang.String, com.qiyukf.basesdk.b.a.a.g> r1 = r3.f3148c     // Catch:{ all -> 0x0058 }
            boolean r1 = r1.containsKey(r4)     // Catch:{ all -> 0x0058 }
            if (r1 == 0) goto L_0x0014
            goto L_0x0056
        L_0x0014:
            com.qiyukf.basesdk.b.a.a.g r1 = new com.qiyukf.basesdk.b.a.a.g     // Catch:{ all -> 0x0058 }
            com.qiyukf.basesdk.b.a.a.c r2 = com.qiyukf.basesdk.p120b.p121a.p122a.C1726c.m3080a()     // Catch:{ all -> 0x0058 }
            r1.<init>(r2)     // Catch:{ all -> 0x0058 }
            java.util.Map<java.lang.String, com.qiyukf.basesdk.b.a.a.g> r2 = r3.f3148c     // Catch:{ all -> 0x0058 }
            r2.put(r4, r1)     // Catch:{ all -> 0x0058 }
            monitor-exit(r0)     // Catch:{ all -> 0x0058 }
            com.qiyukf.basesdk.b.a.a.c$a$a r0 = new com.qiyukf.basesdk.b.a.a.c$a$a
            r0.<init>(r4, r5)
            com.qiyukf.basesdk.b.a.a.c$a$a r5 = r0.mo33890a(r8)
            com.qiyukf.basesdk.b.a.a.c$a$a r5 = r5.mo33889a(r6)
            com.qiyukf.basesdk.b.a.a.c$a r5 = r5.mo33891a()
            com.qiyukf.basesdk.b.a.a.c r6 = r1.f3155a
            r6.mo33887a(r5)
            java.lang.Object r5 = r3.f3146a
            monitor-enter(r5)
            java.util.Map<java.lang.String, com.qiyukf.basesdk.b.a.a.g> r6 = r3.f3148c     // Catch:{ all -> 0x0053 }
            java.lang.Object r6 = r6.get(r4)     // Catch:{ all -> 0x0053 }
            if (r6 != r1) goto L_0x004e
            java.util.Map<java.lang.String, com.qiyukf.basesdk.b.a.a.g> r6 = r3.f3148c     // Catch:{ all -> 0x0053 }
            r6.remove(r4)     // Catch:{ all -> 0x0053 }
            java.util.Map<java.lang.String, java.util.List<com.qiyukf.basesdk.b.a.a.d>> r3 = r3.f3147b     // Catch:{ all -> 0x0053 }
            r3.remove(r4)     // Catch:{ all -> 0x0053 }
        L_0x004e:
            monitor-exit(r5)     // Catch:{ all -> 0x0053 }
            m3106a(r1)
            return
        L_0x0053:
            r3 = move-exception
            monitor-exit(r5)
            throw r3
        L_0x0056:
            monitor-exit(r0)
            return
        L_0x0058:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.basesdk.p120b.p121a.p122a.C1732f.m3105a(com.qiyukf.basesdk.b.a.a.f, java.lang.String, java.lang.String, long, com.qiyukf.basesdk.b.a.a.a):void");
    }

    /* renamed from: a */
    public static void m3106a(C1734g gVar) {
        synchronized (gVar) {
            gVar.notifyAll();
        }
    }

    /* renamed from: c */
    private void m3107c(String str) {
        this.f3147b.remove(str);
        C1734g gVar = this.f3148c.get(str);
        if (gVar != null) {
            gVar.f3155a.mo33888b();
            this.f3148c.remove(str);
            m3106a(gVar);
        }
    }

    /* renamed from: a */
    public final List<C1730d> mo33904a(String str) {
        List<C1730d> list;
        synchronized (this.f3146a) {
            list = this.f3147b.get(str);
        }
        return list;
    }

    /* renamed from: a */
    public final void mo33905a(C1730d dVar) {
        C1734g gVar;
        String a = dVar.mo33892a();
        synchronized (this.f3146a) {
            List<C1730d> list = this.f3147b.get(a);
            if (list == null) {
                list = new LinkedList<>();
                this.f3147b.put(a, list);
            }
            if (!list.contains(dVar)) {
                list.add(dVar);
            }
            gVar = this.f3148c.get(a);
        }
        if (gVar == null) {
            String c = dVar.mo33894c();
            this.f3149d.execute(new RunnableC1733a(a, c, dVar.mo33895d(), new C1719b(a, c)));
        }
    }

    /* renamed from: b */
    public final C1734g mo33906b(String str) {
        C1734g gVar;
        synchronized (this.f3146a) {
            gVar = this.f3148c.get(str);
        }
        return gVar;
    }

    /* renamed from: b */
    public final void mo33907b() {
        synchronized (this.f3146a) {
            Object[] array = this.f3147b.keySet().toArray();
            for (Object obj : array) {
                List<C1730d> list = this.f3147b.get(obj);
                if (list != null) {
                    for (C1730d dVar : list) {
                        dVar.mo33896e();
                    }
                }
                m3107c((String) obj);
            }
        }
    }

    /* renamed from: b */
    public final void mo33908b(C1730d dVar) {
        synchronized (this.f3146a) {
            String a = dVar.mo33892a();
            List<C1730d> list = this.f3147b.get(a);
            if (list != null) {
                dVar.mo33896e();
                list.remove(dVar);
                if (list.size() == 0) {
                    m3107c(a);
                }
            }
        }
    }
}
