package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.AbstractC4408ew;
import com.xiaomi.push.AbstractC4532iz;
import com.xiaomi.push.C4399en;
import com.xiaomi.push.C4404es;
import com.xiaomi.push.C4508ib;
import com.xiaomi.push.C4520in;
import com.xiaomi.push.EnumC4494ho;
import com.xiaomi.push.EnumC4504hy;
import com.xiaomi.push.service.C4609ak;
import java.util.HashMap;

/* renamed from: com.xiaomi.mipush.sdk.c */
public class C4215c implements AbstractC4408ew {
    @Override // com.xiaomi.push.AbstractC4408ew
    /* renamed from: a */
    public void mo41444a(Context context, HashMap<String, String> hashMap) {
        C4520in inVar = new C4520in();
        inVar.mo42314b(C4404es.m12465a(context).m12471a());
        inVar.mo42321d(C4404es.m12465a(context).mo41805b());
        inVar.mo42317c(EnumC4504hy.AwakeAppResponse.f12451a);
        inVar.mo42307a(C4609ak.m13938a());
        inVar.f12723a = hashMap;
        C4204aw.m11444a(context).mo41405a((AbstractC4532iz) inVar, EnumC4494ho.Notification, true, (C4508ib) null, true);
        AbstractC4163b.m11301a("MoleInfo：　send data in app layer");
    }

    @Override // com.xiaomi.push.AbstractC4408ew
    /* renamed from: b */
    public void mo41445b(Context context, HashMap<String, String> hashMap) {
        MiTinyDataClient.upload("category_awake_app", "wake_up_app", 1, C4399en.m12442a(hashMap));
        AbstractC4163b.m11301a("MoleInfo：　send data in app layer");
    }

    @Override // com.xiaomi.push.AbstractC4408ew
    /* renamed from: c */
    public void mo41446c(Context context, HashMap<String, String> hashMap) {
        AbstractC4163b.m11301a("MoleInfo：　" + C4399en.m12444b(hashMap));
        String str = hashMap.get("awake_info");
        if (String.valueOf(1007).equals(hashMap.get("event_type"))) {
            C4227n.m11583a(context, str);
        }
    }
}
