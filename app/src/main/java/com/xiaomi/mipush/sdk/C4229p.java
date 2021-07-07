package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.C4404es;
import com.xiaomi.push.EnumC4499ht;
import com.xiaomi.push.service.C4605ah;

/* renamed from: com.xiaomi.mipush.sdk.p */
public final class C4229p extends C4605ah.AbstractRunnableC4606a {

    /* renamed from: a */
    public final /* synthetic */ Context f11317a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4229p(int i, String str, Context context) {
        super(i, str);
        this.f11317a = context;
    }

    @Override // com.xiaomi.push.service.C4605ah.AbstractRunnableC4606a
    /* renamed from: a */
    public void mo41381a() {
        C4404es.m12465a(this.f11317a).mo41799a(C4605ah.m13919a(this.f11317a).mo42656a(EnumC4499ht.AwakeInfoUploadWaySwitch.mo42043a(), 0));
    }
}
