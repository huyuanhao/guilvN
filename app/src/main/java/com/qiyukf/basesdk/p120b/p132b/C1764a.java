package com.qiyukf.basesdk.p120b.p132b;

import android.util.SparseArray;
import com.qiyukf.basesdk.p120b.p132b.p133a.AbstractC1772e;
import com.qiyukf.basesdk.p120b.p132b.p133a.C1767c;
import com.qiyukf.basesdk.p120b.p132b.p133a.C1783k;
import com.qiyukf.basesdk.p120b.p132b.p135c.C1796f;

/* renamed from: com.qiyukf.basesdk.b.b.a */
public final class C1764a {

    /* renamed from: a */
    public final SparseArray<Object> f3252a = new SparseArray<>();

    /* renamed from: b */
    public long f3253b;

    /* renamed from: c */
    public AbstractC1772e f3254c;

    /* renamed from: d */
    public C1796f f3255d = new C1796f();

    /* renamed from: a */
    public final C1767c mo33976a(String str, int i) {
        return new C1783k(this.f3255d).mo33982a().mo34012a(str, i, this.f3252a, this.f3254c, this.f3253b);
    }

    /* renamed from: a */
    public final C1764a mo33977a() {
        this.f3253b = 30000;
        return this;
    }

    /* renamed from: a */
    public final <T> C1764a mo33978a(int i, T t) {
        synchronized (this.f3252a) {
            if (t == null) {
                this.f3252a.remove(i);
            } else {
                this.f3252a.put(i, t);
            }
        }
        return this;
    }

    /* renamed from: a */
    public final C1764a mo33979a(AbstractC1772e eVar) {
        this.f3254c = eVar;
        return this;
    }

    /* renamed from: b */
    public final void mo33980b() {
        C1796f fVar = this.f3255d;
        if (fVar != null) {
            fVar.mo34056i();
        }
    }
}
