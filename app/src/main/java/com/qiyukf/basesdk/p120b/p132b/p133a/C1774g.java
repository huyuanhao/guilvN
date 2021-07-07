package com.qiyukf.basesdk.p120b.p132b.p133a;

import android.os.SystemClock;
import android.util.SparseArray;
import com.qiyukf.basesdk.p120b.p132b.p135c.AbstractC1793c;
import com.qiyukf.basesdk.p120b.p132b.p135c.AbstractC1794d;
import com.qiyukf.basesdk.p120b.p132b.p135c.AbstractC1798g;
import com.qiyukf.basesdk.p120b.p132b.p135c.C1796f;
import com.qiyukf.basesdk.p120b.p132b.p137e.C1804a;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;

/* renamed from: com.qiyukf.basesdk.b.b.a.g */
public final class C1774g {

    /* renamed from: a */
    public AbstractC1765a f3272a;

    /* renamed from: b */
    public C1782j f3273b = new C1782j(this);

    /* renamed from: c */
    public C1786l f3274c;

    /* renamed from: d */
    public C1796f f3275d;

    /* renamed from: e */
    public C1767c f3276e;

    /* renamed from: f */
    public AbstractRunnableC1781i f3277f;

    /* renamed from: com.qiyukf.basesdk.b.b.a.g$a */
    public class RunnableC1779a implements Runnable {

        /* renamed from: b */
        public AbstractC1771d f3290b;

        /* renamed from: c */
        public Object f3291c;

        /* renamed from: d */
        public C1767c f3292d;

        public RunnableC1779a(AbstractC1771d dVar, Object obj, C1767c cVar) {
            this.f3290b = dVar;
            this.f3291c = obj;
            this.f3292d = cVar;
        }

        public final void run() {
            try {
                AbstractC1771d dVar = this.f3290b;
                Object obj = this.f3291c;
                C1767c cVar = this.f3292d;
                if (!C1774g.this.f3272a.mo33984b().mo34066b()) {
                    cVar.mo33992a(C1804a.m3401a(C1774g.this.f3272a));
                } else {
                    AbstractC1798g e = dVar.mo34005e();
                    if (e != null) {
                        e.mo34032a(obj, cVar);
                    }
                }
            } finally {
                this.f3290b = null;
                this.f3291c = null;
                this.f3292d = null;
            }
        }
    }

    public C1774g(AbstractC1765a aVar, C1796f fVar) {
        this.f3272a = aVar;
        this.f3275d = fVar;
        C1786l lVar = new C1786l(this);
        this.f3274c = lVar;
        this.f3273b.f3269c = lVar;
        this.f3274c.f3268b = this.f3273b;
    }

    /* renamed from: a */
    public static /* synthetic */ void m3283a(C1774g gVar, SparseArray sparseArray, AbstractC1772e eVar) {
        gVar.f3272a.mo33983a((SparseArray<Object>) sparseArray);
        eVar.mo34008a(gVar);
    }

