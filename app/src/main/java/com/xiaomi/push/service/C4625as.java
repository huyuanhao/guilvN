package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.AbstractC4408ew;
import com.xiaomi.push.C4399en;
import com.xiaomi.push.C4404es;
import com.xiaomi.push.C4492hm;
import com.xiaomi.push.C4520in;
import com.xiaomi.push.C4531iy;
import com.xiaomi.push.EnumC4494ho;
import com.xiaomi.push.EnumC4504hy;
import java.util.HashMap;

/* renamed from: com.xiaomi.push.service.as */
public class C4625as implements AbstractC4408ew {
    @Override // com.xiaomi.push.AbstractC4408ew
    /* renamed from: a */
    public void mo41444a(Context context, HashMap<String, String> hashMap) {
        C4520in inVar = new C4520in();
        inVar.mo42314b(C4404es.m12465a(context).m12471a());
        inVar.mo42321d(C4404es.m12465a(context).mo41805b());
        inVar.mo42317c(EnumC4504hy.AwakeAppResponse.f12451a);
        inVar.mo42307a(C4609ak.m13938a());
        inVar.f12723a = hashMap;
        byte[] a = C4531iy.m13590a(C4684w.m14206a(inVar.mo42318c(), inVar.mo42315b(), inVar, EnumC4494ho.Notification));
        if (context instanceof XMPushService) {
            AbstractC4163b.m11301a("MoleInfo : send data directly in pushLayer " + inVar.mo42312a());
            ((XMPushService) context).mo42629a(context.getPackageName(), a, true);
            return;
        }
        AbstractC4163b.m11301a("MoleInfo : context is not correct in pushLayer " + inVar.mo42312a());
    }

    @Override // com.xiaomi.push.AbstractC4408ew
    /* renamed from: b */
    public void mo41445b(Context context, HashMap<String, String> hashMap) {
        C4492hm a = C4492hm.m12919a(context);
        if (a != null) {
            a.mo42003a("category_awake_app", "wake_up_app", 1, C4399en.m12442a(hashMap));
        }
    }

    @Override // com.xiaomi.push.AbstractC4408ew
    /* renamed from: c */
    public void mo41446c(Context context, HashMap<String, String> hashMap) {
        AbstractC4163b.m11301a("MoleInfo：　" + C4399en.m12444b(hashMap));
    }
}
