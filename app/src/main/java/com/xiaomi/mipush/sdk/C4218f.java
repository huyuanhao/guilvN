package com.xiaomi.mipush.sdk;

import com.xiaomi.push.EnumC4499ht;
import com.xiaomi.push.service.C4605ah;

/* renamed from: com.xiaomi.mipush.sdk.f */
public class C4218f extends C4605ah.AbstractRunnableC4606a {

    /* renamed from: a */
    public final /* synthetic */ C4217e f11303a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4218f(C4217e eVar, int i, String str) {
        super(i, str);
        this.f11303a = eVar;
    }

    @Override // com.xiaomi.push.service.C4605ah.AbstractRunnableC4606a
    /* renamed from: a */
    public void mo41381a() {
        boolean a = C4605ah.m13919a(C4217e.m11540a(this.f11303a)).mo42661a(EnumC4499ht.AggregatePushSwitch.mo42043a(), true);
        if (C4217e.m11543a(this.f11303a) != a) {
            this.f11303a.f11302a = a;
            C4220h.m11566b(C4217e.m11540a(this.f11303a));
        }
    }
}
