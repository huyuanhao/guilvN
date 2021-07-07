package com.qiyukf.basesdk.p120b.p132b.p133a;

/* renamed from: com.qiyukf.basesdk.b.b.a.i */
public abstract class AbstractRunnableC1781i implements Comparable<AbstractRunnableC1781i>, Runnable {

    /* renamed from: a */
    public long f3294a;

    /* renamed from: b */
    public boolean f3295b;

    public AbstractRunnableC1781i(long j) {
        this.f3294a = j;
    }

    /* renamed from: a */
    public final long mo34026a() {
        return this.f3294a;
    }

    /* renamed from: b */
    public final void mo34027b() {
        this.f3295b = true;
    }

    /* renamed from: c */
    public final boolean mo34028c() {
        return this.f3295b;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(AbstractRunnableC1781i iVar) {
        long j = this.f3294a;
        long j2 = iVar.f3294a;
        if (j == j2) {
            return 0;
        }
        return j > j2 ? 1 : -1;
    }
}
