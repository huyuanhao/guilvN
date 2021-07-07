package com.qiyukf.basesdk.p120b.p121a.p123b.p129f;

import android.content.Context;
import com.qiyukf.basesdk.p120b.p121a.p123b.p124a.C1739a;
import com.qiyukf.basesdk.p120b.p121a.p123b.p126c.AbstractC1745b;
import com.qiyukf.basesdk.p120b.p121a.p123b.p126c.C1749f;
import com.qiyukf.basesdk.p120b.p121a.p123b.p128e.C1754c;
import com.qiyukf.basesdk.p138c.ExecutorC1854d;
import java.io.File;

/* renamed from: com.qiyukf.basesdk.b.a.b.f.a */
public final class C1755a {

    /* renamed from: a */
    public static ExecutorC1854d f3240a;

    /* renamed from: a */
    public static RunnableC1756b m3227a(Context context, File file, Object obj, String str, C1749f fVar, AbstractC1745b bVar) {
        C1754c.m3226a(context, file, obj, fVar, bVar);
        RunnableC1756b bVar2 = new RunnableC1756b(new C1739a(context, fVar.mo33961d(), fVar.mo33962e(), fVar.mo33963f(), file, obj, str, fVar), bVar);
        if (f3240a == null) {
            f3240a = new ExecutorC1854d("NosUploadManager", ExecutorC1854d.f3414b, true);
        }
        f3240a.execute(bVar2);
        return bVar2;
    }

    /* renamed from: a */
    public static void m3228a() {
        ExecutorC1854d dVar = f3240a;
        if (dVar != null) {
            dVar.mo34122b();
            f3240a = null;
        }
    }
}
