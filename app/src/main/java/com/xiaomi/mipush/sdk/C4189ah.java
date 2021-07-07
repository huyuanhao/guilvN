package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.C4415fc;
import com.xiaomi.push.service.C4605ah;

/* renamed from: com.xiaomi.mipush.sdk.ah */
public final class C4189ah extends C4605ah.AbstractRunnableC4606a {

    /* renamed from: a */
    public final /* synthetic */ Context f11221a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4189ah(int i, String str, Context context) {
        super(i, str);
        this.f11221a = context;
    }

    @Override // com.xiaomi.push.service.C4605ah.AbstractRunnableC4606a
    /* renamed from: a */
    public void mo41381a() {
        C4415fc.m12512a(this.f11221a);
    }
}
