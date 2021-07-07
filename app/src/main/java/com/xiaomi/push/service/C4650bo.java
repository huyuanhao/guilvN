package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.AbstractC4440fy;
import com.xiaomi.push.C4387em;
import com.xiaomi.push.C4437fv;
import java.util.Map;

/* renamed from: com.xiaomi.push.service.bo */
public class C4650bo extends C4437fv {

    /* renamed from: a */
    public final /* synthetic */ XMPushService f13310a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4650bo(XMPushService xMPushService, Map map, int i, String str, AbstractC4440fy fyVar) {
        super(map, i, str, fyVar);
        this.f13310a = xMPushService;
    }

    @Override // com.xiaomi.push.C4437fv, com.xiaomi.push.C4437fv, com.xiaomi.push.C4437fv
    /* renamed from: a */
    public byte[] mo41912a() {
        try {
            C4387em.C4389b bVar = new C4387em.C4389b();
            bVar.mo41719a(C4635bb.mo42697a().m14035a());
            return bVar.m12147a();
        } catch (Exception e) {
            AbstractC4163b.m11301a("getOBBString err: " + e.toString());
            return null;
        }
    }
}
