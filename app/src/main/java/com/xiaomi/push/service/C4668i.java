package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.AbstractC4493hn;
import com.xiaomi.push.C4498hs;
import java.util.List;
import org.android.agoo.xiaomi.MiPushRegistar;

/* renamed from: com.xiaomi.push.service.i */
public class C4668i implements AbstractC4493hn {

    /* renamed from: a */
    public final XMPushService f13347a;

    public C4668i(XMPushService xMPushService) {
        this.f13347a = xMPushService;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public String m14132a(String str) {
        return MiPushRegistar.PACKAGE_XIAOMI.equals(str) ? "1000271" : this.f13347a.getSharedPreferences("pref_registered_pkg_names", 0).getString(str, null);
    }

    @Override // com.xiaomi.push.AbstractC4493hn
    /* renamed from: a */
    public void mo42004a(List<C4498hs> list, String str, String str2) {
        AbstractC4163b.m11301a("TinyData LongConnUploader.upload items size:" + list.size() + "  ts:" + System.currentTimeMillis());
        this.f13347a.mo42624a(new C4669j(this, 4, str, list, str2));
    }
}
