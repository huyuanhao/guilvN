package com.xiaomi.push;

import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.C4251ai;
import java.lang.ref.WeakReference;

/* renamed from: com.xiaomi.push.bt */
public class C4300bt extends C4251ai.AbstractRunnableC4252a {

    /* renamed from: a */
    public final /* synthetic */ C4298br f11461a;

    public C4300bt(C4298br brVar) {
        this.f11461a = brVar;
    }

    @Override // com.xiaomi.push.C4251ai.AbstractRunnableC4252a
    /* renamed from: a */
    public int mo41384a() {
        return 10054;
    }

    public void run() {
        AbstractC4163b.m11305c("exec== DbSizeControlJob");
        C4312cd.m11921a(C4298br.m11842a(this.f11461a)).mo41576a(new RunnableC4303bw(C4298br.m11845a(this.f11461a), new WeakReference(C4298br.m11842a(this.f11461a))));
        this.f11461a.m11848b("check_time");
    }
}
