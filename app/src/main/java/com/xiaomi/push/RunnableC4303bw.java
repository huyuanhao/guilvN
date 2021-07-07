package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.C4312cd;
import java.lang.ref.WeakReference;

/* renamed from: com.xiaomi.push.bw */
public class RunnableC4303bw implements Runnable {

    /* renamed from: a */
    public String f11466a;

    /* renamed from: a */
    public WeakReference<Context> f11467a;

    public RunnableC4303bw(String str, WeakReference<Context> weakReference) {
        this.f11466a = str;
        this.f11467a = weakReference;
    }

    public void run() {
        Context context;
        WeakReference<Context> weakReference = this.f11467a;
        if (weakReference != null && (context = weakReference.get()) != null) {
            if (C4323cj.m11953a(this.f11466a) > C4302bv.f11464a) {
                C4306bz a = C4306bz.m11867a(this.f11466a);
                C4305by a2 = C4305by.m11862a(this.f11466a);
                a.mo41582a(a2);
                a2.mo41582a(C4304bx.m11859a(context, this.f11466a, 1000));
                C4312cd.m11921a(context).mo41575a((C4312cd.AbstractRunnableC4313a) a);
                return;
            }
            AbstractC4163b.m11304b("=====> do not need clean db");
        }
    }
}
