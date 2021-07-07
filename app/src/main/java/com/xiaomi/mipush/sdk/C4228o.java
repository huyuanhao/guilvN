package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.AbstractC4532iz;
import com.xiaomi.push.C4251ai;
import com.xiaomi.push.C4508ib;
import com.xiaomi.push.C4520in;
import com.xiaomi.push.EnumC4494ho;
import com.xiaomi.push.service.C4609ak;

/* renamed from: com.xiaomi.mipush.sdk.o */
public final class C4228o extends C4251ai.AbstractRunnableC4252a {

    /* renamed from: a */
    public final /* synthetic */ Context f11315a;

    /* renamed from: a */
    public final /* synthetic */ C4520in f11316a;

    public C4228o(C4520in inVar, Context context) {
        this.f11316a = inVar;
        this.f11315a = context;
    }

    @Override // com.xiaomi.push.C4251ai.AbstractRunnableC4252a
    /* renamed from: a */
    public int mo41384a() {
        return 22;
    }

    public void run() {
        C4520in inVar = this.f11316a;
        if (inVar != null) {
            inVar.mo42307a(C4609ak.m13938a());
            C4204aw.m11444a(this.f11315a.getApplicationContext()).mo41405a((AbstractC4532iz) this.f11316a, EnumC4494ho.Notification, true, (C4508ib) null, true);
        }
    }
}
