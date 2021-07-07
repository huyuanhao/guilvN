package com.xiaomi.push;

import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.C4251ai;

/* renamed from: com.xiaomi.push.bs */
public class C4299bs extends C4251ai.AbstractRunnableC4252a {

    /* renamed from: a */
    public final /* synthetic */ C4298br f11460a;

    public C4299bs(C4298br brVar) {
        this.f11460a = brVar;
    }

    @Override // com.xiaomi.push.C4251ai.AbstractRunnableC4252a
    /* renamed from: a */
    public int mo41384a() {
        return 10052;
    }

    public void run() {
        AbstractC4163b.m11305c("exec== mUploadJob");
        if (C4298br.m11844a(this.f11460a) != null) {
            C4298br.m11844a(this.f11460a).mo41589a(C4298br.m11842a(this.f11460a));
            this.f11460a.m11848b("upload_time");
        }
    }
}
