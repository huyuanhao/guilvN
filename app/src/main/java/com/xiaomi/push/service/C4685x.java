package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.C4506i;
import com.xiaomi.push.C4520in;
import com.xiaomi.push.C4531iy;
import com.xiaomi.push.EnumC4494ho;
import com.xiaomi.push.EnumC4504hy;
import com.xiaomi.push.service.C4638bd;
import java.util.HashMap;

/* renamed from: com.xiaomi.push.service.x */
public final class C4685x extends C4638bd.AbstractRunnableC4639a {

    /* renamed from: a */
    public final /* synthetic */ XMPushService f13397a;

    /* renamed from: a */
    public final /* synthetic */ C4670k f13398a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4685x(String str, long j, XMPushService xMPushService, C4670k kVar) {
        super(str, j);
        this.f13397a = xMPushService;
        this.f13398a = kVar;
    }

    @Override // com.xiaomi.push.service.C4638bd.AbstractRunnableC4639a
    /* renamed from: a */
    public void mo42703a(C4638bd bdVar) {
        String a = bdVar.mo42700a("GAID", "gaid");
        String b = C4506i.m13040b((Context) this.f13397a);
        AbstractC4163b.m11305c("gaid :" + b);
        if (!TextUtils.isEmpty(b) && !TextUtils.equals(a, b)) {
            bdVar.mo42702a("GAID", "gaid", b);
            C4520in inVar = new C4520in();
            inVar.mo42314b(this.f13398a.f13356d);
            inVar.mo42317c(EnumC4504hy.ClientInfoUpdate.f12451a);
            inVar.mo42307a(C4609ak.m13938a());
            inVar.mo42309a(new HashMap());
            inVar.m13318a().put("gaid", b);
            byte[] a2 = C4531iy.m13590a(C4684w.m14206a(this.f13397a.getPackageName(), this.f13398a.f13356d, inVar, EnumC4494ho.Notification));
            XMPushService xMPushService = this.f13397a;
            xMPushService.mo42629a(xMPushService.getPackageName(), a2, true);
        }
    }
}
