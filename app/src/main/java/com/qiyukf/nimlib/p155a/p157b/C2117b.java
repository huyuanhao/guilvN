package com.qiyukf.nimlib.p155a.p157b;

import com.qiyukf.basesdk.p138c.ExecutorC1854d;
import com.qiyukf.nimlib.p155a.p168d.AbstractC2148a;
import com.qiyukf.nimlib.p183g.p191c.C2289a;
import com.qiyukf.nimlib.p183g.p191c.p194c.C2299f;

/* renamed from: com.qiyukf.nimlib.a.b.b */
public final class C2117b {

    /* renamed from: a */
    public ExecutorC1854d f4261a;

    /* renamed from: b */
    public AbstractC2128f f4262b;

    /* renamed from: c */
    public boolean f4263c;

    /* renamed from: d */
    public AbstractC2121c f4264d;

    /* renamed from: com.qiyukf.nimlib.a.b.b$a */
    public static class C2119a extends AbstractC2148a {
        @Override // com.qiyukf.nimlib.p155a.p168d.AbstractC2148a
        /* renamed from: a */
        public final C2299f mo34642a(C2299f fVar) {
            return null;
        }
    }

    public C2117b(boolean z, ExecutorC1854d dVar, AbstractC2128f fVar) {
        this.f4263c = z;
        this.f4261a = dVar;
        this.f4262b = fVar;
        this.f4264d = AbstractC2121c.m4299a(z);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m4294a(com.qiyukf.nimlib.p183g.p191c.C2289a r8, com.qiyukf.nimlib.p183g.p191c.p194c.C2299f r9) {
        /*
        // Method dump skipped, instructions count: 217
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.nimlib.p155a.p157b.C2117b.m4294a(com.qiyukf.nimlib.g.c.a, com.qiyukf.nimlib.g.c.c.f):void");
    }

    /* renamed from: a */
    public final void mo34640a(AbstractC2148a.C2149a aVar) {
        final C2289a aVar2 = aVar.f4312a;
        final C2299f fVar = aVar.f4313b;
        final Integer b = this.f4264d.mo34647b(aVar2);
        RunnableC21181 r2 = new Runnable() {
            /* class com.qiyukf.nimlib.p155a.p157b.C2117b.RunnableC21181 */

            public final void run() {
                C2117b.this.m4294a(aVar2, fVar);
            }
        };
        ExecutorC1854d dVar = this.f4261a;
        if (b == null) {
            dVar.execute(r2);
        } else {
            dVar.mo34121a(r2, b.intValue());
        }
    }
}
