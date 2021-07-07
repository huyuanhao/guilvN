package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.push.C4244ab;
import com.xiaomi.push.C4437fv;
import com.xiaomi.push.service.XMPushService;

/* renamed from: com.xiaomi.push.service.bu */
public class C4656bu extends XMPushService.AbstractC4582i {

    /* renamed from: a */
    public final /* synthetic */ XMPushService f13317a;

    /* renamed from: a */
    public final /* synthetic */ String f13318a;

    /* renamed from: a */
    public final /* synthetic */ byte[] f13319a;

    /* renamed from: b */
    public final /* synthetic */ int f13320b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4656bu(XMPushService xMPushService, int i, int i2, byte[] bArr, String str) {
        super(i);
        this.f13317a = xMPushService;
        this.f13320b = i2;
        this.f13319a = bArr;
        this.f13318a = str;
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
    /* renamed from: a */
    public String mo41924a() {
        return "clear account cache.";
    }

    @Override // com.xiaomi.push.service.XMPushService.AbstractC4582i, com.xiaomi.push.service.XMPushService.AbstractC4582i
    /* renamed from: a */
    public void m14077a() {
        C4671l.m14145a((Context) this.f13317a);
        C4611am.mo42670a().m13957a("5");
        C4244ab.m11627a(this.f13320b);
        XMPushService.m13751a(this.f13317a).mo41917c(C4437fv.mo41912a());
        this.f13317a.mo42631a(this.f13319a, this.f13318a);
    }
}
