package com.qiyukf.basesdk.p120b.p132b.p134b;

import com.qiyukf.basesdk.p120b.p132b.p133a.C1767c;
import com.qiyukf.basesdk.p120b.p132b.p135c.C1792b;
import java.nio.ByteBuffer;

/* renamed from: com.qiyukf.basesdk.b.b.b.d */
public abstract class AbstractC1790d<I> extends C1792b {

    /* renamed from: b */
    public final Class<? extends I> f3303b;

    public AbstractC1790d(Class<? extends I> cls) {
        this.f3303b = cls;
    }

    /* renamed from: a */
    public abstract ByteBuffer mo34043a(I i);

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.qiyukf.basesdk.p120b.p132b.p135c.C1792b, com.qiyukf.basesdk.p120b.p132b.p135c.AbstractC1798g
    /* renamed from: a */
    public final void mo34032a(Object obj, C1767c cVar) {
        try {
            if (this.f3303b != null && this.f3303b.isInstance(obj)) {
                super.mo34032a(mo34043a(obj), cVar);
            } else {
                super.mo34032a(obj, cVar);
            }
        } catch (C1789c e) {
            throw e;
        } catch (Throwable th) {
            throw new C1789c(th);
        }
    }
}
