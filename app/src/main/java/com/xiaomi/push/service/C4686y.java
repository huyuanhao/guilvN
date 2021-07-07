package com.xiaomi.push.service;

import android.text.TextUtils;
import com.xiaomi.push.C4269au;
import com.xiaomi.push.C4520in;
import com.xiaomi.push.C4531iy;
import com.xiaomi.push.EnumC4494ho;
import com.xiaomi.push.EnumC4504hy;
import com.xiaomi.push.service.C4638bd;
import java.util.HashMap;

/* renamed from: com.xiaomi.push.service.y */
public final class C4686y extends C4638bd.AbstractRunnableC4639a {

    /* renamed from: a */
    public final /* synthetic */ XMPushService f13399a;

    /* renamed from: a */
    public final /* synthetic */ C4670k f13400a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4686y(String str, long j, XMPushService xMPushService, C4670k kVar) {
        super(str, j);
        this.f13399a = xMPushService;
        this.f13400a = kVar;
    }

    @Override // com.xiaomi.push.service.C4638bd.AbstractRunnableC4639a
    /* renamed from: a */
    public void mo42703a(C4638bd bdVar) {
        C4269au a = C4269au.m11702a(this.f13399a);
        String a2 = bdVar.mo42700a("MSAID", "msaid");
        String str = a.mo41492a() + a.mo41493b() + a.mo41494c() + a.mo41495d();
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(a2, str)) {
            bdVar.mo42702a("MSAID", "msaid", str);
            C4520in inVar = new C4520in();
            inVar.mo42314b(this.f13400a.f13356d);
            inVar.mo42317c(EnumC4504hy.ClientInfoUpdate.f12451a);
            inVar.mo42307a(C4609ak.m13938a());
            inVar.mo42309a(new HashMap());
            a.mo41498a(inVar.m13318a());
            byte[] a3 = C4531iy.m13590a(C4684w.m14206a(this.f13399a.getPackageName(), this.f13400a.f13356d, inVar, EnumC4494ho.Notification));
            XMPushService xMPushService = this.f13399a;
            xMPushService.mo42629a(xMPushService.getPackageName(), a3, true);
        }
    }
}