    /* renamed from: a */
    public static /* synthetic */ void m3285a(C1774g gVar, SocketAddress socketAddress, C1767c cVar, long j) {
        AbstractC1771d c = gVar.f3274c.mo34003c();
        if (c != null) {
            try {
                if (((AbstractC1798g) c.mo34007g()).mo34034a(socketAddress)) {
                    gVar.m3290g();
                    cVar.mo33993b();
                    return;
                }
                gVar.f3276e = cVar;
                if (gVar.f3277f != null) {
                    gVar.f3277f.mo34027b();
                }
                C17773 r3 = new AbstractRunnableC1781i(SystemClock.elapsedRealtime() + j) {
                    /* class com.qiyukf.basesdk.p120b.p132b.p133a.C1774g.C17773 */

                    public final void run() {
                        if (!mo34028c()) {
                            C1774g.this.m3287b((C1774g) new ConnectException("connect timeout"));
                        }
                    }
                };
                gVar.f3277f = r3;
                gVar.f3275d.mo34050a((AbstractRunnableC1781i) r3);
            } catch (Exception e) {
                cVar.mo33992a(e);
            }
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private void m3287b(Throwable th) {
        C1767c cVar = this.f3276e;
        this.f3276e = null;
        if (cVar == null) {
            return;
        }
        if (th != null) {
            cVar.mo33992a(th);
        } else {
            cVar.mo33993b();
        }
    }

    /* renamed from: g */
    private void m3290g() {
        try {
            SelectionKey f = this.f3272a.mo33988f();
            if (f.isValid()) {
                int interestOps = f.interestOps();
                if ((interestOps & 1) == 0) {
                    f.interestOps(interestOps | 1);
                }
            }
        } catch (Exception e) {
            this.f3275d.execute(new Runnable() {
                /* class com.qiyukf.basesdk.p120b.p132b.p133a.C1774g.RunnableC17784 */

                public final void run() {
                    C1774g.this.f3273b.mo34033a(e);
                }
            });
            this.f3272a.mo33987e();
        }
    }

    /* renamed from: a */
    public final AbstractC1765a mo34010a() {
        return this.f3272a;
    }

    /* renamed from: a */
    public final C1767c mo34011a(Object obj) {
        C1767c cVar = new C1767c(this.f3272a);
        C1804a.m3402a(this.f3275d, new RunnableC1779a(this.f3274c, obj, cVar));
        return cVar;
    }

    /* renamed from: a */
    public final C1767c mo34012a(final String str, final int i, final SparseArray<Object> sparseArray, final AbstractC1772e eVar, final long j) {
        final C1767c cVar = new C1767c(this.f3272a);
        this.f3275d.execute(new Runnable() {
            /* class com.qiyukf.basesdk.p120b.p132b.p133a.C1774g.RunnableC17751 */

            public final void run() {
                if (C1774g.this.f3276e != null) {
                    cVar.mo33992a(new C1766b("Already in connection progress"));
                }
                try {
                    C1774g.m3283a(C1774g.this, sparseArray, eVar);
                } catch (Throwable th) {
                    C1774g.this.f3272a.mo33987e();
                    cVar.mo33992a(th);
                }
                C1774g.m3285a(C1774g.this, new InetSocketAddress(str, i), cVar, j);
            }
        });
        return cVar;
    }

    /* renamed from: a */
    public final void mo34013a(AbstractC1793c cVar) {
        C1780h hVar = new C1780h(this, cVar);
        cVar.mo34031a(hVar);
        hVar.f3269c = this.f3274c;
        hVar.f3268b = this.f3274c.f3268b;
        this.f3274c.f3268b.f3269c = hVar;
        this.f3274c.f3268b = hVar;
    }

    /* renamed from: a */
    public final void mo34014a(Throwable th) {
        this.f3273b.mo34033a(th);
    }

    /* renamed from: a */
    public final void mo34015a(ByteBuffer byteBuffer) {
        AbstractC1771d b = this.f3273b.mo34002b();
        if (b != null) {
            ((AbstractC1794d) b.mo34007g()).mo34039a(byteBuffer);
        }
    }

    /* renamed from: b */
    public final void mo34016b() {
        try {
            this.f3272a.mo33984b().mo34070f();
            m3287b((Throwable) null);
            if (this.f3272a.mo33984b().mo34066b()) {
                m3290g();
            }
            AbstractRunnableC1781i iVar = this.f3277f;
            if (iVar != null) {
                iVar.mo34027b();
                this.f3277f = null;
            }
            this.f3276e = null;
        } catch (Throwable th) {
            AbstractRunnableC1781i iVar2 = this.f3277f;
            if (iVar2 != null) {
                iVar2.mo34027b();
                this.f3277f = null;
            }
            this.f3276e = null;
            throw th;
        }
    }

    /* renamed from: c */
    public final void mo34017c() {
        if (this.f3275d.mo34055h()) {
            this.f3274c.mo34005e().mo34030a(new C1767c(this.f3272a));
        } else {
            C1804a.m3402a(this.f3275d, new Runnable() {
                /* class com.qiyukf.basesdk.p120b.p132b.p133a.C1774g.RunnableC17762 */

                public final void run() {
                    C1774g.this.f3274c.mo34005e().mo34030a(new C1767c(C1774g.this.f3272a));
                }
            });
        }
    }

    /* renamed from: d */
    public final C1796f mo34018d() {
        return this.f3275d;
    }

    /* renamed from: e */
    public final void mo34019e() {
        AbstractC1771d b = this.f3273b.mo34002b();
        if (b != null) {
            ((AbstractC1794d) b.mo34007g()).mo34041i();
        }
    }

    /* renamed from: f */
    public final void mo34020f() {
        AbstractC1771d b = this.f3273b.mo34002b();
        if (b != null) {
            ((AbstractC1794d) b.mo34007g()).mo34040h();
        }
        AbstractRunnableC1781i iVar = this.f3277f;
        if (iVar != null) {
            iVar.mo34027b();
            this.f3277f = null;
        }
    }
}
