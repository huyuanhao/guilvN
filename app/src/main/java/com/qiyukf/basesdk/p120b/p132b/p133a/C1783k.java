package com.qiyukf.basesdk.p120b.p132b.p133a;

import android.util.SparseArray;
import com.qiyukf.basesdk.p120b.p132b.p135c.C1796f;
import com.qiyukf.basesdk.p120b.p132b.p136d.C1801a;
import com.qiyukf.basesdk.p120b.p132b.p137e.C1804a;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.SelectionKey;

/* renamed from: com.qiyukf.basesdk.b.b.a.k */
public final class C1783k implements AbstractC1765a {

    /* renamed from: a */
    public volatile SelectionKey f3296a;

    /* renamed from: b */
    public C1774g f3297b;

    /* renamed from: c */
    public C1801a f3298c = new C1801a(this);

    /* renamed from: d */
    public C1767c f3299d = new C1767c(this);

    public C1783k(C1796f fVar) {
        this.f3297b = new C1774g(this, fVar);
    }

    @Override // com.qiyukf.basesdk.p120b.p132b.p133a.AbstractC1765a
    /* renamed from: a */
    public final C1767c mo33981a(Object obj) {
        return this.f3297b.mo34011a(obj);
    }

    @Override // com.qiyukf.basesdk.p120b.p132b.p133a.AbstractC1765a
    /* renamed from: a */
    public final C1774g mo33982a() {
        return this.f3297b;
    }

    @Override // com.qiyukf.basesdk.p120b.p132b.p133a.AbstractC1765a
    /* renamed from: a */
    public final void mo33983a(SparseArray<Object> sparseArray) {
        this.f3298c.mo34062a(sparseArray);
        boolean z = false;
        while (true) {
            try {
                this.f3296a = this.f3298c.mo34061a(this.f3297b.mo34018d().mo34044a(), this);
                return;
            } catch (CancelledKeyException e) {
                if (!z) {
                    this.f3297b.mo34018d().mo34048d();
                    z = true;
                } else {
                    throw e;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo34035a(SelectionKey selectionKey) {
        this.f3296a = selectionKey;
    }

    @Override // com.qiyukf.basesdk.p120b.p132b.p133a.AbstractC1765a
    /* renamed from: b */
    public final C1801a mo33984b() {
        return this.f3298c;
    }

    @Override // com.qiyukf.basesdk.p120b.p132b.p133a.AbstractC1765a
    /* renamed from: c */
    public final C1796f mo33985c() {
        return this.f3297b.mo34018d();
    }

    @Override // com.qiyukf.basesdk.p120b.p132b.p133a.AbstractC1765a
    /* renamed from: d */
    public final boolean mo33986d() {
        return this.f3298c.mo34064a();
    }

    @Override // com.qiyukf.basesdk.p120b.p132b.p133a.AbstractC1765a
    /* renamed from: e */
    public final void mo33987e() {
        this.f3297b.mo34017c();
    }

    @Override // com.qiyukf.basesdk.p120b.p132b.p133a.AbstractC1765a
    /* renamed from: f */
    public final SelectionKey mo33988f() {
        return this.f3296a;
    }

    @Override // com.qiyukf.basesdk.p120b.p132b.p133a.AbstractC1765a
    /* renamed from: g */
    public final void mo33989g() {
        if (this.f3298c.mo34069e()) {
            this.f3297b.mo34018d().execute(new Runnable() {
                /* class com.qiyukf.basesdk.p120b.p132b.p133a.C1783k.RunnableC17841 */

                public final void run() {
                    C1783k.this.mo33987e();
                }
            });
        } else if (!this.f3299d.mo33995c()) {
            boolean b = this.f3298c.mo34066b();
            try {
                this.f3298c.mo34067c();
                this.f3299d.mo33993b();
                if (b && !this.f3298c.mo34066b()) {
                    C1804a.m3402a(this.f3297b.mo34018d(), new Runnable() {
                        /* class com.qiyukf.basesdk.p120b.p132b.p133a.C1783k.RunnableC17852 */

                        public final void run() {
                            C1783k.this.f3297b.mo34020f();
                        }
                    });
                }
                this.f3296a.cancel();
            } catch (Throwable th) {
                if (b && !this.f3298c.mo34066b()) {
                    C1804a.m3402a(this.f3297b.mo34018d(), new Runnable() {
                        /* class com.qiyukf.basesdk.p120b.p132b.p133a.C1783k.RunnableC17852 */

                        public final void run() {
                            C1783k.this.f3297b.mo34020f();
                        }
                    });
                }
                this.f3296a.cancel();
                throw th;
            }
        }
    }

    /* renamed from: h */
    public final void mo34036h() {
        boolean z = false;
        int i = 0;
        while (true) {
            try {
                ByteBuffer allocate = ByteBuffer.allocate(1024);
                int a = this.f3298c.mo34060a(allocate);
                if (a > 0) {
                    this.f3297b.mo34015a(allocate);
                    if (a >= 1024) {
                        i++;
                        if (i >= 16) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else if (a < 0) {
                    z = true;
                }
            } catch (Throwable th) {
                this.f3297b.mo34019e();
                this.f3297b.mo34014a(th);
                if (!this.f3298c.mo34064a()) {
                    return;
                }
                if (0 != 0 || (th instanceof IOException)) {
                    this.f3297b.mo34017c();
                    return;
                }
                return;
            }
        }
        this.f3297b.mo34019e();
        if (z && this.f3298c.mo34064a()) {
            this.f3297b.mo34017c();
        }
    }
}
