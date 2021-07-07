package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.C4251ai;
import com.xiaomi.push.C4508ib;
import com.xiaomi.push.C4513ig;
import com.xiaomi.push.C4520in;
import com.xiaomi.push.C4531iy;
import com.xiaomi.push.EnumC4494ho;
import com.xiaomi.push.EnumC4500hu;
import com.xiaomi.push.EnumC4504hy;
import com.xiaomi.push.service.C4605ah;
import com.xiaomi.push.service.C4607ai;

/* renamed from: com.xiaomi.mipush.sdk.al */
public class C4193al extends C4251ai.AbstractRunnableC4252a {

    /* renamed from: a */
    public Context f11225a;

    public C4193al(Context context) {
        this.f11225a = context;
    }

    @Override // com.xiaomi.push.C4251ai.AbstractRunnableC4252a
    /* renamed from: a */
    public int mo41384a() {
        return 2;
    }

    public void run() {
        C4605ah a = C4605ah.m13919a(this.f11225a);
        C4513ig igVar = new C4513ig();
        igVar.mo42214a(C4607ai.m13932a(a, EnumC4500hu.MISC_CONFIG));
        igVar.mo42217b(C4607ai.m13932a(a, EnumC4500hu.PLUGIN_CONFIG));
        C4520in inVar = new C4520in("-1", false);
        inVar.mo42317c(EnumC4504hy.DailyCheckClientConfig.f12451a);
        inVar.mo42311a(C4531iy.m13590a(igVar));
        C4204aw.m11444a(this.f11225a).mo41402a(inVar, EnumC4494ho.Notification, (C4508ib) null);
    }
}
