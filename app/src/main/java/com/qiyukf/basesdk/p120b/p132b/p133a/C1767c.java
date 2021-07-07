package com.qiyukf.basesdk.p120b.p132b.p133a;

import com.qiyukf.basesdk.p120b.p132b.p135c.C1796f;
import com.qiyukf.basesdk.p120b.p132b.p137e.C1804a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.qiyukf.basesdk.b.b.a.c */
public final class C1767c {

    /* renamed from: a */
    public static final C1770a f3256a = new C1770a("SUCCESS");

    /* renamed from: b */
    public static final C1770a f3257b = new C1770a("CANCELED");

    /* renamed from: c */
    public List<AbstractC1773f> f3258c;

    /* renamed from: d */
    public C1796f f3259d;

    /* renamed from: e */
    public AbstractC1765a f3260e;

    /* renamed from: f */
    public Object f3261f;

    /* renamed from: g */
    public Throwable f3262g;

    /* renamed from: com.qiyukf.basesdk.b.b.a.c$a */
    public static final class C1770a {

        /* renamed from: a */
        public String f3266a;

        public C1770a(String str) {
            this.f3266a = str;
        }

        public final String toString() {
            return "ChannelFutureResult " + this.f3266a;
        }
    }

    public C1767c(AbstractC1765a aVar) {
        this.f3260e = aVar;
        this.f3259d = aVar.mo33982a().mo34018d();
    }

    /* renamed from: f */
    private void m3263f() {
        if (this.f3259d.mo34055h()) {
            m3264g();
        } else {
            C1804a.m3402a(this.f3259d, new Runnable() {
                /* class com.qiyukf.basesdk.p120b.p132b.p133a.C1767c.RunnableC17681 */

                public final void run() {
                    C1767c.this.m3264g();
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: g */
    private void m3264g() {
        List<AbstractC1773f> list = this.f3258c;
        if (list != null) {
            for (AbstractC1773f fVar : list) {
                fVar.mo34009a(this);
            }
        }
    }

    /* renamed from: a */
    public final AbstractC1765a mo33990a() {
        return this.f3260e;
    }

    /* renamed from: a */
    public final void mo33991a(final AbstractC1773f fVar) {
        if (this.f3258c == null) {
            this.f3258c = new ArrayList();
        }
        if (!this.f3258c.contains(fVar)) {
            this.f3258c.add(fVar);
            if (!mo33995c()) {
                return;
            }
            if (this.f3259d.mo34055h()) {
                fVar.mo34009a(this);
            } else {
                C1804a.m3402a(this.f3259d, new Runnable() {
                    /* class com.qiyukf.basesdk.p120b.p132b.p133a.C1767c.RunnableC17692 */

                    public final void run() {
                        fVar.mo34009a(C1767c.this);
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public final void mo33992a(Throwable th) {
        this.f3262g = th;
        m3263f();
    }

    /* renamed from: b */
    public final void mo33993b() {
        this.f3261f = f3256a;
        this.f3262g = null;
        m3263f();
    }

    /* renamed from: b */
    public final void mo33994b(AbstractC1773f fVar) {
        List<AbstractC1773f> list = this.f3258c;
        if (list != null) {
            list.remove(fVar);
        }
    }

    /* renamed from: c */
    public final boolean mo33995c() {
        return (this.f3261f == null && this.f3262g == null) ? false : true;
    }

    /* renamed from: d */
    public final boolean mo33996d() {
        return this.f3262g == null && this.f3261f != f3257b;
    }

    /* renamed from: e */
    public final boolean mo33997e() {
        if (mo33995c()) {
            return false;
        }
        synchronized (this) {
            if (mo33995c()) {
                return false;
            }
            this.f3261f = f3257b;
            m3263f();
            return true;
        }
    }
}
