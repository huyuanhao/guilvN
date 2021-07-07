package com.qiyukf.basesdk.p120b.p121a.p123b.p129f;

import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p120b.p121a.p123b.p124a.C1739a;
import com.qiyukf.basesdk.p120b.p121a.p123b.p126c.AbstractC1745b;
import com.qiyukf.basesdk.p120b.p121a.p123b.p128e.C1754c;

/* renamed from: com.qiyukf.basesdk.b.a.b.f.b */
public class RunnableC1756b implements Runnable {

    /* renamed from: a */
    public static final String f3241a = C1754c.m3225a(RunnableC1756b.class);

    /* renamed from: b */
    public C1739a f3242b;

    public RunnableC1756b(C1739a aVar, AbstractC1745b bVar) {
        this.f3242b = aVar;
        aVar.mo33923a(bVar);
    }

    /* renamed from: a */
    public final void mo33969a() {
        C1709a.m3018d(f3241a, "uploading is canceling");
        this.f3242b.mo33922a();
    }

    public void run() {
        this.f3242b.mo33924b();
    }
}
