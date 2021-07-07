package com.xiaomi.push;

import com.xiaomi.push.C4251ai;

/* renamed from: com.xiaomi.push.bu */
public class C4301bu extends C4251ai.AbstractRunnableC4252a {

    /* renamed from: a */
    public final /* synthetic */ C4298br f11462a;

    public C4301bu(C4298br brVar) {
        this.f11462a = brVar;
    }

    @Override // com.xiaomi.push.C4251ai.AbstractRunnableC4252a
    /* renamed from: a */
    public int mo41384a() {
        return 10053;
    }

    public void run() {
        if (C4298br.m11844a(this.f11462a) != null) {
            C4298br.m11844a(this.f11462a).mo41590b(C4298br.m11842a(this.f11462a));
            this.f11462a.m11848b("delete_time");
        }
    }
}
