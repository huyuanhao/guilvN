package com.qiyukf.unicorn.p232k;

import android.os.Handler;
import com.qiyukf.basesdk.p138c.C1805a;

/* renamed from: com.qiyukf.unicorn.k.b */
public abstract class AbstractC2694b<Param, Result> {

    /* renamed from: a */
    public Handler f5593a = C1805a.m3404b();

    /* renamed from: b */
    public Handler f5594b;

    public AbstractC2694b(String str) {
        this.f5594b = C1805a.m3403a().mo34072a(str);
    }

    /* renamed from: a */
    public abstract Result mo34446a();

    /* renamed from: a */
    public void mo34447a(Result result) {
    }

    /* renamed from: a */
    public final void mo36463a(final Param... paramArr) {
        this.f5594b.post(new Runnable() {
            /* class com.qiyukf.unicorn.p232k.AbstractC2694b.RunnableC26951 */

            public final void run() {
                final Object a = AbstractC2694b.this.mo34446a();
                AbstractC2694b.this.f5593a.post(new Runnable() {
                    /* class com.qiyukf.unicorn.p232k.AbstractC2694b.RunnableC26951.RunnableC26961 */

                    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.qiyukf.unicorn.k.b */
                    /* JADX WARN: Multi-variable type inference failed */
                    public final void run() {
                        AbstractC2694b.this.mo34447a(a);
                    }
                });
            }
        });
    }
}
